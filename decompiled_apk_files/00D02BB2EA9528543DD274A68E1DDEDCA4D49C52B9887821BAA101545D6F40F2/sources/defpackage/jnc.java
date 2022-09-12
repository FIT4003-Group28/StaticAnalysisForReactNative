package defpackage;

import android.view.View;
import android.view.ViewGroup;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: jnc  reason: default package */
/* loaded from: classes7.dex */
public final class jnc implements ViewGroup.OnHierarchyChangeListener {
    final /* synthetic */ jnk a;

    public jnc(jnk jnkVar) {
        this.a = jnkVar;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        jnk jnkVar = this.a;
        if (view != jnkVar) {
            return;
        }
        if (view2 instanceof jnf) {
            View view3 = jnkVar.e;
            if (view3 != view2) {
                if (view3 != null) {
                    jnkVar.removeView(view3);
                }
                jnkVar.e = view2;
                jnkVar.g = new jnj(jnkVar, jnkVar.e);
                jnkVar.m(jnkVar.e);
            }
            jnk jnkVar2 = this.a;
            jnkVar2.l(jnkVar2.c.e());
        } else if (!(view2 instanceof jne)) {
        } else {
            View view4 = jnkVar.f;
            if (view4 != view2) {
                if (view4 != null) {
                    jnkVar.removeView(view4);
                }
                jnkVar.f = view2;
                jnkVar.h = new jnj(jnkVar, jnkVar.f);
                jnkVar.m(jnkVar.f);
            }
            jnk jnkVar3 = this.a;
            jnkVar3.l(jnkVar3.c.e());
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
    }
}
