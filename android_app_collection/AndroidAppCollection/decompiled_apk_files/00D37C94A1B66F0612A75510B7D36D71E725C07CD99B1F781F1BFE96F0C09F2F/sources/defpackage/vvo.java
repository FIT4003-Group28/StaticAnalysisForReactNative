package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.libraries.video.media.VideoMetaData;
/* compiled from: PG */
/* renamed from: vvo  reason: default package */
/* loaded from: classes4.dex */
public final class vvo implements vif {
    public Context c;
    public boolean d;
    public vvm f;
    public vrt g;
    public boolean h;
    final vrw a = vrw.a;
    final vrp b = vrp.a;
    public boolean e = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int[] f(VideoMetaData videoMetaData, int i) {
        long j;
        int i2;
        int i3;
        int i4 = 1;
        aqxo.p(true);
        long j2 = videoMetaData.g / i;
        int[] iArr = new int[i];
        int i5 = 0;
        while (i5 < i) {
            long j3 = i5 * j2;
            long j4 = j3 + j2;
            long max = (((float) j2) * (i5 / Math.max(i4, i - 1))) + j3;
            viu.b(j3 <= j4);
            int c = videoMetaData.c(j3);
            int e = videoMetaData.e(j4 - 1);
            if (c == -1 || e == -1 || c > e) {
                j = j2;
                i2 = i5;
                i3 = -1;
            } else {
                j = j2;
                i2 = i5;
                long max2 = Math.max(Math.min(max, videoMetaData.l(e)), videoMetaData.l(c));
                i3 = videoMetaData.c(max2);
                viu.d(i3 != -1 && i3 <= e);
                int e2 = videoMetaData.e(max2);
                viu.d(e2 != -1 && e2 >= c);
                long[] jArr = videoMetaData.i;
                if (jArr[i3] - max > max - jArr[e2]) {
                    i3 = e2;
                }
            }
            if (i3 != -1) {
                iArr[i2] = i3;
            } else {
                iArr[i2] = videoMetaData.g(j3);
            }
            i5 = i2 + 1;
            j2 = j;
            i4 = 1;
        }
        return iArr;
    }

    public final void a(Bundle bundle) {
        if (bundle != null) {
            this.e = bundle.getBoolean("extractor_is_enabled");
        }
    }

    public final void b() {
        vvm vvmVar = this.f;
        if (vvmVar != null) {
            vvmVar.f();
        }
    }

    public final void c() {
        vvm vvmVar = this.f;
        if (vvmVar != null) {
            vvmVar.g();
        }
        this.d = false;
    }

    public final void d() {
        this.d = true;
        vvm vvmVar = this.f;
        if (vvmVar != null) {
            vvmVar.e();
        }
    }

    public final void e(Bundle bundle) {
        bundle.putBoolean("extractor_is_enabled", this.e);
    }
}
