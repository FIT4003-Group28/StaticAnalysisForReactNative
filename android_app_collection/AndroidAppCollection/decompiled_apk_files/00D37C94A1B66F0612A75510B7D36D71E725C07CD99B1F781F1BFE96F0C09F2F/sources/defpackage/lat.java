package defpackage;

import java.lang.ref.WeakReference;
/* compiled from: PG */
/* renamed from: lat  reason: default package */
/* loaded from: classes3.dex */
final class lat implements ajrt, lar {
    final /* synthetic */ lau a;

    public lat(lau lauVar) {
        this.a = lauVar;
    }

    @Override // defpackage.ajrt
    public final void a(ajrs ajrsVar, ajqm ajqmVar, int i) {
        lau lauVar = this.a;
        if (i != 0) {
            return;
        }
        Object c = ajqmVar.c(0);
        if (!(c instanceof argv) || !pns.i((argv) c)) {
            return;
        }
        ajrsVar.f("refinement_selection_listener", lauVar.b);
        ajrsVar.f("refinement_selection_controller", lauVar.a);
    }

    @Override // defpackage.lar
    public final void j(aupl auplVar, int i) {
        lar larVar;
        lar a;
        las lasVar = this.a.a;
        aupl auplVar2 = lasVar.b;
        int i2 = lasVar.c;
        lasVar.b = auplVar;
        lasVar.c = i;
        if (auplVar2 != null && (a = lasVar.a(auplVar2)) != null) {
            a.j(auplVar2, i2);
        }
        lar a2 = lasVar.a(auplVar);
        if (a2 != null) {
            a2.j(auplVar, i);
        }
        WeakReference weakReference = this.a.d;
        if (weakReference == null || (larVar = (lar) weakReference.get()) == null) {
            return;
        }
        larVar.j(auplVar, i);
    }
}
