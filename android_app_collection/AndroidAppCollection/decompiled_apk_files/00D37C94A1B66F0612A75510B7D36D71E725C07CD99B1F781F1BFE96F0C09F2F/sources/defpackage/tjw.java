package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Map;
/* compiled from: PG */
/* renamed from: tjw  reason: default package */
/* loaded from: classes4.dex */
public final class tjw {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static Activity a(View view) {
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    public static String b(Map map, Map map2, String str, String str2) {
        ArrayList arrayList = new ArrayList();
        for (String str3 : map2.keySet()) {
            String a = ((tkk) map2.get(str3)).a(map);
            if (a != null) {
                arrayList.add(String.format("%s=%s", str3, a));
            }
        }
        String join = TextUtils.join("&", arrayList);
        if (str != null) {
            String valueOf = String.valueOf(join);
            String valueOf2 = String.valueOf(str2);
            String e = e(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
            if (e == null) {
                return join;
            }
            String valueOf3 = String.valueOf(join);
            String valueOf4 = String.valueOf(String.format("&%s=%s", str, e.substring(e.length() - 8)));
            return valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3);
        }
        return join;
    }

    public static int c(int i) {
        switch (i) {
            case -1:
                return 1;
            case 0:
                return 2;
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 5;
            case 4:
                return 6;
            case 5:
                return 7;
            case 6:
                return 8;
            case 7:
            default:
                return 0;
            case 8:
                return 10;
            case 9:
                return 11;
            case 10:
                return 12;
            case 11:
                return 13;
            case 12:
                return 14;
            case 13:
                return 15;
            case 14:
                return 16;
            case 15:
                return 17;
            case 16:
                return 18;
        }
    }

    public static Intent d(ueq ueqVar) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("google://lens"));
        intent.setPackage("com.google.android.googlequicksearchbox");
        ueqVar.a.putLong("start_activity_time_nanos", SystemClock.elapsedRealtimeNanos());
        intent.putExtra("lens_activity_params", ueqVar.a);
        if (ueqVar.a.containsKey("handover_session_id") && ueqVar.d() != 0) {
            intent.putExtra("handover-session-id", ueqVar.d());
        }
        return intent;
    }

    private static String e(String str) {
        try {
            return new BigInteger(1, MessageDigest.getInstance("MD5").digest(str.getBytes())).toString(16);
        } catch (ArithmeticException | NoSuchAlgorithmException unused) {
            return null;
        }
    }
}
