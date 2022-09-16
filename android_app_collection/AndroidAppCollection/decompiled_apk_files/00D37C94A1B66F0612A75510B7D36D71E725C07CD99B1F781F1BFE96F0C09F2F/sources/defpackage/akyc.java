package defpackage;

import android.content.ContentResolver;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: akyc  reason: default package */
/* loaded from: classes.dex */
public final class akyc {
    public static final String[] a = {"_id", "mime_type", "duration", "latitude", "longitude", "_size"};
    private static final Pattern c = Pattern.compile("^(\\p{Digit}+@)?media");
    public final ContentResolver b;

    public akyc(ContentResolver contentResolver) {
        this.b = contentResolver;
    }

    public static Uri a(Intent intent) {
        String action;
        Uri uri;
        return (intent == null || (action = intent.getAction()) == null || !action.equals("com.google.android.youtube.intent.action.INTERNAL_UPLOAD") || (uri = (Uri) intent.getParcelableExtra("com.google.android.libraries.youtube.upload.extra_upload_activity_edited_video_uri")) == null) ? Uri.EMPTY : uri;
    }

    public static ampq b(Intent intent) {
        if (intent == null || !intent.hasExtra("com.google.android.libraries.youtube.upload.extra_upload_activity_video_shorts_creation")) {
            return amon.a;
        }
        byte[] byteArrayExtra = intent.getByteArrayExtra("com.google.android.libraries.youtube.upload.extra_upload_activity_video_shorts_creation");
        if (byteArrayExtra == null) {
            return amon.a;
        }
        try {
            return ampq.i((awbb) aopi.parseFrom(awbb.a, byteArrayExtra, aoos.b()));
        } catch (aopx unused) {
            return amon.a;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static avuk c(Intent intent) {
        char c2;
        String action = intent.getAction();
        if (action == null) {
            return avuk.UPLOAD_FLOW_SOURCE_UNKNOWN;
        }
        switch (action.hashCode()) {
            case -1173264947:
                if (action.equals("android.intent.action.SEND")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case -58484670:
                if (action.equals("android.intent.action.SEND_MULTIPLE")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 895964971:
                if (action.equals("com.google.android.youtube.intent.action.INTERNAL_UPLOAD")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 1004674969:
                if (action.equals("com.google.android.youtube.intent.action.UPLOAD")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        if (c2 == 0) {
            avuk b = avuk.b(intent.getIntExtra("com.google.android.libraries.youtube.upload.extra_upload_activity_upload_flow_source", 4));
            return b != null ? b : avuk.UPLOAD_FLOW_SOURCE_YOUTUBE_APP_INTERNAL;
        } else if (c2 != 1 && c2 != 2 && c2 != 3) {
            return avuk.UPLOAD_FLOW_SOURCE_UNKNOWN;
        } else {
            int intExtra = intent.getIntExtra("com.google.android.libraries.youtube.upload.extra_upload_activity_upload_flow_source", 5);
            avuk b2 = avuk.b(intExtra);
            if (b2 == null) {
                b2 = avuk.UPLOAD_FLOW_SOURCE_EXTERNAL;
            }
            return (intExtra < 64 || intExtra > 127) ? avuk.UPLOAD_FLOW_SOURCE_EXTERNAL : b2;
        }
    }

    public static Long d(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex < 0 || cursor.isNull(columnIndex)) {
            return null;
        }
        return Long.valueOf(cursor.getLong(columnIndex));
    }

    public static Long e(Intent intent) {
        if (intent == null || !intent.hasExtra("com.google.android.libraries.youtube.upload.extra_upload_activity_video_duration_ms")) {
            return null;
        }
        Long valueOf = Long.valueOf(intent.getLongExtra("com.google.android.libraries.youtube.upload.extra_upload_activity_video_duration_ms", 0L));
        if (valueOf.longValue() > 0) {
            return valueOf;
        }
        return null;
    }

    public static boolean f(Uri uri) {
        String scheme = uri.getScheme();
        if (TextUtils.isEmpty(scheme)) {
            return false;
        }
        if ("file".equals(scheme)) {
            return true;
        }
        if ("content".equals(scheme)) {
            String authority = uri.getAuthority();
            if (!TextUtils.isEmpty(authority)) {
                return c.matcher(authority).matches();
            }
        }
        return false;
    }

    public static boolean g(Intent intent) {
        return intent.getBooleanExtra("com.google.android.libraries.youtube.upload.extra_upload_activity_uses_yt_audio_source", false);
    }

    public static boolean h(avuk avukVar) {
        avuk avukVar2 = avuk.UPLOAD_FLOW_SOURCE_UNKNOWN;
        alcu alcuVar = alcu.UNKNOWN_UPLOAD;
        switch (avukVar.ordinal()) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 6:
            case 7:
            case 8:
                return false;
            case 5:
            default:
                return true;
        }
    }

    public static boolean i(avuk avukVar) {
        avuk avukVar2 = avuk.UPLOAD_FLOW_SOURCE_UNKNOWN;
        alcu alcuVar = alcu.UNKNOWN_UPLOAD;
        int ordinal = avukVar.ordinal();
        return ordinal == 7 || ordinal == 8;
    }

    public static boolean j(Intent intent) {
        if (intent == null) {
            return false;
        }
        return intent.getBooleanExtra("com.google.android.libraries.youtube.upload.extra_upload_activity_hide_preview", false);
    }

    public static alcu k(int i) {
        avuk avukVar = avuk.UPLOAD_FLOW_SOURCE_UNKNOWN;
        alcu alcuVar = alcu.UNKNOWN_UPLOAD;
        int i2 = i - 1;
        if (i2 != 1) {
            if (i2 == 2) {
                return alcu.REELS_UPLOAD;
            }
            if (i2 == 4) {
                return alcu.FEEDBACK_ONLY_UPLOAD;
            }
            if (i2 == 5) {
                return alcu.LIVE_HIGHLIGHT_UPLOAD;
            }
            if (i2 == 6) {
                return alcu.SHORTS_UPLOAD;
            }
            zep.b("Unsupported upload flow flavor.");
            return alcu.UNKNOWN_UPLOAD;
        }
        return alcu.NORMAL_UPLOAD;
    }

    public static int l(Intent intent) {
        int ak;
        if (intent == null || (ak = awwc.ak(intent.getIntExtra("com.google.android.libraries.youtube.upload.extra_upload_activity_upload_flow_flavor", 1))) == 0) {
            return 2;
        }
        return ak;
    }

    public static int m(alcu alcuVar) {
        if (alcuVar == null) {
            return 1;
        }
        avuk avukVar = avuk.UPLOAD_FLOW_SOURCE_UNKNOWN;
        int ordinal = alcuVar.ordinal();
        if (ordinal == 1) {
            return 2;
        }
        if (ordinal == 2) {
            return 5;
        }
        if (ordinal == 3) {
            return 3;
        }
        if (ordinal == 4) {
            return 6;
        }
        if (ordinal == 5) {
            return 7;
        }
        zep.b("Unsupported upload type.");
        return 1;
    }

    public static aopa n(aypx aypxVar, aopa aopaVar, Object obj, String str) {
        if (obj != null) {
            try {
                return (aopa) aypxVar.a(aopaVar, obj);
            } catch (Exception unused) {
                zep.l("Cannot apply media store video metadata.");
            }
        }
        zep.l(str);
        return aopaVar;
    }
}
