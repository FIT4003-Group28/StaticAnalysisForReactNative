package defpackage;
/* compiled from: PG */
/* renamed from: byn  reason: default package */
/* loaded from: classes.dex */
public class byn extends cjk<btw, bxd<?>> {
    public byo a;

    public byn(long j) {
        super(j);
    }

    @Override // defpackage.cjk
    protected final /* bridge */ /* synthetic */ void a(btw btwVar, bxd<?> bxdVar) {
        bxd<?> bxdVar2 = bxdVar;
        byo byoVar = this.a;
        if (byoVar == null || bxdVar2 == null) {
            return;
        }
        ((bwl) byoVar).c.a(bxdVar2, true);
    }

    @Override // defpackage.cjk
    protected final /* bridge */ /* synthetic */ int b(bxd<?> bxdVar) {
        bxd<?> bxdVar2 = bxdVar;
        if (bxdVar2 == null) {
            return 1;
        }
        return bxdVar2.c();
    }

    public /* bridge */ /* synthetic */ bxd c(btw btwVar) {
        return (bxd) super.h(btwVar);
    }

    public /* bridge */ /* synthetic */ void d(btw btwVar, bxd bxdVar) {
        bxd bxdVar2 = (bxd) super.g(btwVar, bxdVar);
    }
}
