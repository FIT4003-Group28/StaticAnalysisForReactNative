package defpackage;
/* compiled from: PG */
/* renamed from: apis  reason: default package */
/* loaded from: classes2.dex */
public class apis {
    public final dzsj<bwqv> a;
    public final dzsj<gga> b;
    public final dzsj<bmdv> c;
    public final dzsj<aphj> d;

    public apis(dzsj<bwqv> dzsjVar, dzsj<gga> dzsjVar2, dzsj<bmdv> dzsjVar3, dzsj<aphj> dzsjVar4) {
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
