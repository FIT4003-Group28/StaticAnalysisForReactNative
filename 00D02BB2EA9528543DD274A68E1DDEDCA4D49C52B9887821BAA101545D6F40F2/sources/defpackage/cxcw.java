package defpackage;

import android.os.StrictMode;
import android.os.strictmode.CustomViolation;
import android.os.strictmode.DiskReadViolation;
import android.os.strictmode.DiskWriteViolation;
import android.os.strictmode.Violation;
/* compiled from: PG */
/* renamed from: cxcw  reason: default package */
/* loaded from: classes5.dex */
public final class cxcw implements cwwr {
    private final cwwo a;
    private final dzsj<dehq> b;
    private final StrictMode.OnVmViolationListener c = cxcr.a;

    public cxcw(cwwp cwwpVar, dzsj<dehq> dzsjVar, dzsj<cxfg> dzsjVar2, cwuc cwucVar) {
        this.a = cwwpVar.a(dzsjVar.a(), cxcs.a, dzsjVar2);
        this.b = dzsjVar;
        cwucVar.c(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ cwuw d() {
        cxcl cxclVar = new cxcl();
        cxclVar.a = 3;
        return new cxcm(cxclVar.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public void e(Violation violation) {
        if (!this.a.a()) {
            return;
        }
        eabz bZ = eacb.c.bZ();
        if (violation instanceof DiskReadViolation) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            eacb eacbVar = (eacb) bZ.b;
            eacbVar.b = 1;
            eacbVar.a |= 1;
        } else if (violation instanceof DiskWriteViolation) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            eacb eacbVar2 = (eacb) bZ.b;
            eacbVar2.b = 2;
            eacbVar2.a |= 1;
        } else if (!(violation instanceof CustomViolation)) {
            return;
        } else {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            eacb eacbVar3 = (eacb) bZ.b;
            eacbVar3.b = 3;
            eacbVar3.a |= 1;
        }
        eacc bZ2 = eacd.u.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        eacd eacdVar = (eacd) bZ2.b;
        eacb bK = bZ.bK();
        bK.getClass();
        eacdVar.s = bK;
        eacdVar.a |= 16777216;
        cwwo cwwoVar = this.a;
        cwwi f = cwwj.f();
        f.c(bZ2.bK());
        cwtl.a(cwwoVar.c(f.a()));
    }

    @Override // defpackage.cwud
    public void Sz() {
        StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
        czhz.e(cxcu.a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void c() {
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectAll().penaltyListener(this.b.a(), new StrictMode.OnThreadViolationListener(this) { // from class: cxcv
            private final cxcw a;

            {
                this.a = this;
            }

            @Override // android.os.StrictMode.OnThreadViolationListener
            public final void onThreadViolation(Violation violation) {
                this.a.e(violation);
            }
        }).build());
    }

    @Override // defpackage.cwwr
    public void g() {
        StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder().detectAll().penaltyListener(this.b.a(), this.c).build());
        czhz.e(new Runnable(this) { // from class: cxct
            private final cxcw a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.c();
            }
        });
    }
}
