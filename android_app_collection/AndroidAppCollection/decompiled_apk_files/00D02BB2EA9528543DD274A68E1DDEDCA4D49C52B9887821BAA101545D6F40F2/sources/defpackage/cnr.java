package defpackage;

import com.google.android.apps.auto.sdk.nav.suggestion.NavigationSuggestion;
/* compiled from: PG */
/* renamed from: cnr  reason: default package */
/* loaded from: classes5.dex */
final class cnr extends coa {
    final /* synthetic */ cns a;

    public cnr(cns cnsVar) {
        this.a = cnsVar;
    }

    @Override // defpackage.cob
    public final void b(NavigationSuggestion navigationSuggestion) {
        this.a.b.a(new cnn(this, navigationSuggestion));
    }

    @Override // defpackage.cob
    public final void c() {
        this.a.b.a(new cnp(this));
    }

    @Override // defpackage.cob
    public final void d() {
        this.a.b.a(new cnq(this));
    }

    @Override // defpackage.cob
    public final void e(cnz cnzVar) {
        synchronized (this.a) {
            this.a.c = cnzVar;
        }
    }

    @Override // defpackage.cob
    public final void f() {
        this.a.b.a(new cno());
    }
}
