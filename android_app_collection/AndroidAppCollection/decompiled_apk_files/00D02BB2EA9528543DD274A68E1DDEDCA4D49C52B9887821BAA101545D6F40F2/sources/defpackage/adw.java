package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: adw  reason: default package */
/* loaded from: classes.dex */
public abstract class adw extends abn {
    boolean m = true;

    public abstract boolean b(acl aclVar);

    public abstract boolean c(acl aclVar);

    public abstract boolean d(acl aclVar, int i, int i2, int i3, int i4);

    public abstract boolean e(acl aclVar, acl aclVar2, int i, int i2, int i3, int i4);

    @Override // defpackage.abn
    public final boolean l(acl aclVar, abm abmVar, abm abmVar2) {
        int i;
        int i2;
        int i3 = abmVar.a;
        int i4 = abmVar.b;
        View view = aclVar.a;
        if (abmVar2 == null) {
            i = view.getLeft();
        } else {
            i = abmVar2.a;
        }
        int i5 = i;
        if (abmVar2 == null) {
            i2 = view.getTop();
        } else {
            i2 = abmVar2.b;
        }
        int i6 = i2;
        if (!aclVar.p() && (i3 != i5 || i4 != i6)) {
            view.layout(i5, i6, view.getWidth() + i5, view.getHeight() + i6);
            return d(aclVar, i3, i4, i5, i6);
        }
        return b(aclVar);
    }

    @Override // defpackage.abn
    public final boolean m(acl aclVar, abm abmVar, abm abmVar2) {
        int i;
        int i2;
        if (abmVar == null || ((i = abmVar.a) == (i2 = abmVar2.a) && abmVar.b == abmVar2.b)) {
            return c(aclVar);
        }
        return d(aclVar, i, abmVar.b, i2, abmVar2.b);
    }

    @Override // defpackage.abn
    public final boolean n(acl aclVar, abm abmVar, abm abmVar2) {
        int i = abmVar.a;
        int i2 = abmVar2.a;
        if (i != i2 || abmVar.b != abmVar2.b) {
            return d(aclVar, i, abmVar.b, i2, abmVar2.b);
        }
        x(aclVar);
        return false;
    }

    @Override // defpackage.abn
    public boolean o(acl aclVar, acl aclVar2, abm abmVar, abm abmVar2) {
        int i;
        int i2;
        int i3 = abmVar.a;
        int i4 = abmVar.b;
        if (aclVar2.c()) {
            int i5 = abmVar.a;
            i2 = abmVar.b;
            i = i5;
        } else {
            i = abmVar2.a;
            i2 = abmVar2.b;
        }
        return e(aclVar, aclVar2, i3, i4, i, i2);
    }

    @Override // defpackage.abn
    public final boolean s(acl aclVar) {
        return !this.m || aclVar.m();
    }

    public final void x(acl aclVar) {
        y();
        p(aclVar);
    }

    public void y() {
    }

    public final void z() {
        this.m = false;
    }
}
