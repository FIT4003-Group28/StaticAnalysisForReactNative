package defpackage;
/* compiled from: PG */
/* renamed from: afmc  reason: default package */
/* loaded from: classes2.dex */
public final class afmc implements Runnable {
    final /* synthetic */ dvzj a;
    final /* synthetic */ durp b;
    final /* synthetic */ int c;
    final /* synthetic */ boolean d;
    final /* synthetic */ afme e;

    public afmc(afme afmeVar, dvzj dvzjVar, durp durpVar, int i, boolean z) {
        this.e = afmeVar;
        this.a = dvzjVar;
        this.b = durpVar;
        this.c = i;
        this.d = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bgej bgejVar = new bgej(this.a, new afmb(this));
        this.e.c.a().a(bgejVar.a, new afmd(bgejVar), bvrj.UI_THREAD);
    }
}
