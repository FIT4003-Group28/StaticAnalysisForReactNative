package defpackage;

import com.google.android.libraries.onegoogle.expresssignin.ExpressSignInLayout;
/* compiled from: PG */
/* renamed from: unw  reason: default package */
/* loaded from: classes4.dex */
public final class unw extends uuo {
    final /* synthetic */ ExpressSignInLayout a;

    public unw(ExpressSignInLayout expressSignInLayout) {
        this.a = expressSignInLayout;
    }

    @Override // defpackage.uuo
    public final void b(final Object obj) {
        umr.b(new Runnable() { // from class: unv
            @Override // java.lang.Runnable
            public final void run() {
                unw unwVar = unw.this;
                Object obj2 = obj;
                ExpressSignInLayout expressSignInLayout = unwVar.a;
                expressSignInLayout.k(expressSignInLayout.e.b.d(), obj2);
            }
        });
    }

    @Override // defpackage.uuo
    public final void c() {
        umr.b(new Runnable() { // from class: unt
            @Override // java.lang.Runnable
            public final void run() {
                unw unwVar = unw.this;
                unwVar.a.g(true);
                ExpressSignInLayout expressSignInLayout = unwVar.a;
                expressSignInLayout.k(expressSignInLayout.e.b.d(), unwVar.a.e.b.a());
            }
        });
    }

    @Override // defpackage.uuo
    public final void d(final amuk amukVar) {
        umr.b(new Runnable() { // from class: unu
            @Override // java.lang.Runnable
            public final void run() {
                unw unwVar = unw.this;
                amuk amukVar2 = amukVar;
                ExpressSignInLayout expressSignInLayout = unwVar.a;
                expressSignInLayout.k(amukVar2, expressSignInLayout.e.b.a());
            }
        });
    }
}
