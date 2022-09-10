package defpackage;
/* compiled from: PG */
/* renamed from: bdpw  reason: default package */
/* loaded from: classes3.dex */
public final class bdpw {
    private final dzsj<bduq> a;
    private final dzsj<bdqb> b;
    private final dzsj<bcpe> c;
    private final dzsj<bdme> d;
    private final dzsj<bvrb> e;
    private final dzsj<ckcw> f;
    private final dzsj<ahjq> g;
    private final dzsj<dxio<apni>> h;
    private final dzsj<dxio<afha>> i;

    public bdpw(dzsj<bduq> dzsjVar, dzsj<bdqb> dzsjVar2, dzsj<bcpe> dzsjVar3, dzsj<bdme> dzsjVar4, dzsj<bvrb> dzsjVar5, dzsj<ckcw> dzsjVar6, dzsj<ahjq> dzsjVar7, dzsj<dxio<apni>> dzsjVar8, dzsj<dxio<afha>> dzsjVar9) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
        b(dzsjVar2, 2);
        this.b = dzsjVar2;
        b(dzsjVar3, 3);
        this.c = dzsjVar3;
        b(dzsjVar4, 4);
        this.d = dzsjVar4;
        b(dzsjVar5, 5);
        this.e = dzsjVar5;
        b(dzsjVar6, 6);
        this.f = dzsjVar6;
        b(dzsjVar7, 7);
        this.g = dzsjVar7;
        b(dzsjVar8, 8);
        this.h = dzsjVar8;
        b(dzsjVar9, 9);
        this.i = dzsjVar9;
    }

    private static <T> void b(T t, int i) {
        if (t != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final bdpv a(fd fdVar, bdpj bdpjVar) {
        b(fdVar, 1);
        b(bdpjVar, 2);
        bduq a = this.a.a();
        b(a, 3);
        bdqb a2 = this.b.a();
        b(a2, 4);
        bcpe a3 = this.c.a();
        b(a3, 5);
        b(this.d.a(), 6);
        bvrb a4 = this.e.a();
        b(a4, 7);
        ckcw a5 = this.f.a();
        b(a5, 8);
        ahjq a6 = this.g.a();
        b(a6, 9);
        dxio a7 = ((dxjh) this.h).a();
        b(a7, 10);
        dxio a8 = ((dxjh) this.i).a();
        b(a8, 11);
        return new bdpv(fdVar, bdpjVar, a, a2, a3, a4, a5, a6, a7, a8);
    }
}
