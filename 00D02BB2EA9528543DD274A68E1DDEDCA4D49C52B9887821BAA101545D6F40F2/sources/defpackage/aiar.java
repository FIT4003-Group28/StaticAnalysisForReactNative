package defpackage;

import android.app.Application;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.apps.gmm.locationsharing.interprocess.api.InterfaceVersion;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: aiar  reason: default package */
/* loaded from: classes2.dex */
public final class aiar extends ahyv {
    public static final dcqe a = dcqe.c("aiar");
    public final akai b;
    public final ajsj c;
    public final Executor d;
    public final ahzd e;
    public final ajmq f;
    public final ahzh g;
    public final ckcw h;
    private final Application i;
    private final aias j;
    private final aijz k;
    private final btvo l;
    private final ajln m;

    public aiar(Application application, akai akaiVar, aias aiasVar, ajsj ajsjVar, Executor executor, aijz aijzVar, ajmq ajmqVar, ahzd ahzdVar, ahzh ahzhVar, btvo btvoVar, ajln ajlnVar, ckcw ckcwVar) {
        this.i = application;
        this.b = akaiVar;
        this.j = aiasVar;
        this.c = ajsjVar;
        this.d = executor;
        this.k = aijzVar;
        this.f = ajmqVar;
        this.e = ahzdVar;
        this.g = ahzhVar;
        this.l = btvoVar;
        this.m = ajlnVar;
        this.h = ckcwVar;
    }

    private final boolean l() {
        dkof dkofVar = this.l.getLocationSharingParameters().q;
        if (dkofVar == null) {
            dkofVar = dkof.s;
        }
        return !dkofVar.r && this.l.getLocationSharingParameters().b && this.l.getLocationSharingParameters().c;
    }

    @Override // defpackage.ahyw
    public final void b(final ahyu ahyuVar) {
        if (!l()) {
            return;
        }
        final int callingUid = getCallingUid();
        this.d.execute(new Runnable(this, callingUid, ahyuVar) { // from class: aiag
            private final aiar a;
            private final int b;
            private final ahyu c;

            {
                this.a = this;
                this.b = callingUid;
                this.c = ahyuVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                aiar aiarVar = this.a;
                int i = this.b;
                ahyu ahyuVar2 = this.c;
                if (!aiarVar.k(i, 4)) {
                    return;
                }
                try {
                    ahyuVar2.e(new InterfaceVersion(1, 1));
                } catch (RemoteException e) {
                    bvoo.i(new IllegalStateException(e));
                }
            }
        });
    }

    @Override // defpackage.ahyw
    public final void c(final String str, final PendingIntent pendingIntent, final ahyy ahyyVar) {
        if (!l()) {
            return;
        }
        final int callingUid = getCallingUid();
        this.d.execute(new Runnable(this, callingUid, str, pendingIntent, ahyyVar) { // from class: ahzj
            private final aiar a;
            private final int b;
            private final String c;
            private final PendingIntent d;
            private final ahyy e;

            {
                this.a = this;
                this.b = callingUid;
                this.c = str;
                this.d = pendingIntent;
                this.e = ahyyVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                final aiar aiarVar = this.a;
                int i = this.b;
                String str2 = this.c;
                final PendingIntent pendingIntent2 = this.d;
                ahyy ahyyVar2 = this.e;
                if (!aiarVar.k(i, 2)) {
                    return;
                }
                if (str2 == null || pendingIntent2 == null || ahyyVar2 == null) {
                    bvoo.h("All parameters must be non-null: obfuscatedGaiaId=%s returnIntent=%s listener=%s", str2, pendingIntent2, ahyyVar2);
                    return;
                }
                ckcq a2 = ((ckcr) aiarVar.h.a(ckgd.G)).a();
                a2.a();
                dehn g = deew.g(deew.g(degp.q(aiarVar.g(str2, false, pendingIntent2)), new defg(aiarVar) { // from class: ahzw
                    private final aiar a;

                    {
                        this.a = aiarVar;
                    }

                    @Override // defpackage.defg
                    public final dehn a(Object obj) {
                        return this.a.f((btlu) obj);
                    }
                }, aiarVar.d), new defg(aiarVar, pendingIntent2) { // from class: ahzx
                    private final aiar a;
                    private final PendingIntent b;

                    {
                        this.a = aiarVar;
                        this.b = pendingIntent2;
                    }

                    @Override // defpackage.defg
                    public final dehn a(Object obj) {
                        return this.a.j((btlu) obj, false, this.b);
                    }
                }, aiarVar.d);
                final ahzh ahzhVar = aiarVar.g;
                ahzhVar.getClass();
                deha.q(deee.g(deee.g(deee.g(deew.h(g, new dbrn(ahzhVar) { // from class: ahzy
                    private final ahzh a;

                    {
                        this.a = ahzhVar;
                    }

                    @Override // defpackage.dbrn
                    public final Object a(Object obj) {
                        return this.a.a((btlu) obj);
                    }
                }, aiarVar.d), aiam.class, ahzz.a, aiarVar.d), aian.class, aiaa.a, aiarVar.d), aiaq.class, aiab.a, aiarVar.d), new aiap(ahyyVar2, str2, a2), aiarVar.d);
            }
        });
    }

