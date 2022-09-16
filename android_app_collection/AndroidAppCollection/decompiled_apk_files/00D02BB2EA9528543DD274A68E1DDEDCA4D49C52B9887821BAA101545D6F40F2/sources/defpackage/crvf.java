package defpackage;
/* compiled from: PG */
/* renamed from: crvf  reason: default package */
/* loaded from: classes5.dex */
final class crvf extends crvr {
    private final cnjz a;
    private final crxq b;
    private final String c;
    private final crxb d;
    private final dtbh e;
    private final crwb f;
    private final crts g;
    private final dgpw h;
    private final dgpm i;
    private final cruf j;
    private final Integer k;
    private final Integer l;
    private final Integer m;
    private final String n;
    private final Boolean o;
    private final Long p;

    public crvf(cnjz cnjzVar, crxq crxqVar, @dzsi String str, crxb crxbVar, dtbh dtbhVar, @dzsi crwb crwbVar, @dzsi crts crtsVar, @dzsi dgpw dgpwVar, @dzsi dgpm dgpmVar, @dzsi cruf crufVar, @dzsi Integer num, @dzsi Integer num2, @dzsi Integer num3, @dzsi String str2, @dzsi Boolean bool, @dzsi Long l) {
        this.a = cnjzVar;
        this.b = crxqVar;
        this.c = str;
        this.d = crxbVar;
        this.e = dtbhVar;
        this.f = crwbVar;
        this.g = crtsVar;
        this.h = dgpwVar;
        this.i = dgpmVar;
        this.j = crufVar;
        this.k = num;
        this.l = num2;
        this.m = num3;
        this.n = str2;
        this.o = bool;
        this.p = l;
    }

    @Override // defpackage.crvr
    public final cnjz a() {
        return this.a;
    }

    @Override // defpackage.crvr
    public final crxq b() {
        return this.b;
    }

    @Override // defpackage.crvr
    @dzsi
    public final String c() {
        return this.c;
    }

    @Override // defpackage.crvr
    public final crxb d() {
        return this.d;
    }

