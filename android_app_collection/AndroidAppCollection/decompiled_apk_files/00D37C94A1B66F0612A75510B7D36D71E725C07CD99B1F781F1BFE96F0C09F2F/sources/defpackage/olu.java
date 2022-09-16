package defpackage;

import com.google.android.apps.youtube.app.common.ui.systemui.PipWindowInsetsHelper;
/* compiled from: PG */
/* renamed from: olu  reason: default package */
/* loaded from: classes3.dex */
public final class olu implements ezg, ynl {
    private final yni b;
    private final ghd c;
    private final PipWindowInsetsHelper d;
    private final yzm e;
    private final adoa f;
    private final airr g;
    private final ezh h;
    private final ofs i;
    private final aadd j;
    private final axxu k;
    private final ofu l;
    private final olv o;
    private ezx m = ezx.NONE;
    public gfn a = gfn.DISABLE_FULLSCREEN;
    private boolean n = false;

    public olu(yni yniVar, ghd ghdVar, PipWindowInsetsHelper pipWindowInsetsHelper, yzm yzmVar, adoa adoaVar, airr airrVar, ezh ezhVar, ofs ofsVar, aadd aaddVar, axxu axxuVar, ofu ofuVar, olv olvVar) {
        this.b = yniVar;
        this.c = ghdVar;
        this.d = pipWindowInsetsHelper;
        this.e = yzmVar;
        this.f = adoaVar;
        this.g = airrVar;
        this.h = ezhVar;
        this.i = ofsVar;
        this.j = aaddVar;
        this.k = axxuVar;
        this.l = ofuVar;
        this.o = olvVar;
        yniVar.g(this);
        ezhVar.i(this);
        olvVar.a.as(new ayqb() { // from class: olt
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                olu oluVar = olu.this;
                oluVar.a = (gfn) obj;
                oluVar.a();
            }
        });
        ofuVar.t(new ols(this));
    }

    private final void d() {
        if (!this.h.g().b() || this.n || this.g.R() || !e()) {
            return;
        }
        this.e.k(0);
    }

    private final boolean e() {
        return this.f.e() == null;
    }

    public final void a() {
        b(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
        if (r0.a != false) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(boolean r6) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.olu.b(boolean):void");
    }

    public final void c(boolean z) {
        if (this.c.isInMultiWindowMode()) {
            return;
        }
        this.n = z;
        if (!z) {
            d();
        } else if (!this.h.g().b() || this.e.n() == 4) {
        } else {
            this.e.k(1);
        }
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                c(((ahhv) obj).a);
                return null;
            } else if (i == 1) {
                ahhy ahhyVar = (ahhy) obj;
                c(false);
                return null;
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        }
        return new Class[]{ahhv.class, ahhy.class};
    }

    @Override // defpackage.ezg
    public final void pa(ezx ezxVar) {
        if (!ezxVar.l()) {
            this.m = ezxVar;
        }
        a();
    }

    @Override // defpackage.ezg
    public final /* synthetic */ void pb(ezx ezxVar, ezx ezxVar2) {
        hqb.m(this, ezxVar2);
    }
}
