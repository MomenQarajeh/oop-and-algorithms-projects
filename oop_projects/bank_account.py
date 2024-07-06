class BalanceException(Exception):
    pass

class BankAccount:
    
   
    def __init__(self,initialAmount,acctName):
        self.balance=initialAmount
        self.name=acctName
        print(
            f"\nAccount {self.name} created.\nBalance = ${self.balance: .2f}")
        
    def getBalance(self):
        print(f"\nAccount {self.name}' balance = ${self.balance:.2f}")

    def deposit(self,amount):
        self.balance+=amount
        print("\nDeposit Complete.")
        self.getBalance()

    def virableTransaction(self,amount):
        if self.balance>=amount:
            return
        else:
            raise BalanceException(
                f"\nSorry, Account {self.name}' only has a balance of ${self.balance:.2f}"
            )
        
    def withdraw(self,amount):
        try:
            self.virableTransaction(amount)
            self.balance -=amount
            print("\nwithdraw complete")
            self.getBalance()
        except BalanceException as error:
            print(f'\nwithdraw interrupted: {error}')


    def transfer(self,amount,account):
        try:
            print('\n**********\n\nBeginning Transfer.. 🚀')
            self.virableTransaction(amount)
            self.withdraw(amount)
            account.deposit(amount)
            print('\ntransfer complete! ✅\n\n**********')
        except BalanceException as error:
            print(f'\nTransfer interrupted. ❌{error}')

    
        
class InterestRewardsAcct(BankAccount):
    def deposit(self, amount):
        self.balance=self.balance + (amount*1.05)
        print("\nDeposit complete.")
        self.getBalance()

class SavingsAcct(InterestRewardsAcct):
    def __init__(self,initialAmount,acctName):
        super.__init__(initialAmount,acctName)
        self.fee=5
    def withdraw(self, amount):
        try:
            self.virableTransaction(amount+self.fee)
            self.balance=self.balance-(amount+self.fee)
            print("\nWithdraw completed.")
            self.getBalance()
        except BalanceException as error:
            print(f'Withdraw interrupted: {error}')