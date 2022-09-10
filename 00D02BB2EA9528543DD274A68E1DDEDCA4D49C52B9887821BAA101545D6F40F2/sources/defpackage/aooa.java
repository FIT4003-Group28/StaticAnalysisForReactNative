package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aooa  reason: default package */
/* loaded from: classes2.dex */
class aooa extends aomf {
    final /* synthetic */ gga a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aooa(cqhn cqhnVar, gga ggaVar) {
        super(cqhnVar);
        this.a = ggaVar;
    }

    @Override // defpackage.aome
    public CharSequence e() {
        return this.a.getString(R.string.MAPS_ACTIVITY_SEGMENT_SHEET_EXPAND_MENU_TITLE);
    }

    @Override // defpackage.aome
    public CharSequence f() {
        return this.a.getString(R.string.MAPS_ACTIVITY_SEGMENT_SHEET_EXPAND_MENU_CONTENT_DESCRIPTION);
    }

    @Override // defpackage.aome
    public CharSequence g() {
        return this.a.getString(R.string.ACCESSIBILITY_INSTRUCTION_EXPAND);
    }

    @Override // defpackage.aome
    public CharSequence h() {
        return this.a.getString(R.string.ACCESSIBILITY_INSTRUCTION_COLLAPSE);
    }

    @Override // defpackage.aome
    public ddho i() {
        return dtxv.U;
    }
}
