package defpackage;
/* compiled from: PG */
/* renamed from: axpf  reason: default package */
/* loaded from: classes3.dex */
public final class axpf {
    private final dzsj<axjh> a;
    private final dzsj<axoi> b;

    public axpf(dzsj<axjh> dzsjVar, dzsj<axoi> dzsjVar2) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
        b(dzsjVar2, 2);
        this.b = dzsjVar2;
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

    public final axpe a(dqae dqaeVar, axoo axooVar) {
        axjh a = this.a.a();
        b(a, 1);
        axoi a2 = this.b.a();
        b(a2, 2);
        b(dqaeVar, 3);
        b(axooVar, 4);
        return new axpe(a, a2, dqaeVar, axooVar);
    }
}
