package defpackage;

import android.app.job.JobScheduler;
import com.google.android.apps.gmm.base.service.workmanager.GmmWorkerWrapper;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: awjz  reason: default package */
/* loaded from: classes3.dex */
public final class awjz implements avjo, avkd {
    private final btvo c;
    private final cqat d;
    private final bvjj e;
    private final awil f;
    private final awig g;
    private final dzsj<awit> h;
    private final ckcw i;
    private final Random j = new Random();
    private final awjy k;
    private final dxio<Boolean> l;
    private final dxio<awkj> m;
    private final dxio<avjn> n;
    private static final eapd b = new eapd(Long.MAX_VALUE);
    static final eaow a = eaow.c(10);

    public awjz(btvo btvoVar, cqat cqatVar, awil awilVar, awig awigVar, dzsj<awit> dzsjVar, bvjj bvjjVar, ckcw ckcwVar, dxio<awkj> dxioVar, awjy awjyVar, dxio<Boolean> dxioVar2, dxio<avjn> dxioVar3) {
        this.c = btvoVar;
        this.d = cqatVar;
        this.e = bvjjVar;
        this.f = awilVar;
        this.g = awigVar;
        this.h = dzsjVar;
        this.i = ckcwVar;
        this.k = awjyVar;
        this.l = dxioVar2;
        this.m = dxioVar;
        this.n = dxioVar3;
    }

    private final void k() {
        this.n.a().b(Pattern.compile("oausv2:\\d+"), avjn.a);
    }

    private final void l() {
        awig awigVar = this.g;
        eaow d = eaow.d(15L);
        try {
            bbo bboVar = new bbo();
            bboVar.e("worker_name_key", "OfflineAutoUpdateMaintenanceWorker");
            bbp a2 = bboVar.a();
            bbk bbkVar = new bbk();
            bbkVar.c = 1;
            bbkVar.a = true;
            ((awls) awigVar).a.d("immediate-maint", 1, new bca(GmmWorkerWrapper.class).d("immediate-maint").c(a2).e(d.g(), TimeUnit.SECONDS).b(bbkVar.a()).f());
        } catch (RuntimeException e) {
            ((awls) awigVar).b.c(14, e);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(19:1|2|3|(1:5)|6|(4:8|(1:10)|11|(15:13|(1:15)|16|(1:18)(1:53)|19|(2:22|20)|23|24|(2:27|25)|28|29|(4:31|(1:33)(1:48)|34|(3:36|(1:38)(1:45)|39)(2:46|47))(1:49)|(1:41)|43|44))|54|(1:56)|57|(1:59)|60|(1:62)|63|28|29|(0)(0)|(0)|43|44) */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0199, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x019a, code lost:
        r0.getMessage();
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011c A[Catch: IllegalArgumentException -> 0x0199, TryCatch #1 {IllegalArgumentException -> 0x0199, blocks: (B:41:0x0101, B:43:0x011c, B:47:0x0125, B:49:0x014b, B:51:0x0157, B:53:0x015c, B:54:0x015f, B:55:0x0194), top: B:65:0x0101 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0198 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final defpackage.awik m(long r9) {
        /*
            Method dump skipped, instructions count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awjz.m(long):awik");
    }

    @Override // defpackage.avjo
    public final void a() {
        if (!this.e.m(bvjk.bH, false)) {
            try {
                JobScheduler jobScheduler = this.m.a().a;
                dbsk.s(jobScheduler);
                jobScheduler.cancel(137303610);
                jobScheduler.cancel(137303609);
                this.e.S(bvjk.bH, true);
            } catch (RuntimeException e) {
                bvoo.j(e);
            }
        }
    }

    @Override // defpackage.avjo
    public final void b(boolean z) {
        awig awigVar = this.g;
        try {
            bbo bboVar = new bbo();
            bboVar.e("worker_name_key", "OfflineAutoUpdateMaintenanceWorker");
            bbp a2 = bboVar.a();
            bbk bbkVar = new bbk();
            bbkVar.c = 1;
            bbkVar.a = true;
            ((awls) awigVar).a.f("default-tag", 2, new bch(GmmWorkerWrapper.class, 1L, TimeUnit.DAYS, 30L, TimeUnit.SECONDS).d("default-tag").c(a2).b(bbkVar.a()).f());
        } catch (RuntimeException e) {
            ((awls) awigVar).b.c(14, e);
        }
        j(z);
    }

    @Override // defpackage.avjo
    public final void c(boolean z) {
        b(z);
    }

    @Override // defpackage.avjo
    public final void d() {
        this.f.b();
        k();
        awig awigVar = this.g;
        try {
            ((awls) awigVar).a.c("default-tag");
        } catch (RuntimeException e) {
            ((awls) awigVar).b.a(14, e);
        }
        this.e.P(bvjk.bE);
    }

    @Override // defpackage.avjo
    public final boolean e(int i) {
        return (i == 137303610 || i == 137303609) ? false : true;
    }

    @Override // defpackage.avjo
    public final boolean f(String str) {
        return !str.equals("OfflineAutoUpdateGcmService.ONEOFF_TASK_TAG") && !str.equals("OfflineAutoUpdateGcmService.TASK_TAG");
    }

    @Override // defpackage.avjo
    public final void g(avjy avjyVar) {
        if ((avjyVar.a & 128) != 0) {
            String str = avjyVar.i;
            long b2 = this.d.b();
            if (!avjyVar.k) {
                awik m = m(b2);
                m.c = b2;
                m.a(this.e);
            }
            ((ckco) this.i.a(ckia.i)).a(avtp.a(str));
        }
    }

    @Override // defpackage.avjo
    public final int h(avjy avjyVar, avjg avjgVar) {
        avjg avjgVar2 = avjg.OK;
        int ordinal = avjgVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1 && ordinal != 2 && ordinal != 3) {
                return (ordinal == 6 || ordinal == 7 || ordinal == 9) ? 2 : 1;
            }
            if ((avjyVar.a & 64) != 0) {
                l();
            }
            return 2;
        }
        if ((avjyVar.a & 64) != 0) {
            long b2 = this.d.b();
            awik m = m(b2);
            dkrl dkrlVar = m.b;
            dkrl dkrlVar2 = (dkrlVar.a & 2) != 0 ? m.a.c.get(dkrlVar.d) : null;
            if (dkrlVar2 == null) {
                dkrlVar2 = m.a.b;
            }
            m.c(dkrlVar2, b2);
            m.b();
            m.a(this.e);
            l();
        }
        return 2;
    }

    @Override // defpackage.avkd
    public final void i(avjy avjyVar) {
        this.f.c(avjyVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:143:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0423 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(boolean r28) {
        /*
            Method dump skipped, instructions count: 1132
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awjz.j(boolean):void");
    }
}
