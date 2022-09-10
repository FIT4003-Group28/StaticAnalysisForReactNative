package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: auml  reason: default package */
/* loaded from: classes2.dex */
final class auml extends aumo {
    private final int a;
    private final String b;
    private final Intent c;
    private final dplx d;
    private final dbsg<ddcu> e;
    private final dbsg<String> f;
    private final dbsg<cjtd> g;

    public auml(int i, String str, Intent intent, dplx dplxVar, dbsg<ddcu> dbsgVar, dbsg<String> dbsgVar2, dbsg<cjtd> dbsgVar3) {
        this.a = i;
        this.b = str;
        this.c = intent;
        this.d = dplxVar;
        this.e = dbsgVar;
        this.f = dbsgVar2;
        this.g = dbsgVar3;
    }

    @Override // defpackage.aumo
    public final int a() {
        return this.a;
    }

    @Override // defpackage.aumo
    public final String b() {
        return this.b;
    }

    @Override // defpackage.aumo
    public final Intent c() {
        return this.c;
    }

    @Override // defpackage.aumo
    public final dplx d() {
        return this.d;
    }

    @Override // defpackage.aumo
    public final dbsg<ddcu> e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aumo) {
            aumo aumoVar = (aumo) obj;
            if (this.a == aumoVar.a() && this.b.equals(aumoVar.b()) && this.c.equals(aumoVar.c()) && this.d.equals(aumoVar.d()) && this.e.equals(aumoVar.e()) && this.f.equals(aumoVar.f()) && this.g.equals(aumoVar.g())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.aumo
    public final dbsg<String> f() {
        return this.f;
    }

    @Override // defpackage.aumo
    public final dbsg<cjtd> g() {
        return this.g;
    }

    public final int hashCode() {
        int hashCode = (((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003;
        dplx dplxVar = this.d;
        int i = dplxVar.bC;
        if (i == 0) {
            i = dsst.a.b(dplxVar).c(dplxVar);
            dplxVar.bC = i;
        }
        return ((((((hashCode ^ i) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode();
    }

    public final String toString() {
        int i = this.a;
        String str = this.b;
        String valueOf = String.valueOf(this.c);
        String valueOf2 = String.valueOf(this.d);
        String valueOf3 = String.valueOf(this.e);
        String valueOf4 = String.valueOf(this.f);
        String valueOf5 = String.valueOf(this.g);
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(valueOf).length();
        int length3 = String.valueOf(valueOf2).length();
        int length4 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + 130 + length2 + length3 + length4 + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length());
        sb.append("NotificationFeedbackAction{icon=");
        sb.append(i);
        sb.append(", actionText=");
        sb.append(str);
        sb.append(", intent=");
        sb.append(valueOf);
        sb.append(", androidIntent=");
        sb.append(valueOf2);
        sb.append(", geoDataElementType=");
        sb.append(valueOf3);
        sb.append(", ved=");
        sb.append(valueOf4);
        sb.append(", extraLoggingParams=");
        sb.append(valueOf5);
        sb.append("}");
        return sb.toString();
    }
}
