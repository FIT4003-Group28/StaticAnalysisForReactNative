package defpackage;
/* compiled from: PG */
/* renamed from: bxps  reason: default package */
/* loaded from: classes4.dex */
public final class bxps {
    public final dzsj<fd> a;
    public final dzsj<glj> b;
    public final dzsj<dxio<bxqs>> c;

    public bxps(dzsj<fd> dzsjVar, dzsj<glj> dzsjVar2, dzsj<dxio<bxqs>> dzsjVar3) {
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
