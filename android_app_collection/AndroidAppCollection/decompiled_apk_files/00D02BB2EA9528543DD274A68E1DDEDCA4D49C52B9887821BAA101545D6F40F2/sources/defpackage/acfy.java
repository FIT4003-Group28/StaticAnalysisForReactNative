package defpackage;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.googlehelp.GoogleHelp;
import java.io.File;
/* compiled from: PG */
/* renamed from: acfy  reason: default package */
/* loaded from: classes2.dex */
final class acfy implements achf {
    final /* synthetic */ String a;
    final /* synthetic */ acgb b;

    public acfy(acgb acgbVar, String str) {
        this.b = acgbVar;
        this.a = str;
    }

    @Override // defpackage.achf
    public final void a(@dzsi Bitmap bitmap) {
        FeedbackOptions b;
        GoogleHelp a = GoogleHelp.a(this.a);
        a.c = acgb.e(this.b.f.m());
        a.q = Uri.parse(cjxr.g());
        a.s = this.b.q.d();
        if (bitmap != null) {
            cocv cocvVar = new cocv();
            cocvVar.d(bitmap);
            b = cocvVar.b();
        } else {
            b = new cocv().b();
        }
        File cacheDir = this.b.b.getCacheDir();
        if (b != null) {
            a.I = null;
        }
        a.v = new ErrorReport(b, cacheDir);
        a.v.X = "GoogleHelp";
        a.H = this.b.r();
        try {
            final Intent b2 = a.b();
            this.b.o.a().G(new Runnable(this, b2) { // from class: acfx
                private final acfy a;
                private final Intent b;

                {
                    this.a = this;
                    this.b = b2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    acfy acfyVar = this.a;
                    acfyVar.b.s(this.b);
                }
            });
        } catch (NullPointerException e) {
            this.b.j(e);
        }
    }
}
