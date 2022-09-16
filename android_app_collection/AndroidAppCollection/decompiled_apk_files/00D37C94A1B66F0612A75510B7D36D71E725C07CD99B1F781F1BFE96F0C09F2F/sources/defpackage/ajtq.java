package defpackage;
/* compiled from: PG */
/* renamed from: ajtq  reason: default package */
/* loaded from: classes.dex */
public abstract class ajtq implements ajso {
    private long a;

    /* JADX INFO: Access modifiers changed from: protected */
    public final void g(long j) {
        aqxo.t(j >= 0, "Blocking duration must be greater or equal to 0: %ld", j);
        this.a = j;
    }

    @Override // defpackage.ajso
    public final long j() {
        return this.a;
    }
}
