package defpackage;

import com.google.android.apps.maps.R;
/* renamed from: cfwd  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class cfwd implements cqlc {
    static final cqlc a = new cfwd();

    private cfwd() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        cfsm cfsmVar = (cfsm) cqkpVar;
        return cfsmVar.l().booleanValue() ? cfsmVar.k() : Integer.valueOf((int) R.string.MOTIVATION_SHARE_THINGS_YOU_LOVE);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
