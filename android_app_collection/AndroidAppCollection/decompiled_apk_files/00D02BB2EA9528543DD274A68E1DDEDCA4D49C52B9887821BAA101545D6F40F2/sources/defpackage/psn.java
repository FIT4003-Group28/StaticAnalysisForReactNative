package defpackage;

import android.app.Activity;
import android.widget.Toast;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: psn  reason: default package */
/* loaded from: classes7.dex */
public final class psn {
    private static final dcqe a = dcqe.c("psn");
    private final Activity b;
    private final puy c;
    private final vnk d;

    public psn(Activity activity, puy puyVar, vnk vnkVar) {
        this.b = activity;
        this.c = puyVar;
        this.d = vnkVar;
    }

    private final void g(@dzsi String str) {
        if (this.d.aj() == vnj.MAY_SEARCH) {
            if (this.d.bu() == 2) {
                this.c.aZ = this.d.aC();
            }
        } else if (this.d.aj() == vnj.MUST_SEARCH) {
            if (str != null) {
                Toast.makeText(this.b, str, 0).show();
            }
            if (!this.c.bn()) {
                bvoo.h("No snapshot state to restore.", new Object[0]);
            }
        } else {
            bvoo.h("Unexpected search state previous status: %s", this.d.aj());
        }
        this.c.aX();
        this.c.bU(12, null, false, true, false);
    }

    public final void a(int i) {
        this.d.ak(i);
    }

    public final void b() {
        this.d.am(vnj.SHOWING_SEARCH_RESULTS);
    }

    public final void c(amvh amvhVar, int i) {
        this.c.aX();
        this.d.B(amvhVar, i);
        this.c.bP(7, null, null, null);
        this.c.bU(12, null, false, true, false);
    }

    public final void d(String str) {
        g(this.c.Rq(R.string.DIRECTIONS_NO_SEARCH_RESULTS, str));
    }

    public final void e() {
        g(this.c.Rp(R.string.DIRECTIONS_SEARCH_FAILED));
    }

    public final void f() {
        g(null);
    }
}
