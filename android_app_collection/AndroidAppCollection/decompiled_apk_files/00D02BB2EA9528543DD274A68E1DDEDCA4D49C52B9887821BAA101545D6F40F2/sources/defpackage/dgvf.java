package defpackage;

import java.lang.reflect.Type;
import java.util.Collection;
/* compiled from: PG */
/* renamed from: dgvf  reason: default package */
/* loaded from: classes6.dex */
public final class dgvf<E> extends dgtl<Collection<E>> {
    private final dgtl<E> a;
    private final dguw<? extends Collection<E>> b;

    public dgvf(dgsx dgsxVar, Type type, dgtl<E> dgtlVar, dguw<? extends Collection<E>> dguwVar) {
        this.a = new dgvu(dgsxVar, dgtlVar, type);
        this.b = dguwVar;
    }

    @Override // defpackage.dgtl
    public final /* bridge */ /* synthetic */ Object a(dgxe dgxeVar) {
        if (dgxeVar.q() == 9) {
            dgxeVar.j();
            return null;
        }
        Collection<E> a = this.b.a();
        dgxeVar.a();
        while (dgxeVar.e()) {
            a.add(this.a.a(dgxeVar));
        }
        dgxeVar.b();
        return a;
    }

    @Override // defpackage.dgtl
    public final /* bridge */ /* synthetic */ void b(dgxg dgxgVar, Object obj) {
        Collection<E> collection = (Collection) obj;
        if (collection == null) {
            dgxgVar.f();
            return;
        }
        dgxgVar.a();
        for (E e : collection) {
            this.a.b(dgxgVar, e);
        }
        dgxgVar.c();
    }
}
