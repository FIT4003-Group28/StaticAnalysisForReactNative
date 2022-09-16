package defpackage;

import android.app.ApplicationErrorReport;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import com.google.android.gms.feedback.FeedbackOptions;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: rbi  reason: default package */
/* loaded from: classes4.dex */
public class rbi {
    public final Bundle a;
    public String b;
    public String c;
    public boolean d;
    ApplicationErrorReport e;
    private Bitmap f;
    private String g;
    private final List h;
    private boolean i;
    private String j;
    private tzh k;

    @Deprecated
    public rbi() {
        this.a = new Bundle();
        this.h = new ArrayList();
        this.e = new ApplicationErrorReport();
        this.j = tzh.q();
    }

    public FeedbackOptions a() {
        FeedbackOptions feedbackOptions = new FeedbackOptions(new ApplicationErrorReport());
        feedbackOptions.m = this.f;
        feedbackOptions.f = null;
        feedbackOptions.a = this.g;
        feedbackOptions.c = this.b;
        feedbackOptions.b = this.a;
        feedbackOptions.e = this.c;
        feedbackOptions.h = this.h;
        feedbackOptions.i = this.d;
        feedbackOptions.j = null;
        feedbackOptions.k = null;
        feedbackOptions.l = this.i;
        feedbackOptions.q = this.k;
        feedbackOptions.n = this.j;
        feedbackOptions.o = false;
        feedbackOptions.p = 0L;
        return feedbackOptions;
    }

    public final void b(boolean z) {
        if ((!this.a.isEmpty() || !this.h.isEmpty()) && this.i != z) {
            throw new IllegalStateException("Can't mix pii-full psd and pii-free psd");
        }
        this.i = z;
    }

    public final void c() {
        this.g = "anonymous";
    }

    public final void d(Bitmap bitmap) {
        if (!this.d || !axrm.a.get().a()) {
            this.f = bitmap;
            return;
        }
        throw new IllegalStateException("Can't call setScreenshotBitmap after report is already certified pii free.");
    }

    public final void e(tzh tzhVar) {
        b(false);
        this.k = tzhVar;
    }

    public rbi(Context context) {
        String q;
        rxq.b(context);
        this.a = new Bundle();
        this.h = new ArrayList();
        this.e = new ApplicationErrorReport();
        try {
            if (((Boolean) rbq.b.a()).booleanValue()) {
                long currentTimeMillis = System.currentTimeMillis();
                long abs = Math.abs(new SecureRandom().nextLong());
                StringBuilder sb = new StringBuilder(41);
                sb.append(currentTimeMillis);
                sb.append("_");
                sb.append(abs);
                q = sb.toString();
            } else {
                q = tzh.q();
            }
            this.j = q;
        } catch (SecurityException unused) {
            this.j = tzh.q();
        }
    }
}
