package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cuop  reason: default package */
/* loaded from: classes5.dex */
public final class cuop extends cupn {
    private dcdc<cupp> a;

    @Override // defpackage.cupn
    public final void b(dcdc<cupp> dcdcVar) {
        if (dcdcVar != null) {
            this.a = dcdcVar;
            return;
        }
        throw new NullPointerException("Null verticalLayoutButtons");
    }

    @Override // defpackage.cupn
    public final cupq a() {
        String str = this.a == null ? " verticalLayoutButtons" : "";
        if (!str.isEmpty()) {
            throw new IllegalStateException(str.length() != 0 ? "Missing required properties:".concat(str) : new String("Missing required properties:"));
        }
        return new cuoq(this.a);
    }
}
