package defpackage;

import android.app.Notification;
import android.media.session.MediaSession;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.util.Log;
/* compiled from: PG */
/* renamed from: asf  reason: default package */
/* loaded from: classes2.dex */
public final class asf {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static Notification.MediaStyle a() {
        return new Notification.MediaStyle();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Notification.MediaStyle b(Notification.MediaStyle mediaStyle, int[] iArr, MediaSessionCompat$Token mediaSessionCompat$Token) {
        if (iArr != null) {
            e(mediaStyle, iArr);
        }
        if (mediaSessionCompat$Token != null) {
            c(mediaStyle, (MediaSession.Token) mediaSessionCompat$Token.b);
        }
        return mediaStyle;
    }

    static void c(Notification.MediaStyle mediaStyle, MediaSession.Token token) {
        mediaStyle.setMediaSession(token);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(Notification.Builder builder, Notification.MediaStyle mediaStyle) {
        builder.setStyle(mediaStyle);
    }

    static void e(Notification.MediaStyle mediaStyle, int... iArr) {
        mediaStyle.setShowActionsInCompactView(iArr);
    }

    public static void f(long j, pwu pwuVar, bab[] babVarArr) {
        int i;
        while (true) {
            boolean z = true;
            if (pwuVar.a() > 1) {
                int h = h(pwuVar);
                int h2 = h(pwuVar);
                int i2 = pwuVar.b + h2;
                if (h2 == -1 || h2 > pwuVar.a()) {
                    Log.w("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                    i2 = pwuVar.c;
                } else if (h == 4 && h2 >= 8) {
                    int i3 = pwuVar.i();
                    int m = pwuVar.m();
                    if (m == 49) {
                        i = pwuVar.d();
                        m = 49;
                    } else {
                        i = 0;
                    }
                    int i4 = pwuVar.i();
                    if (m == 47) {
                        pwuVar.H(1);
                        m = 47;
                    }
                    boolean z2 = i3 == 181 && (m == 49 || m == 47) && i4 == 3;
                    if (m == 49) {
                        if (i != 1195456820) {
                            z = false;
                        }
                        z2 &= z;
                    }
                    if (z2) {
                        g(j, pwuVar, babVarArr);
                    }
                }
                pwuVar.G(i2);
            } else {
                return;
            }
        }
    }

    public static void g(long j, pwu pwuVar, bab[] babVarArr) {
        int i = pwuVar.i();
        if ((i & 64) != 0) {
            pwuVar.H(1);
            int i2 = (i & 31) * 3;
            int i3 = pwuVar.b;
            for (bab babVar : babVarArr) {
                pwuVar.G(i3);
                babVar.c(pwuVar, i2);
                babVar.e(j, 1, i2, 0, null);
            }
        }
    }

    private static int h(pwu pwuVar) {
        int i = 0;
        while (pwuVar.a() != 0) {
            int i2 = pwuVar.i();
            i += i2;
            if (i2 != 255) {
                return i;
            }
        }
        return -1;
    }
}
