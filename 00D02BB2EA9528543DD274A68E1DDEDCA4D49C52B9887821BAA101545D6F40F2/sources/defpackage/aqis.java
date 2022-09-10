package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: aqis  reason: default package */
/* loaded from: classes2.dex */
public class aqis implements aqhg {
    public final aqgn a;
    public final dxio<aqov> b;
    public final dxio<apyz> c;
    @dzsi
    public aqea d;
    private final aqhu e;
    private final aqkh f;
    private final aqkb g;
    private final aqeg<cvav, cvbp> h;
    private final aqjg i;
    private final dxio<akfa> j;
    @dzsi
    private aqbx k;

    public aqis(final cqhn cqhnVar, aqhu aqhuVar, aqki aqkiVar, aqkc aqkcVar, aqeh aqehVar, aqgn aqgnVar, aqjh aqjhVar, dxio<aqov> dxioVar, dxio<apyz> dxioVar2, dxio<akfa> dxioVar3, final Executor executor, ges gesVar, k kVar) {
        this.e = aqhuVar;
        Activity activity = (Activity) ((dxjd) aqkcVar.a).a;
        aqkc.a(activity, 1);
        apzy a = aqkcVar.b.a();
        aqkc.a(a, 2);
        cqhn a2 = aqkcVar.c.a();
        aqkc.a(a2, 3);
        aqeh a3 = aqkcVar.d.a();
        aqkc.a(a3, 4);
        aqgo a4 = aqkcVar.e.a();
        aqkc.a(a4, 5);
        dxio a5 = ((dxjh) aqkcVar.f).a();
        aqkc.a(a5, 6);
        dxio a6 = ((dxjh) aqkcVar.g).a();
        aqkc.a(a6, 7);
        dxio a7 = ((dxjh) aqkcVar.h).a();
        aqkc.a(a7, 8);
        dxio a8 = ((dxjh) aqkcVar.i).a();
        aqkc.a(a8, 9);
        dxio a9 = ((dxjh) aqkcVar.j).a();
        aqkc.a(a9, 10);
        dxio a10 = ((dxjh) aqkcVar.k).a();
        aqkc.a(a10, 11);
        dxio a11 = ((dxjh) aqkcVar.l).a();
        aqkc.a(a11, 12);
        aqkc.a(gesVar, 13);
        aqkc.a(kVar, 14);
        this.g = new aqkb(activity, a, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, gesVar, kVar);
        this.a = aqgnVar;
        this.b = dxioVar;
        this.c = dxioVar2;
        this.j = dxioVar3;
        aqil aqilVar = new aqil(this, executor, cqhnVar);
        Activity activity2 = (Activity) ((dxjd) aqjhVar.a).a;
        aqjh.a(activity2, 1);
        apzy a12 = aqjhVar.b.a();
        aqjh.a(a12, 2);
        Executor a13 = aqjhVar.c.a();
        aqjh.a(a13, 3);
        dxio a14 = ((dxjh) aqjhVar.d).a();
        aqjh.a(a14, 4);
        dxio a15 = ((dxjh) aqjhVar.e).a();
        aqjh.a(a15, 5);
        dxio a16 = ((dxjh) aqjhVar.f).a();
        aqjh.a(a16, 6);
        dxio a17 = ((dxjh) aqjhVar.g).a();
        aqjh.a(a17, 7);
        dxio a18 = ((dxjh) aqjhVar.h).a();
        aqjh.a(a18, 8);
        dxio a19 = ((dxjh) aqjhVar.i).a();
        aqjh.a(a19, 9);
        dxio a20 = ((dxjh) aqjhVar.j).a();
        aqjh.a(a20, 10);
        dxio a21 = ((dxjh) aqjhVar.k).a();
        aqjh.a(a21, 11);
        dxio a22 = ((dxjh) aqjhVar.l).a();
        aqjh.a(a22, 12);
        dxio a23 = ((dxjh) aqjhVar.m).a();
        aqjh.a(a23, 13);
        dxio a24 = ((dxjh) aqjhVar.n).a();
        aqjh.a(a24, 14);
        dxio a25 = ((dxjh) aqjhVar.o).a();
        aqjh.a(a25, 15);
        dxio a26 = ((dxjh) aqjhVar.p).a();
        aqjh.a(a26, 16);
        aqjh.a(aqilVar, 17);
        this.i = new aqjg(activity2, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22, a23, a24, a25, a26, aqilVar);
        this.h = aqehVar.a(kVar, cvbp.class, aqhf.a);
        aqhuVar.m(new aqht(this, executor, cqhnVar) { // from class: aqim
            private final aqis a;
            private final Executor b;
            private final cqhn c;

            {
                this.a = this;
                this.b = executor;
                this.c = cqhnVar;
            }

            @Override // defpackage.aqht
            public final void a() {
                this.b.execute(new apzx(this.a));
            }
        });
        Activity activity3 = (Activity) ((dxjd) aqkiVar.a).a;
        aqki.a(activity3, 1);
        cqhn a27 = aqkiVar.b.a();
        aqki.a(a27, 2);
        apyx a28 = aqkiVar.c.a();
        aqki.a(a28, 3);
        dxio a29 = ((dxjh) aqkiVar.d).a();
        aqki.a(a29, 4);
        dxio a30 = ((dxjh) aqkiVar.e).a();
        aqki.a(a30, 5);
        dxio a31 = ((dxjh) aqkiVar.f).a();
        aqki.a(a31, 6);
        dxio a32 = ((dxjh) aqkiVar.g).a();
        aqki.a(a32, 7);
        dxio a33 = ((dxjh) aqkiVar.h).a();
        aqki.a(a33, 8);
        dxio a34 = ((dxjh) aqkiVar.i).a();
        aqki.a(a34, 9);
        Executor a35 = aqkiVar.j.a();
        aqki.a(a35, 10);
        aqki.a(aqhuVar, 11);
        this.f = new aqkh(activity3, a27, a28, a29, a30, a31, a32, a33, a34, a35, aqhuVar);
    }

