package defpackage;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cvkb  reason: default package */
/* loaded from: classes5.dex */
public final class cvkb extends cvkj {
    public final String a;
    public final Long b;
    public final Long c;
    public final dsch d;
    public final List<dscq> e;
    public final Long f;
    public final String g;
    public final dsok h;
    public final String i;
    public final String j;
    public final Long k;
    public final Long l;
    public final dsfr m;
    public final List<cvkg> n;
    public final int o;
    public final int p;
    public final int q;
    public final int r;
    public final int s;

    public cvkb(String str, int i, int i2, int i3, int i4, Long l, Long l2, dsch dschVar, List<dscq> list, Long l3, @dzsi String str2, @dzsi dsok dsokVar, @dzsi String str3, String str4, Long l4, Long l5, int i5, @dzsi dsfr dsfrVar, List<cvkg> list2) {
        this.a = str;
        this.o = i;
        this.p = i2;
        this.q = i3;
        this.r = i4;
        this.b = l;
        this.c = l2;
        this.d = dschVar;
        this.e = list;
        this.f = l3;
        this.g = str2;
        this.h = dsokVar;
        this.i = str3;
        this.j = str4;
        this.k = l4;
        this.l = l5;
        this.s = i5;
        this.m = dsfrVar;
        this.n = list2;
    }

    @Override // defpackage.cvkj
    public final String a() {
        return this.a;
    }

    @Override // defpackage.cvkj
    public final Long b() {
        return this.b;
    }

    @Override // defpackage.cvkj
    public final Long c() {
        return this.c;
    }

    @Override // defpackage.cvkj
    public final dsch d() {
        return this.d;
    }

