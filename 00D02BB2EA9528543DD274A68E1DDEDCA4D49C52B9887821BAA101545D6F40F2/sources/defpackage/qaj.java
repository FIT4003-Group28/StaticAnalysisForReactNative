package defpackage;
/* compiled from: PG */
/* renamed from: qaj  reason: default package */
/* loaded from: classes7.dex */
public final class qaj extends qck {
    public dndr a;
    public akqi b;
    public akqq c;
    public String d;
    private Boolean e;

    @Override // defpackage.qck
    public final void b(boolean z) {
        this.e = Boolean.valueOf(z);
    }

    @Override // defpackage.qck
    public final qcl a() {
        String str = this.e == null ? " useCurrentLocation" : "";
        if (!str.isEmpty()) {
            throw new IllegalStateException(str.length() != 0 ? "Missing required properties:".concat(str) : new String("Missing required properties:"));
        }
        return new qak(this.a, this.b, this.c, this.e.booleanValue(), this.d);
    }
}
