package defpackage;

import com.google.android.apps.maps.R;
/* renamed from: aiup  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class aiup implements cqlc {
    static final cqlc a = new aiup();

    private aiup() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        int i = aiut.a;
        if (((aius) cqkpVar).b().booleanValue()) {
            return cqrt.l(R.string.REQUESTED_LOCATION);
        }
        return cqrt.l(R.string.REQUEST_LOCATION);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
