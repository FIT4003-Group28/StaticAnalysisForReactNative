package defpackage;

import android.app.AlertDialog;
import android.os.Bundle;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bcpj  reason: default package */
/* loaded from: classes3.dex */
public final class bcpj implements bcoz {
    public final dxio<afha> a;
    private final btvo b;
    private final bwqv c;
    private final axru d;
    private final axrx e;
    private final ckcw f;
    private final dxio<apni> g;
    private boolean h;

    public bcpj(btvo btvoVar, bwqv bwqvVar, axru axruVar, axrx axrxVar, ckcw ckcwVar, dxio<apni> dxioVar, dxio<afha> dxioVar2) {
        this.b = btvoVar;
        this.c = bwqvVar;
        this.d = axruVar;
        this.e = axrxVar;
        this.f = ckcwVar;
        this.g = dxioVar;
        this.a = dxioVar2;
    }

    public static void c(gga ggaVar, dxio<afha> dxioVar, int i) {
        bvrj.UI_THREAD.c();
        new AlertDialog.Builder(ggaVar).setMessage(i).setCancelable(true).setPositiveButton(R.string.PERMISSION_DIALOG_OPEN_SETTINGS, new bcpi(ggaVar, dxioVar)).setNegativeButton(R.string.CANCEL_BUTTON, new bcph()).create().show();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007c  */
    @Override // defpackage.bcoz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.dehn<java.lang.Boolean> a(defpackage.ges r10, defpackage.bwrs<defpackage.bcan> r11, boolean r12, defpackage.bbts r13) {
        /*
            r9 = this;
            r0 = 1
            r1 = 23
            r2 = 0
            if (r12 == 0) goto L4c
            int r12 = android.os.Build.VERSION.SDK_INT
            if (r12 >= r1) goto L1d
            ckcw r12 = r9.f
            ckgz r0 = defpackage.ckdz.b
            java.lang.Object r12 = r12.a(r0)
            ckco r12 = (defpackage.ckco) r12
            r0 = 2
            int r0 = defpackage.ckdq.a(r0)
            r12.a(r0)
            goto L4c
        L1d:
            btvo r12 = r9.b
            dkiy r12 = r12.getEnableFeatureParameters()
            boolean r12 = r12.T
            if (r12 != 0) goto L3a
            ckcw r12 = r9.f
            ckgz r0 = defpackage.ckdz.b
            java.lang.Object r12 = r12.a(r0)
            ckco r12 = (defpackage.ckco) r12
            r0 = 3
            int r0 = defpackage.ckdq.a(r0)
            r12.a(r0)
            goto L4c
        L3a:
            ckcw r12 = r9.f
            ckgz r3 = defpackage.ckdz.b
            java.lang.Object r12 = r12.a(r3)
            ckco r12 = (defpackage.ckco) r12
            int r3 = defpackage.ckdq.a(r0)
            r12.a(r3)
            goto L4d
        L4c:
            r0 = 0
        L4d:
            r9.h = r0
            gga r12 = r10.aE
            if (r12 == 0) goto L7c
            int r12 = android.os.Build.VERSION.SDK_INT
            if (r12 >= r1) goto L58
            goto L77
        L58:
            axru r12 = r9.d
            java.lang.String r0 = "android.permission.CAMERA"
            boolean r12 = r12.a(r0)
            if (r12 != 0) goto L77
            deig r12 = defpackage.deig.d()
            axrx r7 = r9.e
            bcpg r8 = new bcpg
            r1 = r8
            r2 = r9
            r3 = r12
            r4 = r10
            r5 = r11
            r6 = r13
            r1.<init>(r2, r3, r4, r5, r6)
            r7.b(r0, r8)
            return r12
        L77:
            dehn r10 = r9.d(r10, r11, r13)
            return r10
        L7c:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r2)
            dehn r10 = defpackage.deha.a(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bcpj.a(ges, bwrs, boolean, bbts):dehn");
    }

    @Override // defpackage.bcoz
    public final void b(gga ggaVar) {
        c(ggaVar, this.a, R.string.VIDEO_PERMISSION_DIALOG_MESSAGE);
    }

    public final dehn<Boolean> d(final ges gesVar, final bwrs<bcan> bwrsVar, final bbts bbtsVar) {
        if (!this.h) {
            bvrj.UI_THREAD.c();
            gesVar.aZ(bdpy.g(this.c, bcpa.TAKE_FROM_CAMERA, bwrsVar));
            return deha.a(true);
        } else if (!this.g.a().b() || !bbtsVar.f().booleanValue()) {
            return deha.a(Boolean.valueOf(e(gesVar, bwrsVar, bbtsVar)));
        } else {
            if (this.d.a("android.permission.RECORD_AUDIO")) {
                return deha.a(Boolean.valueOf(e(gesVar, bwrsVar, bbtsVar)));
            }
            final deig d = deig.d();
            this.e.b("android.permission.RECORD_AUDIO", new axrw(this, d, gesVar, bwrsVar, bbtsVar) { // from class: bcpf
                private final bcpj a;
                private final deig b;
                private final ges c;
                private final bwrs d;
                private final bbts e;

                {
                    this.a = this;
                    this.b = d;
                    this.c = gesVar;
                    this.d = bwrsVar;
                    this.e = bbtsVar;
                }

                @Override // defpackage.axrw
                public final void a(int i) {
                    this.b.j(Boolean.valueOf(this.a.e(this.c, this.d, this.e)));
                }
            });
            return d;
        }
    }

    public final boolean e(ges gesVar, bwrs<bcan> bwrsVar, bbts bbtsVar) {
        bvrj.UI_THREAD.c();
        bwqv bwqvVar = this.c;
        Bundle bundle = new Bundle();
        bwqvVar.c(bundle, "photo_selection_context_ref", bwrsVar);
        bundle.putSerializable("live_camera_option", bbtsVar);
        bbwq bbwqVar = new bbwq();
        bbwqVar.B(bundle);
        if (!gesVar.U()) {
            return false;
        }
        gesVar.aZ(bbwqVar);
        return true;
    }
}