    @Override // defpackage.crvr
    public final dtbh e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        String str;
        crwb crwbVar;
        crts crtsVar;
        dgpw dgpwVar;
        dgpm dgpmVar;
        cruf crufVar;
        Integer num;
        Integer num2;
        Integer num3;
        String str2;
        Boolean bool;
        Long l;
        if (obj == this) {
            return true;
        }
        if (obj instanceof crvr) {
            crvr crvrVar = (crvr) obj;
            if (this.a.equals(crvrVar.a()) && this.b.equals(crvrVar.b()) && ((str = this.c) != null ? str.equals(crvrVar.c()) : crvrVar.c() == null) && this.d.equals(crvrVar.d()) && this.e.equals(crvrVar.e()) && ((crwbVar = this.f) != null ? crwbVar.equals(crvrVar.f()) : crvrVar.f() == null) && ((crtsVar = this.g) != null ? crtsVar.equals(crvrVar.g()) : crvrVar.g() == null) && ((dgpwVar = this.h) != null ? dgpwVar.equals(crvrVar.h()) : crvrVar.h() == null) && ((dgpmVar = this.i) != null ? dgpmVar.equals(crvrVar.i()) : crvrVar.i() == null) && ((crufVar = this.j) != null ? crufVar.equals(crvrVar.j()) : crvrVar.j() == null) && ((num = this.k) != null ? num.equals(crvrVar.k()) : crvrVar.k() == null) && ((num2 = this.l) != null ? num2.equals(crvrVar.l()) : crvrVar.l() == null) && ((num3 = this.m) != null ? num3.equals(crvrVar.m()) : crvrVar.m() == null) && ((str2 = this.n) != null ? str2.equals(crvrVar.n()) : crvrVar.n() == null) && ((bool = this.o) != null ? bool.equals(crvrVar.o()) : crvrVar.o() == null) && ((l = this.p) != null ? l.equals(crvrVar.p()) : crvrVar.p() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.crvr
    @dzsi
    public final crwb f() {
        return this.f;
    }

    @Override // defpackage.crvr
    @dzsi
    public final crts g() {
        return this.g;
    }

    @Override // defpackage.crvr
    @dzsi
    public final dgpw h() {
        return this.h;
    }

    public final int hashCode() {
        int i;
        int i2;
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str = this.c;
        int i3 = 0;
        int hashCode2 = (((((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003;
        crwb crwbVar = this.f;
        if (crwbVar == null) {
            i = 0;
        } else {
            i = crwbVar.bC;
            if (i == 0) {
                i = dsst.a.b(crwbVar).c(crwbVar);
                crwbVar.bC = i;
            }
        }
        int i4 = (hashCode2 ^ i) * 1000003;
        crts crtsVar = this.g;
        if (crtsVar == null) {
            i2 = 0;
        } else {
            i2 = crtsVar.bC;
            if (i2 == 0) {
                i2 = dsst.a.b(crtsVar).c(crtsVar);
                crtsVar.bC = i2;
            }
        }
        int i5 = (i4 ^ i2) * 1000003;
        dgpw dgpwVar = this.h;
        int hashCode3 = (i5 ^ (dgpwVar == null ? 0 : dgpwVar.hashCode())) * 1000003;
        dgpm dgpmVar = this.i;
        int hashCode4 = (hashCode3 ^ (dgpmVar == null ? 0 : dgpmVar.hashCode())) * 1000003;
        cruf crufVar = this.j;
        int hashCode5 = (hashCode4 ^ (crufVar == null ? 0 : crufVar.hashCode())) * 1000003;
        Integer num = this.k;
        int hashCode6 = (hashCode5 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        Integer num2 = this.l;
        int hashCode7 = (hashCode6 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        Integer num3 = this.m;
        int hashCode8 = (hashCode7 ^ (num3 == null ? 0 : num3.hashCode())) * 1000003;
        String str2 = this.n;
        int hashCode9 = (hashCode8 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        Boolean bool = this.o;
        int hashCode10 = (hashCode9 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        Long l = this.p;
        if (l != null) {
            i3 = l.hashCode();
        }
        return hashCode10 ^ i3;
    }

    @Override // defpackage.crvr
    @dzsi
    public final dgpm i() {
        return this.i;
    }

    @Override // defpackage.crvr
    @dzsi
    public final cruf j() {
        return this.j;
    }

    @Override // defpackage.crvr
    @dzsi
    public final Integer k() {
        return this.k;
    }

    @Override // defpackage.crvr
    @dzsi
    public final Integer l() {
        return this.l;
    }

    @Override // defpackage.crvr
    @dzsi
    public final Integer m() {
        return this.m;
    }

    @Override // defpackage.crvr
    @dzsi
    public final String n() {
        return this.n;
    }

    @Override // defpackage.crvr
    @dzsi
    public final Boolean o() {
        return this.o;
    }

    @Override // defpackage.crvr
    @dzsi
    public final Long p() {
        return this.p;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String str = this.c;
        String valueOf3 = String.valueOf(this.d);
        String valueOf4 = String.valueOf(this.e);
        String valueOf5 = String.valueOf(this.f);
        String valueOf6 = String.valueOf(this.g);
        String valueOf7 = String.valueOf(this.h);
        String valueOf8 = String.valueOf(this.i);
        String valueOf9 = String.valueOf(this.j);
        String valueOf10 = String.valueOf(this.k);
        String valueOf11 = String.valueOf(this.l);
        String valueOf12 = String.valueOf(this.m);
        String str2 = this.n;
        String valueOf13 = String.valueOf(this.o);
        String valueOf14 = String.valueOf(this.p);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(str).length();
        int length4 = String.valueOf(valueOf3).length();
        int length5 = String.valueOf(valueOf4).length();
        int length6 = String.valueOf(valueOf5).length();
        int length7 = String.valueOf(valueOf6).length();
        int length8 = String.valueOf(valueOf7).length();
        int length9 = String.valueOf(valueOf8).length();
        int length10 = String.valueOf(valueOf9).length();
        int length11 = String.valueOf(valueOf10).length();
        int length12 = String.valueOf(valueOf11).length();
        int length13 = String.valueOf(valueOf12).length();
        int length14 = String.valueOf(str2).length();
        StringBuilder sb = new StringBuilder(length + 242 + length2 + length3 + length4 + length5 + length6 + length7 + length8 + length9 + length10 + length11 + length12 + length13 + length14 + String.valueOf(valueOf13).length() + String.valueOf(valueOf14).length());
        sb.append("ClearcutRecord{clearcutLogger=");
        sb.append(valueOf);
        sb.append(", connInfo=");
        sb.append(valueOf2);
        sb.append(", sourceAppVersion=");
        sb.append(str);
        sb.append(", requestInfo=");
        sb.append(valueOf3);
        sb.append(", operation=");
        sb.append(valueOf4);
        sb.append(", gpuConfig=");
        sb.append(valueOf5);
        sb.append(", option=");
        sb.append(valueOf6);
        sb.append(", serverStatus=");
        sb.append(valueOf7);
        sb.append(", clientException=");
        sb.append(valueOf8);
        sb.append(", precheckStatus=");
        sb.append(valueOf9);
        sb.append(", byteSize=");
        sb.append(valueOf10);
        sb.append(", pixelSize=");
        sb.append(valueOf11);
        sb.append(", currentQueueSize=");
        sb.append(valueOf12);
        sb.append(", mimeType=");
        sb.append(str2);
        sb.append(", logGpuConfig=");
        sb.append(valueOf13);
        sb.append(", bytesUploaded=");
        sb.append(valueOf14);
        sb.append("}");
        return sb.toString();
    }
}
