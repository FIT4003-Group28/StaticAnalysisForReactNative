package defpackage;
/* compiled from: PG */
/* renamed from: zzu  reason: default package */
/* loaded from: classes7.dex */
public final class zzu {
    public final dzsj<bvsl> a;
    public final dzsj<bvrb> b;

    public zzu(dzsj<bvsl> dzsjVar, dzsj<bvrb> dzsjVar2) {
        a(dzsjVar, 1);
        this.a = dzsjVar;
        a(dzsjVar2, 2);
        this.b = dzsjVar2;
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
