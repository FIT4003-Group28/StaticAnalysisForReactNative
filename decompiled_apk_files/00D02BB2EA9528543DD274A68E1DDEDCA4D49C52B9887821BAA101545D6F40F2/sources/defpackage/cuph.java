package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cuph  reason: default package */
/* loaded from: classes5.dex */
public final class cuph extends cuqj {
    private dcdc<cuqq> a;

    @Override // defpackage.cuqj
    public final void b(dcdc<cuqq> dcdcVar) {
        if (dcdcVar != null) {
            this.a = dcdcVar;
            return;
        }
        throw new NullPointerException("Null elements");
    }

    @Override // defpackage.cuqj
    public final cuqk a() {
        String str = this.a == null ? " elements" : "";
        if (!str.isEmpty()) {
            throw new IllegalStateException(str.length() != 0 ? "Missing required properties:".concat(str) : new String("Missing required properties:"));
        }
        return new cupi(this.a);
    }
}
