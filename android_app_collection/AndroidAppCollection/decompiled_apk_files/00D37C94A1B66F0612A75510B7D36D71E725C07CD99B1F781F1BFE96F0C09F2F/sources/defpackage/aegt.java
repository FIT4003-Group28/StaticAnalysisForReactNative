package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: aegt  reason: default package */
/* loaded from: classes.dex */
public interface aegt {
    public static final long a = TimeUnit.MILLISECONDS.convert(5, TimeUnit.HOURS);
    public static final long b = TimeUnit.MILLISECONDS.convert(3, TimeUnit.DAYS);

    void a(String str);

    void b(int i, int i2, FormatStreamModel formatStreamModel, String str);

    aegs c(boolean z, PlayerConfigModel playerConfigModel, String str, afmv afmvVar);
}
