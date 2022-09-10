package defpackage;

import android.app.ApplicationErrorReport;
import android.graphics.Bitmap;
import android.os.Bundle;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.feedback.FileTeleporter;
import com.google.android.gms.feedback.ThemeSettings;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: cocv  reason: default package */
/* loaded from: classes.dex */
public class cocv {
    public String a;
    public String c;
    public String d;
    public boolean e;
    public ThemeSettings f;
    ApplicationErrorReport g;
    private Bitmap h;
    private boolean j;
    private final String k;
    public final Bundle b = new Bundle();
    private final List<FileTeleporter> i = new ArrayList();

    @Deprecated
    public cocv() {
        long currentTimeMillis = System.currentTimeMillis();
        long abs = Math.abs(new SecureRandom().nextLong());
        StringBuilder sb = new StringBuilder(41);
        sb.append(currentTimeMillis);
        sb.append("-");
        sb.append(abs);
        this.k = sb.toString();
    }

    public final void a(boolean z) {
        if ((!this.b.isEmpty() || !this.i.isEmpty()) && this.j != z) {
            throw new IllegalStateException("Can't mix pii-full psd and pii-free psd");
        }
        this.j = z;
    }

    public FeedbackOptions b() {
        FeedbackOptions feedbackOptions = new FeedbackOptions(null, null, null, new ApplicationErrorReport(), null, null, null, null, true, null, null, false, null, null, false, 0L);
        feedbackOptions.m = this.h;
        feedbackOptions.f = null;
        feedbackOptions.a = this.a;
        feedbackOptions.c = this.c;
        feedbackOptions.b = this.b;
        feedbackOptions.e = this.d;
        feedbackOptions.h = this.i;
        feedbackOptions.i = this.e;
        feedbackOptions.j = this.f;
        feedbackOptions.k = null;
        feedbackOptions.l = this.j;
        feedbackOptions.n = this.k;
        feedbackOptions.o = false;
        feedbackOptions.p = 0L;
        return feedbackOptions;
    }

    public final void c(String str, String str2) {
        a(true);
        this.b.putString(str, str2);
    }

    public final void d(Bitmap bitmap) {
        if (!this.e || !dxzd.a.a().a()) {
            this.h = bitmap;
            return;
        }
        throw new IllegalStateException("Can't call setScreenshotBitmap after report is already certified pii free.");
    }
}
