package defpackage;
/* compiled from: PG */
/* renamed from: bjcj  reason: default package */
/* loaded from: classes.dex */
public class bjcj {
    public final dzsj<gga> a;
    public final dzsj<bwqv> b;
    public final dzsj<bjhc> c;
    public final dzsj<cafi> d;
    public final dzsj<bjgb> e;

    public bjcj(dzsj<gga> dzsjVar, dzsj<bwqv> dzsjVar2, dzsj<bjhc> dzsjVar3, dzsj<cafi> dzsjVar4, dzsj<bjgb> dzsjVar5) {
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
    }

    public static <T> void b(T t, int i) {
        if (t != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final bjci a(bwrs<ilo> bwrsVar, ddho ddhoVar) {
        gga a = this.a.a();
        b(a, 1);
        bwqv a2 = this.b.a();
        b(a2, 2);
        bjhc a3 = this.c.a();
        b(a3, 3);
        cafi a4 = this.d.a();
        b(a4, 4);
        bjgb a5 = this.e.a();
        b(a5, 5);
        b(bwrsVar, 6);
        b(ddhoVar, 7);
        return new bjci(a, a2, a3, a4, a5, bwrsVar, ddhoVar);
    }
}
