package defpackage;

import android.media.session.PlaybackState;
import android.os.Bundle;
import android.view.WindowInsets;
/* compiled from: PG */
/* renamed from: jb  reason: default package */
/* loaded from: classes3.dex */
public final class jb {
    public static Bundle a(PlaybackState playbackState) {
        return playbackState.getExtras();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(PlaybackState.Builder builder, Bundle bundle) {
        builder.setExtras(bundle);
    }

    public static int c(int i) {
        int statusBars;
        int i2 = 0;
        for (int i3 = 1; i3 <= 256; i3 += i3) {
            if ((i & i3) != 0) {
                if (i3 == 1) {
                    statusBars = WindowInsets.Type.statusBars();
                } else if (i3 == 2) {
                    statusBars = WindowInsets.Type.navigationBars();
                } else if (i3 == 4) {
                    statusBars = WindowInsets.Type.captionBar();
                } else if (i3 == 8) {
                    statusBars = WindowInsets.Type.ime();
                } else if (i3 == 16) {
                    statusBars = WindowInsets.Type.systemGestures();
                } else if (i3 == 32) {
                    statusBars = WindowInsets.Type.mandatorySystemGestures();
                } else if (i3 == 64) {
                    statusBars = WindowInsets.Type.tappableElement();
                } else if (i3 == 128) {
                    statusBars = WindowInsets.Type.displayCutout();
                }
                i2 |= statusBars;
            }
        }
        return i2;
    }

    public static int d(byte[] bArr, int i, int i2) {
        while (i < i2 && bArr[i] != 71) {
            i++;
        }
        return i;
    }

    public static long e(pwu pwuVar, int i, int i2) {
        pwuVar.G(i);
        if (pwuVar.a() < 5) {
            return -9223372036854775807L;
        }
        int d = pwuVar.d();
        if ((8388608 & d) != 0 || ((d >> 8) & 8191) != i2 || (d & 32) == 0 || pwuVar.i() < 7 || pwuVar.a() < 7 || (pwuVar.i() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        pwuVar.B(bArr, 0, 6);
        byte b = bArr[0];
        byte b2 = bArr[1];
        byte b3 = bArr[2];
        long j = bArr[3] & 255;
        return ((b2 & 255) << 17) | ((b & 255) << 25) | ((b3 & 255) << 9) | (j + j) | ((bArr[4] & 255) >> 7);
    }
}
