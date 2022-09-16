package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import android.util.SparseArray;
import android.view.MenuItem;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import com.google.android.apps.maps.R;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import com.google.android.libraries.messaging.lighter.ui.overlay.OverlayView;
import defpackage.cuxo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: cuzo  reason: default package */
/* loaded from: classes5.dex */
public final class cuzo<ViewT extends View & cuxo> implements cuxn, cuuc {
    private static final cuxm at = cuyt.a;
    private static final cuxl au = cuyu.a;
    private static final cuzc av = new cuzc();
    public final cvfh B;
    public boolean J;
    public cvfl K;
    public cuvd L;
    public final cvcn M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    dcdc<cugf> S;
    dcdc<cugf> T;
    public cuvw U;
    UUID V;
    public final ViewT a;
    public final ctcu aa;
    public aqfw ab;
    private cvaj ac;
    private final csuf ad;
    private final csuy ae;
    private final cuss<Boolean> af;
    private final Handler ah;
    private final Runnable ai;
    private cvgh aj;
    private final cusr<dcdc<cugu>> ak;
    private cuss<dcdc<cugu>> al;
    private final cuss<cufj> am;
    private final cuss<dcdc<cugb>> an;
    public final ConversationId b;
    public final cuwy c;
    public final cuzq d;
    public final csui e;
    public final csud f;
    public final csuk g;
    public final csue h;
    public final ctyy i;
    public final cuzv j;
    public final cuss<cufp> l;
    public final cvdt m;
    public MenuItem n;
    public cveg o;
    public MenuItem p;
    public cuvs u;
    public cvbr v;
    public final dbsg<cuss<cufj>> z;
    public String k = "";
    private final dbsg<cufp> ag = dbpy.a;
    public int q = 1;
    public final SparseArray<ctzl> r = new SparseArray<>();
    final List<MenuItem> s = new ArrayList();
    public final List<MenuItem> t = new ArrayList();
    public Map<String, dspd> w = dcmn.a;
    public cuxm x = at;
    public cuxl y = au;
    public dcdc<cuzw> A = dcdc.e();
    public dbsg<cugu> C = dbpy.a;
    private final cusr<cufj> ao = new cusr(this) { // from class: cuxp
        private final cuzo a;

        {
            this.a = this;
        }

        @Override // defpackage.cusr
        public final void a(Object obj) {
            final cuzo cuzoVar = this.a;
            final cufj cufjVar = (cufj) obj;
            cuzoVar.g();
            cuzoVar.S = cufjVar.h();
            dcdc<cugf> dcdcVar = cuzoVar.S;
            int size = dcdcVar.size();
            for (int i = 0; i < size; i++) {
                cugf cugfVar = dcdcVar.get(i);
                if (cuzoVar.b(cugfVar.b()) && !cugfVar.b().f().equals(ctzd.UNKNOWN)) {
                    int i2 = cuzoVar.q;
                    cuzoVar.q = i2 + 1;
                    MenuItem g = cuzoVar.a.j().g(cugfVar.a(), i2, cuzoVar.Y);
                    cuzoVar.r.put(g.getItemId(), cugfVar.b());
                    g.setOnMenuItemClickListener(cuzoVar.Z);
                    cuzoVar.s.add(g);
                }
            }
            cuzoVar.T = cufjVar.i();
            deew.h(cuzoVar.e.a(cuzoVar.i, 12), new dbrn(cuzoVar) { // from class: cuyq
                private final cuzo a;

                {
                    this.a = cuzoVar;
                }

                @Override // defpackage.dbrn
                public final Object a(Object obj2) {
                    cuzo cuzoVar2 = this.a;
                    boolean booleanValue = ((Boolean) obj2).booleanValue();
                    dcdc<cugf> dcdcVar2 = cuzoVar2.T;
                    if (!booleanValue) {
                        return null;
                    }
                    for (cugf cugfVar2 : dcdcVar2) {
                        if (cugfVar2.b().f() == ctzd.CALL_ACTION) {
                            dbsg<byte[]> c = cugfVar2.c();
                            if (c.a()) {
                                int i3 = cuzoVar2.q;
                                cuzoVar2.q = i3 + 1;
                                MenuItem d = cuzoVar2.a.j().d(cugfVar2.a(), i3, c.b(), cuzoVar2.Y);
                                cuzoVar2.r.put(d.getItemId(), cugfVar2.b());
                                d.setOnMenuItemClickListener(cuzoVar2.Z);
                                cuzoVar2.t.add(d);
                                cuzoVar2.j.i(String.valueOf(cugfVar2.b().e()), cubv.a);
                            }
                        }
                    }
                    return null;
                }
            }, cstm.a());
            if (cuzoVar.b.c().equals(ConversationId.IdType.ONE_TO_ONE) && cufjVar.b().a()) {
                cuzoVar.k = cufjVar.b().b();
            }
            deew.h(cuzoVar.e.a(cuzoVar.i, 15), new dbrn(cuzoVar, cufjVar) { // from class: cuyr
                private final cuzo a;
                private final cufj b;

                {
                    this.a = cuzoVar;
                    this.b = cufjVar;
                }

                @Override // defpackage.dbrn
                public final Object a(Object obj2) {
                    cuzo cuzoVar2 = this.a;
                    cufj cufjVar2 = this.b;
                    if (!((Boolean) obj2).booleanValue() || !cufjVar2.j().a()) {
                        return null;
                    }
                    cufx b = cufjVar2.j().b();
                    if (b.b() != 1) {
                        return null;
                    }
                    cuzoVar2.a.j().setSubtitle(cuwd.b(cuzoVar2.a.getContext(), ((cuhx) b).a(), dbpy.a), TextView.BufferType.SPANNABLE);
                    cuzoVar2.a.j().e();
                    return null;
                }
            }, cstm.a());
        }
    };
    public final dehp D = cstu.b().a;
    public boolean E = false;
    public boolean F = false;
    public boolean G = false;
    public boolean H = false;
    public boolean I = false;
    public boolean R = true;
    private final cusr<cufp> ap = new cusr(this) { // from class: cuya
        private final cuzo a;

        {
            this.a = this;
        }

        @Override // defpackage.cusr
        public final void a(Object obj) {
            this.a.h((cufp) obj);
        }
    };
    private final cusr<cufj> aq = new cuzf(this);
    private final cusr<Boolean> ar = new cusr(this) { // from class: cuyk
        private final cuzo a;

        {
            this.a = this;
        }

        @Override // defpackage.cusr
        public final void a(Object obj) {
            cuzo cuzoVar = this.a;
            cuzoVar.F = ((Boolean) obj).booleanValue();
            if (cuzoVar.a == 0) {
                return;
            }
            cuzoVar.l();
            if (!cuzoVar.F) {
                return;
            }
            ((InputMethodManager) cuzoVar.a.getContext().getSystemService("input_method")).hideSoftInputFromWindow(cuzoVar.a.getWindowToken(), 0);
        }
    };
    private final cusr<dcdc<cugb>> as = new cusr(this) { // from class: cuyv
        private final cuzo a;

        {
            this.a = this;
        }

        @Override // defpackage.cusr
        public final void a(Object obj) {
            this.a.a.o().setOverrideSendButtonEnabled(!((dcdc) obj).isEmpty());
        }
    };
    final MenuItem.OnMenuItemClickListener W = new cuzj(this);
    final MenuItem.OnMenuItemClickListener X = new cuzk(this);
    public final MenuItem.OnMenuItemClickListener Y = cuyw.a;
    final MenuItem.OnMenuItemClickListener Z = new MenuItem.OnMenuItemClickListener(this) { // from class: cuyx
        private final cuzo a;

        {
            this.a = this;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public final boolean onMenuItemClick(MenuItem menuItem) {
            cuzo cuzoVar = this.a;
            if (menuItem == null || cuzoVar.r.get(menuItem.getItemId()) == null) {
                return false;
            }
            cuzoVar.a(cuzoVar.r.get(menuItem.getItemId()));
            return true;
        }
    };

    /* JADX WARN: Multi-variable type inference failed */
    public cuzo(final View view, ConversationId conversationId, ctyy ctyyVar, cuzq cuzqVar, csui csuiVar, csud csudVar, csuk csukVar, csuf csufVar, csuy csuyVar, ctcu ctcuVar, csue csueVar, ctxo ctxoVar) {
        if (!ctyyVar.b().f().contains(conversationId.a())) {
            String a = conversationId.a().a();
            String a2 = ctyyVar.b().e().a();
            StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 81 + String.valueOf(a2).length());
            sb.append("Conversation owner (");
            sb.append(a);
            sb.append(") doesn't belong to the account context (primary: ");
            sb.append(a2);
            sb.append(") passed in");
            throw new IllegalArgumentException(sb.toString());
        }
        this.a = view;
        this.b = conversationId;
        this.i = ctyyVar;
        this.d = cuzqVar;
        this.e = csuiVar;
        this.f = csudVar;
        this.g = csukVar;
        this.h = csueVar;
        this.ad = csufVar;
        this.ae = csuyVar;
        this.aa = ctcuVar;
        this.ak = new cusr(this) { // from class: cuyy
            private final cuzo a;

            {
                this.a = this;
            }

            @Override // defpackage.cusr
            public final void a(Object obj) {
                cuzo cuzoVar = this.a;
                dcdc dcdcVar = (dcdc) obj;
                if (!dcdcVar.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    cstd.a();
                    int seconds = (int) timeUnit.toSeconds(System.currentTimeMillis());
                    int size = dcdcVar.size();
                    for (int i = 0; i < size; i++) {
                        cugu cuguVar = (cugu) dcdcVar.get(i);
                        if (cuguVar.k().a() == cugt.OVERLAY) {
                            cugq b = cuguVar.k().b();
                            if (b.e() == 0 || (b.i().a() && b.i().b().intValue() >= seconds)) {
                                arrayList2.add(cuguVar);
                            } else {
                                arrayList.add(cuguVar);
                            }
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        cuzoVar.g.t(cuzoVar.i, (cugu[]) arrayList.toArray(new cugu[arrayList.size()]));
                    }
                    if (arrayList2.isEmpty()) {
                        return;
                    }
                    if (cuzoVar.C.a() && cuzoVar.C.b().a().equals(((cugu) arrayList2.get(0)).a())) {
                        return;
                    }
                    if (cuzoVar.E) {
                        cuzoVar.g.h(cuzoVar.i, cuzoVar.b);
                    }
                    final cugu cuguVar2 = (cugu) arrayList2.get(0);
                    dcdc<cuzw> dcdcVar2 = cuzoVar.A;
                    int size2 = dcdcVar2.size();
                    int i2 = 0;
                    while (i2 < size2) {
                        cuzw cuzwVar = dcdcVar2.get(i2);
                        i2++;
                        if (cuzwVar.b(cuguVar2)) {
                            final cvfh cvfhVar = cuzoVar.B;
                            View a3 = cuzwVar.a(cuguVar2, cuzoVar.a.getContext(), cuzoVar.i);
                            cvfhVar.b.removeCallbacks(cvfhVar.c);
                            OverlayView overlayView = cvfhVar.a;
                            if (cuguVar2.k().b().j() == 5) {
                                overlayView.b.setLayoutParams(overlayView.d);
                            } else {
                                overlayView.b.setLayoutParams(overlayView.c);
                            }
                            overlayView.b.setOutlineProvider(new cvfj(overlayView, cuguVar2.k().b().j() == 5 ? overlayView.e : 0));
                            overlayView.b.setClipToOutline(true);
                            overlayView.setClickable(true);
                            overlayView.setBackgroundColor(akm.c(overlayView.getContext(), R.color.overlay_background_blocked_color));
                            overlayView.setVisibility(0);
                            overlayView.d(cuguVar2.k().b());
                            overlayView.setContentView(a3);
                            cvfhVar.a.b(cuguVar2.k().b());
                            cvfhVar.a.setDismissOnClickListener(cuguVar2.k().b(), new View.OnClickListener(cvfhVar, cuguVar2) { // from class: cvff
                                private final cvfh a;
                                private final cugu b;

                                {
                                    this.a = cvfhVar;
                                    this.b = cuguVar2;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    this.a.a(this.b);
                                }
                            });
                            cvfhVar.a.setVisibility(0);
                            TimeUnit timeUnit2 = TimeUnit.SECONDS;
                            cugq b2 = cuguVar2.k().b();
                            int i3 = -1;
                            if (b2.e() != 0 && b2.i().a()) {
                                TimeUnit timeUnit3 = TimeUnit.MILLISECONDS;
                                cstd.a();
                                i3 = b2.i().b().intValue() - ((int) timeUnit3.toSeconds(System.currentTimeMillis()));
                            }
                            long millis = timeUnit2.toMillis(i3);
                            if (millis > 0) {
                                cvfhVar.b.postDelayed(cvfhVar.c, millis);
                            }
                            ((View) cuzoVar.a.o()).clearFocus();
                            cuwg.c(cuzoVar.a);
                            cuzoVar.C = dbsg.i(cuguVar2);
                            cuzoVar.j.h(cuguVar2);
                            return;
                        }
                    }
                }
            }
        };
        cuzv cuzvVar = new cuzv(conversationId, ctyyVar, ctxoVar);
        this.j = cuzvVar;
        this.l = ((ctct) csukVar).w(ctyyVar, conversationId, ctcf.a, ctcg.a);
        this.am = csufVar.a(ctyyVar, ctyyVar.b().e());
        if (conversationId.c() == ConversationId.IdType.ONE_TO_ONE) {
            this.z = dbsg.i(csufVar.a(ctyyVar, conversationId.e()));
        } else {
            this.z = dbpy.a;
        }
        this.an = ctcuVar.a(conversationId);
        this.af = ((csxc) csudVar).c(ctyyVar, conversationId, dbss.ALWAYS_FALSE);
        cuxb cuxbVar = new cuxb(ctyyVar, conversationId, csuyVar, view.o());
        this.c = cuxbVar;
        cuxbVar.b = new cuwx(this) { // from class: cuyz
            private final cuzo a;

            {
                this.a = this;
            }

            @Override // defpackage.cuwx
            public final void a(String str) {
                cuzo cuzoVar = this.a;
                String t = cuzoVar.a.t();
                if (t != null && !t.equals(str)) {
                    cuzoVar.j.j(10023);
                }
                cuzoVar.i(str, cuzoVar.a.s(), true);
                cuzoVar.a.setMessageCallbackPayload(null);
                cuzoVar.a.setComposeBoxPrefillSuggestionTextMessage(null);
            }
        };
        this.m = new cvdt(cuzvVar);
        f(dcdc.e());
        cvan cvanVar = new cvan(conversationId, this.z, cuzqVar.a(), ctyyVar, csukVar, view.j());
        this.ac = cvanVar;
        cvanVar.e = new cuza(this);
        view.setPresenter(this);
        view.setActionHandler(this);
        this.B = new cvfh(csukVar, view.u(), this, ctyyVar);
        this.M = new cvcn(view.x(), this, cuzvVar);
        this.ah = new Handler();
        this.ai = new Runnable(view) { // from class: cuzb
            private final View a;

            {
                this.a = view;
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [cuxo, android.view.View] */
            @Override // java.lang.Runnable
            public final void run() {
                ((View) this.a.o()).requestFocus();
            }
        };
        deew.h(csuiVar.a(ctyyVar, 1), new dbrn(this) { // from class: cuyo
            private final cuzo a;

            {
                this.a = this;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                cuzo cuzoVar = this.a;
                if (((Boolean) obj).booleanValue()) {
                    cuzoVar.g.n(cuzoVar.i);
                    cstl.a("ConvPresenter");
                    return null;
                }
                cstl.a("ConvPresenter");
                return null;
            }
        }, dege.a);
    }

    private final void C(cugu cuguVar) {
        deha.q(this.g.f(this.i, cuguVar, cuguVar.g() == cugo.OUTGOING_FAILED_SEND ? 2 : 1), new cuze(this, cuguVar), cstm.a());
    }

    private final void v() {
        cvgh cvghVar = this.aj;
        if (cvghVar != null) {
            ((cvgl) cvghVar).a = new cvgg(this) { // from class: cuyh
                private final cuzo a;

                {
                    this.a = this;
                }

                @Override // defpackage.cvgg
                public final void a() {
                    this.a.k();
                }
            };
            this.aj.z();
        }
        cuvs cuvsVar = this.u;
        if (cuvsVar != null) {
            cuvsVar.z();
        }
    }

    private final void w() {
        cuvs cuvsVar = this.u;
        if (cuvsVar != null) {
            cuvsVar.A();
        }
        cvgh cvghVar = this.aj;
        if (cvghVar != null) {
            cvghVar.A();
        }
    }

    private final void x() {
        this.am.g(this.aq);
        cvfl cvflVar = this.K;
        if (cvflVar != null) {
            this.a.i(cvflVar);
            this.K = null;
        }
    }

    private final void y(int i) {
        MenuItem menuItem = this.n;
        if (menuItem != null) {
            menuItem.setTitle(i);
        }
    }

    @Override // defpackage.cuvu
    public final void A() {
        this.E = false;
        this.j.j(104);
        ctxp.a().c("ConversationPresenter::start", this.V);
        cuwg.c(this.a);
        x();
        this.c.A();
        this.o.A();
        this.ac.A();
        w();
        ViewT viewt = this.a;
        if (viewt != null) {
            if (this.n != null) {
                viewt.j().c(this.n.getItemId());
                this.n = null;
            }
            if (this.p != null) {
                this.a.j().c(this.p.getItemId());
                this.p = null;
            }
            g();
        }
        this.af.g(this.ar);
        this.l.g(this.ap);
        this.an.g(this.as);
        this.am.g(this.aq);
        this.an.g(this.as);
        this.al.g(this.ak);
        if (this.z.a()) {
            this.z.b().g(this.ao);
        }
        this.g.r(new csux(this) { // from class: cuyi
            private final cuzo a;

            {
                this.a = this;
            }

            @Override // defpackage.csux
            public final void L(int i) {
                this.a.t(i);
            }
        });
        this.ah.removeCallbacks(this.ai);
    }

    @Override // defpackage.cuvu
    public final void B() {
        s();
    }

    @Override // defpackage.cuuc
    public final void a(ctzl ctzlVar) {
        cuzv cuzvVar = this.j;
        ctxo ctxoVar = cuzvVar.a;
        ctxm k = cuzvVar.k(com.google.android.filament.R.styleable.AppCompatTheme_windowFixedWidthMinor);
        cuii l = cuzvVar.l();
        ((cuev) l).c = dbsg.i(Long.valueOf(ctzlVar.e()));
        k.r(l.a());
        ctxoVar.b(k.a());
        if (!ctzlVar.f().equals(ctzd.CUSTOM_ACTION)) {
            r(ctzlVar.g());
        }
        if (ctzlVar.d().a()) {
            boolean z = false;
            if (this.N && ctzlVar.h() != ctzd.NO_OP_ACTION) {
                z = true;
            }
            csuk csukVar = this.g;
            final ctyy ctyyVar = this.i;
            final ConversationId conversationId = this.b;
            final ctzf b = ctzlVar.d().b();
            final String c = ctzlVar.c().c("");
            final dbsg<String> b2 = ctzlVar.b();
            final dbpy<Object> dbpyVar = dbpy.a;
            final ctct ctctVar = (ctct) csukVar;
            dehn f = deha.f(new deff(ctctVar, ctyyVar, conversationId, b, c, b2, dbpyVar) { // from class: ctaq
                private final ctct a;
                private final ctyy b;
                private final ConversationId c;
                private final ctzf d;
                private final String e;
                private final dbsg f;
                private final dbsg g;

                {
                    this.a = ctctVar;
                    this.b = ctyyVar;
                    this.c = conversationId;
                    this.d = b;
                    this.e = c;
                    this.f = b2;
                    this.g = dbpyVar;
                }

                @Override // defpackage.deff
                public final dehn a() {
                    ctct ctctVar2 = this.a;
                    ctyy ctyyVar2 = this.b;
                    ConversationId conversationId2 = this.c;
                    ctzf ctzfVar = this.d;
                    String str = this.e;
                    dbsg dbsgVar = this.f;
                    dbsg dbsgVar2 = this.g;
                    cted ctedVar = ctctVar2.b;
                    ctmm c2 = ctmn.c();
                    ((ctmh) c2).a = "send button or chip clicked event";
                    c2.b(ctmr.c);
                    ctmn a = c2.a();
                    cttz cttzVar = (cttz) ctedVar;
                    ctww ctwwVar = new ctww(cttzVar.b, ctyyVar2, conversationId2, ctus.b(ctzfVar), dbsgVar, dbsgVar2, str);
                    ctog ctogVar = cttzVar.c;
                    ctxm r = ctxn.r();
                    r.g(18);
                    r.n(ctyyVar2.b().e());
                    r.o(ctyyVar2.c().J());
                    r.p(ctwwVar.a);
                    r.d(conversationId2);
                    ctogVar.b(r.a());
                    dehn a2 = cttzVar.a.a(UUID.randomUUID(), ctwwVar, cttzVar.a.d.d(), ctyyVar2, a, true);
                    deha.q(a2, new ctty(cttzVar, ctyyVar2, ctwwVar, conversationId2), dege.a);
                    return a2;
                }
            }, ctctVar.d);
            if (!z) {
                return;
            }
            deha.q(f, new cuzd(this, ctzlVar), cstm.a());
        }
    }

    @Override // defpackage.cuuc
    public final boolean b(ctzl ctzlVar) {
        ctzd ctzdVar = ctzd.UNKNOWN;
        switch (ctzlVar.f().ordinal()) {
            case 1:
            case 2:
            case 4:
            case 6:
            case 7:
            case 9:
                return true;
            case 3:
                return c(ctzlVar) == 0;
            case 5:
            default:
                return false;
            case 8:
                return this.O;
        }
    }

    @Override // defpackage.cuuc
    public final int c(ctzl ctzlVar) {
        dbok dbokVar;
        aqfw aqfwVar = this.ab;
        int i = 2;
        if (aqfwVar == null) {
            return 2;
        }
        try {
            try {
                dbokVar = (dbok) dsqw.cr(dbok.b, Base64.decode(ctzlVar.g().d(), 8), dsqa.c());
            } catch (dsrm unused) {
                dbokVar = null;
            }
            if (dbokVar == null) {
                return 2;
            }
            int i2 = dbokVar.a;
            if (i2 != 0) {
                i = i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? 0 : 7 : 6 : 5 : 4 : 3;
            }
            if (i == 0) {
                i = 1;
            }
            return (i + (-2) == 5 && aqfwVar.a.getBusinessMessagingParameters().Z) ? 0 : 1;
        } catch (IllegalArgumentException unused2) {
            return 2;
        }
    }

    @Override // defpackage.cuxn
    public final cuvx d() {
        return this.j;
    }

    @Override // defpackage.cuxn
    public final void e() {
    }

    public final void f(dcdc<cvdw> dcdcVar) {
        cves cvesVar = new cves(this.a.B(), this.b, this.i, this.g, this.ad, this.ae, this.m, dcdcVar, this.j);
        this.o = cvesVar;
        cvesVar.w = new cuxq(this);
        ((cves) this.o).x = new cuxr(this);
        cveg cvegVar = this.o;
        cuzv cuzvVar = this.j;
        cuzvVar.getClass();
        ((cves) cvegVar).u = new cuxs(cuzvVar);
        ((cves) this.o).y = new cuxt(this);
        deew.h(this.e.a(this.i, 2), new dbrn(this) { // from class: cuxu
            private final cuzo a;

            {
                this.a = this;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                cuzo cuzoVar = this.a;
                cuzoVar.m.e = ((Boolean) obj).booleanValue();
                ((cves) cuzoVar.o).j.C();
                return null;
            }
        }, dege.a);
        deew.h(this.e.a(this.i, 6), new dbrn(this) { // from class: cuxv
            private final cuzo a;

            {
                this.a = this;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                this.a.m.f = ((Boolean) obj).booleanValue();
                return null;
            }
        }, dege.a);
        deew.h(this.e.a(this.i, 3), new dbrn(this) { // from class: cuxw
            private final cuzo a;

            {
                this.a = this;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                cuzo cuzoVar = this.a;
                Boolean bool = (Boolean) obj;
                cuzoVar.R = bool.booleanValue();
                if (!bool.booleanValue()) {
                    cuzoVar.o.d(cvec.SUGGESTION_LIST);
                    return null;
                }
                return null;
            }
        }, dege.a);
        deew.h(this.e.a(this.i, 5), new dbrn(this) { // from class: cuxx
            private final cuzo a;

            {
                this.a = this;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                cuzo cuzoVar = this.a;
                if (!((Boolean) obj).booleanValue()) {
                    cuzoVar.o.d(cvec.RICH_CARD_BUBBLE);
                    return null;
                }
                return null;
            }
        }, dege.a);
        deew.h(this.e.a(this.i, 9), new dbrn(this) { // from class: cuxy
            private final cuzo a;

            {
                this.a = this;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                cuzo cuzoVar = this.a;
                if (!((Boolean) obj).booleanValue()) {
                    cuzoVar.o.d(cvec.TOMBSTONE_BUBBLE);
                    return null;
                }
                return null;
            }
        }, dege.a);
        deew.h(this.e.a(this.i, 11), new dbrn(this) { // from class: cuxz
            private final cuzo a;

            {
                this.a = this;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                this.a.m.g = ((Boolean) obj).booleanValue();
                return null;
            }
        }, dege.a);
        deew.h(this.e.a(this.i, 13), new dbrn(this) { // from class: cuyb
            private final cuzo a;

            {
                this.a = this;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                this.a.N = ((Boolean) obj).booleanValue();
                return null;
            }
        }, dege.a);
        deew.h(this.e.a(this.i, 14), new dbrn(this) { // from class: cuyc
            private final cuzo a;

            {
                this.a = this;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                this.a.O = ((Boolean) obj).booleanValue();
                return null;
            }
        }, dege.a);
    }

    public final void g() {
        if (!this.s.isEmpty()) {
            for (MenuItem menuItem : this.s) {
                this.a.j().c(menuItem.getItemId());
            }
            this.s.clear();
        }
        if (!this.t.isEmpty()) {
            for (MenuItem menuItem2 : this.t) {
                this.a.j().c(menuItem2.getItemId());
            }
            this.t.clear();
        }
        this.r.clear();
        this.q = 1;
    }

    public final void h(cufp cufpVar) {
        if (this.E) {
            w();
        }
        if (this.E) {
            v();
        }
        ViewT viewt = this.a;
        if (viewt != null) {
            if (this.n == null) {
                this.n = viewt.j().f(R.string.block, this.W);
            }
            if (this.p == null) {
                this.p = this.a.j().f(R.string.delete, this.X);
            }
        }
        l();
        ctxp.a().c("ConversationPresenter::start", this.V);
        if (!this.b.c().equals(ConversationId.IdType.GROUP) || !cufpVar.b().a() || TextUtils.isEmpty(cufpVar.b().b())) {
            return;
        }
        this.k = cufpVar.b().b();
    }

    public final void i(String str, String str2, boolean z) {
        if (this.K != null) {
            this.J = true;
            x();
        }
        this.ae.e(this.b);
        if (!TextUtils.isEmpty(str)) {
            dcdg dcdgVar = new dcdg();
            if (!dbsj.d(str2)) {
                dsoj bZ = dsok.c.bZ();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                ((dsok) bZ.b).a = "type.googleapis.com/google.protobuf.StringValue";
                dstm bZ2 = dstn.b.bZ();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                str2.getClass();
                ((dstn) bZ2.b).a = str2;
                dspd bR = bZ2.bK().bR();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                bR.getClass();
                ((dsok) bZ.b).b = bR;
                dcdgVar.f("l_act_callback_payload", bZ.bK().bR());
            }
            dcdgVar.c(this.w);
            cugu j = this.g.j(this.b, cuas.a(str), str, dbsg.i(str), dbpy.a, dcdgVar.b());
            cuzv cuzvVar = this.j;
            ctxo ctxoVar = cuzvVar.a;
            ctxm k = cuzvVar.k(100);
            cuii l = cuzvVar.l();
            l.b(j.a());
            k.r(l.a());
            ctxoVar.b(k.a());
            C(j);
        }
        if (z) {
            dbsg<dcdc<cugb>> h = this.an.h();
            if (!h.a()) {
                return;
            }
            dcdc<cugb> b = h.b();
            int size = b.size();
            for (int i = 0; i < size; i++) {
                cugb cugbVar = b.get(i);
                this.aa.c(this.b, cugbVar.a().a());
                C(cugbVar.a());
            }
        }
    }

    public final void j(cugu cuguVar) {
        if (cuguVar.g() != cugo.OUTGOING_FAILED_SEND) {
            return;
        }
        cuzv cuzvVar = this.j;
        ctxo ctxoVar = cuzvVar.a;
        ctxm k = cuzvVar.k(com.google.android.filament.R.styleable.AppCompatTheme_switchStyle);
        cuii l = cuzvVar.l();
        l.b(cuguVar.a());
        k.r(l.a());
        ctxoVar.b(k.a());
        C(cuguVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void k() {
        this.a.k();
        csud csudVar = this.f;
        final ctyy ctyyVar = this.i;
        final ConversationId conversationId = this.b;
        ctmm c = ctmn.c();
        ((ctmh) c).a = "unblock conversation";
        c.b(ctmr.c);
        final ctmn a = c.a();
        final csxc csxcVar = (csxc) csudVar;
        final dehn h = deew.h(deha.f(new deff(csxcVar, ctyyVar, conversationId, a) { // from class: csww
            private final csxc a;
            private final ctyy b;
            private final ConversationId c;
            private final ctmn d;

            {
                this.a = csxcVar;
                this.b = ctyyVar;
                this.c = conversationId;
                this.d = a;
            }

            @Override // defpackage.deff
            public final dehn a() {
                csxc csxcVar2 = this.a;
                ctyy ctyyVar2 = this.b;
                ConversationId conversationId2 = this.c;
                ctmn ctmnVar = this.d;
                cttp cttpVar = csxcVar2.g;
                return cttpVar.a.a(UUID.randomUUID(), new ctxh(ctyyVar2, conversationId2), cttpVar.a.d.c(), ctyyVar2, ctmnVar, true);
            }
        }, csxcVar.c), new dbrn(csxcVar, ctyyVar, conversationId) { // from class: cswx
            private final csxc a;
            private final ctyy b;
            private final ConversationId c;

            {
                this.a = csxcVar;
                this.b = ctyyVar;
                this.c = conversationId;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                Void r4 = (Void) obj;
                this.a.d(this.b).K(cute.b(this.c), false);
                return null;
            }
        }, dege.a);
        deha.q(deha.k(h).b(new Callable(h) { // from class: cswy
            private final dehn a;

            {
                this.a = h;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                dehn dehnVar = this.a;
                try {
                    Void r1 = (Void) deha.r(dehnVar);
                } catch (ExecutionException unused) {
                    cstl.a("LitBlockController");
                }
                return (Void) dehnVar.get();
            }
        }, dege.a), new cuzg(this), cstm.a());
    }

    public final synchronized void l() {
        int i;
        if (this.ac == null) {
            return;
        }
        if (this.F) {
            this.a.d();
            y(R.string.unblock);
            if (this.aj == null) {
                cvgl cvglVar = new cvgl(this.a.p(), this.l, this.z, this.I);
                this.aj = cvglVar;
                cvglVar.a = new cvgg(this) { // from class: cuyl
                    private final cuzo a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.cvgg
                    public final void a() {
                        this.a.k();
                    }
                };
                if (this.E) {
                    this.aj.z();
                }
            }
            cvfl cvflVar = this.K;
            if (cvflVar != null) {
                this.a.i(cvflVar);
            }
            this.o.d(cvec.SUGGESTION_LIST);
            return;
        }
        this.a.e();
        if (this.R) {
            cveg cvegVar = this.o;
            cvec cvecVar = cvec.SUGGESTION_LIST;
            cvfc cvfcVar = ((cves) cvegVar).j;
            dcdc<cvdu> dcdcVar = cvfcVar.h;
            int size = dcdcVar.size();
            int i2 = 0;
            loop0: while (true) {
                if (i2 >= size) {
                    break;
                }
                cvdu cvduVar = dcdcVar.get(i2);
                Iterator<cvec> it = cvduVar.d().iterator();
                while (true) {
                    i = i2 + 1;
                    if (it.hasNext()) {
                        cvec next = it.next();
                        if (cvecVar.equals(next)) {
                            cvfcVar.g.put(next, cvduVar);
                            cvfcVar.C();
                            break loop0;
                        }
                    }
                }
                i2 = i;
            }
        }
        y(R.string.block_and_report);
        cvfl cvflVar2 = this.K;
        if (cvflVar2 == null) {
            return;
        }
        this.a.C(cvflVar2);
    }

    public final void m() {
        this.a.c();
        this.G = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void n() {
        ViewT viewt = this.a;
        if (viewt != null) {
            viewt.E(viewt.getContext().getString(R.string.delete_conversation_format, this.k));
        }
        csuk csukVar = this.g;
        final ConversationId conversationId = this.b;
        final ctyy ctyyVar = this.i;
        final ctct ctctVar = (ctct) csukVar;
        final long R = ctctVar.e.a(ctyyVar).R(conversationId);
        final dehn f = deha.f(new deff(ctctVar, conversationId, R, ctyyVar) { // from class: ctay
            private final ctct a;
            private final ConversationId b;
            private final long c;
            private final ctyy d;

            {
                this.a = ctctVar;
                this.b = conversationId;
                this.c = R;
                this.d = ctyyVar;
            }

            @Override // defpackage.deff
            public final dehn a() {
                ctct ctctVar2 = this.a;
                ConversationId conversationId2 = this.b;
                long j = this.c;
                ctyy ctyyVar2 = this.d;
                cted ctedVar = ctctVar2.b;
                ctmm c = ctmn.c();
                ((ctmh) c).a = "delete conversations";
                c.b(ctmr.c);
                ctmn a = c.a();
                cttz cttzVar = (cttz) ctedVar;
                return cttzVar.a.a(UUID.randomUUID(), new ctvu(dcdc.f(conversationId2), j, ctyyVar2), cttzVar.a.d.f(), ctyyVar2, a, true);
            }
        }, ctctVar.d);
        deha.q(deha.k(f).b(new Callable(ctctVar, f, ctyyVar, conversationId) { // from class: ctaz
            private final ctct a;
            private final dehn b;
            private final ctyy c;
            private final ConversationId d;

            {
                this.a = ctctVar;
                this.b = f;
                this.c = ctyyVar;
                this.d = conversationId;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                ctct ctctVar2 = this.a;
                dehn dehnVar = this.b;
                ctyy ctyyVar2 = this.c;
                ConversationId conversationId2 = this.d;
                try {
                    ctfd ctfdVar = (ctfd) deha.r(dehnVar);
                    int b = ctfdVar.b();
                    if (b == 0) {
                        throw null;
                    }
                    if (b == 2) {
                        csyc csycVar = ctctVar2.g;
                        ctrj ctrjVar = new ctrj(conversationId2, ctfdVar.a());
                        csycVar.a.a(ctyyVar2).j(ctrjVar.a, ctrjVar.b);
                        for (ctuk ctukVar : ctctVar2.s.values()) {
                            ctukVar.g(conversationId2);
                        }
                        return true;
                    }
                    return false;
                } catch (ExecutionException unused) {
                    cstl.a("LiMsgController");
                    return false;
                }
            }
        }, ctctVar.d), new cuzn(this), cstm.a());
    }

    public final cuss<Boolean> o() {
        return cusl.d(this.g.e(this.i, this.b, 1, null, cugt.g), cuym.a);
    }

    public final void p(boolean z, boolean z2) {
        if (z) {
            this.aa.d(this.b);
        }
        ViewT viewt = this.a;
        if (viewt == null) {
            return;
        }
        viewt.y();
        if (!z) {
            ViewT viewt2 = this.a;
            viewt2.F(viewt2.getContext().getText(R.string.delete_conversation_failure_string).toString(), new View.OnClickListener(this) { // from class: cuyn
                private final cuzo a;

                {
                    this.a = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.n();
                }
            });
        } else if (z2) {
        } else {
            this.x.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void q() {
        this.a.g();
        this.H = false;
    }

    public final void r(ctzc ctzcVar) {
        ctzd ctzdVar = ctzd.UNKNOWN;
        int ordinal = ctzcVar.a().ordinal();
        boolean z = false;
        if (ordinal == 1) {
            i(ctzcVar.b().a(), ctzcVar.b().b(), false);
        } else if (ordinal == 2) {
            this.a.setMessageCallbackPayload(ctzcVar.c().b());
            ((cuxb) this.c).a.setText(ctzcVar.c().a());
            this.a.setComposeBoxPrefillSuggestionTextMessage(ctzcVar.c().a());
        } else if (ordinal == 4) {
            this.M.a.b(ctzcVar.e(), dbsg.i(this.a.u()), this.a.v());
            cuwg.c(this.a);
        } else if (ordinal == 7) {
            Intent intent = new Intent("android.intent.action.DIAL");
            String valueOf = String.valueOf(ctzcVar.h());
            intent.setData(Uri.parse(valueOf.length() != 0 ? "tel:".concat(valueOf) : new String("tel:")));
            akm.i(this.a.getContext(), intent);
        } else if (ordinal == 8) {
            if (!this.O) {
                return;
            }
            String i = ctzcVar.i();
            cugi n = this.g.j(this.b, cuas.a(i), i, dbsg.i(i), dbpy.a, dcdn.r(this.w)).n();
            n.k(cuaw.a);
            ((ctct) this.g).x(this.i, n.a(), true);
        } else if (ordinal != 9) {
        } else {
            if (this.C.a()) {
                this.g.t(this.i, this.C.b());
                this.a.u().setVisibility(8);
            }
            if (!ctzcVar.f().b().a() || !this.P) {
                if (!ctzcVar.f().a().a()) {
                    return;
                }
                final cvfh cvfhVar = this.B;
                final cugq b = ctzcVar.f().a().b();
                if (this.a.w().getHeight() == this.a.w().getBottom()) {
                    z = true;
                }
                cvfhVar.a.a(b, z);
                cvfhVar.a.findViewById(R.id.dismiss_button).setOnClickListener(new View.OnClickListener(cvfhVar, b) { // from class: cvfe
                    private final cvfh a;
                    private final cugq b;

                    {
                        this.a = cvfhVar;
                        this.b = b;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        cvfh cvfhVar2 = this.a;
                        cvfhVar2.b(this.b);
                        cvfhVar2.a.setVisibility(8);
                    }
                });
                cvfhVar.a.findViewById(R.id.title).requestFocus();
                cvfhVar.a.findViewById(R.id.title).sendAccessibilityEvent(32768);
                cvfhVar.b.postDelayed(cvfhVar.c, TimeUnit.SECONDS.toMillis(b.e()));
                return;
            }
            final cvcn cvcnVar = this.M;
            cufz b2 = ctzcVar.f().b().b();
            final View v = this.a.v();
            final dbsg<cugq> a = ctzcVar.f().a();
            final OverlayView u = this.a.u();
            if (this.a.w().getHeight() == this.a.w().getBottom()) {
                z = true;
            }
            final boolean z2 = z;
            cvcnVar.d = new cvci(cvcnVar, v, a, z2, u) { // from class: cvcl
                private final cvcn a;
                private final View b;
                private final dbsg c;
                private final boolean d;
                private final OverlayView e;

                {
                    this.a = cvcnVar;
                    this.b = v;
                    this.c = a;
                    this.d = z2;
                    this.e = u;
                }

                @Override // defpackage.cvci
                public final void a() {
                    cvcn cvcnVar2 = this.a;
                    cvcnVar2.a.d(cvcnVar2.b, this.b, this.c, this.d, this.e);
                    cvcnVar2.c.d(true, false);
                }
            };
            cvcnVar.a.b.setPresenter(cvcnVar);
            cvcnVar.a.c(b2, v, a, cvcnVar.b, u, z, cvcnVar.c);
        }
    }

    public final void s() {
        deew.h(this.e.a(this.i, 1), new dbrn(this) { // from class: cuyp
            private final cuzo a;

            {
                this.a = this;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                cuzo cuzoVar = this.a;
                if (((Boolean) obj).booleanValue()) {
                    cuzoVar.g.p(cuzoVar.i);
                    return null;
                }
                return null;
            }
        }, dege.a);
    }

    public final void t(int i) {
        if (i == 0 || i == 1) {
            this.a.A();
            this.a.m();
            this.j.j(127);
        } else if (i == 2) {
            this.a.n();
            this.a.A();
        } else if (i == 3) {
            this.a.n();
            this.a.D();
            this.j.j(130);
        } else if (i != 4) {
        } else {
            this.a.n();
            this.a.z(new cvfp(this) { // from class: cuys
                private final cuzo a;

                {
                    this.a = this;
                }

                @Override // defpackage.cvfp
                public final void a() {
                    cuzo cuzoVar = this.a;
                    cuzoVar.a.m();
                    cuzoVar.a.A();
                    cuzoVar.g.m(cuzoVar.i);
                    cuzoVar.j.j(129);
                }
            });
            this.j.j(128);
        }
    }

    public final void u(String str, cuij cuijVar) {
        this.j.i(str, cuijVar);
    }

    @Override // defpackage.cuvu
    public final void z() {
        this.V = UUID.randomUUID();
        ctxp.a().b("ConversationPresenter::start", this.V);
        cuzv cuzvVar = this.j;
        cuzvVar.d = this.V;
        cuzvVar.b.clear();
        cuzvVar.c.clear();
        cuzvVar.f = SystemClock.elapsedRealtime();
        if (cuzvVar.e) {
            cuzvVar.e = false;
            cuzvVar.f();
        }
        cuzvVar.j(com.google.android.filament.R.styleable.AppCompatTheme_textAppearanceListItem);
        this.E = true;
        this.c.z();
        this.o.z();
        this.ac.z();
        v();
        this.al = this.g.e(this.i, this.b, null, 0, new cugt[]{cugt.OVERLAY});
        this.am.q(this.aq);
        this.l.q(this.ap);
        this.af.q(this.ar);
        this.an.q(this.as);
        this.al.q(this.ak);
        if (this.z.a()) {
            this.z.b().q(this.ao);
        }
        deew.h(this.e.a(this.i, 17), new dbrn(this) { // from class: cuyd
            private final cuzo a;

            {
                this.a = this;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                this.a.Q = ((Boolean) obj).booleanValue();
                return null;
            }
        }, dege.a);
        deew.h(this.e.a(this.i, 16), new dbrn(this) { // from class: cuye
            private final cuzo a;

            {
                this.a = this;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                this.a.P = ((Boolean) obj).booleanValue();
                return null;
            }
        }, dege.a);
        if (this.a.u().getVisibility() != 0 && !this.C.a()) {
            if (((AccessibilityManager) this.a.getContext().getSystemService("accessibility")).isEnabled()) {
                this.ah.postDelayed(this.ai, 100L);
            } else {
                ((View) this.a.o()).requestFocus();
            }
        }
        this.g.q(new csux(this) { // from class: cuyf
            private final cuzo a;

            {
                this.a = this;
            }

            @Override // defpackage.csux
            public final void L(int i) {
                this.a.t(i);
            }
        });
        if (dxzp.b()) {
            this.D.c(new Callable(this) { // from class: cuyg
                private final cuzo a;

                {
                    this.a = this;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    cuzo cuzoVar = this.a;
                    csue csueVar = cuzoVar.h;
                    ctyy ctyyVar = cuzoVar.i;
                    ConversationId conversationId = cuzoVar.b;
                    if ("GMM".equals(ctyyVar.e())) {
                        if (!csvo.a(((csxj) csueVar).h).g()) {
                            deha.a(true);
                            return null;
                        }
                    } else if ("GMB".equals(ctyyVar.e())) {
                        if (!csvo.a(((csxj) csueVar).h).h()) {
                            cstl.a("LitBstrpCntrl");
                            deha.a(true);
                            return null;
                        }
                    } else {
                        cstl.a("LitBstrpCntrl");
                        deha.a(true);
                        return null;
                    }
                    csxj csxjVar = (csxj) csueVar;
                    dbsg<byte[]> a = csxjVar.b.c(ctyyVar).a(csxj.c(conversationId));
                    if (!a.a()) {
                        ctoh.a(ctyyVar, csxjVar.e, 10100, 407);
                        deha.a(true);
                        return null;
                    }
                    String str = new String(a.b());
                    if ("BOOTSTRAP_TOKEN_FINISH_VALUE".equals(str)) {
                        deha.a(true);
                        return null;
                    }
                    ctoh.a(ctyyVar, csxjVar.e, 10100, true != str.isEmpty() ? 406 : 405);
                    csxjVar.g(ctyyVar, conversationId, str, true);
                    return null;
                }
            });
        }
    }
}
