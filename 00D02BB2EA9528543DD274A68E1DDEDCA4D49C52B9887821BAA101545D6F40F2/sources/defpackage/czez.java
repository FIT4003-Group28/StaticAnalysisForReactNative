package defpackage;

import com.google.android.libraries.social.populous.core.AffinityContext;
import com.google.android.libraries.social.populous.core.InAppNotificationTarget;
import java.util.UUID;
/* compiled from: PG */
/* renamed from: czez  reason: default package */
/* loaded from: classes5.dex */
final class czez extends czdx {
    private final AffinityContext b;
    private final dcdc<cyxj> c;
    private final dcdc<cywi> d;
    private final dcet<String, InAppNotificationTarget> e;
    private final long f;
    private final long g;
    private final long h;
    private final cyes i;
    private final boolean j;
    private final dcdn<cygg, cywi> k;
    private final dcdn<String, cywi> l;
    private final boolean m;
    private final UUID n;
    private final int o;

    public czez(AffinityContext affinityContext, dcdc<cyxj> dcdcVar, dcdc<cywi> dcdcVar2, dcet<String, InAppNotificationTarget> dcetVar, long j, int i, long j2, long j3, cyes cyesVar, boolean z, dcdn<cygg, cywi> dcdnVar, dcdn<String, cywi> dcdnVar2, boolean z2, @dzsi UUID uuid) {
        this.b = affinityContext;
        this.c = dcdcVar;
        this.d = dcdcVar2;
        this.e = dcetVar;
        this.f = j;
        this.o = i;
        this.g = j2;
        this.h = j3;
        this.i = cyesVar;
        this.j = z;
        this.k = dcdnVar;
        this.l = dcdnVar2;
        this.m = z2;
        this.n = uuid;
    }

    @Override // defpackage.czdx
    public final AffinityContext a() {
        return this.b;
    }

    @Override // defpackage.czdx
    public final dcdc<cyxj> b() {
        return this.c;
    }

    @Override // defpackage.czdx
    public final dcdc<cywi> c() {
        return this.d;
    }

    @Override // defpackage.czdx
    public final dcet<String, InAppNotificationTarget> d() {
        return this.e;
    }

    @Override // defpackage.czdx
    public final long e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        UUID uuid;
        if (obj == this) {
            return true;
        }
        if (obj instanceof czdx) {
            czdx czdxVar = (czdx) obj;
            if (this.b.equals(czdxVar.a()) && dchl.m(this.c, czdxVar.b()) && dchl.m(this.d, czdxVar.c()) && dckz.f(this.e, czdxVar.d()) && this.f == czdxVar.e()) {
                int i = this.o;
                int u = czdxVar.u();
                if (i == 0) {
                    throw null;
                }
                if (i == u && this.g == czdxVar.f() && this.h == czdxVar.g() && this.i.equals(czdxVar.h()) && this.j == czdxVar.i() && this.k.equals(czdxVar.j()) && this.l.equals(czdxVar.k()) && this.m == czdxVar.l() && ((uuid = this.n) != null ? uuid.equals(czdxVar.m()) : czdxVar.m() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.czdx
    public final long f() {
        return this.g;
    }

    @Override // defpackage.czdx
    public final long g() {
        return this.h;
    }

    @Override // defpackage.czdx
    public final cyes h() {
        return this.i;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        int hashCode3 = this.d.hashCode();
        int hashCode4 = this.e.hashCode();
        long j = this.f;
        int i = (((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ hashCode4) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003;
        int i2 = this.o;
        if (i2 != 0) {
            long j2 = this.g;
            long j3 = this.h;
            int hashCode5 = (((((((i ^ i2) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ this.i.hashCode()) * 1000003;
            int i3 = 1237;
            int hashCode6 = (((((hashCode5 ^ (true != this.j ? 1237 : 1231)) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.l.hashCode()) * 1000003;
            if (true == this.m) {
                i3 = 1231;
            }
            int i4 = (hashCode6 ^ i3) * 1000003;
            UUID uuid = this.n;
            return i4 ^ (uuid == null ? 0 : uuid.hashCode());
        }
        throw null;
    }

    @Override // defpackage.czdx
    public final boolean i() {
        return this.j;
    }

    @Override // defpackage.czdx
    public final dcdn<cygg, cywi> j() {
        return this.k;
    }

    @Override // defpackage.czdx
    public final dcdn<String, cywi> k() {
        return this.l;
    }

    @Override // defpackage.czdx
    public final boolean l() {
        return this.m;
    }

    @Override // defpackage.czdx
    @dzsi
    public final UUID m() {
        return this.n;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        String valueOf4 = String.valueOf(this.e);
        long j = this.f;
        int i = this.o;
        String str = i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "BIG_CACHE" : "SMALL_CACHE" : "EMPTY_CACHE" : "UNKNOWN";
        long j2 = this.g;
        long j3 = this.h;
        String valueOf5 = String.valueOf(this.i);
        boolean z = this.j;
        String valueOf6 = String.valueOf(this.k);
        String valueOf7 = String.valueOf(this.l);
        boolean z2 = this.m;
        String valueOf8 = String.valueOf(this.n);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + 347 + length2 + length3 + String.valueOf(valueOf4).length() + str.length() + String.valueOf(valueOf5).length() + String.valueOf(valueOf6).length() + String.valueOf(valueOf7).length() + String.valueOf(valueOf8).length());
        sb.append("CachedResponse{affinityContext=");
        sb.append(valueOf);
        sb.append(", scoringParams=");
        sb.append(valueOf2);
        sb.append(", items=");
        sb.append(valueOf3);
        sb.append(", fieldInAppNotificationTargetMap=");
        sb.append(valueOf4);
        sb.append(", lastUpdated=");
        sb.append(j);
        sb.append(", requestType=");
        sb.append(str);
        sb.append(", cacheRefreshWindowMsec=");
        sb.append(j2);
        sb.append(", cacheInvalidateTimeMsec=");
        sb.append(j3);
        sb.append(", dataSourceResponseStatus=");
        sb.append(valueOf5);
        sb.append(", containsPartialResults=");
        sb.append(z);
        sb.append(", personMap=");
        sb.append(valueOf6);
        sb.append(", groupMap=");
        sb.append(valueOf7);
        sb.append(", emptyResponse=");
        sb.append(z2);
        sb.append(", requestBatchId=");
        sb.append(valueOf8);
        sb.append("}");
        return sb.toString();
    }

    @Override // defpackage.czdx
    public final int u() {
        return this.o;
    }
}
