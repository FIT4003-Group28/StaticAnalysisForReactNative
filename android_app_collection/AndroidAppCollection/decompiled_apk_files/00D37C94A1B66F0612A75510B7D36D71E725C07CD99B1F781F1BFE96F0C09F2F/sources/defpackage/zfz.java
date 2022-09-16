package defpackage;

import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: zfz  reason: default package */
/* loaded from: classes4.dex */
final class zfz implements zfx {
    private final int a;
    private final int b;
    private final int c;
    private final int d;

    public zfz(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    @Override // defpackage.zfx
    public final /* bridge */ /* synthetic */ boolean a(ViewGroup.LayoutParams layoutParams) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (marginLayoutParams.getMarginStart() == this.a && marginLayoutParams.getMarginEnd() == this.c && marginLayoutParams.topMargin == this.b && marginLayoutParams.bottomMargin == this.d) {
            return false;
        }
        marginLayoutParams.setMarginStart(this.a);
        marginLayoutParams.setMarginEnd(this.c);
        marginLayoutParams.topMargin = this.b;
        marginLayoutParams.bottomMargin = this.d;
        return true;
    }
}
