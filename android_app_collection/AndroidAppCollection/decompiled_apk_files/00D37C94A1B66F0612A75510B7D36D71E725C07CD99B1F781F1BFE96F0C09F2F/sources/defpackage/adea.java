package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.widget.Button;
import android.widget.Toast;
import com.google.android.libraries.youtube.mdx.manualpairing.PairWithTvActivity;
import com.google.android.libraries.youtube.mdx.manualpairing.TvCodeEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: adea  reason: default package */
/* loaded from: classes.dex */
public final class adea {
    public final dt a;
    public final acti b;
    public final adfa c;
    public final adnq d;
    public final adgc e;
    public TextInputLayout f;
    public TvCodeEditText g;
    public int h;
    public Button i;

    public adea(dt dtVar, acti actiVar, adfa adfaVar, adnq adnqVar, adgc adgcVar) {
        this.a = dtVar;
        this.b = actiVar;
        this.c = adfaVar;
        this.d = adnqVar;
        this.e = adgcVar;
    }

    public static String a(String str) {
        return str.replace(" ", "");
    }

    public final void b() {
        adig b = this.d.b(String.valueOf(this.i.getTag()));
        if (b == null) {
            return;
        }
        this.e.R(b, new joq(3));
        dt dtVar = this.a;
        if (!(dtVar instanceof PairWithTvActivity)) {
            return;
        }
        PairWithTvActivity pairWithTvActivity = (PairWithTvActivity) dtVar;
        pairWithTvActivity.setResult(2);
        pairWithTvActivity.finish();
    }

    public final void c() {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("https://support.google.com/youtube/answer/3230451"));
        try {
            this.a.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            Toast.makeText(this.a, (int) R.string.mdx_use_tv_code_help_page_error, 1).show();
        }
    }
}
