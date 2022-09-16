package defpackage;
/* compiled from: PG */
/* renamed from: mxp  reason: default package */
/* loaded from: classes7.dex */
public final class mxp {
    private final dzsj<btrm> a;

    public mxp(dzsj<btrm> dzsjVar) {
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

    public final mxo a(cqkj cqkjVar, not notVar, noo nooVar, kdg kdgVar, kxu kxuVar, vxa vxaVar, vxo vxoVar, mxs mxsVar, mxu mxuVar, boolean z) {
        b(cqkjVar, 1);
        b(notVar, 2);
        b(nooVar, 3);
        btrm a = this.a.a();
        b(a, 4);
        b(kdgVar, 5);
        b(kxuVar, 6);
        b(vxaVar, 7);
        b(vxoVar, 8);
        b(mxsVar, 9);
        b(mxuVar, 10);
        return new mxo(cqkjVar, notVar, nooVar, a, kdgVar, kxuVar, vxaVar, vxoVar, mxsVar, mxuVar, z);
    }
}
