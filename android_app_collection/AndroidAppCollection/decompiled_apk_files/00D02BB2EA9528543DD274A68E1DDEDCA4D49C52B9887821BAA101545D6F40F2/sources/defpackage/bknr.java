package defpackage;
/* compiled from: PG */
/* renamed from: bknr  reason: default package */
/* loaded from: classes3.dex */
public class bknr implements bknq {
    @dzsi
    private final String a;
    @dzsi
    private final String b;
    private final dxio<afha> c;

    public bknr(dxio<afha> dxioVar, @dzsi dnpq dnpqVar) {
        this.c = dxioVar;
        String str = null;
        this.a = dnpqVar != null ? dnpqVar.d : null;
        this.b = dnpqVar != null ? dnpqVar.c : str;
    }

    @Override // defpackage.bknq
    @dzsi
    public String a() {
        return this.a;
    }

    @Override // defpackage.bknq
    public cqkl b() {
        String str = this.b;
        dbsk.s(str);
        this.c.a().m(str, 1);
        return cqkl.a;
    }
}
