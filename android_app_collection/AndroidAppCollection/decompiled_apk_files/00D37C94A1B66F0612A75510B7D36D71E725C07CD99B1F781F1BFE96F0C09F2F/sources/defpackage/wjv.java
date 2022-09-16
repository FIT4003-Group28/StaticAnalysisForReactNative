package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import j$.util.Optional;
import java.security.SecureRandom;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: PG */
/* renamed from: wjv  reason: default package */
/* loaded from: classes4.dex */
public final class wjv implements axou {
    private final azqb a;
    private final azqb b;
    private final azqb c;
    private final azqb d;
    private final azqb e;
    private final azqb f;
    private final azqb g;
    private final azqb h;
    private final azqb i;
    private final /* synthetic */ int j;

    public wjv(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, azqb azqbVar8, azqb azqbVar9) {
        this.a = azqbVar;
        this.b = azqbVar2;
        this.c = azqbVar3;
        this.d = azqbVar4;
        this.e = azqbVar5;
        this.f = azqbVar6;
        this.g = azqbVar7;
        this.h = azqbVar8;
        this.i = azqbVar9;
    }

    public wjv(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, azqb azqbVar8, azqb azqbVar9, int i) {
        this.j = i;
        this.f = azqbVar;
        this.i = azqbVar2;
        this.b = azqbVar3;
        this.c = azqbVar4;
        this.h = azqbVar5;
        this.g = azqbVar6;
        this.e = azqbVar7;
        this.d = azqbVar8;
        this.a = azqbVar9;
    }

    public wjv(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, azqb azqbVar8, azqb azqbVar9, int i, byte[] bArr) {
        this.j = i;
        this.e = azqbVar;
        this.a = azqbVar2;
        this.f = azqbVar3;
        this.h = azqbVar4;
        this.c = azqbVar5;
        this.i = azqbVar6;
        this.d = azqbVar7;
        this.b = azqbVar8;
        this.g = azqbVar9;
    }

    public wjv(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, azqb azqbVar8, azqb azqbVar9, int i, char[] cArr) {
        this.j = i;
        this.i = azqbVar;
        this.c = azqbVar2;
        this.g = azqbVar3;
        this.f = azqbVar4;
        this.a = azqbVar5;
        this.d = azqbVar6;
        this.h = azqbVar7;
        this.b = azqbVar8;
        this.e = azqbVar9;
    }

    public wjv(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, azqb azqbVar8, azqb azqbVar9, int i, float[] fArr) {
        this.j = i;
        this.e = azqbVar;
        this.b = azqbVar2;
        this.i = azqbVar3;
        this.h = azqbVar4;
        this.f = azqbVar5;
        this.c = azqbVar6;
        this.g = azqbVar7;
        this.d = azqbVar8;
        this.a = azqbVar9;
    }

    public wjv(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, azqb azqbVar8, azqb azqbVar9, int i, int[] iArr) {
        this.j = i;
        this.h = azqbVar;
        this.d = azqbVar2;
        this.g = azqbVar3;
        this.i = azqbVar4;
        this.e = azqbVar5;
        this.a = azqbVar6;
        this.b = azqbVar7;
        this.f = azqbVar8;
        this.c = azqbVar9;
    }

    public wjv(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, azqb azqbVar8, azqb azqbVar9, int i, short[] sArr) {
        this.j = i;
        this.d = azqbVar;
        this.b = azqbVar2;
        this.f = azqbVar3;
        this.h = azqbVar4;
        this.e = azqbVar5;
        this.i = azqbVar6;
        this.a = azqbVar7;
        this.c = azqbVar8;
        this.g = azqbVar9;
    }

    public wjv(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, azqb azqbVar8, azqb azqbVar9, int i, boolean[] zArr) {
        this.j = i;
        this.i = azqbVar;
        this.g = azqbVar2;
        this.h = azqbVar3;
        this.f = azqbVar4;
        this.c = azqbVar5;
        this.a = azqbVar6;
        this.e = azqbVar7;
        this.d = azqbVar8;
        this.b = azqbVar9;
    }

