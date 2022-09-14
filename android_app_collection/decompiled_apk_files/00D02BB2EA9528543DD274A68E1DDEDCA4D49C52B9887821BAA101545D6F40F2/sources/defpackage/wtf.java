package defpackage;
/* compiled from: PG */
/* renamed from: wtf  reason: default package */
/* loaded from: classes7.dex */
public abstract class wtf {
    public static wtf j(dbsg<Integer> dbsgVar, amvh amvhVar, @dzsi dwao dwaoVar, @dzsi dnqh dnqhVar) {
        return k(dbsgVar, amvhVar, null, false, dwaoVar, dnqhVar);
    }

    public static wtf k(dbsg<Integer> dbsgVar, amvh amvhVar, @dzsi amvh amvhVar2, boolean z, @dzsi dwao dwaoVar, @dzsi dnqh dnqhVar) {
        wtd wtdVar = new wtd(dbsgVar, amvhVar, z, 1);
        wtdVar.a = amvhVar2;
        wtdVar.b = dwaoVar;
        wtdVar.c = dnqhVar;
        wtdVar.d = null;
        return wtdVar.a();
    }

    public abstract dbsg<Integer> a();

    public abstract amvh b();

    @dzsi
    public abstract amvh c();

    public abstract boolean d();

    @dzsi
    public abstract dwao e();

    @dzsi
    public abstract dnqh f();

    @dzsi
    public abstract dnqh g();

    @dzsi
    public abstract ddgg h();

    public abstract int i();
}
