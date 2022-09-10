package defpackage;
/* compiled from: PG */
/* renamed from: cuev  reason: default package */
/* loaded from: classes5.dex */
public final class cuev extends cuii {
    public dbsg<Long> a = dbpy.a;
    public dbsg<String> b = dbpy.a;
    private dbsg<String> f = dbpy.a;
    public dbsg<Long> c = dbpy.a;
    public dbsg<Long> d = dbpy.a;
    public dbsg<String> e = dbpy.a;
    private dbsg<cuij> g = dbpy.a;

    @Override // defpackage.cuii
    public final cuil a() {
        return new cuew(this.a, this.b, this.f, this.c, this.d, this.e, this.g);
    }

    @Override // defpackage.cuii
    public final void b(String str) {
        this.f = dbsg.i(str);
    }

    @Override // defpackage.cuii
    public final void c(cuij cuijVar) {
        this.g = dbsg.i(cuijVar);
    }
}
