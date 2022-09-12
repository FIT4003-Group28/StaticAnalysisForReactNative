package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: cjyb  reason: default package */
/* loaded from: classes.dex */
public class cjyb {
    public final Handler a;
    final List<cjxz> b;
    final List<cjxx> c;
    public final bvrj d;

    public cjyb() {
        bvrj bvrjVar = bvrj.UI_THREAD;
        this.a = new Handler(Looper.getMainLooper());
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = bvrjVar;
    }

    public final void a(cjxx cjxxVar) {
        this.d.c();
        dbsk.b(cjxxVar.b == null, "Action already pending");
        if (!cjxxVar.a()) {
            return;
        }
        if (this.b.isEmpty()) {
            cjxxVar.run();
            cjxxVar.c();
            return;
        }
        cjxxVar.b = this;
        this.c.add(cjxxVar);
    }

    public final void b(View view) {
        bvrj.UI_THREAD.c();
        cjxx cjxxVar = (cjxx) view.getTag(R.id.view_update_action);
        if (cjxxVar == null) {
            return;
        }
        if (cjxxVar.d()) {
            cjyb cjybVar = cjxxVar.b;
            dbsk.k(cjybVar == this, "Tried to clear action %s which is on list %s, not %s", cjxxVar, cjybVar, this);
            cjxxVar.b();
        }
        view.setTag(R.id.view_update_action, null);
    }

    public final void c(cjxz cjxzVar) {
        this.d.c();
        if (cjxzVar.a != null) {
            bvoo.f(new RuntimeException("Already blocked; attached stack trace of the original call to block() below this one", cjxzVar.b));
            dbsk.m(cjxzVar.a == this, "Already blocked on different list");
        }
        this.b.add(cjxzVar);
        cjxzVar.a = this;
        cjxzVar.b = new Throwable("Original call to block()");
        if (cjxzVar.c) {
            this.a.postDelayed(cjxzVar.d, 1000L);
        }
    }

    public final void d(cjxx cjxxVar, cjxx cjxxVar2) {
        this.d.c();
        if (cjxxVar.d()) {
            cjyb cjybVar = cjxxVar.b;
            dbsk.k(cjybVar == this, "Tried to replace action %s which is on list %s, not %s", cjxxVar, cjybVar, this);
            cjxxVar.b();
        }
        a(cjxxVar2);
    }
}
