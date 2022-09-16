package defpackage;
/* compiled from: PG */
/* renamed from: csdm  reason: default package */
/* loaded from: classes5.dex */
public final class csdm extends csdo {
    public Long a;
    public Long b;
    public Long c;
    public Long d;
    public Long e;
    private Integer f;
    private dcdg<String, String> g;
    private dcdn<String, String> h;
    private Boolean i;

    @Override // defpackage.csdo
    public final dcdg<String, String> a() {
        if (this.g == null) {
            this.g = dcdn.p();
        }
        return this.g;
    }

    @Override // defpackage.csdo
    public final csdp b() {
        dcdg<String, String> dcdgVar = this.g;
        if (dcdgVar != null) {
            this.h = dcdgVar.b();
        } else if (this.h == null) {
            this.h = dcmn.a;
        }
        String str = this.f == null ? " measurementType" : "";
        if (this.i == null) {
            str = str.concat(" noConnectivity");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new csdn(this.a, this.b, this.c, this.d, this.e, this.f.intValue(), this.h, this.i.booleanValue());
    }

    @Override // defpackage.csdo
    public final void c(int i) {
        this.f = Integer.valueOf(i);
    }

    @Override // defpackage.csdo
    public final void d(boolean z) {
        this.i = Boolean.valueOf(z);
    }
}
