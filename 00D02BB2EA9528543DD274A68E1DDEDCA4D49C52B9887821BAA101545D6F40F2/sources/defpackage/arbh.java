package defpackage;
/* compiled from: PG */
/* renamed from: arbh  reason: default package */
/* loaded from: classes.dex */
public final class arbh implements btrr {
    final /* synthetic */ arbi a;

    public arbh(arbi arbiVar) {
        this.a = arbiVar;
    }

    public static final float c(float f, float f2, float f3) {
        return ahrr.b(f2 + (f3 * akrb.h(f2, f)), 0.0f, 360.0f);
    }

    @Override // defpackage.btrr
    public final void a(btrm btrmVar) {
        dceq a = dcet.a();
        a.b(ahld.class, new arbk(ahld.class, this));
        btrmVar.g(this, a.a());
    }

    @Override // defpackage.btrr
    public final void b(btrm btrmVar) {
        btrmVar.a(this);
    }
}
