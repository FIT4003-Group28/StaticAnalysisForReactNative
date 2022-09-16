package defpackage;

import com.google.android.apps.gmm.base.views.expandingscrollview.ExpandingScrollView;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: atcn  reason: default package */
/* loaded from: classes2.dex */
public final class atcn {
    final /* synthetic */ atcp a;
    private final ExpandingScrollView b;
    private atcj c;
    private boolean d = false;

    public atcn(atcp atcpVar, ExpandingScrollView expandingScrollView) {
        this.a = atcpVar;
        this.b = expandingScrollView;
    }

    private final synchronized void d() {
        if (this.d) {
            return;
        }
        this.d = true;
        atcp atcpVar = this.a;
        atcpVar.c.b(atcpVar.d.a());
        atcp atcpVar2 = this.a;
        this.c = atcpVar2.d;
        atcpVar2.c.a().addOnLayoutChangeListener(this.a.l);
        this.b.setContent(this.a.c.a());
        if (!this.a.a.ak().booleanValue()) {
            this.b.setShouldUseRoundedCornersShadow(true);
        }
        this.b.setExpandingState(jjn.COLLAPSED, false);
        this.b.F(this.a.m);
        atcp atcpVar3 = this.a;
        e(atcpVar3.b, atcpVar3.c, atcpVar3.a);
    }

    private static final void e(atmz atmzVar, atcm atcmVar, atna atnaVar) {
        atmzVar.a(athe.f(atcmVar.a(), atmzVar, atnaVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized ExpandingScrollView a() {
        d();
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized atcj b() {
        atcj atcjVar;
        d();
        atcjVar = this.c;
        dbsk.s(atcjVar);
        return atcjVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void c(atcj atcjVar) {
        ExpandingScrollView a = this.a.k.a();
        if (this.c == atcjVar) {
            return;
        }
        this.c = atcjVar;
        this.a.c.b(atcjVar.a());
        atcjVar.c(this.a.a);
        jkc d = this.a.d();
        a.setExpandingStateTransition(d, d, true);
        atcp atcpVar = this.a;
        e(atcpVar.b, atcpVar.c, atcpVar.a);
    }
}
