package defpackage;

import com.google.android.apps.gmm.base.layout.MainLayout;
import com.google.android.apps.gmm.base.views.floorpicker.FloorPickerView;
/* compiled from: PG */
/* renamed from: gjo  reason: default package */
/* loaded from: classes6.dex */
public final class gjo implements cqkq<izc> {
    final /* synthetic */ MainLayout a;

    public gjo(MainLayout mainLayout) {
        this.a = mainLayout;
    }

    @Override // defpackage.cqkq
    public final /* bridge */ /* synthetic */ void a(izc izcVar) {
        izc izcVar2 = izcVar;
        dbsk.s(izcVar2);
        cqkf<izc> cqkfVar = ((FloorPickerView) this.a.L.b).a;
        if (cqkfVar != null) {
            cqkfVar.e(izcVar2);
        }
    }
}
