package defpackage;

import com.google.android.apps.gmm.locationsharing.reporting.LocationCollectedBroadcastReceiver;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: fuk  reason: default package */
/* loaded from: classes6.dex */
final class fuk implements dxis {
    final /* synthetic */ fyu a;

    public fuk(fyu fyuVar) {
        this.a = fyuVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        LocationCollectedBroadcastReceiver locationCollectedBroadcastReceiver = (LocationCollectedBroadcastReceiver) obj;
        locationCollectedBroadcastReceiver.b = this.a.ey();
        cqat rR = this.a.a.rR();
        dxjg.e(rR);
        locationCollectedBroadcastReceiver.c = rR;
        locationCollectedBroadcastReceiver.d = this.a.hz();
        locationCollectedBroadcastReceiver.e = this.a.hv();
        locationCollectedBroadcastReceiver.f = this.a.eP();
        ckcw rU = this.a.a.rU();
        dxjg.e(rU);
        locationCollectedBroadcastReceiver.g = rU;
        btvo rp = this.a.a.rp();
        dxjg.e(rp);
        locationCollectedBroadcastReceiver.h = rp;
        locationCollectedBroadcastReceiver.i = this.a.es();
        Executor sV = this.a.a.sV();
        dxjg.e(sV);
        locationCollectedBroadcastReceiver.j = sV;
    }
}
