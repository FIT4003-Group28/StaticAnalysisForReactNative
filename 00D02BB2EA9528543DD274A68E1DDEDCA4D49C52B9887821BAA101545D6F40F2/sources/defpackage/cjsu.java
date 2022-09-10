package defpackage;
/* compiled from: PG */
/* renamed from: cjsu  reason: default package */
/* loaded from: classes4.dex */
public abstract class cjsu {
    private String a;

    public static cjst d() {
        return new cjrr();
    }

    public abstract dcdc<cjrz> a();

    public abstract ddhn b();

    @dzsi
    public abstract String c();

    public final void e(String str) {
        dbsk.l(this.a == null);
        this.a = str;
    }

    public final cjtd f(int i) {
        dbsk.l(this.a != null);
        ddcu a = a().get(i).a();
        ddxw bZ = ddxx.j.bZ();
        int i2 = a.a;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddxx ddxxVar = (ddxx) bZ.b;
        ddxxVar.a |= 8;
        ddxxVar.d = i2;
        ddxz e = cjra.e(this.a);
        dbsk.s(e);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddxx ddxxVar2 = (ddxx) bZ.b;
        e.getClass();
        ddxxVar2.i = e;
        int i3 = ddxxVar2.a | 2048;
        ddxxVar2.a = i3;
        ddxxVar2.a = i3 | 1;
        ddxxVar2.b = i;
        cjta b = cjtd.b();
        b.g(cjrx.b(bZ.bK()));
        b.b = this.a;
        return b.d();
    }
}
