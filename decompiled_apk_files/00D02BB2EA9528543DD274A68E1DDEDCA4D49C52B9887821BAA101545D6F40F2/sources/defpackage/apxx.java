package defpackage;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.apps.gmm.messaging.inbox.EditWelcomeMessageWebViewCallbacks;
import com.google.android.apps.maps.R;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: apxx  reason: default package */
/* loaded from: classes2.dex */
public final class apxx extends itb implements apyz {
    private final dxio<axrx> A;
    private final dxio<axru> B;
    private final dxio<cjot> C;
    private final dxio<bvjj> D;
    private final acyp E;
    private final aqci F;
    private final dxio<aprv> H;
    private final dxio<bvvw> I;
    @dzsi
    private crzp<apsi<Set<String>>> K;
    @dzsi
    private crzm<apsi<Set<String>>> L;
    public final gga a;
    public final dxio<akfa> b;
    public final dxio<akfc> c;
    public final bwqv d;
    public final dxio<apzy> e;
    public final dxio<aqbo> f;
    public final ckcw g;
    public final Executor h;
    public final dxio<apyb> i;
    public final dxio<afha> j;
    public final apyx k;
    public final dxio<apwn> o;
    public AlertDialog q;
    public aqbo r;
    @dzsi
    public apxu s;
    @dzsi
    public btlu t;
    private final dxio<bvkx> u;
    private final ckmm v;
    private final dxio<aqaa> w;
    private final dxio<aqdj> x;
    private final dxio<aqav> y;
    private final dxio<apyv> z;
    private final Object G = new Object();
    public final Object p = new Object();
    private boolean J = false;

    public apxx(gga ggaVar, dxio<akfa> dxioVar, dxio<akfc> dxioVar2, bwqv bwqvVar, dxio<bvkx> dxioVar3, dxio<apzy> dxioVar4, dxio<aqaa> dxioVar5, dxio<aqdj> dxioVar6, dxio<aqav> dxioVar7, dxio<aqbo> dxioVar8, dxio<apyv> dxioVar9, dxio<axrx> dxioVar10, dxio<axru> dxioVar11, dxio<apyb> dxioVar12, dxio<afha> dxioVar13, dxio<cjot> dxioVar14, dxio<bvjj> dxioVar15, acyp acypVar, apyx apyxVar, aqci aqciVar, ckmm ckmmVar, ckcw ckcwVar, Executor executor, dxio<apwn> dxioVar16, dxio<aprv> dxioVar17, dxio<bvvw> dxioVar18) {
        this.a = ggaVar;
        this.b = dxioVar;
        this.c = dxioVar2;
        this.d = bwqvVar;
        this.u = dxioVar3;
        this.e = dxioVar4;
        this.w = dxioVar5;
        this.x = dxioVar6;
        this.y = dxioVar7;
        this.f = dxioVar8;
        this.z = dxioVar9;
        this.A = dxioVar10;
        this.B = dxioVar11;
        this.i = dxioVar12;
        this.j = dxioVar13;
        this.C = dxioVar14;
        this.D = dxioVar15;
        this.E = acypVar;
        this.k = apyxVar;
        this.F = aqciVar;
        this.v = ckmmVar;
        this.g = ckcwVar;
        this.h = executor;
        this.o = dxioVar16;
        this.H = dxioVar17;
        this.I = dxioVar18;
    }

