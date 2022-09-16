package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: actx  reason: default package */
/* loaded from: classes.dex */
public final class actx implements ViewGroup.OnHierarchyChangeListener {
    private final acti a;

    public actx(acti actiVar) {
        this.a = actiVar;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        if (this.a.c() == null) {
            return;
        }
        Object tag = view2.getTag(R.id.logging_directable_supplier_tag);
        if (tag instanceof actw) {
            actw actwVar = (actw) tag;
            acti actiVar = this.a;
            aoqu aoquVar = actwVar.a;
            aoob aoobVar = actwVar.b;
            actwVar.c;
            actiVar.v(aoquVar, aoobVar, null);
        }
        acti actiVar2 = this.a;
        Object tag2 = view2.getTag(R.id.visual_element_container_tag);
        if (!(tag2 instanceof actd)) {
            return;
        }
        actiVar2.u(((actd) tag2).a, null);
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        if (this.a.c() == null) {
            return;
        }
        Object tag = view2.getTag(R.id.logging_directable_supplier_tag);
        if (!(tag instanceof actw)) {
            return;
        }
        actw actwVar = (actw) tag;
        acti actiVar = this.a;
        acte a = acte.a(actwVar.a);
        actwVar.c;
        actiVar.q(a, null);
    }
}
