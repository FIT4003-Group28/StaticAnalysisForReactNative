package defpackage;

import android.net.Uri;
/* compiled from: PG */
/* renamed from: bztf  reason: default package */
/* loaded from: classes4.dex */
final class bztf extends bztl {
    private final Uri a;
    private final eaol b;
    private final akqq c;
    private final boolean d;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final dcdc<bztk> i;

    public bztf(Uri uri, eaol eaolVar, @dzsi akqq akqqVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, dcdc<bztk> dcdcVar) {
        this.a = uri;
        this.b = eaolVar;
        this.c = akqqVar;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = z5;
        this.i = dcdcVar;
    }

    @Override // defpackage.bztl
    public final Uri a() {
        return this.a;
    }

    @Override // defpackage.bztl
    public final eaol b() {
        return this.b;
    }

    @Override // defpackage.bztl
    @dzsi
    public final akqq c() {
        return this.c;
    }

    @Override // defpackage.bztl
    public final boolean d() {
        return this.d;
    }

    @Override // defpackage.bztl
    public final boolean e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        akqq akqqVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof bztl) {
            bztl bztlVar = (bztl) obj;
            if (this.a.equals(bztlVar.a()) && this.b.equals(bztlVar.b()) && ((akqqVar = this.c) != null ? akqqVar.equals(bztlVar.c()) : bztlVar.c() == null) && this.d == bztlVar.d() && this.e == bztlVar.e() && this.f == bztlVar.f() && this.g == bztlVar.g() && this.h == bztlVar.h() && dchl.m(this.i, bztlVar.i())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.bztl
    public final boolean f() {
        return this.f;
    }

    @Override // defpackage.bztl
    public final boolean g() {
        return this.g;
    }

    @Override // defpackage.bztl
    public final boolean h() {
        return this.h;
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        akqq akqqVar = this.c;
        int i = 1237;
        int hashCode2 = (((((((((hashCode ^ (akqqVar == null ? 0 : akqqVar.hashCode())) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ (true != this.g ? 1237 : 1231)) * 1000003;
        if (true == this.h) {
            i = 1231;
        }
        return ((hashCode2 ^ i) * 1000003) ^ this.i.hashCode();
    }

    @Override // defpackage.bztl
    public final dcdc<bztk> i() {
        return this.i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        boolean z = this.d;
        boolean z2 = this.e;
        boolean z3 = this.f;
        boolean z4 = this.g;
        boolean z5 = this.h;
        String valueOf4 = String.valueOf(this.i);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 211 + length2 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("PhotoData{photoUri=");
        sb.append(valueOf);
        sb.append(", photoTakenTime=");
        sb.append(valueOf2);
        sb.append(", latlng=");
        sb.append(valueOf3);
        sb.append(", isValidForPhotoTakenNotification=");
        sb.append(z);
        sb.append(", wasShownInPhotoTakenNotification=");
        sb.append(z2);
        sb.append(", wasUploaded=");
        sb.append(z3);
        sb.append(", isFaceDetected=");
        sb.append(z4);
        sb.append(", wasDismissedInTodoList=");
        sb.append(z5);
        sb.append(", imageLabels=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }
}
