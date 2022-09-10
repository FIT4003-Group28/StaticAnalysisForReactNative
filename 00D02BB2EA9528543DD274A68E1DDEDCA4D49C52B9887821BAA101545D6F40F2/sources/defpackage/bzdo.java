package defpackage;
/* compiled from: PG */
/* renamed from: bzdo  reason: default package */
/* loaded from: classes4.dex */
public final class bzdo extends bzff {
    public final eapd a;
    public final bzdh b;
    public final bzdj c;
    public final String d;
    public final amte e;
    public final int f;
    public final String g;
    private final boolean h;
    private final eapd i;
    private final int j;
    private final String k;
    private final bzdd l;
    private final eaow m;
    private final boolean n;
    private final amub o;
    private final byys p;
    private final int q;
    private final int r;

    public bzdo(boolean z, eapd eapdVar, eapd eapdVar2, int i, bzdh bzdhVar, bzdj bzdjVar, String str, String str2, @dzsi amte amteVar, int i2, int i3, @dzsi String str3, bzdd bzddVar, @dzsi eaow eaowVar, boolean z2, int i4, @dzsi amub amubVar, byys byysVar) {
        this.h = z;
        if (eapdVar != null) {
            this.a = eapdVar;
            if (eapdVar2 != null) {
                this.i = eapdVar2;
                this.j = i;
                if (bzdhVar != null) {
                    this.b = bzdhVar;
                    if (bzdjVar != null) {
                        this.c = bzdjVar;
                        if (str != null) {
                            this.k = str;
                            if (str2 != null) {
                                this.d = str2;
                                this.e = amteVar;
                                this.f = i2;
                                if (i3 != 0) {
                                    this.q = i3;
                                    this.g = str3;
                                    if (bzddVar != null) {
                                        this.l = bzddVar;
                                        this.m = eaowVar;
                                        this.n = z2;
                                        if (i4 != 0) {
                                            this.r = i4;
                                            this.o = amubVar;
                                            if (byysVar != null) {
                                                this.p = byysVar;
                                                return;
                                            }
                                            throw new NullPointerException("Null detectedActivityState");
                                        }
                                        throw new NullPointerException("Null sharingStatus");
                                    }
                                    throw new NullPointerException("Null stopReason");
                                }
                                throw new NullPointerException("Null recordingStatus");
                            }
                            throw new NullPointerException("Null destinationText");
                        }
                        throw new NullPointerException("Null originText");
                    }
                    throw new NullPointerException("Null trackingStatus");
                }
                throw new NullPointerException("Null stageState");
            }
            throw new NullPointerException("Null originalArrivalTime");
        }
        throw new NullPointerException("Null estimatedArrivalTime");
    }

    @Override // defpackage.bzdk
    public final boolean b() {
        return this.h;
    }

    @Override // defpackage.bzdk
    public final eapd d() {
        return this.a;
    }

