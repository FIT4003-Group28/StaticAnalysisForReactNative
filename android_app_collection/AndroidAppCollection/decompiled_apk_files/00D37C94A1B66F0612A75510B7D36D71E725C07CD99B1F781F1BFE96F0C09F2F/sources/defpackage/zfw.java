package defpackage;

import android.view.ViewGroup;
import android.widget.GridLayout;
/* compiled from: PG */
/* renamed from: zfw  reason: default package */
/* loaded from: classes4.dex */
public final class zfw implements zfx {
    private final GridLayout.Spec a;
    private final /* synthetic */ int b;

    public zfw(GridLayout.Spec spec) {
        this.a = spec;
    }

    public zfw(GridLayout.Spec spec, int i) {
        this.b = i;
        this.a = spec;
    }

    @Override // defpackage.zfx
    public final /* bridge */ /* synthetic */ boolean a(ViewGroup.LayoutParams layoutParams) {
        if (this.b == 0) {
            GridLayout.LayoutParams layoutParams2 = (GridLayout.LayoutParams) layoutParams;
            if (akzj.f(this.a, layoutParams2.rowSpec)) {
                return false;
            }
            layoutParams2.rowSpec = this.a;
            return true;
        }
        GridLayout.LayoutParams layoutParams3 = (GridLayout.LayoutParams) layoutParams;
        if (akzj.f(this.a, layoutParams3.columnSpec)) {
            return false;
        }
        layoutParams3.columnSpec = this.a;
        return true;
    }
}
