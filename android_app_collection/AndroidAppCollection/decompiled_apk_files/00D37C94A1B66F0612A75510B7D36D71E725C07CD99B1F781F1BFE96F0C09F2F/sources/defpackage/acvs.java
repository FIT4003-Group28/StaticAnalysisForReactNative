package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: acvs  reason: default package */
/* loaded from: classes.dex */
final class acvs implements ynj {
    public final List a = new ArrayList();
    public final List b = new ArrayList();
    public final List c = new ArrayList();
    public final List d = new ArrayList();
    public final List e = new ArrayList();
    final /* synthetic */ acvz f;

    public acvs(acvz acvzVar) {
        this.f = acvzVar;
    }

    private static final void b(Object obj, List list) {
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((ynj) it.next()).a(obj);
            }
        }
    }

    @Override // defpackage.ynj
    public final void a(Object obj) {
        b(obj, this.c);
        b(obj, this.a);
        b(obj, this.b);
        b(obj, this.d);
        b(obj, this.e);
        acvz acvzVar = this.f;
        for (acvk acvkVar : acvzVar.b) {
            if (!acvkVar.a) {
                acvzVar.c.b(acvkVar.b());
            }
        }
        acvzVar.b.clear();
    }
}
