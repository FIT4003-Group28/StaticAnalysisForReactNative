package defpackage;
/* compiled from: PG */
/* renamed from: csnn  reason: default package */
/* loaded from: classes5.dex */
public final class csnn extends csnu {
    public Boolean a;
    public int b;

    @Override // defpackage.csnu
    public final csnv a() {
        String str = this.a == null ? " forceRefreshCache" : "";
        if (!str.isEmpty()) {
            throw new IllegalStateException(str.length() != 0 ? "Missing required properties:".concat(str) : new String("Missing required properties:"));
        }
        return new csno(this.a.booleanValue(), this.b);
    }
}
