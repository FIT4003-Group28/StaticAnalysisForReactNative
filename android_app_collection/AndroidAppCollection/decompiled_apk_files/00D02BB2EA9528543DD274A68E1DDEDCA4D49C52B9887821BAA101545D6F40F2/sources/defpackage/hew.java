package defpackage;

import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: hew  reason: default package */
/* loaded from: classes6.dex */
public final /* synthetic */ class hew implements cqlc {
    static final cqlc a = new hew();

    private hew() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        jax jaxVar = (jax) cqkpVar;
        int i = hfp.a;
        if (cqjv.v(jaxVar.i()).booleanValue()) {
            return cqrt.l(R.string.ACCESSIBILITY_OVERFLOW_MENU);
        }
        return jaxVar.i();
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
