package org.spongycastle.crypto.tls;
/* loaded from: classes.dex */
class DTLSReplayWindow {
    private static final long VALID_SEQ_MASK = 281474976710655L;
    private static final long WINDOW_SIZE = 64;
    private long latestConfirmedSeq = -1;
    private long bitmap = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean shouldDiscard(long j) {
        if ((VALID_SEQ_MASK & j) != j) {
            return true;
        }
        if (j > this.latestConfirmedSeq) {
            return false;
        }
        long j2 = this.latestConfirmedSeq - j;
        return j2 >= WINDOW_SIZE || (this.bitmap & (1 << ((int) j2))) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void reportAuthenticated(long j) {
        if ((VALID_SEQ_MASK & j) != j) {
            throw new IllegalArgumentException("'seq' out of range");
        }
        if (j <= this.latestConfirmedSeq) {
            long j2 = this.latestConfirmedSeq - j;
            if (j2 >= WINDOW_SIZE) {
                return;
            }
            this.bitmap |= 1 << ((int) j2);
            return;
        }
        long j3 = j - this.latestConfirmedSeq;
        if (j3 >= WINDOW_SIZE) {
            this.bitmap = 1L;
        } else {
            this.bitmap <<= (int) j3;
            this.bitmap |= 1;
        }
        this.latestConfirmedSeq = j;
    }

    void reset() {
        this.latestConfirmedSeq = -1L;
        this.bitmap = 0L;
    }
}
