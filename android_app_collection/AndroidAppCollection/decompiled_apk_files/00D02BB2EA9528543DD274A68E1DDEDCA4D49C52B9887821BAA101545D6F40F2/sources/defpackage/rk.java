package defpackage;

import android.view.Window;
import com.google.android.filament.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: rk  reason: default package */
/* loaded from: classes.dex */
public final class rk implements vs {
    final /* synthetic */ rv a;

    public rk(rv rvVar) {
        this.a = rvVar;
    }

    @Override // defpackage.vs
    public final boolean a(vf vfVar) {
        Window.Callback t = this.a.t();
        if (t != null) {
            t.onMenuOpened(R.styleable.AppCompatTheme_textAppearanceSearchResultTitle, vfVar);
            return true;
        }
        return true;
    }

    @Override // defpackage.vs
    public final void b(vf vfVar, boolean z) {
        this.a.E(vfVar);
    }
}
