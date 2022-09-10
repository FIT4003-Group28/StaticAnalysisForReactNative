package defpackage;

import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: iny  reason: default package */
/* loaded from: classes6.dex */
public final class iny {
    private static final dcqe c = dcqe.c("iny");
    private final dbty<List<ioo>> a;
    private final dcdc<ioa> b;
    private boolean e;
    private boolean d = false;
    private dcdc<ilo> f = dcdc.e();

    public iny(dbty<List<ioo>> dbtyVar, dcdc<ioa> dcdcVar) {
        this.a = dbtyVar;
        this.b = dcdcVar;
    }

    public final void a() {
        this.e = true;
        dcdc<ioa> dcdcVar = this.b;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            dcdcVar.get(i).a();
        }
    }

    public final void b() {
        this.e = false;
        dcdc<ioa> dcdcVar = this.b;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            dcdcVar.get(i).b();
        }
    }

    public final void c() {
        dcdc<ioa> dcdcVar = this.b;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            dcdcVar.get(i).c();
        }
    }

    public final void d(Iterable<ilo> iterable) {
        this.d = false;
        this.f = dcdc.q(iterable);
    }

    public final void e(boolean z) {
        inx c2;
        if (this.e) {
            dcdc r = dcdc.r(this.a.a());
            dcdc q = dcdc.q(dcft.o(r, inr.a));
            if (q.isEmpty() || ((Integer) Collections.max(q)).intValue() < this.f.size()) {
                dcdc w = dcdc.w(dcmw.a.g(ins.a), r);
                dcdc q2 = dcdc.q(dcft.o(w, inu.a));
                if (!dcft.k(w, inv.a)) {
                    q2 = q2.subList(0, w.size() - 1);
                }
                c2 = inx.c(q, q2);
            } else {
                bvoo.h("The provided visible place cards do not correspond to the current set of placemarks.", new Object[0]);
                c2 = inx.c(dcdc.e(), dcdc.e());
            }
            dcdc<ioa> dcdcVar = this.b;
            int size = dcdcVar.size();
            for (int i = 0; i < size; i++) {
                dcdcVar.get(i).d(c2, dcdc.r(this.f), z);
            }
            this.d = true;
        }
    }

    public final cqqw f() {
        return new inw(this);
    }

    public final void g() {
        if (this.d) {
            e(true);
        }
    }
}
