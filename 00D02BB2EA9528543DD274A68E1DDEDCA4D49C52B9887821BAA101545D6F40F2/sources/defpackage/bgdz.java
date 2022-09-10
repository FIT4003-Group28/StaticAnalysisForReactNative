package defpackage;
/* compiled from: PG */
/* renamed from: bgdz  reason: default package */
/* loaded from: classes3.dex */
public final class bgdz {
    public final dzsj<btpc> a;
    public final dzsj<bupz> b;
    public final dzsj<avnt> c;
    public final dzsj<cqat> d;
    public final dzsj<bvrb> e;

    public bgdz(dzsj<btpc> dzsjVar, dzsj<bupz> dzsjVar2, dzsj<avnt> dzsjVar3, dzsj<cqat> dzsjVar4, dzsj<bvrb> dzsjVar5) {
        a(dzsjVar, 1);
        this.a = dzsjVar;
        a(dzsjVar2, 2);
        this.b = dzsjVar2;
        a(dzsjVar3, 3);
        this.c = dzsjVar3;
        a(dzsjVar4, 4);
        this.d = dzsjVar4;
        a(dzsjVar5, 5);
        this.e = dzsjVar5;
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
