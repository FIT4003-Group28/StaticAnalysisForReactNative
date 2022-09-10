package defpackage;

import com.google.android.libraries.social.populous.core.AutocompletionCallbackMetadata;
/* compiled from: PG */
/* renamed from: cytd  reason: default package */
/* loaded from: classes5.dex */
final class cytd extends cyth {
    private final dcdc<cyvs> a;
    private final dbsg<cyts> b;
    private final cydx c;
    private final int d;
    private final int e;
    private final cytq f;
    private final Long g;
    private final boolean h;
    private final Integer i;
    private final AutocompletionCallbackMetadata j;
    private final boolean k;
    private final int l;

    public cytd(dcdc<cyvs> dcdcVar, dbsg<cyts> dbsgVar, @dzsi cydx cydxVar, int i, int i2, cytq cytqVar, @dzsi Long l, boolean z, @dzsi Integer num, int i3, AutocompletionCallbackMetadata autocompletionCallbackMetadata, boolean z2) {
        this.a = dcdcVar;
        this.b = dbsgVar;
        this.c = cydxVar;
        this.d = i;
        this.e = i2;
        this.f = cytqVar;
        this.g = l;
        this.h = z;
        this.i = num;
        this.l = i3;
        this.j = autocompletionCallbackMetadata;
        this.k = z2;
    }

    @Override // defpackage.cyth
    public final dcdc<cyvs> a() {
        return this.a;
    }

    @Override // defpackage.cyth
    public final dbsg<cyts> b() {
        return this.b;
    }

    @Override // defpackage.cyth
    @dzsi
    public final cydx c() {
        return this.c;
    }

    @Override // defpackage.cyth
    public final int d() {
        return this.d;
    }

    @Override // defpackage.cyth
    public final int e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        cydx cydxVar;
        Long l;
        Integer num;
        if (obj == this) {
            return true;
        }
        if (obj instanceof cyth) {
            cyth cythVar = (cyth) obj;
            if (dchl.m(this.a, cythVar.a()) && this.b.equals(cythVar.b()) && ((cydxVar = this.c) != null ? cydxVar.equals(cythVar.c()) : cythVar.c() == null) && this.d == cythVar.d() && this.e == cythVar.e() && this.f.equals(cythVar.f()) && ((l = this.g) != null ? l.equals(cythVar.g()) : cythVar.g() == null) && this.h == cythVar.h() && ((num = this.i) != null ? num.equals(cythVar.i()) : cythVar.i() == null)) {
                int i = this.l;
                int l2 = cythVar.l();
                if (i == 0) {
                    throw null;
                }
                if (i == l2 && this.j.equals(cythVar.j()) && this.k == cythVar.k()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.cyth
    public final cytq f() {
        return this.f;
    }

    @Override // defpackage.cyth
    @dzsi
    public final Long g() {
        return this.g;
    }

    @Override // defpackage.cyth
    public final boolean h() {
        return this.h;
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        cydx cydxVar = this.c;
        int i = 0;
        int hashCode2 = (((((((hashCode ^ (cydxVar == null ? 0 : cydxVar.hashCode())) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ this.f.hashCode()) * 1000003;
        Long l = this.g;
        int i2 = 1237;
        int hashCode3 = (((hashCode2 ^ (l == null ? 0 : l.hashCode())) * 1000003) ^ (true != this.h ? 1237 : 1231)) * 1000003;
        Integer num = this.i;
        if (num != null) {
            i = num.hashCode();
        }
        int a = (((((hashCode3 ^ i) * 1000003) ^ eaxf.a(this.l)) * 1000003) ^ this.j.hashCode()) * 1000003;
        if (true == this.k) {
            i2 = 1231;
        }
        return a ^ i2;
    }

    @Override // defpackage.cyth
    @dzsi
    public final Integer i() {
        return this.i;
    }

    @Override // defpackage.cyth
    public final AutocompletionCallbackMetadata j() {
        return this.j;
    }

    @Override // defpackage.cyth
    public final boolean k() {
        return this.k;
    }

    @Override // defpackage.cyth
    public final int l() {
        return this.l;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        int i = this.d;
        int i2 = this.e;
        String valueOf4 = String.valueOf(this.f);
        String valueOf5 = String.valueOf(this.g);
        boolean z = this.h;
        String valueOf6 = String.valueOf(this.i);
        int i3 = this.l;
        String valueOf7 = String.valueOf(i3 != 0 ? eaxf.b(i3) : "null");
        String valueOf8 = String.valueOf(this.j);
        boolean z2 = this.k;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        int length5 = String.valueOf(valueOf5).length();
        StringBuilder sb = new StringBuilder(length + 248 + length2 + length3 + length4 + length5 + String.valueOf(valueOf6).length() + String.valueOf(valueOf7).length() + String.valueOf(valueOf8).length());
        sb.append("CallbackInfo{results=");
        sb.append(valueOf);
        sb.append(", leanResult=");
        sb.append(valueOf2);
        sb.append(", callbackError=");
        sb.append(valueOf3);
        sb.append(", callbackNumber=");
        sb.append(i);
        sb.append(", positionOffset=");
        sb.append(i2);
        sb.append(", queryState=");
        sb.append(valueOf4);
        sb.append(", cacheLastUpdatedTime=");
        sb.append(valueOf5);
        sb.append(", isLastCallback=");
        sb.append(z);
        sb.append(", topNAffinityVersion=");
        sb.append(valueOf6);
        sb.append(", resultsSourceType=");
        sb.append(valueOf7);
        sb.append(", metadata=");
        sb.append(valueOf8);
        sb.append(", containsPartialResults=");
        sb.append(z2);
        sb.append("}");
        return sb.toString();
    }
}
