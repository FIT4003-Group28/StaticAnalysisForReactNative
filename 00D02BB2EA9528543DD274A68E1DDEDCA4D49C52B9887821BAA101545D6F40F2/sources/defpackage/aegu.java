package defpackage;

import android.view.View;
import android.view.ViewGroup;
/* renamed from: aegu  reason: default package */
/* loaded from: classes2.dex */
public final /* synthetic */ class aegu implements aegq {
    public static final aegq a = new aegu();

    private aegu() {
    }

    @Override // defpackage.aegq
    public final View a(ViewGroup viewGroup) {
        if (!(viewGroup instanceof jnq)) {
            return null;
        }
        jnq jnqVar = (jnq) viewGroup;
        bas basVar = jnqVar.w;
        jnp jnpVar = jnqVar.u;
        Object obj = jnpVar != null ? jnpVar.e.get() : null;
        if (basVar == null || obj == null) {
            return null;
        }
        for (int i = 0; i < jnqVar.getChildCount(); i++) {
            if (basVar.OW(jnqVar.getChildAt(i), obj)) {
                return jnqVar.getChildAt(i);
            }
        }
        return null;
    }
}
