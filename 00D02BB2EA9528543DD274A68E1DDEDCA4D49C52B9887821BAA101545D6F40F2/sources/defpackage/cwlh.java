package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: cwlh  reason: default package */
/* loaded from: classes5.dex */
public final class cwlh<AccountT> implements cwla {
    public final cvzn a;
    public final cskk b;
    public final cvzg c;

    public cwlh(cvzg cvzgVar, cvzn cvznVar, cskk cskkVar) {
        this.c = cvzgVar;
        this.a = cvznVar;
        this.b = cskkVar;
    }

    public static final boolean g(View view) {
        return cwjh.a(view.getContext().getApplicationContext());
    }

    @Override // defpackage.cwla
    public final void a(View view, int i) {
        czhz.b();
        if (g(view)) {
            cwlg cwlgVar = new cwlg(this, view, i);
            view.addOnAttachStateChangeListener(cwlgVar);
            cwlgVar.a(this.c.e());
            if (!od.ak(view)) {
                return;
            }
            cwlgVar.onViewAttachedToWindow(view);
        }
    }

    @Override // defpackage.cwla
    public final void b(View view, int i) {
        czhz.b();
        if (g(view)) {
            this.b.a().b.a(i).d(view);
        }
    }

    @Override // defpackage.cwla
    public final void c(View view, int i) {
        czhz.b();
        if (g(view)) {
            cshe a = this.b.a().b.a(i);
            if (cshd.a(view) != null) {
                return;
            }
            a.d(view);
        }
    }

    @Override // defpackage.cwla
    public final void d(csgu csguVar, View view) {
        if (g(view)) {
            csgx csgxVar = (csgx) this.b.b.a();
            if (((csgv) view.getTag(R.id.interaction_info_tag)) == null) {
                csgxVar.a(new csgw((csgz) csguVar.a.bK()), cshd.a(view));
            } else {
                dbsk.l(!csguVar.a.g(null));
                throw null;
            }
        }
    }

    @Override // defpackage.cwla
    public final void e(View view) {
        czhz.b();
        if (g(view)) {
            cshf cshfVar = this.b.a().b;
            czhz.b();
            csgt a = cshd.a(view);
            dbsk.s(a);
            a.f();
        }
    }

    @Override // defpackage.cwla
    public final void f(final View view, Executor executor) {
        czhz.b();
        executor.execute(new Runnable(this, view) { // from class: cwlb
            private final cwlh a;
            private final View b;

            {
                this.a = this;
                this.b = view;
            }

            @Override // java.lang.Runnable
            public final void run() {
                final cwlh cwlhVar = this.a;
                final View view2 = this.b;
                if (cwlh.g(view2)) {
                    czhz.e(new Runnable(cwlhVar, view2) { // from class: cwlc
                        private final cwlh a;
                        private final View b;

                        {
                            this.a = cwlhVar;
                            this.b = view2;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.a.a(this.b, 75245);
                        }
                    });
                }
            }
        });
    }
}
