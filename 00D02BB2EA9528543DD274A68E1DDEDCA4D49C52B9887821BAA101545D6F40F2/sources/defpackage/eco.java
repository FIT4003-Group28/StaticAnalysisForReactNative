package defpackage;
/* compiled from: PG */
/* renamed from: eco  reason: default package */
/* loaded from: classes6.dex */
public class eco {
    private final dzsj<gga> a;
    private final dzsj<cqhn> b;
    private final dzsj<jlp> c;
    private final dzsj<bvrb> d;

    public eco(dzsj<gga> dzsjVar, dzsj<cqhn> dzsjVar2, dzsj<jlp> dzsjVar3, dzsj<bvrb> dzsjVar4) {
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

    public final ecn a(dkfv dkfvVar, @dzsi Runnable runnable) {
        gga a = this.a.a();
        b(a, 1);
        cqhn a2 = this.b.a();
        b(a2, 2);
        jlp a3 = this.c.a();
        b(a3, 3);
        bvrb a4 = this.d.a();
        b(a4, 4);
        b(dkfvVar, 5);
        return new ecn(a, a2, a3, a4, dkfvVar, runnable);
    }
}