    @Override // defpackage.aqhg
    public View.OnAttachStateChangeListener a() {
        return new aqir();
    }

    @Override // defpackage.aqhg
    public aqhr b() {
        return this.e;
    }

    @Override // defpackage.aqhg
    public aqjp c() {
        return this.g;
    }

    @Override // defpackage.aqhg
    public aqek<cvbp> d() {
        return this.h.e;
    }

    @Override // defpackage.aqhg
    @dzsi
    public aqea e() {
        if (this.f.f() == 3) {
            return this.d;
        }
        return null;
    }

    @Override // defpackage.aqhg
    public cjtd f() {
        return cjtd.a(dtxv.bY);
    }

    public void g(final aqbx aqbxVar) {
        if (aqbxVar.equals(this.k)) {
            return;
        }
        btlu j = this.j.a().j();
        if (j == null || !aqda.a(aqbxVar.b, j)) {
            this.i.b();
            return;
        }
        this.i.a(aqbxVar.b, j);
        this.k = aqbxVar;
        this.f.a(aqbxVar);
        this.g.f(aqbxVar.b);
        this.h.a(new aqef(this, aqbxVar) { // from class: aqin
            private final aqis a;
            private final aqbx b;

            {
                this.a = this;
                this.b = aqbxVar;
            }

            @Override // defpackage.aqef
            public final cuvu a(View view) {
                final aqis aqisVar = this.a;
                aqbx aqbxVar2 = this.b;
                cvbp cvbpVar = (cvbp) view;
                aqov a = aqisVar.b.a();
                ctyy ctyyVar = aqbxVar2.a;
                final aqgn aqgnVar = aqisVar.a;
                aqgnVar.getClass();
                return a.a(ctyyVar, cvbpVar, new dbsl(aqgnVar) { // from class: aqio
                    private final aqgn a;

                    {
                        this.a = aqgnVar;
                    }

                    @Override // defpackage.dbsl
                    public final boolean a(Object obj) {
                        return this.a.b((cufw) obj);
                    }
                }, new cvau(aqisVar) { // from class: aqip
                    private final aqis a;

                    {
                        this.a = aqisVar;
                    }

                    @Override // defpackage.cvau
                    public final void a(ConversationId conversationId) {
                        apza i = apzc.i();
                        i.b(conversationId);
                        i.d(apzb.INBOX_IN_UPDATES_TAB);
                        this.a.c.a().n(i.e(), false);
                    }
                }, aqiq.a);
            }
        });
    }

    public apzt h() {
        apzq bZ = apzt.e.bZ();
        int f = this.f.f();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        apzt apztVar = (apzt) bZ.b;
        apztVar.b = f - 1;
        apztVar.a |= 1;
        int i = apzb.INBOX_IN_UPDATES_TAB.q;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        apzt apztVar2 = (apzt) bZ.b;
        apztVar2.a |= 2;
        apztVar2.c = i;
        return bZ.bK();
    }

    public void i(apzt apztVar) {
        if ((apztVar.a & 1) != 0) {
            aqkh aqkhVar = this.f;
            int a = apzs.a(apztVar.b);
            if (a == 0) {
                a = 1;
            }
            aqkhVar.h = true;
            int i = a - 1;
            if (i == 1) {
                aqkhVar.e.i(0);
            } else if (i != 2) {
                aqkhVar.e.i(0);
            } else {
                aqkhVar.e.i(1);
            }
        }
    }

    public void j() {
        this.k = null;
        this.d = null;
        this.i.b();
        this.f.b();
        this.g.i();
    }
}