    @Override // defpackage.cvkj
    public final List<dscq> e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        String str;
        dsok dsokVar;
        String str2;
        dsfr dsfrVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof cvkj) {
            cvkj cvkjVar = (cvkj) obj;
            if (this.a.equals(cvkjVar.a())) {
                int i = this.o;
                int p = cvkjVar.p();
                if (i == 0) {
                    throw null;
                }
                if (i == p) {
                    int i2 = this.p;
                    int q = cvkjVar.q();
                    if (i2 == 0) {
                        throw null;
                    }
                    if (i2 == q) {
                        int i3 = this.q;
                        int r = cvkjVar.r();
                        if (i3 == 0) {
                            throw null;
                        }
                        if (i3 == r) {
                            int i4 = this.r;
                            int s = cvkjVar.s();
                            if (i4 == 0) {
                                throw null;
                            }
                            if (i4 == s && this.b.equals(cvkjVar.b()) && this.c.equals(cvkjVar.c()) && this.d.equals(cvkjVar.d()) && this.e.equals(cvkjVar.e()) && this.f.equals(cvkjVar.f()) && ((str = this.g) != null ? str.equals(cvkjVar.g()) : cvkjVar.g() == null) && ((dsokVar = this.h) != null ? dsokVar.equals(cvkjVar.h()) : cvkjVar.h() == null) && ((str2 = this.i) != null ? str2.equals(cvkjVar.i()) : cvkjVar.i() == null) && this.j.equals(cvkjVar.j()) && this.k.equals(cvkjVar.k()) && this.l.equals(cvkjVar.l())) {
                                int i5 = this.s;
                                int t = cvkjVar.t();
                                if (i5 == 0) {
                                    throw null;
                                }
                                if (i5 == t && ((dsfrVar = this.m) != null ? dsfrVar.equals(cvkjVar.m()) : cvkjVar.m() == null) && this.n.equals(cvkjVar.n())) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.cvkj
    public final Long f() {
        return this.f;
    }

    @Override // defpackage.cvkj
    @dzsi
    public final String g() {
        return this.g;
    }

    @Override // defpackage.cvkj
    @dzsi
    public final dsok h() {
        return this.h;
    }

    public final int hashCode() {
        int i;
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        int i2 = this.o;
        if (i2 != 0) {
            int i3 = (hashCode ^ i2) * 1000003;
            int i4 = this.p;
            if (i4 == 0) {
                throw null;
            }
            int i5 = (i3 ^ i4) * 1000003;
            int i6 = this.q;
            if (i6 == 0) {
                throw null;
            }
            int i7 = (i5 ^ i6) * 1000003;
            int i8 = this.r;
            if (i8 == 0) {
                throw null;
            }
            int hashCode2 = (((((i7 ^ i8) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003;
            dsch dschVar = this.d;
            int i9 = dschVar.bC;
            if (i9 == 0) {
                i9 = dsst.a.b(dschVar).c(dschVar);
                dschVar.bC = i9;
            }
            int hashCode3 = (((((hashCode2 ^ i9) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003;
            String str = this.g;
            int i10 = 0;
            int hashCode4 = (hashCode3 ^ (str == null ? 0 : str.hashCode())) * 1000003;
            dsok dsokVar = this.h;
            if (dsokVar == null) {
                i = 0;
            } else {
                i = dsokVar.bC;
                if (i == 0) {
                    i = dsst.a.b(dsokVar).c(dsokVar);
                    dsokVar.bC = i;
                }
            }
            int i11 = (hashCode4 ^ i) * 1000003;
            String str2 = this.i;
            int hashCode5 = (((((((i11 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.l.hashCode()) * 1000003;
            int i12 = this.s;
            if (i12 == 0) {
                throw null;
            }
            int i13 = (hashCode5 ^ i12) * 1000003;
            dsfr dsfrVar = this.m;
            if (dsfrVar != null && (i10 = dsfrVar.bC) == 0) {
                i10 = dsst.a.b(dsfrVar).c(dsfrVar);
                dsfrVar.bC = i10;
            }
            return ((i13 ^ i10) * 1000003) ^ this.n.hashCode();
        }
        throw null;
    }

    @Override // defpackage.cvkj
    @dzsi
    public final String i() {
        return this.i;
    }

    @Override // defpackage.cvkj
    public final String j() {
        return this.j;
    }

    @Override // defpackage.cvkj
    public final Long k() {
        return this.k;
    }

    @Override // defpackage.cvkj
    public final Long l() {
        return this.l;
    }

    @Override // defpackage.cvkj
    @dzsi
    public final dsfr m() {
        return this.m;
    }

    @Override // defpackage.cvkj
    public final List<cvkg> n() {
        return this.n;
    }

    @Override // defpackage.cvkj
    public final cvka o() {
        return new cvka(this);
    }

    @Override // defpackage.cvkj
    public final int p() {
        return this.o;
    }

    @Override // defpackage.cvkj
    public final int q() {
        return this.p;
    }

    @Override // defpackage.cvkj
    public final int r() {
        return this.q;
    }

    @Override // defpackage.cvkj
    public final int s() {
        return this.r;
    }

    @Override // defpackage.cvkj
    public final int t() {
        return this.s;
    }

    public final String toString() {
        String str = this.a;
        int i = this.o;
        String valueOf = String.valueOf(i != 0 ? Integer.toString(i - 1) : "null");
        int i2 = this.p;
        String valueOf2 = String.valueOf(i2 != 0 ? Integer.toString(i2 - 1) : "null");
        int i3 = this.q;
        String valueOf3 = String.valueOf(i3 != 0 ? Integer.toString(i3 - 1) : "null");
        int i4 = this.r;
        String valueOf4 = String.valueOf(i4 != 0 ? Integer.toString(i4 - 1) : "null");
        String valueOf5 = String.valueOf(this.b);
        String valueOf6 = String.valueOf(this.c);
        String valueOf7 = String.valueOf(this.d);
        String valueOf8 = String.valueOf(this.e);
        String valueOf9 = String.valueOf(this.f);
        String str2 = this.g;
        String valueOf10 = String.valueOf(this.h);
        String str3 = this.i;
        String str4 = this.j;
        String valueOf11 = String.valueOf(this.k);
        String valueOf12 = String.valueOf(this.l);
        int i5 = this.s;
        String valueOf13 = String.valueOf(i5 != 0 ? Integer.toString(i5 - 1) : "null");
        String valueOf14 = String.valueOf(this.m);
        String valueOf15 = String.valueOf(this.n);
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(valueOf).length();
        int length3 = String.valueOf(valueOf2).length();
        int length4 = String.valueOf(valueOf3).length();
        int length5 = String.valueOf(valueOf4).length();
        int length6 = String.valueOf(valueOf5).length();
        int length7 = String.valueOf(valueOf6).length();
        int length8 = String.valueOf(valueOf7).length();
        int length9 = String.valueOf(valueOf8).length();
        int length10 = String.valueOf(valueOf9).length();
        int length11 = String.valueOf(str2).length();
        int length12 = String.valueOf(valueOf10).length();
        int length13 = String.valueOf(str3).length();
        int length14 = String.valueOf(str4).length();
        int length15 = String.valueOf(valueOf11).length();
        int length16 = String.valueOf(valueOf12).length();
        StringBuilder sb = new StringBuilder(length + 330 + length2 + length3 + length4 + length5 + length6 + length7 + length8 + length9 + length10 + length11 + length12 + length13 + length14 + length15 + length16 + String.valueOf(valueOf13).length() + String.valueOf(valueOf14).length() + String.valueOf(valueOf15).length());
        sb.append("ChimeThread{id=");
        sb.append(str);
        sb.append(", readState=");
        sb.append(valueOf);
        sb.append(", deletionStatus=");
        sb.append(valueOf2);
        sb.append(", countBehavior=");
        sb.append(valueOf3);
        sb.append(", systemTrayBehavior=");
        sb.append(valueOf4);
        sb.append(", lastUpdatedVersion=");
        sb.append(valueOf5);
        sb.append(", lastNotificationVersion=");
        sb.append(valueOf6);
        sb.append(", androidSdkMessage=");
        sb.append(valueOf7);
        sb.append(", notificationMetadataList=");
        sb.append(valueOf8);
        sb.append(", creationId=");
        sb.append(valueOf9);
        sb.append(", payloadType=");
        sb.append(str2);
        sb.append(", payload=");
        sb.append(valueOf10);
        sb.append(", updateThreadStateToken=");
        sb.append(str3);
        sb.append(", groupId=");
        sb.append(str4);
        sb.append(", expirationTimestampUsec=");
        sb.append(valueOf11);
        sb.append(", insertionTimeMs=");
        sb.append(valueOf12);
        sb.append(", storageMode=");
        sb.append(valueOf13);
        sb.append(", schedule=");
        sb.append(valueOf14);
        sb.append(", actionList=");
        sb.append(valueOf15);
        sb.append("}");
        return sb.toString();
    }
}
