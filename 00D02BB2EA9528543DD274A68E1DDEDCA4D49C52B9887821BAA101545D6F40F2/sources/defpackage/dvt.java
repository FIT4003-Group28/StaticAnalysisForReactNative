package defpackage;
/* compiled from: PG */
/* renamed from: dvt  reason: default package */
/* loaded from: classes6.dex */
public final class dvt {
    public final dzsj<dvv> a;
    public final dzsj<dwa> b;
    public final dzsj<dwc> c;
    public final dzsj<dwj> d;

    public dvt(dzsj<dvv> dzsjVar, dzsj<dwa> dzsjVar2, dzsj<dwc> dzsjVar3, dzsj<dwj> dzsjVar4) {
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
