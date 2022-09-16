package defpackage;

import java.util.Collection;
/* compiled from: PG */
/* renamed from: ajgz  reason: default package */
/* loaded from: classes.dex */
public final class ajgz {
    public final amry a = amry.u();

    public final void a(ajgy ajgyVar) {
        b(ajgyVar, "");
    }

    public final void b(ajgy ajgyVar, String str) {
        ylr.c();
        this.a.p(str, ajgyVar);
    }

    public final void c() {
        ylr.c();
        for (ajgy ajgyVar : this.a.q()) {
            ajgyVar.lL();
        }
    }

    public final void d(ajgy ajgyVar) {
        e(ajgyVar, "");
    }

    public final void e(ajgy ajgyVar, String str) {
        ylr.c();
        Collection collection = (Collection) this.a.r().get(str);
        if (collection != null) {
            collection.remove(ajgyVar);
        }
    }
}
