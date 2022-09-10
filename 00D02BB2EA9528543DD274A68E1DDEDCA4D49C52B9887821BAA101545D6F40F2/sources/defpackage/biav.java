package defpackage;

import com.google.android.apps.maps.R;
/* renamed from: biav  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class biav implements cqlc {
    static final cqlc a = new biav();

    private biav() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        cqtv cqtvVar = bibo.a;
        if (((bibs) cqkpVar).c().booleanValue()) {
            return cqrt.l(R.string.ACCESSIBILITY_INSTRUCTION_COLLAPSE);
        }
        return cqrt.l(R.string.ACCESSIBILITY_INSTRUCTION_EXPAND);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
