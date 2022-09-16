package defpackage;
/* compiled from: PG */
/* renamed from: uzt  reason: default package */
/* loaded from: classes4.dex */
public final class uzt implements uum {
    public final float a;
    private final int b;

    public uzt() {
    }

    public uzt(int i, float f) {
        this.b = i;
        this.a = f;
    }

    public static final uzs c() {
        uzs uzsVar = new uzs();
        uzsVar.a = Float.valueOf(0.5f);
        uzsVar.b = 1;
        return uzsVar;
    }

    @Override // defpackage.uum
    public final /* synthetic */ int a() {
        return Integer.MAX_VALUE;
    }

    @Override // defpackage.uum
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof uzt)) {
            return false;
        }
        uzt uztVar = (uzt) obj;
        int i = this.b;
        int i2 = uztVar.b;
        if (i == 0) {
            throw null;
        }
        return i == i2 && Float.floatToIntBits(this.a) == Float.floatToIntBits(uztVar.a);
    }

    public final int hashCode() {
        int i = this.b;
        uun.b(i);
        return ((i ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.a);
    }

    public final String toString() {
        String a = uun.a(this.b);
        float f = this.a;
        StringBuilder sb = new StringBuilder(a.length() + 69);
        sb.append("TraceConfigurations{enablement=");
        sb.append(a);
        sb.append(", samplingProbability=");
        sb.append(f);
        sb.append("}");
        return sb.toString();
    }
}
