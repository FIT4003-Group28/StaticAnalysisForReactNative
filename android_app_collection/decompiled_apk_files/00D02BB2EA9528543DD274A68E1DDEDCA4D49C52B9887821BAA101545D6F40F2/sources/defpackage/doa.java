package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: doa  reason: default package */
/* loaded from: classes6.dex */
enum doa {
    DEFAULT(17170445, false, false, false),
    MINIMIZED(17170445, false, false, false),
    LOCALIZATION_STATUS(17170445, true, false, false),
    LOCALIZATION_OVERLAY(R.color.scrim_color_light, true, true, false),
    SITUATIONAL_AWARENESS_OVERLAY_NO_SCRIM(17170445, false, false, true),
    SITUATIONAL_AWARENESS_OVERLAY_WITH_SCRIM(R.color.scrim_color_dark, false, false, true);
    
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final int j;

    doa(int i, boolean z, boolean z2, boolean z3) {
        this.j = i;
        this.g = z;
        this.h = z2;
        this.i = z3;
    }
}
