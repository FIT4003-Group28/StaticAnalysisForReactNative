package defpackage;
/* compiled from: PG */
/* renamed from: bjkq  reason: default package */
/* loaded from: classes.dex */
public final class bjkq {
    private final dzsj<gga> a;
    private final dzsj<cqhn> b;
    private final dzsj<bjbu> c;
    private final dzsj<bjqf> d;
    private final dzsj<bjcj> e;

    public bjkq(dzsj<gga> dzsjVar, dzsj<cqhn> dzsjVar2, dzsj<bjbu> dzsjVar3, dzsj<bjqf> dzsjVar4, dzsj<bjcj> dzsjVar5) {
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

    private static <T> void b(T t, int i) {
        if (t != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final bjkp a(boolean z) {
        gga a = this.a.a();
        b(a, 1);
        cqhn a2 = this.b.a();
        b(a2, 2);
        bjbu a3 = this.c.a();
        b(a3, 3);
        bjqf a4 = this.d.a();
        b(a4, 4);
        bjcj a5 = this.e.a();
        b(a5, 5);
        return new bjkp(a, a2, a3, a4, a5, z);
    }
}
