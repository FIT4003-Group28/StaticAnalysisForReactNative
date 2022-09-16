package defpackage;
/* compiled from: PG */
/* renamed from: hhh  reason: default package */
/* loaded from: classes3.dex */
abstract class hhh implements ampg {
    public abstract void a(axbm axbmVar, aqsl aqslVar);

    @Override // defpackage.ampg
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        axbm axbmVar = (axbm) obj;
        aqsl a = aqsq.a();
        if (axbmVar.x()) {
            Object apply = hhs.a.apply(axbmVar.i());
            a.copyOnWrite();
            ((aqsq) a.instance).j((aqsp) apply);
        }
        if (axbmVar.w()) {
            Object apply2 = hhs.b.apply(axbmVar.f());
            a.copyOnWrite();
            ((aqsq) a.instance).i((aqsm) apply2);
        }
        if (axbmVar.z()) {
            int d = axbmVar.d();
            a.copyOnWrite();
            ((aqsq) a.instance).k(d);
        }
        if (axbmVar.v()) {
            a(axbmVar, a);
        }
        return (aqsq) a.mo39build();
    }
}
