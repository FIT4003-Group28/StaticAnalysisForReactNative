package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.PopupMenu;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: ceuw  reason: default package */
/* loaded from: classes4.dex */
public class ceuw<T> extends ceup implements cesm {
    public final ceuv<T> a;
    public cerv<T> b;
    @dzsi
    public isc c;
    private final Activity d;
    private final isd e;
    private final dcdc<cerv<T>> f;

    public ceuw(Activity activity, cqhn cqhnVar, isd isdVar, cese ceseVar, dcdc<cerv<T>> dcdcVar, ceuv<T> ceuvVar, boolean z) {
        super(ceseVar, z);
        dbsk.l(!dcdcVar.isEmpty());
        this.d = activity;
        this.f = dcdcVar;
        this.b = dcdcVar.get(0);
        this.e = isdVar;
        this.a = ceuvVar;
    }

    @Override // defpackage.cesm
    public String a() {
        cerv<T> cervVar = this.b;
        if (cervVar == null) {
            return this.d.getString(R.string.CONTRIBUTIONS_SORT_BUTTON);
        }
        return this.d.getString(R.string.CONTRIBUTIONS_SORT_BUTTON_ACCESSIBILITY_DESCRIPTION, new Object[]{cervVar.a});
    }

    @Override // defpackage.cesm
    public cqkl b(View view) {
        isc iscVar = this.c;
        if (iscVar != null) {
            iscVar.dismiss();
        }
        isc a = this.e.a(view);
        ArrayList arrayList = new ArrayList();
        dcdc<cerv<T>> dcdcVar = this.f;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            final cerv<T> cervVar = dcdcVar.get(i);
            jhm jhmVar = new jhm();
            jhmVar.a = cervVar.a;
            jhmVar.f = cervVar.c;
            jhmVar.d(new View.OnClickListener(this, cervVar) { // from class: ceut
                private final ceuw a;
                private final cerv b;

                {
                    this.a = this;
                    this.b = cervVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ceuw ceuwVar = this.a;
                    cerv<T> cervVar2 = this.b;
                    if (cervVar2.equals(ceuwVar.b)) {
                        return;
                    }
                    ceuwVar.b = cervVar2;
                    ceuwVar.a.a(cervVar2.b);
                }
            });
            if (cervVar.equals(this.b)) {
                jhmVar.c = cqrt.f(2131232559);
            }
            arrayList.add(jhmVar.c());
        }
        a.a(arrayList);
        a.setOnDismissListener(new PopupMenu.OnDismissListener(this) { // from class: ceuu
            private final ceuw a;

            {
                this.a = this;
            }

            @Override // android.widget.PopupMenu.OnDismissListener
            public final void onDismiss(PopupMenu popupMenu) {
                ceuw ceuwVar = this.a;
                ceuwVar.c = null;
                cqkx.p(ceuwVar);
            }
        });
        a.show();
        this.c = a;
        cqkx.p(this);
        return cqkl.a;
    }

    @Override // defpackage.cesm
    public Boolean c() {
        return Boolean.valueOf(this.c != null);
    }

    public cerv<T> d() {
        return this.b;
    }

    @Override // defpackage.ceup
    public void i(Bundle bundle) {
        super.i(bundle);
        bundle.putInt("profile_leaf_page_sort_option_index_key", this.f.indexOf(this.b));
    }

    @Override // defpackage.ceup
    public void j(Bundle bundle) {
        super.j(bundle);
        int i = bundle.getInt("profile_leaf_page_sort_option_index_key");
        if (i <= 0 || i >= this.f.size()) {
            return;
        }
        this.b = this.f.get(i);
    }
}
