package defpackage;

import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: acfg  reason: default package */
/* loaded from: classes.dex */
public enum acfg {
    DEFAULT(R.color.screencast_status_background_color, R.color.screencast_status_default_color),
    ERROR(R.color.screencast_status_background_error_color, R.color.screencast_status_error_color);
    
    final int c;
    final int d;

    acfg(int i, int i2) {
        this.c = i;
        this.d = i2;
    }
}
