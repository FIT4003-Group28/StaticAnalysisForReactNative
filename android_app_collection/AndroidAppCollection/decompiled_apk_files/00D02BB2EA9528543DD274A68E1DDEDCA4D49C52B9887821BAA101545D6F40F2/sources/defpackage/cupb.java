package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cupb  reason: default package */
/* loaded from: classes5.dex */
public final class cupb extends cuqc {
    private dcdc<cuql> a;

    @Override // defpackage.cuqc
    public final void b(dcdc<cuql> dcdcVar) {
        if (dcdcVar != null) {
            this.a = dcdcVar;
            return;
        }
        throw new NullPointerException("Null components");
    }

    @Override // defpackage.cuqc
    public final cuqd a() {
        String str = this.a == null ? " components" : "";
        if (!str.isEmpty()) {
            throw new IllegalStateException(str.length() != 0 ? "Missing required properties:".concat(str) : new String("Missing required properties:"));
        }
        return new cupc(this.a);
    }
}
