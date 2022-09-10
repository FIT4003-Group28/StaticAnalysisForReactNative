package defpackage;
/* compiled from: PG */
/* renamed from: psg  reason: default package */
/* loaded from: classes7.dex */
public final class psg {
    public final dzsj<gga> a;
    public final dzsj<qbt> b;
    public final dzsj<bwjz> c;
    public final dzsj<vxa> d;
    public final dzsj<cklq> e;
    public final dzsj<tnv> f;

    public psg(dzsj<gga> dzsjVar, dzsj<qbt> dzsjVar2, dzsj<bwjz> dzsjVar3, dzsj<vxa> dzsjVar4, dzsj<cklq> dzsjVar5, dzsj<tnv> dzsjVar6) {
        a(dzsjVar, 1);
        this.a = dzsjVar;
        a(dzsjVar2, 2);
        this.b = dzsjVar2;
        a(dzsjVar3, 3);
        this.c = dzsjVar3;
        a(dzsjVar4, 4);
        this.d = dzsjVar4;
        a(dzsjVar5, 5);
        this.e = dzsjVar5;
        a(dzsjVar6, 6);
        this.f = dzsjVar6;
    }

    public static <T> void a(T t, int i) {
        if (t != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }
}
