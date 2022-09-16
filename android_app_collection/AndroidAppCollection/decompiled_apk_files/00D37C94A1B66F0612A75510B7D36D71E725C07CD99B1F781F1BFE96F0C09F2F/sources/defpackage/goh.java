package defpackage;

import android.app.Activity;
import com.google.android.apps.youtube.app.extensions.accountlinking.AccountLinkingController;
/* compiled from: PG */
/* renamed from: goh  reason: default package */
/* loaded from: classes3.dex */
public final class goh {
    public final Activity a;
    public final AccountLinkingController b;
    public final ajxz c;
    public boolean d;
    public jxt e;
    private final acti f;
    private boolean g;
    private boolean h;

    public goh(Activity activity, AccountLinkingController accountLinkingController, ajxz ajxzVar, ypf ypfVar, acti actiVar) {
        this.a = activity;
        this.b = accountLinkingController;
        this.c = ajxzVar;
        this.f = actiVar;
        accountLinkingController.d.R().i(aynq.LATEST).h(zhn.b(ypfVar.a())).Z(new ayqb() { // from class: gog
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                goh gohVar = goh.this;
                gohVar.d = ((Boolean) obj).booleanValue();
                gohVar.c();
            }
        });
    }

    public final void a() {
        acte a = acte.a(this.b.g());
        if (a == null) {
            return;
        }
        this.f.D(a);
        if (this.h) {
            this.f.u(a, null);
        } else {
            this.f.q(a, null);
        }
    }

    public final void b(boolean z) {
        this.g = z;
        c();
    }

    public final void c() {
        boolean z = this.g && this.d && this.e != null;
        if (z == this.h) {
            return;
        }
        this.h = z;
        if (z) {
            aowi g = this.b.g();
            if (g == null || (g.b & 1) == 0) {
                throw new IllegalStateException("Presence is shared but unable to show disclosure");
            }
            jxt jxtVar = this.e;
            arag aragVar = g.c;
            if (aragVar == null) {
                aragVar = arag.a;
            }
            jxtVar.c = ajgl.b(aragVar).toString();
            this.e.g(true);
            return;
        }
        jxt jxtVar2 = this.e;
        jxtVar2.c = "";
        jxtVar2.g(false);
    }
}