    @Override // defpackage.ahyw
    public final void d(final String str, final ahyx ahyxVar) {
        if (!l()) {
            return;
        }
        final int callingUid = getCallingUid();
        this.d.execute(new Runnable(this, callingUid, str, ahyxVar) { // from class: ahzu
            private final aiar a;
            private final int b;
            private final String c;
            private final ahyx d;

            {
                this.a = this;
                this.b = callingUid;
                this.c = str;
                this.d = ahyxVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                dehn b;
                aiar aiarVar = this.a;
                int i = this.b;
                String str2 = this.c;
                ahyx ahyxVar2 = this.d;
                if (!aiarVar.k(i, 1)) {
                    return;
                }
                if (str2 == null || ahyxVar2 == null) {
                    bvoo.h("All parameters must be non-null: obfuscatedGaiaId=%s listener=%s", str2, ahyxVar2);
                    return;
                }
                ckcq a2 = ((ckcr) aiarVar.h.a(ckgd.D)).a();
                a2.a();
                dbsg<btlu> h = aiarVar.c.h(str2);
                if (!h.a() || !ajsj.k(h.b()) || !aiarVar.c.i()) {
                    b = deha.b(new aian(str2));
                } else {
                    b = deha.a(h.b());
                }
                dehn g = deew.g(degp.q(b), new defg(aiarVar) { // from class: ahzq
                    private final aiar a;

                    {
                        this.a = aiarVar;
                    }

                    @Override // defpackage.defg
                    public final dehn a(Object obj) {
                        return this.a.f((btlu) obj);
                    }
                }, aiarVar.d);
                ahzd ahzdVar = aiarVar.e;
                ahzdVar.getClass();
                deha.q(deee.g(deee.g(deee.g(deew.h(g, new dbrn(ahzdVar) { // from class: ahzr
                    private final ahzd a;

                    {
                        this.a = ahzdVar;
                    }

                    @Override // defpackage.dbrn
                    public final Object a(Object obj) {
                        return this.a.a((btlu) obj);
                    }
                }, aiarVar.d), aiam.class, ahzs.a, aiarVar.d), aian.class, ahzt.a, aiarVar.d), aial.class, ahzv.a, aiarVar.d), new aiao(ahyxVar2, str2, a2), aiarVar.d);
            }
        });
    }

