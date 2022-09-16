package defpackage;

import android.view.ViewGroup;
import android.widget.LinearLayout;
/* compiled from: PG */
/* renamed from: zfy  reason: default package */
/* loaded from: classes4.dex */
final class zfy implements zfx {
    private final float a;

    public zfy(float f) {
        this.a = f;
    }

    @Override // defpackage.zfx
    public final /* bridge */ /* synthetic */ boolean a(ViewGroup.LayoutParams layoutParams) {
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        if (Math.abs(layoutParams2.weight - this.a) < 1.0E-4f) {
            return false;
        }
        layoutParams2.weight = this.a;
        return true;
    }
}