    public wjv(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, azqb azqbVar8, azqb azqbVar9, int i, byte[][] bArr) {
        this.j = i;
        this.g = azqbVar;
        this.c = azqbVar2;
        this.a = azqbVar3;
        this.e = azqbVar4;
        this.d = azqbVar5;
        this.i = azqbVar6;
        this.b = azqbVar7;
        this.f = azqbVar8;
        this.h = azqbVar9;
    }

    public static wjv a(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, azqb azqbVar8, azqb azqbVar9) {
        return new wjv(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, azqbVar6, azqbVar7, azqbVar8, azqbVar9);
    }

    public static wwy b(wkn wknVar, snc sncVar, yve yveVar, yrj yrjVar, wwk wwkVar, aikh aikhVar, aiji aijiVar, azqb azqbVar, zah zahVar) {
        wwy wwyVar = new wwy(sncVar, yveVar, yrjVar);
        wwkVar.getClass();
        wwyVar.a = wwkVar;
        azqbVar.getClass();
        wwyVar.e = azqbVar;
        wwyVar.h = aikhVar;
        wwyVar.g = aijiVar;
        if (wknVar.h) {
            wwyVar.f = zahVar;
        }
        return wwyVar;
    }

    public static wmh c(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, yni yniVar, wwf wwfVar, aadd aaddVar) {
        return new wmh(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, azqbVar6, yniVar, aaddVar);
    }

    public static abec d(ampq ampqVar, aaqj aaqjVar, aaqf aaqfVar, afvn afvnVar, aacz aaczVar, aadd aaddVar, Set set, axwp axwpVar, anhn anhnVar) {
        return new abec(ampqVar, aaqjVar, aaqfVar, afvnVar, aaczVar, aaddVar, set, axwpVar);
    }

    public static acrp e(Object obj, afug afugVar, afvn afvnVar, snc sncVar, zah zahVar, ykw ykwVar, Optional optional) {
        return new acrp((acrs) obj, afugVar, afvnVar, sncVar, zahVar, ykwVar, optional);
    }

    public static aepl f(aant aantVar, aadd aaddVar, aepv aepvVar, aeqt aeqtVar, ScheduledExecutorService scheduledExecutorService, ywk ywkVar, axnm axnmVar, axnm axnmVar2, axnm axnmVar3) {
        if (ywkVar.l(ywk.G)) {
            return new aepr(aantVar.get(), aepvVar, aeqtVar, aaddVar, scheduledExecutorService, axnmVar, axnmVar2, axnmVar3);
        }
        return new aepo(aantVar, aepvVar, aaddVar);
    }

    public static aimy g(aaqj aaqjVar, aaqf aaqfVar, ainb ainbVar, afvn afvnVar, String str, yni yniVar, aacz aaczVar, aadd aaddVar, zdz zdzVar) {
        return new aimy(aaqjVar, aaqfVar, ainbVar, afvnVar, str, yniVar, aaczVar, aaddVar, zdzVar);
    }

    public static wjv h(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, azqb azqbVar8, azqb azqbVar9) {
        return new wjv(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, azqbVar6, azqbVar7, azqbVar8, azqbVar9, 2, (byte[]) null);
    }

    public static wjv i(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, azqb azqbVar8, azqb azqbVar9) {
        return new wjv(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, azqbVar6, azqbVar7, azqbVar8, azqbVar9, 3, (char[]) null);
    }

    public static wjv j(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, azqb azqbVar8, azqb azqbVar9) {
        return new wjv(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, azqbVar6, azqbVar7, azqbVar8, azqbVar9, 4, (short[]) null);
    }

    public static wjv k(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, azqb azqbVar8, azqb azqbVar9) {
        return new wjv(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, azqbVar6, azqbVar7, azqbVar8, azqbVar9, 5, (int[]) null);
    }

