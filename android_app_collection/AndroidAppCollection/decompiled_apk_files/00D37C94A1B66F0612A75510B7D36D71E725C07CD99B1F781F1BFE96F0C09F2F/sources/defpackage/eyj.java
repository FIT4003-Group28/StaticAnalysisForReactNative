package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.youtube.R;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: eyj  reason: default package */
/* loaded from: classes3.dex */
public final class eyj {
    public final afvn a;
    public final azqb b;
    public final vzc c;
    private final akui d;

    public eyj(vzc vzcVar, afvn afvnVar, akui akuiVar, azqb azqbVar) {
        vzcVar.getClass();
        this.c = vzcVar;
        afvnVar.getClass();
        this.a = afvnVar;
        akuiVar.getClass();
        this.d = akuiVar;
        azqbVar.getClass();
        this.b = azqbVar;
    }

    public final void a(final Activity activity, String str) {
        activity.getClass();
        if (true == TextUtils.isEmpty(str)) {
            str = "yt_android_default";
        }
        final Uri parse = Uri.parse(activity.getResources().getString(R.string.youtube_help_uri));
        final Bitmap o = zew.o(activity);
        final String str2 = str;
        this.d.c(str, new akuh() { // from class: eyh
            @Override // defpackage.akuh
            public final void a(Bundle bundle) {
                eyj eyjVar = eyj.this;
                Bitmap bitmap = o;
                String str3 = str2;
                Uri uri = parse;
                Activity activity2 = activity;
                rbi rbiVar = (rbi) eyjVar.b.get();
                rbiVar.e(new eyi(bundle));
                if (bitmap != null) {
                    rbiVar.d(bitmap);
                }
                if (!eyjVar.a.t()) {
                    rbiVar.c();
                }
                GoogleHelp googleHelp = new GoogleHelp(15, str3, null, null, null, null, null, true, true, new ArrayList(), null, null, null, 0, 0, null, null, new ArrayList(), 3, null, new ArrayList(), false, new ErrorReport(), null, 0, null, -1, false, false, 200, null, false);
                googleHelp.u = true;
                googleHelp.q = uri;
                FeedbackOptions a = rbiVar.a();
                File cacheDir = activity2.getCacheDir();
                googleHelp.H = a.q;
                googleHelp.v = new ErrorReport(a, cacheDir);
                googleHelp.v.X = "GoogleHelp";
                if (eyjVar.a.t()) {
                    googleHelp.c = eyjVar.c.b(eyjVar.a.c());
                }
                final rdx rdxVar = new rdx(activity2);
                Intent putExtra = new Intent("com.google.android.gms.googlehelp.HELP").setPackage("com.google.android.gms").putExtra("EXTRA_GOOGLE_HELP", googleHelp);
                if (!putExtra.getAction().equals("com.google.android.gms.googlehelp.HELP") || !putExtra.hasExtra("EXTRA_GOOGLE_HELP")) {
                    throw new IllegalArgumentException("The intent you are trying to launch is not GoogleHelp intent! This class only supports GoogleHelp intents.");
                }
                int b = qse.b(rdxVar.a, 11925000);
                if (b == 0) {
                    Object obj = rdxVar.b.get();
                    rem remVar = (rem) obj;
                    qnm.b(remVar.a);
                    qsx qsxVar = ((qst) obj).D;
                    reh rehVar = new reh(qsxVar, putExtra, new WeakReference(remVar.a));
                    qsxVar.a(rehVar);
                    tnk.i(rehVar);
                    return;
                }
                final Intent data = new Intent("android.intent.action.VIEW").setData(((GoogleHelp) putExtra.getParcelableExtra("EXTRA_GOOGLE_HELP")).q);
                if (b == 7) {
                    b = 7;
                } else if (rdxVar.a.getPackageManager().queryIntentActivities(data, 0).size() > 0) {
                    new rfm(Looper.getMainLooper()).post(new Runnable() { // from class: rdw
                        @Override // java.lang.Runnable
                        public final void run() {
                            rdx rdxVar2 = rdx.this;
                            rdxVar2.a.startActivity(data);
                        }
                    });
                    return;
                }
                Activity activity3 = rdxVar.a;
                if (true == qse.f(activity3, b)) {
                    b = 18;
                }
                qrq.a.f(activity3, b, 0, null);
            }
        });
    }
}
