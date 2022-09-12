package defpackage;

import com.google.android.apps.maps.R;
/* renamed from: blck  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class blck implements cqlc {
    static final cqlc a = new blck();

    private blck() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        blkw blkwVar = (blkw) cqkpVar;
        int i = blda.a;
        if (cqjv.v(blkwVar.i()).booleanValue()) {
            return cqrt.l(R.string.ACCESSIBILITY_OVERFLOW_MENU);
        }
        return blkwVar.i();
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
