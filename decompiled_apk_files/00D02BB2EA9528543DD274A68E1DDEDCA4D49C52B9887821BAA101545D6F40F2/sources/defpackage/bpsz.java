package defpackage;
/* compiled from: PG */
/* renamed from: bpsz  reason: default package */
/* loaded from: classes4.dex */
public final class bpsz {
    public final dzsj<akox> a;
    public final dzsj<dxio<boxa>> b;
    public final dzsj<bpte> c;

    public bpsz(dzsj<akox> dzsjVar, dzsj<dxio<boxa>> dzsjVar2, dzsj<bpte> dzsjVar3) {
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