    public static wjv l(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, azqb azqbVar8, azqb azqbVar9) {
        return new wjv(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, azqbVar6, azqbVar7, azqbVar8, azqbVar9, 6, (boolean[]) null);
    }

    public static wjv m(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, azqb azqbVar8, azqb azqbVar9) {
        return new wjv(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, azqbVar6, azqbVar7, azqbVar8, azqbVar9, 7, (float[]) null);
    }

    public static wjv n(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, azqb azqbVar8, azqb azqbVar9) {
        return new wjv(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, azqbVar6, azqbVar7, azqbVar8, azqbVar9, 8, (byte[][]) null);
    }

    @Override // defpackage.azqb
    public final /* bridge */ /* synthetic */ Object get() {
        switch (this.j) {
            case 0:
                return b((wkn) ((axov) this.a).a, (snc) this.b.get(), (yve) this.c.get(), (yrj) this.d.get(), (wwk) this.e.get(), (aikh) this.f.get(), (aiji) this.g.get(), this.h, (zah) this.i.get());
            case 1:
                return new wfn(axot.a(this.f), axot.a(this.i), (yni) this.b.get(), (SharedPreferences) this.c.get(), (wea) this.h.get(), (abfh) this.g.get(), (snc) this.e.get(), (acrq) this.d.get(), (aacz) this.a.get());
            case 2:
                return c(this.e, this.a, this.f, this.h, this.c, this.i, (yni) this.d.get(), (wwf) this.b.get(), (aadd) this.g.get());
            case 3:
                ampq ampqVar = (ampq) ((axov) this.i).a;
                aaqj aaqjVar = (aaqj) this.c.get();
                aaqf aaqfVar = (aaqf) this.g.get();
                afvn afvnVar = (afvn) this.f.get();
                aacz aaczVar = (aacz) this.a.get();
                aadd aaddVar = (aadd) this.d.get();
                Set set = ((axpa) this.h).get();
                zdz zdzVar = (zdz) this.b.get();
                return d(ampqVar, aaqjVar, aaqfVar, afvnVar, aaczVar, aaddVar, set, (axwp) this.e.get(), amhv.c());
            case 4:
                Context context = (Context) ((axov) this.d).a;
                Object obj = this.b.get();
                afug afugVar = (afug) this.f.get();
                afvn afvnVar2 = (afvn) this.h.get();
                snc sncVar = (snc) this.e.get();
                zah zahVar = (zah) this.i.get();
                ykw ykwVar = (ykw) this.a.get();
                afzk afzkVar = (afzk) this.c.get();
                return e(obj, afugVar, afvnVar2, sncVar, zahVar, ykwVar, (Optional) ((axov) this.g).a);
            case 5:
                return f((aant) this.h.get(), (aadd) this.d.get(), (aepv) this.g.get(), (aeqt) this.i.get(), (ScheduledExecutorService) this.e.get(), (ywk) this.a.get(), axot.a(this.b), axot.a(this.f), axot.a(this.c));
            case 6:
                return g((aaqj) this.i.get(), (aaqf) this.g.get(), ((ainc) this.h).get(), (afvn) this.f.get(), ((yin) this.c).b(), (yni) this.a.get(), (aacz) this.e.get(), (aadd) this.d.get(), (zdz) this.b.get());
            case 7:
                return new aitp((snc) this.e.get(), (Executor) this.b.get(), (Handler) this.i.get(), (SecureRandom) this.h.get(), (aawx) this.f.get(), ((yin) this.c).b(), (ahfm) ((axov) this.g).a, (aiix) this.d.get(), (acrr) this.a.get());
            default:
                return new aity((afwu) this.g.get(), (yrj) this.c.get(), (afst) this.a.get(), ((wjw) this.e).b(), (Executor) this.d.get(), (ajjh) this.i.get(), (acrr) this.b.get(), (aadd) this.f.get(), ((wjw) this.h).b(), null, null, null);
        }
    }
}
