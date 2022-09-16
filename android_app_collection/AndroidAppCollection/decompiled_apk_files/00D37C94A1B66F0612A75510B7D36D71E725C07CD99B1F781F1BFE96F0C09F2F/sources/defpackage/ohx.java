package defpackage;
/* compiled from: PG */
/* renamed from: ohx  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ohx implements Runnable {
    public final /* synthetic */ oie a;
    private final /* synthetic */ int b;

    public /* synthetic */ ohx(oie oieVar) {
        this.a = oieVar;
    }

    public /* synthetic */ ohx(oie oieVar, int i) {
        this.b = i;
        this.a = oieVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                this.a.aG.a();
                return;
            case 1:
                this.a.a.getSupportFragmentManager().ak(new aksy(), true);
                return;
            case 2:
                this.a.M.get();
                return;
            case 3:
                this.a.y.a(true);
                return;
            case 4:
                oie oieVar = this.a;
                oieVar.ao.q(oieVar.o, (frv) oieVar.q.get());
                return;
            case 5:
                this.a.ay.e();
                return;
            case 6:
                oie oieVar2 = this.a;
                oieVar2.s.b = oieVar2.l;
                return;
            case 7:
                this.a.au.a();
                return;
            case 8:
                oie oieVar3 = this.a;
                oieVar3.aw.i(oieVar3.aW);
                return;
            case 9:
                this.a.ai.c();
                return;
            case 10:
                this.a.u();
                return;
            case 11:
                this.a.j.a();
                return;
            case 12:
                this.a.aq.v();
                return;
            case 13:
                oie oieVar4 = this.a;
                oieVar4.aw.i(oieVar4.aW);
                return;
            case 14:
                this.a.ai.d();
                return;
            case 15:
                this.a.v();
                return;
            case 16:
                this.a.l();
                return;
            case 17:
                this.a.q();
                return;
            case 18:
                this.a.k();
                return;
            case 19:
                akib a = ((lbl) this.a.Q.get()).a();
                if (!a.a.d()) {
                    return;
                }
                long c = a.f.c();
                if (c < a.j + a.a.h) {
                    return;
                }
                a.i();
                a.j = c;
                return;
            default:
                this.a.h();
                return;
        }
    }
}
