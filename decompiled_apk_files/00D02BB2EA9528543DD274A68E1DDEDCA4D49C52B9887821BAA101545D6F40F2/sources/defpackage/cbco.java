package defpackage;
/* compiled from: PG */
/* renamed from: cbco  reason: default package */
/* loaded from: classes4.dex */
public final class cbco {
    public final dzsj<bwqv> a;
    public final dzsj<dxio<cqhn>> b;
    public final dzsj<cqhu> c;
    public final dzsj<dxio<hwd>> d;

    public cbco(dzsj<bwqv> dzsjVar, dzsj<dxio<cqhn>> dzsjVar2, dzsj<cqhu> dzsjVar3, dzsj<dxio<hwd>> dzsjVar4) {
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
