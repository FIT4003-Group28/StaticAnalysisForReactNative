package defpackage;

import android.text.TextUtils;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: akft  reason: default package */
/* loaded from: classes.dex */
public final class akft {
    private final acth a;
    private final akbn b;

    public akft(acth acthVar, akbn akbnVar) {
        this.a = acthVar;
        this.b = akbnVar;
    }

    public static void a(TextView textView, apoj apojVar) {
        if (apojVar != null || !TextUtils.isEmpty(null)) {
            return;
        }
        textView.setVisibility(8);
    }

    public final void b(TextView textView, final akgc akgcVar, apoj apojVar, final int i) {
        int l;
        if (textView.getVisibility() == 8) {
            return;
        }
        if (apojVar != null || TextUtils.isEmpty(null)) {
            akbm a = this.b.a(textView);
            a.b(apojVar, this.a.oi());
            a.d = new akbi() { // from class: akfs
                @Override // defpackage.akbi
                public final void oL(aopc aopcVar) {
                    akgc akgcVar2 = akgc.this;
                    int i2 = 1;
                    if (i != 1) {
                        i2 = 0;
                    }
                    akgcVar2.b(i2);
                }
            };
            if (!a.h || apojVar.c != 1 || (l = akzj.l(((Integer) apojVar.d).intValue())) == 0 || l != 14) {
                return;
            }
            if (a.g) {
                TextView textView2 = a.f;
                akbm.c(textView2, po.b(textView2.getContext(), R.drawable.tooltip_button_background), true);
            } else {
                TextView textView3 = a.f;
                zag.l(textView3, po.b(textView3.getContext(), R.drawable.tooltip_button_background), a.j);
            }
            a.i = true;
            a.h = false;
            return;
        }
        aopc aopcVar = (aopc) apoj.a.createBuilder();
        throw null;
    }
}
