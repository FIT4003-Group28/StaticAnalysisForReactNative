package defpackage;
/* compiled from: PG */
/* renamed from: agcb  reason: default package */
/* loaded from: classes.dex */
final class agcb implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ agce b;

    public agcb(agce agceVar, String str) {
        this.b = agceVar;
        this.a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.b.b) {
            ajfz ajfzVar = (ajfz) this.b.b.get(this.a);
            if (ajfzVar != null) {
                this.b.a.lr(ajfzVar);
            }
        }
    }
}
