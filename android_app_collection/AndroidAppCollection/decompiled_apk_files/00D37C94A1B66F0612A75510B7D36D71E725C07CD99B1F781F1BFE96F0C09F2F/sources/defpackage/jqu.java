package defpackage;

import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.youtube.app.offline.ui.OfflineArrowView;
import com.google.android.youtube.R;
import java.util.concurrent.Future;
/* compiled from: PG */
/* renamed from: jqu  reason: default package */
/* loaded from: classes3.dex */
public final class jqu implements ynl {
    public final jnw a;
    public final yni b;
    public final jkm c;
    public final jkz d;
    public final azqb e;
    public final TextView f;
    public final OfflineArrowView g;
    public final ajrp h;
    public aqdv i;
    public String j;
    public jkj k;
    public Future l;
    private final ahce m;

    public jqu(jnw jnwVar, yni yniVar, jkm jkmVar, ahce ahceVar, jkz jkzVar, azqb azqbVar, View view, ajrp ajrpVar) {
        this.a = jnwVar;
        this.b = yniVar;
        this.c = jkmVar;
        this.m = ahceVar;
        this.d = jkzVar;
        this.e = azqbVar;
        this.h = ajrpVar;
        this.f = (TextView) view.findViewById(R.id.subtitle);
        this.g = (OfflineArrowView) view.findViewById(R.id.offline_arrow);
    }

    public final void a() {
        if (amps.e(this.j) || "PPSV".equals(this.j)) {
            return;
        }
        this.m.a(this.j, ahbt.a(true));
    }

    public final void b(jjj jjjVar) {
        arag aragVar;
        if (amps.e(jjjVar.c[0])) {
            aqdv aqdvVar = this.i;
            aqdvVar.getClass();
            TextView textView = this.f;
            if ((aqdvVar.b & 2) != 0) {
                aragVar = aqdvVar.h;
                if (aragVar == null) {
                    aragVar = arag.a;
                }
            } else {
                aragVar = null;
            }
            zag.m(textView, ajgl.b(aragVar));
            TextView textView2 = this.f;
            textView2.setTextColor(zhn.j(textView2.getContext(), R.attr.ytTextSecondary).orElse(0));
            this.f.setTypeface(Typeface.DEFAULT);
            return;
        }
        zag.m(this.f, jjjVar.c[0]);
        TextView textView3 = this.f;
        textView3.setTextColor(zhn.j(textView3.getContext(), jjjVar.a).orElse(0));
        TextView textView4 = this.f;
        Typeface typeface = textView4.getTypeface();
        int i = jjjVar.b;
        textView4.setTypeface(typeface, 0);
    }

    public final void c(agqg agqgVar) {
        this.k.b(jjk.a(agqgVar));
        b(this.d.b(agqgVar));
    }

    public final void d(agqw agqwVar) {
        this.k.b(jjk.a(agqwVar));
        b(this.d.a());
    }

    public final boolean e() {
        return "PPSV".equals(this.j);
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                jiz jizVar = (jiz) obj;
                if (!e()) {
                    return null;
                }
                b(this.d.a());
                return null;
            } else if (i == 1) {
                String str = this.j;
                if (!((agnk) obj).a.equals(str)) {
                    return null;
                }
                c(((agrf) this.e.get()).a().i().d(str));
                return null;
            } else if (i == 2) {
                String str2 = this.j;
                if (((agnn) obj).a.equals(str2)) {
                    c(((agrf) this.e.get()).a().i().d(str2));
                    return null;
                } else if (!e()) {
                    return null;
                } else {
                    d(((agrf) this.e.get()).a().m().f());
                    return null;
                }
            } else if (i == 3) {
                agnp agnpVar = (agnp) obj;
                if (!agnpVar.a.d().equals(this.j) || this.k == null) {
                    return null;
                }
                c(agnpVar.a);
                return null;
            } else if (i == 4) {
                agoi agoiVar = (agoi) obj;
                if (!"PPSV".equals(this.j) || this.k == null) {
                    return null;
                }
                d(agoiVar.a);
                return null;
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        }
        return new Class[]{jiz.class, agnk.class, agnn.class, agnp.class, agoi.class};
    }
}
