package defpackage;
/* compiled from: PG */
/* renamed from: bsne  reason: default package */
/* loaded from: classes4.dex */
public final class bsne {
    private final dzsj<bsng> a;
    private final dzsj<bsnb> b;
    private final dzsj<huc> c;

    public bsne(dzsj<bsng> dzsjVar, dzsj<bsnb> dzsjVar2, dzsj<huc> dzsjVar3) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
        b(dzsjVar2, 2);
        this.b = dzsjVar2;
        b(dzsjVar3, 3);
        this.c = dzsjVar3;
    }

    private static <T> void b(T t, int i) {
        if (t != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final bsnd a(djrs djrsVar, ddho ddhoVar, ddho ddhoVar2, boolean z) {
        bsng a = this.a.a();
        b(a, 1);
        bsnb a2 = this.b.a();
        b(a2, 2);
        huc a3 = this.c.a();
        b(a3, 3);
        b(djrsVar, 4);
        b(ddhoVar, 5);
        b(ddhoVar2, 6);
        return new bsnd(a, a2, a3, djrsVar, ddhoVar, ddhoVar2, z);
    }
}
