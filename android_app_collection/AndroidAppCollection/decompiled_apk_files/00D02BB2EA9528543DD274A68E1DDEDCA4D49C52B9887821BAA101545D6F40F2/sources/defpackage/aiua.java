package defpackage;

import android.content.Context;
import android.content.res.Resources;
import java.text.DateFormat;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: aiua  reason: default package */
/* loaded from: classes2.dex */
public final class aiua implements aiqv {
    public static final long a = TimeUnit.MINUTES.toMillis(30);
    @dzsi
    private aitt A;
    public final Context b;
    public final cpv c;
    public dbsg<aink> d;
    private final aito e;
    private final Resources f;
    private final cqat g;
    private final ajsc h;
    private final cqhn i;
    private final DateFormat j;
    private final bvsl k;
    private final bvjj l;
    private final aitz m;
    private boolean n;
    private dkog o;
    private boolean p = false;
    private boolean q = false;
    private boolean r = false;
    private final cqfd s;
    @dzsi
    private aitu t;
    @dzsi
    private aitq u;
    @dzsi
    private aity v;
    @dzsi
    private aitp w;
    @dzsi
    private aitv x;
    @dzsi
    private aitw y;
    @dzsi
    private aitx z;

    public aiua(dbsg<aink> dbsgVar, aito aitoVar, Resources resources, cqat cqatVar, ajsc ajscVar, cqhn cqhnVar, bvjj bvjjVar, dkog dkogVar, bvsl bvslVar, DateFormat dateFormat, @dzsi akqq akqqVar, Context context, aitz aitzVar, cpv cpvVar, cqhu cqhuVar, boolean z) {
        this.e = aitoVar;
        this.f = resources;
        this.g = cqatVar;
        this.h = ajscVar;
        this.i = cqhnVar;
        this.l = bvjjVar;
        this.o = dkogVar;
        this.k = bvslVar;
        this.j = dateFormat;
        this.d = dbsgVar;
        this.m = aitzVar;
        this.n = z;
        this.b = context;
        this.c = cpvVar;
        w(dbsgVar, akqqVar);
        this.s = new aitn(this);
    }

    public static eapd v(cqat cqatVar) {
        return new eapd(cqatVar.b());
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x008e, code lost:
        if (r2 != false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void w(defpackage.dbsg<defpackage.aink> r20, @defpackage.dzsi defpackage.akqq r21) {
        /*
            Method dump skipped, instructions count: 559
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aiua.w(dbsg, akqq):void");
    }

    private static boolean x(aink ainkVar, dkog dkogVar, bvjj bvjjVar, cqat cqatVar) {
        if (ainkVar.d().isEmpty()) {
            return false;
        }
        dbsg<ahvg> d = ainkVar.l().d(ainkVar.m());
        if (!d.a()) {
            return false;
        }
        dnol dnolVar = d.b().b().d;
        if (dnolVar == null) {
            dnolVar = dnol.g;
        }
        int i = dnolVar.a & 64;
        if (!dkogVar.u || i == 0 || Math.abs(bvjjVar.w(bvjk.gB, 0L)) >= a) {
            return false;
        }
        int offset = TimeZone.getDefault().getOffset(cqatVar.b());
        dnol dnolVar2 = d.b().b().d;
        if (dnolVar2 == null) {
            dnolVar2 = dnol.g;
        }
        return offset != dnolVar2.f;
    }

    @Override // defpackage.aiqv
    @dzsi
    public aiui a() {
        return this.y;
    }

    @Override // defpackage.aiqv
    @dzsi
    public aipc b() {
        return this.u;
    }

    @Override // defpackage.aiqv
    @dzsi
    public aius c() {
        if (this.o.v) {
            return this.z;
        }
        return null;
    }

    @Override // defpackage.aiqv
    @dzsi
    public aivg d() {
        return this.v;
    }

    @Override // defpackage.aiqv
    @dzsi
    public aipo e() {
        return this.t;
    }

    @Override // defpackage.aiqv
    @dzsi
    public aipv f() {
        return this.x;
    }

    @Override // defpackage.aiqv
    @dzsi
    public aiph g() {
        return this.A;
    }

    @Override // defpackage.aiqv
    @dzsi
    public aiot h() {
        return this.w;
    }

    @Override // defpackage.aiqv
    @dzsi
    public aipk i() {
        return null;
    }

    @Override // defpackage.aiqv
    public Boolean j() {
        if (this.d.a()) {
            this.d.b().k();
        }
        return false;
    }

    @Override // defpackage.aiqv
    public Boolean k() {
        boolean z = true;
        if (this.d.a() && !this.d.b().z()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.aiqv
    public Boolean l() {
        boolean z = false;
        if (!this.r && this.p) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.aiqv
    public Boolean m() {
        return Boolean.valueOf(this.r);
    }

    @Override // defpackage.aiqv
    public Boolean n() {
        return Boolean.valueOf(this.q);
    }

    @Override // defpackage.aiqv
    public cqfd o() {
        return this.s;
    }

    public void p(boolean z) {
        if (this.p != z) {
            this.p = z;
            cqkx.p(this);
        }
    }

    public void q() {
        aitw aitwVar = this.y;
        if (aitwVar != null) {
            cqkx.p(aitwVar);
        }
        aity aityVar = this.v;
        if (aityVar != null) {
            cqkx.p(aityVar);
        }
        if (this.A == null || !this.d.a()) {
            return;
        }
        if (!x(this.d.b(), this.o, this.l, this.g)) {
            this.A = null;
            cqkx.p(this);
            return;
        }
        aitt aittVar = this.A;
        dbsk.s(aittVar);
        cqkx.p(aittVar);
    }

    public void r(boolean z) {
        if (this.r != z) {
            this.r = z;
            cqkx.p(this);
        }
    }

    public void s(boolean z) {
        if (this.q != z) {
            this.q = z;
            cqkx.p(this);
        }
    }

    public void t() {
        this.d = dbpy.a;
        cqkx.p(this);
    }

    public void u(aink ainkVar, dkog dkogVar, @dzsi akqq akqqVar, boolean z) {
        boolean z2 = true;
        boolean z3 = !this.d.a() || !this.d.b().equals(ainkVar);
        if (this.n != z) {
            this.n = z;
            z3 = true;
        }
        if (!this.o.equals(dkogVar)) {
            this.o = dkogVar;
        } else {
            z2 = z3;
        }
        w(dbsg.i(ainkVar), akqqVar);
        if (z2) {
            cqkx.p(this);
        }
    }
}
