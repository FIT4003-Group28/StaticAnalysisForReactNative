package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
@Deprecated
/* renamed from: mtx  reason: default package */
/* loaded from: classes3.dex */
public final class mtx implements AdapterView.OnItemSelectedListener, muj {
    public final acti a;
    public final aras b;
    private final Context c;
    private final View d;
    private final TextView e;
    private final TextView f;
    private final Spinner g;
    private final aafo h;
    private final arbc i;
    private final boolean j;
    private final boolean k;
    private final boolean l;
    private int m = 0;
    private int n = 0;
    private boolean o = false;

    public mtx(Context context, aafo aafoVar, acti actiVar, ViewGroup viewGroup, arbc arbcVar, aras arasVar, aadd aaddVar) {
        this.h = aafoVar;
        this.a = actiVar;
        this.c = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.formfill_dropdown_input, viewGroup, false);
        this.d = inflate;
        this.e = (TextView) inflate.findViewById(R.id.label);
        this.f = (TextView) inflate.findViewById(R.id.helper_text);
        this.g = (Spinner) inflate.findViewById(R.id.spinner);
        this.i = arbcVar;
        this.b = arasVar;
        this.j = xrz.c(aaddVar);
        this.k = xrz.i(aaddVar);
        this.l = xrz.h(aaddVar);
    }

    @Override // defpackage.muj
    public final View a() {
        return this.d;
    }

    @Override // defpackage.muj
    public final asip b(asip asipVar) {
        return asipVar;
    }

    @Override // defpackage.muj
    public final asjg c(asjg asjgVar) {
        return asjgVar;
    }

    @Override // defpackage.muj
    public final View d() {
        this.g.setOnTouchListener(new View.OnTouchListener() { // from class: mtw
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                mtx mtxVar = mtx.this;
                if (motionEvent.getAction() == 1) {
                    mtxVar.a.H(3, new acte(mtxVar.b.i), null);
                    return false;
                }
                return false;
            }
        });
        TextView textView = this.e;
        arag aragVar = this.b.c;
        if (aragVar == null) {
            aragVar = arag.a;
        }
        zag.m(textView, ajgl.b(aragVar));
        TextView textView2 = this.f;
        arag aragVar2 = this.b.e;
        if (aragVar2 == null) {
            aragVar2 = arag.a;
        }
        zag.m(textView2, ajgl.b(aragVar2));
        mtv mtvVar = new mtv(this.g.getContext());
        mtvVar.setDropDownViewResource(17367049);
        for (int i = 0; i < this.b.d.size(); i++) {
            arar ararVar = (arar) this.b.d.get(i);
            mtvVar.add(ararVar);
            if (ararVar.d) {
                this.n = i;
            }
        }
        this.g.setAdapter((SpinnerAdapter) mtvVar);
        Spinner spinner = this.g;
        arag aragVar3 = this.b.c;
        if (aragVar3 == null) {
            aragVar3 = arag.a;
        }
        spinner.setPrompt(ajgl.b(aragVar3));
        if (this.l) {
            this.g.setSelection(this.n, false);
            this.m = this.n;
        } else {
            int i2 = this.n;
            if (i2 > 0) {
                this.g.setSelection(i2);
                this.m = this.n;
            }
        }
        this.g.setOnItemSelectedListener(this);
        this.a.u(new acte(this.b.i), null);
        return this.d;
    }

    @Override // defpackage.muj
    public final mui e(boolean z) {
        aras arasVar = this.b;
        if (((arar) arasVar.d.get(this.m)).e) {
            apzg apzgVar = this.b.g;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            asir asirVar = this.b.h;
            if (asirVar == null) {
                asirVar = asir.a;
            }
            return mui.a(false, apzgVar, asirVar);
        }
        return mui.a(true, null, null);
    }

    @Override // defpackage.muj
    public final String f() {
        aras arasVar = this.b;
        return ((arar) arasVar.d.get(this.m)).b;
    }

    @Override // defpackage.muj
    public final void g(boolean z) {
        if (z) {
            if (this.j) {
                this.e.setTextColor(zhn.d(this.c, R.attr.ytErrorIndicator));
                this.g.setBackground(akf.a(this.c, R.drawable.ad_spinner_textfield_error_background_material));
            }
            if ((this.b.b & 4) != 0) {
                if (this.j) {
                    this.f.setTextColor(zhn.d(this.c, R.attr.ytErrorIndicator));
                }
                TextView textView = this.f;
                arag aragVar = this.b.f;
                if (aragVar == null) {
                    aragVar = arag.a;
                }
                zag.m(textView, ajgl.b(aragVar));
            }
            this.d.setBackgroundColor(zhn.d(this.c, true != this.j ? R.attr.ytGeneralBackgroundB : R.attr.ytBadgeChipBackground));
            return;
        }
        TextView textView2 = this.f;
        arag aragVar2 = this.b.e;
        if (aragVar2 == null) {
            aragVar2 = arag.a;
        }
        zag.m(textView2, ajgl.b(aragVar2));
        this.d.setBackgroundColor(0);
        if (!this.j) {
            return;
        }
        this.e.setTextColor(zhn.d(this.c, R.attr.adText2));
        this.f.setTextColor(zhn.d(this.c, R.attr.adText2));
        this.g.setBackground(akf.a(this.c, R.drawable.ad_spinner_textfield_background_material));
    }

    @Override // defpackage.muj
    public final boolean h() {
        return this.m != this.n;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        this.m = i;
        if (!this.o) {
            aafo aafoVar = this.h;
            apzg apzgVar = this.i.h;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            aafoVar.c(apzgVar, null);
            this.o = true;
        }
        if (this.k) {
            mui e = e(this.i.e);
            g(true ^ e.a);
            if (e.a) {
                return;
            }
            mvj.b(this.a, new acte(this.b.i), e.c);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
