package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: wsv  reason: default package */
/* loaded from: classes7.dex */
public final class wsv extends wtf {
    private final dbsg<Integer> a;
    private final amvh b;
    private final amvh c;
    private final boolean d;
    private final dwao e;
    private final dnqh f;
    private final dnqh g;
    private final ddgg h;
    private final int i;

    public wsv(dbsg<Integer> dbsgVar, amvh amvhVar, @dzsi amvh amvhVar2, boolean z, int i, @dzsi dwao dwaoVar, @dzsi dnqh dnqhVar, @dzsi dnqh dnqhVar2, @dzsi ddgg ddggVar) {
        this.a = dbsgVar;
        if (amvhVar != null) {
            this.b = amvhVar;
            this.c = amvhVar2;
            this.d = z;
            this.i = i;
            this.e = dwaoVar;
            this.f = dnqhVar;
            this.g = dnqhVar2;
            this.h = ddggVar;
            return;
        }
        throw new NullPointerException("Null getWaypoint");
    }

    @Override // defpackage.wtf
    public final dbsg<Integer> a() {
        return this.a;
    }

    @Override // defpackage.wtf
    public final amvh b() {
        return this.b;
    }

    @Override // defpackage.wtf
    @dzsi
    public final amvh c() {
        return this.c;
    }

    @Override // defpackage.wtf
    public final boolean d() {
        return this.d;
    }

    @Override // defpackage.wtf
    @dzsi
    public final dwao e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        amvh amvhVar;
        dwao dwaoVar;
        dnqh dnqhVar;
        dnqh dnqhVar2;
        ddgg ddggVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof wtf) {
            wtf wtfVar = (wtf) obj;
            if (this.a.equals(wtfVar.a()) && this.b.equals(wtfVar.b()) && ((amvhVar = this.c) != null ? amvhVar.equals(wtfVar.c()) : wtfVar.c() == null) && this.d == wtfVar.d() && this.i == wtfVar.i() && ((dwaoVar = this.e) != null ? dwaoVar.equals(wtfVar.e()) : wtfVar.e() == null) && ((dnqhVar = this.f) != null ? dnqhVar.equals(wtfVar.f()) : wtfVar.f() == null) && ((dnqhVar2 = this.g) != null ? dnqhVar2.equals(wtfVar.g()) : wtfVar.g() == null) && ((ddggVar = this.h) != null ? ddggVar.equals(wtfVar.h()) : wtfVar.h() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.wtf
    @dzsi
    public final dnqh f() {
        return this.f;
    }

    @Override // defpackage.wtf
    @dzsi
    public final dnqh g() {
        return this.g;
    }

    @Override // defpackage.wtf
    @dzsi
    public final ddgg h() {
        return this.h;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        amvh amvhVar = this.c;
        int i4 = 0;
        int hashCode2 = (((((hashCode ^ (amvhVar == null ? 0 : amvhVar.hashCode())) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ this.i) * 1000003;
        dwao dwaoVar = this.e;
        if (dwaoVar == null) {
            i = 0;
        } else {
            i = dwaoVar.bC;
            if (i == 0) {
                i = dsst.a.b(dwaoVar).c(dwaoVar);
                dwaoVar.bC = i;
            }
        }
        int i5 = (hashCode2 ^ i) * 1000003;
        dnqh dnqhVar = this.f;
        if (dnqhVar == null) {
            i2 = 0;
        } else {
            i2 = dnqhVar.bC;
            if (i2 == 0) {
                i2 = dsst.a.b(dnqhVar).c(dnqhVar);
                dnqhVar.bC = i2;
            }
        }
        int i6 = (i5 ^ i2) * 1000003;
        dnqh dnqhVar2 = this.g;
        if (dnqhVar2 == null) {
            i3 = 0;
        } else {
            i3 = dnqhVar2.bC;
            if (i3 == 0) {
                i3 = dsst.a.b(dnqhVar2).c(dnqhVar2);
                dnqhVar2.bC = i3;
            }
        }
        int i7 = (i6 ^ i3) * 1000003;
        ddgg ddggVar = this.h;
        if (ddggVar != null && (i4 = ddggVar.bC) == 0) {
            i4 = dsst.a.b(ddggVar).c(ddggVar);
            ddggVar.bC = i4;
        }
        return i7 ^ i4;
    }

    @Override // defpackage.wtf
    public final int i() {
        return this.i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        boolean z = this.d;
        int i = this.i;
        String str = i != 1 ? i != 2 ? "ALWAYS_SEARCH" : "SEARCH_IF_AMBIGUOUS" : "NEVER_SEARCH";
        String valueOf4 = String.valueOf(this.e);
        String valueOf5 = String.valueOf(this.f);
        String valueOf6 = String.valueOf(this.g);
        String valueOf7 = String.valueOf(this.h);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = str.length();
        StringBuilder sb = new StringBuilder(length + 207 + length2 + length3 + length4 + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length() + String.valueOf(valueOf6).length() + String.valueOf(valueOf7).length());
        sb.append("WaypointUpdate{getWaypointIndex=");
        sb.append(valueOf);
        sb.append(", getWaypoint=");
        sb.append(valueOf2);
        sb.append(", getParentWaypoint=");
        sb.append(valueOf3);
        sb.append(", hasBeenOfferedRefinement=");
        sb.append(z);
        sb.append(", getSearchBehavior=");
        sb.append(str);
        sb.append(", getOptionsOverride=");
        sb.append(valueOf4);
        sb.append(", getLoggingParams=");
        sb.append(valueOf5);
        sb.append(", getLoggingParamsForSearch=");
        sb.append(valueOf6);
        sb.append(", getSearchboxStats=");
        sb.append(valueOf7);
        sb.append("}");
        return sb.toString();
    }
}
