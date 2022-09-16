package defpackage;
/* compiled from: PG */
/* renamed from: uyb  reason: default package */
/* loaded from: classes4.dex */
public final class uyb implements uum {
    public final int a;
    public final uyj b;
    public final boolean c;
    public final ampq d;
    private final int e;

    public uyb() {
    }

    public uyb(int i, int i2, uyj uyjVar, boolean z, ampq ampqVar) {
        this.e = i;
        this.a = i2;
        this.b = uyjVar;
        this.c = z;
        this.d = ampqVar;
    }

    public static final uya c() {
        uya uyaVar = new uya(null);
        uyaVar.b = false;
        uyaVar.b(50);
        uyaVar.c = amon.a;
        uyaVar.d = 1;
        return uyaVar;
    }

    @Override // defpackage.uum
    public final /* synthetic */ int a() {
        return Integer.MAX_VALUE;
    }

    @Override // defpackage.uum
    public final int b() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        uyj uyjVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof uyb)) {
            return false;
        }
        uyb uybVar = (uyb) obj;
        int i = this.e;
        int i2 = uybVar.e;
        if (i == 0) {
            throw null;
        }
        return i == i2 && this.a == uybVar.a && ((uyjVar = this.b) != null ? uyjVar.equals(uybVar.b) : uybVar.b == null) && this.c == uybVar.c && this.d.equals(uybVar.d);
    }

    public final int hashCode() {
        int i = this.e;
        uun.b(i);
        int i2 = (((i ^ 1000003) * 1000003) ^ this.a) * 1000003;
        uyj uyjVar = this.b;
        return ((((i2 ^ (uyjVar == null ? 0 : uyjVar.hashCode())) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        String a = uun.a(this.e);
        int i = this.a;
        String valueOf = String.valueOf(this.b);
        boolean z = this.c;
        String valueOf2 = String.valueOf(this.d);
        int length = a.length();
        StringBuilder sb = new StringBuilder(length + 131 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
        sb.append("NetworkConfigurations{enablement=");
        sb.append(a);
        sb.append(", batchSize=");
        sb.append(i);
        sb.append(", urlSanitizer=");
        sb.append(valueOf);
        sb.append(", enableUrlAutoSanitization=");
        sb.append(z);
        sb.append(", metricExtensionProvider=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
