package defpackage;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.widget.Toast;
import com.google.android.apps.maps.R;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: pyh  reason: default package */
/* loaded from: classes7.dex */
public final class pyh extends itb implements qce {
    public static final /* synthetic */ int j = 0;
    public final gga a;
    public final amwz b;
    public final bvrb c;
    public final btrm d;
    public final dxio<vtn> e;
    public final dxio<ckcw> f;
    public final psi g;
    @dzsi
    public vvy h;
    public final buxk i;
    private final cqat o;
    private final dxio<jzv> p;
    private final dxio<akox> q;
    private final bvjj r;
    private final boolean s;
    @dzsi
    private ckhe t;
    @dzsi
    private ckhe u;
    private final Set<dbsz<vvy>> v = new aih();

    public pyh(gga ggaVar, buxk buxkVar, btvo btvoVar, bvrb bvrbVar, cqat cqatVar, bvjj bvjjVar, btrm btrmVar, dxio dxioVar, amwz amwzVar, dxio dxioVar2, dxio dxioVar3, dxio dxioVar4, Executor executor, Executor executor2) {
        this.a = ggaVar;
        this.o = cqatVar;
        this.r = bvjjVar;
        this.p = dxioVar;
        this.b = amwzVar;
        this.i = buxkVar;
        this.c = bvrbVar;
        this.d = btrmVar;
        this.q = dxioVar2;
        this.e = dxioVar3;
        this.f = dxioVar4;
        this.g = new psi(ggaVar.getApplication(), executor, executor2, vzd.SAVE_THIS_ROUTE);
        this.s = btvoVar.getEnableFeatureParameters().C;
    }

    @Override // defpackage.itb
    public final void Nt() {
        super.Nt();
        if (!this.s) {
            j();
            return;
        }
        long b = this.o.b() - this.r.w(bvjk.eh, 0L);
        if (b > qce.k) {
            TimeUnit.MILLISECONDS.toHours(b);
            j();
            return;
        }
        this.g.a(new dbsz(this) { // from class: pxq
            private final pyh a;

            {
                this.a = this;
            }

            @Override // defpackage.dbsz
            public final void NU(Object obj) {
                pyh pyhVar = this.a;
                pyhVar.h = (vvy) obj;
                if (pyhVar.w()) {
                    pyhVar.j();
                }
            }
        });
    }

