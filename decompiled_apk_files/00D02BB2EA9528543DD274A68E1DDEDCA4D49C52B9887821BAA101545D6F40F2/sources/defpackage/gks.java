package defpackage;

import com.google.android.filament.R;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: gks  reason: default package */
/* loaded from: classes6.dex */
enum gks {
    WIFI(3, 30),
    MOBILE_4G(3, 30),
    MOBILE_3G(2, 30),
    MOBILE_2G(1, 40),
    WIFI_RASTER(3, 30),
    MOBILE_4G_RASTER(3, 60),
    MOBILE_3G_RASTER(2, 90),
    MOBILE_2G_RASTER(1, R.styleable.AppCompatTheme_windowFixedHeightMajor),
    NO_NETWORK(2, 0);
    
    final long j;
    final long k;

    gks(int i, int i2) {
        this.j = TimeUnit.SECONDS.toMillis(i);
        this.k = TimeUnit.SECONDS.toMillis(i2);
    }
}
