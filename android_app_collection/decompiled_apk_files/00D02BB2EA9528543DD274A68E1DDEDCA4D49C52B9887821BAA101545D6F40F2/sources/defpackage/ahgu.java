package defpackage;

import android.os.Handler;
import android.view.View;
import com.google.android.apps.maps.R;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
/* compiled from: PG */
/* renamed from: ahgu  reason: default package */
/* loaded from: classes2.dex */
public class ahgu extends ivw implements ahab {
    @dzsi
    ExtendedFloatingActionButton c;
    private final gga d;
    private final btvo e;
    private final cpv f;
    private final String g;
    private final Handler h;
    private final Runnable i;
    private boolean j;
    @dzsi
    private Runnable k;

    public ahgu(gga ggaVar, btvo btvoVar, cqhn cqhnVar, cqhu cqhuVar, cpv cpvVar) {
        super(ggaVar, ivu.FIXED, jaq.MOD_DAY_NIGHT_WHITE_ON_BLUE, cqrt.f(2131232153), ggaVar.getString(R.string.LOCALSTREAM_RELOAD_TOAST), cjtd.a(dtxu.bY), false, 0);
        this.h = new Handler();
        this.i = new ahgt(this);
        this.j = false;
        this.d = ggaVar;
        this.e = btvoVar;
        this.f = cpvVar;
        this.g = ggaVar.getString(R.string.LOCALSTREAM_RELOAD_TOAST);
    }

    @Override // defpackage.jar
    public cqkl a(cjqm cjqmVar) {
        Runnable runnable = this.k;
        if (runnable != null) {
            runnable.run();
        }
        h();
        return cqkl.a;
    }

    @Override // defpackage.ahab
    public Boolean f() {
        return Boolean.valueOf(this.j);
    }

    public void g(Runnable runnable) {
        this.k = runnable;
        this.j = true;
        H(true);
        this.j = false;
        if (this.c == null) {
            for (View view : cqkx.n(this)) {
                this.c = (ExtendedFloatingActionButton) cqhu.a(view, agqd.a);
            }
        }
        ExtendedFloatingActionButton extendedFloatingActionButton = this.c;
        dbsk.s(extendedFloatingActionButton);
        extendedFloatingActionButton.setExtended(true);
        this.h.removeCallbacks(this.i);
        if (!this.f.d(this.d)) {
            this.h.postDelayed(this.i, this.e.getPeopleFollowParameters().c);
        }
    }

    public void h() {
        this.j = true;
        H(false);
        this.j = false;
        this.k = null;
    }

    @Override // defpackage.ivw, defpackage.jar
    public String x() {
        return this.g;
    }
}
