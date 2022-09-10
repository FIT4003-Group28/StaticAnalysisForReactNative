package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: vwk  reason: default package */
/* loaded from: classes7.dex */
public final class vwk extends vwn {
    public final boolean a;
    public final bwrs<amte> b;
    public final bwrs<amte> c;
    public final bttq d;
    public final int e;
    public final Integer f;
    public final Integer g;
    public final String h;
    public final String i;
    public final String j;
    public final vwm k;
    public final dcdn<Integer, String> l;
    public final bvrt<vwi> m;

    public vwk(boolean z, bwrs<amte> bwrsVar, bwrs<amte> bwrsVar2, @dzsi bttq bttqVar, int i, @dzsi Integer num, @dzsi Integer num2, @dzsi String str, @dzsi String str2, @dzsi String str3, @dzsi vwm vwmVar, @dzsi dcdn<Integer, String> dcdnVar, bvrt<vwi> bvrtVar) {
        this.a = z;
        this.b = bwrsVar;
        this.c = bwrsVar2;
        this.d = bttqVar;
        this.e = i;
        this.f = num;
        this.g = num2;
        this.h = str;
        this.i = str2;
        this.j = str3;
        this.k = vwmVar;
        this.l = dcdnVar;
        this.m = bvrtVar;
    }

    @Override // defpackage.vwn
    public final boolean a() {
        return this.a;
    }

    @Override // defpackage.vwn
    public final bwrs<amte> b() {
        return this.b;
    }

    @Override // defpackage.vwn
    public final bwrs<amte> c() {
        return this.c;
    }

    @Override // defpackage.vwn
    @dzsi
    public final bttq d() {
        return this.d;
    }

    @Override // defpackage.vwn
    public final int e() {
        return this.e;
    }

    @Override // defpackage.vwn
    @dzsi
    public final Integer f() {
        return this.f;
    }

    @Override // defpackage.vwn
    @dzsi
    public final Integer g() {
        return this.g;
    }

    @Override // defpackage.vwn
    @dzsi
    public final String h() {
        return this.h;
    }

    @Override // defpackage.vwn
    @dzsi
    public final String i() {
        return this.i;
    }

    @Override // defpackage.vwn
    @dzsi
    public final String j() {
        return this.j;
    }

    @Override // defpackage.vwn
    @dzsi
    public final vwm k() {
        return this.k;
    }

    @Override // defpackage.vwn
    @dzsi
    public final dcdn<Integer, String> l() {
        return this.l;
    }

    @Override // defpackage.vwn
    public final bvrt<vwi> m() {
        return this.m;
    }

    @Override // defpackage.vwn
    public final vwl n() {
        return new vwj(this);
    }

    public final String toString() {
        boolean z = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        int i = this.e;
        String valueOf4 = String.valueOf(this.f);
        String valueOf5 = String.valueOf(this.g);
        String str = this.h;
        String str2 = this.i;
        String str3 = this.j;
        String valueOf6 = String.valueOf(this.k);
        String valueOf7 = String.valueOf(this.l);
        String valueOf8 = String.valueOf(this.m);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        int length5 = String.valueOf(valueOf5).length();
        int length6 = String.valueOf(str).length();
        int length7 = String.valueOf(str2).length();
        int length8 = String.valueOf(str3).length();
        int length9 = String.valueOf(valueOf6).length();
        StringBuilder sb = new StringBuilder(length + 323 + length2 + length3 + length4 + length5 + length6 + length7 + length8 + length9 + String.valueOf(valueOf7).length() + String.valueOf(valueOf8).length());
        sb.append("TripCardsState{isLoading=");
        sb.append(z);
        sb.append(", storageItemReference=");
        sb.append(valueOf);
        sb.append(", pendingStorageItemReference=");
        sb.append(valueOf2);
        sb.append(", errorCode=");
        sb.append(valueOf3);
        sb.append(", activeTripIndex=");
        sb.append(i);
        sb.append(", selectedPathIndex=");
        sb.append(valueOf4);
        sb.append(", selectedStepGroupIndex=");
        sb.append(valueOf5);
        sb.append(", vehicleRerouteToken=");
        sb.append(str);
        sb.append(", pickUpStationRerouteToken=");
        sb.append(str2);
        sb.append(", dropOffStationRerouteToken=");
        sb.append(str3);
        sb.append(", dockedStationSelection=");
        sb.append(valueOf6);
        sb.append(", savedTripIds=");
        sb.append(valueOf7);
        sb.append(", transitTripDetailsStateInternal=");
        sb.append(valueOf8);
        sb.append("}");
        return sb.toString();
    }
}
