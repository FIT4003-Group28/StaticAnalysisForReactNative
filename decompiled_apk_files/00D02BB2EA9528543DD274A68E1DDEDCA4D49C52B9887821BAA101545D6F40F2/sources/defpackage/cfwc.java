package defpackage;

import com.google.android.apps.maps.R;
/* renamed from: cfwc  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class cfwc implements cqlc {
    static final cqlc a = new cfwc();

    private cfwc() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        cfsm cfsmVar = (cfsm) cqkpVar;
        return cfsmVar.l().booleanValue() ? cfsmVar.j() : Integer.valueOf((int) R.string.MOTIVATION_HELP_PEOPLE_EVERYWHERE);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
