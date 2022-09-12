package defpackage;
/* compiled from: PG */
/* renamed from: blmp  reason: default package */
/* loaded from: classes3.dex */
public class blmp {
    private final dzsj<gga> a;
    private final dzsj<dxio<bkpi>> b;
    private final dzsj<cpv> c;
    private final dzsj<cjqq> d;
    private final dzsj<cjqy> e;
    private final dzsj<cebr> f;

    public blmp(dzsj<gga> dzsjVar, dzsj<dxio<bkpi>> dzsjVar2, dzsj<cpv> dzsjVar3, dzsj<cjqq> dzsjVar4, dzsj<cjqy> dzsjVar5, dzsj<cebr> dzsjVar6) {
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

    public final blmo a(cdjd cdjdVar, @dzsi String str, dbsg<jbe> dbsgVar, bwrs<ilo> bwrsVar) {
        b(cdjdVar, 1);
        b(dbsgVar, 4);
        b(bwrsVar, 5);
        gga a = this.a.a();
        b(a, 6);
        dxio a2 = ((dxjh) this.b).a();
        b(a2, 7);
        cpv a3 = this.c.a();
        b(a3, 8);
        cjqq a4 = this.d.a();
        b(a4, 9);
        cjqy a5 = this.e.a();
        b(a5, 10);
        cebr a6 = this.f.a();
        b(a6, 11);
        return new blmo(cdjdVar, false, str, dbsgVar, bwrsVar, a, a2, a3, a4, a5, a6);
    }
}
