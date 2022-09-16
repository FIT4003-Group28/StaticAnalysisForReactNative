package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fs  reason: default package */
/* loaded from: classes.dex */
public final class fs implements LayoutInflater.Factory2 {
    private final gn a;

    public fs(gn gnVar) {
        this.a = gnVar;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        gw A;
        if (fo.class.getName().equals(str)) {
            return new fo(context, attributeSet, this.a);
        }
        fd fdVar = null;
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ej.a);
        int i = 0;
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        String string = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        if (attributeValue == null || !fq.a(context.getClassLoader(), attributeValue)) {
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
            fdVar = this.a.G(resourceId);
        }
        if (fdVar == null && string != null) {
            fdVar = this.a.H(string);
        }
        if (fdVar == null && i != -1) {
            fdVar = this.a.G(i);
        }
        if (gn.a(2)) {
            String str2 = "onCreateView: id=0x" + Integer.toHexString(resourceId) + " fname=" + attributeValue + " existing=" + fdVar;
        }
        if (fdVar == null) {
            fdVar = this.a.al().c(context.getClassLoader(), attributeValue);
            fdVar.v = true;
            fdVar.E = resourceId != 0 ? resourceId : i;
            fdVar.F = i;
            fdVar.G = string;
            fdVar.w = true;
            fdVar.A = this.a;
            gn gnVar = this.a;
            fdVar.B = gnVar.k;
            Context context2 = gnVar.k.c;
            Bundle bundle = fdVar.j;
            fdVar.aF();
            A = this.a.A(fdVar);
            this.a.B(fdVar);
        } else if (fdVar.w) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(i) + " with another fragment for " + attributeValue);
        } else {
            fdVar.w = true;
            fdVar.A = this.a;
            gn gnVar2 = this.a;
            fdVar.B = gnVar2.k;
            Context context3 = gnVar2.k.c;
            fdVar.aF();
            A = this.a.A(fdVar);
        }
        A.b();
        A.c();
        View view2 = fdVar.P;
        if (view2 == null) {
            throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
        }
        if (resourceId != 0) {
            view2.setId(resourceId);
        }
        if (fdVar.P.getTag() == null) {
            fdVar.P.setTag(string);
        }
        return fdVar.P;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
