package defpackage;
/* compiled from: PG */
/* renamed from: bebr  reason: default package */
/* loaded from: classes3.dex */
public class bebr {
    public final dzsj<gga> a;
    public final dzsj<bwqv> b;
    public final dzsj<akfa> c;

    public bebr(dzsj<gga> dzsjVar, dzsj<bwqv> dzsjVar2, dzsj<akfa> dzsjVar3) {
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
