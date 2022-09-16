package defpackage;

import android.content.Context;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: jvw  reason: default package */
/* loaded from: classes3.dex */
public final class jvw extends aios implements ynl {
    public jvn a;
    private final afvn e;
    private final azqb f;
    private final aiow g;
    private final snc h;
    private final aadd i;
    private final boolean j;
    private boolean k;

    public jvw(Context context, aijf aijfVar, afvn afvnVar, azqb azqbVar, aiow aiowVar, snc sncVar, aacz aaczVar, aadd aaddVar) {
        super(context, aijfVar);
        this.e = afvnVar;
        this.f = azqbVar;
        this.g = aiowVar;
        this.h = sncVar;
        this.i = aaddVar;
        asxj asxjVar = aaczVar.b().e;
        boolean z = (asxjVar == null ? asxj.a : asxjVar).an;
        this.j = z;
        this.k = false;
        g();
        if (!z) {
            n(0L);
        }
    }

    private final long m() {
        return TimeUnit.MILLISECONDS.toSeconds(this.h.c());
    }

    private final void n(long j) {
        if (this.e.t()) {
            ylx.m(this.g.a.b(new wdy(aiow.b(this.e.c(), "playability_adult_confirmation_time_stamp"), j, 5)), aiuv.b);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aios
    public final void b(asaa asaaVar, yiw yiwVar, String str) {
        aiou j = j();
        if (j == null) {
            aiot.a(yiwVar, h(asaaVar, str));
        } else {
            ((afwc) this.f.get()).c(j.a(), null, new jvv(this, asaaVar, yiwVar, str));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aios
    public final void c(asaa asaaVar, yiw yiwVar, String str) {
        aqft d = aijr.d(asaaVar);
        jvn jvnVar = this.a;
        if (jvnVar == null || d == null) {
            super.c(asaaVar, yiwVar, str);
            return;
        }
        jvnVar.f = aijr.d(asaaVar);
        jvu jvuVar = new jvu(this, asaaVar, yiwVar, str);
        jvnVar.d.oi().D(new acte(jvnVar.f.n));
        jvnVar.g = ajgx.g(jvnVar.a, jvnVar.f, jvnVar.c, jvnVar.d.oi(), jvnVar.e, false, false, new jvm(jvnVar, jvuVar), null);
        l(jvnVar);
    }

    @Override // defpackage.aios
    protected final void d() {
        this.k = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aios
    public final void e() {
        if (this.e.t()) {
            this.g.e(this.e.c(), true);
        }
        if (this.j) {
            n(m());
            this.k = true;
        }
    }

    public final void g() {
        ankt q;
        if (this.e.t()) {
            q = this.g.a(this.e.c());
        } else {
            q = anlz.q(false);
        }
        this.b = q;
        this.c = false;
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                afwb afwbVar = (afwb) obj;
                g();
                return null;
            } else if (i == 1) {
                afwd afwdVar = (afwd) obj;
                g();
                return null;
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        }
        return new Class[]{afwb.class, afwd.class};
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
    @Override // defpackage.aios, defpackage.aimx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void rj(defpackage.aina r9) {
        /*
            r8 = this;
            boolean r0 = r8.j
            if (r0 == 0) goto L7c
            boolean r0 = r8.k
            if (r0 != 0) goto L7c
            long r0 = r8.m()
            aadd r2 = r8.i
            arhd r2 = r2.a()
            asxp r2 = r2.e
            if (r2 != 0) goto L18
            asxp r2 = defpackage.asxp.a
        L18:
            int r2 = r2.O
            afvn r3 = r8.e
            boolean r3 = r3.t()
            r4 = 0
            if (r3 == 0) goto L50
            aiow r3 = r8.g
            afvn r6 = r8.e
            afvm r6 = r6.c()
            java.lang.String r7 = "playability_adult_confirmation_time_stamp"
            java.lang.String r6 = defpackage.aiow.b(r6, r7)
            yve r3 = r3.a
            aoqu r3 = r3.c()
            awvh r3 = (defpackage.awvh) r3
            r6.getClass()
            aoqp r3 = r3.e
            boolean r7 = r3.containsKey(r6)
            if (r7 == 0) goto L50
            java.lang.Object r3 = r3.get(r6)
            java.lang.Long r3 = (java.lang.Long) r3
            long r6 = r3.longValue()
            goto L51
        L50:
            r6 = r4
        L51:
            if (r2 < 0) goto L5a
            long r0 = r0 - r6
            long r2 = (long) r2
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L7c
            goto L5e
        L5a:
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 != 0) goto L7c
        L5e:
            afvn r0 = r8.e
            boolean r0 = r0.t()
            r1 = 0
            if (r0 == 0) goto L72
            aiow r0 = r8.g
            afvn r2 = r8.e
            afvm r2 = r2.c()
            r0.e(r2, r1)
        L72:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            ankt r0 = defpackage.anlz.q(r0)
            r8.b = r0
        L7c:
            super.rj(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jvw.rj(aina):void");
    }
}