    @Override // defpackage.qce
    public final void e(final vun vunVar, final amte amteVar, final int i, @dzsi final qcd qcdVar) {
        if (!this.s) {
            return;
        }
        final dbsz dbszVar = new dbsz(this, vunVar, amteVar, i, qcdVar) { // from class: pxy
            private final pyh a;
            private final vun b;
            private final amte c;
            private final int d;
            private final qcd e;

            {
                this.a = this;
                this.b = vunVar;
                this.c = amteVar;
                this.d = i;
                this.e = qcdVar;
            }

            @Override // defpackage.dbsz
            public final void NU(Object obj) {
                pyh pyhVar = this.a;
                vun vunVar2 = this.b;
                amte amteVar2 = this.c;
                int i2 = this.d;
                qcd qcdVar2 = this.e;
                Boolean bool = (Boolean) obj;
                if (bool == null || !bool.booleanValue()) {
                    pyhVar.f(vunVar2, amteVar2, i2, qcdVar2);
                } else {
                    new AlertDialog.Builder(pyhVar.a).setTitle(R.string.SAVE_ROUTE_OVERWRITE_TITLE).setMessage(R.string.SAVE_ROUTE_OVERWRITE_MESSAGE).setPositiveButton(R.string.SAVE_ROUTE_OVERWRITE_ACCEPT, new DialogInterface.OnClickListener(pyhVar, vunVar2, amteVar2, i2, qcdVar2) { // from class: pxv
                        private final pyh a;
                        private final vun b;
                        private final amte c;
                        private final int d;
                        private final qcd e;

                        {
                            this.a = pyhVar;
                            this.b = vunVar2;
                            this.c = amteVar2;
                            this.d = i2;
                            this.e = qcdVar2;
                        }

                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i3) {
                            this.a.f(this.b, this.c, this.d, this.e);
                        }
                    }).setNegativeButton(17039360, new DialogInterface.OnClickListener(qcdVar2) { // from class: pxw
                        private final qcd a;

                        {
                            this.a = qcdVar2;
                        }

                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i3) {
                            qcd qcdVar3 = this.a;
                            int i4 = pyh.j;
                            qcdVar3.a();
                        }
                    }).setOnCancelListener(new DialogInterface.OnCancelListener(qcdVar2) { // from class: pxx
                        private final qcd a;

                        {
                            this.a = qcdVar2;
                        }

                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            qcd qcdVar3 = this.a;
                            int i3 = pyh.j;
                            qcdVar3.a();
                        }
                    }).show();
                }
            }
        };
        this.g.a(new dbsz(dbszVar) { // from class: pxu
            private final dbsz a;

            {
                this.a = dbszVar;
            }

            @Override // defpackage.dbsz
            public final void NU(Object obj) {
                dbsz dbszVar2 = this.a;
                vvy vvyVar = (vvy) obj;
                int i2 = pyh.j;
                bvrj.UI_THREAD.c();
                dbszVar2.NU(Boolean.valueOf(vvyVar != null));
            }
        });
    }

    public final void f(vun vunVar, final amte amteVar, int i, @dzsi final qcd qcdVar) {
        final vvy f;
        amsy amsyVar = amteVar.a;
        if (amsyVar == null) {
            return;
        }
        dwaa dwaaVar = amsyVar.a.b;
        if (dwaaVar == null) {
            dwaaVar = dwaa.g;
        }
        dvzu dvzuVar = dwaaVar.b;
        if (dvzuVar == null) {
            dvzuVar = dvzu.F;
        }
        if (dvzuVar.e.size() <= 0 || amsyVar.i() < 2) {
            return;
        }
        dpjn dpjnVar = amsyVar.h(0).b;
        if (dpjnVar == null) {
            dpjnVar = dpjn.m;
        }
        dpjx dpjxVar = dpjnVar.b;
        if (dpjxVar == null) {
            dpjxVar = dpjx.n;
        }
        if ((dpjxVar.a & 4) == 0 || this.p.a().a() || (f = vze.f(this.o.b(), vunVar, amteVar, 2, i, vzd.SAVE_THIS_ROUTE)) == null) {
            return;
        }
        vvs vvsVar = f.e;
        if (vvsVar == null) {
            vvsVar = vvs.e;
        }
        this.r.Z(bvjk.eh, vvsVar.b);
        this.g.b(f, new Runnable(this, amteVar, f) { // from class: pxz
            private final pyh a;
            private final amte b;
            private final vvy c;

            {
                this.a = this;
                this.b = amteVar;
                this.c = f;
            }

            @Override // java.lang.Runnable
            public final void run() {
                akqq akqqVar;
                pyh pyhVar = this.a;
                amte amteVar2 = this.b;
                vvy vvyVar = this.c;
                bvrj.BACKGROUND_THREADPOOL.c();
                bvrj.UI_THREAD.d();
                File e = vze.e(pyhVar.a);
                if (e.exists()) {
                    bvrj.UI_THREAD.d();
                    File[] listFiles = e.listFiles();
                    if (listFiles != null) {
                        for (File file : listFiles) {
                            file.delete();
                        }
                    }
                } else {
                    e.mkdir();
                }
                vtn a = pyhVar.e.a();
                a.k(amteVar2.k());
                a.i(sro.a(amteVar2, amteVar2.a(pyhVar.a)), e);
                amvh[] amvhVarArr = amteVar2.c;
                int length = amvhVarArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        akqqVar = null;
                        break;
                    }
                    amvh amvhVar = amvhVarArr[i2];
                    if (amvhVar.k() && (akqqVar = amvhVar.e) != null) {
                        break;
                    }
                    i2++;
                }
                if (akqqVar == null) {
                    return;
                }
                dwhe bZ = dwhf.i.bZ();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dwhf dwhfVar = (dwhf) bZ.b;
                dwhfVar.e = 1;
                dwhfVar.a |= 8;
                dhjy bZ2 = dhjz.e.bZ();
                double d = akqqVar.a;
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dhjz dhjzVar = (dhjz) bZ2.b;
                int i3 = dhjzVar.a | 2;
                dhjzVar.a = i3;
                dhjzVar.c = d;
                double d2 = akqqVar.b;
                dhjzVar.a = i3 | 1;
                dhjzVar.b = d2;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dwhf dwhfVar2 = (dwhf) bZ.b;
                dhjz bK = bZ2.bK();
                bK.getClass();
                dwhfVar2.b = bK;
                dwhfVar2.a |= 1;
                dwaa dwaaVar2 = amteVar2.a.a.b;
                if (dwaaVar2 == null) {
                    dwaaVar2 = dwaa.g;
                }
                dhjx dhjxVar = dwaaVar2.c;
                if (dhjxVar == null) {
                    dhjxVar = dhjx.f;
                }
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dwhf dwhfVar3 = (dwhf) bZ.b;
                dhjxVar.getClass();
                dwhfVar3.c = dhjxVar;
                dwhfVar3.a |= 2;
                dwhf bK2 = bZ.bK();
                pyhVar.i.a(bK2, new pyf(pyhVar, vvyVar, bK2), bvrj.UI_THREAD);
                pyhVar.d.b(new srg());
                pyhVar.h = vvyVar;
            }
        });
        final boolean w = this.q.a().w();
        this.c.b(new Runnable(this, f, qcdVar, w) { // from class: pya
            private final pyh a;
            private final vvy b;
            private final qcd c;
            private final boolean d;

            {
                this.a = this;
                this.b = f;
                this.c = qcdVar;
                this.d = w;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i2;
                pyh pyhVar = this.a;
                vvy vvyVar = this.b;
                qcd qcdVar2 = this.c;
                boolean z = this.d;
                bvrj.BACKGROUND_THREADPOOL.c();
                LinkedList i3 = dchl.i(vze.d(vvyVar, 12, 15));
                if (i3.size() > 300) {
                    i3 = dchl.i(vze.d(vvyVar, 12, 14));
                    i2 = 2;
                } else {
                    i2 = 1;
                }
                if (i3.size() > 300) {
                    i3 = dchl.i(vze.d(vvyVar, 14, 14));
                    i2 = 3;
                }
                ckco ckcoVar = (ckco) pyhVar.f.a().a(ckjq.c);
                ckco ckcoVar2 = (ckco) pyhVar.f.a().a(ckjq.e);
                ckco ckcoVar3 = (ckco) pyhVar.f.a().a(ckjq.d);
                ckco ckcoVar4 = (ckco) pyhVar.f.a().a(ckjq.f);
                if (i3.size() > 600) {
                    pyhVar.l(qcdVar2);
                    pyhVar.k(R.string.SAVE_ROUTE_TILE_COUNT_OVER_LIMIT_TOAST);
                    ckcoVar.a(ckjp.a(4));
                    ckcoVar2.a(0);
                    return;
                }
                ckcoVar.a(ckjp.a(i2));
                ckcoVar2.a(i3.size());
                LinkedList linkedList = new LinkedList();
                if (z) {
                    linkedList.addAll(vze.d(vvyVar, 14, 17));
                    if (linkedList.size() > 600) {
                        linkedList.clear();
                        ckcoVar3.a(ckjp.a(4));
                    } else {
                        ckcoVar3.a(ckjp.a(5));
                    }
                    ckcoVar4.a(linkedList.size());
                } else {
                    ckcoVar3.a(ckjp.a(6));
                }
                pyhVar.n().a();
                try {
                    pyhVar.b.c();
                    pyhVar.b.e(5, i3, new pyd(pyhVar, linkedList, qcdVar2), akry.BASE);
                } catch (IOException unused) {
                    i3.size();
                    pyhVar.m(qcdVar2);
                    pyhVar.k(R.string.SAVE_ROUTE_TILE_PIN_FAILED_TOAST);
                }
            }
        }, bvrj.BACKGROUND_THREADPOOL);
    }

    @Override // defpackage.qce
    public final boolean i() {
        return this.s;
    }

    public final synchronized void j() {
        final vvy vvyVar = this.h;
        for (final dbsz<vvy> dbszVar : this.v) {
            this.c.b(new Runnable(dbszVar, vvyVar) { // from class: pyb
                private final dbsz a;
                private final vvy b;

                {
                    this.a = dbszVar;
                    this.b = vvyVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    dbsz dbszVar2 = this.a;
                    vvy vvyVar2 = this.b;
                    int i = pyh.j;
                    dbszVar2.NU(vvyVar2);
                }
            }, bvrj.UI_THREAD);
        }
        this.v.clear();
    }

    public final void k(final int i) {
        this.a.runOnUiThread(new Runnable(this, i) { // from class: pyc
            private final pyh a;
            private final int b;

            {
                this.a = this;
                this.b = i;
            }

            @Override // java.lang.Runnable
            public final void run() {
                pyh pyhVar = this.a;
                int i2 = this.b;
                gga ggaVar = pyhVar.a;
                Toast.makeText(ggaVar, ggaVar.getString(i2), 1).show();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void l(@dzsi final qcd qcdVar) {
        this.c.b(new Runnable(qcdVar) { // from class: pxr
            private final qcd a;

            {
                this.a = qcdVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                qcd qcdVar2 = this.a;
                int i = pyh.j;
                bvrj.UI_THREAD.c();
                ybh ybhVar = (ybh) qcdVar2;
                ybi ybiVar = ybhVar.a;
                ybiVar.c = true;
                ybiVar.b = false;
                ybhVar.a.d();
            }
        }, bvrj.UI_THREAD);
    }

    public final void m(@dzsi final qcd qcdVar) {
        this.c.b(new Runnable(qcdVar) { // from class: pxs
            private final qcd a;

            {
                this.a = qcdVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                qcd qcdVar2 = this.a;
                int i = pyh.j;
                qcdVar2.a();
            }
        }, bvrj.UI_THREAD);
    }

    public final ckhe n() {
        if (this.t == null) {
            this.t = (ckhe) this.f.a().a(ckjq.a);
        }
        ckhe ckheVar = this.t;
        dbsk.s(ckheVar);
        return ckheVar;
    }

    public final ckhe o() {
        if (this.u == null) {
            this.u = (ckhe) this.f.a().a(ckjq.b);
        }
        ckhe ckheVar = this.u;
        dbsk.s(ckheVar);
        return ckheVar;
    }
}
