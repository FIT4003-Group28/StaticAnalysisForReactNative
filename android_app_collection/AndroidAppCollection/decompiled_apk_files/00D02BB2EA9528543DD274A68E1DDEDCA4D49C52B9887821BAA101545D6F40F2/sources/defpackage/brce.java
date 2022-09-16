package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: brce  reason: default package */
/* loaded from: classes4.dex */
public final class brce implements brlm {
    public final broq a;
    public final brmt b;
    public final bwrs<brlu> c;
    public boolean d = false;
    public boolean e = false;
    @dzsi
    private final brbw f;
    @dzsi
    private final ixr g;
    private final Activity h;
    private final btvo i;
    private final brcs j;
    private final brdi k;
    private final aehr l;
    private final akox m;
    private final dzsj<aeht> n;
    private final braw o;
    private final jkj p;
    private final bwrs<brln> q;

    public brce(Activity activity, btvo btvoVar, broq broqVar, akox akoxVar, aehr aehrVar, dzsj dzsjVar, brdi brdiVar, brcs brcsVar, jkj jkjVar, braw brawVar, bwrs bwrsVar, bwrs bwrsVar2, brbw brbwVar, ixr ixrVar, brmt brmtVar) {
        this.h = activity;
        this.i = btvoVar;
        this.j = brcsVar;
        this.k = brdiVar;
        this.l = aehrVar;
        this.n = dzsjVar;
        this.m = akoxVar;
        this.f = brbwVar;
        this.a = broqVar;
        this.g = ixrVar;
        this.q = bwrsVar;
        this.o = brawVar;
        this.c = bwrsVar2;
        this.b = brmtVar;
        this.p = jkjVar;
    }

    @Override // defpackage.brlm
    public final void a(brln brlnVar) {
        if (!this.e) {
            return;
        }
        brlu e = e();
        e.L(brlnVar.e, this.h.getApplication(), false);
        dwix dwixVar = brlnVar.b().w;
        if (dwixVar == null) {
            dwixVar = dwix.h;
        }
        e.W(dwixVar);
        if (e.g() > 0 && !e.p()) {
            e.s(0);
        }
        if (!brlnVar.b().A) {
            brbo.a(this.o, e);
        }
        e.am(false);
        e.ai(false);
        this.c.d(e);
        ixr ixrVar = this.g;
        if (ixrVar != null) {
            ixrVar.ag(false);
        }
        brlnVar.e = e;
        this.q.d(brlnVar);
    }

    @Override // defpackage.brlm
    public final void b(brln brlnVar, bttq bttqVar) {
        brlu e = e();
        e.am(false);
        e.ai(false);
        e.ao(bttqVar);
        this.c.d(e);
        ixr ixrVar = this.g;
        if (ixrVar != null) {
            ixrVar.ag(false);
        }
    }

    @Override // defpackage.brlm
    public final void c(brln brlnVar) {
        brlu e = e();
        e.am(false);
        e.ai(false);
        this.c.d(e);
        ixr ixrVar = this.g;
        if (ixrVar != null) {
            ixrVar.ag(false);
        }
    }

    public final brln d() {
        brln c = this.q.c();
        dbsk.s(c);
        return c;
    }

    public final brlu e() {
        brlu c = this.c.c();
        dbsk.s(c);
        return c;
    }

    public final void f(@dzsi djnk djnkVar, @dzsi dwix dwixVar, boolean z, @dzsi cjqm cjqmVar, ddda dddaVar) {
        cjsb cjsbVar = new cjsb();
        cjsbVar.h(dddaVar.b);
        g(djnkVar, dwixVar, z, cjsbVar, cjqmVar == null ? null : cjqmVar.a().f());
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x007f, code lost:
        if (r9.bK().equals(r19) == false) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0514  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x052d  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x053e  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0563  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x057a  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0597  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x05b9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:211:0x05c3  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x05da  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0604  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x061b  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0636  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0646  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x065c  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0677  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0680  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x068f  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0693  */
    /* JADX WARN: Removed duplicated region for block: B:251:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(@defpackage.dzsi defpackage.djnk r18, @defpackage.dzsi defpackage.dwix r19, boolean r20, defpackage.cjsb r21, @defpackage.dzsi java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 1687
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.brce.g(djnk, dwix, boolean, cjsb, java.lang.String):void");
    }
}
