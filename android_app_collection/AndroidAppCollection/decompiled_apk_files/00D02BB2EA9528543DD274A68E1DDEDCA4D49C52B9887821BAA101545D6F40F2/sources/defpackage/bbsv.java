package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bbsv  reason: default package */
/* loaded from: classes3.dex */
public final class bbsv extends bbve {
    public final bbvd a;
    public final bbvb b;
    public final bbuy c;
    public final dwyd d;
    public final String e;
    public final ilo f;
    public final dcdc<bbtm> g;
    public final dcdc<bbtm> h;
    public final boolean i;
    public final boolean j;
    public final dbsg<Integer> k;

    public bbsv(@dzsi bbvd bbvdVar, bbvb bbvbVar, bbuy bbuyVar, dwyd dwydVar, String str, @dzsi ilo iloVar, dcdc<bbtm> dcdcVar, dcdc<bbtm> dcdcVar2, boolean z, boolean z2, dbsg<Integer> dbsgVar) {
        this.a = bbvdVar;
        this.b = bbvbVar;
        this.c = bbuyVar;
        this.d = dwydVar;
        this.e = str;
        this.f = iloVar;
        this.g = dcdcVar;
        this.h = dcdcVar2;
        this.i = z;
        this.j = z2;
        this.k = dbsgVar;
    }

    @Override // defpackage.bbve
    @dzsi
    public final bbvd a() {
        return this.a;
    }

    @Override // defpackage.bbve
    public final bbvb b() {
        return this.b;
    }

    @Override // defpackage.bbve
    public final bbuy c() {
        return this.c;
    }

    @Override // defpackage.bbve
    public final dwyd d() {
        return this.d;
    }

    @Override // defpackage.bbve
    public final String e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        ilo iloVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof bbve) {
            bbve bbveVar = (bbve) obj;
            bbvd bbvdVar = this.a;
            if (bbvdVar != null ? bbvdVar.equals(bbveVar.a()) : bbveVar.a() == null) {
                if (this.b.equals(bbveVar.b()) && this.c.equals(bbveVar.c()) && this.d.equals(bbveVar.d()) && this.e.equals(bbveVar.e()) && ((iloVar = this.f) != null ? iloVar.equals(bbveVar.f()) : bbveVar.f() == null) && dchl.m(this.g, bbveVar.g()) && dchl.m(this.h, bbveVar.h()) && this.i == bbveVar.i() && this.j == bbveVar.j() && this.k.equals(bbveVar.k())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.bbve
    @dzsi
    public final ilo f() {
        return this.f;
    }

    @Override // defpackage.bbve
    public final dcdc<bbtm> g() {
        return this.g;
    }

    @Override // defpackage.bbve
    public final dcdc<bbtm> h() {
        return this.h;
    }

    public final int hashCode() {
        bbvd bbvdVar = this.a;
        int i = 0;
        int hashCode = ((((((((((bbvdVar == null ? 0 : bbvdVar.hashCode()) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003;
        ilo iloVar = this.f;
        if (iloVar != null) {
            i = iloVar.hashCode();
        }
        int i2 = 1237;
        int hashCode2 = (((((((hashCode ^ i) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ (true != this.i ? 1237 : 1231)) * 1000003;
        if (true == this.j) {
            i2 = 1231;
        }
        return ((hashCode2 ^ i2) * 1000003) ^ this.k.hashCode();
    }

    @Override // defpackage.bbve
    public final boolean i() {
        return this.i;
    }

    @Override // defpackage.bbve
    public final boolean j() {
        return this.j;
    }

    @Override // defpackage.bbve
    public final dbsg<Integer> k() {
        return this.k;
    }

    @Override // defpackage.bbve
    public final bbuz l() {
        return new bbsu(this);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        String str = this.e;
        String valueOf5 = String.valueOf(this.f);
        String valueOf6 = String.valueOf(this.g);
        String valueOf7 = String.valueOf(this.h);
        boolean z = this.i;
        boolean z2 = this.j;
        String valueOf8 = String.valueOf(this.k);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        int length5 = String.valueOf(str).length();
        int length6 = String.valueOf(valueOf5).length();
        int length7 = String.valueOf(valueOf6).length();
        StringBuilder sb = new StringBuilder(length + 266 + length2 + length3 + length4 + length5 + length6 + length7 + String.valueOf(valueOf7).length() + String.valueOf(valueOf8).length());
        sb.append("UnifiedPhotoUploadFlowProperties{placePickerOptions=");
        sb.append(valueOf);
        sb.append(", photoPickerAppearanceOptions=");
        sb.append(valueOf2);
        sb.append(", afterUploadBehavior=");
        sb.append(valueOf3);
        sb.append(", entryPoint=");
        sb.append(valueOf4);
        sb.append(", photosLabel=");
        sb.append(str);
        sb.append(", placemark=");
        sb.append(valueOf5);
        sb.append(", selectedPhotoList=");
        sb.append(valueOf6);
        sb.append(", suggestedPhotoList=");
        sb.append(valueOf7);
        sb.append(", captioningPhotosEnabled=");
        sb.append(z);
        sb.append(", editingPhotosEnabled=");
        sb.append(z2);
        sb.append(", maxSelectionWanted=");
        sb.append(valueOf8);
        sb.append("}");
        return sb.toString();
    }
}
