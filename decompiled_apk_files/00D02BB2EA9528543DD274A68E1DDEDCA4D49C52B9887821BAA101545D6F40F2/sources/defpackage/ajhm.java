package defpackage;

import android.app.Activity;
import android.app.PendingIntent;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.FragmentManager$LaunchedFragmentInfo;
import androidx.activity.result.IntentSenderRequest;
import com.google.android.apps.maps.R;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import java.io.FileDescriptor;
import java.io.PrintWriter;
/* compiled from: PG */
/* renamed from: ajhm  reason: default package */
/* loaded from: classes2.dex */
public final class ajhm extends fd implements ajih, ajie {
    public static final dcqe a = dcqe.c("ajhm");
    private ajif aC;
    @dzsi
    private ProgressDialog aD;
    @dzsi
    private ajig aE;
    private boolean aF;
    public cqat ad;
    public ahwc ae;
    public btvo af;
    public dxio<ajnd> ag;
    public dxio<ajqz> ah;
    public ajqg ai;
    public ajzg aj;
    @dzsi
    cqkj ak;
    public dehn<btlu> al;
    @dzsi
    public dehn<cora> am;
    @dzsi
    public dehn<Void> an;
    public boolean ao;
    public int aw;
    public boolean az;
    public akfa b;
    public aigj c;
    public bvrb d;
    public cjnx e;
    public bvjj f;
    public bttf g;
    public int ap = 0;
    public int aq = 0;
    public int ar = 0;
    public int as = 0;
    public int at = 0;
    public int au = 0;
    public int av = 0;
    private int aG = 0;
    public boolean ax = false;
    @dzsi
    public Integer ay = null;
    public dzaj aA = new dzaj();
    int aB = 1;

    private final void aL(final ajhk ajhkVar) {
        this.al.Pk(new Runnable(this, ajhkVar) { // from class: ajgp
            private final ajhm a;
            private final ajhk b;

            {
                this.a = this;
                this.b = ajhkVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ajhm ajhmVar = this.a;
                ajhk ajhkVar2 = this.b;
                if (ajhmVar.aw != 1) {
                    bvoo.h("Attempted to run with account when state is not RUNNING. Current State: %d.", Integer.valueOf(ajhmVar.aw));
                    return;
                }
                btlu btluVar = (btlu) deha.s(ajhmVar.al);
                if (btluVar == null) {
                    ajhmVar.av = 4;
                    ajhmVar.w(2);
                    return;
                }
                ajhmVar.av = 2;
                ajhkVar2.a(btluVar);
            }
        }, this.d.h());
    }

    private final int aM() {
        if (aN(3)) {
            return 3;
        }
        if (aN(4)) {
            return 2;
        }
        int i = this.aq;
        if (i != 2 && i != 5) {
            return 0;
        }
        int i2 = this.ar;
        if (i2 != 2 && i2 != 5) {
            return 0;
        }
        int i3 = this.at;
        if (i3 != 2 && i3 != 5) {
            return 0;
        }
        int i4 = this.as;
        if ((i4 != 2 && i4 != 5) || this.av != 2) {
            return 0;
        }
        int i5 = this.au;
        return ((i5 == 2 || i5 == 5) && this.aG == 2) ? 1 : 0;
    }

    private final boolean aN(int i) {
        return this.aq == i || this.ar == i || this.at == i || this.av == i || this.as == i || this.au == i || this.aG == i;
    }

