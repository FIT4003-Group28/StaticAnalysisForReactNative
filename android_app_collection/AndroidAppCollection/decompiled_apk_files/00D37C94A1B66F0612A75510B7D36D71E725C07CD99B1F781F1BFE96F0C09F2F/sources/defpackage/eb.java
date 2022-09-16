package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v4.app.FragmentContainerView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: eb  reason: default package */
/* loaded from: classes3.dex */
public final class eb implements LayoutInflater.Factory2 {
    final eo a;

    public eb(eo eoVar) {
        this.a = eoVar;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        et k;
        if (FragmentContainerView.class.getName().equals(str)) {
            return new FragmentContainerView(context, attributeSet, this.a);
        }
        dp dpVar = null;
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, cm.a);
        int i = 0;
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        String string = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        if (attributeValue == null || !dy.b(context.getClassLoader(), attributeValue)) {
            return null;
        }
        if (view != null) {
            i = view.getId();
        }
        if (i == -1) {
            if (resourceId != -1) {
                i = -1;
            } else if (string == null) {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
            } else {
                i = -1;
                resourceId = -1;
            }
        }
        if (resourceId != -1) {
            dpVar = this.a.e(resourceId);
        }
        if (dpVar == null && string != null) {
            dpVar = this.a.f(string);
        }
        if (dpVar == null && i != -1) {
            dpVar = this.a.e(i);
        }
        if (dpVar == null) {
            dy i2 = this.a.i();
            context.getClassLoader();
            dpVar = i2.c(attributeValue);
            dpVar.u = true;
            dpVar.D = resourceId != 0 ? resourceId : i;
            dpVar.E = i;
            dpVar.F = string;
            dpVar.v = true;
            dpVar.z = this.a;
            eo eoVar = this.a;
            dpVar.A = eoVar.m;
            Context context2 = eoVar.m.c;
            Bundle bundle = dpVar.h;
            dpVar.aA();
            k = this.a.j(dpVar);
            if (eo.X(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Fragment ");
                sb.append(dpVar);
                sb.append(" has been inflated via the <fragment> tag: id=0x");
                sb.append(Integer.toHexString(resourceId));
            }
        } else if (dpVar.v) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(i) + " with another fragment for " + attributeValue);
        } else {
            dpVar.v = true;
            dpVar.z = this.a;
            eo eoVar2 = this.a;
            dpVar.A = eoVar2.m;
            Context context3 = eoVar2.m.c;
            dpVar.aA();
            k = this.a.k(dpVar);
            if (eo.X(2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Retained Fragment ");
                sb2.append(dpVar);
                sb2.append(" has been re-attached via the <fragment> tag: id=0x");
                sb2.append(Integer.toHexString(resourceId));
            }
        }
        ViewGroup viewGroup = (ViewGroup) view;
        ape.b(dpVar, viewGroup);
        dpVar.N = viewGroup;
        k.e();
        k.d();
        View view2 = dpVar.O;
        if (view2 == null) {
            throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
        }
        if (resourceId != 0) {
            view2.setId(resourceId);
        }
        if (dpVar.O.getTag() == null) {
            dpVar.O.setTag(string);
        }
        dpVar.O.addOnAttachStateChangeListener(new ea(this, k));
        return dpVar.O;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
