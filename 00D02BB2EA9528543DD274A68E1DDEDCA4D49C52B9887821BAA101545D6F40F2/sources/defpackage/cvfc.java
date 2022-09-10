package defpackage;

import android.os.Handler;
import android.view.ViewGroup;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: cvfc  reason: default package */
/* loaded from: classes5.dex */
public final class cvfc extends cuwl<cved, acl> {
    public final Map<cvec, cvdu> g;
    public final dcdc<cvdu> h;
    public boolean i;
    int j;
    public final Handler k;
    public final abi l;
    private cvdt m;
    private final dbsg<cvct> n;
    private final cvef o;
    private final ctyy p;
    private final ConversationId q;
    private final csuf r;
    private final csuy s;
    private dcdc<cved> t;
    private final cvel u;

    public cvfc(cvdt cvdtVar, dcdc dcdcVar, dbsg dbsgVar, cvel cvelVar, cvef cvefVar, ctyy ctyyVar, ConversationId conversationId, csuf csufVar, csuy csuyVar) {
        super(new cveh());
        int i;
        this.g = new EnumMap(cvec.class);
        this.j = -1;
        this.k = new Handler();
        this.l = new cvez(this);
        this.m = cvdtVar;
        this.n = dbsgVar;
        this.u = cvelVar;
        this.o = cvefVar;
        this.p = ctyyVar;
        this.q = conversationId;
        this.r = csufVar;
        this.s = csuyVar;
        this.h = dcdcVar;
        int size = dcdcVar.size();
        int i2 = 0;
        while (i2 < size) {
            cvdu cvduVar = (cvdu) dcdcVar.get(i2);
            Iterator<cvec> it = cvduVar.d().iterator();
            while (true) {
                i = i2 + 1;
                if (it.hasNext()) {
                    this.g.put(it.next(), cvduVar);
                }
            }
            i2 = i;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0061  */
    @Override // defpackage.cuwl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int A(int r5) {
        /*
            r4 = this;
            java.lang.Object r5 = r4.b(r5)
            cved r5 = (defpackage.cved) r5
            cvec r0 = r5.b()
            cvec r1 = defpackage.cvec.MESSAGE_BUBBLE
            boolean r0 = r0.equals(r1)
            r1 = 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L68
            cvdt r0 = r4.m
            cvcy r5 = r5.a()
            dbsg r5 = r5.a()
            java.lang.Object r5 = r5.b()
            cugu r5 = (defpackage.cugu) r5
            cugm r2 = r5.f()
            int r2 = r2.a()
            r3 = 3
            if (r2 != r3) goto L50
            cugm r2 = r5.f()
            cugl r2 = r2.b()
            java.lang.String r2 = r2.a()
            java.util.Map<java.lang.String, java.lang.Integer> r3 = r0.c
            boolean r3 = r3.containsKey(r2)
            if (r3 == 0) goto L50
            java.util.Map<java.lang.String, java.lang.Integer> r5 = r0.c
            java.lang.Object r5 = r5.get(r2)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            goto L5d
        L50:
            cugm r5 = r5.f()
            int r5 = r5.a()
            int r0 = r5 + (-1)
            if (r5 == 0) goto L66
            r5 = r0
        L5d:
            if (r5 >= r1) goto L61
            r0 = 1
            goto L62
        L61:
            r0 = 0
        L62:
            defpackage.dbsk.l(r0)
            return r5
        L66:
            r5 = 0
            throw r5
        L68:
            cvec r5 = r5.b()
            int r5 = r5.f
            int r5 = r5 + r1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cvfc.A(int):int");
    }

    public final void C() {
        dcdc<cved> dcdcVar = this.t;
        if (dcdcVar != null) {
            a(dcdcVar);
        }
    }

    @Override // defpackage.cuwl, defpackage.tj
    public final void a(List<cved> list) {
        this.t = dcdc.r(list);
        super.a(dcdc.r(dcbg.b(list).o(new dbsl(this) { // from class: cvex
            private final cvfc a;

            {
                this.a = this;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                cvfc cvfcVar = this.a;
                cvec b = ((cved) obj).b();
                return b.equals(cvec.MESSAGE_BUBBLE) || b.equals(cvec.TYPING_INDICATOR) || cvfcVar.g.containsKey(b);
            }
        }).z()));
    }

    @Override // defpackage.abg
    public final /* bridge */ /* synthetic */ void m(acl aclVar) {
        final cuwk cuwkVar = (cuwk) aclVar;
        int i = this.j;
        if (i == -1 || i != cuwkVar.e()) {
            return;
        }
        cuwkVar.a.postDelayed(new Runnable(this, cuwkVar) { // from class: cvew
            private final cvfc a;
            private final cuwk b;

            {
                this.a = this;
                this.b = cuwkVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                cvfc cvfcVar = this.a;
                cuwk cuwkVar2 = this.b;
                if (cvfcVar.j == cuwkVar2.e()) {
                    cvfcVar.k.removeCallbacksAndMessages(null);
                    cvfcVar.j = -1;
                    cuwkVar2.a.requestFocus();
                    cuwkVar2.a.sendAccessibilityEvent(8);
                }
            }
        }, 750L);
    }

    @Override // defpackage.cuwl
    public final acl y(ViewGroup viewGroup, int i) {
        cvds cvdrVar;
        if (i < 1024) {
            cvcv cvcvVar = new cvcv(viewGroup.getContext());
            if (this.n.a()) {
                cvcvVar.setLabelTextStyleProvider(this.n.b().a());
            }
            cvdt cvdtVar = this.m;
            if (cvdtVar.d.get(i) != null) {
                cumr cumrVar = cvdtVar.d.get(i);
                culc culcVar = new culc(cvcvVar.getContext());
                culcVar.setUriLoader(cumrVar.b);
                culcVar.setPhotoClickListener(cumrVar.a);
                cvdrVar = new cvds(culcVar);
            } else {
                cvdf cvdfVar = new cvdf(cvcvVar.getContext());
                cvdfVar.setConversationVisualElementEventListener(cvdtVar.a);
                dbsg<cvdd> dbsgVar = cvdtVar.b;
                cvdfVar.setRichTextEnabled(cvdtVar.e);
                cvdfVar.setLinkClickLoggingEnabled(cvdtVar.f);
                cvdfVar.setCopyEnabled(cvdtVar.g);
                cvdrVar = new cvdr(cvdfVar);
            }
            cvcvVar.setContentView(cvdrVar.a);
            cvcvVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            cvcs cvcsVar = new cvcs(cvcvVar);
            cvcsVar.d = this.u;
            return new cvfa(cvcvVar, cvdrVar, cvcsVar);
        }
        int i2 = i - 1024;
        if (i2 == cvec.TYPING_INDICATOR.f) {
            cvge cvgeVar = new cvge(viewGroup.getContext());
            return new cvfb(cvgeVar, new cvgb(cvgeVar, this.p, this.q, this.r, this.s));
        }
        cvec a = cvec.a(i2);
        return this.g.get(a).e(viewGroup, a);
    }

    @Override // defpackage.cuwl
    public final void z(acl aclVar, int i) {
        cved b = b(i);
        cvec b2 = b.b();
        if (b2.equals(cvec.MESSAGE_BUBBLE)) {
            cvcy a = b.a();
            cvfa cvfaVar = (cvfa) aclVar;
            cvfaVar.s.a.a(a.a().b());
            cvcs cvcsVar = cvfaVar.t;
            cvcsVar.b = a;
            cvcsVar.c = new cuvd(((cvcv) cvcsVar.a).f, a.b());
            cvfaVar.t.z();
        } else if (b2.equals(cvec.TYPING_INDICATOR)) {
            cvfb cvfbVar = (cvfb) aclVar;
            cvfbVar.s.A();
            cvfbVar.s.z();
        } else {
            this.g.get(b2).f(aclVar, b, this.p);
        }
        int ordinal = b.b().ordinal();
        if (ordinal == 0) {
            dbsg<cugu> a2 = b.a().a();
            final cvef cvefVar = this.o;
            cvefVar.getClass();
            cstn.a(a2, new mw(cvefVar) { // from class: cvet
                private final cvef a;

                {
                    this.a = cvefVar;
                }

                @Override // defpackage.mw
                public final void a(Object obj) {
                    this.a.a((cugu) obj);
                }
            });
        } else if (ordinal == 2) {
            dbsg<cugu> a3 = b.c().a();
            final cvef cvefVar2 = this.o;
            cvefVar2.getClass();
            cstn.a(a3, new mw(cvefVar2) { // from class: cveu
                private final cvef a;

                {
                    this.a = cvefVar2;
                }

                @Override // defpackage.mw
                public final void a(Object obj) {
                    this.a.a((cugu) obj);
                }
            });
        } else if (ordinal != 3) {
        } else {
            dbsg<cugu> a4 = b.e().a();
            final cvef cvefVar3 = this.o;
            cvefVar3.getClass();
            cstn.a(a4, new mw(cvefVar3) { // from class: cvev
                private final cvef a;

                {
                    this.a = cvefVar3;
                }

                @Override // defpackage.mw
                public final void a(Object obj) {
                    this.a.a((cugu) obj);
                }
            });
        }
    }
}
