package defpackage;
/* compiled from: PG */
/* renamed from: abud  reason: default package */
/* loaded from: classes.dex */
public final class abud {
    public final dzsj<huc> a;
    public final dzsj<abvz> b;
    public final dzsj<bvpe> c;

    public abud(dzsj<huc> dzsjVar, dzsj<abvz> dzsjVar2, dzsj<bvpe> dzsjVar3) {
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
