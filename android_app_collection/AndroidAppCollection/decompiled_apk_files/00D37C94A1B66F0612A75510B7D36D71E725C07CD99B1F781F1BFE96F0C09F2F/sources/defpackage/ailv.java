package defpackage;

import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.Set;
import java.util.concurrent.ExecutionException;
/* compiled from: PG */
/* renamed from: ailv  reason: default package */
/* loaded from: classes.dex */
public final class ailv extends aars {
    private final aimy a;
    private final ainh b;
    private final snc c;
    private final aenl g;

    public ailv(aaqf aaqfVar, aimy aimyVar, ainh ainhVar, yqw yqwVar, snc sncVar, aenl aenlVar) {
        super(aaqfVar, yqwVar);
        this.a = aimyVar;
        this.b = ainhVar;
        sncVar.getClass();
        this.c = sncVar;
        this.g = aenlVar;
    }

    public final PlayerResponseModel a(aina ainaVar) {
        ylr.b();
        afze d = afze.d();
        b(ainaVar, d, null, null, false, null);
        try {
            return (PlayerResponseModel) d.get();
        } catch (InterruptedException | ExecutionException e) {
            throw new aart(e);
        }
    }

    public final void b(aina ainaVar, afzf afzfVar, String str, final aanr aanrVar, boolean z, acvg acvgVar) {
        ampq j;
        aaqk a;
        aenl aenlVar;
        long d = this.c.d();
        ainh ainhVar = this.b;
        aanz aanzVar = (aanz) ainhVar.a.get();
        aanzVar.getClass();
        Set set = (Set) ainhVar.b.get();
        set.getClass();
        aing aingVar = new aing(aanzVar, set, afzfVar, str, d);
        aimy aimyVar = this.a;
        aadd aaddVar = aimyVar.c;
        zdz zdzVar = aimyVar.b;
        arhd a2 = aaddVar.a();
        if (a2 == null) {
            j = amon.a;
        } else {
            auaf auafVar = a2.j;
            if (auafVar == null) {
                auafVar = auaf.a;
            }
            aubv aubvVar = auafVar.r;
            if (aubvVar == null) {
                aubvVar = aubv.a;
            }
            if (aubvVar.b == 0) {
                j = amon.a;
            } else {
                aaqq a3 = aaqr.a(zdzVar);
                a3.b = zdzVar.b(new zea(aubvVar.c * 1000, aubvVar.d * 1000, Long.MAX_VALUE, aubvVar.b * 1000, 2.0d));
                j = ampq.j(a3.a());
            }
        }
        if (j.h()) {
            a = aimyVar.a.b(ainaVar, asaj.a, aingVar, agvc.k, aery.i, (aaqr) j.c());
        } else {
            a = aimyVar.a.a(ainaVar, asaj.a, aingVar, agvc.k, aery.i);
        }
        final aaqk aaqkVar = a;
        if (z) {
            ylr.b();
            aaqkVar.qA();
            try {
                aaqkVar.f();
            } catch (ceq unused) {
            }
            aaqkVar.t();
            aaqkVar.l();
        }
        if (aanrVar == null || (aenlVar = this.g) == null) {
            this.f.a(aaqkVar);
            return;
        }
        final yqw yqwVar = this.f;
        final aenk aenkVar = (aenk) aenlVar;
        final aflm b = aenkVar.b(acvgVar);
        b.V();
        boolean z2 = !aanrVar.j;
        final aeuo a4 = aenkVar.j.a(aanrVar.b);
        aenv aenvVar = new aenv(aenkVar.h, aanrVar.b, aenkVar.f);
        try {
            aenc i = aeny.i(((aenk) aenlVar).c, ((aenk) aenlVar).i, ((aenk) aenlVar).d);
            if (aanrVar.g == null) {
                aenkVar.c(yqwVar, aaqkVar);
                return;
            }
            final aelb a5 = aenkVar.a(aanrVar.b, aenvVar, afeu.g(i), b, aaqkVar, aanrVar);
            if (z) {
                aenkVar.e(yqwVar, aanrVar, aaqkVar, a5, a4, b);
            } else {
                aenkVar.b.execute(new Runnable() { // from class: aeng
                    @Override // java.lang.Runnable
                    public final void run() {
                        aenk.this.e(yqwVar, aanrVar, aaqkVar, a5, a4, b);
                    }
                });
            }
        } catch (aenw e) {
            int i2 = e.a;
            int i3 = i2 - 1;
            if (i2 == 0) {
                throw null;
            }
            if (i3 == 0) {
                aenvVar.c("unavailable.hotconfig", e);
            } else if (i3 == 1) {
                aenvVar.c("unavailable.keyexpired", e);
            }
            if (!z2) {
                return;
            }
            aenkVar.c(yqwVar, aaqkVar);
        }
    }
}
