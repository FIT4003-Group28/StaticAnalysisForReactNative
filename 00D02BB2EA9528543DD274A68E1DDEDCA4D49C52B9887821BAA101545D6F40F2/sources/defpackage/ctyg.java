package defpackage;
/* compiled from: PG */
/* renamed from: ctyg  reason: default package */
/* loaded from: classes5.dex */
final class ctyg extends ctyi {
    private dbsg<Integer> a = dbpy.a;
    private dbsg<Integer> b = dbpy.a;

    @Override // defpackage.ctyi
    public final ctyj a() {
        return new ctyh(this.a, this.b);
    }

    @Override // defpackage.ctyi
    public final void b(int i) {
        this.b = dbsg.i(Integer.valueOf(i));
    }

    @Override // defpackage.ctyi
    public final void c(int i) {
        this.a = dbsg.i(Integer.valueOf(i));
    }
}
