package defpackage;

import android.content.Intent;
import android.media.MediaFormat;
import android.net.Uri;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.libraries.youtube.livecreation.ui.LiveCreationActivity;
import java.io.DataInputStream;
import java.net.ProtocolException;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: achj  reason: default package */
/* loaded from: classes.dex */
public final class achj {
    private static achj a;

    private achj() {
    }

    public static Uri a(Intent intent) {
        Uri parse;
        Parcelable parcelableExtra = intent.getParcelableExtra("android.intent.extra.REFERRER");
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER");
        if (parcelableExtra == null || !(parcelableExtra instanceof Uri)) {
            parse = stringExtra != null ? Uri.parse(stringExtra) : null;
        } else {
            parse = (Uri) parcelableExtra;
        }
        if (parse == null || !"android-app".equals(parse.getScheme()) || TextUtils.isEmpty(parse.getPath())) {
            return null;
        }
        return parse;
    }

    public static boolean b(Intent intent) {
        return (intent == null || a(intent) == null) ? false : true;
    }

    public static void c(LiveCreationActivity liveCreationActivity, Object obj) {
        liveCreationActivity.Z = (abss) obj;
    }

    public static final double d(DataInputStream dataInputStream) {
        g(0, dataInputStream);
        return dataInputStream.readDouble();
    }

    public static final Object e(DataInputStream dataInputStream) {
        byte readByte = dataInputStream.readByte();
        if (readByte != 0) {
            if (readByte == 5) {
                return null;
            }
            if (readByte == 8) {
                dataInputStream.readInt();
                return f(dataInputStream);
            } else if (readByte == 2) {
                return dataInputStream.readUTF();
            } else {
                if (readByte == 3) {
                    return f(dataInputStream);
                }
                StringBuilder sb = new StringBuilder(33);
                sb.append("Unsupported AMF type: ");
                sb.append((int) readByte);
                throw new ProtocolException(sb.toString());
            }
        }
        return Double.valueOf(dataInputStream.readDouble());
    }

    public static final Map f(DataInputStream dataInputStream) {
        HashMap hashMap = new HashMap();
        while (true) {
            String readUTF = dataInputStream.readUTF();
            if (readUTF.length() != 0) {
                hashMap.put(readUTF, e(dataInputStream));
            } else {
                g(9, dataInputStream);
                return hashMap;
            }
        }
    }

    public static final void g(int i, DataInputStream dataInputStream) {
        byte readByte = dataInputStream.readByte();
        if (readByte == i) {
            return;
        }
        StringBuilder sb = new StringBuilder(47);
        sb.append("Expected AMF type ");
        sb.append(i);
        sb.append(", got: ");
        sb.append((int) readByte);
        throw new ProtocolException(sb.toString());
    }

    public static final acbb h(MediaFormat mediaFormat, acbc acbcVar, acbw acbwVar) {
        mediaFormat.getClass();
        if (!abxb.b(mediaFormat)) {
            Log.e("AudioEncoderFactory", "Not an audio format");
            return null;
        }
        try {
            return new acbb(mediaFormat, acbcVar, acbwVar);
        } catch (Exception e) {
            Log.e("AudioEncoderFactory", "Could not create audio encoder", e);
            return null;
        }
    }

    public static void i() {
        if (a == null) {
            a = new achj();
        }
    }
}
