package defpackage;

import android.content.SharedPreferences;
import com.google.android.apps.gmm.base.views.scalebar.ScalebarView;
/* compiled from: PG */
/* renamed from: jiq  reason: default package */
/* loaded from: classes.dex */
public final class jiq implements SharedPreferences.OnSharedPreferenceChangeListener {
    final /* synthetic */ ScalebarView a;

    public jiq(ScalebarView scalebarView) {
        this.a = scalebarView;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (str.equals(bvjk.H.toString())) {
            ScalebarView scalebarView = this.a;
            scalebarView.o = scalebarView.b.z(bvjk.H, "fade").equals("always");
            ScalebarView scalebarView2 = this.a;
            if (scalebarView2.o) {
                scalebarView2.k.cancel();
                this.a.setAlpha(1.0f);
                return;
            }
            scalebarView2.d();
        }
    }
}
