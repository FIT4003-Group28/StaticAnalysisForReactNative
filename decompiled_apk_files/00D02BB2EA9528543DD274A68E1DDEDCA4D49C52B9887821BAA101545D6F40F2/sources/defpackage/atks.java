package defpackage;

import com.google.android.apps.maps.R;
/* renamed from: atks  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class atks implements cqlc {
    static final cqlc a = new atks();

    private atks() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        atna atnaVar = (atna) cqkpVar;
        int i = atkx.a;
        if (atnaVar.O().booleanValue()) {
            return cqrt.l(R.string.JOURNEY_UNSHARE_BUTTON);
        }
        if (atnaVar.N().booleanValue()) {
            return cqrt.l(R.string.JOURNEY_WAITING_BUTTON);
        }
        return cqrt.l(R.string.JOURNEY_SHARE_BUTTON);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