    @Override // defpackage.bzdk
    public final eapd e() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        amte amteVar;
        String str;
        eaow eaowVar;
        amub amubVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof bzff) {
            bzff bzffVar = (bzff) obj;
            if (this.h == bzffVar.b() && this.a.equals(bzffVar.d()) && this.i.equals(bzffVar.e()) && this.j == bzffVar.f() && this.b.equals(bzffVar.g()) && this.c.equals(bzffVar.h()) && this.k.equals(bzffVar.i()) && this.d.equals(bzffVar.j()) && ((amteVar = this.e) != null ? amteVar.equals(bzffVar.k()) : bzffVar.k() == null) && this.f == bzffVar.m() && this.q == bzffVar.s() && ((str = this.g) != null ? str.equals(bzffVar.n()) : bzffVar.n() == null) && this.l.equals(bzffVar.o()) && ((eaowVar = this.m) != null ? eaowVar.equals(bzffVar.q()) : bzffVar.q() == null) && this.n == bzffVar.r() && this.r == bzffVar.t() && ((amubVar = this.o) != null ? amubVar.equals(bzffVar.u()) : bzffVar.u() == null) && this.p.equals(bzffVar.v())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.bzdk
    public final int f() {
        return this.j;
    }

    @Override // defpackage.bzdk
    public final bzdh g() {
        return this.b;
    }

    @Override // defpackage.bzdk
    public final bzdj h() {
        return this.c;
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = ((((((((((((((((true != this.h ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        amte amteVar = this.e;
        int i2 = 0;
        int hashCode2 = (((((hashCode ^ (amteVar == null ? 0 : amteVar.hashCode())) * 1000003) ^ this.f) * 1000003) ^ this.q) * 1000003;
        String str = this.g;
        int hashCode3 = (((hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.l.hashCode()) * 1000003;
        eaow eaowVar = this.m;
        int hashCode4 = (hashCode3 ^ (eaowVar == null ? 0 : eaowVar.hashCode())) * 1000003;
        if (true == this.n) {
            i = 1231;
        }
        int i3 = (((hashCode4 ^ i) * 1000003) ^ this.r) * 1000003;
        amub amubVar = this.o;
        if (amubVar != null) {
            i2 = amubVar.hashCode();
        }
        return ((i3 ^ i2) * 1000003) ^ this.p.hashCode();
    }

    @Override // defpackage.bzdk
    public final String i() {
        return this.k;
    }

    @Override // defpackage.bzdk
    public final String j() {
        return this.d;
    }

    @Override // defpackage.bzdk
    @dzsi
    public final amte k() {
        return this.e;
    }

    @Override // defpackage.bzdk
    public final int m() {
        return this.f;
    }

    @Override // defpackage.bzdk
    @dzsi
    public final String n() {
        return this.g;
    }

    @Override // defpackage.bzdk
    public final bzdd o() {
        return this.l;
    }

    @Override // defpackage.bzdk
    @dzsi
    public final eaow q() {
        return this.m;
    }

    @Override // defpackage.bzdk
    public final boolean r() {
        return this.n;
    }

    @Override // defpackage.bzdk
    public final int s() {
        return this.q;
    }

    @Override // defpackage.bzdk
    public final int t() {
        return this.r;
    }

    public final String toString() {
        boolean z = this.h;
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.i);
        int i = this.j;
        String valueOf3 = String.valueOf(this.b);
        String valueOf4 = String.valueOf(this.c);
        String str = this.k;
        String str2 = this.d;
        String valueOf5 = String.valueOf(this.e);
        int i2 = this.f;
        int i3 = this.q;
        String str3 = i3 != 1 ? i3 != 2 ? "FINISHED" : "RECORDING" : "NOT_STARTED";
        String str4 = this.g;
        String valueOf6 = String.valueOf(this.l);
        String valueOf7 = String.valueOf(this.m);
        boolean z2 = this.n;
        String a = bzdi.a(this.r);
        String valueOf8 = String.valueOf(this.o);
        String valueOf9 = String.valueOf(this.p);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        int length5 = str.length();
        int length6 = str2.length();
        int length7 = String.valueOf(valueOf5).length();
        int length8 = str3.length();
        int length9 = String.valueOf(str4).length();
        int length10 = String.valueOf(valueOf6).length();
        StringBuilder sb = new StringBuilder(length + 367 + length2 + length3 + length4 + length5 + length6 + length7 + length8 + length9 + length10 + String.valueOf(valueOf7).length() + a.length() + String.valueOf(valueOf8).length() + String.valueOf(valueOf9).length());
        sb.append("StateValueImpl{guidedOrFreeNavRunning=");
        sb.append(z);
        sb.append(", estimatedArrivalTime=");
        sb.append(valueOf);
        sb.append(", originalArrivalTime=");
        sb.append(valueOf2);
        sb.append(", totalDistanceMeters=");
        sb.append(i);
        sb.append(", stageState=");
        sb.append(valueOf3);
        sb.append(", trackingStatus=");
        sb.append(valueOf4);
        sb.append(", originText=");
        sb.append(str);
        sb.append(", destinationText=");
        sb.append(str2);
        sb.append(", directionsStorageItem=");
        sb.append(valueOf5);
        sb.append(", tripIndex=");
        sb.append(i2);
        sb.append(", recordingStatus=");
        sb.append(str3);
        sb.append(", eventTrackFile=");
        sb.append(str4);
        sb.append(", stopReason=");
        sb.append(valueOf6);
        sb.append(", lostGpsDuration=");
        sb.append(valueOf7);
        sb.append(", voiceGuidanceOn=");
        sb.append(z2);
        sb.append(", sharingStatus=");
        sb.append(a);
        sb.append(", route=");
        sb.append(valueOf8);
        sb.append(", detectedActivityState=");
        sb.append(valueOf9);
        sb.append("}");
        return sb.toString();
    }

    @Override // defpackage.bzff
    @dzsi
    public final amub u() {
        return this.o;
    }

    @Override // defpackage.bzff
    public final byys v() {
        return this.p;
    }
}
