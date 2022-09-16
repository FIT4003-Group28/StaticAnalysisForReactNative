package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: mtm  reason: default package */
/* loaded from: classes3.dex */
public class mtm {
    protected final Context a;
    protected final View b;
    protected final TextView c;
    protected final TextView d;
    protected final Spinner e;
    protected final aafo f;
    protected final acti g;
    protected final arbc h;
    protected final boolean i;
    protected int j = 0;
    protected int k = 0;
    protected boolean l = false;

    public mtm(Context context, aafo aafoVar, acti actiVar, ViewGroup viewGroup, arbc arbcVar, aadd aaddVar) {
        this.f = aafoVar;
        this.g = actiVar;
        this.a = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.formfill_dropdown_input, viewGroup, false);
        this.b = inflate;
        this.c = (TextView) inflate.findViewById(R.id.label);
        this.d = (TextView) inflate.findViewById(R.id.helper_text);
        this.e = (Spinner) inflate.findViewById(R.id.spinner);
        this.h = arbcVar;
        this.i = xrz.c(aaddVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final mui j(boolean z, apzg apzgVar, asir asirVar) {
        return z ? mui.a(false, apzgVar, asirVar) : mui.a(true, null, null);
    }

    public final View a() {
        return this.b;
    }

    public final asip b(asip asipVar) {
        return asipVar;
    }

    public final asjg c(asjg asjgVar) {
        return asjgVar;
    }

    public final boolean h() {
        return this.j != this.k;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void i(boolean z, boolean z2, arag aragVar) {
        if (z) {
            if (this.i) {
                this.e.setBackground(akf.a(this.a, R.drawable.ad_spinner_textfield_error_background_material));
                this.c.setTextColor(zhn.d(this.a, R.attr.ytErrorIndicator));
            }
            if (z2) {
                if (this.i) {
                    this.d.setTextColor(zhn.d(this.a, R.attr.ytErrorIndicator));
                }
                zag.m(this.d, ajgl.b(aragVar));
            }
            this.b.setBackgroundColor(zhn.d(this.a, true != this.i ? R.attr.ytGeneralBackgroundB : R.attr.ytBadgeChipBackground));
            return;
        }
        if (this.i) {
            this.c.setTextColor(zhn.d(this.a, R.attr.adText2));
            this.d.setTextColor(zhn.d(this.a, R.attr.adText2));
            this.e.setBackground(akf.a(this.a, R.drawable.ad_spinner_textfield_background_material));
        }
        zag.m(this.d, "");
        this.b.setBackgroundColor(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void oP(aoob aoobVar) {
        this.g.u(new acte(aoobVar), null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void oQ(int i) {
        this.j = i;
        if (!this.l) {
            aafo aafoVar = this.f;
            apzg apzgVar = this.h.h;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            aafoVar.c(apzgVar, null);
            this.l = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void oR(arag aragVar) {
        zag.m(this.c, ajgl.b(aragVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void oS(final aoob aoobVar) {
        this.e.setOnTouchListener(new View.OnTouchListener() { // from class: mtl
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                mtm mtmVar = mtm.this;
                aoob aoobVar2 = aoobVar;
                if (motionEvent.getAction() == 1) {
                    mtmVar.g.H(3, new acte(aoobVar2), null);
                    return false;
                }
                return false;
            }
        });
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }
}
