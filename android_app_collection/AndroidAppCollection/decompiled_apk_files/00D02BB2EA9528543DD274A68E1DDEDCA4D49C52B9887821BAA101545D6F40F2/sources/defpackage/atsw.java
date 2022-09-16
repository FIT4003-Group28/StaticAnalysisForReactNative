package defpackage;
/* compiled from: PG */
/* renamed from: atsw  reason: default package */
/* loaded from: classes2.dex */
final class atsw implements atsn {
    final /* synthetic */ boolean a;
    final /* synthetic */ atsx b;

    public atsw(atsx atsxVar, boolean z) {
        this.b = atsxVar;
        this.a = z;
    }

    @Override // defpackage.atsn
    public final void a(boolean z) {
        boolean z2 = this.a;
        dqum b = dqum.b(((crpv) this.b.e).a.b);
        if (b == null) {
            b = dqum.REROUTE_TYPE_BETTER_ETA;
        }
        this.b.g.b(new crhg(z2, z, b));
    }
}
