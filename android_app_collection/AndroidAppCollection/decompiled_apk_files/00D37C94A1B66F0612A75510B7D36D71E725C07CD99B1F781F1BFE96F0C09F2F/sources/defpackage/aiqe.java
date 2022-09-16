package defpackage;
/* compiled from: PG */
/* renamed from: aiqe  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class aiqe implements Runnable {
    public final /* synthetic */ aiqf a;
    private final /* synthetic */ int b;

    public /* synthetic */ aiqe(aiqf aiqfVar, int i) {
        this.b = i;
        this.a = aiqfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b == 0) {
            aiqf aiqfVar = this.a;
            aiqj aiqjVar = aiqj.AUTONAV;
            aijo a = aijp.a();
            a.a = (acvg) aiqfVar.e.get();
            ((aheu) aiqfVar.c.get()).a(new aiqk(aiqjVar, null, a.a()));
            return;
        }
        aiqf aiqfVar2 = this.a;
        aiqj aiqjVar2 = aiqj.AUTOPLAY;
        aijo a2 = aijp.a();
        a2.a = (acvg) aiqfVar2.d.get();
        ((aheu) aiqfVar2.c.get()).a(new aiqk(aiqjVar2, null, a2.a()));
    }
}
