package defpackage;

import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: lpk  reason: default package */
/* loaded from: classes7.dex */
public final /* synthetic */ class lpk implements cqlc {
    static final cqlc a = new lpk();

    private lpk() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        int i = lqi.a;
        if (((lwp) cqkpVar).j().booleanValue()) {
            return nqu.aB(R.raw.car_only_ic_mic_36dp, nql.bj);
        }
        return nqu.aH(R.raw.car_only_ic_mic_off_36dp, nql.bj);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
