package com.google.android.apps.gmm.directions.destinations.settings;

import android.content.Context;
import android.widget.TextView;
import androidx.preference.Preference;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class Ue3Preference extends Preference {
    @dzsi
    public final cjqy a;
    @dzsi
    public cjtd b;
    @dzsi
    public TextView c;
    @dzsi
    public auc d;
    int e;
    private final ite f;
    @dzsi
    private TextView g;

    public Ue3Preference(Context context, ite iteVar, @dzsi cjqy cjqyVar) {
        super(context);
        this.b = null;
        this.c = null;
        this.g = null;
        this.d = null;
        this.e = -1;
        this.f = iteVar;
        this.a = cjqyVar;
    }

    @Override // androidx.preference.Preference
    public final void P() {
        TextView textView = this.c;
        if (textView != null) {
            itf.a(textView);
        }
        R();
    }

    @Override // androidx.preference.Preference
    public final void Rk(ave aveVar) {
        super.Rk(aveVar);
        TextView textView = (TextView) aveVar.C(16908310);
        this.c = textView;
        if (textView != null) {
            cjtd cjtdVar = this.b;
            if (cjtdVar != null) {
                cjqg.h(textView, cjtdVar);
                this.f.c(this.c);
            }
            this.c.setSingleLine(false);
        }
        TextView textView2 = (TextView) aveVar.C(16908304);
        this.g = textView2;
        if (textView2 == null || this.e == -1) {
            return;
        }
        textView2.setTextColor(this.j.getResources().getColor(this.e));
    }
}
