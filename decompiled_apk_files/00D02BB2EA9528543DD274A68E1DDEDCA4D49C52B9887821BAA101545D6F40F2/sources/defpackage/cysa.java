package defpackage;
/* compiled from: PG */
/* renamed from: cysa  reason: default package */
/* loaded from: classes5.dex */
final class cysa extends bb<cysi> {
    public cysa(bn bnVar) {
        super(bnVar);
    }

    @Override // defpackage.bt
    public final String d() {
        return "DELETE FROM `RpcCache` WHERE `type` = ? AND `key` = ?";
    }
}
