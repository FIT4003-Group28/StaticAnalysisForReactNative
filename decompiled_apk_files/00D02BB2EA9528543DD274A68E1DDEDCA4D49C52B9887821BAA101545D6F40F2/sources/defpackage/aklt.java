package defpackage;
/* compiled from: PG */
/* renamed from: aklt  reason: default package */
/* loaded from: classes2.dex */
public class aklt {
    private final dzsj<dxio<aaap>> a;

    public aklt(dzsj<dxio<aaap>> dzsjVar) {
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

    public final akls a(dqfo dqfoVar, @dzsi acwt acwtVar, ddho ddhoVar) {
        dxio a = ((dxjh) this.a).a();
        b(a, 1);
        b(dqfoVar, 2);
        b(ddhoVar, 4);
        return new akls(a, dqfoVar, acwtVar, ddhoVar);
    }
}
