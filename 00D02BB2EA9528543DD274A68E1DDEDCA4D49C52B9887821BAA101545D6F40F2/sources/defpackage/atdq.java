package defpackage;
/* compiled from: PG */
/* renamed from: atdq  reason: default package */
/* loaded from: classes2.dex */
public final class atdq<T> extends btrh<T> {
    public atdq(Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        boolean i;
        atlq atlqVar;
        atlq atlqVar2;
        gdt gdtVar = (gdt) obj;
        atdp atdpVar = ((atdo) this.a).a;
        gga ggaVar = atdpVar.c;
        asmm asmmVar = atdpVar.a;
        boolean z = false;
        if (atdpVar.d.b()) {
            i = false;
        } else {
            atlq atlqVar3 = atdpVar.e;
            i = (atlqVar3 == null || !atlqVar3.b()) ? true : vxx.i(atdpVar.e.m.g().a.h);
        }
        boolean z2 = atdpVar.h() && (atlqVar2 = atdpVar.e) != null && atlqVar2.g == astb.NO_SEARCH && atdpVar.i() <= 0;
        if (atdpVar.h() && (atlqVar = atdpVar.e) != null && atlqVar.g != astb.NO_SEARCH && atdpVar.i() <= 0) {
            z = true;
        }
        aslt.g(ggaVar, asmmVar, i, z2, z, !atdpVar.d.b(), atdpVar.i());
    }
}
