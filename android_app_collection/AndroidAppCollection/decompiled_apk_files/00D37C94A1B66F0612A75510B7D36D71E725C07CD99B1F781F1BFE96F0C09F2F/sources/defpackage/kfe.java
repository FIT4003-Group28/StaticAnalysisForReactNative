package defpackage;

import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
/* compiled from: PG */
/* renamed from: kfe  reason: default package */
/* loaded from: classes3.dex */
public final class kfe {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final ControlsOverlayStyle m;

    public kfe() {
    }

    public kfe(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, ControlsOverlayStyle controlsOverlayStyle) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = z7;
        this.h = z8;
        this.i = z9;
        this.j = z10;
        this.k = z11;
        this.l = z12;
        this.m = controlsOverlayStyle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kfe) {
            kfe kfeVar = (kfe) obj;
            if (this.a == kfeVar.a && this.b == kfeVar.b && this.c == kfeVar.c && this.d == kfeVar.d && this.e == kfeVar.e && this.f == kfeVar.f && this.g == kfeVar.g && this.h == kfeVar.h && this.i == kfeVar.i && this.j == kfeVar.j && this.k == kfeVar.k && this.l == kfeVar.l && this.m.equals(kfeVar.m)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = ((((((((((((((((((((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ (true != this.g ? 1237 : 1231)) * 1000003) ^ (true != this.h ? 1237 : 1231)) * 1000003) ^ (true != this.i ? 1237 : 1231)) * 1000003) ^ (true != this.j ? 1237 : 1231)) * 1000003) ^ (true != this.k ? 1237 : 1231)) * 1000003;
        if (true == this.l) {
            i = 1231;
        }
        return ((i2 ^ i) * 1000003) ^ this.m.hashCode();
    }

    public final String toString() {
        boolean z = this.a;
        boolean z2 = this.b;
        boolean z3 = this.c;
        boolean z4 = this.d;
        boolean z5 = this.e;
        boolean z6 = this.f;
        boolean z7 = this.g;
        boolean z8 = this.h;
        boolean z9 = this.i;
        boolean z10 = this.j;
        boolean z11 = this.k;
        boolean z12 = this.l;
        String valueOf = String.valueOf(this.m);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 340);
        sb.append("MidUiModel{isControlsOverlayVisible=");
        sb.append(z);
        sb.append(", isMagicWindowMidUiEduVisible=");
        sb.append(z2);
        sb.append(", isVideoInNewState=");
        sb.append(z3);
        sb.append(", isFullscreen=");
        sb.append(z4);
        sb.append(", hasNext=");
        sb.append(z5);
        sb.append(", hasPrevious=");
        sb.append(z6);
        sb.append(", isUserScrubbing=");
        sb.append(z7);
        sb.append(", isSeekEDUVisible=");
        sb.append(z8);
        sb.append(", isQuickSeekVisible=");
        sb.append(z9);
        sb.append(", isFullscreenEngagementViewVisible=");
        sb.append(z10);
        sb.append(", isStickyControlsEnabled=");
        sb.append(z11);
        sb.append(", isAutonavToggleEnabled=");
        sb.append(z12);
        sb.append(", style=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
