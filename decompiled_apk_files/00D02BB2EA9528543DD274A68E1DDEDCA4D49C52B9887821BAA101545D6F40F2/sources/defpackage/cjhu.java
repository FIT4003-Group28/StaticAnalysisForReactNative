package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: cjhu  reason: default package */
/* loaded from: classes4.dex */
final class cjhu extends cjho {
    private final cjtd a;
    private final cjtd b;
    private final cjtd c;
    private final View.OnClickListener d;
    private final cqss e;
    private final Boolean f;
    private final Boolean g;
    private final CharSequence h;
    private final cqss i;
    private final jhp j;
    private final CharSequence k;
    private final View.OnClickListener l;
    private final Boolean m;
    private final dcdc<cjew> n;
    private final dcdc<cjhe> o;

    public cjhu(@dzsi cjtd cjtdVar, @dzsi cjtd cjtdVar2, @dzsi cjtd cjtdVar3, @dzsi View.OnClickListener onClickListener, cqss cqssVar, Boolean bool, Boolean bool2, @dzsi CharSequence charSequence, @dzsi cqss cqssVar2, @dzsi jhp jhpVar, @dzsi CharSequence charSequence2, @dzsi View.OnClickListener onClickListener2, Boolean bool3, dcdc<cjew> dcdcVar, dcdc<cjhe> dcdcVar2) {
        this.a = cjtdVar;
        this.b = cjtdVar2;
        this.c = cjtdVar3;
        this.d = onClickListener;
        this.e = cqssVar;
        this.f = bool;
        this.g = bool2;
        this.h = charSequence;
        this.i = cqssVar2;
        this.j = jhpVar;
        this.k = charSequence2;
        this.l = onClickListener2;
        this.m = bool3;
        this.n = dcdcVar;
        this.o = dcdcVar2;
    }

    @Override // defpackage.cjho, defpackage.cjhh
    @dzsi
    public cjtd a() {
        return this.a;
    }

    @Override // defpackage.cjho, defpackage.cjhh
    @dzsi
    public cjtd b() {
        return this.b;
    }

    @Override // defpackage.cjho, defpackage.cjhh
    @dzsi
    public cjtd c() {
        return this.c;
    }

    @Override // defpackage.cjho, defpackage.cjhh
    @dzsi
    public View.OnClickListener d() {
        return this.d;
    }

