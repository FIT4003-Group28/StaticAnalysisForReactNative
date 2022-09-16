package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: ahas  reason: default package */
/* loaded from: classes.dex */
public final class ahas {
    protected final Context a;
    protected final AlertDialog.Builder b;
    protected final aafo c;
    protected final ajmr d;
    protected View e;
    protected ImageView f;
    protected ImageView g;
    protected ajnj h;
    protected ajnj i;
    protected TextView j;
    protected TextView k;
    protected AlertDialog l;
    protected TextView m;
    protected TextView n;
    protected apoj o;
    protected apoj p;
    protected acti q;

    /* JADX INFO: Access modifiers changed from: protected */
    public ahas(Context context, AlertDialog.Builder builder, aafo aafoVar, ajmr ajmrVar) {
        this.a = context;
        this.b = builder;
        this.c = aafoVar;
        this.d = ajmrVar;
    }

    public static void b(aafo aafoVar, avvh avvhVar) {
        if (avvhVar.j.size() != 0) {
            for (apzg apzgVar : avvhVar.j) {
                HashMap hashMap = new HashMap();
                hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", avvhVar);
                aafoVar.c(apzgVar, hashMap);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(apoj apojVar) {
        acti actiVar;
        if (apojVar == null) {
            return;
        }
        if ((apojVar.b & 16384) != 0) {
            apzg apzgVar = apojVar.o;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            if (!apzgVar.qn(atno.b) && (actiVar = this.q) != null) {
                apzgVar = actiVar.f(apzgVar);
            }
            if (apzgVar != null) {
                this.c.c(apzgVar, null);
            }
        }
        if ((apojVar.b & 8192) == 0) {
            return;
        }
        aafo aafoVar = this.c;
        apzg apzgVar2 = apojVar.n;
        if (apzgVar2 == null) {
            apzgVar2 = apzg.a;
        }
        aafoVar.c(apzgVar2, actk.h(apojVar, !((apojVar.b & 16384) != 0)));
    }

    public final void c(apoj apojVar, TextView textView, View.OnClickListener onClickListener) {
        arag aragVar;
        if (apojVar == null) {
            zag.o(textView, false);
            return;
        }
        if ((apojVar.b & 256) != 0) {
            aragVar = apojVar.i;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        CharSequence b = ajgl.b(aragVar);
        zag.m(textView, b);
        aovs aovsVar = apojVar.s;
        if (aovsVar == null) {
            aovsVar = aovs.a;
        }
        if ((aovsVar.b & 1) != 0) {
            aovs aovsVar2 = apojVar.s;
            if (aovsVar2 == null) {
                aovsVar2 = aovs.a;
            }
            aovr aovrVar = aovsVar2.c;
            if (aovrVar == null) {
                aovrVar = aovr.a;
            }
            b = aovrVar.c;
        }
        textView.setContentDescription(b);
        textView.setOnClickListener(onClickListener);
        acti actiVar = this.q;
        if (actiVar == null) {
            return;
        }
        actiVar.u(new acte(apojVar.t), null);
    }
}
