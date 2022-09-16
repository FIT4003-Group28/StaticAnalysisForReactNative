package defpackage;
/* compiled from: PG */
/* renamed from: uwe  reason: default package */
/* loaded from: classes4.dex */
public final class uwe implements uum {
    public final float a;
    private final int b;

    public uwe() {
    }

    public uwe(int i, float f) {
        this.b = i;
        this.a = f;
    }

    public static final uwd c() {
        uwd uwdVar = new uwd();
        uwdVar.b(100.0f);
        uwdVar.a = 1;
        return uwdVar;
    }

    @Override // defpackage.uum
    public final /* synthetic */ int a() {
        return Integer.MAX_VALUE;
    }

    @Override // defpackage.uum
    public final int b() {
        return this.b;
    }

    public final boolean d() {
        int i = this.b;
        return i == 3 || i == 1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof uwe)) {
            return false;
        }
        uwe uweVar = (uwe) obj;
        int i = this.b;
        int i2 = uweVar.b;
        if (i == 0) {
            throw null;
        }
        return i == i2 && Float.floatToIntBits(this.a) == Float.floatToIntBits(uweVar.a);
    }

    public final int hashCode() {
        int i = this.b;
        uun.b(i);
        return (((i ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.a)) * 1000003;
    }

    public final String toString() {
        String a = uun.a(this.b);
        float f = this.a;
        StringBuilder sb = new StringBuilder(a.length() + 99 + "null".length());
        sb.append("CrashConfigurations{enablement=");
        sb.append(a);
        sb.append(", startupSamplePercentage=");
        sb.append(f);
        sb.append(", metricExtensionProvider=");
        sb.append("null");
        sb.append("}");
        return sb.toString();
    }
}
