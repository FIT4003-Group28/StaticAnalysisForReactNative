package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aley  reason: default package */
/* loaded from: classes2.dex */
public final class aley extends alfy {
    private final akuh g;
    private final akuh h;

    public aley(akvz akvzVar, Resources resources, boolean z) {
        super(akvzVar, resources, z);
        this.g = akvzVar.a(dmqc.LEGEND_STYLE_DIRECTIONS_MANEUVER_CALLOUT_PRIMARY_GROUP);
        this.h = akvzVar.a(dmqc.LEGEND_STYLE_DIRECTIONS_MANEUVER_CALLOUT_TITLE);
    }

    @Override // defpackage.alfy
    public final akuh a(boolean z) {
        return this.g;
    }

    @Override // defpackage.alfy
    public final akuh b(boolean z) {
        return this.h;
    }

    @Override // defpackage.alfy
    public final akuh c(amuo amuoVar) {
        return e(amuoVar, R.color.gmm_black);
    }
}
