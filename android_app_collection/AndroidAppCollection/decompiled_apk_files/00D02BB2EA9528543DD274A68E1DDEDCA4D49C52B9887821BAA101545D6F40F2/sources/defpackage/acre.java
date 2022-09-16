package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: acre  reason: default package */
/* loaded from: classes2.dex */
final class acre implements cpve<cpvm, Integer> {
    final /* synthetic */ boolean a;
    final /* synthetic */ Resources b;
    final /* synthetic */ acrg c;

    public acre(acrg acrgVar, boolean z, Resources resources) {
        this.c = acrgVar;
        this.a = z;
        this.b = resources;
    }

    @Override // defpackage.cpve
    public final /* bridge */ /* synthetic */ Integer a(cpvm cpvmVar, int i, cpvi<cpvm, ?> cpviVar) {
        int i2;
        cpvm cpvmVar2 = cpvmVar;
        boolean z = false;
        if (this.c.g != null && cpvmVar2.b().doubleValue() % 24.0d == this.c.g.intValue()) {
            z = true;
        }
        if (this.a) {
            if (z) {
                i2 = cpvmVar2.a().doubleValue() < ((double) this.c.i.c) ? R.color.greyed_out_historical_busyness_bar_background : R.color.greyed_out_historical_busyness_bar_visible;
            }
            i2 = acrg.a;
        } else {
            if (z) {
                i2 = acrg.b;
            }
            i2 = acrg.a;
        }
        return Integer.valueOf(this.b.getColor(i2));
    }
}
