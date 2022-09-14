package defpackage;
/* compiled from: PG */
/* renamed from: cxag  reason: default package */
/* loaded from: classes5.dex */
final class cxag extends cxai {
    private final int a;
    private final boolean b;
    private final dbsg<cxam> c;
    private final int d;

    public cxag(int i, int i2, boolean z, dbsg<cxam> dbsgVar) {
        this.d = i;
        this.a = i2;
        this.b = z;
        this.c = dbsgVar;
    }

    @Override // defpackage.cxai, defpackage.cwuw
    public final int b() {
        return this.d;
    }

    @Override // defpackage.cxai
    public final int c() {
        return this.a;
    }

    @Override // defpackage.cxai
    @dzsi
    public final cxaw d() {
        return null;
    }

    @Override // defpackage.cxai
    public final boolean e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cxai)) {
            return false;
        }
        cxai cxaiVar = (cxai) obj;
        int i = this.d;
        int b = cxaiVar.b();
        if (i == 0) {
            throw null;
        }
        return i == b && this.a == cxaiVar.c() && cxaiVar.d() == null && this.b == cxaiVar.e() && this.c.equals(cxaiVar.f());
    }

    @Override // defpackage.cxai
    public final dbsg<cxam> f() {
        return this.c;
    }

    public final int hashCode() {
        int i = this.d;
        cwux.b(i);
        return ((((((i ^ 1000003) * 1000003) ^ this.a) * (-721379959)) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        String a = cwux.a(this.d);
        int i = this.a;
        boolean z = this.b;
        String valueOf = String.valueOf(this.c);
        int length = a.length();
        StringBuilder sb = new StringBuilder(length + 131 + "null".length() + String.valueOf(valueOf).length());
        sb.append("NetworkConfigurations{enablement=");
        sb.append(a);
        sb.append(", batchSize=");
        sb.append(i);
        sb.append(", urlSanitizer=");
        sb.append("null");
        sb.append(", enableUrlAutoSanitization=");
        sb.append(z);
        sb.append(", metricExtensionProvider=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
