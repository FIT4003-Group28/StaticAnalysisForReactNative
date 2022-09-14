package defpackage;

import com.google.android.apps.maps.R;
/* renamed from: acqn  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class acqn implements cqlc {
    static final cqlc a = new acqn();

    private acqn() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        int i = acqo.a;
        if (((acqv) cqkpVar).b().booleanValue()) {
            return cqrt.l(R.string.WAIT_TIMES_TAP_HOURS_INSTRUCTION);
        }
        return cqrt.l(R.string.BUSYNESS_TAP_HOURS_INSTRUCTION);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
