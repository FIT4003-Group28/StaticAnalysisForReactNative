package defpackage;

import android.content.ContentResolver;
import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Base64;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Toast;
import com.google.android.apps.maps.R;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import com.google.android.libraries.messaging.lighter.model.Notification;
import com.google.android.libraries.messaging.lighter.ui.overlay.OverlayView;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: aqfu  reason: default package */
/* loaded from: classes2.dex */
public class aqfu extends aqcg {
    private static final dcqe I = dcqe.c("aqfu");
    private static final dcdc<String> J = dcdc.r(new ArrayList(Arrays.asList("image/jpeg", "image/png", "image/bmp", "image/tiff")));
    public static final ckme f = ckme.PRIMARY_MAP;
    public boolean A;
    public final AtomicBoolean B;
    @dzsi
    cukw C;
    public cjql D;
    @dzsi
    public cjql E;
    @dzsi
    public cjtd F;
    @dzsi
    public ctyy G;
    @dzsi
    public ConversationId H;
    private final dxio<aqav> K;
    private final btvo L;
    private final dxio<apyy> M;
    private final dxio<aqdj> N;
    private final dxio<aqcz> O;
    private final dxio<aqel> P;
    private final dxio<aqeo> Q;
    private final ContentResolver R;
    private final bvsx S;
    private final boolean U;
    @dzsi
    private final cuxm V;
    @dzsi
    private final cuxl W;
    @dzsi
    private cvfw X;
    public final dxio<cqat> g;
    public final apzc h;
    public final bvjj i;
    public final dxio<aqrr> j;
    public final dxio<acwo> k;
    public final dxio<akfa> l;
    public final dxio<aqaa> m;
    public final dxio<apzy> n;
    public final dxio<bbut> o;
    public final dxio<aqci> p;
    public final dxio<apyz> q;
    public final boolean r;
    public final dxio<fzc> s;
    public final aqrk t;
    public final cjqy u;
    public final cjqq v;
    public final Executor w;
    @dzsi
    cuzo<cuzt> x;
    @dzsi
    public final cuzt y;
    public final List<Uri> z;

    /* JADX WARN: Multi-variable type inference failed */
    public aqfu(gga ggaVar, bvjj bvjjVar, btvo btvoVar, bvrb bvrbVar, dxio<aqav> dxioVar, dxio<apyy> dxioVar2, dxio<aqrr> dxioVar3, dxio<aqbo> dxioVar4, dxio<aqdj> dxioVar5, dxio<aqcz> dxioVar6, dxio<acwo> dxioVar7, dxio<akfa> dxioVar8, dxio<aqaa> dxioVar9, dxio<apzy> dxioVar10, dxio<aqel> dxioVar11, dxio<aqeo> dxioVar12, dxio<bbut> dxioVar13, dxio<aqci> dxioVar14, dxio<apyz> dxioVar15, dxio<aqep> dxioVar16, aqrl aqrlVar, auur auurVar, auut auutVar, cjqy cjqyVar, cjqq cjqqVar, apyv apyvVar, Executor executor, dxio<fzc> dxioVar17, dxio<cqat> dxioVar18, apzc apzcVar, @dzsi cuxm cuxmVar, @dzsi cuxl cuxlVar, @dzsi cuzt cuztVar, ges gesVar, boolean z) {
        super(ggaVar, gesVar, bvrbVar, dxioVar4);
        aqrl aqrlVar2;
        auur auurVar2;
        this.B = new AtomicBoolean(false);
        this.K = dxioVar;
        this.s = dxioVar17;
        this.g = dxioVar18;
        this.h = apzcVar;
        this.i = bvjjVar;
        this.L = btvoVar;
        this.M = dxioVar2;
        this.j = dxioVar3;
        this.N = dxioVar5;
        this.V = cuxmVar;
        this.W = cuxlVar;
        this.y = cuztVar;
        this.O = dxioVar6;
        this.k = dxioVar7;
        this.l = dxioVar8;
        this.m = dxioVar9;
        this.n = dxioVar10;
        this.P = dxioVar11;
        this.o = dxioVar13;
        this.Q = dxioVar12;
        this.p = dxioVar14;
        this.q = dxioVar15;
        this.r = z;
        this.z = new ArrayList();
        this.u = cjqyVar;
        this.v = cjqqVar;
        this.w = executor;
        this.R = ggaVar.getContentResolver();
        this.S = new bvsx(ggaVar.getResources());
        if (!apzcVar.b().a() || aqda.e(apzcVar.b().b().a()) != 2) {
            aqrlVar2 = aqrlVar;
            auurVar2 = auutVar;
        } else {
            aqrlVar2 = aqrlVar;
            auurVar2 = auurVar;
        }
        this.t = aqrlVar2.a(auurVar2);
        this.U = apyvVar.a();
    }

