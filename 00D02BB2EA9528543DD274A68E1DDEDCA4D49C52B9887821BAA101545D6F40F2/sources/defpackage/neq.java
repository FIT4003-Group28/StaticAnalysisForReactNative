package defpackage;
/* compiled from: PG */
/* renamed from: neq  reason: default package */
/* loaded from: classes7.dex */
public final class neq {
    private final dzsj<nfg> a;

    public neq(dzsj<nfg> dzsjVar) {
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

    public final nep a(kxu kxuVar, dbty<lxh> dbtyVar, kdg kdgVar, noo nooVar, nop nopVar, kdi kdiVar, not notVar, cqkj cqkjVar, jty jtyVar) {
        b(this.a.a(), 1);
        b(kxuVar, 2);
        b(dbtyVar, 3);
        b(kdgVar, 4);
        b(nooVar, 5);
        b(nopVar, 6);
        b(kdiVar, 7);
        b(notVar, 8);
        b(cqkjVar, 9);
        b(jtyVar, 10);
        return new nep();
    }
}
