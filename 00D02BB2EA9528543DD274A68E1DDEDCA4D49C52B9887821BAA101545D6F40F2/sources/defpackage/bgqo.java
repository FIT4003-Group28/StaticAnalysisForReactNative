package defpackage;
/* compiled from: PG */
/* renamed from: bgqo  reason: default package */
/* loaded from: classes3.dex */
public final class bgqo {
    private final dzsj<btvo> a;

    public bgqo(dzsj<btvo> dzsjVar) {
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

    public final bgqn a(dbty<bwrs<ilo>> dbtyVar) {
        btvo a = this.a.a();
        b(a, 1);
        b(dbtyVar, 2);
        return new bgqn(a, dbtyVar);
    }
}
