package defpackage;
/* compiled from: PG */
/* renamed from: uus  reason: default package */
/* loaded from: classes4.dex */
public final class uus implements uum {
    public final uuq a;
    private final int b;

    public uus() {
    }

    public uus(int i, uuq uuqVar) {
        this.b = i;
        this.a = uuqVar;
    }

    public static final uur c() {
        uur uurVar = new uur();
        uurVar.b = uuq.a;
        uurVar.a = 1;
        return uurVar;
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
        if (!(obj instanceof uus)) {
            return false;
        }
        uus uusVar = (uus) obj;
        int i = this.b;
        int i2 = uusVar.b;
        if (i == 0) {
            throw null;
        }
        return i == i2 && this.a.equals(uusVar.a);
    }

    public final int hashCode() {
        int i = this.b;
        uun.b(i);
        return ((i ^ 1000003) * 1000003) ^ this.a.hashCode();
    }

    public final String toString() {
        String a = uun.a(this.b);
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(a.length() + 60 + String.valueOf(valueOf).length());
        sb.append("BatteryConfigurations{enablement=");
        sb.append(a);
        sb.append(", metricExtensionProvider=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
