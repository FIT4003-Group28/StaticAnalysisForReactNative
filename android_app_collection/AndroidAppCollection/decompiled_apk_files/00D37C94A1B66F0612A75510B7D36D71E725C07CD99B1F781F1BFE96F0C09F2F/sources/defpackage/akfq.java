package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: akfq  reason: default package */
/* loaded from: classes.dex */
public final class akfq implements akex {
    public final boolean a;
    public final int b;
    public final View c;
    public final CharSequence d;
    public final CharSequence e;
    public final apoj f;
    public final apoj g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final float l;
    public final ampq m;
    public final ampq n;
    public final akev o;
    public final View.OnClickListener p;
    public final akfz q;
    private final boolean r;

    public akfq() {
    }

    public akfq(boolean z, int i, boolean z2, View view, CharSequence charSequence, CharSequence charSequence2, apoj apojVar, apoj apojVar2, int i2, int i3, int i4, int i5, float f, ampq ampqVar, ampq ampqVar2, akev akevVar, View.OnClickListener onClickListener, akfz akfzVar) {
        this.a = z;
        this.b = i;
        this.r = z2;
        this.c = view;
        this.d = charSequence;
        this.e = charSequence2;
        this.f = apojVar;
        this.g = apojVar2;
        this.h = i2;
        this.i = i3;
        this.j = i4;
        this.k = i5;
        this.l = f;
        this.m = ampqVar;
        this.n = ampqVar2;
        this.o = akevVar;
        this.p = onClickListener;
        this.q = akfzVar;
    }

    public static akfp a() {
        akfp akfpVar = new akfp(null);
        akfpVar.f(0);
        akfpVar.j(1);
        akfpVar.k(0);
        akfpVar.g(1.0f);
        akfpVar.e(false);
        akfpVar.h(2);
        akfpVar.c(2);
        akfpVar.l();
        return akfpVar;
    }

