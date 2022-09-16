package defpackage;
/* compiled from: PG */
/* renamed from: tip  reason: default package */
/* loaded from: classes4.dex */
public final class tip {
    public Long a;
    public Long b;
    public Boolean c;
    private Integer d;
    private amum e;
    private amup f;

    public final tiq a() {
        amum amumVar = this.e;
        if (amumVar != null) {
            this.f = amumVar.b();
        } else if (this.f == null) {
            this.f = amyc.b;
        }
        Integer num = this.d;
        if (num == null || this.c == null) {
            StringBuilder sb = new StringBuilder();
            if (this.d == null) {
                sb.append(" measurementType");
            }
            if (this.c == null) {
                sb.append(" noConnectivity");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        tiq tiqVar = new tiq(this.a, this.b, num.intValue(), this.f, this.c.booleanValue());
        boolean z = false;
        aqxo.z((tiqVar.b != null) == (tiqVar.a != null), "downloadBytes and downloadMicros must be set together");
        aqxo.z(true, "uploadBytes and uploadMicros must be set together");
        if (tiqVar.e) {
            aqxo.z(true, "latencyMicros can't be set if noConnectivity is true");
            aqxo.z(tiqVar.a == null, "downloadMicros can't be set if noConnectivity is true");
            if (tiqVar.b == null) {
                z = true;
            }
            aqxo.z(z, "downloadBytes can't be set if noConnectivity is true");
            aqxo.z(true, "uploadMicros can't be set if noConnectivity is true");
            aqxo.z(true, "uploadBytes can't be set if noConnectivity is true");
        }
        return tiqVar;
    }

    public final void b(String str, String str2) {
        if (this.e == null) {
            this.e = amup.h();
        }
        this.e.f(str, str2);
    }

    public final void c(int i) {
        this.d = Integer.valueOf(i);
    }
}
