package defpackage;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: lyb  reason: default package */
/* loaded from: classes7.dex */
public final class lyb implements lyd {
    final /* synthetic */ lye a;
    @dzsi
    private final List<amvh> b;

    public lyb(@dzsi lye lyeVar, List<amvh> list) {
        this.a = lyeVar;
        this.b = list;
    }

    @Override // defpackage.lyd
    public final void a() {
        asby e = asbz.e();
        e.d(dqvj.DRIVE);
        List<amvh> list = this.b;
        if (list != null) {
            e.c(list);
        }
        crfm crfmVar = this.a.c;
        crfn b = crfn.b(e.a());
        b.b = lye.m();
        crfmVar.c(b.c());
    }

    @Override // defpackage.lyd
    public final arym b() {
        return arym.FREE_NAV;
    }

    @Override // defpackage.lyd
    public final void c() {
    }

    @Override // defpackage.lyd
    public final void d() {
    }
}
