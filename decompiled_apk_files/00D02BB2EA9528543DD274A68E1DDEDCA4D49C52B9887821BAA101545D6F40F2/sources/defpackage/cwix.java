package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cwix  reason: default package */
/* loaded from: classes5.dex */
public enum cwix {
    COLOR_ON_SURFACE(R.attr.colorOnSurface, R.color.google_default_color_on_surface),
    COLOR_PRIMARY_GOOGLE(R.attr.colorPrimaryGoogle, R.color.google_default_color_primary_google),
    COLOR_ON_PRIMARY_GOOGLE(R.attr.colorOnPrimaryGoogle, R.color.google_default_color_on_primary_google),
    COLOR_HAIRLINE(R.attr.colorHairline, R.color.google_default_color_hairline),
    TEXT_PRIMARY(16842806, R.color.google_daynight_default_color_primary_text),
    COLOR_SECONDARY_VARIANT(R.attr.colorSecondaryVariant, R.color.google_default_color_secondary_variant),
    COLOR_SURFACE(R.attr.colorSurface, R.color.google_default_color_surface);
    
    public final int h;
    public final int i;

    cwix(int i, int i2) {
        this.h = i;
        this.i = i2;
    }
}