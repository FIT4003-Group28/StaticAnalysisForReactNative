package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.Patterns;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.inputmethod.InputMethodManager;
import android.webkit.URLUtil;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.maps.R;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: czph  reason: default package */
/* loaded from: classes.dex */
public final class czph {
    public static final /* synthetic */ int a = 0;
    private static final long b = TimeUnit.DAYS.toMillis(1);

    public static <T extends dssj> T a(T t, byte[] bArr) {
        try {
            return (T) t.Nn().bx(bArr, dsqa.c()).bK();
        } catch (dsrm e) {
            throw new IllegalStateException(e);
        }
    }

    public static boolean b(dubf dubfVar) {
        dubh dubhVar = dubfVar.d;
        if (dubhVar == null) {
            dubhVar = dubh.c;
        }
        return dubhVar.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0180  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0037 -> B:60:0x003b). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.dtzp c(android.content.Context r6) {
        /*
            Method dump skipped, instructions count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.czph.c(android.content.Context):dtzp");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int d() {
        String e = e();
        if (e.contains(".")) {
            e = e.substring(e.lastIndexOf(".") + 1);
        }
        try {
            return Integer.parseInt(e);
        } catch (NumberFormatException unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(e).length() + 59);
            sb.append("Error, failed to parse version release CL string '");
            sb.append(e);
            sb.append("' as int.");
            sb.toString();
            return 340759514;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String e() {
        if (czov.b(dydx.a.a().c(czov.a))) {
            return dydu.a.a().a(czov.a);
        }
        return "1.1.340759514";
    }

    public static void f(Activity activity, TextView textView, String str, czpg czpgVar) {
        Resources resources = activity.getResources();
        String string = resources.getString(R.string.survey_account_and_system_info);
        String string2 = resources.getString(R.string.survey_privacy);
        String string3 = resources.getString(R.string.survey_terms);
        SpannableString spannableString = new SpannableString(resources.getString(R.string.survey_legal_text, string, string2, string3));
        u(spannableString, string, new czpd(czpgVar));
        u(spannableString, string2, new czpe(activity, str));
        u(spannableString, string3, new czpf(activity, str));
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setText(spannableString);
        if (Build.VERSION.SDK_INT < 26) {
            od.c(textView, new daph(textView));
        }
    }

    public static List<mx<String, String>> g(Context context, String str, Bundle bundle) {
        Resources resources = context.getResources();
        dtzp c = c(context);
        dtzl dtzlVar = c.a;
        if (dtzlVar == null) {
            dtzlVar = dtzl.d;
        }
        dspt dsptVar = dtzlVar.c;
        if (dsptVar == null) {
            dsptVar = dspt.c;
        }
        dtzg dtzgVar = dtzlVar.a;
        if (dtzgVar == null) {
            dtzgVar = dtzg.c;
        }
        dtzk dtzkVar = dtzlVar.b;
        if (dtzkVar == null) {
            dtzkVar = dtzk.i;
        }
        dtzo dtzoVar = c.b;
        if (dtzoVar == null) {
            dtzoVar = dtzo.e;
        }
        ArrayList arrayList = new ArrayList(15);
        long nanos = TimeUnit.SECONDS.toNanos(dsptVar.a) + dsptVar.b;
        v(R.string.survey_email_address, str, arrayList, resources);
        v(R.string.survey_timezone_offset, String.format("%02d:%02d:%02d", Long.valueOf(TimeUnit.NANOSECONDS.toHours(nanos)), Long.valueOf(TimeUnit.NANOSECONDS.toMinutes(nanos) - TimeUnit.HOURS.toMinutes(TimeUnit.NANOSECONDS.toHours(nanos))), Long.valueOf(TimeUnit.NANOSECONDS.toSeconds(nanos) - TimeUnit.MINUTES.toSeconds(TimeUnit.NANOSECONDS.toMinutes(nanos)))), arrayList, resources);
        v(R.string.survey_user_agent, dtzgVar.a, arrayList, resources);
        v(R.string.survey_url, dtzgVar.b, arrayList, resources);
        v(R.string.survey_device_model, dtzkVar.a, arrayList, resources);
        v(R.string.survey_brand, dtzkVar.b, arrayList, resources);
        v(R.string.survey_operating_system_version, dtzkVar.d, arrayList, resources);
        v(R.string.survey_app_name, dtzkVar.e, arrayList, resources);
        v(R.string.survey_app_id, dtzkVar.f, arrayList, resources);
        v(R.string.survey_app_version, dtzkVar.g, arrayList, resources);
        v(R.string.survey_google_play_services_version, dtzkVar.h, arrayList, resources);
        int i = dtzkVar.c;
        char c2 = i != 0 ? i != 1 ? i != 2 ? (char) 0 : (char) 4 : (char) 3 : (char) 2;
        String str2 = "UNRECOGNIZED";
        v(R.string.survey_operating_system, c2 == 0 ? str2 : c2 != 2 ? c2 != 3 ? "OS_TYPE_IOS" : "OS_TYPE_ANDROID" : "OS_TYPE_UNKNOWN", arrayList, resources);
        int i2 = dtzoVar.a;
        char c3 = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? (char) 0 : (char) 5 : (char) 4 : (char) 3 : (char) 2;
        if (c3 != 0) {
            str2 = c3 != 2 ? c3 != 3 ? c3 != 4 ? "PLATFORM_IOS" : "PLATFORM_ANDROID" : "PLATFORM_WEB" : "PLATFORM_UNKNOWN";
        }
        v(R.string.survey_platform, str2, arrayList, resources);
        v(R.string.survey_library_version, dtzoVar.b, arrayList, resources);
        StringBuilder sb = new StringBuilder();
        for (String str3 : bundle.keySet()) {
            sb.append(String.format("%s %s %s\n", str3, context.getString(R.string.survey_rightwards_arrow), bundle.get(str3)));
        }
        v(R.string.survey_application_data, sb.toString(), arrayList, resources);
        return arrayList;
    }

    public static Bundle h(dubn dubnVar) {
        dubm dubmVar = dubnVar.a;
        if (dubmVar == null) {
            dubmVar = dubm.c;
        }
        dsrj<dubl> dsrjVar = dubmVar.a;
        int size = dsrjVar.size();
        Bundle bundle = new Bundle(size);
        for (int i = 0; i < size; i++) {
            dubl dublVar = dsrjVar.get(i);
            bundle.putString(dublVar.a, dublVar.b);
        }
        return bundle;
    }

    public static void i(ImageView imageView, Context context, int i) {
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            imageView.setImageDrawable(j(drawable, context, i));
        }
    }

    public static Drawable j(Drawable drawable, Context context, int i) {
        Drawable mutate = drawable.getConstantState().newDrawable(context.getResources()).mutate();
        mutate.setColorFilter(i, PorterDuff.Mode.SRC_ATOP);
        return mutate;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a0  */
    /* JADX WARN: Type inference failed for: r0v2, types: [dsqp, dubj] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v6, types: [dubm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x008c -> B:24:0x008c). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.dubn k(java.util.List<defpackage.mx<java.lang.String, java.lang.String>> r6, android.content.Context r7) {
        /*
            dubm r0 = defpackage.dubm.c
            dsqp r0 = r0.bZ()
            dubj r0 = (defpackage.dubj) r0
            java.util.Iterator r6 = r6.iterator()
        Lc:
            boolean r1 = r6.hasNext()
            r2 = 0
            if (r1 == 0) goto L6a
            java.lang.Object r1 = r6.next()
            mx r1 = (defpackage.mx) r1
            dubl r3 = defpackage.dubl.c
            dsqp r3 = r3.bZ()
            dubk r3 = (defpackage.dubk) r3
            F r4 = r1.a
            java.lang.String r4 = (java.lang.String) r4
            boolean r5 = r3.c
            if (r5 == 0) goto L2e
            r3.bF()
            r3.c = r2
        L2e:
            MessageType extends dsqw<MessageType, BuilderType> r5 = r3.b
            dubl r5 = (defpackage.dubl) r5
            r4.getClass()
            r5.a = r4
            S r1 = r1.b
            java.lang.String r1 = (java.lang.String) r1
            r1.getClass()
            r5.b = r1
            dsqw r1 = r3.bK()
            dubl r1 = (defpackage.dubl) r1
            boolean r3 = r0.c
            if (r3 == 0) goto L4f
            r0.bF()
            r0.c = r2
        L4f:
            MessageType extends dsqw<MessageType, BuilderType> r2 = r0.b
            dubm r2 = (defpackage.dubm) r2
            r1.getClass()
            dsrj<dubl> r3 = r2.a
            boolean r4 = r3.a()
            if (r4 != 0) goto L64
            dsrj r3 = defpackage.dsqw.cl(r3)
            r2.a = r3
        L64:
            dsrj<dubl> r2 = r2.a
            r2.add(r1)
            goto Lc
        L6a:
            android.content.pm.PackageManager r6 = r7.getPackageManager()
            if (r6 == 0) goto L8c
            java.lang.String r7 = r7.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8c
            android.content.pm.PackageInfo r6 = r6.getPackageInfo(r7, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8c
            if (r6 == 0) goto L8c
            java.lang.String r7 = r6.versionName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8c
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8c
            if (r7 != 0) goto L85
            java.lang.String r6 = r6.versionName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8c
            goto L8e
        L85:
            int r6 = r6.versionCode     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8c
            java.lang.String r6 = java.lang.Integer.toString(r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8c
            goto L8e
        L8c:
            java.lang.String r6 = "Unknown"
        L8e:
            dubn r7 = defpackage.dubn.c
            dsqp r7 = r7.bZ()
            dubi r7 = (defpackage.dubi) r7
            dsqw r0 = r0.bK()
            dubm r0 = (defpackage.dubm) r0
            boolean r1 = r7.c
            if (r1 == 0) goto La5
            r7.bF()
            r7.c = r2
        La5:
            MessageType extends dsqw<MessageType, BuilderType> r1 = r7.b
            dubn r1 = (defpackage.dubn) r1
            r0.getClass()
            r1.a = r0
            r6.getClass()
            r1.b = r6
            dsqw r6 = r7.bK()
            dubn r6 = (defpackage.dubn) r6
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.czph.k(java.util.List, android.content.Context):dubn");
    }

    public static void l(View view) {
        ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
    }

    public static void m(View view) {
        ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public static boolean n(Context context) {
        return ((AccessibilityManager) context.getSystemService("accessibility")).isEnabled();
    }

    public static String o(Context context) {
        try {
            return w(context.getPackageManager().getPackageInfo(context.getPackageName(), 64));
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static boolean p(duch duchVar) {
        return duchVar != null && !duchVar.a.isEmpty() && !duchVar.b.u();
    }

    public static String q(String str) {
        if (!TextUtils.isEmpty(str) && Patterns.WEB_URL.matcher(dbqa.a(str)).matches() && (URLUtil.isHttpUrl(str) || URLUtil.isHttpsUrl(str))) {
            Uri parse = Uri.parse(str);
            try {
                return new URI(parse.getScheme(), parse.getAuthority(), parse.getPath(), parse.getQuery() != null ? URLEncoder.encode(parse.getQuery(), "utf-8") : "").toString();
            } catch (UnsupportedEncodingException | URISyntaxException e) {
                e.getMessage();
            }
        }
        return "";
    }

    public static boolean r(dubf dubfVar) {
        duck duckVar;
        if (dubfVar.e.size() <= 1) {
            dubq dubqVar = dubfVar.e.get(0);
            int a2 = dubp.a(dubqVar.g);
            if (a2 == 0 || a2 != 3) {
                int a3 = dubp.a(dubqVar.g);
                if (a3 != 0 && a3 == 5) {
                    return false;
                }
            } else {
                if (dubqVar.a == 4) {
                    duckVar = (duck) dubqVar.b;
                } else {
                    duckVar = duck.c;
                }
                dtzc dtzcVar = duckVar.a;
                if (dtzcVar == null) {
                    dtzcVar = dtzc.b;
                }
                for (dtza dtzaVar : dtzcVar.a) {
                    int a4 = dtyy.a(dtzaVar.a);
                    if (a4 != 0 && a4 == 4) {
                        return true;
                    }
                }
                return false;
            }
        }
        return true;
    }

    public static Drawable s(Context context) {
        return j(context.getDrawable(2131232578), context, akm.c(context, R.color.survey_close_icon_color));
    }

    public static boolean t(long j) {
        return System.currentTimeMillis() - j > b;
    }

    private static void u(Spannable spannable, String str, ClickableSpan clickableSpan) {
        int indexOf = spannable.toString().indexOf(str);
        int length = str.length() + indexOf;
        if (indexOf >= 0) {
            spannable.setSpan(clickableSpan, indexOf, length, 0);
        }
    }

    private static void v(int i, String str, List<mx<String, String>> list, Resources resources) {
        if (!TextUtils.isEmpty(str)) {
            list.add(new mx<>(resources.getString(i), str));
        }
    }

    private static String w(PackageInfo packageInfo) {
        if (packageInfo.signatures == null || packageInfo.signatures.length <= 0) {
            return null;
        }
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(packageInfo.signatures[0].toByteArray());
            if (digest == null) {
                return null;
            }
            int length = digest.length;
            StringBuilder sb = new StringBuilder(length + length);
            for (int i = 0; i < length; i++) {
                sb.append(String.format("%02x", Byte.valueOf(digest[i])));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }
}
