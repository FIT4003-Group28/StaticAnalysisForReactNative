package defpackage;
/* compiled from: PG */
/* renamed from: avsy  reason: default package */
/* loaded from: classes3.dex */
final class avsy extends avta {
    private final bvrt<dvfg> a;
    private final long b;
    private final String c;
    private final long d;
    private final long e;
    private final int f;
    private final long g;
    private final int h;
    private final int i;
    private final long j;
    private final boolean k;
    private final boolean l;
    private final boolean m;
    private final boolean n;
    private final boolean o;
    private final boolean p;
    private final long q;
    private final dspd r;
    private final int s;
    private final int t;

    public avsy(bvrt<dvfg> bvrtVar, int i, int i2, long j, String str, long j2, long j3, int i3, long j4, int i4, int i5, long j5, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, long j6, @dzsi dspd dspdVar) {
        this.a = bvrtVar;
        this.t = i;
        this.s = i2;
        this.b = j;
        this.c = str;
        this.d = j2;
        this.e = j3;
        this.f = i3;
        this.g = j4;
        this.h = i4;
        this.i = i5;
        this.j = j5;
        this.k = z;
        this.l = z2;
        this.m = z3;
        this.n = z4;
        this.o = z5;
        this.p = z6;
        this.q = j6;
        this.r = dspdVar;
    }

    @Override // defpackage.avta
    public final bvrt<dvfg> a() {
        return this.a;
    }

    @Override // defpackage.avta
    public final long b() {
        return this.b;
    }

    @Override // defpackage.avta
    public final String c() {
        return this.c;
    }

    @Override // defpackage.avta
    public final long d() {
        return this.d;
    }

