package defpackage;

import java.util.LinkedList;
import java.util.Queue;
/* compiled from: PG */
/* renamed from: cgtw  reason: default package */
/* loaded from: classes4.dex */
public class cgtw {
    public final cgen a;
    @dzsi
    public cgtu c;
    private final btpc d;
    private final cgtp e;
    private final cgtr f;
    @dzsi
    private cgtt h;
    private final Queue<cgtt> g = new LinkedList();
    boolean b = false;

    public cgtw(btpc btpcVar, cgen cgenVar, cgtp cgtpVar, cgtr cgtrVar) {
        this.d = btpcVar;
        this.a = cgenVar;
        this.e = cgtpVar;
        this.f = cgtrVar;
    }

    public final void a(cgtt cgttVar) {
        if (this.h != null) {
            this.g.offer(cgttVar);
            return;
        }
        this.h = cgttVar;
        this.c = cgttVar.c();
        if (!this.d.i()) {
            b(cgttVar.a(), btzy.k);
            return;
        }
        cgtv cgtvVar = cgtv.CREATE_UGC_TASK_PLACE_REMINDER;
        int ordinal = cgttVar.a().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                String b = cgttVar.b();
                dhvj bZ = dhvk.d.bZ();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dhvk dhvkVar = (dhvk) bZ.b;
                b.getClass();
                dhvkVar.a = 1 | dhvkVar.a;
                dhvkVar.b = b;
                dwpe o = this.a.o();
                if (o != null) {
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dhvk dhvkVar2 = (dhvk) bZ.b;
                    o.getClass();
                    dhvkVar2.c = o;
                    dhvkVar2.a |= 2;
                }
                cgtr cgtrVar = this.f;
                cgre.i(cgtrVar.a, cgtrVar.c, bZ.bK());
                return;
            }
            b(cgttVar.a(), btzy.l);
            return;
        }
        String b2 = cgttVar.b();
        dhsj bZ2 = dhsk.d.bZ();
        dwqh bZ3 = dwqi.c.bZ();
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dwqi dwqiVar = (dwqi) bZ3.b;
        b2.getClass();
        dwqiVar.a |= 1;
        dwqiVar.b = b2;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dhsk dhskVar = (dhsk) bZ2.b;
        dwqi bK = bZ3.bK();
        bK.getClass();
        dsrj<dwqi> dsrjVar = dhskVar.b;
        if (!dsrjVar.a()) {
            dhskVar.b = dsqw.cl(dsrjVar);
        }
        dhskVar.b.add(bK);
        dwpe o2 = this.a.o();
        if (o2 != null) {
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dhsk dhskVar2 = (dhsk) bZ2.b;
            o2.getClass();
            dhskVar2.c = o2;
            dhskVar2.a |= 1;
        }
        cgtp cgtpVar = this.e;
        cgre.i(cgtpVar.a, cgtpVar.c, bZ2.bK());
    }

    public final void b(cgtv cgtvVar, @dzsi btzy btzyVar) {
        if (btzyVar == null) {
            return;
        }
        cgtu cgtuVar = this.c;
        if (cgtuVar != null) {
            this.b = true;
            cgtuVar.d(cgtvVar, btzyVar);
            return;
        }
        c();
    }

    public final void c() {
        this.h = null;
        this.c = null;
        cgtt poll = this.g.poll();
        if (poll != null) {
            a(poll);
        }
    }

    public final void d() {
        if (!this.b) {
            return;
        }
        this.b = false;
        c();
    }
}
