package defpackage;
/* compiled from: PG */
/* renamed from: dwc  reason: default package */
/* loaded from: classes6.dex */
public final class dwc {
    public final dzsj<czw> a;
    public final dzsj<dui> b;
    public final dzsj<dwg> c;

    public dwc(dzsj<czw> dzsjVar, dzsj<dui> dzsjVar2, dzsj<dwg> dzsjVar3) {
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
