package defpackage;
/* compiled from: PG */
/* renamed from: cbyz  reason: default package */
/* loaded from: classes4.dex */
public final class cbyz extends cbzb {
    public String a;
    public Boolean b;

    @Override // defpackage.cbzb
    public final cbzc a() {
        String str = this.b == null ? " clearBackStack" : "";
        if (!str.isEmpty()) {
            throw new IllegalStateException(str.length() != 0 ? "Missing required properties:".concat(str) : new String("Missing required properties:"));
        }
        return new cbza(this.a, this.b);
    }
}
