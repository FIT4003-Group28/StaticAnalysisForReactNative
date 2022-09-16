package defpackage;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: azcc  reason: default package */
/* loaded from: classes3.dex */
public class azcc implements View.OnTouchListener, azbc {
    private static final dcqe j = dcqe.c("azcc");
    public final aymh a;
    public final aydl b;
    @dzsi
    public final baad c;
    public boolean d;
    public int e = 0;
    public Long f = 0L;
    public boolean g;
    public String h;
    @dzsi
    public baal i;
    private final cjqy k;
    private final cjtd l;
    private final axxb m;
    private final ges n;
    private final axwo o;
    private final axwi p;
    private final axze q;
    private final cqkj r;
    private final gga s;
    private final String t;
    private boolean u;
    private String v;

    public azcc(gga ggaVar, cqkj cqkjVar, cjqy cjqyVar, axxb axxbVar, aymh aymhVar, axwo axwoVar, axwi axwiVar, axze axzeVar, aydl aydlVar, ges gesVar, @dzsi baad baadVar, ilo iloVar, cjtd cjtdVar) {
        this.v = "";
        this.i = null;
        this.s = ggaVar;
        this.k = cjqyVar;
        this.r = cqkjVar;
        this.m = axxbVar;
        this.a = aymhVar;
        this.l = cjtdVar;
        this.n = gesVar;
        this.o = axwoVar;
        this.p = axwiVar;
        this.q = axzeVar;
        this.b = aydlVar;
        this.g = false;
        this.c = baadVar;
        if (baadVar != null) {
            this.t = baadVar.E(ggaVar);
            azxb f = azxb.f(iloVar.ai(), iloVar.aj());
            dbsk.s(baadVar);
            if (baadVar.h(f)) {
                this.u = true;
                this.d = true;
                baal d = baadVar.d(f);
                this.i = d;
                dbsk.s(d);
                this.v = d.c();
                this.g = true;
            } else {
                this.u = false;
                this.d = false;
                this.i = axwiVar.d(baadVar, iloVar);
            }
            dbsk.s(baadVar);
            this.h = aymhVar.j(baadVar).toString();
            return;
        }
        this.t = ggaVar.getString(R.string.DEFAULT_LIST_STARRED_PLACES);
        boolean bN = iloVar.bN();
        this.u = bN;
        this.d = bN;
        this.g = false;
        bvqj.c(axxbVar.e(), new bvqg(this) { // from class: azbw
            private final azcc a;

            {
                this.a = this;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                azcc azccVar = this.a;
                azccVar.e = ((Integer) obj).intValue();
                azccVar.h = azccVar.a.d(drcs.PRIVATE, azccVar.e).toString();
            }
        }, dege.a);
        bvqj.c(axxbVar.f(), new bvqg(this) { // from class: azbx
            private final azcc a;

            {
                this.a = this;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                this.a.f = (Long) obj;
            }
        }, dege.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void s() {
        /*
            r6 = this;
            baad r0 = r6.c
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L67
            baal r0 = r6.i
            defpackage.dbsk.s(r0)
            java.lang.String r0 = r0.c()
            boolean r0 = defpackage.dbsj.d(r0)
            if (r0 != 0) goto L67
            iii r0 = new iii
            r0.<init>()
            gga r3 = r6.s
            r4 = 2131956886(0x7f131496, float:1.955034E38)
            java.lang.String r3 = r3.getString(r4)
            r0.a = r3
            gga r3 = r6.s
            r4 = 2131956885(0x7f131495, float:1.9550338E38)
            java.lang.String r3 = r3.getString(r4)
            r0.b = r3
            gga r3 = r6.s
            r4 = 2131956884(0x7f131494, float:1.9550336E38)
            java.lang.String r3 = r3.getString(r4)
            azby r4 = new azby
            r4.<init>(r6)
            ddho r5 = defpackage.dtyb.E
            cjtd r5 = defpackage.cjtd.a(r5)
            r0.d(r3, r4, r5)
            gga r3 = r6.s
            r4 = 2131956883(0x7f131493, float:1.9550334E38)
            java.lang.String r3 = r3.getString(r4)
            android.view.View$OnClickListener r4 = defpackage.azbz.a
            ddho r5 = defpackage.dtyb.D
            cjtd r5 = defpackage.cjtd.a(r5)
            r0.c(r3, r4, r5)
            gga r3 = r6.s
            cqkj r4 = r6.r
            iij r0 = r0.a(r3, r4)
            r0.k()
            goto L8e
        L67:
            r6.g = r1
            boolean r0 = r6.d
            r0 = r0 ^ r2
            r6.d = r0
            baad r3 = r6.c
            if (r3 == 0) goto L7e
            if (r0 == 0) goto L7e
            baal r0 = r6.i
            defpackage.dbsk.s(r0)
            r3.b(r0)
            r6.g = r2
        L7e:
            baad r0 = r6.c
            if (r0 == 0) goto L8e
            boolean r3 = r6.d
            if (r3 != 0) goto L8e
            baal r3 = r6.i
            defpackage.dbsk.s(r3)
            r0.e(r3)
        L8e:
            cjtd r0 = r6.l
            baad r3 = r6.c
            if (r3 == 0) goto Lbd
            baab r4 = defpackage.baab.FAVORITES
            baab r4 = r3.o()
            int r4 = r4.ordinal()
            if (r4 == 0) goto Lba
            if (r4 == r2) goto Lb7
            r5 = 5
            if (r4 == r5) goto Lb4
            java.lang.Object[] r2 = new java.lang.Object[r2]
            baab r3 = r3.o()
            r2[r1] = r3
            java.lang.String r1 = "Unsupported list type '%s'."
            defpackage.bvoo.h(r1, r2)
            r1 = 0
            goto Lbf
        Lb4:
            ddho r1 = defpackage.dtyb.q
            goto Lbf
        Lb7:
            ddho r1 = defpackage.dtyb.G
            goto Lbf
        Lba:
            ddho r1 = defpackage.dtyb.u
            goto Lbf
        Lbd:
            ddho r1 = defpackage.dtyb.F
        Lbf:
            cjtd r0 = t(r0, r1)
            if (r0 == 0) goto Ld0
            cjqy r1 = r6.k
            boolean r2 = r6.d
            cjtd r0 = defpackage.cjqg.a(r2, r0)
            r1.i(r0)
        Ld0:
            defpackage.cqkx.p(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azcc.s():void");
    }

    @dzsi
    private static cjtd t(cjtd cjtdVar, @dzsi ddho ddhoVar) {
        if (ddhoVar != null) {
            cjta b = cjtd.b();
            b.b = cjtdVar.e;
            b.g(cjtdVar.d);
            b.d = ddhoVar;
            return b.a();
        }
        return null;
    }

    @Override // defpackage.azbc
    public jic a() {
        baad baadVar = this.c;
        if (baadVar != null) {
            return baadVar.a();
        }
        return baam.e(baab.STARRED_PLACES);
    }

    @Override // defpackage.azbc
    public String b() {
        return this.t;
    }

    @Override // defpackage.azbc
    public String c() {
        return this.h;
    }

    @Override // defpackage.azbc
    public Boolean d() {
        return Boolean.valueOf(this.d);
    }

    @Override // defpackage.azbc
    @dzsi
    public baad e() {
        return this.c;
    }

    @Override // defpackage.azbc
    public View.OnTouchListener f() {
        return this;
    }

    @Override // defpackage.azbc
    public cqkl g() {
        s();
        return cqkl.a;
    }

    @Override // defpackage.azbc
    public String h() {
        if (this.d) {
            return this.s.getString(R.string.SAVED_IN_LIST_ON_SAVE_MENU, new Object[]{b()});
        }
        return this.s.getString(R.string.UNSAVED_IN_LIST_ON_SAVE_MENU, new Object[]{b()});
    }

    @Override // defpackage.azbc
    public Long i() {
        baad baadVar = this.c;
        return baadVar != null ? Long.valueOf(baadVar.ah()) : this.f;
    }

    @Override // defpackage.azbc
    public String j() {
        baal baalVar = this.i;
        return baalVar != null ? baalVar.c() : "";
    }

    @Override // defpackage.azbc
    public CharSequence k() {
        return this.s.getString(R.string.SAVE_TO_LIST_ADD_NOTE_HINT, new Object[]{this.t});
    }

    @Override // defpackage.azbc
    public Boolean l() {
        return Boolean.valueOf(this.g);
    }

    @Override // defpackage.azbc
    public Boolean m() {
        baal baalVar;
        boolean z = false;
        if (this.u != this.d || ((baalVar = this.i) != null && !baalVar.c().equals(this.v))) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.azbc
    public cjtd n() {
        cjtd t = t(this.l, dtyb.o);
        dbsk.s(t);
        return t;
    }

    @Override // defpackage.azbc
    public cqkl o() {
        baal baalVar = this.i;
        if (baalVar != null) {
            this.o.b(this.n, baalVar);
        }
        return cqkl.a;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 1 || !p().booleanValue()) {
            return false;
        }
        s();
        return true;
    }

    @Override // defpackage.azbc
    public Boolean p() {
        return true;
    }

    @Override // defpackage.azbc
    public Float q() {
        return Float.valueOf(true != p().booleanValue() ? 0.4f : 1.0f);
    }

    @Override // defpackage.azbc
    @dzsi
    public aydl r() {
        baad baadVar = this.c;
        if (baadVar == null || !baadVar.C()) {
            return null;
        }
        this.b.i(false);
        this.b.h(this.c.N());
        this.q.a(this.c.n(), new dbsz(this) { // from class: azca
            private final azcc a;

            {
                this.a = this;
            }

            @Override // defpackage.dbsz
            public final void NU(Object obj) {
                azcc azccVar = this.a;
                azccVar.b.j((List) obj);
                cqkx.p(azccVar);
            }
        }, new dbty(this) { // from class: azcb
            private final azcc a;

            {
                this.a = this;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return Boolean.valueOf(cqkx.l(this.a).iterator().hasNext());
            }
        });
        return this.b;
    }
}
