package defpackage;

import com.google.android.libraries.lidar.VisibilityChangeEventData;
/* compiled from: PG */
/* renamed from: tlb  reason: default package */
/* loaded from: classes4.dex */
public final class tlb extends tkj {
    public final tky a;

    public tlb(tky tkyVar) {
        this.a = tkyVar;
    }

    @Override // defpackage.tkj
    public final void a(tky tkyVar, tla tlaVar) {
        tjz tjzVar = tkyVar.f;
        if (tjzVar == null) {
            tjzVar = new tjz(0.0d, 0.0d, null, null, null, null);
        }
        c(tkyVar, new VisibilityChangeEventData(tjzVar, tkyVar.o, tkyVar.b().booleanValue()), tlaVar);
        tkyVar.m();
    }

    @Override // defpackage.tkj
    public final void b() {
        this.a.m();
    }
}
