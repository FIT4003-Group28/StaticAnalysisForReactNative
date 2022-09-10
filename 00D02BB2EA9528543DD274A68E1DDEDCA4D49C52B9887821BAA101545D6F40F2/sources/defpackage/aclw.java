package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aclw  reason: default package */
/* loaded from: classes2.dex */
public final class aclw implements cqkv {
    @Override // defpackage.cqkv
    public final boolean a(cqku cqkuVar, Object obj, cqjz<?> cqjzVar) {
        View view = cqjzVar.c;
        if (cqkuVar instanceof iug) {
            iug iugVar = iug.ADDRESS_AUTOCOMPLETE_CONTROLLER;
            if (((iug) cqkuVar).ordinal() == 97 && (view instanceof View) && (obj == null || (obj instanceof aclk))) {
                if (((aclk) obj) == null) {
                    throw new NullPointerException("Can't enable swipe logging with null params.");
                }
                if (view instanceof jnq) {
                    ((jnq) view).z = null;
                    throw null;
                }
                aclx aclxVar = new aclx(new acll());
                view.setTag(R.id.curvular_swipe_attach_state_change_listener, aclxVar);
                View.OnAttachStateChangeListener d = cqfp.d(view);
                if (d != null) {
                    if (d instanceof bvob) {
                        ((bvob) d).a.add(aclxVar);
                    } else {
                        cqfp.p(new bvob(d, aclxVar), view);
                    }
                } else {
                    cqfp.p(aclxVar, view);
                }
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cqkv
    public final boolean b(cqku cqkuVar, cqjz<?> cqjzVar) {
        View view = cqjzVar.c;
        if (cqkuVar instanceof iug) {
            iug iugVar = iug.ADDRESS_AUTOCOMPLETE_CONTROLLER;
            if (((iug) cqkuVar).ordinal() == 97 && (view instanceof View)) {
                if (view instanceof jnq) {
                    bvoo.h("swipeLogging() on GmmViewPager is not supported yet.", new Object[0]);
                    return true;
                }
                View.OnAttachStateChangeListener onAttachStateChangeListener = (View.OnAttachStateChangeListener) view.getTag(R.id.curvular_swipe_attach_state_change_listener);
                if (onAttachStateChangeListener == null) {
                    view.toString();
                    return true;
                }
                view.setTag(R.id.curvular_swipe_attach_state_change_listener, null);
                View.OnAttachStateChangeListener d = cqfp.d(view);
                if (d instanceof bvob) {
                    ((bvob) d).a.remove(onAttachStateChangeListener);
                    return true;
                } else if (d != onAttachStateChangeListener) {
                    return true;
                } else {
                    cqfp.p(null, view);
                    return true;
                }
            }
        }
        return false;
    }
}
