package defpackage;

import android.view.View;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: cqib  reason: default package */
/* loaded from: classes.dex */
public final class cqib extends cqfb {
    @Override // defpackage.cqfb, defpackage.cqkv
    public final boolean a(cqku cqkuVar, @dzsi Object obj, cqjz<?> cqjzVar) {
        View view = cqjzVar.c;
        if (!(cqkuVar instanceof cqfe) || !(view instanceof cqic)) {
            return false;
        }
        cqic cqicVar = (cqic) view;
        cqfe cqfeVar = cqfe.ACCESSIBILITY_DELEGATE;
        if (((cqfe) cqkuVar).ordinal() != 209 || !(obj instanceof Boolean)) {
            return false;
        }
        if (((Boolean) obj).booleanValue()) {
            return true;
        }
        cqhr m = cqjzVar.g.m();
        cqic cqicVar2 = (cqic) cqjzVar.c;
        ViewGroup viewGroup = (ViewGroup) cqicVar2.getParent();
        int indexOfChild = viewGroup.indexOfChild(cqicVar2);
        viewGroup.removeView(cqicVar2);
        cqjz<?> a = m.a(cqjzVar.f, cqicVar2.a, viewGroup, false, null, cqicVar2, cqicVar2.b, cqicVar2.c);
        viewGroup.addView(a.c, indexOfChild);
        cqkp cqkpVar = cqjzVar.j;
        cqkf<?> e = cqjzVar.e();
        cqjzVar.p(null);
        cqjzVar.x(null, 2);
        a.p(cqkpVar);
        a.x(cqkpVar, 2);
        if (e != null) {
            cqjzVar.f(null);
            e.b(a);
            a.f(e);
        }
        return true;
    }
}
