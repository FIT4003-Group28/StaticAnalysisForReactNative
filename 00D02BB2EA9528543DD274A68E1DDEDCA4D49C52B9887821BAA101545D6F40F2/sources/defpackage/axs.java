package defpackage;

import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: axs  reason: default package */
/* loaded from: classes3.dex */
final class axs extends ayo {
    final /* synthetic */ Object a;
    final /* synthetic */ ArrayList b;
    final /* synthetic */ Object c;
    final /* synthetic */ ArrayList d;
    final /* synthetic */ Object e;
    final /* synthetic */ ArrayList f;
    final /* synthetic */ axw g;

    public axs(axw axwVar, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
        this.g = axwVar;
        this.a = obj;
        this.b = arrayList;
        this.c = obj2;
        this.d = arrayList2;
        this.e = obj3;
        this.f = arrayList3;
    }

    @Override // defpackage.ayo, defpackage.aym
    public final void a(ayn aynVar) {
        aynVar.E(this);
    }

    @Override // defpackage.ayo, defpackage.aym
    public final void e(ayn aynVar) {
        Object obj = this.a;
        if (obj != null) {
            this.g.l(obj, this.b, null);
        }
        Object obj2 = this.c;
        if (obj2 != null) {
            this.g.l(obj2, this.d, null);
        }
        Object obj3 = this.e;
        if (obj3 != null) {
            this.g.l(obj3, this.f, null);
        }
    }
}
