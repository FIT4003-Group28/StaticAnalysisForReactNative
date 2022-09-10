package defpackage;

import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: cuce  reason: default package */
/* loaded from: classes5.dex */
final class cuce extends ctyy {
    private final long a;
    private final ctzb b;
    private final dspd c;
    private final ctyx d;

    public cuce(long j, ctzb ctzbVar, dspd dspdVar, ctyx ctyxVar) {
        this.a = j;
        this.b = ctzbVar;
        this.c = dspdVar;
        this.d = ctyxVar;
    }

    @Override // defpackage.ctyy
    public final long a() {
        return this.a;
    }

    @Override // defpackage.ctyy
    public final ctzb b() {
        return this.b;
    }

    @Override // defpackage.ctyy
    public final dspd c() {
        return this.c;
    }

    @Override // defpackage.ctyy
    public final ctyx d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ctyy) {
            ctyy ctyyVar = (ctyy) obj;
            if (this.a == ctyyVar.a() && this.b.equals(ctyyVar.b()) && this.c.equals(ctyyVar.c()) && this.d.equals(ctyyVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return this.d.hashCode() ^ ((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003);
    }

    public final String toString() {
        long j = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + R.styleable.AppCompatTheme_viewInflaterClass + length2 + String.valueOf(valueOf3).length());
        sb.append("AccountContext{registrationId=");
        sb.append(j);
        sb.append(", accountUsers=");
        sb.append(valueOf);
        sb.append(", serverRegistrationId=");
        sb.append(valueOf2);
        sb.append(", serverRegistrationStatus=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
