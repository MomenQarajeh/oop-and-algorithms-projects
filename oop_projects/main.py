from bank_account import *

Dave = BankAccount(2000,"Dave")
Sara = BankAccount(3000,"Sara")

Dave.getBalance()
Sara.getBalance()
Dave.deposit(500)
Sara.deposit(200)
Dave.withdraw(10000)
Dave.withdraw(10)

Dave.transfer(10,Sara)

haram= InterestRewardsAcct(4000,"Haram")
haram.getBalance()
haram.deposit(100)

