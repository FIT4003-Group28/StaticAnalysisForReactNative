package defpackage;

import android.view.View;
import j$.util.Optional;
/* compiled from: PG */
/* renamed from: akff  reason: default package */
/* loaded from: classes.dex */
public final class akff implements akex, fue {
    public final CharSequence a;
    public final CharSequence b;
    public final CharSequence c;
    public final View.OnClickListener d;
    public final apoj e;
    public final CharSequence f;
    public final View.OnClickListener g;
    public final apoj h;
    public final avhn i;
    public final int j;
    public final Optional k;
    public final actj l;
    private final boolean m;
    private final boolean n;
    private final boolean o;
    private final int p;
    private final akev q;

    public akff() {
    }

    public akff(boolean z, boolean z2, boolean z3, int i, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, View.OnClickListener onClickListener, apoj apojVar, CharSequence charSequence4, View.OnClickListener onClickListener2, apoj apojVar2, avhn avhnVar, int i2, Optional optional, actj actjVar, akev akevVar) {
        this.m = z;
        this.n = z2;
        this.o = z3;
        this.p = i;
        this.a = charSequence;
        this.b = charSequence2;
        this.c = charSequence3;
        this.d = onClickListener;
        this.e = apojVar;
        this.f = charSequence4;
        this.g = onClickListener2;
        this.h = apojVar2;
        this.i = avhnVar;
        this.j = i2;
        this.k = optional;
        this.l = actjVar;
        this.q = akevVar;
    }

    public static akfe d() {
        akfe akfeVar = new akfe(null);
        akfeVar.j();
        akfeVar.h(true);
        akfeVar.a = false;
        akfeVar.f(false);
        return akfeVar.d(0);
    }

    @Override // defpackage.fue
    public final int a() {
        return 2;
    }

    @Override // defpackage.fue
    public final boolean b() {
        return this.m;
    }

    @Override // defpackage.fue
    public final boolean c() {
        return this.n;
    }