    @Override // defpackage.ahyw
    public final void e(final String str, final PendingIntent pendingIntent, final ahyx ahyxVar) {
        if (!l()) {
            return;
        }
        final int callingUid = getCallingUid();
        this.d.execute(new Runnable(this, callingUid, str, pendingIntent, ahyxVar) { // from class: aiac
            private final aiar a;
            private final int b;
            private final String c;
            private final PendingIntent d;
            private final ahyx e;

            {
                this.a = this;
                this.b = callingUid;
                this.c = str;
                this.d = pendingIntent;
                this.e = ahyxVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                final aiar aiarVar = this.a;
                int i = this.b;
                String str2 = this.c;
                final PendingIntent pendingIntent2 = this.d;
                ahyx ahyxVar2 = this.e;
                if (!aiarVar.k(i, 3)) {
                    return;
                }
                if (str2 == null || pendingIntent2 == null || ahyxVar2 == null) {
                    bvoo.h("All parameters must be non-null: obfuscatedGaiaId=%s returnIntent=%s, listener=%s", str2, pendingIntent2, ahyxVar2);
                    return;
                }
                ckcq a2 = ((ckcr) aiarVar.h.a(ckgd.C)).a();
                a2.a();
                dehn g = deew.g(deew.g(deew.g(degp.q(aiarVar.g(str2, true, pendingIntent2)), new defg(aiarVar) { // from class: aiai
                    private final aiar a;

                    {
                        this.a = aiarVar;
                    }

                    @Override // defpackage.defg
                    public final dehn a(Object obj) {
                        return this.a.f((btlu) obj);
                    }
                }, aiarVar.d), new defg(aiarVar, pendingIntent2) { // from class: aiaj
                    private final aiar a;
                    private final PendingIntent b;

                    {
                        this.a = aiarVar;
                        this.b = pendingIntent2;
                    }

                    @Override // defpackage.defg
                    public final dehn a(Object obj) {
                        return this.a.j((btlu) obj, true, this.b);
                    }
                }, aiarVar.d), new defg(aiarVar) { // from class: ahzk
                    private final aiar a;

                    {
                        this.a = aiarVar;
                    }

                    @Override // defpackage.defg
                    public final dehn a(Object obj) {
                        final aiar aiarVar2 = this.a;
                        final btlu btluVar = (btlu) obj;
                        return deew.g(degp.q(aiarVar2.i(btluVar)), new defg(aiarVar2, btluVar) { // from class: aiae
                            private final aiar a;
                            private final btlu b;

                            {
                                this.a = aiarVar2;
                                this.b = btluVar;
                            }

                            @Override // defpackage.defg
                            public final dehn a(Object obj2) {
                                aiar aiarVar3 = this.a;
                                final btlu btluVar2 = this.b;
                                akah akahVar = (akah) obj2;
                                if (akahVar.b().contains(akaf.NOT_PRIMARY_REPORTING_DEVICE) || akahVar.b().contains(akaf.PRIMARY_BUT_NOT_REPORTING) || akahVar.f()) {
                                    return deew.g(degp.q(aiarVar3.f.b(btluVar2, dcep.B(dqym.ENABLING_PERSONAL_SAFETY_SHARE))), new defg(btluVar2) { // from class: aiah
                                        private final btlu a;

                                        {
                                            this.a = btluVar2;
                                        }

                                        @Override // defpackage.defg
                                        public final dehn a(Object obj3) {
                                            btlu btluVar3 = this.a;
                                            if (((ajne) obj3) == ajne.SUCCESS) {
                                                return deha.a(btluVar3);
                                            }
                                            String j = btluVar3.j();
                                            dbsk.s(j);
                                            return deha.b(new aial(j));
                                        }
                                    }, aiarVar3.d);
                                }
                                return deha.a(btluVar2);
                            }
                        }, aiarVar2.d);
                    }
                }, aiarVar.d);
                ahzd ahzdVar = aiarVar.e;
                ahzdVar.getClass();
                deha.q(deee.g(deee.g(deee.g(deee.g(deew.h(g, new dbrn(ahzdVar) { // from class: ahzl
                    private final ahzd a;

                    {
                        this.a = ahzdVar;
                    }

                    @Override // defpackage.dbrn
                    public final Object a(Object obj) {
                        return this.a.a((btlu) obj);
                    }
                }, aiarVar.d), aiam.class, ahzm.a, aiarVar.d), aian.class, ahzn.a, aiarVar.d), aial.class, ahzo.a, aiarVar.d), aiaq.class, ahzp.a, aiarVar.d), new aiao(ahyxVar2, str2, a2), aiarVar.d);
            }
        });
    }

