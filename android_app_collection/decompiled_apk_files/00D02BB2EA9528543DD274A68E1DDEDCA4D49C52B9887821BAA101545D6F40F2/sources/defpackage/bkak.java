package defpackage;
/* compiled from: PG */
/* renamed from: bkak  reason: default package */
/* loaded from: classes3.dex */
public final class bkak {
    private final dzsj<cqhn> a;
    private final dzsj<gga> b;
    private final dzsj<dxio<akfa>> c;
    private final dzsj<bjhc> d;
    private final dzsj<bvfc> e;
    private final dzsj<bjgz> f;

    public bkak(dzsj<cqhn> dzsjVar, dzsj<gga> dzsjVar2, dzsj<dxio<akfa>> dzsjVar3, dzsj<bjhc> dzsjVar4, dzsj<bvfc> dzsjVar5, dzsj<bjgz> dzsjVar6) {
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

    public final bkaj a(bwrs<ilo> bwrsVar, djam djamVar, boolean z) {
        cqhn a = this.a.a();
        b(a, 1);
        gga a2 = this.b.a();
        b(a2, 2);
        dxio a3 = ((dxjh) this.c).a();
        b(a3, 3);
        bjhc a4 = this.d.a();
        b(a4, 4);
        bvfc a5 = this.e.a();
        b(a5, 5);
        bjgz a6 = this.f.a();
        b(a6, 6);
        b(bwrsVar, 7);
        b(djamVar, 8);
        return new bkaj(a, a2, a3, a4, a5, a6, bwrsVar, djamVar, z);
    }
}
