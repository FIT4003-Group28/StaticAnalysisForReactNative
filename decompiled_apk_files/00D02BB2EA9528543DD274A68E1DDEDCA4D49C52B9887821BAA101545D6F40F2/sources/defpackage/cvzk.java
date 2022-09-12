package defpackage;

import java.util.concurrent.ExecutorService;
/* compiled from: PG */
/* renamed from: cvzk  reason: default package */
/* loaded from: classes.dex */
final class cvzk<T> extends cvze<T> {
    public final cvzg<T> a;
    public final cvyw<T> b;
    public final cwdt<T> c;
    public final cwjs<T> d;
    public final cwjw<T> e;
    public final cwdl f;
    public final dbsg<cvzn> g;
    public final cvuu<T> h;
    public final Class<T> i;
    public final ExecutorService j;
    public final cwla k;
    public final cwkn l;
    public final boolean m;
    public final cwfn n;
    public final cskk o;

    public cvzk(cvzg cvzgVar, cwfn cwfnVar, cvyw cvywVar, cwdt cwdtVar, cwjs cwjsVar, cwjw cwjwVar, cwdl cwdlVar, dbsg dbsgVar, cvuu cvuuVar, Class cls, ExecutorService executorService, cskk cskkVar, cwla cwlaVar, cwkn cwknVar, boolean z) {
        this.a = cvzgVar;
        this.n = cwfnVar;
        this.b = cvywVar;
        this.c = cwdtVar;
        this.d = cwjsVar;
        this.e = cwjwVar;
        this.f = cwdlVar;
        this.g = dbsgVar;
        this.h = cvuuVar;
        this.i = cls;
        this.j = executorService;
        this.o = cskkVar;
        this.k = cwlaVar;
        this.l = cwknVar;
        this.m = z;
    }

    @Override // defpackage.cvze
    public final cvzg<T> a() {
        return this.a;
    }

    @Override // defpackage.cvze
    public final cvyw<T> b() {
        return this.b;
    }

    @Override // defpackage.cvze
    public final cwdt<T> c() {
        return this.c;
    }

    @Override // defpackage.cvze
    public final cwjs<T> d() {
        return this.d;
    }

    @Override // defpackage.cvze
    public final cwjw<T> e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        cwjs<T> cwjsVar;
        cskk cskkVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof cvze) {
            cvze cvzeVar = (cvze) obj;
            if (this.a.equals(cvzeVar.a()) && this.n.equals(cvzeVar.o()) && this.b.equals(cvzeVar.b()) && this.c.equals(cvzeVar.c()) && ((cwjsVar = this.d) != null ? cwjsVar.equals(cvzeVar.d()) : cvzeVar.d() == null) && this.e.equals(cvzeVar.e()) && this.f.equals(cvzeVar.f()) && this.g.equals(cvzeVar.g()) && this.h.equals(cvzeVar.h()) && this.i.equals(cvzeVar.i()) && this.j.equals(cvzeVar.j()) && ((cskkVar = this.o) != null ? cskkVar.equals(cvzeVar.p()) : cvzeVar.p() == null) && this.k.equals(cvzeVar.k()) && this.l.equals(cvzeVar.l()) && this.m == cvzeVar.m()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cvze
    public final cwdl f() {
        return this.f;
    }

    @Override // defpackage.cvze
    public final dbsg<cvzn> g() {
        return this.g;
    }

    @Override // defpackage.cvze
    public final cvuu<T> h() {
        return this.h;
    }

    public final int hashCode() {
        int hashCode = (((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.n.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003;
        cwjs<T> cwjsVar = this.d;
        int i = 0;
        int hashCode2 = (((((((((((((hashCode ^ (cwjsVar == null ? 0 : cwjsVar.hashCode())) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003;
        cskk cskkVar = this.o;
        if (cskkVar != null) {
            i = cskkVar.hashCode();
        }
        return ((((((hashCode2 ^ i) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.l.hashCode()) * 1000003) ^ (true != this.m ? 1237 : 1231);
    }

    @Override // defpackage.cvze
    public final Class<T> i() {
        return this.i;
    }

    @Override // defpackage.cvze
    public final ExecutorService j() {
        return this.j;
    }

    @Override // defpackage.cvze
    public final cwla k() {
        return this.k;
    }

    @Override // defpackage.cvze
    public final cwkn l() {
        return this.l;
    }

    @Override // defpackage.cvze
    public final boolean m() {
        return this.m;
    }

    @Override // defpackage.cvze
    public final cvzd<T> n() {
        return new cvzj(this);
    }

    @Override // defpackage.cvze
    public final cwfn o() {
        return this.n;
    }

    @Override // defpackage.cvze
    public final cskk p() {
        return this.o;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.n);
        String valueOf3 = String.valueOf(this.b);
        String valueOf4 = String.valueOf(this.c);
        String valueOf5 = String.valueOf(this.d);
        String valueOf6 = String.valueOf(this.e);
        String valueOf7 = String.valueOf(this.f);
        String valueOf8 = String.valueOf(this.g);
        String valueOf9 = String.valueOf(this.h);
        String valueOf10 = String.valueOf(this.i);
        String valueOf11 = String.valueOf(this.j);
        String valueOf12 = String.valueOf(this.o);
        String valueOf13 = String.valueOf(this.k);
        String valueOf14 = String.valueOf(this.l);
        boolean z = this.m;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        int length5 = String.valueOf(valueOf5).length();
        int length6 = String.valueOf(valueOf6).length();
        int length7 = String.valueOf(valueOf7).length();
        int length8 = String.valueOf(valueOf8).length();
        int length9 = String.valueOf(valueOf9).length();
        int length10 = String.valueOf(valueOf10).length();
        int length11 = String.valueOf(valueOf11).length();
        int length12 = String.valueOf(valueOf12).length();
        StringBuilder sb = new StringBuilder(length + 290 + length2 + length3 + length4 + length5 + length6 + length7 + length8 + length9 + length10 + length11 + length12 + String.valueOf(valueOf13).length() + String.valueOf(valueOf14).length());
        sb.append("AccountMenuManager{accountsModel=");
        sb.append(valueOf);
        sb.append(", accountConverter=");
        sb.append(valueOf2);
        sb.append(", clickListeners=");
        sb.append(valueOf3);
        sb.append(", features=");
        sb.append(valueOf4);
        sb.append(", avatarRetriever=");
        sb.append(valueOf5);
        sb.append(", oneGoogleEventLogger=");
        sb.append(valueOf6);
        sb.append(", configuration=");
        sb.append(valueOf7);
        sb.append(", incognitoModel=");
        sb.append(valueOf8);
        sb.append(", avatarImageLoader=");
        sb.append(valueOf9);
        sb.append(", accountClass=");
        sb.append(valueOf10);
        sb.append(", backgroundExecutor=");
        sb.append(valueOf11);
        sb.append(", vePrimitives=");
        sb.append(valueOf12);
        sb.append(", visualElements=");
        sb.append(valueOf13);
        sb.append(", oneGoogleStreamz=");
        sb.append(valueOf14);
        sb.append(", useNoopStreamzLogger=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
