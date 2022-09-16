package defpackage;

import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
/* compiled from: PG */
/* renamed from: abeb  reason: default package */
/* loaded from: classes.dex */
public final class abeb extends aars implements aari {
    public final aadd a;
    public final abdz b;
    public final zdz c;
    private final abec g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abeb(aaqf aaqfVar, ampq ampqVar, azqb azqbVar, aadd aaddVar, abec abecVar, abdz abdzVar, zdz zdzVar) {
        super(aaqfVar, (yqw) ampqVar.d(new uvy(azqbVar, 4)));
        azqbVar.getClass();
        this.g = abecVar;
        this.b = abdzVar;
        this.a = aaddVar;
        this.c = zdzVar;
    }

    public static aaqr e(aadd aaddVar, zdz zdzVar) {
        if (zdzVar == null) {
            return null;
        }
        aaqq a = aaqr.a(zdzVar);
        a.a = zbx.f;
        athe atheVar = aaddVar.a().f;
        if (atheVar == null) {
            atheVar = athe.a;
        }
        final awet awetVar = atheVar.l;
        if (awetVar == null) {
            awetVar = awet.a;
        }
        if (awetVar.b) {
            a.b = zdzVar.b(new zea(awetVar.d, awetVar.e, awetVar.f, awetVar.c, awetVar.g));
            a.b(new ampt() { // from class: abdy
                @Override // defpackage.ampt
                public final boolean a(Object obj) {
                    awet awetVar2 = awet.this;
                    cff cffVar = (cff) obj;
                    if (yhq.a(cffVar)) {
                        return true;
                    }
                    return awetVar2.h.contains(Integer.valueOf(cffVar.b.a));
                }
            });
        }
        return a.a();
    }

    @Override // defpackage.aari
    public final void b(aaqs aaqsVar, aarh aarhVar, afzf afzfVar) {
        this.b.k((abed) aaqsVar, aarhVar, afzfVar, e(this.a, this.c));
    }

    public final WatchNextResponseModel d(abed abedVar) {
        aaqr e = e(this.a, this.c);
        abdz abdzVar = this.b;
        ylr.b();
        afze d = afze.d();
        abdzVar.f(abedVar, d, e);
        aoqu aoquVar = (aoqu) ylx.d(d, aapz.g);
        abdzVar.l(aoquVar);
        return (WatchNextResponseModel) abdzVar.h(aoquVar);
    }

    @Override // defpackage.aari
    /* renamed from: f */
    public final abed a(ajfz ajfzVar) {
        abed b = this.g.b();
        b.d = abed.g(ajfzVar.b());
        b.k(ajfzVar.d());
        return b;
    }
}
