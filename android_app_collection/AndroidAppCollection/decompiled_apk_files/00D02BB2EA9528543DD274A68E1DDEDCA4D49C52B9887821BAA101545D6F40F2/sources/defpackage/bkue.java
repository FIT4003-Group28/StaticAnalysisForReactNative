package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: bkue  reason: default package */
/* loaded from: classes3.dex */
public class bkue implements bkub {
    public final bbut b;
    public final gga c;
    private final bkui d;
    private List<bkuc> e = dcdc.e();
    public List<dwfl> a = dcdc.e();

    public bkue(bkui bkuiVar, bbut bbutVar, gga ggaVar) {
        this.d = bkuiVar;
        this.b = bbutVar;
        this.c = ggaVar;
    }

    @Override // defpackage.bkub
    @dzsi
    public bkuc a(int i) {
        if (i < 0 || i >= this.e.size()) {
            return null;
        }
        return this.e.get(i);
    }

    @Override // defpackage.bkub
    public Integer b() {
        return Integer.valueOf(this.e.size());
    }

    public void c() {
        this.e = dcdc.e();
        this.a = dcdc.e();
    }

    public void d(List<dwfl> list) {
        if (list.isEmpty()) {
            return;
        }
        dccx F = dcdc.F();
        F.i(this.a);
        dccx F2 = dcdc.F();
        F2.i(this.e);
        for (int i = 0; i < list.size(); i++) {
            int size = this.e.size();
            dwfl dwflVar = list.get(i);
            F.g(dwflVar);
            bkui bkuiVar = this.d;
            final int i2 = size + i;
            Runnable runnable = new Runnable(this, i2) { // from class: bkud
                private final bkue a;
                private final int b;

                {
                    this.a = this;
                    this.b = i2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    bkue bkueVar = this.a;
                    int i3 = this.b;
                    ckni ckniVar = new ckni(bkueVar.a);
                    int a = cknv.a(bkueVar.c.getWindowManager());
                    ckniVar.a(a, a);
                    bbut bbutVar = bkueVar.b;
                    bbtv v = bbty.v();
                    v.k(true);
                    v.o(true);
                    bbutVar.o(ckniVar, i3, v.a(), null);
                }
            };
            bkui.a(dwflVar, 1);
            bkui.a(runnable, 2);
            bbtu a = bkuiVar.a.a();
            bkui.a(a, 3);
            F2.g(new bkuh(dwflVar, runnable, a));
        }
        this.a = F.f();
        this.e = F2.f();
    }
}
