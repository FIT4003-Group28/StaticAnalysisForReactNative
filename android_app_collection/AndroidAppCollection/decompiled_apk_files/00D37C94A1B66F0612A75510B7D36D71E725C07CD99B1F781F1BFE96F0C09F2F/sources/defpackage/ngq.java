package defpackage;

import com.google.android.apps.youtube.app.common.ui.actionbar.ActionBarColor;
/* compiled from: PG */
/* renamed from: ngq  reason: default package */
/* loaded from: classes3.dex */
public final class ngq {
    public final ActionBarColor a;
    public final ActionBarColor b;
    public final ActionBarColor c;
    public final ActionBarColor d;
    public final ActionBarColor e;
    private final amuk f;

    public ngq() {
    }

    public ngq(ActionBarColor actionBarColor, ActionBarColor actionBarColor2, ActionBarColor actionBarColor3, ActionBarColor actionBarColor4, ActionBarColor actionBarColor5, amuk amukVar) {
        this.a = actionBarColor;
        this.b = actionBarColor2;
        this.c = actionBarColor3;
        this.d = actionBarColor4;
        this.e = actionBarColor5;
        this.f = amukVar;
    }

    public static ngp a() {
        ngp ngpVar = new ngp();
        amuk q = amuk.q();
        if (q != null) {
            ngpVar.a = q;
            return ngpVar;
        }
        throw new NullPointerException("Null menuItems");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ngq) {
            ngq ngqVar = (ngq) obj;
            if (this.a.equals(ngqVar.a) && this.b.equals(ngqVar.b) && this.c.equals(ngqVar.c) && this.d.equals(ngqVar.d) && this.e.equals(ngqVar.e) && amxp.v(this.f, ngqVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.e);
        String valueOf6 = String.valueOf(this.f);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        StringBuilder sb = new StringBuilder(length + 92 + length2 + length3 + length4 + String.valueOf(valueOf5).length() + String.valueOf(valueOf6).length());
        sb.append("ActionBarState{primaryText=");
        sb.append(valueOf);
        sb.append(", secondaryText=");
        sb.append(valueOf2);
        sb.append(", background=");
        sb.append(valueOf3);
        sb.append(", statusBar=");
        sb.append(valueOf4);
        sb.append(", iconTint=");
        sb.append(valueOf5);
        sb.append(", menuItems=");
        sb.append(valueOf6);
        sb.append("}");
        return sb.toString();
    }
}
