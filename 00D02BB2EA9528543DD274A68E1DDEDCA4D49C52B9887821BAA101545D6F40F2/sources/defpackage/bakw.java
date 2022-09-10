package defpackage;
/* compiled from: PG */
/* renamed from: bakw  reason: default package */
/* loaded from: classes3.dex */
public class bakw {
    public final dzsj<btpc> a;
    public final dzsj<bwqv> b;
    public final dzsj<befw> c;
    public final dzsj<dxio<axwi>> d;

    public bakw(dzsj<btpc> dzsjVar, dzsj<bwqv> dzsjVar2, dzsj<befw> dzsjVar3, dzsj<dxio<axwi>> dzsjVar4) {
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
