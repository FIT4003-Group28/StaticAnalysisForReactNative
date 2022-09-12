package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: wfw  reason: default package */
/* loaded from: classes7.dex */
public class wfw implements wfn {
    public final cjqq a;
    public final cjqy b;
    public final cjtd d;
    public cjql e;
    @dzsi
    public axuc f;
    private final dxio<wgb> h;
    private final Runnable i;
    private final Runnable j;
    private final wfz k;
    @dzsi
    private final wfv l;
    @dzsi
    private final wfv m;
    private final cqqw g = new wft(this);
    public final List<bxsz> c = new ArrayList();
    private final boolean n = false;

    public wfw(gga ggaVar, final dxio<axwy> dxioVar, dxio<wgb> dxioVar2, cjqq cjqqVar, cjqy cjqyVar, boolean z, wfz wfzVar) {
        this.h = dxioVar2;
        this.a = cjqqVar;
        this.b = cjqyVar;
        this.k = wfzVar;
        this.d = cjtd.a(wfzVar.a());
        cjtd.a(wfzVar.b());
        Runnable runnable = new Runnable(dxioVar) { // from class: wfo
            private final dxio a;

            {
                this.a = dxioVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ((axwy) this.a.a()).o();
            }
        };
        this.i = runnable;
        Runnable runnable2 = new Runnable(this, dxioVar) { // from class: wfp
            private final wfw a;
            private final dxio b;

            {
                this.a = this;
                this.b = dxioVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                wfw wfwVar = this.a;
                dxio dxioVar3 = this.b;
                axwv n = axww.n();
                n.b(dndr.NICKNAME);
                axuc axucVar = wfwVar.f;
                if (axucVar != null) {
                    ((axvv) n).d = axucVar;
                }
                ((axwy) dxioVar3.a()).L(n.h());
            }
        };
        this.j = runnable2;
        this.l = new wfv(ggaVar, wfzVar.b(), new dbty(this) { // from class: wfq
            private final wfw a;

            {
                this.a = this;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return Integer.valueOf(this.a.c.size());
            }
        }, runnable, wfu.EDIT);
        this.m = new wfv(ggaVar, wfzVar.c(), new dbty(this) { // from class: wfr
            private final wfw a;

            {
                this.a = this;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return Integer.valueOf(this.a.c.size());
            }
        }, runnable2, wfu.ADD);
    }

    @Override // defpackage.wfn
    public Boolean a() {
        return Boolean.valueOf(!this.c.isEmpty());
    }

    @Override // defpackage.wfn
    public Boolean b() {
        return false;
    }

    @Override // defpackage.wfn
    @dzsi
    public bxsz c() {
        return this.l;
    }

    @Override // defpackage.wfn
    @dzsi
    public bxsz d() {
        return null;
    }

    @Override // defpackage.wfn
    public List<bxsz> e() {
        return this.c;
    }

    @Override // defpackage.wfn
    public cqfd f() {
        return new cqfd(this) { // from class: wfs
            private final wfw a;

            {
                this.a = this;
            }

            @Override // defpackage.cqfd
            public final boolean a(View view) {
                wfw wfwVar = this.a;
                if (wfwVar.e == null) {
                    wfwVar.e = wfwVar.a.f(view).d(wfwVar.d);
                    return true;
                }
                return true;
            }
        };
    }

    @Override // defpackage.wfn
    public cqqw g() {
        return this.g;
    }

    public void h(List<bxsz> list, List<azva> list2, bxsj bxsjVar, axuc axucVar) {
        this.c.clear();
        this.c.addAll(list);
        this.f = axucVar;
        int i = 0;
        for (azva azvaVar : list2) {
            if (azvaVar != null) {
                List<bxsz> list3 = this.c;
                wgb a = this.h.a();
                ddho h = this.k.h();
                int size = this.c.size();
                gga a2 = a.a.a();
                wgb.a(a2, 1);
                gft gftVar = (gft) ((dxjd) a.b).a;
                wgb.a(gftVar, 2);
                wgb.a(azvaVar, 3);
                wgb.a(bxsjVar, 4);
                wgb.a(h, 5);
                list3.add(new wga(a2, gftVar, azvaVar, bxsjVar, h, size, i));
                i++;
            }
        }
        cqkx.p(this);
    }
}
