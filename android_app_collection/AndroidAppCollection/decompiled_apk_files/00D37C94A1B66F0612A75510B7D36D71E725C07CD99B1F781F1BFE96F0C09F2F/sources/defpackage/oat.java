package defpackage;

import android.support.v7.widget.RecyclerView;
/* compiled from: PG */
/* renamed from: oat  reason: default package */
/* loaded from: classes3.dex */
public final class oat extends ne implements nqj, ezg, oar {
    public final nml a;
    public final oas b;
    public final ezh c;
    public final RecyclerView d;
    public boolean e;
    private final int f;
    private final xw g;
    private final oeg h;
    private final ody i;
    private final feu j;
    private final ajzq k;
    private String l;

    public oat(int i, nml nmlVar, oas oasVar, ezh ezhVar, oeg oegVar, ody odyVar, feu feuVar, RecyclerView recyclerView, ajzq ajzqVar) {
        this.f = i;
        nmlVar.getClass();
        this.a = nmlVar;
        oasVar.getClass();
        this.b = oasVar;
        ezhVar.getClass();
        this.c = ezhVar;
        oegVar.getClass();
        this.h = oegVar;
        feuVar.getClass();
        this.j = feuVar;
        this.i = odyVar;
        recyclerView.getClass();
        this.d = recyclerView;
        xw xwVar = recyclerView.n;
        xwVar.getClass();
        this.g = xwVar;
        ajzqVar.getClass();
        this.k = ajzqVar;
    }

    public final void a() {
        String str = this.l;
        if (str == null) {
            return;
        }
        this.j.b(str);
        this.l = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0075, code lost:
        if (r3.v() == false) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            r9 = this;
            java.lang.String r0 = r9.l
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L8
            r0 = 0
            goto L9
        L8:
            r0 = 1
        L9:
            nml r3 = r9.a
            nmc r3 = r3.c()
            oas r4 = r9.b
            int r4 = r4.b
            boolean r4 = defpackage.oas.f(r4)
            if (r4 == 0) goto L78
            ezh r4 = r9.c
            ezx r4 = r4.g()
            ezx r5 = defpackage.ezx.WATCH_WHILE_MAXIMIZED
            if (r4 == r5) goto L31
            ezh r4 = r9.c
            ezx r4 = r4.g()
            ezx r5 = defpackage.ezx.WATCH_WHILE_MINIMIZED
            if (r4 != r5) goto L78
            boolean r4 = r9.e
            if (r4 == 0) goto L78
        L31:
            xw r4 = r9.g
            android.view.View r4 = r4.S(r2)
            xw r5 = r9.g
            android.view.View r5 = r5.S(r1)
            ajzq r6 = r9.k
            ajrj r6 = r6.e
            ody r7 = r9.i
            ajsm r7 = r7.a
            if (r6 == 0) goto L5a
            int r8 = r7.size()
            if (r8 <= 0) goto L5a
            java.lang.Object r6 = r6.c(r2)
            java.lang.Object r7 = r7.get(r2)
            if (r6 != r7) goto L5a
            if (r5 == 0) goto L5a
            r4 = r5
        L5a:
            if (r4 == 0) goto L79
            int r4 = r4.getTop()
            int r5 = r9.f
            int r5 = -r5
            if (r4 < r5) goto L79
            oeg r4 = r9.h
            r5 = 8
            boolean r4 = r4.k(r5)
            if (r4 == 0) goto L78
            if (r3 == 0) goto L78
            boolean r3 = r3.v()
            if (r3 == 0) goto L78
            goto L79
        L78:
            r1 = 0
        L79:
            if (r0 != r1) goto L7c
            return
        L7c:
            if (r1 == 0) goto L87
            feu r0 = r9.j
            java.lang.String r0 = r0.a()
            r9.l = r0
            return
        L87:
            r9.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oat.b():void");
    }

    @Override // defpackage.oar
    public final void e(int i, int i2) {
        boolean h = oas.h(i);
        boolean h2 = oas.h(i2);
        if (!h && h2) {
            this.c.i(this);
        } else if (!h || h2) {
        } else {
            this.c.j(this);
        }
    }

    @Override // defpackage.nqj
    public final void g(nmc nmcVar) {
        if (nmcVar instanceof nkh) {
            ((nkh) nmcVar).i(this);
        }
        b();
    }

    @Override // defpackage.ne
    public final void j(RecyclerView recyclerView, int i, int i2) {
        b();
    }

    @Override // defpackage.ezg
    public final void pa(ezx ezxVar) {
        b();
    }

    @Override // defpackage.ezg
    public final /* synthetic */ void pb(ezx ezxVar, ezx ezxVar2) {
        hqb.m(this, ezxVar2);
    }
}
