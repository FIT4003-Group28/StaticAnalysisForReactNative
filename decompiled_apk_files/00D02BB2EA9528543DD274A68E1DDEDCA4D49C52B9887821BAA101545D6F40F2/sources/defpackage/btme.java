package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: btme  reason: default package */
/* loaded from: classes4.dex */
public final class btme {
    public final Context a;
    @dzsi
    public String b;
    @dzsi
    public Runnable c;
    public boolean d;

    public btme(Context context) {
        this.a = context;
    }

    public static btme a(Context context) {
        return new btme(context);
    }

    private final boolean g(Runnable runnable, String str) {
        try {
            runnable.run();
            return true;
        } catch (ActivityNotFoundException unused) {
            h();
            return false;
        }
    }

    private final void h() {
        if (this.d) {
            return;
        }
        Runnable runnable = this.c;
        if (runnable == null) {
            Context context = this.a;
            if (!(context instanceof Activity)) {
                return;
            }
            ((Activity) context).runOnUiThread(new Runnable(this) { // from class: btmd
                private final btme a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    Toast.makeText(this.a.a, (int) R.string.FAILED_TO_LAUNCH_APPLICATION, 0).show();
                }
            });
            return;
        }
        runnable.run();
    }

    public final boolean b(@dzsi String str) {
        if (dbsj.d(str)) {
            return false;
        }
        return c(Uri.parse(str));
    }

    public final boolean c(@dzsi final Uri uri) {
        if (uri == null) {
            return false;
        }
        return g(new Runnable(this, uri) { // from class: btlz
            private final btme a;
            private final Uri b;

            {
                this.a = this;
                this.b = uri;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.a.startActivity(new Intent("android.intent.action.VIEW", this.b));
            }
        }, uri.toString());
    }

    public final boolean d(@dzsi final Intent intent) {
        if (intent == null) {
            return false;
        }
        return f(new Runnable(this, intent) { // from class: btma
            private final btme a;
            private final Intent b;

            {
                this.a = this;
                this.b = intent;
            }

            @Override // java.lang.Runnable
            public final void run() {
                btme btmeVar = this.a;
                btmeVar.a.startActivity(this.b);
            }
        }, intent);
    }

    public final boolean e(final ahr ahrVar, @dzsi final String str) {
        if (dbsj.d(str)) {
            return false;
        }
        return g(new Runnable(this, ahrVar, str) { // from class: btmc
            private final btme a;
            private final ahr b;
            private final String c;

            {
                this.a = this;
                this.b = ahrVar;
                this.c = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                btme btmeVar = this.a;
                this.b.a().a(btmeVar.a, Uri.parse(this.c));
            }
        }, str);
    }

    public final boolean f(Runnable runnable, Intent intent) {
        try {
            runnable.run();
            return true;
        } catch (ActivityNotFoundException unused) {
            intent.toString();
            h();
            return false;
        }
    }
}
