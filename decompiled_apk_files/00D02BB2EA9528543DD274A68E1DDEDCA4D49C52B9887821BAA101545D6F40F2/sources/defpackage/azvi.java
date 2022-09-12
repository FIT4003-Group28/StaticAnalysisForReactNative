package defpackage;
/* compiled from: PG */
/* renamed from: azvi  reason: default package */
/* loaded from: classes3.dex */
final class azvi extends azwt {
    public String a;
    public baab b;
    public String c;
    public Boolean d;
    public Boolean e;
    public Boolean f;
    public Long g;
    public String h;
    public String i;

    @Override // defpackage.azwt
    public final baab a() {
        baab baabVar = this.b;
        if (baabVar != null) {
            return baabVar;
        }
        throw new IllegalStateException("Property \"listType\" has not been set");
    }

    @Override // defpackage.azwt
    public final void b(boolean z) {
        this.e = Boolean.valueOf(z);
    }

    @Override // defpackage.azwt
    public final void c(boolean z) {
        this.d = Boolean.valueOf(z);
    }

    @Override // defpackage.azwt
    public final void d(boolean z) {
        this.f = Boolean.valueOf(z);
    }

    @Override // defpackage.azwt
    public final void e(long j) {
        this.g = Long.valueOf(j);
    }
}