    @Override // defpackage.cjho, defpackage.cjhh
    public cqss e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        CharSequence charSequence;
        cqss cqssVar;
        jhp jhpVar;
        CharSequence charSequence2;
        View.OnClickListener onClickListener;
        if (obj == this) {
            return true;
        }
        if (obj instanceof cjho) {
            cjho cjhoVar = (cjho) obj;
            cjtd cjtdVar = this.a;
            if (cjtdVar != null ? cjtdVar.equals(cjhoVar.a()) : cjhoVar.a() == null) {
                cjtd cjtdVar2 = this.b;
                if (cjtdVar2 != null ? cjtdVar2.equals(cjhoVar.b()) : cjhoVar.b() == null) {
                    cjtd cjtdVar3 = this.c;
                    if (cjtdVar3 != null ? cjtdVar3.equals(cjhoVar.c()) : cjhoVar.c() == null) {
                        View.OnClickListener onClickListener2 = this.d;
                        if (onClickListener2 != null ? onClickListener2.equals(cjhoVar.d()) : cjhoVar.d() == null) {
                            if (this.e.equals(cjhoVar.e()) && this.f.equals(cjhoVar.f()) && this.g.equals(cjhoVar.g()) && ((charSequence = this.h) != null ? charSequence.equals(cjhoVar.h()) : cjhoVar.h() == null) && ((cqssVar = this.i) != null ? cqssVar.equals(cjhoVar.i()) : cjhoVar.i() == null) && ((jhpVar = this.j) != null ? jhpVar.equals(cjhoVar.j()) : cjhoVar.j() == null) && ((charSequence2 = this.k) != null ? charSequence2.equals(cjhoVar.k()) : cjhoVar.k() == null) && ((onClickListener = this.l) != null ? onClickListener.equals(cjhoVar.l()) : cjhoVar.l() == null) && this.m.equals(cjhoVar.m()) && dchl.m(this.n, cjhoVar.n()) && dchl.m(this.o, cjhoVar.p())) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.cjho, defpackage.cjhh
    public Boolean f() {
        return this.f;
    }

    @Override // defpackage.cjho, defpackage.cjhh
    public Boolean g() {
        return this.g;
    }

    @Override // defpackage.cjho, defpackage.cjhh
    @dzsi
    public CharSequence h() {
        return this.h;
    }

    public int hashCode() {
        cjtd cjtdVar = this.a;
        int i = 0;
        int hashCode = ((cjtdVar == null ? 0 : cjtdVar.hashCode()) ^ 1000003) * 1000003;
        cjtd cjtdVar2 = this.b;
        int hashCode2 = (hashCode ^ (cjtdVar2 == null ? 0 : cjtdVar2.hashCode())) * 1000003;
        cjtd cjtdVar3 = this.c;
        int hashCode3 = (hashCode2 ^ (cjtdVar3 == null ? 0 : cjtdVar3.hashCode())) * 1000003;
        View.OnClickListener onClickListener = this.d;
        int hashCode4 = (((((((hashCode3 ^ (onClickListener == null ? 0 : onClickListener.hashCode())) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003;
        CharSequence charSequence = this.h;
        int hashCode5 = (hashCode4 ^ (charSequence == null ? 0 : charSequence.hashCode())) * 1000003;
        cqss cqssVar = this.i;
        int hashCode6 = (hashCode5 ^ (cqssVar == null ? 0 : cqssVar.hashCode())) * 1000003;
        jhp jhpVar = this.j;
        int hashCode7 = (hashCode6 ^ (jhpVar == null ? 0 : jhpVar.hashCode())) * 1000003;
        CharSequence charSequence2 = this.k;
        int hashCode8 = (hashCode7 ^ (charSequence2 == null ? 0 : charSequence2.hashCode())) * 1000003;
        View.OnClickListener onClickListener2 = this.l;
        if (onClickListener2 != null) {
            i = onClickListener2.hashCode();
        }
        return ((((((hashCode8 ^ i) * 1000003) ^ this.m.hashCode()) * 1000003) ^ this.n.hashCode()) * 1000003) ^ this.o.hashCode();
    }

    @Override // defpackage.cjho, defpackage.cjhh
    @dzsi
    public cqss i() {
        return this.i;
    }

    @Override // defpackage.cjho, defpackage.cjhh
    @dzsi
    public jhp j() {
        return this.j;
    }

    @Override // defpackage.cjho, defpackage.cjhh
    @dzsi
    public CharSequence k() {
        return this.k;
    }

    @Override // defpackage.cjho, defpackage.cjhh
    @dzsi
    public View.OnClickListener l() {
        return this.l;
    }

    @Override // defpackage.cjho, defpackage.cjhh
    public Boolean m() {
        return this.m;
    }

    @Override // defpackage.cjho, defpackage.cjhh
    public dcdc<cjew> n() {
        return this.n;
    }

    @Override // defpackage.cjho, defpackage.cjhh
    /* renamed from: p */
    public dcdc<cjhe> o() {
        return this.o;
    }

    public String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.e);
        String valueOf6 = String.valueOf(this.f);
        String valueOf7 = String.valueOf(this.g);
        String valueOf8 = String.valueOf(this.h);
        String valueOf9 = String.valueOf(this.i);
        String valueOf10 = String.valueOf(this.j);
        String valueOf11 = String.valueOf(this.k);
        String valueOf12 = String.valueOf(this.l);
        String valueOf13 = String.valueOf(this.m);
        String valueOf14 = String.valueOf(this.n);
        String valueOf15 = String.valueOf(this.o);
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
        int length13 = String.valueOf(valueOf13).length();
        StringBuilder sb = new StringBuilder(length + 302 + length2 + length3 + length4 + length5 + length6 + length7 + length8 + length9 + length10 + length11 + length12 + length13 + String.valueOf(valueOf14).length() + String.valueOf(valueOf15).length());
        sb.append("AlertViewModelImpl{alertCardUe3Params=");
        sb.append(valueOf);
        sb.append(", closeButtonUe3Params=");
        sb.append(valueOf2);
        sb.append(", inlineLinkUe3Params=");
        sb.append(valueOf3);
        sb.append(", onDismissalClick=");
        sb.append(valueOf4);
        sb.append(", backgroundColor=");
        sb.append(valueOf5);
        sb.append(", showRoundedCorners=");
        sb.append(valueOf6);
        sb.append(", showBorder=");
        sb.append(valueOf7);
        sb.append(", headlineText=");
        sb.append(valueOf8);
        sb.append(", colorBarColor=");
        sb.append(valueOf9);
        sb.append(", headlineIcon=");
        sb.append(valueOf10);
        sb.append(", headlineIconContentDescription=");
        sb.append(valueOf11);
        sb.append(", onClick=");
        sb.append(valueOf12);
        sb.append(", screenReaderFocusable=");
        sb.append(valueOf13);
        sb.append(", actionButtonList=");
        sb.append(valueOf14);
        sb.append(", subtitleList=");
        sb.append(valueOf15);
        sb.append("}");
        return sb.toString();
    }
}
