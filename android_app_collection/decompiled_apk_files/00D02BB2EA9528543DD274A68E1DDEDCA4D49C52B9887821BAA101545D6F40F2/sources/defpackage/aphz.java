package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aphz  reason: default package */
/* loaded from: classes2.dex */
public final class aphz extends apiv {
    public dbsg<dvay> a = dbpy.a;
    public dbsg<dvyw> b = dbpy.a;
    private Boolean c;
    private Boolean d;

    @Override // defpackage.apiv
    public final void b(boolean z) {
        this.c = Boolean.valueOf(z);
    }

    @Override // defpackage.apiv
    public final void c(boolean z) {
        this.d = Boolean.valueOf(z);
    }

    @Override // defpackage.apiv
    public final void a() {
        String str = this.c == null ? " isCheckedIn" : "";
        if (this.d == null) {
            str = str.concat(" isFresh");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        } else {
            new apia(this.a, this.b, this.c.booleanValue(), this.d.booleanValue());
        }
    }
}
