package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
/* compiled from: PG */
/* renamed from: mvh  reason: default package */
/* loaded from: classes3.dex */
public final class mvh extends mtm implements AdapterView.OnItemSelectedListener, muj {
    private final aras m;
    private final boolean n;
    private final boolean o;

    public mvh(Context context, aafo aafoVar, acti actiVar, ViewGroup viewGroup, arbc arbcVar, aras arasVar, aadd aaddVar) {
        super(context, aafoVar, actiVar, viewGroup, arbcVar, aaddVar);
        this.m = arasVar;
        this.n = xrz.i(aaddVar);
        this.o = xrz.h(aaddVar);
    }

    @Override // defpackage.muj
    public final View d() {
        oP(this.m.i);
        oS(this.m.i);
        arag aragVar = this.m.c;
        if (aragVar == null) {
            aragVar = arag.a;
        }
        oR(aragVar);
        TextView textView = this.d;
        arag aragVar2 = this.m.e;
        if (aragVar2 == null) {
            aragVar2 = arag.a;
        }
        zag.m(textView, ajgl.b(aragVar2));
        mvg mvgVar = new mvg(this.e.getContext());
        mvgVar.setDropDownViewResource(17367049);
        for (int i = 0; i < this.m.d.size(); i++) {
            arar ararVar = (arar) this.m.d.get(i);
            mvgVar.add(ararVar);
            if (ararVar.d) {
                this.k = i;
            }
        }
        this.e.setAdapter((SpinnerAdapter) mvgVar);
        Spinner spinner = this.e;
        arag aragVar3 = this.m.c;
        if (aragVar3 == null) {
            aragVar3 = arag.a;
        }
        spinner.setPrompt(ajgl.b(aragVar3));
        if (this.o) {
            this.e.setSelection(this.k, false);
            this.j = this.k;
        } else {
            int i2 = this.k;
            if (i2 > 0) {
                this.e.setSelection(i2);
                this.j = this.k;
            }
        }
        this.e.setOnItemSelectedListener(this);
        return this.b;
    }

    @Override // defpackage.muj
    public final mui e(boolean z) {
        aras arasVar = this.m;
        boolean z2 = ((arar) arasVar.d.get(this.j)).e;
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
        aras arasVar = this.m;
        return ((arar) arasVar.d.get(this.j)).b;
    }

    @Override // defpackage.muj
    public final void g(boolean z) {
        aras arasVar = this.m;
        boolean z2 = (arasVar.b & 4) != 0;
        arag aragVar = arasVar.f;
        if (aragVar == null) {
            aragVar = arag.a;
        }
        arag aragVar2 = this.m.e;
        i(z, z2, aragVar);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        oQ(i);
        if (this.n) {
            mui e = e(this.h.e);
            g(!e.a);
            if (e.a) {
                return;
            }
            mvj.b(this.g, new acte(this.m.i), e.c);
        }
    }
}
