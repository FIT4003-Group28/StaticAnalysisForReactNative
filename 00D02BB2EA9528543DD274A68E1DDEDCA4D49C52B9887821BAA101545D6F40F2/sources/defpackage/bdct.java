package defpackage;
/* compiled from: PG */
/* renamed from: bdct  reason: default package */
/* loaded from: classes3.dex */
public final class bdct {
    public final dzsj<bnjv> a;
    public final dzsj<axwy> b;
    public final dzsj<bbut> c;
    public final dzsj<axyp> d;

    public bdct(dzsj<bnjv> dzsjVar, dzsj<axwy> dzsjVar2, dzsj<bbut> dzsjVar3, dzsj<axyp> dzsjVar4) {
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
