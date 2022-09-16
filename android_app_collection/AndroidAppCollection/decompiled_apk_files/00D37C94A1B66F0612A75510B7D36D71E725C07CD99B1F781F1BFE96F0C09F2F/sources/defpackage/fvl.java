package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: fvl  reason: default package */
/* loaded from: classes3.dex */
public final class fvl extends akfi implements fue {
    public final CharSequence a;
    public final CharSequence b;
    public final View.OnClickListener c;
    private final boolean d;
    private final boolean e;
    private final boolean f;
    private final int g;
    private final akev h;

    public fvl() {
    }

    public fvl(boolean z, boolean z2, boolean z3, int i, CharSequence charSequence, CharSequence charSequence2, View.OnClickListener onClickListener, akev akevVar) {
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = i;
        this.a = charSequence;
        this.b = charSequence2;
        this.c = onClickListener;
        this.h = akevVar;
    }

    public static fvg d() {
        fvg fvgVar = new fvg();
        fvgVar.i(-1);
        fvgVar.j(false);
        fvgVar.e(false);
        fvgVar.a = false;
        return fvgVar;
    }

    public static fvg e(CharSequence charSequence) {
        fvg d = d();
        d.k(charSequence);
        return d;
    }

    @Override // defpackage.fue
    public final int a() {
        return 1;
    }

    @Override // defpackage.fue
    public final boolean b() {
        return this.d;
    }

    @Override // defpackage.fue
    public final boolean c() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        CharSequence charSequence;
        View.OnClickListener onClickListener;
        if (obj == this) {
            return true;
        }
        if (obj instanceof fvl) {
            fvl fvlVar = (fvl) obj;
            if (this.d == fvlVar.d && this.e == fvlVar.e && this.f == fvlVar.f && this.g == fvlVar.g && this.a.equals(fvlVar.a) && ((charSequence = this.b) != null ? charSequence.equals(fvlVar.b) : fvlVar.b == null) && ((onClickListener = this.c) != null ? onClickListener.equals(fvlVar.c) : fvlVar.c == null)) {
                akev akevVar = this.h;
                akev akevVar2 = fvlVar.h;
                if (akevVar != null ? akevVar.equals(akevVar2) : akevVar2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.akex
    public final int f() {
        return this.g;
    }

    @Override // defpackage.akfi
    public final View.OnClickListener g() {
        return this.c;
    }

    @Override // defpackage.akfi, defpackage.akex
    public final akev h() {
        return this.h;
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = ((((true != this.d ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003;
        if (true == this.f) {
            i = 1231;
        }
        int hashCode = (((((i2 ^ i) * 1000003) ^ this.g) * 1000003) ^ this.a.hashCode()) * 1000003;
        CharSequence charSequence = this.b;
        int i3 = 0;
        int hashCode2 = (hashCode ^ (charSequence == null ? 0 : charSequence.hashCode())) * 1000003;
        View.OnClickListener onClickListener = this.c;
        int hashCode3 = (hashCode2 ^ (onClickListener == null ? 0 : onClickListener.hashCode())) * 1000003;
        akev akevVar = this.h;
        if (akevVar != null) {
            i3 = akevVar.hashCode();
        }
        return hashCode3 ^ i3;
    }

    @Override // defpackage.akfi
    public final CharSequence i() {
        return this.b;
    }

    @Override // defpackage.akfi
    public final CharSequence j() {
        return this.a;
    }

    @Override // defpackage.akex
    public final boolean k() {
        return this.f;
    }

    public final String toString() {
        boolean z = this.d;
        boolean z2 = this.e;
        boolean z3 = this.f;
        int i = this.g;
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.h);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 168 + length2 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("SnackbarBottomUiModel{rateLimited=");
        sb.append(z);
        sb.append(", shownOnFullscreen=");
        sb.append(z2);
        sb.append(", counterfactual=");
        sb.append(z3);
        sb.append(", duration=");
        sb.append(i);
        sb.append(", text=");
        sb.append(valueOf);
        sb.append(", actionText=");
        sb.append(valueOf2);
        sb.append(", actionListener=");
        sb.append(valueOf3);
        sb.append(", transientUiCallback=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }
}
