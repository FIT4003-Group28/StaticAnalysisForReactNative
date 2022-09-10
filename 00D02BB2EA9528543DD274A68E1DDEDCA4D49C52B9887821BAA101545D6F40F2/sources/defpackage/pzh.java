package defpackage;
/* compiled from: PG */
/* renamed from: pzh  reason: default package */
/* loaded from: classes7.dex */
public class pzh {
    public final dzsj<btpc> a;
    public final dzsj<dxio<qbt>> b;
    public final dzsj<dxio<afha>> c;

    public pzh(dzsj<btpc> dzsjVar, dzsj<dxio<qbt>> dzsjVar2, dzsj<dxio<afha>> dzsjVar3) {
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
