package org.web3j.protocol.core.methods.response;

import org.web3j.protocol.core.Response;

public class EthSignTransaction extends Response<EthSignTransaction.EthSignTransactionResponse> {
    public String getRaw() {
        return ((EthSignTransactionResponse) getResult()).getRaw();
    }

    public Transaction getTransaction() { return ((EthSignTransactionResponse) getResult()).getTransaction(); }

    public class EthSignTransactionResponse {
        String raw;

        Transaction transaction;

        public String getRaw() {
            return raw;
        }

        public void setRaw(String raw) {
            this.raw = raw;
        }

        public Transaction getTransaction() {
            return transaction;
        }

        public void setTransaction(Transaction transaction) {
            this.transaction = transaction;
        }
    }
}
