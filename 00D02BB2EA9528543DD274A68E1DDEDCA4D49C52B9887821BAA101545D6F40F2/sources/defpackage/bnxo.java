package defpackage;
/* compiled from: PG */
/* renamed from: bnxo  reason: default package */
/* loaded from: classes3.dex */
public final class bnxo {
    public final dzsj<bnxb> a;
    public final dzsj<gga> b;
    public final dzsj<dxio<boxa>> c;
    public final dzsj<cjqy> d;

    public bnxo(dzsj<bnxb> dzsjVar, dzsj<gga> dzsjVar2, dzsj<dxio<boxa>> dzsjVar3, dzsj<cjqy> dzsjVar4) {
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
