package defpackage;

import android.content.Context;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: ejj  reason: default package */
/* loaded from: classes3.dex */
public final class ejj {
    private final Context a;
    private final akbj b;
    private final akfb c;
    private final TextView d;

    public ejj(Context context, akfb akfbVar, akbk akbkVar, final akge akgeVar, TextView textView) {
        this.a = context;
        akbj a = akbkVar.a(textView);
        this.b = a;
        this.c = akfbVar;
        this.d = textView;
        a.d = new akbi() { // from class: eji
            @Override // defpackage.akbi
            public final void oL(aopc aopcVar) {
                akge akgeVar2 = akge.this;
                if (akgeVar2.i()) {
                    akgeVar2.f();
                }
            }
        };
    }

    public final void a(apoj apojVar, acti actiVar) {
        arag aragVar;
        int l;
        int l2;
        int l3;
        this.b.a(apojVar, actiVar, amup.k(actk.b, Boolean.TRUE));
        if (apojVar == null) {
            return;
        }
        TextView textView = this.d;
        argj argjVar = null;
        if ((apojVar.b & 256) != 0) {
            aragVar = apojVar.i;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        textView.setText(ajgl.b(aragVar));
        int i = 1;
        if (apojVar.c != 1 || (l3 = akzj.l(((Integer) apojVar.d).intValue())) == 0 || l3 != 7) {
            if (apojVar.c != 1 || (l2 = akzj.l(((Integer) apojVar.d).intValue())) == 0 || l2 != 6) {
                if (apojVar.c == 1 && (l = akzj.l(((Integer) apojVar.d).intValue())) != 0) {
                    i = l;
                }
                String num = Integer.toString(i - 1);
                StringBuilder sb = new StringBuilder(String.valueOf(num).length() + 30);
                sb.append("Unknown sponsor button style: ");
                sb.append(num);
                zep.b(sb.toString());
                this.d.setTextColor(zhn.d(this.a, R.attr.ytTextDisabled));
            } else {
                this.d.setTextColor(zhn.d(this.a, R.attr.ytTextDisabled));
            }
        } else {
            this.d.setTextColor(zhn.d(this.a, R.attr.ytCallToAction));
        }
        argl arglVar = apojVar.m;
        if (arglVar == null) {
            arglVar = argl.a;
        }
        if (arglVar.b == 102716411) {
            argl arglVar2 = apojVar.m;
            if (arglVar2 == null) {
                arglVar2 = argl.a;
            }
            if (arglVar2.b == 102716411) {
                argjVar = (argj) arglVar2.c;
            } else {
                argjVar = argj.a;
            }
        }
        if (argjVar == null) {
            return;
        }
        this.c.b(argjVar, this.d, apojVar, actiVar);
    }
}
