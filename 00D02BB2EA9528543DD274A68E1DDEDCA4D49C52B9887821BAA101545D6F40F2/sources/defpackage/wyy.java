package defpackage;
/* compiled from: PG */
/* renamed from: wyy  reason: default package */
/* loaded from: classes7.dex */
public class wyy {
    public final dzsj<gga> a;
    public final dzsj<wyw> b;
    public final dzsj<wvi> c;
    public final dzsj<wvp> d;

    public wyy(dzsj<gga> dzsjVar, dzsj<wyw> dzsjVar2, dzsj<wvi> dzsjVar3, dzsj<wvp> dzsjVar4) {
        a(dzsjVar, 1);
        this.a = dzsjVar;
        a(dzsjVar2, 2);
        this.b = dzsjVar2;
        a(dzsjVar3, 3);
        this.c = dzsjVar3;
        a(dzsjVar4, 4);
        this.d = dzsjVar4;
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
