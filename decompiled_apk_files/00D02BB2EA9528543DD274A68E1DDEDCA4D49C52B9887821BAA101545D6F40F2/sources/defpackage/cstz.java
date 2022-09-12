package defpackage;
/* compiled from: PG */
/* renamed from: cstz  reason: default package */
/* loaded from: classes5.dex */
public final class cstz extends csus {
    public int a;

    @Override // defpackage.csus
    public final csut a() {
        String str = this.a == 0 ? " status" : "";
        if (!str.isEmpty()) {
            throw new IllegalStateException(str.length() != 0 ? "Missing required properties:".concat(str) : new String("Missing required properties:"));
        }
        return new csua(this.a);
    }
}
