package defpackage;
/* compiled from: PG */
/* renamed from: dmky  reason: default package */
/* loaded from: classes.dex */
public final class dmky extends dmlb {
    private final dpum a;
    private final Float b;
    private final dpuq c;
    private final Double d;
    private final int e;
    private final int f;
    private final long g;
    private final long h;
    private final long i;

    public dmky(@dzsi dpum dpumVar, @dzsi Float f, @dzsi dpuq dpuqVar, @dzsi Double d, int i, int i2, long j, long j2, long j3) {
        this.a = dpumVar;
        this.b = f;
        this.c = dpuqVar;
        this.d = d;
        this.e = i;
        this.f = i2;
        this.g = j;
        this.h = j2;
        this.i = j3;
    }

    @Override // defpackage.dmlb
    @dzsi
    public final dpum a() {
        return this.a;
    }

    @Override // defpackage.dmlb
    @dzsi
    public final Float b() {
        return this.b;
    }

    @Override // defpackage.dmlb
    @dzsi
    public final dpuq c() {
        return this.c;
    }

    @Override // defpackage.dmlb
    @dzsi
    public final Double d() {
        return this.d;
    }

    @Override // defpackage.dmlb
    public final int e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dmlb) {
            dmlb dmlbVar = (dmlb) obj;
            dpum dpumVar = this.a;
            if (dpumVar != null ? dpumVar.equals(dmlbVar.a()) : dmlbVar.a() == null) {
                Float f = this.b;
                if (f != null ? f.equals(dmlbVar.b()) : dmlbVar.b() == null) {
                    dpuq dpuqVar = this.c;
                    if (dpuqVar != null ? dpuqVar.equals(dmlbVar.c()) : dmlbVar.c() == null) {
                        Double d = this.d;
                        if (d != null ? d.equals(dmlbVar.d()) : dmlbVar.d() == null) {
                            if (this.e == dmlbVar.e() && this.f == dmlbVar.f() && this.g == dmlbVar.g() && this.h == dmlbVar.h() && this.i == dmlbVar.i()) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.dmlb
    public final int f() {
        return this.f;
    }

    @Override // defpackage.dmlb
    public final long g() {
        return this.g;
    }

    @Override // defpackage.dmlb
    public final long h() {
        return this.h;
    }

    @Override // defpackage.dmlb
    public final long i() {
        return this.i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        int i = this.e;
        int i2 = this.f;
        long j = this.g;
        long j2 = this.h;
        long j3 = this.i;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 328 + length2 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("EvalContext{currentLocation=");
        sb.append(valueOf);
        sb.append(", userLocationAccuracy=");
        sb.append(valueOf2);
        sb.append(", currentViewport=");
        sb.append(valueOf3);
        sb.append(", viewportZoom=");
        sb.append(valueOf4);
        sb.append(", currentTimestampSec=");
        sb.append(i);
        sb.append(", receivedTimestampSec=");
        sb.append(i2);
        sb.append(", personalPlacesLastUpdateTimestampSec=");
        sb.append(j);
        sb.append(", placeAliasesLastUpdateTimestampSec=");
        sb.append(j2);
        sb.append(", locationHistoryLastUpdateTimestampSec=");
        sb.append(j3);
        sb.append("}");
        return sb.toString();
    }

    public final int hashCode() {
        int i;
        int i2;
        dpum dpumVar = this.a;
        int i3 = 0;
        if (dpumVar == null) {
            i = 0;
        } else {
            i = dpumVar.bC;
            if (i == 0) {
                i = dsst.a.b(dpumVar).c(dpumVar);
                dpumVar.bC = i;
            }
        }
        int i4 = (i ^ 1000003) * 1000003;
        Float f = this.b;
        int hashCode = (i4 ^ (f == null ? 0 : f.hashCode())) * 1000003;
        dpuq dpuqVar = this.c;
        if (dpuqVar == null) {
            i2 = 0;
        } else {
            i2 = dpuqVar.bC;
            if (i2 == 0) {
                i2 = dsst.a.b(dpuqVar).c(dpuqVar);
                dpuqVar.bC = i2;
            }
        }
        int i5 = (hashCode ^ i2) * 1000003;
        Double d = this.d;
        if (d != null) {
            i3 = d.hashCode();
        }
        int i6 = this.e;
        int i7 = this.f;
        long j = this.g;
        long j2 = this.h;
        long j3 = this.i;
        return ((int) ((j3 >>> 32) ^ j3)) ^ ((((((((((i3 ^ i5) * 1000003) ^ i6) * 1000003) ^ i7) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
    }
}
