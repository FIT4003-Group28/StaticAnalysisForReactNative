package com.google.android.apps.gmm.ugc.disclosure;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.google.android.apps.gmm.ugc.disclosure.PublicDisclosureLayout$PublicDisclosureViewModelImpl;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class PublicDisclosureLayout$PublicDisclosureViewModelImpl implements cayf, e, crzp {
    public final caxm a;
    private final cchz f;
    private final Executor g;
    public final Handler b = new Handler(Looper.getMainLooper());
    public View c = null;
    private ccih h = null;
    public cayd d = cayd.DIALOG;
    private ilo j = null;
    private boolean k = false;
    private boolean l = false;
    public final Runnable e = new Runnable(this) { // from class: cayg
        private final PublicDisclosureLayout$PublicDisclosureViewModelImpl a;

        {
            this.a = this;
        }

        @Override // java.lang.Runnable
        public final void run() {
            PublicDisclosureLayout$PublicDisclosureViewModelImpl publicDisclosureLayout$PublicDisclosureViewModelImpl = this.a;
            publicDisclosureLayout$PublicDisclosureViewModelImpl.a.b(publicDisclosureLayout$PublicDisclosureViewModelImpl.c, false);
        }
    };
    private final cqfc i = new cqfc(this) { // from class: cayh
        private final PublicDisclosureLayout$PublicDisclosureViewModelImpl a;

        {
            this.a = this;
        }

        @Override // defpackage.cqfc
        public final void a(View view, boolean z) {
            PublicDisclosureLayout$PublicDisclosureViewModelImpl publicDisclosureLayout$PublicDisclosureViewModelImpl = this.a;
            publicDisclosureLayout$PublicDisclosureViewModelImpl.c = view;
            if (!view.isShown() || !publicDisclosureLayout$PublicDisclosureViewModelImpl.d.equals(cayd.DIALOG)) {
                if (!view.isShown() || !publicDisclosureLayout$PublicDisclosureViewModelImpl.d.equals(cayd.TOOLTIP)) {
                    return;
                }
                publicDisclosureLayout$PublicDisclosureViewModelImpl.b.removeCallbacks(publicDisclosureLayout$PublicDisclosureViewModelImpl.e);
                publicDisclosureLayout$PublicDisclosureViewModelImpl.b.postDelayed(publicDisclosureLayout$PublicDisclosureViewModelImpl.e, cayj.a.b);
                return;
            }
            publicDisclosureLayout$PublicDisclosureViewModelImpl.a.c(false);
        }
    };

    public PublicDisclosureLayout$PublicDisclosureViewModelImpl(cchz cchzVar, Executor executor, caxo caxoVar, caxa caxaVar) {
        this.f = cchzVar;
        this.g = executor;
        this.a = caxoVar.a(caxaVar);
    }

    @Override // defpackage.crzp
    public void On(crzm<ccih> crzmVar) {
        this.h = crzmVar.l();
        cqkx.p(this);
    }

    @Override // defpackage.f
    public void a(m mVar) {
    }

    @Override // defpackage.f
    public void b(m mVar) {
        this.f.d().d(this, this.g);
    }

    @Override // defpackage.f
    public void c(m mVar) {
    }

    @Override // defpackage.f
    public void d(m mVar) {
    }

    @Override // defpackage.f
    public void e(m mVar) {
        this.f.d().c(this);
    }

    @Override // defpackage.f
    public void f(m mVar) {
    }

    @Override // defpackage.cayf
    public Boolean g() {
        return Boolean.valueOf(this.k);
    }

    @Override // defpackage.cayf
    public String h() {
        ilo iloVar;
        if (!this.k || (iloVar = this.j) == null) {
            ccih ccihVar = this.h;
            return ccihVar != null ? ccihVar.b() : "";
        }
        dvwi dvwiVar = iloVar.bf().v;
        if (dvwiVar == null) {
            dvwiVar = dvwi.m;
        }
        return dvwiVar.c;
    }

    @Override // defpackage.cayf
    public cqfc j() {
        return this.i;
    }

    @Override // defpackage.cayf
    public Boolean k() {
        boolean z = false;
        if (this.k && this.l) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cayf
    public cqkl l() {
        cayd caydVar = cayd.DIALOG;
        int ordinal = this.d.ordinal();
        if (ordinal == 0) {
            this.a.c(true);
        } else if (ordinal == 1) {
            this.a.b(this.c, true);
        }
        return cqkl.a;
    }

    public void m(ilo iloVar) {
        this.j = iloVar;
        this.k = ((Boolean) dbsg.j(iloVar).h(cayi.a).c(false)).booleanValue();
        cqkx.p(this);
    }

    public void n(boolean z) {
        this.l = true;
        cqkx.p(this);
    }

    public void o(cayd caydVar) {
        this.d = caydVar;
    }

    @Override // defpackage.cayf
    public String i() {
        ilo iloVar;
        if (!this.k || (iloVar = this.j) == null) {
            ccih ccihVar = this.h;
            return ccihVar != null ? (String) dbsg.j(ccihVar.a().v()).c("") : "";
        }
        return iloVar.n();
    }
}
