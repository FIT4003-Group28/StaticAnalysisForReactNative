package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: aghw  reason: default package */
/* loaded from: classes.dex */
final class aghw implements yiw {
    final /* synthetic */ agib a;

    public aghw(agib agibVar) {
        this.a = agibVar;
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        Void r1 = (Void) obj;
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        Void r1 = (Void) obj;
        List list = (List) obj2;
        if (list == null || list.isEmpty()) {
            return;
        }
        ((agxc) this.a.f.get()).e(this.a.c);
    }
}
