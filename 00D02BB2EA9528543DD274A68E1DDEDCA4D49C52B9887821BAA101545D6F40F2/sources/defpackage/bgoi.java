package defpackage;

import android.app.Activity;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: bgoi  reason: default package */
/* loaded from: classes3.dex */
public class bgoi implements bgnm {
    private final bgoq a;
    private final bgoe b;
    @dzsi
    private bgno d;
    public final cjqy e;
    public final cjqq f;
    private final List<bgod> c = new ArrayList();
    private final cqqw g = new bgoh(this);

    public bgoi(bgoe bgoeVar, cjqy cjqyVar, bgoq bgoqVar, cjqq cjqqVar) {
        this.b = bgoeVar;
        this.e = cjqyVar;
        this.a = bgoqVar;
        this.f = cjqqVar;
    }

    @Override // defpackage.bgnm
    @dzsi
    public bgnl a() {
        if (w().booleanValue()) {
            return this.c.get(0);
        }
        return null;
    }

    @Override // defpackage.bgnm
    @dzsi
    public bgno b() {
        return this.d;
    }

    @Override // defpackage.bgnm
    public Boolean c() {
        boolean z = true;
        if (this.c.size() != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bgnm
    public List<bgnl> d() {
        return dcdc.q(dcft.v(this.c, 10));
    }

    @Override // defpackage.bgnm
    public cqqw e() {
        return this.g;
    }

    public void f(dipo dipoVar, @dzsi bgey bgeyVar, ilo iloVar) {
        String str;
        bgoi bgoiVar = this;
        final bgey bgeyVar2 = bgeyVar;
        ilo iloVar2 = iloVar;
        dsrj<dipk> dsrjVar = dipoVar.c;
        int i = 1;
        boolean z = dsrjVar.size() > 1;
        if ((dipoVar.a & 1) != 0) {
            dipn dipnVar = dipoVar.b;
            if (dipnVar == null) {
                dipnVar = dipn.c;
            }
            str = dipnVar.a;
        } else {
            str = "";
        }
        final int i2 = 0;
        while (i2 < dsrjVar.size()) {
            final dipk dipkVar = dsrjVar.get(i2);
            List<bgod> list = bgoiVar.c;
            bgoe bgoeVar = bgoiVar.b;
            Runnable runnable = new Runnable(bgeyVar2, i2) { // from class: bgof
                private final bgey a;
                private final int b;

                {
                    this.a = bgeyVar2;
                    this.b = i2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    bgey bgeyVar3 = this.a;
                    int i3 = this.b;
                    bgel bgelVar = (bgel) bgeyVar3;
                    bgem bgemVar = bgelVar.a;
                    bwrs<ilo> bwrsVar = bgemVar.d;
                    if (bwrsVar == null || !bgemVar.c.a().i(bege.UPDATES)) {
                        return;
                    }
                    bgelVar.a.c.a().l(bege.UPDATES, bgev.g(bgelVar.a.b, bwrsVar, i3));
                }
            };
            Runnable runnable2 = new Runnable(bgeyVar2, dipkVar, i2) { // from class: bgog
                private final bgey a;
                private final dipk b;
                private final int c;

                {
                    this.a = bgeyVar2;
                    this.b = dipkVar;
                    this.c = i2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    bgey bgeyVar3 = this.a;
                    dipk dipkVar2 = this.b;
                    int i3 = this.c;
                    diov diovVar = dipkVar2.m.get(0);
                    bgel bgelVar = (bgel) bgeyVar3;
                    bgem bgemVar = bgelVar.a;
                    bwqv bwqvVar = bgemVar.b;
                    bwrs<ilo> bwrsVar = bgemVar.d;
                    dbsk.s(bwrsVar);
                    bgelVar.a.a.D(bgex.g(bwqvVar, dipkVar2, diovVar, true, true, 0, bwrsVar, i3));
                }
            };
            Activity activity = (Activity) ((dxjd) bgoeVar.a).a;
            bgoe.a(activity, i);
            bmdq a = bgoeVar.b.a();
            bgoe.a(a, 2);
            bgpa a2 = bgoeVar.c.a();
            bgoe.a(a2, 3);
            dxio a3 = ((dxjh) bgoeVar.d).a();
            bgoe.a(a3, 4);
            dxio a4 = ((dxjh) bgoeVar.e).a();
            bgoe.a(a4, 5);
            dxio a5 = ((dxjh) bgoeVar.f).a();
            bgoe.a(a5, 6);
            btvo a6 = bgoeVar.g.a();
            bgoe.a(a6, 7);
            bgoe.a(dipkVar, 8);
            bgoe.a(str, 9);
            bgoe.a(iloVar2, 14);
            int i3 = i2;
            list.add(new bgod(activity, a, a2, a3, a4, a5, a6, dipkVar, str, runnable, runnable2, z, i3, iloVar));
            i2 = i3 + 1;
            bgoiVar = this;
            bgeyVar2 = bgeyVar;
            iloVar2 = iloVar2;
            dsrjVar = dsrjVar;
            i = 1;
            str = str;
        }
        bgoiVar.d = bgoiVar.a.a(null, iloVar2, 0, bgnk.PLACESHEET_CAROUSEL);
    }

    public void g() {
        this.c.clear();
        this.d = null;
    }

    public Boolean w() {
        return Boolean.valueOf(!this.c.isEmpty());
    }
}