    @Override // defpackage.avta
    public final long e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        dspd dspdVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof avta) {
            avta avtaVar = (avta) obj;
            if (this.a.equals(avtaVar.a())) {
                int i = this.t;
                int t = avtaVar.t();
                if (i == 0) {
                    throw null;
                }
                if (i == t) {
                    int i2 = this.s;
                    int s = avtaVar.s();
                    if (i2 == 0) {
                        throw null;
                    }
                    if (i2 == s && this.b == avtaVar.b() && this.c.equals(avtaVar.c()) && this.d == avtaVar.d() && this.e == avtaVar.e() && this.f == avtaVar.f() && this.g == avtaVar.g() && this.h == avtaVar.h() && this.i == avtaVar.i() && this.j == avtaVar.j() && this.k == avtaVar.k() && this.l == avtaVar.l() && this.m == avtaVar.m() && this.n == avtaVar.n() && this.o == avtaVar.o() && this.p == avtaVar.p() && this.q == avtaVar.q() && ((dspdVar = this.r) != null ? dspdVar.equals(avtaVar.r()) : avtaVar.r() == null)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.avta
    public final int f() {
        return this.f;
    }

    @Override // defpackage.avta
    public final long g() {
        return this.g;
    }

    @Override // defpackage.avta
    public final int h() {
        return this.h;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        int i = this.t;
        if (i != 0) {
            int i2 = (hashCode ^ i) * 1000003;
            int i3 = this.s;
            if (i3 == 0) {
                throw null;
            }
            long j = this.b;
            int hashCode2 = this.c.hashCode();
            long j2 = this.d;
            long j3 = this.e;
            int i4 = this.f;
            long j4 = this.g;
            int i5 = this.h;
            int i6 = this.i;
            long j5 = this.j;
            int i7 = 1237;
            int i8 = (((((((((((((((((((((((((((((i2 ^ i3) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ hashCode2) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ i4) * 1000003) ^ ((int) ((j4 >>> 32) ^ j4))) * 1000003) ^ i5) * 1000003) ^ i6) * 1000003) ^ ((int) ((j5 >>> 32) ^ j5))) * 1000003) ^ (true != this.k ? 1237 : 1231)) * 1000003) ^ (true != this.l ? 1237 : 1231)) * 1000003) ^ (true != this.m ? 1237 : 1231)) * 1000003) ^ (true != this.n ? 1237 : 1231)) * 1000003) ^ (true != this.o ? 1237 : 1231)) * 1000003;
            if (true == this.p) {
                i7 = 1231;
            }
            long j6 = this.q;
            int i9 = (((i8 ^ i7) * 1000003) ^ ((int) ((j6 >>> 32) ^ j6))) * 1000003;
            dspd dspdVar = this.r;
            return i9 ^ (dspdVar == null ? 0 : dspdVar.hashCode());
        }
        throw null;
    }

    @Override // defpackage.avta
    public final int i() {
        return this.i;
    }

    @Override // defpackage.avta
    public final long j() {
        return this.j;
    }

    @Override // defpackage.avta
    public final boolean k() {
        return this.k;
    }

    @Override // defpackage.avta
    public final boolean l() {
        return this.l;
    }

    @Override // defpackage.avta
    public final boolean m() {
        return this.m;
    }

    @Override // defpackage.avta
    public final boolean n() {
        return this.n;
    }

    @Override // defpackage.avta
    public final boolean o() {
        return this.o;
    }

    @Override // defpackage.avta
    public final boolean p() {
        return this.p;
    }

    @Override // defpackage.avta
    public final long q() {
        return this.q;
    }

    @Override // defpackage.avta
    @dzsi
    public final dspd r() {
        return this.r;
    }

    @Override // defpackage.avta
    public final int s() {
        return this.s;
    }

    @Override // defpackage.avta
    public final int t() {
        return this.t;
    }

    public final String toString() {
        String str;
        String valueOf = String.valueOf(this.a);
        String str2 = "null";
        switch (this.t) {
            case 1:
                str = "TO_BE_DOWNLOADED";
                break;
            case 2:
                str = "DOWNLOADING";
                break;
            case 3:
                str = "COMPLETE";
                break;
            case 4:
                str = "TO_BE_UPDATED";
                break;
            case 5:
                str = "UPDATING";
                break;
            case 6:
                str = "FINALIZING_UPDATING";
                break;
            case 7:
                str = "FAILED";
                break;
            case 8:
                str = "NOT_WANTED";
                break;
            case 9:
                str = "EXPIRED";
                break;
            case 10:
                str = "COMPLETE_BUT_NOT_YET_ACTIVE";
                break;
            case 11:
                str = "FINALIZING_DOWNLOADING";
                break;
            case 12:
                str = "RECOMMENDED";
                break;
            case 13:
                str = "AUTOMATIC";
                break;
            default:
                str = str2;
                break;
        }
        switch (this.s) {
            case 1:
                str2 = "NONE";
                break;
            case 2:
                str2 = "DOWNLOAD_ERROR_INSUFFICIENT_STORAGE_SPACE";
                break;
            case 3:
                str2 = "OTHER";
                break;
            case 4:
                str2 = "UPDATE_CANCELED_BY_USER";
                break;
            case 5:
                str2 = "FAILED_TO_DELETE";
                break;
            case 6:
                str2 = "DISCONNECTED_MIGRATION";
                break;
        }
        long j = this.b;
        String str3 = this.c;
        long j2 = this.d;
        long j3 = this.e;
        int i = this.f;
        long j4 = this.g;
        int i2 = this.h;
        int i3 = this.i;
        long j5 = this.j;
        boolean z = this.k;
        boolean z2 = this.l;
        boolean z3 = this.m;
        boolean z4 = this.n;
        boolean z5 = this.o;
        boolean z6 = this.p;
        long j6 = this.q;
        String valueOf2 = String.valueOf(this.r);
        int length = String.valueOf(valueOf).length();
        int length2 = str.length();
        int length3 = str2.length();
        StringBuilder sb = new StringBuilder(length + 612 + length2 + length3 + String.valueOf(str3).length() + String.valueOf(valueOf2).length());
        sb.append("DatabaseRegion{descriptorInternal=");
        sb.append(valueOf);
        sb.append(", status=");
        sb.append(str);
        sb.append(", failureReason=");
        sb.append(str2);
        sb.append(", expirationTimeMs=");
        sb.append(j);
        sb.append(", name=");
        sb.append(str3);
        sb.append(", estimatedSizeInBytes=");
        sb.append(j2);
        sb.append(", numEstimatedBytesDownloaded=");
        sb.append(j3);
        sb.append(", numFilesDownloaded=");
        sb.append(i);
        sb.append(", numEstimatedBytesProcessed=");
        sb.append(j4);
        sb.append(", numFilesProcessed=");
        sb.append(i2);
        sb.append(", totalNumFiles=");
        sb.append(i3);
        sb.append(", onDiskSizeInBytes=");
        sb.append(j5);
        sb.append(", overrideWifiOnly=");
        sb.append(z);
        sb.append(", expiringSoonNotificationShown=");
        sb.append(z2);
        sb.append(", upcomingTripNotificationShown=");
        sb.append(z3);
        sb.append(", currentTripNotificationShown=");
        sb.append(z4);
        sb.append(", processingFailed=");
        sb.append(z5);
        sb.append(", inProcess=");
        sb.append(z6);
        sb.append(", lastUsedMsSinceEpoch=");
        sb.append(j6);
        sb.append(", regionVersion=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
