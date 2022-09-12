package defpackage;

import com.google.android.apps.maps.R;
/* renamed from: aytg  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class aytg implements cqlc {
    static final cqlc a = new aytg();

    private aytg() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        int i = aytp.a;
        if (((ayvg) cqkpVar).b().booleanValue()) {
            return cqrt.l(R.string.ACCESSIBILITY_INSTRUCTION_COLLAPSE);
        }
        return cqrt.l(R.string.ACCESSIBILITY_INSTRUCTION_EXPAND);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
