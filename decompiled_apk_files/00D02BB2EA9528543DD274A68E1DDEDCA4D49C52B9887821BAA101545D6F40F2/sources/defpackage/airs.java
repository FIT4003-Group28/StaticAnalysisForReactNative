package defpackage;

import com.google.android.apps.gmm.map.model.location.GmmLocation;
/* compiled from: PG */
/* renamed from: airs  reason: default package */
/* loaded from: classes2.dex */
public final class airs<T> extends btrh<T> {
    public airs(Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        airr airrVar = ((airq) this.a).a;
        GmmLocation a = ((amqo) obj).a();
        akqq akqqVar = null;
        if (a != null) {
            if (a.getLatitude() != dcyn.a || a.getLongitude() != dcyn.a) {
                akqqVar = new akqq(a.getLatitude(), a.getLongitude());
            }
            if (akqq.v(akqqVar, airrVar.aV, 1.0d)) {
                return;
            }
            airrVar.aV = akqqVar;
        } else if (airrVar.aV == null) {
            return;
        } else {
            airrVar.aV = null;
        }
        airrVar.w();
    }
}
