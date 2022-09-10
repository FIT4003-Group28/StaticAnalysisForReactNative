package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: yun  reason: default package */
/* loaded from: classes7.dex */
public final class yun {
    public final int a;
    public final int d;
    private final dvzn e;
    private final akqq f;
    private akrk g;
    private alxh h;
    public boolean c = true;
    public final dcen<drij> b = dcep.N();

    public yun(int i, dvzn dvznVar, int i2, akqq akqqVar) {
        this.a = i;
        this.e = dvznVar;
        this.d = i2;
        this.f = akqqVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final akrk a() {
        if (this.g == null) {
            this.g = akrk.h(this.e);
        }
        return this.g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final alxh b() {
        if (this.h == null) {
            this.h = new alxh(a());
        }
        return this.h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @dzsi
    public final akrn c() {
        return bzlt.b(b(), this.f, 250.0d);
    }
}
