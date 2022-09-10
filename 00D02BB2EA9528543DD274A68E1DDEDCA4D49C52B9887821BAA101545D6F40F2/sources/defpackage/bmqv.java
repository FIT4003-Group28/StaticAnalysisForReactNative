package defpackage;

import com.google.android.apps.maps.R;
/* renamed from: bmqv  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bmqv implements cqlc {
    static final cqlc a = new bmqv();

    private bmqv() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        int i = bmrw.b;
        if (((bmtv) cqkpVar).G().booleanValue()) {
            return cqrt.l(R.string.ACCESSIBILITY_INSTRUCTION_EXPAND);
        }
        return cqrt.l(R.string.ACCESSIBILITY_INSTRUCTION_COLLAPSE);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
