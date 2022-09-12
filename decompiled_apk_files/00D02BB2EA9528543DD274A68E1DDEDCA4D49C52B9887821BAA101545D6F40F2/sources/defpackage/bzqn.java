package defpackage;
/* compiled from: PG */
/* renamed from: bzqn  reason: default package */
/* loaded from: classes4.dex */
public final class bzqn {
    private final dzsj<dxio<gce>> a;

    public bzqn(dzsj<dxio<gce>> dzsjVar) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
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

    public final bzqm a(dqkf dqkfVar) {
        dxio a = ((dxjh) this.a).a();
        b(a, 1);
        b(dqkfVar, 2);
        return new bzqm(a, dqkfVar);
    }
}
