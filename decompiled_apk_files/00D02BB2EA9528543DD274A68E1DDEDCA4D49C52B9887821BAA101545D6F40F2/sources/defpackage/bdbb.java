package defpackage;

import android.app.Activity;
import android.view.View;
import android.widget.Toast;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bdbb  reason: default package */
/* loaded from: classes3.dex */
public abstract class bdbb implements bdau, ecs {
    protected final btvo a;
    @dzsi
    public bdar b;
    public int c;
    protected final int d;
    protected final Toast e;
    private final jco f;
    private final Activity g;

    public bdbb(int i, cqhn cqhnVar, cjqy cjqyVar, jco jcoVar, btvo btvoVar, Activity activity) {
        this.c = 0;
        this.d = i;
        this.f = new bdba(this, cjqyVar, jcoVar);
        this.c = i;
        this.a = btvoVar;
        this.g = activity;
        this.e = Toast.makeText(activity, activity.getString(R.string.NET_FAIL_TITLE), 0);
    }

    @Override // defpackage.ecs
    public void Qf() {
        View o = cqkx.o(this);
        if (o == null) {
            return;
        }
        bvsi bvsiVar = new bvsi(this.g);
        String f = f();
        if (!f.isEmpty()) {
            bvsiVar.c(f);
        }
        o.setContentDescription(bvsiVar.toString());
        cpv.a.a(o);
    }

    @Override // defpackage.bdau
    public jco d() {
        return this.f;
    }

    @Override // defpackage.bdau
    public Integer e() {
        return Integer.valueOf(this.c);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @dzsi
    public abstract bdar g(int i);

    public void i() {
        bdar g = g(this.c);
        this.b = g;
        if (g != null) {
            g.l();
        }
    }

    public void j() {
        bdar bdarVar = this.b;
        if (bdarVar != null) {
            bdarVar.m();
        }
        this.b = null;
    }

    public Boolean k() {
        return false;
    }

    public void l(int i) {
        this.c = i;
    }
}
