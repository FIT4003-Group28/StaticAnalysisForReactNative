package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: jqq  reason: default package */
/* loaded from: classes3.dex */
public final class jqq implements ynl {
    public final fcl a;
    public final yni b;
    public final TextView c;
    public final View d;
    public String e;
    private final Context f;
    private final azqb g;
    private final jkz h;

    public jqq(Context context, fcl fclVar, azqb azqbVar, jkz jkzVar, yni yniVar, View view) {
        this.f = context;
        this.a = fclVar;
        this.g = azqbVar;
        this.h = jkzVar;
        this.b = yniVar;
        TextView textView = (TextView) view.findViewById(R.id.download_progress_message);
        textView.getClass();
        this.c = textView;
        View findViewById = view.findViewById(R.id.subtitle);
        findViewById.getClass();
        this.d = findViewById;
    }

    public final void a() {
        String str = this.e;
        if (!amps.e(str)) {
            b(((agrf) this.g.get()).a().i().d(str));
        }
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                ypy ypyVar = (ypy) obj;
                a();
                return null;
            } else if (i == 1) {
                agnp agnpVar = (agnp) obj;
                if (!agnpVar.a.d().equals(this.e)) {
                    return null;
                }
                b(agnpVar.a);
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

    public final void b(agqg agqgVar) {
        if (agqgVar == null || agqgVar.e()) {
            zag.o(this.c, false);
            zag.o(this.d, true);
            return;
        }
        jjj b = this.h.b(agqgVar);
        zag.m(this.c, b.c[0]);
        this.c.setTextColor(zhn.j(this.f, b.a).orElse(0));
        TextView textView = this.c;
        textView.setTypeface(textView.getTypeface(), 0);
        zag.o(this.d, false);
    }
}
