package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cqrc  reason: default package */
/* loaded from: classes.dex */
public final class cqrc extends abz {
    private final cqkj c;
    private final cqrj d;

    public cqrc(cqkj cqkjVar, cqrj cqrjVar) {
        this.c = cqkjVar;
        this.d = cqrjVar;
    }

    private static boolean h(int i) {
        return i >= 0;
    }

    @Override // defpackage.abz
    public final void a() {
    }

    @Override // defpackage.abz
    @dzsi
    public final acl b(int i) {
        if (!h(i)) {
            return super.b(i);
        }
        cqkf g = this.c.g(this.d.a.h(i), null, false);
        if (g == null) {
            return null;
        }
        acl aclVar = (acl) g.c().getTag(R.id.recycled_view_pool_view_holder);
        if (aclVar != null) {
            return aclVar;
        }
        g.i();
        return null;
    }

    @Override // defpackage.abz
    public final void c(acl aclVar) {
        aclVar.a.setAccessibilityDelegate(null);
        if (!h(aclVar.f)) {
            super.c(aclVar);
            return;
        }
        aclVar.a.setTag(R.id.recycled_view_pool_view_holder, aclVar);
        this.c.h(aclVar.a);
    }
}
