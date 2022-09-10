package defpackage;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;
/* compiled from: PG */
/* renamed from: cjkf  reason: default package */
/* loaded from: classes4.dex */
final class cjkf extends cjkr {
    private final cqtv b;
    private final cqtd c;
    private final Float d;
    private final cqtd e;
    private final CharSequence f;
    private final CharSequence g;
    private final cqix<? extends cqkp> h;
    private final CharSequence i;
    private final View.OnClickListener j;
    private final cjtd k;
    private final CharSequence l;
    private final View.OnClickListener m;
    private final cjtd n;
    private final CharSequence o;
    private final View.OnClickListener p;
    private final cjtd q;
    private final AlertDialog r;
    private final boolean s;
    private final DialogInterface.OnCancelListener t;
    private final boolean u;

    public cjkf(cqtv cqtvVar, cqtd cqtdVar, Float f, cqtd cqtdVar2, CharSequence charSequence, CharSequence charSequence2, cqix<? extends cqkp> cqixVar, CharSequence charSequence3, View.OnClickListener onClickListener, cjtd cjtdVar, CharSequence charSequence4, View.OnClickListener onClickListener2, cjtd cjtdVar2, CharSequence charSequence5, View.OnClickListener onClickListener3, cjtd cjtdVar3, AlertDialog alertDialog, boolean z, DialogInterface.OnCancelListener onCancelListener, boolean z2) {
        this.b = cqtvVar;
        this.c = cqtdVar;
        this.d = f;
        this.e = cqtdVar2;
        this.f = charSequence;
        this.g = charSequence2;
        this.h = cqixVar;
        this.i = charSequence3;
        this.j = onClickListener;
        this.k = cjtdVar;
        this.l = charSequence4;
        this.m = onClickListener2;
        this.n = cjtdVar2;
        this.o = charSequence5;
        this.p = onClickListener3;
        this.q = cjtdVar3;
        this.r = alertDialog;
        this.s = z;
        this.t = onCancelListener;
        this.u = z2;
    }

    @Override // defpackage.cjme
    public cqtv a() {
        return this.b;
    }

    @Override // defpackage.cjme
    public cqtd b() {
        return this.c;
    }

    @Override // defpackage.cjme
    public Float c() {
        return this.d;
    }

    @Override // defpackage.cjme
    public cqtd d() {
        return this.e;
    }

