package defpackage;
/* compiled from: PG */
/* renamed from: cfjv  reason: default package */
/* loaded from: classes4.dex */
public class cfjv {
    public final dzsj<cfgv> a;
    public final dzsj<dxio<akzh>> b;
    public final dzsj<cfhy> c;
    public final dzsj<cfjq> d;

    public cfjv(dzsj<cfgv> dzsjVar, dzsj<dxio<akzh>> dzsjVar2, dzsj<cfhy> dzsjVar3, dzsj<cfjq> dzsjVar4) {
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
