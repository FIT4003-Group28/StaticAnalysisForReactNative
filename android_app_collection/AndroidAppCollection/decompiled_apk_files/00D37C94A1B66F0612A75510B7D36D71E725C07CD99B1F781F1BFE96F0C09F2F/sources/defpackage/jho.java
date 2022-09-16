package defpackage;
/* compiled from: PG */
/* renamed from: jho  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class jho implements Runnable {
    public final /* synthetic */ jhp a;
    private final /* synthetic */ int b;

    public /* synthetic */ jho(jhp jhpVar, int i) {
        this.b = i;
        this.a = jhpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            jhp jhpVar = this.a;
            for (aypg aypgVar : jhpVar.c) {
                aypgVar.qr();
            }
            jhpVar.c.clear();
        } else if (i == 1) {
            jhp jhpVar2 = this.a;
            ((yni) jhpVar2.b.get()).g(jhpVar2);
            jhpVar2.b();
        } else {
            this.a.b();
        }
    }
}
