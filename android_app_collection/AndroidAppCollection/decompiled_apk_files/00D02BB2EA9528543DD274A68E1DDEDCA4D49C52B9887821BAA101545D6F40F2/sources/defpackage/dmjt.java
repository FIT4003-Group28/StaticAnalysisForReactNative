package defpackage;
/* compiled from: PG */
/* renamed from: dmjt  reason: default package */
/* loaded from: classes6.dex */
public final class dmjt extends dmkc {
    public final int a;
    public final int b;
    public final dqgu c;
    public final dmjz d;
    private final int e;
    private final int f;

    public dmjt(int i, int i2, int i3, int i4, dqgu dqguVar, dmjz dmjzVar) {
        this.a = i;
        this.b = i2;
        this.e = i3;
        this.f = i4;
        this.c = dqguVar;
        this.d = dmjzVar;
    }

    @Override // defpackage.dmkc
    public final int a() {
        return this.a;
    }

    @Override // defpackage.dmkc
    public final int b() {
        return this.b;
    }

    @Override // defpackage.dmkc
    public final int c() {
        return this.e;
    }

    @Override // defpackage.dmkc
    public final int d() {
        return this.f;
    }

    @Override // defpackage.dmkc
    public final dqgu e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dmkc) {
            dmkc dmkcVar = (dmkc) obj;
            if (this.a == dmkcVar.a() && this.b == dmkcVar.b() && this.e == dmkcVar.c() && this.f == dmkcVar.d() && this.c.equals(dmkcVar.e()) && this.d.equals(dmkcVar.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dmkc
    public final dmjz f() {
        return this.d;
    }

    public final int hashCode() {
        int i = (((((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.e) * 1000003) ^ this.f) * 1000003;
        dqgu dqguVar = this.c;
        int i2 = dqguVar.bC;
        if (i2 == 0) {
            i2 = dsst.a.b(dqguVar).c(dqguVar);
            dqguVar.bC = i2;
        }
        return ((i ^ i2) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        int i3 = this.e;
        int i4 = this.f;
        String valueOf = String.valueOf(this.c);
        String valueOf2 = String.valueOf(this.d);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 185 + String.valueOf(valueOf2).length());
        sb.append("Options{maxWifiObservations=");
        sb.append(i);
        sb.append(", maxValidWifiObservations=");
        sb.append(i2);
        sb.append(", maxBluetoothObservations=");
        sb.append(i3);
        sb.append(", maxValidBluetoothObservations=");
        sb.append(i4);
        sb.append(", scanParameters=");
        sb.append(valueOf);
        sb.append(", client=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