    public final boolean equals(Object obj) {
        CharSequence charSequence;
        CharSequence charSequence2;
        CharSequence charSequence3;
        View.OnClickListener onClickListener;
        apoj apojVar;
        CharSequence charSequence4;
        View.OnClickListener onClickListener2;
        apoj apojVar2;
        avhn avhnVar;
        actj actjVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof akff) {
            akff akffVar = (akff) obj;
            if (this.m == akffVar.m && this.n == akffVar.n && this.o == akffVar.o && this.p == akffVar.p && ((charSequence = this.a) != null ? charSequence.equals(akffVar.a) : akffVar.a == null) && ((charSequence2 = this.b) != null ? charSequence2.equals(akffVar.b) : akffVar.b == null) && ((charSequence3 = this.c) != null ? charSequence3.equals(akffVar.c) : akffVar.c == null) && ((onClickListener = this.d) != null ? onClickListener.equals(akffVar.d) : akffVar.d == null) && ((apojVar = this.e) != null ? apojVar.equals(akffVar.e) : akffVar.e == null) && ((charSequence4 = this.f) != null ? charSequence4.equals(akffVar.f) : akffVar.f == null) && ((onClickListener2 = this.g) != null ? onClickListener2.equals(akffVar.g) : akffVar.g == null) && ((apojVar2 = this.h) != null ? apojVar2.equals(akffVar.h) : akffVar.h == null) && ((avhnVar = this.i) != null ? avhnVar.equals(akffVar.i) : akffVar.i == null) && this.j == akffVar.j && this.k.equals(akffVar.k) && ((actjVar = this.l) != null ? actjVar.equals(akffVar.l) : akffVar.l == null)) {
                akev akevVar = this.q;
                akev akevVar2 = akffVar.q;
                if (akevVar != null ? akevVar.equals(akevVar2) : akevVar2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.akex
    public final int f() {
        return this.p;
    }

    @Override // defpackage.akex
    public final akev h() {
        return this.q;
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = ((((true != this.m ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true != this.n ? 1237 : 1231)) * 1000003;
        if (true == this.o) {
            i = 1231;
        }
        int i3 = (((i2 ^ i) * 1000003) ^ this.p) * 1000003;
        CharSequence charSequence = this.a;
        int i4 = 0;
        int hashCode = (i3 ^ (charSequence == null ? 0 : charSequence.hashCode())) * 1000003;
        CharSequence charSequence2 = this.b;
        int hashCode2 = (hashCode ^ (charSequence2 == null ? 0 : charSequence2.hashCode())) * 1000003;
        CharSequence charSequence3 = this.c;
        int hashCode3 = (hashCode2 ^ (charSequence3 == null ? 0 : charSequence3.hashCode())) * 1000003;
        View.OnClickListener onClickListener = this.d;
        int hashCode4 = (hashCode3 ^ (onClickListener == null ? 0 : onClickListener.hashCode())) * 1000003;
        apoj apojVar = this.e;
        int hashCode5 = (hashCode4 ^ (apojVar == null ? 0 : apojVar.hashCode())) * 1000003;
        CharSequence charSequence4 = this.f;
        int hashCode6 = (hashCode5 ^ (charSequence4 == null ? 0 : charSequence4.hashCode())) * 1000003;
        View.OnClickListener onClickListener2 = this.g;
        int hashCode7 = (hashCode6 ^ (onClickListener2 == null ? 0 : onClickListener2.hashCode())) * 1000003;
        apoj apojVar2 = this.h;
        int hashCode8 = (hashCode7 ^ (apojVar2 == null ? 0 : apojVar2.hashCode())) * 1000003;
        avhn avhnVar = this.i;
        int hashCode9 = (((((hashCode8 ^ (avhnVar == null ? 0 : avhnVar.hashCode())) * 1000003) ^ this.j) * 1000003) ^ this.k.hashCode()) * 1000003;
        actj actjVar = this.l;
        int hashCode10 = (hashCode9 ^ (actjVar == null ? 0 : actjVar.hashCode())) * 1000003;
        akev akevVar = this.q;
        if (akevVar != null) {
            i4 = akevVar.hashCode();
        }
        return hashCode10 ^ i4;
    }

    @Override // defpackage.akex
    public final boolean k() {
        return this.o;
    }

    public final String toString() {
        boolean z = this.m;
        boolean z2 = this.n;
        boolean z3 = this.o;
        int i = this.p;
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.e);
        String valueOf6 = String.valueOf(this.f);
        String valueOf7 = String.valueOf(this.g);
        String valueOf8 = String.valueOf(this.h);
        String valueOf9 = String.valueOf(this.i);
        int i2 = this.j;
        String valueOf10 = String.valueOf(this.k);
        String valueOf11 = String.valueOf(this.l);
        String valueOf12 = String.valueOf(this.q);
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
        StringBuilder sb = new StringBuilder(length + 330 + length2 + length3 + length4 + length5 + length6 + length7 + length8 + length9 + length10 + String.valueOf(valueOf11).length() + String.valueOf(valueOf12).length());
        sb.append("MealbarBottomUiModel{rateLimited=");
        sb.append(z);
        sb.append(", shownOnFullscreen=");
        sb.append(z2);
        sb.append(", counterfactual=");
        sb.append(z3);
        sb.append(", duration=");
        sb.append(i);
        sb.append(", titleText=");
        sb.append(valueOf);
        sb.append(", detailText=");
        sb.append(valueOf2);
        sb.append(", actionText=");
        sb.append(valueOf3);
        sb.append(", actionListener=");
        sb.append(valueOf4);
        sb.append(", actionButtonRenderer=");
        sb.append(valueOf5);
        sb.append(", dismissText=");
        sb.append(valueOf6);
        sb.append(", dismissListener=");
        sb.append(valueOf7);
        sb.append(", dismissButtonRenderer=");
        sb.append(valueOf8);
        sb.append(", thumbnail=");
        sb.append(valueOf9);
        sb.append(", icon=");
        sb.append(i2);
        sb.append(", iconColorAttribute=");
        sb.append(valueOf10);
        sb.append(", clientVeType=");
        sb.append(valueOf11);
        sb.append(", transientUiCallback=");
        sb.append(valueOf12);
        sb.append("}");
        return sb.toString();
    }
}