    @Override // defpackage.cjme
    public CharSequence e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        cqtd cqtdVar;
        cqtd cqtdVar2;
        CharSequence charSequence;
        cqix<? extends cqkp> cqixVar;
        CharSequence charSequence2;
        View.OnClickListener onClickListener;
        cjtd cjtdVar;
        CharSequence charSequence3;
        View.OnClickListener onClickListener2;
        cjtd cjtdVar2;
        CharSequence charSequence4;
        View.OnClickListener onClickListener3;
        cjtd cjtdVar3;
        DialogInterface.OnCancelListener onCancelListener;
        if (obj == this) {
            return true;
        }
        if (obj instanceof cjkr) {
            cjkr cjkrVar = (cjkr) obj;
            if (this.b.equals(cjkrVar.a()) && ((cqtdVar = this.c) != null ? cqtdVar.equals(cjkrVar.b()) : cjkrVar.b() == null) && this.d.equals(cjkrVar.c()) && ((cqtdVar2 = this.e) != null ? cqtdVar2.equals(cjkrVar.d()) : cjkrVar.d() == null) && this.f.equals(cjkrVar.e()) && ((charSequence = this.g) != null ? charSequence.equals(cjkrVar.f()) : cjkrVar.f() == null) && ((cqixVar = this.h) != null ? cqixVar.equals(cjkrVar.g()) : cjkrVar.g() == null) && ((charSequence2 = this.i) != null ? charSequence2.equals(cjkrVar.h()) : cjkrVar.h() == null) && ((onClickListener = this.j) != null ? onClickListener.equals(cjkrVar.i()) : cjkrVar.i() == null) && ((cjtdVar = this.k) != null ? cjtdVar.equals(cjkrVar.j()) : cjkrVar.j() == null) && ((charSequence3 = this.l) != null ? charSequence3.equals(cjkrVar.k()) : cjkrVar.k() == null) && ((onClickListener2 = this.m) != null ? onClickListener2.equals(cjkrVar.l()) : cjkrVar.l() == null) && ((cjtdVar2 = this.n) != null ? cjtdVar2.equals(cjkrVar.m()) : cjkrVar.m() == null) && ((charSequence4 = this.o) != null ? charSequence4.equals(cjkrVar.n()) : cjkrVar.n() == null) && ((onClickListener3 = this.p) != null ? onClickListener3.equals(cjkrVar.o()) : cjkrVar.o() == null) && ((cjtdVar3 = this.q) != null ? cjtdVar3.equals(cjkrVar.p()) : cjkrVar.p() == null) && this.r.equals(cjkrVar.q()) && this.s == cjkrVar.r() && ((onCancelListener = this.t) != null ? onCancelListener.equals(cjkrVar.s()) : cjkrVar.s() == null) && this.u == cjkrVar.t()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cjme
    public CharSequence f() {
        return this.g;
    }

    @Override // defpackage.cjme
    public cqix<? extends cqkp> g() {
        return this.h;
    }

    @Override // defpackage.cjme
    public CharSequence h() {
        return this.i;
    }

    public int hashCode() {
        int i = (((cqrp) this.b).a ^ 1000003) * 1000003;
        cqtd cqtdVar = this.c;
        int i2 = 0;
        int hashCode = (((i ^ (cqtdVar == null ? 0 : cqtdVar.hashCode())) * 1000003) ^ this.d.hashCode()) * 1000003;
        cqtd cqtdVar2 = this.e;
        int hashCode2 = (((hashCode ^ (cqtdVar2 == null ? 0 : cqtdVar2.hashCode())) * 1000003) ^ this.f.hashCode()) * 1000003;
        CharSequence charSequence = this.g;
        int hashCode3 = (hashCode2 ^ (charSequence == null ? 0 : charSequence.hashCode())) * 1000003;
        cqix<? extends cqkp> cqixVar = this.h;
        int hashCode4 = (hashCode3 ^ (cqixVar == null ? 0 : cqixVar.hashCode())) * 1000003;
        CharSequence charSequence2 = this.i;
        int hashCode5 = (hashCode4 ^ (charSequence2 == null ? 0 : charSequence2.hashCode())) * 1000003;
        View.OnClickListener onClickListener = this.j;
        int hashCode6 = (hashCode5 ^ (onClickListener == null ? 0 : onClickListener.hashCode())) * 1000003;
        cjtd cjtdVar = this.k;
        int hashCode7 = (hashCode6 ^ (cjtdVar == null ? 0 : cjtdVar.hashCode())) * 1000003;
        CharSequence charSequence3 = this.l;
        int hashCode8 = (hashCode7 ^ (charSequence3 == null ? 0 : charSequence3.hashCode())) * 1000003;
        View.OnClickListener onClickListener2 = this.m;
        int hashCode9 = (hashCode8 ^ (onClickListener2 == null ? 0 : onClickListener2.hashCode())) * 1000003;
        cjtd cjtdVar2 = this.n;
        int hashCode10 = (hashCode9 ^ (cjtdVar2 == null ? 0 : cjtdVar2.hashCode())) * 1000003;
        CharSequence charSequence4 = this.o;
        int hashCode11 = (hashCode10 ^ (charSequence4 == null ? 0 : charSequence4.hashCode())) * 1000003;
        View.OnClickListener onClickListener3 = this.p;
        int hashCode12 = (hashCode11 ^ (onClickListener3 == null ? 0 : onClickListener3.hashCode())) * 1000003;
        cjtd cjtdVar3 = this.q;
        int i3 = 1237;
        int hashCode13 = (((((hashCode12 ^ (cjtdVar3 == null ? 0 : cjtdVar3.hashCode())) * 1000003) ^ this.r.hashCode()) * 1000003) ^ (true != this.s ? 1237 : 1231)) * 1000003;
        DialogInterface.OnCancelListener onCancelListener = this.t;
        if (onCancelListener != null) {
            i2 = onCancelListener.hashCode();
        }
        int i4 = (hashCode13 ^ i2) * 1000003;
        if (true == this.u) {
            i3 = 1231;
        }
        return i4 ^ i3;
    }

    @Override // defpackage.cjme
    public View.OnClickListener i() {
        return this.j;
    }

    @Override // defpackage.cjme
    public cjtd j() {
        return this.k;
    }

    @Override // defpackage.cjme
    public CharSequence k() {
        return this.l;
    }

    @Override // defpackage.cjme
    public View.OnClickListener l() {
        return this.m;
    }

    @Override // defpackage.cjme
    public cjtd m() {
        return this.n;
    }

    @Override // defpackage.cjme
    public CharSequence n() {
        return this.o;
    }

    @Override // defpackage.cjme
    public View.OnClickListener o() {
        return this.p;
    }

    @Override // defpackage.cjme
    public cjtd p() {
        return this.q;
    }

    @Override // defpackage.cjkr
    public AlertDialog q() {
        return this.r;
    }

    @Override // defpackage.cjkr
    public final boolean r() {
        return this.s;
    }

    @Override // defpackage.cjkr
    public final DialogInterface.OnCancelListener s() {
        return this.t;
    }

    @Override // defpackage.cjkr
    public final boolean t() {
        return this.u;
    }

    public String toString() {
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
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
        String valueOf13 = String.valueOf(this.n);
        String valueOf14 = String.valueOf(this.o);
        String valueOf15 = String.valueOf(this.p);
        String valueOf16 = String.valueOf(this.q);
        String valueOf17 = String.valueOf(this.r);
        boolean z = this.s;
        String valueOf18 = String.valueOf(this.t);
        boolean z2 = this.u;
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
        int length14 = String.valueOf(valueOf14).length();
        int length15 = String.valueOf(valueOf15).length();
        int length16 = String.valueOf(valueOf16).length();
        StringBuilder sb = new StringBuilder(length + 439 + length2 + length3 + length4 + length5 + length6 + length7 + length8 + length9 + length10 + length11 + length12 + length13 + length14 + length15 + length16 + String.valueOf(valueOf17).length() + String.valueOf(valueOf18).length());
        sb.append("Dialog{dialogWidth=");
        sb.append(valueOf);
        sb.append(", heroIllustration=");
        sb.append(valueOf2);
        sb.append(", heroIllustrationAspectRatio=");
        sb.append(valueOf3);
        sb.append(", alertIcon=");
        sb.append(valueOf4);
        sb.append(", title=");
        sb.append(valueOf5);
        sb.append(", bodyText=");
        sb.append(valueOf6);
        sb.append(", content=");
        sb.append(valueOf7);
        sb.append(", promotedActionText=");
        sb.append(valueOf8);
        sb.append(", promotedActionClickListener=");
        sb.append(valueOf9);
        sb.append(", promotedActionUe3Params=");
        sb.append(valueOf10);
        sb.append(", defaultActionText=");
        sb.append(valueOf11);
        sb.append(", defaultActionClickListener=");
        sb.append(valueOf12);
        sb.append(", defaultActionUe3Params=");
        sb.append(valueOf13);
        sb.append(", ancillaryActionText=");
        sb.append(valueOf14);
        sb.append(", ancillaryActionClickListener=");
        sb.append(valueOf15);
        sb.append(", ancillaryActionUe3Params=");
        sb.append(valueOf16);
        sb.append(", alertDialog=");
        sb.append(valueOf17);
        sb.append(", forceVerticallyStackedActions=");
        sb.append(z);
        sb.append(", onCancelListener=");
        sb.append(valueOf18);
        sb.append(", shouldDismissOnClick=");
        sb.append(z2);
        sb.append("}");
        return sb.toString();
    }
}
