package defpackage;
/* compiled from: PG */
/* renamed from: brze  reason: default package */
/* loaded from: classes4.dex */
public class brze {
    private final dzsj<bskt> a;
    private final dzsj<aehr> b;
    private final dzsj<brzx> c;
    private final dzsj<cqhn> d;

    public brze(dzsj<bskt> dzsjVar, dzsj<aehr> dzsjVar2, dzsj<brzx> dzsjVar3, dzsj<cqhn> dzsjVar4) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
        b(dzsjVar2, 2);
        this.b = dzsjVar2;
        b(dzsjVar3, 3);
        this.c = dzsjVar3;
        b(dzsjVar4, 4);
        this.d = dzsjVar4;
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

    public final brzd a(boolean z) {
        bskt a = this.a.a();
        b(a, 1);
        aehr a2 = this.b.a();
        b(a2, 2);
        brzx a3 = this.c.a();
        b(a3, 3);
        cqhn a4 = this.d.a();
        b(a4, 4);
        return new brzd(a, a2, a3, a4, z);
    }
}
