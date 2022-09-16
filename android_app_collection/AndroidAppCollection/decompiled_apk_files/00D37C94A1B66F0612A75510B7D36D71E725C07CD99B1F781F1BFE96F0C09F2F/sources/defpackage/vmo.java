package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: vmo  reason: default package */
/* loaded from: classes4.dex */
public final class vmo extends vng {
    public static final vng a = new vmo();

    private vmo() {
    }

    @Override // defpackage.vng
    public final /* bridge */ /* synthetic */ vnf a(vlj vljVar, String str, Executor executor, vjb vjbVar) {
        aoos a2;
        if (vljVar.f) {
            a2 = aoos.b();
        } else {
            a2 = aoos.a();
        }
        return new vmq(str, anlz.q(vljVar.a), vnl.a(vljVar.b, a2), executor, vjbVar, vljVar.c, vljVar.h ? amlc.d() : amlc.c());
    }

    @Override // defpackage.vng
    public final String b() {
        return "singleproc";
    }
}
