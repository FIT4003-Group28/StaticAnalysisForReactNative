package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bqws  reason: default package */
/* loaded from: classes4.dex */
final class bqws implements bqlb {
    final /* synthetic */ bqxf a;

    public bqws(bqxf bqxfVar) {
        this.a = bqxfVar;
    }

    @Override // defpackage.bqlb
    public final void d(bqlf bqlfVar) {
        bqxf bqxfVar = this.a;
        bqxfVar.aS(bqxfVar.a.getString(R.string.DRAFT_REVIEW_OF_PREVIOUS_PLACE_DELETED_TOAST));
    }

    @Override // defpackage.bqlb
    public final void e() {
        bqxf bqxfVar = this.a;
        bqxfVar.aS(bqxfVar.a.getString(R.string.DELETE_DRAFT_REVIEW_OF_PREVIOUS_PLACE_FAILURE_TOAST));
    }
}