    private final void M(final aqwn aqwnVar, @dzsi final ContactId contactId, @dzsi final apzc apzcVar) {
        if (!o()) {
            return;
        }
        this.b.a().l().Pk(new Runnable(this, apzcVar, aqwnVar, contactId) { // from class: apxr
            private final apxx a;
            private final apzc b;
            private final aqwn c;
            private final ContactId d;

            {
                this.a = this;
                this.b = apzcVar;
                this.c = aqwnVar;
                this.d = contactId;
            }

            @Override // java.lang.Runnable
            public final void run() {
                apxx apxxVar = this.a;
                apzc apzcVar2 = this.b;
                aqwn aqwnVar2 = this.c;
                ContactId contactId2 = this.d;
                if (!apxxVar.w()) {
                    return;
                }
                btlu j = apxxVar.b.a().j();
                if (btlu.i(j) == btlt.INCOGNITO) {
                    if (apzcVar2 != null && (apzcVar2.a() == apzb.MAPS_ONLY_INTENT || apzcVar2.a() == apzb.START_CONVERSATION_INTENT)) {
                        ((ckcn) apxxVar.g.a(ckgs.N)).a();
                    }
                    bwqv bwqvVar = apxxVar.d;
                    afdr i = afdt.i();
                    i.c(apxk.a);
                    i.g(apzcVar2 == null ? R.string.MESSAGING_INBOX_TITLE : R.string.MESSAGING_INCOGNITO_PROMO_TITLE_TEXT);
                    i.b(apzcVar2 == null ? R.string.MESSAGING_INBOX_INCOGNITO_BODY_TEXT : R.string.MESSAGING_INCOGNITO_PROMO_BODY_TEXT);
                    apxxVar.a.D(afaw.aR(bwqvVar, i.a()));
                } else if (j == null || !j.u()) {
                    if (apzcVar2 != null) {
                        ((ckco) apxxVar.g.a(ckgs.A)).a(apzcVar2.a().q);
                    }
                    apxxVar.a.D(akef.g(apxxVar.d, aqwnVar2));
                } else if (contactId2 == null) {
                    aqwnVar2.b(apxxVar.a, 1);
                } else {
                    String a = contactId2.a();
                    String a2 = cstg.a(a);
                    Iterator<String> it = apxxVar.b.a().s().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        String next = it.next();
                        if (a2.equals(cstg.a(next))) {
                            a = next;
                            break;
                        }
                    }
                    if (a.equals(apxxVar.b.a().o())) {
                        aqwnVar2.b(apxxVar.a, 1);
                        return;
                    }
                    akfc a3 = apxxVar.c.a();
                    a3.e(a, new apxt(apxxVar, a3, aqwnVar2));
                }
            }
        }, dege.a);
    }

    @Override // defpackage.apyz
    public final dehn<Boolean> B(apyw apywVar) {
        if (!(apywVar instanceof apvz)) {
            return deha.a(false);
        }
        apvz apvzVar = (apvz) apywVar;
        return deee.g(deew.h(degp.q(this.y.a().c().f(apvzVar.a(), apvzVar.b(), apvzVar.c())), apxm.a, dege.a), ExecutionException.class, apxn.a, dege.a);
    }

    public final void C(final cugu cuguVar) {
        if (!this.e.a().b()) {
            return;
        }
        this.a.runOnUiThread(new Runnable(this, cuguVar) { // from class: apxq
            private final apxx a;
            private final cugu b;

            {
                this.a = this;
                this.b = cuguVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                apxx apxxVar = this.a;
                cugu cuguVar2 = this.b;
                gga ggaVar = apxxVar.a;
                apyp apypVar = new apyp();
                String a = cuguVar2.a();
                if (a != null) {
                    apypVar.a = a;
                    ConversationId c = cuguVar2.c();
                    if (c != null) {
                        apypVar.b = c;
                        String str = apypVar.a == null ? " messageId" : "";
                        if (apypVar.b == null) {
                            str = str.concat(" conversationId");
                        }
                        if (!str.isEmpty()) {
                            String valueOf = String.valueOf(str);
                            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
                        }
                        apyq apyqVar = new apyq(apypVar.a, apypVar.b);
                        aqsk aqskVar = new aqsk();
                        Bundle bundle = new Bundle();
                        bundle.putSerializable("keyOpenPhotoLightboxParams", apyqVar);
                        aqskVar.B(bundle);
                        ggaVar.D(aqskVar);
                        return;
                    }
                    throw new NullPointerException("Null conversationId");
                }
                throw new NullPointerException("Null messageId");
            }
        });
    }

    @Override // defpackage.apyz
    public final boolean D() {
        btlu j = this.b.a().j();
        return btlu.i(j) == btlt.GOOGLE && this.D.a().t(bvjk.jp, j, -1) > 0;
    }

    @Override // defpackage.apyz
    public final void E() {
        if (!J()) {
            return;
        }
        this.a.runOnUiThread(new Runnable(this) { // from class: apxs
            private final apxx a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.a.D(new aqsv());
            }
        });
    }

    @Override // defpackage.apyz
    public final void F(final String str, final String str2, final String str3, final ddce ddceVar) {
        if (!this.z.a().a() || !D()) {
            return;
        }
        this.a.runOnUiThread(new Runnable(this, str, str2, str3, ddceVar) { // from class: apxh
            private final apxx a;
            private final String b;
            private final String c;
            private final String d;
            private final ddce e;

            {
                this.a = this;
                this.b = str;
                this.c = str2;
                this.d = str3;
                this.e = ddceVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                apxx apxxVar = this.a;
                String str4 = this.b;
                String str5 = this.c;
                String str6 = this.d;
                ddce ddceVar2 = this.e;
                gga ggaVar = apxxVar.a;
                aqsx aqsxVar = new aqsx();
                Bundle bundle = new Bundle();
                bundle.putString("business_listing_id", str4);
                bundle.putString("business_listing_name", str5);
                bundle.putString("business_listing_address", str6);
                bundle.putInt("entry_point", ddceVar2.e);
                aqsxVar.B(bundle);
                ggaVar.D(aqsxVar);
            }
        });
    }

    @Override // defpackage.apyz
    public final void G(final String str) {
        if (!this.e.a().i(null)) {
            return;
        }
        this.a.runOnUiThread(new Runnable(this, str) { // from class: apxi
            private final apxx a;
            private final String b;

            {
                this.a = this;
                this.b = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                apxx apxxVar = this.a;
                String str2 = this.b;
                gga ggaVar = apxxVar.a;
                aqok aqokVar = new aqok();
                Bundle bundle = new Bundle();
                bundle.putString("business_listing_id", str2);
                aqokVar.B(bundle);
                ggaVar.D(aqokVar);
            }
        });
    }

    @Override // defpackage.apyz
    public final void H(final String str) {
        if (!this.z.a().a() || !w()) {
            return;
        }
        this.a.runOnUiThread(new Runnable(this, str) { // from class: apxj
            private final apxx a;
            private final String b;

            {
                this.a = this;
                this.b = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.a.D(aqrx.g(this.b));
            }
        });
    }

    @Override // defpackage.apyz
    public final void I() {
        this.F.a();
    }

    @Override // defpackage.apyz
    public final boolean J() {
        if (!this.z.a().a() || !D()) {
            this.k.g();
            return false;
        }
        return true;
    }

    public final void K() {
        synchronized (this.p) {
            btlu btluVar = this.t;
            if (!this.k.b() || btluVar == null || !btluVar.l()) {
                return;
            }
            btlu btluVar2 = this.t;
            dbsk.s(btluVar2);
            if (this.K == null) {
                this.K = new apxv(this, btluVar2);
                crzm<apsi<Set<String>>> c = this.H.a().c(btluVar2);
                this.L = c;
                dbsk.s(c);
                crzp<apsi<Set<String>>> crzpVar = this.K;
                dbsk.s(crzpVar);
                c.d(crzpVar, this.h);
            }
        }
    }

    public final void L() {
        crzm<apsi<Set<String>>> crzmVar;
        synchronized (this.p) {
            crzp<apsi<Set<String>>> crzpVar = this.K;
            if (crzpVar != null && (crzmVar = this.L) != null) {
                crzmVar.c(crzpVar);
                this.K = null;
                this.L = null;
            }
        }
    }

    @Override // defpackage.itb
    public final void Nt() {
        super.Nt();
        this.u.a().k(new apxw(this), this.h, bvkw.ON_STARTUP_FULLY_COMPLETE);
    }

    @Override // defpackage.itb
    public final void Po() {
        synchronized (this.p) {
            if (this.s != null) {
                crzm<btlu> C = this.b.a().C();
                apxu apxuVar = this.s;
                dbsk.s(apxuVar);
                C.c(apxuVar);
                this.s = null;
            }
        }
        L();
        if (this.k.b()) {
            this.i.a().b();
        }
        if (this.r != null) {
            if (this.e.a().a()) {
                aqbo aqboVar = this.r;
                aqboVar.m(aqboVar.a.a().j());
            }
            this.r.d();
        }
        super.Po();
    }

    @Override // defpackage.apyz
    public final void e(String str) {
        if (!this.e.a().k()) {
            return;
        }
        bvvw a = this.I.a();
        gga ggaVar = this.a;
        bvxn bZ = bvxu.A.bZ();
        String format = String.format(this.e.a().a.a().getBusinessMessagingParameters().Y, str);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bvxu bvxuVar = (bvxu) bZ.b;
        format.getClass();
        int i = bvxuVar.a | 1;
        bvxuVar.a = i;
        bvxuVar.b = format;
        bvxuVar.a = i | 4;
        bvxuVar.d = true;
        bvxu.b(bvxuVar);
        bvxp f = bvoa.f(ibm.b(), ggaVar);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bvxu bvxuVar2 = (bvxu) bZ.b;
        f.getClass();
        bvxuVar2.x = f;
        bvxuVar2.a |= 4194304;
        bvxj bZ2 = bvxm.e.bZ();
        String string = ggaVar.getString(R.string.MERCHANT_MESSAGING_EDIT_WELCOME_MESSAGE_BUTTON_TEXT);
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        bvxm bvxmVar = (bvxm) bZ2.b;
        string.getClass();
        bvxmVar.a |= 1;
        bvxmVar.b = string;
        bvxm bvxmVar2 = (bvxm) bZ2.b;
        bvxmVar2.c = 2;
        bvxmVar2.a = 2 | bvxmVar2.a;
        bvxm bK = bZ2.bK();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bvxu bvxuVar3 = (bvxu) bZ.b;
        bK.getClass();
        bvxuVar3.t = bK;
        int i2 = bvxuVar3.a | 262144;
        bvxuVar3.a = i2;
        bvxuVar3.a = i2 | 2048;
        bvxuVar3.m = true;
        dkyw bZ3 = dkyx.f.bZ();
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dkyx.b((dkyx) bZ3.b);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bvxu bvxuVar4 = (bvxu) bZ.b;
        dkyx bK2 = bZ3.bK();
        bK2.getClass();
        bvxuVar4.j = bK2;
        bvxuVar4.a |= 256;
        a.j(bZ.bK(), new EditWelcomeMessageWebViewCallbacks(), dtxv.bM);
    }

    @Override // defpackage.apyz
    public final void f() {
        ckhf ckhfVar;
        boolean a = this.E.a();
        this.v.e(cwsv.a(true != a ? "MessagingInboxStartEvent" : "MessagingInboxTabStartEvent"));
        ckcw ckcwVar = this.g;
        if (a) {
            ckhfVar = ckgs.b;
        } else {
            ckhfVar = ckgs.a;
        }
        ((ckhe) ckcwVar.a(ckhfVar)).a();
        if (a) {
            this.C.a().a();
        } else {
            M(new aqwl(), null, null);
        }
    }

    @Override // defpackage.apyz
    public final void i() {
        if (!this.z.a().a() || !w()) {
            return;
        }
        cjot a = this.C.a();
        apzu bZ = apzv.c.bZ();
        apzq bZ2 = apzt.e.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        apzt apztVar = (apzt) bZ2.b;
        apztVar.b = 2;
        int i = apztVar.a | 1;
        apztVar.a = i;
        apztVar.a = i | 4;
        apztVar.d = true;
        int i2 = apzb.INBOX_IN_UPDATES_TAB.q;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        apzt apztVar2 = (apzt) bZ2.b;
        apztVar2.a = 2 | apztVar2.a;
        apztVar2.c = i2;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        apzv apzvVar = (apzv) bZ.b;
        apzt bK = bZ2.bK();
        bK.getClass();
        apzvVar.b = bK;
        apzvVar.a |= 1;
        a.b(bZ.bK());
    }

    @Override // defpackage.apyz
    public final void j(final String str) {
        if (!this.z.a().a() || !w()) {
            return;
        }
        cjot a = this.C.a();
        apzu bZ = apzv.c.bZ();
        apzq bZ2 = apzt.e.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        apzt apztVar = (apzt) bZ2.b;
        apztVar.b = 2;
        apztVar.a |= 1;
        int i = apzb.INBOX_IN_UPDATES_TAB.q;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        apzt apztVar2 = (apzt) bZ2.b;
        apztVar2.a = 2 | apztVar2.a;
        apztVar2.c = i;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        apzv apzvVar = (apzv) bZ.b;
        apzt bK = bZ2.bK();
        bK.getClass();
        apzvVar.b = bK;
        apzvVar.a |= 1;
        a.b(bZ.bK());
        this.a.runOnUiThread(new Runnable(this, str) { // from class: apxg
            private final apxx a;
            private final String b;

            {
                this.a = this;
                this.b = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.a.D(aqrx.g(this.b));
            }
        });
    }

    @Override // defpackage.apyz
    public final void k(apze apzeVar, ContactId contactId) {
        if (!this.z.a().a()) {
            return;
        }
        M(new aqwe(apzeVar), contactId, null);
    }

    @Override // defpackage.apyz
    public final void l(String str, apzb apzbVar) {
        if (!this.z.a().a()) {
            return;
        }
        M(new aqwf(str, apzbVar), null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01d1  */
    @Override // defpackage.apyz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(@defpackage.dzsi defpackage.ilo r7, defpackage.apzb r8) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.apxx.m(ilo, apzb):void");
    }

    @Override // defpackage.apyz
    public final void n(apzc apzcVar, boolean z) {
        M(new aqwi(apzcVar, z), apzcVar.b().a() ? apzcVar.b().b().a() : null, apzcVar);
    }

    @Override // defpackage.apyz
    public final boolean o() {
        return this.e.a().a();
    }

    @Override // defpackage.apyz
    public final boolean p(@dzsi ilo iloVar) {
        boolean z = false;
        if (o() && !dbsj.d(aqco.a(iloVar))) {
            z = true;
        }
        if (z && btlu.i(this.b.a().j()) != btlt.INCOGNITO) {
            synchronized (this.G) {
                if (!this.J) {
                    this.J = true;
                    this.y.a().j();
                }
            }
        }
        return z;
    }

    @Override // defpackage.apyz
    public final boolean q() {
        return this.w.a().c > 0;
    }

    @Override // defpackage.apyz
    public final crzm<Integer> r() {
        return this.w.a().a.a;
    }

    @Override // defpackage.apyz
    public final void s() {
        dbsg<ctyy> e = this.f.a().e(1);
        if (e.a()) {
            this.x.a().a(e.b());
        }
    }

    @Override // defpackage.apyz
    public final void t(final cugu cuguVar) {
        if (!this.e.a().b()) {
            return;
        }
        if (!this.B.a().a("android.permission.WRITE_EXTERNAL_STORAGE")) {
            this.A.a().b("android.permission.WRITE_EXTERNAL_STORAGE", new axrw(this, cuguVar) { // from class: apxl
                private final apxx a;
                private final cugu b;

                {
                    this.a = this;
                    this.b = cuguVar;
                }

                @Override // defpackage.axrw
                public final void a(int i) {
                    final apxx apxxVar = this.a;
                    cugu cuguVar2 = this.b;
                    if (i != 0) {
                        if (!apxxVar.e.a().b()) {
                            return;
                        }
                        if (apxxVar.q == null) {
                            apxxVar.q = new AlertDialog.Builder(apxxVar.a).setTitle(apxxVar.a.getString(R.string.LIGHTER_LIGHTBOX_PERMISSIONS_DIALOG_TITLE)).setMessage(apxxVar.a.getString(R.string.LIGHTER_LIGHTBOX_PERMISSIONS_DIALOG_TEXT)).setPositiveButton(apxxVar.a.getString(R.string.LIGHTER_LIGHTBOX_PERMISSIONS_DIALOG_POSITIVE_BUTTON), new DialogInterface.OnClickListener(apxxVar) { // from class: apxo
                                private final apxx a;

                                {
                                    this.a = apxxVar;
                                }

                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i2) {
                                    apxx apxxVar2 = this.a;
                                    Intent intent = new Intent();
                                    intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
                                    intent.setData(Uri.fromParts("package", apxxVar2.a.getApplicationContext().getPackageName(), null));
                                    apxxVar2.j.a().f(apxxVar2.a, intent, 2);
                                    dialogInterface.dismiss();
                                }
                            }).setNegativeButton(apxxVar.a.getString(R.string.LIGHTER_LIGHTBOX_PERMISSIONS_DIALOG_NEGATIVE_BUTTON), apxp.a).create();
                        }
                        apxxVar.q.show();
                        return;
                    }
                    apxxVar.C(cuguVar2);
                }
            });
        } else {
            C(cuguVar);
        }
    }
}
