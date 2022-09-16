package defpackage;

import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bqwr  reason: default package */
/* loaded from: classes4.dex */
public final class bqwr implements bqlb {
    final /* synthetic */ bqxf a;

    public bqwr(bqxf bqxfVar) {
        this.a = bqxfVar;
    }

    @Override // defpackage.bqlb
    public final void d(bqlf bqlfVar) {
        bqxf bqxfVar = this.a;
        bqxfVar.aS(bqxfVar.a.getString(R.string.DRAFT_REVIEW_DELETED_TOAST));
        bqxf bqxfVar2 = this.a;
        bwrs<ilo> bwrsVar = bqxfVar2.au;
        dbsk.s(bwrsVar);
        bqxfVar2.aJ(bqlf.f(bwrsVar, 4));
    }

    @Override // defpackage.bqlb
    public final void e() {
        bqxf bqxfVar = this.a;
        bqxfVar.aS(bqxfVar.a.getString(R.string.DELETE_DRAFT_REVIEW_FAILURE_TOAST));
        bqxf bqxfVar2 = this.a;
        bwrs<ilo> bwrsVar = bqxfVar2.au;
        dbsk.s(bwrsVar);
        bqxfVar2.aJ(bqlf.f(bwrsVar, 6));
    }
}
