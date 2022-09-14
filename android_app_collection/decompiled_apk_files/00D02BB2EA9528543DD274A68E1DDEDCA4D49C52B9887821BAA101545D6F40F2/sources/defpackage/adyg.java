package defpackage;
/* compiled from: PG */
/* renamed from: adyg  reason: default package */
/* loaded from: classes2.dex */
public final class adyg {
    private final gga a;
    private final dxio<abfa> b;
    private final dxio<acwt> c;
    private final dxio<afha> d;
    private final dxio<begg> e;

    public adyg(gga ggaVar, dxio<abfa> dxioVar, dxio<acwt> dxioVar2, dxio<afha> dxioVar3, dxio<begg> dxioVar4) {
        this.a = ggaVar;
        this.b = dxioVar;
        this.c = dxioVar2;
        this.d = dxioVar3;
        this.e = dxioVar4;
    }

    public static jic c(String str, ckqd ckqdVar, ckqf ckqfVar) {
        return new jic(str, ckqdVar, ibm.i(), 250, true, ckqfVar, new ckql());
    }

    public final void a(ilo iloVar, jjn jjnVar, bege begeVar) {
        this.c.a().a();
        begj begjVar = new begj();
        begjVar.b(iloVar);
        begjVar.c = jjnVar;
        begjVar.e = begeVar;
        begjVar.n = true;
        begjVar.c(false);
        begjVar.s = this.b.a().v();
        begjVar.y = false;
        this.e.a().o(begjVar, false, null);
    }

    public final void b(String str) {
        if (str.isEmpty()) {
            return;
        }
        ahr ahrVar = new ahr();
        ahrVar.c(ibm.w().b(this.a));
        this.d.a().q(this.a, ahrVar, str, 4);
    }
}
