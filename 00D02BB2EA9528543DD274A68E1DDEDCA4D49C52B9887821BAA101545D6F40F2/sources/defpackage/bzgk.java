package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import java.io.File;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: bzgk  reason: default package */
/* loaded from: classes4.dex */
public final class bzgk {
    public static String a(amvh amvhVar) {
        String u = amvhVar.u();
        return u != null ? u : amvhVar.n() ? amvhVar.e.a() : "Unknown";
    }

    public static Intent b(Context context, String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 4 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(" to ");
        sb.append(str2);
        Intent putExtra = new Intent().setAction("android.intent.action.SEND").setType("message/rfc822").setPackage("com.google.android.gm").addFlags(1).putExtra("android.intent.extra.EMAIL", new String[]{"transit-tracks@google.com"}).putExtra("android.intent.extra.SUBJECT", sb.toString());
        String valueOf = String.valueOf(str3);
        String a = bvoc.a(context);
        long c = bvoc.c(context);
        String locale = Locale.getDefault().toString();
        String str5 = Build.HARDWARE;
        String str6 = Build.DEVICE;
        String str7 = Build.DISPLAY;
        String str8 = Build.MANUFACTURER;
        String str9 = Build.MODEL;
        int length = String.valueOf(a).length();
        int length2 = String.valueOf(locale).length();
        int length3 = String.valueOf(str5).length();
        StringBuilder sb2 = new StringBuilder(length + 75 + length2 + length3 + String.valueOf(str6).length() + String.valueOf(str7).length() + String.valueOf(str8).length() + String.valueOf(str9).length());
        sb2.append("\n----------\nBuild: ");
        sb2.append(a);
        sb2.append(" (");
        sb2.append(c);
        sb2.append(")\nLocale: ");
        sb2.append(locale);
        sb2.append('\n');
        sb2.append("Platform: ");
        sb2.append(str5);
        sb2.append(' ');
        sb2.append(str6);
        sb2.append(' ');
        sb2.append(str7);
        sb2.append('\n');
        sb2.append("Device: ");
        sb2.append(str8);
        sb2.append(' ');
        sb2.append(str9);
        sb2.append('\n');
        String valueOf2 = String.valueOf(sb2.toString());
        return putExtra.putExtra("android.intent.extra.TEXT", valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf)).putExtra("attachments", new String[]{Uri.fromFile(new File(str4)).toString()});
    }
}
