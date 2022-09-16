package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.SpinnerAdapter;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: ceus  reason: default package */
/* loaded from: classes4.dex */
public class ceus<T> extends ceup implements cesl {
    public final cjqy a;
    public final ArrayAdapter<cerv<T>> b;
    public final List<cjql> c;
    public final ceur<T> d;
    public cerv<T> e;
    private final cjqq f;
    private final dcdc<cerv<T>> g;
    private final cjtd h;
    private final AdapterView.OnItemSelectedListener i;

    public ceus(Activity activity, cjqq cjqqVar, cjqy cjqyVar, cese ceseVar, dcdc<cerv<T>> dcdcVar, ceur<T> ceurVar, cjtd cjtdVar, boolean z) {
        super(ceseVar, true);
        this.c = new ArrayList();
        this.i = new ceuq(this);
        dbsk.l(!dcdcVar.isEmpty());
        this.f = cjqqVar;
        this.a = cjqyVar;
        this.g = dcdcVar;
        this.e = dcdcVar.get(0);
        this.b = new ArrayAdapter<>(activity, 17367043, dcdcVar);
        this.h = cjtdVar;
        this.d = ceurVar;
    }

    @Override // defpackage.jbg
    public AdapterView.OnItemSelectedListener Rs() {
        return this.i;
    }

    @Override // defpackage.jbg
    public Integer Rt() {
        return Integer.valueOf(this.g.indexOf(this.e));
    }

    @Override // defpackage.jbg
    public SpinnerAdapter Rv() {
        return this.b;
    }

    @Override // defpackage.cesl
    public cjtd d() {
        return this.h;
    }

    @Override // defpackage.ceup
    public void i(Bundle bundle) {
        super.i(bundle);
        bundle.putInt("profile_leaf_page_dropdown_option_index_key", this.g.indexOf(this.e));
    }

    @Override // defpackage.ceup
    public void j(Bundle bundle) {
        super.j(bundle);
        int i = bundle.getInt("profile_leaf_page_dropdown_option_index_key");
        if (i <= 0 || i >= this.g.size()) {
            return;
        }
        this.e = this.g.get(i);
    }

    public cerv<T> k() {
        return this.e;
    }

    public final void l(View view) {
        cjqp f = this.f.f(view);
        this.c.clear();
        dcdc<cerv<T>> dcdcVar = this.g;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            this.c.add(f.d(dcdcVar.get(i).c));
        }
    }
}
