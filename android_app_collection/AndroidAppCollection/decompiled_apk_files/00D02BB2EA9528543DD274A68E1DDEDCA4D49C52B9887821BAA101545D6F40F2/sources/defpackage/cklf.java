package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.OfflineSuggestion;
import java.util.ArrayList;
import java.util.Set;
/* compiled from: PG */
/* renamed from: cklf  reason: default package */
/* loaded from: classes4.dex */
public class cklf {
    private static final dcqe c = dcqe.c("cklf");
    public final cjqy a;
    public final dzsj<codt> b;
    private final Activity d;
    private final dxio<akfa> e;
    private final dbsg<dxio<afha>> f;
    private final gce g;
    private final Set<OfflineSuggestion> h;

    public cklf(Activity activity, dxio<akfa> dxioVar, dbsg<dxio<afha>> dbsgVar, cjqy cjqyVar, gce gceVar, Set<OfflineSuggestion> set, dzsj<codt> dzsjVar) {
        this.d = activity;
        this.e = dxioVar;
        this.f = dbsgVar;
        this.a = cjqyVar;
        this.g = gceVar;
        this.h = set;
        this.b = dzsjVar;
    }

    public final void a(String str) {
        b(str, null);
    }

    public final void b(final String str, @dzsi final String str2) {
        if (this.f.a()) {
            this.f.b().a().G(new Runnable(this, str, str2) { // from class: ckld
                private final cklf a;
                private final String b;
                private final String c;

                {
                    this.a = this;
                    this.b = str;
                    this.c = str2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    cklf cklfVar = this.a;
                    cklfVar.b.a().a(cklfVar.c(this.b, this.c));
                }
            });
            return;
        }
        if (this.d instanceof gga) {
            bvoo.h("Should not directly launch intents in GmmActivity.", new Object[0]);
        }
        this.b.a().a(c(str, str2));
    }

    public final Intent c(String str, @dzsi String str2) {
        GoogleHelp a = GoogleHelp.a(str);
        a.c = this.e.a().m();
        a.q = Uri.parse(cjxr.g());
        a.t = new ArrayList(this.h);
        a.s = d();
        if (!TextUtils.isEmpty(str2)) {
            a.F = str2;
        }
        return a.b();
    }

    public final ThemeSettings d() {
        ThemeSettings themeSettings = new ThemeSettings();
        themeSettings.a = true != this.g.h() ? 0 : 2;
        return themeSettings;
    }

    public final ClickableSpan e(String str) {
        return f(str, null);
    }

    public final ClickableSpan f(String str, @dzsi cjtd cjtdVar) {
        return new ckle(this, str, cjtdVar);
    }

    public final ClickableSpan g(String str, int i) {
        return new ckle(this, str, i, true, false);
    }

    public final ClickableSpan h(String str, int i, @dzsi cjtd cjtdVar) {
        return new ckle(this, str, i, cjtdVar);
    }

    public final ClickableSpan i() {
        return new ckle(this, "android_offline_maps", 0, false, true);
    }
}
