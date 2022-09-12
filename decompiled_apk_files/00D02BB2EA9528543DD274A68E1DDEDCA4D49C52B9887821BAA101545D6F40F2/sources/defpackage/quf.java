package defpackage;

import com.google.android.apps.gmm.map.model.location.GmmLocation;
/* compiled from: PG */
/* renamed from: quf  reason: default package */
/* loaded from: classes7.dex */
public final class quf {
    public final dxio<ahjq> a;
    public final btvo b;
    public final dxio<qrt> c;

    public quf(dxio<ahjq> dxioVar, btvo btvoVar, dxio<qrt> dxioVar2) {
        this.a = dxioVar;
        this.b = btvoVar;
        this.c = dxioVar2;
    }

    public final boolean a(@dzsi GmmLocation gmmLocation, @dzsi azva azvaVar) {
        akqq akqqVar;
        if (gmmLocation != null && (akqqVar = azvaVar.e) != null) {
            float F = gmmLocation.F(akqqVar);
            btvo btvoVar = this.b;
            dndr dndrVar = azvaVar.a;
            dktt dkttVar = btvoVar.getPassiveAssistParameters().a().am;
            if (dkttVar == null) {
                dkttVar = dktt.z;
            }
            if (F < (dndrVar == dndr.HOME ? dkttVar.a : dndrVar == dndr.WORK ? dkttVar.b : 800)) {
                return true;
            }
        }
        return false;
    }
}
