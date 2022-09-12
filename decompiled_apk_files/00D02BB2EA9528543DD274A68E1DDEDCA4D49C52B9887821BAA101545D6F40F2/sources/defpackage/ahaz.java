package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: ahaz  reason: default package */
/* loaded from: classes2.dex */
public final class ahaz {
    private final ahbc g;
    private final List<cqix<?>> h;
    private final cjtd i;
    @dzsi
    public CharSequence a = null;
    @dzsi
    public ahdv f = null;
    @dzsi
    public jic b = null;
    public cjtd c = cjtd.b;
    @dzsi
    public ahfa e = null;
    public boolean d = false;

    public ahaz(ahbc ahbcVar, List<cqix<?>> list, cjtd cjtdVar) {
        this.g = ahbcVar;
        this.h = list;
        this.i = cjtdVar;
    }

    public final ahbb a() {
        ahbc ahbcVar = this.g;
        List<cqix<?>> list = this.h;
        cjtd cjtdVar = this.i;
        CharSequence charSequence = this.a;
        ahdv ahdvVar = this.f;
        cjtd cjtdVar2 = this.c;
        ahfa ahfaVar = this.e;
        boolean z = this.d;
        gga a = ahbcVar.a.a();
        ahbc.a(a, 1);
        huc a2 = ahbcVar.b.a();
        ahbc.a(a2, 2);
        bvpe a3 = ahbcVar.c.a();
        ahbc.a(a3, 3);
        ahbc.a(ahbcVar.d.a(), 4);
        ahbc.a(ahbcVar.e.a(), 5);
        dehq a4 = ahbcVar.f.a();
        ahbc.a(a4, 6);
        ahbc.a(ahbcVar.g.a(), 7);
        cpv a5 = ahbcVar.h.a();
        ahbc.a(a5, 8);
        ahbc.a(list, 9);
        ahbc.a(cjtdVar, 10);
        ahbc.a(cjtdVar2, 14);
        return new ahbb(a, a2, a3, a4, a5, list, cjtdVar, charSequence, ahdvVar, null, cjtdVar2, ahfaVar, z);
    }
}
