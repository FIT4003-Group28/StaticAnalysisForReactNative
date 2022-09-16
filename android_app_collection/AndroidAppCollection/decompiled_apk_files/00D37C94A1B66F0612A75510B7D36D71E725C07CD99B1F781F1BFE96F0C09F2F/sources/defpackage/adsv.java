package defpackage;
/* compiled from: PG */
/* renamed from: adsv  reason: default package */
/* loaded from: classes.dex */
public final class adsv {
    public adil a;
    public adip b;
    public adim c;
    public adnb d;
    public String e;
    private Boolean f;

    public adsv() {
    }

    public adsv(adsw adswVar) {
        this.a = adswVar.a;
        this.b = adswVar.b;
        this.c = adswVar.c;
        this.f = Boolean.valueOf(adswVar.d);
        this.d = adswVar.e;
        this.e = adswVar.f;
    }

    public final void b(boolean z) {
        this.f = Boolean.valueOf(z);
    }

    public final adsw a() {
        Boolean bool = this.f;
        if (bool == null || this.d == null || this.e == null) {
            StringBuilder sb = new StringBuilder();
            if (this.f == null) {
                sb.append(" userInitiated");
            }
            if (this.d == null) {
                sb.append(" loungeTokenProvider");
            }
            if (this.e == null) {
                sb.append(" magmaKey");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new adsw(this.a, this.b, this.c, bool.booleanValue(), this.d, this.e);
    }
}
