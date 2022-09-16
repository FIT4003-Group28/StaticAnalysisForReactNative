package com.google.android.apps.youtube.app.common.ui.inline;

import android.os.Handler;
import com.google.android.apps.youtube.app.common.ui.inline.InlinePlaybackLifecycleController;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class InlinePlaybackLifecycleController implements f {
    public final Handler a;
    public aypg b;
    public final zha c = new zha();
    private final List d = new ArrayList();
    private int e = 0;
    private fzg f;

    public InlinePlaybackLifecycleController(Handler handler) {
        this.a = handler;
    }

    public static final boolean q(int i, fzg fzgVar) {
        int i2 = fzgVar.g;
        return !(i2 == 3 || i2 == 2) || i == 0;
    }

    private final void r(int i, fzg fzgVar) {
        int i2 = fzgVar.g;
        if (i2 == 0) {
            fzgVar.g = 1;
        } else if (i2 == 3 && i != 0) {
            StringBuilder sb = new StringBuilder(54);
            sb.append("Can't transition aborted requests to state ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        aqxo.B(!fzgVar.b(), "Can't transition, request is already blocked %s", fzgVar.c);
        for (fzf fzfVar : this.d) {
            fzgVar.c.add(fzfVar);
            if (fzfVar.k(fzgVar.a, i, new fyz(this, fzgVar, i, fzfVar))) {
                fzgVar.a(fzfVar);
            } else {
                String.valueOf(String.valueOf(fzfVar)).length();
            }
        }
        if (fzgVar.b()) {
            return;
        }
        this.a.post(new fzd(this, i, fzgVar));
    }

    private final boolean s(ggt ggtVar) {
        fzg fzgVar = this.f;
        return fzgVar != null && fzgVar.a.b.k(ggtVar);
    }

    private final boolean t(ggt ggtVar) {
        fzg fzgVar;
        fzg fzgVar2 = this.f;
        return (fzgVar2 == null || (fzgVar = fzgVar2.h) == null || !fzgVar.a.b.k(ggtVar)) ? false : true;
    }

    private final void u(fzg fzgVar) {
        final fzg fzgVar2 = this.f;
        int i = fzgVar2.g;
        boolean z = true;
        if (i != 3 && i != 2) {
            z = false;
        }
        if (!z) {
            fzgVar2.g = 3;
        }
        fzg fzgVar3 = fzgVar2.h;
        if (fzgVar3 != null) {
            fzgVar3.g = 3;
        }
        fzgVar2.h = fzgVar;
        if (!z) {
            if (fzgVar2.f == 3) {
                r(0, fzgVar2);
                return;
            }
            fzgVar2.g = 2;
            if (fzgVar2.b()) {
                for (fzf fzfVar : this.d) {
                    fzfVar.h(fzgVar2.a);
                }
                fzgVar2.c.clear();
            }
            fzgVar2.g = 3;
            this.a.post(new Runnable() { // from class: fza
                @Override // java.lang.Runnable
                public final void run() {
                    InlinePlaybackLifecycleController.this.n(0, fzgVar2);
                }
            });
        }
    }

    public final int g(ggt ggtVar) {
        fzg fzgVar = this.f;
        if (fzgVar == null) {
            return 0;
        }
        if (fzgVar.a.b == ggtVar) {
            return fzgVar.b;
        }
        fzg fzgVar2 = fzgVar.h;
        if (fzgVar2 != null && fzgVar2.a.b == ggtVar) {
            return fzgVar2.b;
        }
        return 0;
    }

    public final aynr h() {
        ylr.c();
        fzg fzgVar = this.f;
        if (fzgVar == null || fzgVar.g == 3) {
            return aynr.f();
        }
        azpo azpoVar = fzgVar.e;
        u(null);
        return azpoVar;
    }

    public final aynr i(ggt ggtVar) {
        ylr.c();
        String.valueOf(String.valueOf(ggtVar)).length();
        if (this.f == null) {
            return aynr.f();
        }
        if (s(ggtVar) || t(ggtVar)) {
            azpo azpoVar = this.f.e;
            u(null);
            return azpoVar;
        }
        return aynr.f();
    }

    public final aynr j(ggt ggtVar, fzq fzqVar, int i) {
        ylr.c();
        ggtVar.getClass();
        String.valueOf(String.valueOf(ggtVar)).length();
        if (s(ggtVar)) {
            return this.f.d;
        }
        if (t(ggtVar)) {
            return this.f.h.d;
        }
        fzg fzgVar = new fzg(ggtVar, fzqVar, i);
        fzg fzgVar2 = this.f;
        if (fzgVar2 == null) {
            this.f = fzgVar;
            r(1, fzgVar);
        } else if (fzgVar2.g == 0) {
            return aynr.s(new IllegalStateException("Requested Playback when currentRequest has status 0"));
        } else {
            u(fzgVar);
        }
        return fzgVar.d;
    }

    public final aynr k() {
        ylr.c();
        fzg fzgVar = this.f;
        if (fzgVar == null) {
            return aynr.f();
        }
        azpo azpoVar = fzgVar.e;
        u(null);
        return azpoVar;
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void kG(apy apyVar) {
    }

    public final void l(fze fzeVar) {
        zha zhaVar = this.c;
        fzeVar.getClass();
        zhaVar.a.add(fzeVar);
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void lc(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void ld(apy apyVar) {
    }

    public final void m(fzf fzfVar) {
        fzfVar.getClass();
        this.d.add(fzfVar);
    }

    public final void n(int i, fzg fzgVar) {
        String.valueOf(String.valueOf(fzgVar)).length();
        fzgVar.getClass();
        this.f = fzgVar;
        if (q(i, fzgVar)) {
            this.e = i;
            fzg fzgVar2 = this.f;
            fzgVar2.f = i;
            zha zhaVar = this.c;
            int i2 = this.e;
            for (fze fzeVar : zhaVar.a) {
                fzeVar.lh(fzgVar2.a, i2);
            }
            if (i2 == 0) {
                fzgVar2.e.sm();
            } else if (i2 == 3) {
                fzgVar2.d.sm();
            }
        }
        int i3 = this.e;
        if (i3 == 3) {
            if (this.f.g != 3) {
                return;
            }
            i3 = 3;
        }
        if (i3 == 0) {
            fzg fzgVar3 = this.f.h;
            this.f = fzgVar3;
            if (fzgVar3 == null) {
                return;
            }
            r(1, fzgVar3);
            return;
        }
        fzg fzgVar4 = this.f;
        r(fzgVar4.g == 3 ? 0 : i3 + 1, fzgVar4);
    }

    @Override // defpackage.g
    public final void nA(apy apyVar) {
        aypg aypgVar = this.b;
        if (aypgVar == null || aypgVar.e()) {
            return;
        }
        ayqi.c((AtomicReference) this.b);
    }

    @Override // defpackage.g
    public final /* synthetic */ void nv(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void nz(apy apyVar) {
    }

    public final void o() {
        aypg aypgVar = this.b;
        if (aypgVar != null && !aypgVar.e()) {
            ayqi.c((AtomicReference) this.b);
        }
        this.b = h().S(fzb.a, fzc.b);
    }

    public final void p() {
        aypg aypgVar = this.b;
        if (aypgVar != null && !aypgVar.e()) {
            ayqi.c((AtomicReference) this.b);
        }
        this.b = k().S(fzb.c, fzc.c);
    }
}
