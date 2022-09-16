package defpackage;

import com.google.protos.youtube.api.innertube.AdPreviewRendererOuterClass;
import com.google.protos.youtube.api.innertube.SkipAdRendererOuterClass;
/* compiled from: PG */
/* renamed from: xih  reason: default package */
/* loaded from: classes4.dex */
public final class xih extends xhz {
    public boolean a;
    private final acti f;
    private final wzx g;

    public xih(acti actiVar, wzx wzxVar) {
        super(xhi.b().a());
        this.f = actiVar;
        this.g = wzxVar;
    }

    private static final aozw a(xhi xhiVar) {
        auwo auwoVar = xhiVar.a;
        if (auwoVar != null) {
            aunb aunbVar = auwoVar.b;
            if (aunbVar == null) {
                aunbVar = aunb.a;
            }
            if (!aunbVar.qn(AdPreviewRendererOuterClass.adPreviewRenderer)) {
                return null;
            }
            aunb aunbVar2 = xhiVar.a.b;
            if (aunbVar2 == null) {
                aunbVar2 = aunb.a;
            }
            return (aozw) aunbVar2.qm(AdPreviewRendererOuterClass.adPreviewRenderer);
        }
        return null;
    }

    private static final auwp f(xhi xhiVar) {
        auwo auwoVar = xhiVar.a;
        if (auwoVar != null) {
            aunb aunbVar = auwoVar.c;
            if (aunbVar == null) {
                aunbVar = aunb.a;
            }
            if (!aunbVar.qn(SkipAdRendererOuterClass.skipButtonRenderer)) {
                return null;
            }
            aunb aunbVar2 = xhiVar.a.c;
            if (aunbVar2 == null) {
                aunbVar2 = aunb.a;
            }
            return (auwp) aunbVar2.qm(SkipAdRendererOuterClass.skipButtonRenderer);
        }
        return null;
    }

    @Override // defpackage.xhz
    public final /* bridge */ /* synthetic */ void b(Object obj, boolean z) {
        xhi xhiVar = (xhi) obj;
        xdb xdbVar = xhiVar.i;
        if (xdbVar != ((xhi) this.b).i) {
            ((xhr) this.c).f(xdbVar);
        }
        if (!xhiVar.c.equals(((xhi) this.b).c)) {
            ((xhr) this.c).e(xhiVar.c);
        }
        if (!xhiVar.c.equals(((xhi) this.b).c)) {
            ((xhr) this.c).e(xhiVar.c);
        }
        xhi xhiVar2 = (xhi) this.b;
        int i = xhiVar2.d;
        int i2 = xhiVar.d;
        if (i != i2 || xhiVar2.e != xhiVar.e) {
            xhr xhrVar = (xhr) this.c;
            boolean z2 = true;
            if (!this.a && !xhiVar.e) {
                z2 = false;
            }
            xhrVar.j(i2, z2);
        }
        int i3 = xhiVar.g;
        if (i3 != ((xhi) this.b).g && i3 != -1 && xhiVar.d == 0) {
            ((xhr) this.c).d(i3);
        }
        int i4 = xhiVar.h;
        if (i4 != ((xhi) this.b).h && i4 != -1) {
            ((xhr) this.c).c(i4);
        }
        float f = xhiVar.f;
        if (f != ((xhi) this.b).f) {
            ((xhr) this.c).k(f);
        }
        auwp f2 = f(xhiVar);
        if (!akzj.f(f((xhi) this.b), f2)) {
            ((xhr) this.c).i(f2);
            if (f2 != null) {
                this.f.D(new acte(f2.e));
            }
        }
        aozw a = a(xhiVar);
        if (!akzj.f(a((xhi) this.b), a)) {
            ((xhr) this.c).h(a);
            if (a != null) {
                this.f.D(new acte(a.g));
            }
        }
        if (!xhiVar.b.equals(((xhi) this.b).b) && !xhiVar.b.equals(xho.a)) {
            ((xhr) this.c).l(xhiVar.b, xhiVar.l, this.g.f);
            if (xhiVar.m) {
                ((xhr) this.c).g(xhiVar.n, xhiVar.o);
            }
        }
        if (this.d == z || !z) {
            return;
        }
        ((xhr) this.c).b();
    }

    @Override // defpackage.xhz
    public final void d() {
    }
}
