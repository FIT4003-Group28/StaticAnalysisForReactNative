package defpackage;
/* compiled from: PG */
/* renamed from: apgv  reason: default package */
/* loaded from: classes2.dex */
public final class apgv {
    public final dzsj<gga> a;
    public final dzsj<apgh> b;
    public final dzsj<apgx> c;
    public final dzsj<cqhn> d;
    public final dzsj<aoxq> e;

    public apgv(dzsj<gga> dzsjVar, dzsj<apgh> dzsjVar2, dzsj<apgx> dzsjVar3, dzsj<cqhn> dzsjVar4, dzsj<aoxq> dzsjVar5) {
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
