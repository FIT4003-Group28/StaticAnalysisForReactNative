package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class j implements LayoutInflater.Factory2 {

    /* renamed from: b  reason: collision with root package name */
    private final l f1695b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(l lVar) {
        this.f1695b = lVar;
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        if (f.class.getName().equals(str)) {
            return new f(context, attributeSet, this.f1695b);
        }
        Fragment fragment = null;
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.k.c.Fragment);
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(a.k.c.Fragment_android_name);
        }
        int resourceId = obtainStyledAttributes.getResourceId(a.k.c.Fragment_android_id, -1);
        String string = obtainStyledAttributes.getString(a.k.c.Fragment_android_tag);
        obtainStyledAttributes.recycle();
        if (attributeValue == null || !h.b(context.getClassLoader(), attributeValue)) {
            return null;
        }
        int id = view != null ? view.getId() : 0;
        if (id == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
        }
        if (resourceId != -1) {
            fragment = this.f1695b.a(resourceId);
        }
        if (fragment == null && string != null) {
            fragment = this.f1695b.b(string);
        }
        if (fragment == null && id != -1) {
            fragment = this.f1695b.a(id);
        }
        if (l.d(2)) {
            Log.v("FragmentManager", "onCreateView: id=0x" + Integer.toHexString(resourceId) + " fname=" + attributeValue + " existing=" + fragment);
        }
        if (fragment == null) {
            fragment = this.f1695b.p().a(context.getClassLoader(), attributeValue);
            fragment.n = true;
            fragment.w = resourceId != 0 ? resourceId : id;
            fragment.x = id;
            fragment.y = string;
            fragment.o = true;
            l lVar = this.f1695b;
            fragment.s = lVar;
            i<?> iVar = lVar.o;
            fragment.t = iVar;
            fragment.a(iVar.f(), attributeSet, fragment.f1639c);
            this.f1695b.a(fragment);
            this.f1695b.j(fragment);
        } else if (fragment.o) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
        } else {
            fragment.o = true;
            i<?> iVar2 = this.f1695b.o;
            fragment.t = iVar2;
            fragment.a(iVar2.f(), attributeSet, fragment.f1639c);
        }
        l lVar2 = this.f1695b;
        if (lVar2.n >= 1 || !fragment.n) {
            this.f1695b.j(fragment);
        } else {
            lVar2.a(fragment, 1);
        }
        View view2 = fragment.H;
        if (view2 != null) {
            if (resourceId != 0) {
                view2.setId(resourceId);
            }
            if (fragment.H.getTag() == null) {
                fragment.H.setTag(string);
            }
            return fragment.H;
        }
        throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
