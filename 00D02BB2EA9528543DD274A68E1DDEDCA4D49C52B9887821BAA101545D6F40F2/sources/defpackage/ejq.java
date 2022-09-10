package defpackage;

import android.content.Context;
import com.google.android.apps.gmm.navigation.service.detection.ActivityRecognitionReceiver;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ejq  reason: default package */
/* loaded from: classes6.dex */
public final class ejq implements dxis {
    final /* synthetic */ fyu a;
    private volatile dzsj<asbb> b;

    public ejq(fyu fyuVar) {
        this.a = fyuVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ActivityRecognitionReceiver activityRecognitionReceiver = (ActivityRecognitionReceiver) obj;
        bvjj rB = this.a.a.rB();
        dxjg.e(rB);
        activityRecognitionReceiver.a = rB;
        cqat rR = this.a.a.rR();
        dxjg.e(rR);
        btrm rz = this.a.a.rz();
        dxjg.e(rz);
        bvjj rB2 = this.a.a.rB();
        dxjg.e(rB2);
        activityRecognitionReceiver.b = new asaw(rR, rz, rB2, this.a.cu(), this.a.bN());
        activityRecognitionReceiver.c = b();
        dzsj<asbb> dzsjVar = this.b;
        if (dzsjVar == null) {
            dzsjVar = new ejp<>(this);
            this.b = dzsjVar;
        }
        activityRecognitionReceiver.d = dzsjVar;
        bvrv e = this.a.a.e();
        dxjg.e(e);
        activityRecognitionReceiver.e = e;
    }

    public final asav b() {
        Context b = this.a.a.b();
        dxjg.e(b);
        cqat rR = this.a.a.rR();
        dxjg.e(rR);
        aukk qG = this.a.qG();
        cjqy tr = this.a.a.tr();
        dxjg.e(tr);
        cjqq tp = this.a.a.tp();
        dxjg.e(tp);
        return new asav(b, rR, qG, tr, tp);
    }
}
