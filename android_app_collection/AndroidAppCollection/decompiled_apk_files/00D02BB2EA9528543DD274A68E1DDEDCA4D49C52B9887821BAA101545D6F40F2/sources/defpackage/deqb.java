package defpackage;

import android.os.RemoteException;
/* compiled from: PG */
/* renamed from: deqb  reason: default package */
/* loaded from: classes6.dex */
final class deqb extends cntd<depx, dept> {
    private final String a;
    private final delh e;

    public deqb(delh delhVar, String str) {
        this.a = str;
        this.e = delhVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cntd
    public final /* bridge */ /* synthetic */ void a(depx depxVar, cpct<dept> cpctVar) {
        depx depxVar2 = depxVar;
        try {
            ((deqi) depxVar2.L()).e(new deqa(this.e, cpctVar), this.a);
        } catch (RemoteException unused) {
        }
    }
}
