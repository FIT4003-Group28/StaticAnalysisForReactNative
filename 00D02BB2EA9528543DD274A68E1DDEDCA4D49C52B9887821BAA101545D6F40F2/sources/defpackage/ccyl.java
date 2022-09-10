package defpackage;
/* compiled from: PG */
/* renamed from: ccyl  reason: default package */
/* loaded from: classes4.dex */
public final class ccyl {
    private final dzsj<cqhn> a;
    private final dzsj<ff> b;
    private final dzsj<ccrh> c;

    public ccyl(dzsj<cqhn> dzsjVar, dzsj<ff> dzsjVar2, dzsj<ccrh> dzsjVar3) {
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

    public final ccyk a() {
        cqhn a = this.a.a();
        b(a, 1);
        ff ffVar = (ff) ((dxjd) this.b).a;
        b(ffVar, 2);
        ccrh a2 = this.c.a();
        b(a2, 3);
        return new ccyk(a, ffVar, a2);
    }
}
