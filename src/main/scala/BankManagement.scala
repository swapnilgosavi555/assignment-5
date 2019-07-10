import javax.sound.midi.Receiver

class BankManagement(var balance: Int) {
  this.balance = balance

}

object Bank extends App {
  val bankobj = Bank.openAccount(0)
  println(bankobj.balance)
  bankobj.balance = Bank.depositeFund(10000, bankobj)
  println(bankobj.balance)
  bankobj.balance = Bank.withdrawFund(5000, bankobj)
  println(bankobj.balance)
  val bankobj1 = Bank.openAccount(0)
  bankobj1.balance = Bank.transferFund(1000, bankobj, bankobj1)
  println(bankobj.balance)
  println(bankobj1.balance)
  Bank.closeAccount(bankobj1)

  def openAccount(initialammount: Int): BankManagement = {

    new BankManagement(0)
  }

  def depositeFund(ammount: Int, id: BankManagement): Int = {
    id.balance + ammount
  }

  def withdrawFund(ammount: Int, id: BankManagement): Int = {
    id.balance - ammount
  }

  def closeAccount(id: BankManagement): Unit = {
    println("your bank account is closed")
    bankobj1.balance = 0

  }

  def transferFund(ammount: Int, transferid: BankManagement, receiverid: BankManagement): Int = {
    transferid.balance = transferid.balance - ammount
    receiverid.balance + ammount
  }

}
