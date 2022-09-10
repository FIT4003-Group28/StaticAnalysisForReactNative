package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: avun  reason: default package */
/* loaded from: classes3.dex */
final class avun implements akzt {
    final /* synthetic */ awni a;
    final /* synthetic */ List b;
    final /* synthetic */ avuo c;

    public avun(avuo avuoVar, awni awniVar, List list) {
        this.c = avuoVar;
        this.a = awniVar;
        this.b = list;
    }

    @Override // defpackage.akzt
    public final void a() {
    }

    @Override // defpackage.akzt
    public final void b() {
        awni awniVar = this.a;
        akzh b = this.c.c.a().b();
        dcdc<akqs> r = dcdc.r(this.b);
        awnh awnhVar = awniVar.a;
        awnhVar.a = b;
        awnhVar.b = r;
        awniVar.invalidate();
    }

    @Override // defpackage.akzt
    public final void c() {
    }
}
