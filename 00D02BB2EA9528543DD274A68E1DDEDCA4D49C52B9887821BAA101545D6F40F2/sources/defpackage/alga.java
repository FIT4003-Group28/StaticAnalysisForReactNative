package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: alga  reason: default package */
/* loaded from: classes2.dex */
public final class alga extends alfy {
    public static final dcdc<dmlo> g = dcdc.h(dmlo.TOP_RIGHT, dmlo.TOP, dmlo.TOP_LEFT);

    public alga(akvz akvzVar, Resources resources, boolean z) {
        super(akvzVar, resources, z);
    }

    @Override // defpackage.alfy
    @dzsi
    public final akuh a(boolean z) {
        if (z) {
            return this.a.a(dmqc.LEGEND_STYLE_MANEUVER_CALLOUT);
        }
        return null;
    }

    @Override // defpackage.alfy
    @dzsi
    public final akuh b(boolean z) {
        if (z) {
            return this.a.a(dmqc.LEGEND_STYLE_MANEUVER_CALLOUT_TITLE);
        }
        return null;
    }

    @Override // defpackage.alfy
    public final akuh c(amuo amuoVar) {
        return e(amuoVar, R.color.gmm_white);
    }
}
