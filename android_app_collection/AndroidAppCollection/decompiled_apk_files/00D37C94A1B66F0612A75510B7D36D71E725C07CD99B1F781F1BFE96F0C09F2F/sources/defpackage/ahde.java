package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
/* compiled from: PG */
/* renamed from: ahde  reason: default package */
/* loaded from: classes.dex */
public final class ahde {
    public final azqb a;

    public ahde(azqb azqbVar) {
        this.a = azqbVar;
    }

    public final agpx a(VideoStreamingData videoStreamingData, PlayerConfigModel playerConfigModel, int i, int i2, int i3, boolean z, String str) {
        aegr aegrVar = new aegr();
        aegrVar.a = new aegx(i, i);
        aegrVar.b = b(i3);
        aegrVar.d = i2;
        aegrVar.e = true != z ? 0 : 32;
        if (!TextUtils.isEmpty(str)) {
            aegrVar.c = str;
        }
        try {
            aegu a = ((aegq) this.a.get()).a(videoStreamingData.m(), playerConfigModel, new aegs(aegrVar.a, aegrVar.b, false, aegrVar.c, -1, -2, -1L, aegrVar.d, aegrVar.e));
            FormatStreamModel[] g = a.g();
            FormatStreamModel[] formatStreamModelArr = a.b;
            FormatStreamModel formatStreamModel = g.length > 0 ? g[0] : null;
            FormatStreamModel formatStreamModel2 = formatStreamModelArr.length > 0 ? formatStreamModelArr[0] : null;
            if (z && formatStreamModel2 != null) {
                formatStreamModel = null;
            }
            if (formatStreamModel == null && formatStreamModel2 == null) {
                return null;
            }
            return new agpx(formatStreamModel, formatStreamModel2);
        } catch (aegw unused) {
            return null;
        }
    }

    public static final aegx b(int i) {
        int i2 = i - 1;
        if (i != 0) {
            if (i2 == 1) {
                return new aegx(2, 2);
            }
            if (i2 == 2) {
                return new aegx(3, 3);
            }
            if (i2 == 3) {
                return new aegx(4, 4);
            }
            return aegs.a;
        }
        throw null;
    }
}
