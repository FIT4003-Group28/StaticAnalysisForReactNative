package defpackage;

import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: bbow  reason: default package */
/* loaded from: classes3.dex */
public class bbow implements bbng {
    public static final Runnable a = bboq.a;
    public final gga b;
    public final bwrs<ilo> c;
    public final bbov d;
    public final bbdu e;
    public final Runnable f;
    public final Runnable g;
    public final Runnable h;
    public Runnable i = a;
    public int j = -1;
    private final cztz k;
    private final Runnable l;
    private final cztt m;

    public bbow(gga ggaVar, final dxio<bbdv> dxioVar, cqhn cqhnVar, bbpm bbpmVar, cztz cztzVar, btvo btvoVar, final bwrs<ilo> bwrsVar, Runnable runnable) {
        this.b = ggaVar;
        this.k = cztzVar;
        this.c = bwrsVar;
        this.l = runnable;
        final ilo c = bwrsVar.c();
        dbsk.s(c);
        this.d = new bbov(this, bbpmVar, c);
        this.e = new bbor(dxioVar, bwrsVar);
        this.f = new Runnable(this, dxioVar, bwrsVar, c) { // from class: bbom
            private final bbow a;
            private final dxio b;
            private final bwrs c;
            private final ilo d;

            {
                this.a = this;
                this.b = dxioVar;
                this.c = bwrsVar;
                this.d = c;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bbow bbowVar = this.a;
                dxio dxioVar2 = this.b;
                bwrs<ilo> bwrsVar2 = this.c;
                ilo iloVar = this.d;
                ((bbdv) dxioVar2.a()).F(bwrsVar2);
                ((bbdv) dxioVar2.a()).r(iloVar, bbowVar.e);
            }
        };
        this.g = new Runnable(this, dxioVar, bwrsVar, c) { // from class: bbon
            private final bbow a;
            private final dxio b;
            private final bwrs c;
            private final ilo d;

            {
                this.a = this;
                this.b = dxioVar;
                this.c = bwrsVar;
                this.d = c;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bbow bbowVar = this.a;
                dxio dxioVar2 = this.b;
                bwrs<ilo> bwrsVar2 = this.c;
                ilo iloVar = this.d;
                ((bbdv) dxioVar2.a()).F(bwrsVar2);
                ((bbdv) dxioVar2.a()).t(iloVar, bbowVar.e);
            }
        };
        this.h = new Runnable(this, dxioVar, bwrsVar, c) { // from class: bboo
            private final bbow a;
            private final dxio b;
            private final bwrs c;
            private final ilo d;

            {
                this.a = this;
                this.b = dxioVar;
                this.c = bwrsVar;
                this.d = c;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bbow bbowVar = this.a;
                dxio dxioVar2 = this.b;
                bwrs<ilo> bwrsVar2 = this.c;
                ilo iloVar = this.d;
                ((bbdv) dxioVar2.a()).F(bwrsVar2);
                ((bbdv) dxioVar2.a()).s(iloVar, bbowVar.e);
            }
        };
        cztzVar.d(ggaVar.getWindowManager(), true);
        cztq a2 = cztt.a(cztzVar);
        a2.e(R.string.PERSONAL_SCORE_FEEDBACK_THANKS_MESSAGE, new Object[0]);
        a2.d(cztr.LONG);
        this.m = a2.b();
    }

    public static cqtd f(int i) {
        return cqrt.i(iut.a(iup.e(i)), ibm.x());
    }

    @Override // defpackage.bbng
    public bbmb a() {
        return this.d;
    }

    @Override // defpackage.bbng
    public cqkl b() {
        this.l.run();
        return cqkl.a;
    }

    @Override // defpackage.bbng
    public cqkl c() {
        if (!d().booleanValue()) {
            return cqkl.a;
        }
        this.i.run();
        this.l.run();
        this.k.a(this.m);
        return cqkl.a;
    }

    @Override // defpackage.bbng
    public Boolean d() {
        return Boolean.valueOf(this.j != -1);
    }

    public final Runnable e(final int i, final Runnable runnable) {
        return new Runnable(this, runnable, i) { // from class: bbop
            private final bbow a;
            private final Runnable b;
            private final int c;

            {
                this.a = this;
                this.b = runnable;
                this.c = i;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bbow bbowVar = this.a;
                Runnable runnable2 = this.b;
                int i2 = this.c;
                runnable2.run();
                List<bblz> b = bbowVar.d.b();
                dbsk.p(i2 < b.size(), "(personal-score): Invalid index: %s", String.valueOf(i2));
                int i3 = bbowVar.j;
                if (i3 == -1) {
                    bbowVar.j = i2;
                } else if (i3 != i2) {
                    b.get(i3).f();
                    bbowVar.j = i2;
                } else if (i3 == i2) {
                    bbowVar.i = bbow.a;
                    bbowVar.j = -1;
                }
                b.get(i2).f();
                cqkx.p(bbowVar);
            }
        };
    }
}
