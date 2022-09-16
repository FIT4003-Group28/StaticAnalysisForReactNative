package defpackage;

import android.app.Activity;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: jev  reason: default package */
/* loaded from: classes3.dex */
public final class jev implements ynl {
    public final Activity a;
    public final yni b;
    public final jfb c;
    public final jfg d;
    public final jol e;
    public final ajrh f;
    public final ajsa g;
    public final jlh h;
    public final azqb i;
    public final azqb j;
    public final aadd k;
    public final acti l;
    public final String m;
    public final boolean n;
    public final Set o = new HashSet();
    public LoadingFrameLayout p;
    public ListView q;
    public ajsm r;
    public final axxi s;
    public yiy t;
    public TextView u;
    public ajru v;
    public jfa w;
    public jff x;

    public jev(axxi axxiVar, Activity activity, yni yniVar, aadd aaddVar, jfb jfbVar, jfg jfgVar, jol jolVar, azqb azqbVar, ajrh ajrhVar, ajsa ajsaVar, jlh jlhVar, azqb azqbVar2, acti actiVar, String str, boolean z) {
        this.a = activity;
        this.b = yniVar;
        this.k = aaddVar;
        this.c = jfbVar;
        this.d = jfgVar;
        this.e = jolVar;
        this.f = ajrhVar;
        this.g = ajsaVar;
        this.h = jlhVar;
        this.i = azqbVar;
        this.j = azqbVar2;
        this.l = actiVar;
        this.m = str;
        this.n = z;
        this.s = axxiVar;
    }

    public final void a(boolean z) {
        yiy yiyVar = this.t;
        if (yiyVar != null && !yiyVar.e()) {
            this.t.d();
        }
        this.p.c();
        this.t = yiy.c(new jet(this, z));
        agvv i = ((agrf) this.j.get()).a().i();
        String str = this.m;
        Activity activity = this.a;
        yiy yiyVar2 = this.t;
        yiyVar2.getClass();
        i.v(str, yit.c(activity, yiyVar2));
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                this.r.remove(((aabk) obj).b());
                return null;
            } else if (i == 1) {
                if (!this.m.equals(((agnq) obj).a)) {
                    return null;
                }
                a(false);
                return null;
            } else if (i == 2) {
                if (!this.m.equals(((agnr) obj).a.d())) {
                    return null;
                }
                a(false);
                return null;
            } else if (i == 3) {
                if (!this.o.contains(((agoa) obj).a)) {
                    return null;
                }
                a(true);
                return null;
            } else if (i == 4) {
                if (!this.o.contains(((agoe) obj).a)) {
                    return null;
                }
                a(false);
                return null;
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        }
        return new Class[]{aabk.class, agnq.class, agnr.class, agoa.class, agoe.class};
    }
}
