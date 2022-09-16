package defpackage;
/* compiled from: PG */
/* renamed from: uzg  reason: default package */
/* loaded from: classes4.dex */
public final class uzg implements uum {
    public final boolean a;
    public final ampq b;
    private final int c;

    public uzg() {
    }

    public uzg(int i, boolean z, ampq ampqVar) {
        this.c = i;
        this.a = z;
        this.b = ampqVar;
    }

    public static final uzf c() {
        uzf uzfVar = new uzf(null);
        uzfVar.a = false;
        uzfVar.b = amon.a;
        uzfVar.c = 1;
        return uzfVar;
    }

    @Override // defpackage.uum
    public final /* synthetic */ int a() {
        return Integer.MAX_VALUE;
    }

    @Override // defpackage.uum
    public final int b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof uzg)) {
            return false;
        }
        uzg uzgVar = (uzg) obj;
        int i = this.c;
        int i2 = uzgVar.c;
        if (i == 0) {
            throw null;
        }
        return i == i2 && this.a == uzgVar.a && this.b.equals(uzgVar.b);
    }

    public final int hashCode() {
        int i = this.c;
        uun.b(i);
        return ((((i ^ 1000003) * 1000003) ^ (true != this.a ? 1237 : 1231)) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        String a = uun.a(this.c);
        boolean z = this.a;
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(a.length() + 80 + String.valueOf(valueOf).length());
        sb.append("StorageConfigurations{enablement=");
        sb.append(a);
        sb.append(", manualCapture=");
        sb.append(z);
        sb.append(", dirStatsConfigurations=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
