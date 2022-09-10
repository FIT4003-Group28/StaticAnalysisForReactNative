package defpackage;
/* compiled from: PG */
/* renamed from: bkmz  reason: default package */
/* loaded from: classes3.dex */
public final class bkmz {
    public final dzsj<btvo> a;
    public final dzsj<bhhf> b;

    public bkmz(dzsj<btvo> dzsjVar, dzsj<bhhf> dzsjVar2) {
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
