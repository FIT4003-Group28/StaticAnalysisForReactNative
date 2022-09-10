package defpackage;

import com.google.android.apps.gmm.cloudmessage.chime.ChimeCloudMessageReceiver;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ejx  reason: default package */
/* loaded from: classes6.dex */
final class ejx implements dxis {
    final /* synthetic */ fyu a;

    public ejx(fyu fyuVar) {
        this.a = fyuVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ChimeCloudMessageReceiver chimeCloudMessageReceiver = (ChimeCloudMessageReceiver) obj;
        pbj bw = this.a.bw();
        dcdc<pbo> p = bw != null ? bw.p() : dcdc.e();
        dxjg.f(p);
        chimeCloudMessageReceiver.a = p;
        Executor sV = this.a.a.sV();
        dxjg.e(sV);
        chimeCloudMessageReceiver.b = sV;
        Executor sU = this.a.a.sU();
        dxjg.e(sU);
        chimeCloudMessageReceiver.c = sU;
        chimeCloudMessageReceiver.d = this.a.qc();
        ckcw rU = this.a.a.rU();
        dxjg.e(rU);
        chimeCloudMessageReceiver.e = rU;
        bvrv e = this.a.a.e();
        dxjg.e(e);
        chimeCloudMessageReceiver.f = e;
        akfa rK = this.a.a.rK();
        dxjg.e(rK);
        chimeCloudMessageReceiver.g = rK;
    }
}