    private final dxpr A() {
        if (!this.h.c().a()) {
            return dxpr.f;
        }
        try {
            return (dxpr) dsqw.cq(dxpr.f, Base64.decode(this.h.c().b(), 8));
        } catch (dsrm | IllegalArgumentException unused) {
            return dxpr.f;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0610  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0639  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0647  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x06c3  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x06c9  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x06d9  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0789  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x07a1  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x07da  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x07f3  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0811  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0814  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0840  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0866  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x08ab  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x08b0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void z(final defpackage.ctyy r26) {
        /*
            Method dump skipped, instructions count: 2466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqfu.z(ctyy):void");
    }

    @Override // defpackage.aqcc
    public Boolean b() {
        return true;
    }

    @Override // defpackage.aqcc
    public cjtd c() {
        bvoo.h("This should not be called in this viewModel, as we call log impression explicitly.", new Object[0]);
        return cjtd.a(dtxv.dv);
    }

    @Override // defpackage.aqcg
    protected final void i(ctyy ctyyVar) {
        z(ctyyVar);
    }

    @Override // defpackage.aqcg
    protected final void j(dcdc<ctyy> dcdcVar) {
        if (dcdcVar.size() != 1) {
            return;
        }
        z(dcdcVar.get(0));
    }

    public void m() {
        if (!this.U) {
            PD();
            return;
        }
        dbsg<ConversationId> b = this.h.b();
        if (b.a()) {
            PE(dcdc.f(Integer.valueOf(aqda.e(b.b().a()))));
            return;
        }
        dxnc dxncVar = A().a;
        if (dxncVar == null) {
            dxncVar = dxnc.e;
        }
        int b2 = dxov.b(dxncVar.a);
        if (b2 == 0) {
            b2 = 1;
        }
        int i = b2 - 2;
        if (i == 3) {
            PE(dcdc.f(1));
        } else if (i != 4) {
        } else {
            PE(dcdc.f(2));
        }
    }

    public void n() {
        ctyy ctyyVar;
        PG();
        final ctyy ctyyVar2 = this.G;
        if (ctyyVar2 != null) {
            this.N.a().a(ctyyVar2);
            if (this.A) {
                this.K.a().c().p(ctyyVar2);
                this.A = false;
            }
            if (!aqda.c(ctyyVar2)) {
                this.O.a().a(ctyyVar2);
            }
            if (this.H != null && (ctyyVar = this.G) != null && aqda.d(ctyyVar) == 1 && !this.m.a().b) {
                csuk c = this.K.a().c();
                ctyy ctyyVar3 = this.G;
                dbsk.s(ctyyVar3);
                ConversationId conversationId = this.H;
                dbsk.s(conversationId);
                c.d(ctyyVar3, conversationId, null, 0).k(new cusr(this) { // from class: aqfc
                    private final aqfu a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.cusr
                    public final void a(Object obj) {
                        aqfu aqfuVar = this.a;
                        dcdc dcdcVar = (dcdc) obj;
                        final dxio<acwo> dxioVar = aqfuVar.k;
                        final dxio<aqaa> dxioVar2 = aqfuVar.m;
                        final dxio<akfa> dxioVar3 = aqfuVar.l;
                        final bvjj bvjjVar = aqfuVar.i;
                        final Executor executor = aqfuVar.w;
                        final aqfs aqfsVar = new aqfs();
                        int size = dcdcVar.size();
                        for (int i = 0; i < size; i++) {
                            cugu cuguVar = (cugu) dcdcVar.get(i);
                            boolean z = true;
                            aqfsVar.c |= cuguVar.o() == 1;
                            boolean z2 = cuguVar.o() == 2;
                            boolean z3 = aqfsVar.b;
                            if (!z2 || !aqfsVar.c) {
                                z = false;
                            }
                            aqfsVar.b = z3 | z;
                            aqfsVar.a = z2 | aqfsVar.a;
                        }
                        deha.q(deew.g(degp.q(deha.a(false)), new defg(aqfsVar, dxioVar) { // from class: aqfd
                            private final aqfs a;
                            private final dxio b;

                            {
                                this.a = aqfsVar;
                                this.b = dxioVar;
                            }

                            @Override // defpackage.defg
                            public final dehn a(Object obj2) {
                                aqfs aqfsVar2 = this.a;
                                dxio dxioVar4 = this.b;
                                Boolean bool = (Boolean) obj2;
                                ckme ckmeVar = aqfu.f;
                                if (!aqfsVar2.b || bool.booleanValue()) {
                                    return deha.a(bool);
                                }
                                return ((acwo) dxioVar4.a()).i(dvum.BUSINESS_MESSAGING_INBOX, null);
                            }
                        }, executor), bvqj.b(new bvqg(dxioVar2, dxioVar3, bvjjVar, aqfsVar, dxioVar, executor) { // from class: aqfe
                            private final dxio a;
                            private final dxio b;
                            private final bvjj c;
                            private final aqfs d;
                            private final dxio e;
                            private final Executor f;

                            {
                                this.a = dxioVar2;
                                this.b = dxioVar3;
                                this.c = bvjjVar;
                                this.d = aqfsVar;
                                this.e = dxioVar;
                                this.f = executor;
                            }

                            @Override // defpackage.bvqg
                            public final void NU(Object obj2) {
                                final dxio dxioVar4 = this.a;
                                dxio dxioVar5 = this.b;
                                bvjj bvjjVar2 = this.c;
                                aqfs aqfsVar2 = this.d;
                                dxio dxioVar6 = this.e;
                                Executor executor2 = this.f;
                                ckme ckmeVar = aqfu.f;
                                if (!((Boolean) obj2).booleanValue()) {
                                    if (aqfsVar2.a) {
                                        return;
                                    }
                                    deha.q(((acwo) dxioVar6.a()).i(dvum.BUSINESS_MESSAGING_NOT_USED, null), bvqj.b(new bvqg(dxioVar4) { // from class: aqff
                                        private final dxio a;

                                        {
                                            this.a = dxioVar4;
                                        }

                                        @Override // defpackage.bvqg
                                        public final void NU(Object obj3) {
                                            dxio dxioVar7 = this.a;
                                            ckme ckmeVar2 = aqfu.f;
                                            if (((Boolean) obj3).booleanValue()) {
                                                ((aqaa) dxioVar7.a()).d();
                                            }
                                        }
                                    }), executor2);
                                    return;
                                }
                                ((aqaa) dxioVar4.a()).d();
                                btlu j = ((akfa) dxioVar5.a()).j();
                                if (j == null || !bvjjVar2.o(bvjk.iy, j, false)) {
                                    return;
                                }
                                bvjjVar2.T(bvjk.iy, j, false);
                            }
                        }), executor);
                    }
                });
            }
            if (aqda.d(ctyyVar2) == 2 && this.U) {
                final aqeo a = this.Q.a();
                if (a.a.getMerchantExperienceParameters().g && a.b.a()) {
                    csug d = a.d.a().d();
                    final dbss dbssVar = dbss.ALWAYS_TRUE;
                    final csyb csybVar = (csyb) d;
                    cusl.d(new cusd(cswe.b(cswe.a(csybVar.a).D, csybVar.b), new dbrn(csybVar, ctyyVar2, dbssVar) { // from class: csxx
                        private final csyb a;
                        private final ctyy b;
                        private final dbsl c;

                        {
                            this.a = csybVar;
                            this.b = ctyyVar2;
                            this.c = dbssVar;
                        }

                        @Override // defpackage.dbrn
                        public final Object a(Object obj) {
                            final csyb csybVar2 = this.a;
                            final ctyy ctyyVar4 = this.b;
                            final dbsl<cufp> dbslVar = this.c;
                            if (!((Boolean) obj).booleanValue()) {
                                return cusl.d(csybVar2.c.s(ctyyVar4, -1, 0), new dbrn(dbslVar) { // from class: csxz
                                    private final dbsl a;

                                    {
                                        this.a = dbslVar;
                                    }

                                    @Override // defpackage.dbrn
                                    public final Object a(Object obj2) {
                                        return Pair.create(dcdc.q(dcft.i((dcdc) obj2, this.a)), false);
                                    }
                                });
                            }
                            return cusl.d(csybVar2.c(ctyyVar4).ao(dbslVar), new dbrn(csybVar2, ctyyVar4) { // from class: csya
                                private final csyb a;
                                private final ctyy b;

                                {
                                    this.a = csybVar2;
                                    this.b = ctyyVar4;
                                }

                                @Override // defpackage.dbrn
                                public final Object a(Object obj2) {
                                    csyb csybVar3 = this.a;
                                    ctyy ctyyVar5 = this.b;
                                    Pair pair = (Pair) obj2;
                                    dcdc dcdcVar = (dcdc) pair.first;
                                    int size = dcdcVar.size();
                                    for (int i = 0; i < size; i++) {
                                        csybVar3.c.b(ctyyVar5, ((cufp) dcdcVar.get(i)).a()).l();
                                    }
                                    return pair;
                                }
                            });
                        }
                    }, csybVar.b), csxw.a).k(new cusr(a) { // from class: aqen
                        private final aqeo a;

                        {
                            this.a = a;
                        }

                        @Override // defpackage.cusr
                        public final void a(Object obj) {
                            aqeo aqeoVar = this.a;
                            if (((dcdc) obj).size() >= 3) {
                                aqeoVar.c.a().i(dvum.MERCHANT_MESSAGING_INBOX, null);
                            }
                        }
                    });
                }
            }
        }
        cuzo<cuzt> cuzoVar = this.x;
        if (cuzoVar != null) {
            cuzoVar.A();
        }
    }

    public boolean o() {
        cuzo<cuzt> cuzoVar = this.x;
        if (cuzoVar == null || this.y == null) {
            return false;
        }
        if (new KeyEvent(1, 4).getKeyCode() == 4) {
            if (cuzoVar.a.x().getVisibility() == 0) {
                cvcn cvcnVar = cuzoVar.M;
                View v = cuzoVar.a.v();
                cvcnVar.a.a(dbsg.i(cuzoVar.a.u()), v);
            } else if (cuzoVar.G) {
                cuzoVar.u.a.b();
            } else if (cuzoVar.H) {
                ((cvbx) cuzoVar.v).a.b();
            } else {
                if (cuzoVar.C.a()) {
                    cvfh cvfhVar = cuzoVar.B;
                    cugu b = cuzoVar.C.b();
                    if (cvfhVar.a.getVisibility() == 0) {
                        OverlayView overlayView = cvfhVar.a;
                        if (b.k().b().h()) {
                            cvfhVar.a(b);
                        }
                    }
                }
                cuzoVar.aa.d(cuzoVar.b);
                cuzoVar.x.a();
            }
        }
        return true;
    }

    public void p() {
        cukw cukwVar = this.C;
        if (cukwVar != null) {
            cukwVar.g = null;
            this.C = null;
        }
        cuzo<cuzt> cuzoVar = this.x;
        if (cuzoVar != null) {
            cuzoVar.s();
            this.x = null;
        }
    }

    public void q() {
        ConversationId u;
        ctyy ctyyVar = this.G;
        if (ctyyVar == null || (u = u(ctyyVar)) == null) {
            return;
        }
        v(this.G, u);
    }

    public dbsg<ConversationId> r() {
        ConversationId u;
        ctyy ctyyVar = this.G;
        return (ctyyVar == null || (u = u(ctyyVar)) == null) ? dbpy.a : dbsg.i(u);
    }

    public dbsg<ctyy> s() {
        return a().booleanValue() ? dbpy.a : dbsg.j(this.G);
    }

    public dehn<dbsg<ConversationId>> t() {
        dehn<dbsg<ctyy>> dehnVar = this.e;
        if (this.U) {
            dehnVar = deew.h(PF(), aqfq.a, dege.a);
        }
        if (dehnVar == null) {
            return deha.a(dbpy.a);
        }
        return deew.h(dehnVar, new dbrn(this) { // from class: aqey
            private final aqfu a;

            {
                this.a = this;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                ConversationId u;
                dbsg dbsgVar = (dbsg) obj;
                return (dbsgVar == null || !dbsgVar.a() || (u = this.a.u((ctyy) dbsgVar.b())) == null) ? dbpy.a : dbsg.i(u);
            }
        }, dege.a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @dzsi
    public final ConversationId u(ctyy ctyyVar) {
        if (this.h.b().a()) {
            return this.h.b().b();
        }
        if (!dbsj.d(this.h.c().f())) {
            dbsg<cufp> i = this.K.a().c().i(ctyyVar, this.h.c().b());
            if (i.a()) {
                return i.b().a();
            }
        }
        if (dbsj.d(this.h.e().f())) {
            return null;
        }
        ContactId b = aqda.b(this.h.e().b(), 1);
        dbsk.s(b);
        cufo o = cufp.o();
        cufq f2 = ConversationId.f();
        f2.e(b);
        f2.c(ctyyVar.b().e());
        o.n(f2);
        o.m(b.a());
        o.f(0L);
        o.b(new HashMap());
        o.c(false);
        return o.a().a();
    }

    public final void v(ctyy ctyyVar, final ConversationId conversationId) {
        this.K.a().e().b(ctyyVar, new dbsl(conversationId) { // from class: aqez
            private final ConversationId a;

            {
                this.a = conversationId;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                ConversationId conversationId2 = this.a;
                Notification notification = (Notification) obj;
                ckme ckmeVar = aqfu.f;
                return notification != null && notification.e() == Notification.NotificationType.a && notification.f().a().equals(conversationId2);
            }
        });
    }

    public final void w() {
        cvfw cvfwVar;
        cuzt cuztVar = this.y;
        if (cuztVar == null || (cvfwVar = this.X) == null) {
            return;
        }
        cuztVar.f.a(cvfwVar);
        if (cvfwVar.equals(cuztVar.e)) {
            cuztVar.e = null;
        }
        this.X = null;
        this.E = null;
        this.F = null;
    }

    public final void x() {
        cukw cukwVar = this.C;
        if (cukwVar != null) {
            dcdc<Uri> r = dcdc.r(this.z);
            final cumn cumnVar = cukwVar.b;
            cuiv cuivVar = cumnVar.a;
            final ArrayList arrayList = new ArrayList();
            for (final Uri uri : r) {
                final ConversationId conversationId = cumnVar.b;
                final String str = cumnVar.d;
                final cujn cujnVar = (cujn) cuivVar;
                arrayList.add(cujnVar.g.c(new Callable(cujnVar, uri, conversationId, str) { // from class: cujh
                    private final cujn a;
                    private final Uri b;
                    private final ConversationId c;
                    private final String d;

                    {
                        this.a = cujnVar;
                        this.b = uri;
                        this.c = conversationId;
                        this.d = str;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        cujn cujnVar2 = this.a;
                        Uri uri2 = this.b;
                        ConversationId conversationId2 = this.c;
                        String str2 = this.d;
                        String a = csvv.a("");
                        int i = Integer.MAX_VALUE;
                        try {
                            Cursor query = MediaStore.Images.Media.query(cujnVar2.b.getContentResolver(), uri2, new String[]{"_size"});
                            if (query != null && query.moveToFirst()) {
                                i = query.getInt(0);
                            }
                            if (query != null) {
                                query.close();
                            }
                        } catch (Exception unused) {
                            cstl.a("PhotosMsgController");
                        }
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        InputStream k = cujnVar2.k(uri2);
                        try {
                            BitmapFactory.decodeStream(k, null, options);
                            if (k != null) {
                                k.close();
                            }
                            int i2 = options.outHeight;
                            int i3 = options.outWidth;
                            if (i2 <= 0 || i3 <= 0 || i <= 0) {
                                throw new IOException("Invalid image dimensions");
                            }
                            cuko i4 = cukp.i();
                            cukk cukkVar = (cukk) i4;
                            cukkVar.a = null;
                            cukkVar.b = uri2.toString();
                            i4.b(1);
                            i4.i(i3);
                            i4.c(i2);
                            i4.f(i);
                            cukp a2 = i4.a();
                            ctog ctogVar = cujnVar2.h;
                            ctxm r2 = ctxn.r();
                            r2.g(25);
                            r2.n(conversationId2.a());
                            r2.p(a);
                            r2.d(conversationId2);
                            ctogVar.b(r2.a());
                            cugi p = cugu.p();
                            p.h(a);
                            p.o(2);
                            p.i(cugo.OUTGOING_PENDING_SEND);
                            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                            cstd.a();
                            p.m(Long.valueOf(timeUnit.toMicros(System.currentTimeMillis())));
                            p.c(conversationId2);
                            cugk c = cugl.c();
                            ((cudv) c).a = "photos";
                            c.b(cuiq.a(a2).b());
                            p.s(c.a());
                            p.d(str2);
                            p.l(conversationId2.a());
                            p.b(195);
                            p.r();
                            return p.a();
                        } catch (Throwable th) {
                            if (k != null) {
                                try {
                                    k.close();
                                } catch (Throwable th2) {
                                    deki.a(th, th2);
                                }
                            }
                            throw th;
                        }
                    }
                }));
            }
            deha.l(arrayList).c(new Runnable(cumnVar, arrayList) { // from class: cumm
                private final cumn a;
                private final List b;

                {
                    this.a = cumnVar;
                    this.b = arrayList;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ctcu ctcuVar;
                    ConversationId conversationId2;
                    cudk cudkVar;
                    cugu cuguVar;
                    cumn cumnVar2 = this.a;
                    boolean z = false;
                    for (dehn dehnVar : this.b) {
                        try {
                            ctcuVar = cumnVar2.f;
                            conversationId2 = cumnVar2.b;
                            cudkVar = new cudk();
                            cuguVar = (cugu) dehnVar.get();
                        } catch (InterruptedException | ExecutionException unused) {
                            cstl.a("PhotosComposer");
                            z = true;
                        }
                        if (cuguVar != null) {
                            cudkVar.a = cuguVar;
                            String str2 = "";
                            if (cudkVar.a == null) {
                                str2 = " message";
                            }
                            if (!str2.isEmpty()) {
                                throw new IllegalStateException(str2.length() != 0 ? "Missing required properties:".concat(str2) : new String("Missing required properties:"));
                            }
                            ctcuVar.b(conversationId2, new cudl(cudkVar.a));
                        } else {
                            throw new NullPointerException("Null message");
                        }
                    }
                    if (z) {
                        cumn.e.post(new Runnable(cumnVar2) { // from class: cuml
                            private final cumn a;

                            {
                                this.a = cumnVar2;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                Toast.makeText(this.a.c.getContext(), (int) R.string.failed_to_create_photo_message, 0).show();
                            }
                        });
                    }
                }
            }, dege.a);
            r.size();
            cstl.a("PhotosComposer");
            deha.l(arrayList);
            for (Uri uri2 : this.z) {
                String type = this.R.getType(uri2);
                if (type != null && !J.contains(type)) {
                    cjqy cjqyVar = this.u;
                    cjst d = cjsu.d();
                    d.d(ddda.aX);
                    cjry e = cjrz.e();
                    e.b(ddcu.o);
                    dddf bZ = dddg.g.bZ();
                    dddl bZ2 = dddo.i.bZ();
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    dddo dddoVar = (dddo) bZ2.b;
                    type.getClass();
                    dddoVar.a |= 256;
                    dddoVar.h = type;
                    dddo bK = bZ2.bK();
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dddg dddgVar = (dddg) bZ.b;
                    bK.getClass();
                    dddgVar.b = bK;
                    dddgVar.a |= 1;
                    ((cjrn) e).b = bZ.bK();
                    d.f(e.a());
                    cjqyVar.l(d.e());
                }
            }
            this.z.clear();
        }
    }

    public boolean y() {
        return this.L.getBusinessMessagingParameters().aa;
    }
}
