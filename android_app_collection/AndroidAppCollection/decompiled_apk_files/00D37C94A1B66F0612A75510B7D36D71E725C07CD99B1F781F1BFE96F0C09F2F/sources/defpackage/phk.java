package defpackage;

import android.content.Context;
import android.media.AudioManager;
import java.util.UUID;
/* compiled from: PG */
/* renamed from: phk  reason: default package */
/* loaded from: classes4.dex */
public final class phk {
    public static final UUID a = new UUID(0, 0);
    public static final UUID b = new UUID(1186680826959645954L, -5988876978535335093L);
    public static final UUID c = new UUID(-2129748144642739255L, 8654423357094679310L);
    public static final UUID d = new UUID(-1301668207276963122L, -6645017420763422227L);
    public static final UUID e = new UUID(-7348484286925749626L, -6083546864340672619L);

    public static int a(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return -1;
        }
        return audioManager.generateAudioSessionId();
    }

    public static int b(int i) {
        if (i == 2 || i == 4) {
            return 6005;
        }
        if (i == 10) {
            return 6004;
        }
        if (i == 7) {
            return 6005;
        }
        if (i == 8) {
            return 6003;
        }
        switch (i) {
            case 15:
                return 6003;
            case 16:
            case 18:
                return 6005;
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                return 6004;
            default:
                switch (i) {
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        return 6002;
                    default:
                        return 6006;
                }
        }
    }

    public static long c(long j) {
        return (j == -9223372036854775807L || j == Long.MIN_VALUE) ? j : j * 1000;
    }

    public static long d(long j) {
        return (j == -9223372036854775807L || j == Long.MIN_VALUE) ? j : j / 1000;
    }

    public static String e(int i) {
        if (i != 0) {
            if (i == 1) {
                return "NO_UNSUPPORTED_TYPE";
            }
            if (i == 2) {
                return "NO_UNSUPPORTED_DRM";
            }
            if (i == 3) {
                return "NO_EXCEEDS_CAPABILITIES";
            }
            if (i != 4) {
                throw new IllegalStateException();
            }
            return "YES";
        }
        return "NO";
    }
}
