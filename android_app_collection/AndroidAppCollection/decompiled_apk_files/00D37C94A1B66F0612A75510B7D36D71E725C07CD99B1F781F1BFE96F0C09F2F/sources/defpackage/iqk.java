package defpackage;

import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: iqk  reason: default package */
/* loaded from: classes3.dex */
final class iqk implements afzf {
    final /* synthetic */ iql a;

    public iqk(iql iqlVar) {
        this.a = iqlVar;
    }

    @Override // defpackage.cez
    public final void kV(cff cffVar) {
        this.a.a.d.e(cffVar);
    }

    @Override // defpackage.afzf
    public final /* synthetic */ void kW() {
    }

    @Override // defpackage.cfa
    public final /* bridge */ /* synthetic */ void lG(Object obj) {
        asat asatVar = (asat) obj;
        zag.q(this.a.a.ap, R.string.edit_playlist_done, 0);
        PaneDescriptor a = iqe.a(this.a.a.ai);
        iqp iqpVar = this.a.a;
        iqpVar.q(new iqm(iqpVar, a));
    }
}
