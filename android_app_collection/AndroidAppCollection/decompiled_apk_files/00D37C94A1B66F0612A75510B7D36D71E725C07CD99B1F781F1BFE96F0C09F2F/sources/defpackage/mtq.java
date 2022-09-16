package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: mtq  reason: default package */
/* loaded from: classes3.dex */
public final class mtq extends mtm implements AdapterView.OnItemSelectedListener, muj {
    public final arao m;
    public mtq n;
    public mtq o;
    private final List p;
    private final boolean q;
    private final boolean r;

    public mtq(Context context, aafo aafoVar, acti actiVar, ViewGroup viewGroup, arbc arbcVar, arao araoVar, aadd aaddVar) {
        super(context, aafoVar, actiVar, viewGroup, arbcVar, aaddVar);
        this.m = araoVar;
        this.n = null;
        this.o = null;
        this.p = new ArrayList();
        this.q = xrz.i(aaddVar);
        this.r = xrz.h(aaddVar);
    }

    private final boolean m(int i) {
        return i >= 0 && i < this.p.size();
    }

    @Override // defpackage.muj
    public final View d() {
        oP(this.m.k);
        oS(this.m.k);
        arag aragVar = this.m.c;
        if (aragVar == null) {
            aragVar = arag.a;
        }
        oR(aragVar);
        return k("", this.o == null);
    }

    @Override // defpackage.muj
    public final mui e(boolean z) {
        boolean z2 = this.j == 0;
        apzg apzgVar = this.m.g;
        if (apzgVar == null) {
            apzgVar = apzg.a;
        }
        asir asirVar = this.m.h;
        if (asirVar == null) {
            asirVar = asir.a;
        }
        return j(z2, apzgVar, asirVar);
    }

    @Override // defpackage.muj
    public final String f() {
        return (String) this.p.get(this.j);
    }

    @Override // defpackage.muj
    public final void g(boolean z) {
        arao araoVar = this.m;
        boolean z2 = (araoVar.b & 4) != 0;
        arag aragVar = araoVar.f;
        if (aragVar == null) {
            aragVar = arag.a;
        }
        arag aragVar2 = this.m.e;
        i(z, z2, aragVar);
    }

    public final View k(String str, boolean z) {
        this.e.setEnabled(z);
        if (z) {
            this.c.setTextColor(zhn.d(this.a, R.attr.adText2));
            this.d.setTextColor(zhn.d(this.a, R.attr.adText2));
            TextView textView = this.d;
            arag aragVar = this.m.e;
            if (aragVar == null) {
                aragVar = arag.a;
            }
            zag.n(textView, ajgl.b(aragVar), 8);
            this.e.setBackground(akf.a(this.a, R.drawable.ad_spinner_textfield_background_material));
        } else {
            this.c.setTextColor(zhn.d(this.a, R.attr.ytTextSecondaryInverse));
            this.d.setTextColor(zhn.d(this.a, R.attr.ytTextSecondaryInverse));
            TextView textView2 = this.d;
            arag aragVar2 = this.m.e;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
            zag.n(textView2, ajgl.b(aragVar2), 0);
            this.e.setBackground(akf.a(this.a, R.drawable.ad_spinner_textfield_disabled_background_material));
        }
        mtp mtpVar = new mtp(this.e.getContext(), !this.e.isEnabled());
        mtpVar.setDropDownViewResource(17367049);
        this.p.clear();
        for (int i = 0; i < this.m.d.size(); i++) {
            aran aranVar = (aran) this.m.d.get(i);
            if (i == 0 || TextUtils.isEmpty(str) || (!TextUtils.isEmpty(str) && str.equals(aranVar.e))) {
                mtpVar.add(aranVar);
                this.p.add(aranVar.b);
            }
        }
        this.k = 0;
        if (this.r) {
            this.e.setOnItemSelectedListener(null);
        }
        this.e.setAdapter((SpinnerAdapter) mtpVar);
        Spinner spinner = this.e;
        arag aragVar3 = this.m.c;
        if (aragVar3 == null) {
            aragVar3 = arag.a;
        }
        spinner.setPrompt(ajgl.b(aragVar3));
        int i2 = this.k;
        this.j = i2;
        if (this.r) {
            this.e.setSelection(i2, false);
        }
        this.e.setOnItemSelectedListener(this);
        l(this.j);
        return this.b;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        oQ(i);
        l(i);
        if (this.q) {
            mui e = e(this.h.e);
            g(!e.a);
            if (e.a) {
                return;
            }
            mvj.b(this.g, new acte(this.m.k), e.c);
        }
    }

    private final void l(int i) {
        if (i == 0) {
            mtq mtqVar = this.n;
            if (mtqVar != null) {
                mtqVar.k("", false);
                return;
            }
            i = 0;
        }
        if (!m(i) || this.n == null) {
            return;
        }
        this.n.k(!m(i) ? null : (String) this.p.get(i), true);
    }
}
