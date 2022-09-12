package defpackage;

import android.view.Window;
import com.google.android.filament.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ru  reason: default package */
/* loaded from: classes.dex */
public final class ru implements vs {
    final /* synthetic */ rv a;

    public ru(rv rvVar) {
        this.a = rvVar;
    }

    @Override // defpackage.vs
    public final boolean a(vf vfVar) {
        Window.Callback t;
        if (vfVar == vfVar.y()) {
            rv rvVar = this.a;
            if (!rvVar.u || (t = rvVar.t()) == null || this.a.C) {
                return true;
            }
            t.onMenuOpened(R.styleable.AppCompatTheme_textAppearanceSearchResultTitle, vfVar);
            return true;
        }
        return true;
    }

    @Override // defpackage.vs
    public final void b(vf vfVar, boolean z) {
        vf y = vfVar.y();
        rt H = this.a.H(y != vfVar ? y : vfVar);
        if (H != null) {
            if (y != vfVar) {
                this.a.G(H.a, H, y);
                this.a.F(H, true);
                return;
            }
            this.a.F(H, z);
        }
    }
}
