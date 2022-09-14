package defpackage;

import com.google.android.apps.gmm.directions.api.GmmNotice;
/* renamed from: albx  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class albx implements dbrn {
    static final dbrn a = new albx();

    private albx() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        dozw dozwVar;
        dozz c = ((GmmNotice) obj).c();
        if (c.b == 25) {
            dozwVar = (dozw) c.c;
        } else {
            dozwVar = dozw.e;
        }
        return Double.valueOf(dozwVar.d);
    }
}
