package defpackage;

import com.google.android.youtube.R;
import java.util.concurrent.CountDownLatch;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: iqu  reason: default package */
/* loaded from: classes3.dex */
public final class iqu implements yiw {
    final /* synthetic */ iqw a;

    public iqu(iqw iqwVar) {
        this.a = iqwVar;
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        Void r2 = (Void) obj;
        yzj yzjVar = this.a.aA;
        yzjVar.d(yzjVar.b(exc));
        String valueOf = String.valueOf(String.valueOf(exc));
        afus.b(2, 10, valueOf.length() != 0 ? "Could not get playability result: ".concat(valueOf) : new String("Could not get playability result: "));
        this.a.an.m(this);
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        Void r4 = (Void) obj;
        int i = ((aiot) obj2).c - 1;
        if (i != 0) {
            if (i != 1) {
                iqw iqwVar = this.a;
                iqwVar.aJ(iqwVar.av, iqwVar.aj);
                return;
            }
            String valueOf = String.valueOf(this.a.av);
            zep.l(valueOf.length() != 0 ? "The following video is unplayable: ".concat(valueOf) : new String("The following video is unplayable: "));
            zag.q(this.a.mJ(), R.string.player_video_not_available, 0);
            this.a.an.m(this);
            return;
        }
        iqw iqwVar2 = this.a;
        CountDownLatch countDownLatch = iqwVar2.ay;
        if (countDownLatch != null) {
            countDownLatch.countDown();
            if (this.a.ay.getCount() > 0) {
                return;
            }
            this.a.aG();
            return;
        }
        iqwVar2.aG();
    }
}
