package defpackage;
/* compiled from: PG */
/* renamed from: aaaj  reason: default package */
/* loaded from: classes2.dex */
public final class aaaj extends aaan {
    public String a;
    public dpuk b;
    public begk c;
    public String d;
    private Boolean e;
    private Boolean f;

    @Override // defpackage.aaan
    public final void b(boolean z) {
        this.f = Boolean.valueOf(z);
    }

    @Override // defpackage.aaan
    public final void c(boolean z) {
        this.e = Boolean.valueOf(z);
    }

    @Override // defpackage.aaan
    public final void d(dpuk dpukVar) {
        this.b = dpukVar;
    }

    @Override // defpackage.aaan
    public final void e(String str) {
        this.a = str;
    }

    @Override // defpackage.aaan
    public final aaao a() {
        String str = this.e == null ? " initiallyExpanded" : "";
        if (this.f == null) {
            str = str.concat(" fromMapClick");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new aaak(this.a, this.b, this.e.booleanValue(), this.f.booleanValue(), this.c, this.d);
    }
}