    public final boolean equals(Object obj) {
        View view;
        CharSequence charSequence;
        CharSequence charSequence2;
        apoj apojVar;
        apoj apojVar2;
        akev akevVar;
        View.OnClickListener onClickListener;
        if (obj == this) {
            return true;
        }
        if (obj instanceof akfq) {
            akfq akfqVar = (akfq) obj;
            if (this.a == akfqVar.a && this.b == akfqVar.b && this.r == akfqVar.r && ((view = this.c) != null ? view.equals(akfqVar.c) : akfqVar.c == null) && ((charSequence = this.d) != null ? charSequence.equals(akfqVar.d) : akfqVar.d == null) && ((charSequence2 = this.e) != null ? charSequence2.equals(akfqVar.e) : akfqVar.e == null) && ((apojVar = this.f) != null ? apojVar.equals(akfqVar.f) : akfqVar.f == null) && ((apojVar2 = this.g) != null ? apojVar2.equals(akfqVar.g) : akfqVar.g == null) && this.h == akfqVar.h && this.i == akfqVar.i && this.j == akfqVar.j && this.k == akfqVar.k && Float.floatToIntBits(this.l) == Float.floatToIntBits(akfqVar.l) && this.m.equals(akfqVar.m) && this.n.equals(akfqVar.n) && ((akevVar = this.o) != null ? akevVar.equals(akfqVar.o) : akfqVar.o == null) && ((onClickListener = this.p) != null ? onClickListener.equals(akfqVar.p) : akfqVar.p == null)) {
                akfz akfzVar = this.q;
                akfz akfzVar2 = akfqVar.q;
                if (akfzVar != null ? akfzVar.equals(akfzVar2) : akfzVar2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.akex
    public final int f() {
        return this.b;
    }

    @Override // defpackage.akex
    public final akev h() {
        return this.o;
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = ((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.b) * 1000003;
        if (true == this.r) {
            i = 1231;
        }
        int i3 = (i2 ^ i) * 1000003;
        View view = this.c;
        int i4 = 0;
        int hashCode = (i3 ^ (view == null ? 0 : view.hashCode())) * 1000003;
        CharSequence charSequence = this.d;
        int hashCode2 = (hashCode ^ (charSequence == null ? 0 : charSequence.hashCode())) * 1000003;
        CharSequence charSequence2 = this.e;
        int hashCode3 = (hashCode2 ^ (charSequence2 == null ? 0 : charSequence2.hashCode())) * 583896283;
        apoj apojVar = this.f;
        int hashCode4 = (hashCode3 ^ (apojVar == null ? 0 : apojVar.hashCode())) * 583896283;
        apoj apojVar2 = this.g;
        int hashCode5 = (((((((((((((((hashCode4 ^ (apojVar2 == null ? 0 : apojVar2.hashCode())) * 1000003) ^ this.h) * 1000003) ^ this.i) * 1000003) ^ this.j) * 1000003) ^ this.k) * 1000003) ^ Float.floatToIntBits(this.l)) * 1000003) ^ this.m.hashCode()) * 1000003) ^ this.n.hashCode()) * 1000003;
        akev akevVar = this.o;
        int hashCode6 = (hashCode5 ^ (akevVar == null ? 0 : akevVar.hashCode())) * 1000003;
        View.OnClickListener onClickListener = this.p;
        int hashCode7 = (hashCode6 ^ (onClickListener == null ? 0 : onClickListener.hashCode())) * 1000003;
        akfz akfzVar = this.q;
        if (akfzVar != null) {
            i4 = akfzVar.hashCode();
        }
        return hashCode7 ^ i4;
    }

    @Override // defpackage.akex
    public final boolean k() {
        return this.a;
    }

    public final String toString() {
        boolean z = this.a;
        int i = this.b;
        boolean z2 = this.r;
        String valueOf = String.valueOf(this.c);
        String valueOf2 = String.valueOf(this.d);
        String valueOf3 = String.valueOf(this.e);
        String valueOf4 = String.valueOf(this.f);
        String valueOf5 = String.valueOf(this.g);
        int i2 = this.h;
        int i3 = this.i;
        int i4 = this.j;
        int i5 = this.k;
        float f = this.l;
        String valueOf6 = String.valueOf(this.m);
        String valueOf7 = String.valueOf(this.n);
        String valueOf8 = String.valueOf(this.o);
        String valueOf9 = String.valueOf(this.p);
        String valueOf10 = String.valueOf(this.q);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = "null".length();
        int length5 = "null".length();
        int length6 = String.valueOf(valueOf4).length();
        int length7 = "null".length();
        int length8 = "null".length();
        int length9 = String.valueOf(valueOf5).length();
        int length10 = String.valueOf(valueOf6).length();
        int length11 = String.valueOf(valueOf7).length();
        int length12 = String.valueOf(valueOf8).length();
        StringBuilder sb = new StringBuilder(length + 491 + length2 + length3 + length4 + length5 + length6 + length7 + length8 + length9 + length10 + length11 + length12 + String.valueOf(valueOf9).length() + String.valueOf(valueOf10).length());
        sb.append("YouTubeTooltipModel{counterfactual=");
        sb.append(z);
        sb.append(", duration=");
        sb.append(i);
        sb.append(", rateLimited=");
        sb.append(z2);
        sb.append(", targetView=");
        sb.append(valueOf);
        sb.append(", titleText=");
        sb.append(valueOf2);
        sb.append(", detailText=");
        sb.append(valueOf3);
        sb.append(", actionText=");
        sb.append("null");
        sb.append(", actionListener=");
        sb.append("null");
        sb.append(", actionButtonRenderer=");
        sb.append(valueOf4);
        sb.append(", dismissText=");
        sb.append("null");
        sb.append(", dismissListener=");
        sb.append("null");
        sb.append(", dismissButtonRenderer=");
        sb.append(valueOf5);
        sb.append(", tapDismissalType=");
        sb.append(i2);
        sb.append(", targetEffectType=");
        sb.append(i3);
        sb.append(", placement=");
        sb.append(i4);
        sb.append(", alignment=");
        sb.append(i5);
        sb.append(", maxWidthPercentage=");
        sb.append(f);
        sb.append(", backgroundColor=");
        sb.append(valueOf6);
        sb.append(", acceptFeedbackOnTargetTapEnabled=");
        sb.append(valueOf7);
        sb.append(", transientUiCallback=");
        sb.append(valueOf8);
        sb.append(", onClickListener=");
        sb.append(valueOf9);
        sb.append(", onTooltipDismissListener=");
        sb.append(valueOf10);
        sb.append("}");
        return sb.toString();
    }
}
