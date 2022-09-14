package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: blnx  reason: default package */
/* loaded from: classes3.dex */
public class blnx implements bega, begs {
    public final dxio<aesb> a;
    public final dxio<bkpi> b;
    public bwrs<ilo> c;
    private final gga d;
    private jbf e;
    private jbf f;
    private final bllh g;

    public blnx(gga ggaVar, dxio<aesb> dxioVar, dxio<bkpi> dxioVar2, blli blliVar, blht blhtVar) {
        this.d = ggaVar;
        this.a = dxioVar;
        this.b = dxioVar2;
        bllh a = blliVar.a(blhtVar.a(false, cdjk.PLACESHEET_OVERVIEW));
        this.g = a;
        a.o(this);
    }

    public jbf a() {
        jbf jbfVar = this.e;
        if (jbfVar != null) {
            return jbfVar;
        }
        throw new IllegalStateException("setPlacemark() must be called before viewmodel is used");
    }

    public jbf b() {
        jbf jbfVar = this.f;
        if (jbfVar != null) {
            return jbfVar;
        }
        throw new IllegalStateException("setPlacemark() must be called before viewmodel is used");
    }

    public blkv c() {
        return this.g;
    }

    @Override // defpackage.begs
    public void m(btrm btrmVar) {
        this.g.l(btrmVar);
    }

    @Override // defpackage.begs
    public void n(btrm btrmVar) {
        this.g.m(btrmVar);
    }

    @Override // defpackage.bega
    public void t(bwrs<ilo> bwrsVar) {
        this.g.n(bwrsVar);
        this.c = bwrsVar;
        ilo c = bwrsVar.c();
        dbsk.s(c);
        cjtd cjtdVar = cjtd.b;
        cjtd cjtdVar2 = cjtd.b;
        if (c.f) {
            cjta c2 = cjtd.c(c.bY());
            c2.d = dtxy.mL;
            cjtdVar = c2.a();
            cjta c3 = cjtd.c(c.bY());
            c3.d = dtxy.kh;
            cjtdVar2 = c3.a();
        }
        ixw ixwVar = new ixw();
        ixwVar.a = this.d.getString(R.string.TAB_TITLE_REVIEWS);
        ixwVar.f = cjtdVar;
        this.e = ixwVar.a();
        ixw ixwVar2 = new ixw();
        ixwVar2.a = this.d.getString(R.string.MORE_REVIEWS);
        ixwVar2.c = true;
        ixwVar2.d = this;
        ixwVar2.e = new Runnable(this) { // from class: blnw
            private final blnx a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                blnx blnxVar = this.a;
                if (blnxVar.c == null) {
                    return;
                }
                ilo c4 = blnxVar.c.c();
                dbsk.s(c4);
                blnxVar.a.a().D(c4, 8, dtxy.kh);
                blnxVar.b.a().a(blnxVar.c);
            }
        };
        ixwVar2.f = cjtdVar2;
        this.f = ixwVar2.a();
    }

    @Override // defpackage.bega
    public void u() {
    }

    @Override // defpackage.bega
    public Boolean w() {
        if (!blkj.a(this.c)) {
            return false;
        }
        return this.g.c();
    }
}
