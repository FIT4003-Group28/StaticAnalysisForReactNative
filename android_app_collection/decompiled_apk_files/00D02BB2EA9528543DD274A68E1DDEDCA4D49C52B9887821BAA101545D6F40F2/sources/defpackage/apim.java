package defpackage;
/* compiled from: PG */
/* renamed from: apim  reason: default package */
/* loaded from: classes2.dex */
public class apim {
    public final dzsj<bwqv> a;
    public final dzsj<aoxv> b;
    public final dzsj<gga> c;
    public final dzsj<bmdv> d;
    public final dzsj<aphj> e;

    public apim(dzsj<bwqv> dzsjVar, dzsj<aoxv> dzsjVar2, dzsj<gga> dzsjVar3, dzsj<bmdv> dzsjVar4, dzsj<aphj> dzsjVar5) {
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
