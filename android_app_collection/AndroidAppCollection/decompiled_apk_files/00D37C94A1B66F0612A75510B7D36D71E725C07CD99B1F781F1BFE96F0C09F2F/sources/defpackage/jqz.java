package defpackage;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.concurrent.Future;
/* compiled from: PG */
/* renamed from: jqz  reason: default package */
/* loaded from: classes3.dex */
public final class jqz implements ynl {
    public final Context a;
    public final fcl b;
    public final yni c;
    public final ajrq d;
    public final ajrp e;
    public final fcd f;
    public final snc g;
    public final jpe h;
    public final TextView i;
    public final TextView j;
    public final int l;
    public ajrs m;
    public ajrx n;
    public aqei o;
    public String p;
    public ajrp q;
    private final azqb s;
    private final jkz t;
    private final jnw u;
    private final fbx v;
    private final TextView w;
    public Future r = anlz.o();
    public final fcc k = new fcc() { // from class: jqw
        @Override // defpackage.fcc
        public final void a() {
            jqz.this.b();
        }
    };

    public jqz(Context context, fcl fclVar, azqb azqbVar, jkz jkzVar, jpe jpeVar, yni yniVar, jnw jnwVar, ajrq ajrqVar, fcd fcdVar, snc sncVar, fbx fbxVar, View view, ajrp ajrpVar) {
        this.a = context;
        this.b = fclVar;
        this.s = azqbVar;
        this.t = jkzVar;
        this.h = jpeVar;
        this.c = yniVar;
        this.d = ajrqVar;
        this.f = fcdVar;
        this.u = jnwVar;
        this.g = sncVar;
        this.v = fbxVar;
        this.e = ajrpVar;
        this.w = (TextView) view.findViewById(R.id.owner);
        this.i = (TextView) view.findViewById(R.id.video_count);
        this.j = (TextView) view.findViewById(R.id.subtitle);
        TypedValue typedValue = new TypedValue();
        this.l = context.getTheme().resolveAttribute(16842808, typedValue, true) ? context.getResources().getColor(typedValue.resourceId) : -1;
    }

    public final void a(agqg agqgVar) {
        arag aragVar;
        zag.o(this.i, agqgVar == null || agqgVar.e());
        if (agqgVar == null || agqgVar.e()) {
            zag.o(this.j, false);
        } else {
            jjj b = this.t.b(agqgVar);
            zag.m(this.j, b.c[0]);
            this.j.setTextColor(zhn.j(this.a, b.a).orElse(0));
            TextView textView = this.j;
            textView.setTypeface(textView.getTypeface(), 0);
        }
        aqei aqeiVar = this.o;
        aqeiVar.getClass();
        TextView textView2 = this.w;
        if ((aqeiVar.b & 16) != 0) {
            aragVar = aqeiVar.h;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        textView2.setText(ajgl.b(aragVar));
        if (!this.v.c() || agqgVar == null || !agqgVar.e() || agqgVar.c + agqgVar.a() != agqgVar.c()) {
            return;
        }
        this.r.cancel(false);
        jnw jnwVar = this.u;
        this.r = jnwVar.d.submit(new jns(jnwVar, agqgVar.d(), new jqy(this), 1));
    }

    public final void b() {
        String str = this.p;
        if (!amps.e(str)) {
            a(((agrf) this.s.get()).a().i().d(str));
        }
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                ypy ypyVar = (ypy) obj;
                b();
                return null;
            } else if (i == 1) {
                agnp agnpVar = (agnp) obj;
                if (!agnpVar.a.d().equals(this.p)) {
                    return null;
                }
                a(agnpVar.a);
                return null;
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        }
        return new Class[]{ypy.class, agnp.class};
    }
}
