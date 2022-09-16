package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: vmf  reason: default package */
/* loaded from: classes4.dex */
public final class vmf extends vng {
    public static final vng a = new vmf();

    private vmf() {
    }

    @Override // defpackage.vng
    public final /* bridge */ /* synthetic */ vnf a(vlj vljVar, String str, Executor executor, vjb vjbVar) {
        aoos a2;
        aqxo.p(vljVar.e instanceof vlt);
        if (vljVar.f) {
            a2 = aoos.b();
        } else {
            a2 = aoos.a();
        }
        return new vmh(str, anlz.q(vljVar.a), vnl.a(vljVar.b, a2), executor, vjbVar, ((vlt) vljVar.e).a, vljVar.c, vljVar.h ? amlc.d() : amlc.c());
    }

    @Override // defpackage.vng
    public final String b() {
        return "signal";
    }
}
