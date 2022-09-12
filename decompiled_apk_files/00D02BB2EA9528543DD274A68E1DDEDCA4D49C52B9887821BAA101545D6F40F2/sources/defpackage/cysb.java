package defpackage;
/* compiled from: PG */
/* renamed from: cysb  reason: default package */
/* loaded from: classes5.dex */
final class cysb extends bt {
    public cysb(bn bnVar) {
        super(bnVar);
    }

    @Override // defpackage.bt
    public final String d() {
        return "DELETE FROM RpcCache WHERE timestamp <= ?";
    }
}
