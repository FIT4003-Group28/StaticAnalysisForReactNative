package defpackage;
/* compiled from: PG */
/* renamed from: yns  reason: default package */
/* loaded from: classes4.dex */
public abstract class yns {
    protected long c = -1;

    public long h() {
        long j = this.c;
        if (j != -1) {
            return j;
        }
        throw new RuntimeException("TimestampedEvent not yet posted");
    }

    public boolean j() {
        return this.c != -1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void i(long j) {
        if (this.c != -1) {
            throw new RuntimeException("This instance is already timestamped");
        }
        aqxo.y(j >= 0);
        this.c = j;
    }
}
