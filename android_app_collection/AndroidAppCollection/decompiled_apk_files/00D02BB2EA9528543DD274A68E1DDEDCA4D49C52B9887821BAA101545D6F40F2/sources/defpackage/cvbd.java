package defpackage;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: cvbd  reason: default package */
/* loaded from: classes5.dex */
final class cvbd implements cusr<cusv> {
    final /* synthetic */ int a;
    final /* synthetic */ cvag b;
    final /* synthetic */ cvbh c;
    final /* synthetic */ AtomicBoolean[] d;
    final /* synthetic */ int e;
    final /* synthetic */ AtomicInteger f;
    final /* synthetic */ boolean g;
    final /* synthetic */ dccx h;
    final /* synthetic */ cvbi i;

    public cvbd(cvbi cvbiVar, int i, cvag cvagVar, cvbh cvbhVar, AtomicBoolean[] atomicBooleanArr, int i2, AtomicInteger atomicInteger, boolean z, dccx dccxVar) {
        this.i = cvbiVar;
        this.a = i;
        this.b = cvagVar;
        this.c = cvbhVar;
        this.d = atomicBooleanArr;
        this.e = i2;
        this.f = atomicInteger;
        this.g = z;
        this.h = dccxVar;
    }

    @Override // defpackage.cusr
    public final /* bridge */ /* synthetic */ void a(cusv cusvVar) {
        cusv cusvVar2 = cusvVar;
        if (this.a != this.i.g.get()) {
            return;
        }
        cvag cvagVar = this.b;
        List<cufj> list = (List) cusvVar2.a(this.c.f);
        if (list == null) {
            throw new NullPointerException("Null participants");
        }
        ((cuzy) cvagVar).d = list;
        ((cuzy) this.b).b = Integer.valueOf(((Integer) cusvVar2.a(this.c.d)).intValue());
        cvag cvagVar2 = this.b;
        cufp cufpVar = (cufp) cusvVar2.a(this.c.e);
        if (cufpVar == null) {
            throw new NullPointerException("Null conversation");
        }
        ((cuzy) cvagVar2).a = cufpVar;
        if (!((dcdc) cusvVar2.a(this.c.c)).isEmpty()) {
            ((cuzy) this.b).c = dbsg.i((cugu) ((dcdc) cusvVar2.a(this.c.c)).get(0));
        }
        if (this.d[this.e].compareAndSet(false, true)) {
            this.f.decrementAndGet();
        }
        if (this.f.get() < 0) {
            cstl.a("ConvListPresenter");
        } else if (this.f.get() != 0) {
        } else {
            this.i.d.a(this.g, dcdc.r(dchl.k(this.h.f(), cvbc.a)));
        }
    }
}
