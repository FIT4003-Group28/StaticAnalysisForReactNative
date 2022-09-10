package defpackage;
/* compiled from: PG */
/* renamed from: apvs  reason: default package */
/* loaded from: classes2.dex */
public final class apvs {
    public final dzsj<gga> a;
    public final dzsj<apvo> b;
    public final dzsj<cqhn> c;

    public apvs(dzsj<gga> dzsjVar, dzsj<apvo> dzsjVar2, dzsj<cqhn> dzsjVar3) {
        a(dzsjVar, 1);
        this.a = dzsjVar;
        a(dzsjVar2, 2);
        this.b = dzsjVar2;
        a(dzsjVar3, 3);
        this.c = dzsjVar3;
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
