package defpackage;
/* compiled from: PG */
/* renamed from: bjhi  reason: default package */
/* loaded from: classes.dex */
public class bjhi {
    private final dzsj<bjgu> a;
    private final dzsj<bjkq> b;
    private final dzsj<bjzr> c;

    public bjhi(dzsj<bjgu> dzsjVar, dzsj<bjkq> dzsjVar2, dzsj<bjzr> dzsjVar3) {
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

    public final bjhh a(absg absgVar) {
        b(this.a.a(), 1);
        bjkq a = this.b.a();
        b(a, 2);
        b(this.c.a(), 3);
        b(absgVar, 4);
        return new bjhh(a);
    }
}
