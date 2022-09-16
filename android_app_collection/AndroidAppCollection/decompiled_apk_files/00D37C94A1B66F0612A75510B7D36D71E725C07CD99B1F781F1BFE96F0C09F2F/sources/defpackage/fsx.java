package defpackage;

import com.google.android.apps.youtube.app.common.ui.actionbar.ActionBarColor;
/* compiled from: PG */
/* renamed from: fsx  reason: default package */
/* loaded from: classes3.dex */
public final class fsx {
    public final fsa a;
    public final fsh b;
    public final fsk c;
    public final fsp d;
    public final fsr e;
    public final boolean f;
    public final boolean g;
    public final Object h;
    public final boolean i;
    public final ActionBarColor j;
    public final ActionBarColor k;
    public final int l;
    public final ActionBarColor m;
    public final int n;
    public final ActionBarColor o;
    public final ActionBarColor p;

    public fsx() {
    }

    public fsx(fsa fsaVar, fsh fshVar, fsk fskVar, fsp fspVar, fsr fsrVar, boolean z, boolean z2, Object obj, boolean z3, ActionBarColor actionBarColor, ActionBarColor actionBarColor2, int i, ActionBarColor actionBarColor3, int i2, ActionBarColor actionBarColor4, ActionBarColor actionBarColor5) {
        this.a = fsaVar;
        this.b = fshVar;
        this.c = fskVar;
        this.d = fspVar;
        this.e = fsrVar;
        this.f = z;
        this.g = z2;
        this.h = obj;
        this.i = z3;
        this.j = actionBarColor;
        this.k = actionBarColor2;
        this.l = i;
        this.m = actionBarColor3;
        this.n = i2;
        this.o = actionBarColor4;
        this.p = actionBarColor5;
    }

    public final fsw a() {
        return new fsw(this);
    }

    public final boolean equals(Object obj) {
        fsh fshVar;
        fsk fskVar;
        fsp fspVar;
        fsr fsrVar;
        Object obj2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof fsx) {
            fsx fsxVar = (fsx) obj;
            if (this.a.equals(fsxVar.a) && ((fshVar = this.b) != null ? fshVar.equals(fsxVar.b) : fsxVar.b == null) && ((fskVar = this.c) != null ? fskVar.equals(fsxVar.c) : fsxVar.c == null) && ((fspVar = this.d) != null ? fspVar.equals(fsxVar.d) : fsxVar.d == null) && ((fsrVar = this.e) != null ? fsrVar.equals(fsxVar.e) : fsxVar.e == null) && this.f == fsxVar.f && this.g == fsxVar.g && ((obj2 = this.h) != null ? obj2.equals(fsxVar.h) : fsxVar.h == null) && this.i == fsxVar.i && this.j.equals(fsxVar.j) && this.k.equals(fsxVar.k) && this.l == fsxVar.l && this.m.equals(fsxVar.m) && this.n == fsxVar.n && this.o.equals(fsxVar.o) && this.p.equals(fsxVar.p)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        fsh fshVar = this.b;
        int i = 0;
        int hashCode2 = (hashCode ^ (fshVar == null ? 0 : fshVar.hashCode())) * 1000003;
        fsk fskVar = this.c;
        int hashCode3 = (hashCode2 ^ (fskVar == null ? 0 : fskVar.hashCode())) * 1000003;
        fsp fspVar = this.d;
        int hashCode4 = (hashCode3 ^ (fspVar == null ? 0 : fspVar.hashCode())) * 1000003;
        fsr fsrVar = this.e;
        int i2 = 1237;
        int hashCode5 = (((((hashCode4 ^ (fsrVar == null ? 0 : fsrVar.hashCode())) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ (true != this.g ? 1237 : 1231)) * 1000003;
        Object obj = this.h;
        if (obj != null) {
            i = obj.hashCode();
        }
        int i3 = (hashCode5 ^ i) * 1000003;
        if (true == this.i) {
            i2 = 1231;
        }
        return ((((((((((((((i3 ^ i2) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.l) * 1000003) ^ this.m.hashCode()) * 1000003) ^ this.n) * 1000003) ^ this.o.hashCode()) * 1000003) ^ this.p.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.e);
        boolean z = this.f;
        boolean z2 = this.g;
        String valueOf6 = String.valueOf(this.h);
        boolean z3 = this.i;
        String valueOf7 = String.valueOf(this.j);
        String valueOf8 = String.valueOf(this.k);
        int i = this.l;
        String valueOf9 = String.valueOf(this.m);
        int i2 = this.n;
        String valueOf10 = String.valueOf(this.o);
        String valueOf11 = String.valueOf(this.p);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        int length5 = String.valueOf(valueOf5).length();
        int length6 = String.valueOf(valueOf6).length();
        int length7 = String.valueOf(valueOf7).length();
        int length8 = String.valueOf(valueOf8).length();
        int length9 = String.valueOf(valueOf9).length();
        StringBuilder sb = new StringBuilder(length + 416 + length2 + length3 + length4 + length5 + length6 + length7 + length8 + length9 + String.valueOf(valueOf10).length() + String.valueOf(valueOf11).length());
        sb.append("TopBarModel{actionBarModel=");
        sb.append(valueOf);
        sb.append(", feedFilterBarModel=");
        sb.append(valueOf2);
        sb.append(", mySubsFilterBarModel=");
        sb.append(valueOf3);
        sb.append(", searchResultsChipBarModel=");
        sb.append(valueOf4);
        sb.append(", tabHeaderElementBarModel=");
        sb.append(valueOf5);
        sb.append(", enableTranslucentActionBar=");
        sb.append(z);
        sb.append(", hideTitleOnTranslucentActionBar=");
        sb.append(z2);
        sb.append(", headerRenderer=");
        sb.append(valueOf6);
        sb.append(", isHeaderRendererCollapsible=");
        sb.append(z3);
        sb.append(", backgroundColor=");
        sb.append(valueOf7);
        sb.append(", statusBarColor=");
        sb.append(valueOf8);
        sb.append(", primaryTextStyleResId=");
        sb.append(i);
        sb.append(", primaryTextColor=");
        sb.append(valueOf9);
        sb.append(", secondaryTextStyleResId=");
        sb.append(i2);
        sb.append(", secondaryTextColor=");
        sb.append(valueOf10);
        sb.append(", indicatorColor=");
        sb.append(valueOf11);
        sb.append("}");
        return sb.toString();
    }
}
