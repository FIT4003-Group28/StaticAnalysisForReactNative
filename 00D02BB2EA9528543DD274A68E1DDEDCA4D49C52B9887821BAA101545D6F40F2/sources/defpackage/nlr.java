package defpackage;

import android.content.Intent;
import android.text.TextUtils;
import com.google.android.apps.auto.sdk.nav.ClientMode;
import com.google.android.apps.auto.sdk.nav.suggestion.NavigationSuggestion;
/* compiled from: PG */
/* renamed from: nlr  reason: default package */
/* loaded from: classes.dex */
public final class nlr extends cns {
    public boolean d;
    public boolean e;
    final /* synthetic */ nls f;

    public nlr(nls nlsVar) {
        this.f = nlsVar;
    }

    @Override // defpackage.cns
    public final void d() {
        if (this.d) {
            return;
        }
        this.d = true;
        if (!this.e) {
            return;
        }
        f();
    }

    @Override // defpackage.cns
    public final void e() {
        if (!this.d) {
            return;
        }
        this.d = false;
        if (!this.e) {
            return;
        }
        g();
    }

    public final void f() {
        dbsk.l(this.e);
        dbsk.l(this.d);
        nlo nloVar = this.f.f;
        synchronized (nloVar.a) {
            nloVar.c = true;
            nloVar.a(nloVar.b);
        }
        this.f.a();
        nlz nlzVar = this.f.g;
        dbsk.s(nlzVar);
        nlzVar.e();
    }

    public final void g() {
        dbsk.l(this.e);
        dbsk.l(!this.d);
        this.f.a();
        nlz nlzVar = this.f.g;
        dbsk.s(nlzVar);
        nlzVar.f();
        nlo nloVar = this.f.f;
        synchronized (nloVar.a) {
            nloVar.c = false;
        }
    }

    @Override // defpackage.cns
    public final void c(NavigationSuggestion navigationSuggestion) {
        ddho ddhoVar;
        ClientMode clientMode = this.f.e;
        if (clientMode == null) {
            return;
        }
        int i = clientMode.a;
        if (i == 1) {
            ddhoVar = dtxm.aJ;
        } else if (i != 2) {
            return;
        } else {
            ddhoVar = dtye.c;
        }
        CharSequence charSequence = navigationSuggestion.b;
        cjta b = cjtd.b();
        b.d = ddhoVar;
        Intent intent = navigationSuggestion.a;
        String stringExtra = intent.getStringExtra("ved");
        if (!TextUtils.isEmpty(stringExtra)) {
            b.g(stringExtra);
        }
        String stringExtra2 = intent.getStringExtra("ei");
        if (!TextUtils.isEmpty(stringExtra2)) {
            b.b = stringExtra2;
        }
        cjtd a = b.a();
        this.f.a.a().n(this.f.b.a().g().d(a), new cjte(deaf.SWIPE), a);
    }
}
