package defpackage;
/* compiled from: PG */
/* renamed from: biws  reason: default package */
/* loaded from: classes3.dex */
public class biws {
    public final dzsj<ff> a;
    public final dzsj<btvo> b;
    public final dzsj<cjqy> c;
    public final dzsj<begg> d;

    public biws(dzsj<ff> dzsjVar, dzsj<btvo> dzsjVar2, dzsj<cjqy> dzsjVar3, dzsj<begg> dzsjVar4) {
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