package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: apue  reason: default package */
/* loaded from: classes2.dex */
public final class apue extends bvxb<dbnj, dbnl> {
    public final gga a;
    public final apup b;
    public final bwrs<ilo> c;
    public final bhhf d;
    public final bhat e;
    public final bvjj f;
    private final dxio<buui> h;
    private final Executor i;
    private final int j;

    public apue(gga ggaVar, apup apupVar, dxio<buui> dxioVar, Executor executor, bhhf bhhfVar, bhat bhatVar, bvjj bvjjVar, bwrs<ilo> bwrsVar, int i) {
        this.a = ggaVar;
        this.b = apupVar;
        this.c = bwrsVar;
        this.h = dxioVar;
        this.i = executor;
        this.d = bhhfVar;
        this.j = i;
        this.e = bhatVar;
        this.f = bvjjVar;
    }

    @Override // defpackage.bvwz
    public final String c() {
        return "pa.upt";
    }

    @Override // defpackage.bvxb
    protected final /* bridge */ /* synthetic */ dbnl e(dbnj dbnjVar) {
        final dbnj dbnjVar2 = dbnjVar;
        this.a.runOnUiThread(new Runnable(this, dbnjVar2) { // from class: apuc
            private final apue a;
            private final dbnj b;

            {
                this.a = this;
                this.b = dbnjVar2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                apue apueVar = this.a;
                dbnj dbnjVar3 = this.b;
                if (apueVar.c.c() == null || (dbnjVar3.a & 1) == 0) {
                    return;
                }
                String str = dbnjVar3.b;
                int indexOf = str.indexOf("localPosts/");
                Long valueOf = indexOf > 0 ? Long.valueOf(str.substring(indexOf + 11)) : null;
                if (valueOf == null) {
                    return;
                }
                int a = dbni.a(dbnjVar3.c);
                if (a == 0) {
                    a = 1;
                }
                int i = a - 1;
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3 && apueVar.d.h(apueVar.c)) {
                            apueVar.g(valueOf.longValue(), 4);
                            return;
                        } else {
                            int i2 = dbnjVar3.c;
                            return;
                        }
                    }
                    apup apupVar = apueVar.b;
                    ilo c = apueVar.c.c();
                    dbsk.s(c);
                    apupVar.o(c, valueOf.longValue());
                    return;
                }
                if (apueVar.e.d()) {
                    apueVar.f.S(bvjk.jq, true);
                }
                apueVar.g(valueOf.longValue(), 2);
                dcdc<Long> p = apueVar.b.p();
                int size = p.size();
                for (int i3 = 0; i3 < size; i3++) {
                    Long l = p.get(i3);
                    if (!l.equals(valueOf)) {
                        apueVar.g(l.longValue(), 1);
                    }
                }
            }
        });
        return dbnl.a;
    }

    public final void g(long j, int i) {
        bvrj.UI_THREAD.c();
        dipp bZ = dipt.j.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dipt diptVar = (dipt) bZ.b;
        diptVar.b = 1;
        diptVar.a |= 1;
        ilo c = this.c.c();
        dbsk.s(c);
        String o = c.ai().o();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dipt diptVar2 = (dipt) bZ.b;
        o.getClass();
        int i2 = diptVar2.a | 4;
        diptVar2.a = i2;
        diptVar2.d = o;
        diptVar2.a = i2 | 8;
        diptVar2.e = j;
        boolean l = this.d.l(this.c);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dipt diptVar3 = (dipt) bZ.b;
        diptVar3.a |= 256;
        diptVar3.i = l;
        dipt bK = bZ.bK();
        buui a = this.h.a();
        buac a2 = a.a();
        btyr bZ2 = btys.f.bZ();
        int i3 = i == 2 ? this.j : 1;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        btys btysVar = (btys) bZ2.b;
        int i4 = 2 | btysVar.a;
        btysVar.a = i4;
        btysVar.c = i3;
        btysVar.a = 1 | i4;
        btysVar.b = 500;
        a2.c(bZ2.bK());
        a.c().b(bK, new apud(this, i), this.i);
    }

    @Override // defpackage.bvxb
    protected final /* bridge */ /* synthetic */ dbnj j(byte[] bArr) {
        return ((dbng) dbnj.d.bZ().by(bArr)).bK();
    }
}
