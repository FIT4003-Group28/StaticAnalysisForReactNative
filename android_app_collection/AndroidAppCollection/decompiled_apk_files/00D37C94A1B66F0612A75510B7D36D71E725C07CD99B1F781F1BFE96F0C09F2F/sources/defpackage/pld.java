package defpackage;
/* compiled from: PG */
/* renamed from: pld  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class pld implements Runnable {
    public final /* synthetic */ plh a;
    public final /* synthetic */ Exception b;
    private final /* synthetic */ int c;

    public /* synthetic */ pld(plh plhVar, Exception exc) {
        this.a = plhVar;
        this.b = exc;
    }

    public /* synthetic */ pld(plh plhVar, Exception exc, int i) {
        this.c = i;
        this.a = plhVar;
        this.b = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c == 0) {
            plh plhVar = this.a;
            Exception exc = this.b;
            pli pliVar = plhVar.a;
            int i = pxi.a;
            pliVar.j(exc);
            return;
        }
        plh plhVar2 = this.a;
        Exception exc2 = this.b;
        pli pliVar2 = plhVar2.a;
        int i2 = pxi.a;
        pliVar2.c(exc2);
    }
}
