package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: anqp  reason: default package */
/* loaded from: classes2.dex */
public class anqp implements anqm {
    private static final cqss a = irg.k();
    private final Activity b;
    private final Executor c;
    private final anqr d;
    private final bsvm e;
    private dehn<cora> h;
    private final anqa f = new anqa(1, anql.a, r());
    private final anqa g = new anqa(2, anql.a, r());
    private int i = 1;

    public anqp(Activity activity, cqhn cqhnVar, bsvm bsvmVar, Executor executor, anqr anqrVar) {
        this.b = activity;
        this.e = bsvmVar;
        this.c = executor;
        this.d = anqrVar;
    }

    private final int q() {
        if (this.h == null) {
            o();
        }
        if (!this.h.isDone()) {
            return 3;
        }
        try {
            cora coraVar = (cora) deha.r(this.h);
            if (coraVar == null) {
                return 3;
            }
            return coraVar.e() ? 1 : 2;
        } catch (ExecutionException unused) {
            return 3;
        }
    }

    private final anqo r() {
        return new anqo(this);
    }

    @Override // defpackage.anqm
    public Boolean a() {
        boolean z = true;
        if (this.i != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.anqm
    public Boolean b() {
        return Boolean.valueOf(this.i == 4);
    }

    @Override // defpackage.anqm
    public Boolean c() {
        return Boolean.valueOf(this.i == 3);
    }

    @Override // defpackage.anqm
    public cqtd d() {
        int q = q() - 1;
        if (q != 0) {
            if (q == 1) {
                return cqrt.g(2131232339, a);
            }
            return cqrt.g(2131232366, a);
        }
        return cqrt.g(2131232340, a);
    }

    @Override // defpackage.anqm
    public String e() {
        int q = q() - 1;
        if (q != 0) {
            return q != 1 ? "" : this.b.getString(R.string.TIMELINE_LH_MAP_CONTROL_DISABLED);
        }
        return this.b.getString(R.string.TIMELINE_LH_MAP_CONTROL_ENABLED);
    }

    @Override // defpackage.anqm
    public String f() {
        if (q() == 3) {
            return this.b.getString(R.string.TIMELINE_LH_MAP_CONTROL_MANAGE_UNKNOWN);
        }
        return this.b.getString(R.string.TIMELINE_LH_MAP_CONTROL_MANAGE);
    }

    @Override // defpackage.anqm
    public String g() {
        int q = q() - 1;
        if (q != 0) {
            if (q == 1) {
                return this.b.getString(R.string.TIMELINE_LH_MAP_CONTROL_COLLAPSED_DISABLED_CONTENT_DESCRIPTION);
            }
            return this.b.getString(R.string.TIMELINE_LH_MAP_CONTROL_COLLAPSED_UNKNOWN_CONTENT_DESCRIPTION);
        }
        return this.b.getString(R.string.TIMELINE_LH_MAP_CONTROL_COLLAPSED_ENABLED_CONTENT_DESCRIPTION);
    }

    @Override // defpackage.anqm
    public String h() {
        int q = q() - 1;
        if (q != 0) {
            if (q == 1) {
                return this.b.getString(R.string.TIMELINE_LH_MAP_CONTROL_EXPANDED_DISABLED_CONTENT_DESCRIPTION);
            }
            return this.b.getString(R.string.TIMELINE_LH_MAP_CONTROL_EXPANDED_UNKNOWN_CONTENT_DESCRIPTION);
        }
        return this.b.getString(R.string.TIMELINE_LH_MAP_CONTROL_EXPANDED_ENABLED_CONTENT_DESCRIPTION);
    }

    @Override // defpackage.anqm
    public cqfc i() {
        return this.f;
    }

    @Override // defpackage.anqm
    public cqfc j() {
        return this.g;
    }

    @Override // defpackage.anqm
    public cqkl k() {
        this.e.j();
        return cqkl.a;
    }

    @Override // defpackage.anqm
    public cqkl l() {
        if (a().booleanValue()) {
            p(2);
        }
        return cqkl.a;
    }

    @Override // defpackage.anqm
    public Integer m() {
        return Integer.valueOf(gwu.b().NR(this.b));
    }

    public void n() {
        if (c().booleanValue()) {
            p(4);
        }
    }

    public void o() {
        dehn<cora> a2 = this.d.a();
        this.h = a2;
        a2.Pk(new Runnable(this) { // from class: anqn
            private final anqp a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                cqkx.p(this.a);
            }
        }, this.c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void p(int i) {
        this.i = i;
        cqkx.p(this);
    }
}
