package defpackage;
/* compiled from: PG */
/* renamed from: bucb  reason: default package */
/* loaded from: classes4.dex */
public final class bucb {
    public final dzsj<bvjj> a;
    public final dzsj<dxio<btto>> b;
    public final dzsj<dxio<ckcw>> c;

    public bucb(dzsj<bvjj> dzsjVar, dzsj<dxio<btto>> dzsjVar2, dzsj<dxio<ckcw>> dzsjVar3) {
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