    public final dehn<btlu> f(final btlu btluVar) {
        return deew.g(degp.q(this.k.a(btluVar)), new defg(btluVar) { // from class: aiad
            private final btlu a;

            {
                this.a = btluVar;
            }

            @Override // defpackage.defg
            public final dehn a(Object obj) {
                btlu btluVar2 = this.a;
                if (((Boolean) obj).booleanValue()) {
                    return deha.a(btluVar2);
                }
                String j = btluVar2.j();
                dbsk.s(j);
                return deha.b(new aiam(j));
            }
        }, this.d);
    }

    public final dehn<btlu> g(String str, boolean z, PendingIntent pendingIntent) {
        dbsg<btlu> h = this.c.h(str);
        if (!h.a() || !ajsj.k(h.b()) || !this.c.i()) {
            return h(str, z, pendingIntent);
        }
        return deha.a(h.b());
    }

    public final dehn<btlu> h(String str, boolean z, PendingIntent pendingIntent) {
        ckgz ckgzVar;
        Intent intent = new Intent();
        intent.addFlags(268435456);
        String packageName = this.i.getPackageName();
        StringBuilder sb = new StringBuilder(String.valueOf(packageName).length() + 37);
        sb.append(packageName);
        sb.append(".");
        sb.append("LocationShareFixConfigIntentActivity");
        intent.setComponent(new ComponentName(packageName, sb.toString()));
        intent.putExtra("obfuscatedGaiaId", str);
        intent.putExtra("shouldEnableReportingExtra", z);
        intent.putExtra("returnIntentExtra", pendingIntent);
        this.i.startActivity(intent);
        if (z) {
            ckgzVar = ckgd.B;
        } else {
            ckgzVar = ckgd.F;
        }
        this.m.b(str, ckgzVar);
        return deha.b(new aiaq(str, this.e, this.g));
    }

    public final dehn<akah> i(btlu btluVar) {
        deig d = deig.d();
        aiak aiakVar = new aiak(this, btluVar, d);
        this.b.c(aiakVar);
        aiakVar.a(btluVar);
        return d;
    }

    public final dehn<btlu> j(final btlu btluVar, final boolean z, final PendingIntent pendingIntent) {
        return deew.g(degp.q(i(btluVar)), new defg(this, btluVar, z, pendingIntent) { // from class: aiaf
            private final aiar a;
            private final btlu b;
            private final boolean c;
            private final PendingIntent d;

            {
                this.a = this;
                this.b = btluVar;
                this.c = z;
                this.d = pendingIntent;
            }

            @Override // defpackage.defg
            public final dehn a(Object obj) {
                aiar aiarVar = this.a;
                btlu btluVar2 = this.b;
                boolean z2 = this.c;
                PendingIntent pendingIntent2 = this.d;
                akah akahVar = (akah) obj;
                if (!akahVar.g() || !akahVar.h()) {
                    return deha.a(btluVar2);
                }
                String j = btluVar2.j();
                dbsk.s(j);
                return aiarVar.h(j, z2, pendingIntent2);
            }
        }, this.d);
    }

    public final boolean k(int i, int i2) {
        ckcq a2 = ((ckcr) this.h.a(ckgd.x)).a();
        a2.a();
        PackageManager packageManager = this.j.a.getPackageManager();
        String nameForUid = packageManager.getNameForUid(i);
        boolean z = false;
        if (nameForUid != null) {
            try {
                PackageInfo packageInfo = packageManager.getPackageInfo(nameForUid, 64);
                if (packageInfo != null) {
                    String str = packageInfo.packageName;
                    if (nameForUid.equals(str) && TextUtils.equals("com.google.android.apps.safetyhub", str) && packageInfo.signatures.length == 1) {
                        byte[] byteArray = packageInfo.signatures[0].toByteArray();
                        boolean a3 = aias.a(byteArray);
                        if (!a3) {
                            String str2 = packageInfo.packageName;
                            Base64.encodeToString(byteArray, 0);
                        }
                        z = a3;
                    }
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        a2.b();
        ((ckco) this.h.a(z ? ckgd.y : ckgd.H)).a(i2 - 1);
        return z;
    }
}