    @Override // defpackage.fd
    public final void Qi(Context context) {
        dxix.a(this);
        super.Qi(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c5  */
    @Override // defpackage.fd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Z(int r12, int r13, android.content.Intent r14) {
        /*
            Method dump skipped, instructions count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajhm.Z(int, int, android.content.Intent):void");
    }

    public final boolean aJ() {
        return this.af.getLocationSharingParameters().b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void aK(final btlu btluVar, Exception exc) {
        if (exc instanceof cnok) {
            try {
                PendingIntent pendingIntent = ((cnok) exc).a.i;
                this.at = 1;
                IntentSender intentSender = pendingIntent.getIntentSender();
                Bundle bundle = new Bundle();
                if (this.B == null) {
                    throw new IllegalStateException("Fragment " + this + " not attached to Activity");
                }
                if (gn.a(2)) {
                    String str = "Fragment " + this + " received the following in startIntentSenderForResult() requestCode: 2 IntentSender: " + intentSender + " fillInIntent: " + ((Object) null) + " options: " + bundle;
                }
                gn Q = Q();
                if (Q.p == null) {
                    throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
                }
                agx agxVar = new agx(intentSender);
                agxVar.b(0, 0);
                IntentSenderRequest a2 = agxVar.a();
                Intent intent = new Intent();
                intent.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
                if (gn.a(2)) {
                    String str2 = "ActivityOptions " + bundle + " were added to fillInIntent " + intent + " for fragment " + this;
                }
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
                Q.r.addLast(new FragmentManager$LaunchedFragmentInfo(this.n, 2));
                if (gn.a(2)) {
                    String str3 = "Fragment " + this + "is launching an IntentSender for result ";
                }
                Q.p.b(a2);
                return;
            } catch (IntentSender.SendIntentException unused) {
            }
        }
        this.at = 4;
        this.d.b(new Runnable(this, btluVar) { // from class: ajgq
            private final ajhm a;
            private final btlu b;

            {
                this.a = this;
                this.b = btluVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.i(this.b);
            }
        }, bvrj.UI_THREAD);
    }

    @Override // defpackage.fd
    public final void am() {
        this.aA.SQ();
        super.am();
        this.aF = false;
    }

    @Override // defpackage.fd
    public final void aq(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.aq(str, fileDescriptor, printWriter, strArr);
        String name = ajhm.class.getName();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(name).length());
        sb.append(str);
        sb.append(name);
        sb.append(":");
        printWriter.println(sb.toString());
        boolean z = this.aF;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 17);
        sb2.append(str);
        sb2.append("  isCreated=");
        sb2.append(z);
        printWriter.println(sb2.toString());
        boolean z2 = this.ao;
        StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 17);
        sb3.append(str);
        sb3.append("  isStarted=");
        sb3.append(z2);
        printWriter.println(sb3.toString());
        int i = this.aw;
        StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 19);
        sb4.append(str);
        sb4.append("  state=");
        sb4.append(i);
        printWriter.println(sb4.toString());
        boolean z3 = this.az;
        StringBuilder sb5 = new StringBuilder(String.valueOf(str).length() + 28);
        sb5.append(str);
        sb5.append("  isShowingTosActivity=");
        sb5.append(z3);
        printWriter.println(sb5.toString());
        int i2 = this.aq;
        StringBuilder sb6 = new StringBuilder(String.valueOf(str).length() + 34);
        sb6.append(str);
        sb6.append("  locationHistoryState=");
        sb6.append(i2);
        printWriter.println(sb6.toString());
        int i3 = this.ar;
        StringBuilder sb7 = new StringBuilder(String.valueOf(str).length() + 37);
        sb7.append(str);
        sb7.append("  locationSharingTosState=");
        sb7.append(i3);
        printWriter.println(sb7.toString());
        int i4 = this.at;
        StringBuilder sb8 = new StringBuilder(String.valueOf(str).length() + 33);
        sb8.append(str);
        sb8.append("  deviceLocationState=");
        sb8.append(i4);
        printWriter.println(sb8.toString());
        int i5 = this.av;
        StringBuilder sb9 = new StringBuilder(String.valueOf(str).length() + 34);
        sb9.append(str);
        sb9.append("  accountValidityState=");
        sb9.append(i5);
        printWriter.println(sb9.toString());
        int i6 = this.aG;
        StringBuilder sb10 = new StringBuilder(String.valueOf(str).length() + 39);
        sb10.append(str);
        sb10.append("  permissionsAvailableState=");
        sb10.append(i6);
        printWriter.println(sb10.toString());
        int i7 = this.ap;
        StringBuilder sb11 = new StringBuilder(String.valueOf(str).length() + 37);
        sb11.append(str);
        sb11.append("  prerequisiteCheckResult=");
        sb11.append(i7);
        printWriter.println(sb11.toString());
        String hexString = Integer.toHexString(System.identityHashCode(this.aD));
        StringBuilder sb12 = new StringBuilder(String.valueOf(str).length() + 17 + String.valueOf(hexString).length());
        sb12.append(str);
        sb12.append("  progressDialog=");
        sb12.append(hexString);
        printWriter.println(sb12.toString());
        String hexString2 = Integer.toHexString(System.identityHashCode(this.aE));
        StringBuilder sb13 = new StringBuilder(String.valueOf(str).length() + 11 + String.valueOf(hexString2).length());
        sb13.append(str);
        sb13.append("  listener=");
        sb13.append(hexString2);
        printWriter.println(sb13.toString());
        String valueOf = String.valueOf(this.al);
        StringBuilder sb14 = new StringBuilder(String.valueOf(str).length() + 10 + String.valueOf(valueOf).length());
        sb14.append(str);
        sb14.append("  account=");
        sb14.append(valueOf);
        printWriter.println(sb14.toString());
        String valueOf2 = String.valueOf(this.am);
        StringBuilder sb15 = new StringBuilder(String.valueOf(str).length() + 17 + String.valueOf(valueOf2).length());
        sb15.append(str);
        sb15.append("  reportingState=");
        sb15.append(valueOf2);
        printWriter.println(sb15.toString());
    }

    @Override // defpackage.ajih
    public final void d(ajig ajigVar) {
        bvrj.UI_THREAD.c();
        this.aE = ajigVar;
    }

    @Override // defpackage.ajih
    public final void e() {
        bvrj.UI_THREAD.c();
        this.aE = null;
    }

    @Override // defpackage.ajie
    public final void g(ajzp ajzpVar) {
        if (this.ao) {
            if (((ajze) ajzpVar).a == ajzo.PERMISSIONS_RESULT_SUCCESS) {
                this.aG = 2;
            } else {
                this.aG = 3;
            }
            aL(new ajhk(this) { // from class: ajgy
                private final ajhm a;

                {
                    this.a = this;
                }

                @Override // defpackage.ajhk
                public final void a(btlu btluVar) {
                    this.a.i(btluVar);
                }
            });
        }
    }

    public final void h(btlu btluVar) {
        if (!this.ax) {
            return;
        }
        this.f.T(bvjk.gu, btluVar, true);
        this.f.aa(bvjk.gv, btluVar, this.ad.b());
        this.ax = false;
    }

    public final void i(final btlu btluVar) {
        dehn<Void> dehnVar;
        boolean z = false;
        boolean z2 = true;
        dbsk.l(this.aw == 1);
        int aM = aM();
        this.ap = aM;
        if (aM != 0) {
            w(2);
        } else if (this.aq <= 1 || this.ar <= 1) {
            dbsk.l(this.aw <= 1);
            Integer num = this.ay;
            if (num == null || num.intValue() == 0) {
                bvrj.UI_THREAD.c();
                if (this.aD == null && this.ao) {
                    ProgressDialog progressDialog = new ProgressDialog(H());
                    progressDialog.setProgressStyle(0);
                    progressDialog.setCancelable(false);
                    progressDialog.setIndeterminate(true);
                    progressDialog.setMessage(Rp(R.string.DATA_LOADING_IN_PROGRESS));
                    progressDialog.show();
                    this.aD = progressDialog;
                }
                this.ae.c(btluVar, new ahwb(this, btluVar) { // from class: ajha
                    private final ajhm a;
                    private final btlu b;

                    {
                        this.a = this;
                        this.b = btluVar;
                    }

                    @Override // defpackage.ahwb
                    public final void a(int i) {
                        ajhm ajhmVar = this.a;
                        btlu btluVar2 = this.b;
                        ajhmVar.p();
                        ajhmVar.q(i, btluVar2);
                    }
                });
                return;
            }
            q(num.intValue(), btluVar);
        } else {
            int i = this.aG;
            if (i <= 1) {
                if (i == 1) {
                    return;
                }
                this.aG = 1;
                ajif ajifVar = this.aC;
                if (this.aB != 2) {
                    z = true;
                }
                ajifVar.f(z);
            } else if (this.at <= 1) {
                dbsk.l(this.aw == 1);
                if (!this.af.getLocationSharingParameters().A) {
                    this.at = 2;
                    this.d.b(new Runnable(this, btluVar) { // from class: ajhb
                        private final ajhm a;
                        private final btlu b;

                        {
                            this.a = this;
                            this.b = btluVar;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.a.i(this.b);
                        }
                    }, bvrj.UI_THREAD);
                } else if (this.aG != 2) {
                } else {
                    if (this.aw == 1) {
                        z = true;
                    }
                    dbsk.l(z);
                    if (this.at == 1) {
                        return;
                    }
                    LocationRequest create = LocationRequest.create();
                    create.setPriority(100);
                    colg colgVar = new colg();
                    colgVar.b(create);
                    colgVar.a = true;
                    cpcq<coli> a2 = LocationServices.getSettingsClient((Activity) J()).a(colgVar.a());
                    a2.s(new cpcl(this, btluVar) { // from class: ajgl
                        private final ajhm a;
                        private final btlu b;

                        {
                            this.a = this;
                            this.b = btluVar;
                        }

                        @Override // defpackage.cpcl
                        public final void c(Object obj) {
                            final ajhm ajhmVar = this.a;
                            final btlu btluVar2 = this.b;
                            coli coliVar = (coli) obj;
                            ajhmVar.at = 2;
                            ajhmVar.d.b(new Runnable(ajhmVar, btluVar2) { // from class: ajgr
                                private final ajhm a;
                                private final btlu b;

                                {
                                    this.a = ajhmVar;
                                    this.b = btluVar2;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    this.a.i(this.b);
                                }
                            }, bvrj.UI_THREAD);
                        }
                    });
                    a2.r(new cpci(this, btluVar) { // from class: ajgm
                        private final ajhm a;
                        private final btlu b;

                        {
                            this.a = this;
                            this.b = btluVar;
                        }

                        @Override // defpackage.cpci
                        public final void d(Exception exc) {
                            this.a.aK(this.b, exc);
                        }
                    });
                }
            } else {
                int i2 = this.au;
                if (i2 > 1) {
                    if (this.as > 1) {
                        return;
                    }
                    if (this.aw == 1) {
                        z = true;
                    }
                    dbsk.l(z);
                    if (this.as == 1 && (dehnVar = this.an) != null && !dehnVar.isDone()) {
                        return;
                    }
                    deha.q(this.ag.a().a(dcep.B(btluVar)), new ajhj(this, btluVar), this.d.h());
                } else if (i2 == 1) {
                } else {
                    if (this.aw != 1) {
                        z2 = false;
                    }
                    dbsk.l(z2);
                    if (!this.aj.a() || Build.VERSION.SDK_INT < 22) {
                        this.au = 5;
                        this.d.b(new Runnable(this, btluVar) { // from class: ajhc
                            private final ajhm a;
                            private final btlu b;

                            {
                                this.a = this;
                                this.b = btluVar;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                this.a.i(this.b);
                            }
                        }, bvrj.UI_THREAD);
                        return;
                    }
                    ff J = J();
                    if (!(J instanceof gga)) {
                        bvoo.h("Attached activity must be a GmmFragmentActivity", new Object[0]);
                        this.au = 4;
                        this.d.b(new Runnable(this, btluVar) { // from class: ajgk
                            private final ajhm a;
                            private final btlu b;

                            {
                                this.a = this;
                                this.b = btluVar;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                this.a.i(this.b);
                            }
                        }, bvrj.UI_THREAD);
                        return;
                    }
                    this.ai.a((gga) J).e(dzaf.a()).f(new ajhd(this, btluVar));
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0056  */
    @Override // defpackage.fd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(@defpackage.dzsi android.os.Bundle r6) {
        /*
            r5 = this;
            super.l(r6)
            r5.aG()
            dzaj r0 = new dzaj
            r0.<init>()
            r5.aA = r0
            r0 = 0
            r1 = 1
            if (r6 == 0) goto Lc2
            java.lang.String r2 = "state"
            boolean r3 = r6.containsKey(r2)
            defpackage.dbsk.l(r3)
            int r2 = r6.getInt(r2, r0)
            r5.aw = r2
            java.lang.String r2 = "location_sharing_flow"
            java.lang.String r2 = r6.getString(r2)
            int r3 = r2.hashCode()
            r4 = -1125781835(0xffffffffbce5eeb5, float:-0.028067926)
            if (r3 == r4) goto L3f
            r4 = 948747872(0x388cbe60, float:6.71118E-5)
            if (r3 == r4) goto L35
            goto L49
        L35:
            java.lang.String r3 = "JOURNEY_SHARE"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L49
            r2 = 1
            goto L4a
        L3f:
            java.lang.String r3 = "LOCATION_SHARE"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L49
            r2 = 0
            goto L4a
        L49:
            r2 = -1
        L4a:
            if (r2 == 0) goto L56
            if (r2 != r1) goto L50
            r2 = 2
            goto L57
        L50:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            r6.<init>()
            throw r6
        L56:
            r2 = 1
        L57:
            r5.aB = r2
            java.lang.String r2 = "lh_state"
            boolean r3 = r6.containsKey(r2)
            defpackage.dbsk.l(r3)
            int r2 = r6.getInt(r2)
            r5.aq = r2
            java.lang.String r2 = "ls_tos_state"
            boolean r3 = r6.containsKey(r2)
            defpackage.dbsk.l(r3)
            int r2 = r6.getInt(r2)
            r5.ar = r2
            java.lang.String r2 = "device_location_state"
            boolean r3 = r6.containsKey(r2)
            defpackage.dbsk.l(r3)
            int r2 = r6.getInt(r2)
            r5.at = r2
            java.lang.String r2 = "lh_not_required_ack_state"
            boolean r3 = r6.containsKey(r2)
            defpackage.dbsk.l(r3)
            int r2 = r6.getInt(r2)
            r5.as = r2
            java.lang.String r2 = "prerequisite_check_result"
            boolean r3 = r6.containsKey(r2)
            defpackage.dbsk.l(r3)
            int r2 = r6.getInt(r2)
            r5.ap = r2
            java.lang.String r2 = "showing_tos"
            boolean r3 = r6.containsKey(r2)
            defpackage.dbsk.l(r3)
            boolean r2 = r6.getBoolean(r2, r0)
            r5.az = r2
            java.lang.String r2 = "tos_settings_update_required"
            boolean r3 = r6.containsKey(r2)
            defpackage.dbsk.l(r3)
            boolean r2 = r6.getBoolean(r2, r0)
            r5.ax = r2
        Lc2:
            android.os.Bundle r2 = r5.o
            java.lang.String r3 = "account_id"
            java.lang.String r2 = r2.getString(r3)
            r5.av = r1
            if (r6 != 0) goto Ld3
            int r6 = r5.aw
            if (r6 != 0) goto Ld3
            r0 = 1
        Ld3:
            deig r6 = defpackage.deig.d()
            bvrb r3 = r5.d
            ajgj r4 = new ajgj
            r4.<init>(r5, r2, r6, r0)
            bvrj r0 = defpackage.bvrj.BACKGROUND_THREADPOOL
            r3.b(r4, r0)
            r5.al = r6
            gn r6 = r5.R()
            ajif r6 = defpackage.ajgh.a(r6)
            r5.aC = r6
            r5.aF = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajhm.l(android.os.Bundle):void");
    }

    public final void p() {
        bvrj.UI_THREAD.c();
        if (this.aD != null) {
            if (!J().isFinishing() && !J().isDestroyed()) {
                ProgressDialog progressDialog = this.aD;
                dbsk.s(progressDialog);
                progressDialog.dismiss();
            }
            this.aD = null;
        }
    }

    public final void q(int i, final btlu btluVar) {
        int i2 = 1;
        dbsk.l(this.aw == 1);
        this.ay = null;
        if (i == 0) {
            this.aq = 4;
            this.ar = 4;
            w(2);
            return;
        }
        final String t = btluVar.t();
        if (t == null) {
            this.av = 2;
            w(2);
            return;
        }
        if (i == 2) {
            i2 = 2;
        }
        this.ar = i2;
        dbsk.s(this.am);
        this.am.Pk(new Runnable(this, t, btluVar) { // from class: ajgo
            private final ajhm a;
            private final String b;
            private final btlu c;

            {
                this.a = this;
                this.b = t;
                this.c = btluVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ajhm ajhmVar = this.a;
                String str = this.b;
                btlu btluVar2 = this.c;
                boolean z = false;
                dbsk.l(ajhmVar.aw == 1);
                dehn<cora> dehnVar = ajhmVar.am;
                dbsk.s(dehnVar);
                cora coraVar = (cora) deha.s(dehnVar);
                int i3 = 4;
                if (coraVar == null) {
                    ajhmVar.aq = 4;
                    ajhmVar.w(2);
                    return;
                }
                int i4 = true != coraVar.g() ? 1 : 2;
                ajhmVar.aq = i4;
                if (i4 == 1 || ajhmVar.ar == 1) {
                    if (!ajhmVar.ao) {
                        if (i4 == 1) {
                            i4 = 4;
                        }
                        ajhmVar.aq = i4;
                        int i5 = ajhmVar.ar;
                        if (i5 != 1) {
                            i3 = i5;
                        }
                        ajhmVar.ar = i3;
                        ajhmVar.w(2);
                        return;
                    } else if (ajhmVar.az) {
                        return;
                    } else {
                        int i6 = ajhmVar.ar;
                        dbsk.m(true, "Already showing Terms of Service.");
                        boolean z2 = i6 == 2;
                        if (i4 == 2) {
                            z = true;
                        }
                        Intent intent = new Intent("com.google.android.gms.locationsharing.ONBOARDING");
                        intent.setPackage("com.google.android.gms");
                        ahyc.b(intent, str);
                        intent.putExtra("has_signed_tos", z2);
                        intent.putExtra("is_korean", bycr.a(ajhmVar.g));
                        intent.putExtra("is_location_history_enabled", z);
                        dbsk.l(ahyc.a(intent));
                        ff J = ajhmVar.J();
                        if (J instanceof gga) {
                            afha wc = ((afgz) btsq.b(afgz.class, (gga) J)).wc();
                            dbsk.s(wc);
                            wc.p(ajhmVar, intent, 1, 4);
                        } else {
                            ajhmVar.startActivityForResult(intent, 1);
                        }
                        ajhmVar.az = true;
                        return;
                    }
                }
                ajhmVar.i(btluVar2);
            }
        }, this.d.h());
    }

    @Override // defpackage.fd
    public final void s() {
        super.s();
        this.aC.d(this);
        if (this.aw == 1) {
            aL(new ajhk(this) { // from class: ajgu
                private final ajhm a;

                {
                    this.a = this;
                }

                @Override // defpackage.ajhk
                public final void a(btlu btluVar) {
                    ajhm ajhmVar = this.a;
                    if (ajhmVar.ax) {
                        ajhmVar.h(btluVar);
                    }
                    ajhmVar.am = ajhmVar.e.h();
                    ajhmVar.i(btluVar);
                }
            });
        }
        this.ao = true;
    }

    @Override // defpackage.fd
    public final void t(Bundle bundle) {
        bundle.putInt("state", this.aw);
        int i = this.aB;
        String str = i != 1 ? i != 2 ? "null" : "JOURNEY_SHARE" : "LOCATION_SHARE";
        if (i != 0) {
            bundle.putString("location_sharing_flow", str);
            bundle.putInt("prerequisite_check_result", this.ap);
            bundle.putBoolean("showing_tos", this.az);
            bundle.putBoolean("tos_settings_update_required", this.ax);
            bundle.putInt("lh_state", this.aq);
            bundle.putInt("ls_tos_state", this.ar);
            bundle.putInt("lh_not_required_ack_state", this.as);
            bundle.putInt("device_location_state", this.at);
            bundle.putInt("battery_saver_disabled_state", this.au);
            return;
        }
        throw null;
    }

    @Override // defpackage.fd
    public final void u() {
        super.u();
        this.ao = false;
        this.aC.e();
        p();
    }

    public final void w(int i) {
        bvrj.UI_THREAD.c();
        this.ap = aM();
        this.aw = i;
        if (i == 2) {
            bvrj.UI_THREAD.c();
            ajig ajigVar = this.aE;
            if (ajigVar == null) {
                return;
            }
            ajigVar.p();
        }
    }

    @Override // defpackage.ajih
    public final void f() {
        int i = this.aw;
        if ((i == 0 || i == 2) && this.aF && this.ao) {
            this.aq = 0;
            this.ar = 0;
            this.at = 0;
            this.av = 0;
            this.aG = 0;
            this.au = 0;
            if (aJ()) {
                this.aq = 5;
                this.ar = 5;
                this.as = 0;
                dehn<Void> dehnVar = this.an;
                if (dehnVar != null) {
                    dehnVar.cancel(true);
                    this.an = null;
                }
            } else {
                this.as = 5;
            }
            if (!this.aj.a() || this.aB == 2) {
                this.au = 5;
            }
            w(1);
            dehn<cora> g = deew.g(this.al, new defg(this) { // from class: ajgv
                private final ajhm a;

                {
                    this.a = this;
                }

                @Override // defpackage.defg
                public final dehn a(Object obj) {
                    btlu btluVar = (btlu) obj;
                    return this.a.e.h();
                }
            }, this.d.h());
            this.am = g;
            g.Pk(new Runnable(this) { // from class: ajgw
                private final ajhm a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    dehn<cora> dehnVar2 = this.a.am;
                    dbsk.s(dehnVar2);
                    deha.s(dehnVar2);
                }
            }, this.d.h());
            aL(new ajhk(this) { // from class: ajgx
                private final ajhm a;

                {
                    this.a = this;
                }

                @Override // defpackage.ajhk
                public final void a(btlu btluVar) {
                    this.a.i(btluVar);
                }
            });
            return;
        }
        bvoo.h("startPrerequisiteChecking called when state is %d, isCreated is %s, isStarted is %s", Integer.valueOf(i), Boolean.valueOf(this.aF), Boolean.valueOf(this.ao));
    }
}
