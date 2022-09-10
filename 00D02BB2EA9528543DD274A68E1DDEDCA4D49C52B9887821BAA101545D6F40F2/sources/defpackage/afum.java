package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: afum  reason: default package */
/* loaded from: classes2.dex */
final class afum implements btxt {
    final /* synthetic */ afwm a;
    final /* synthetic */ afuu b;

    public afum(afuu afuuVar, afwm afwmVar) {
        this.b = afuuVar;
        this.a = afwmVar;
    }

    @Override // defpackage.btxt
    public final void a(int i) {
        String string;
        if (i == 1 || !this.b.w()) {
            return;
        }
        afuu afuuVar = this.b;
        afwm afwmVar = this.a;
        Resources resources = afuuVar.b.getResources();
        afwm afwmVar2 = afwm.TRAFFIC;
        int ordinal = afwmVar.ordinal();
        if (ordinal == 0) {
            string = resources.getString(R.string.LAYER_TRAFFIC);
        } else if (ordinal == 1) {
            string = resources.getString(R.string.LAYER_BICYCLING);
        } else if (ordinal == 2) {
            string = resources.getString(R.string.LAYER_PUBLIC_TRANSIT);
        } else if (ordinal == 3) {
            string = resources.getString(R.string.LAYER_SATELLITE);
        } else if (ordinal == 4) {
            string = resources.getString(R.string.LAYERS_TERRAIN);
        } else if (ordinal != 7) {
            string = ordinal != 8 ? null : resources.getString(R.string.LAYER_COVID_INFO);
        } else {
            string = resources.getString(R.string.LAYER_THREE_DIMENSIONAL);
        }
        if (string == null) {
            return;
        }
        cjxu.h(afuuVar.u, afuuVar.b, resources.getString(R.string.OFFLINE_LAYER_NOT_AVAILABLE, string));
    }
}
