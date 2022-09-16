package defpackage;

import android.content.Context;
import com.google.android.apps.youtube.embeddedplayer.service.innertube.a;
import com.google.android.apps.youtube.embeddedplayer.service.innertube.m;
import com.google.android.apps.youtube.embeddedplayer.service.prewarm.service.b;
import java.security.Key;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: PG */
/* renamed from: wjs  reason: default package */
/* loaded from: classes4.dex */
public final class wjs implements axou {
    private final azqb a;
    private final azqb b;
    private final azqb c;
    private final azqb d;
    private final azqb e;
    private final azqb f;
    private final azqb g;
    private final /* synthetic */ int h;

    public wjs(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7) {
        this.a = azqbVar;
        this.b = azqbVar2;
        this.c = azqbVar3;
        this.d = azqbVar4;
        this.e = azqbVar5;
        this.f = azqbVar6;
        this.g = azqbVar7;
    }

    public wjs(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, int i) {
        this.h = i;
        this.g = azqbVar;
        this.b = azqbVar2;
        this.d = azqbVar3;
        this.a = azqbVar4;
        this.c = azqbVar5;
        this.f = azqbVar6;
        this.e = azqbVar7;
    }

    public wjs(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, int i, byte[] bArr) {
        this.h = i;
        this.b = azqbVar;
        this.f = azqbVar2;
        this.c = azqbVar3;
        this.g = azqbVar4;
        this.d = azqbVar5;
        this.a = azqbVar6;
        this.e = azqbVar7;
    }

    public wjs(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, int i, char[] cArr) {
        this.h = i;
        this.d = azqbVar;
        this.a = azqbVar2;
        this.f = azqbVar3;
        this.b = azqbVar4;
        this.e = azqbVar5;
        this.g = azqbVar6;
        this.c = azqbVar7;
    }

    public wjs(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, int i, float[] fArr) {
        this.h = i;
        this.g = azqbVar;
        this.f = azqbVar2;
        this.d = azqbVar3;
        this.a = azqbVar4;
        this.e = azqbVar5;
        this.c = azqbVar6;
        this.b = azqbVar7;
    }

    public wjs(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, int i, int[] iArr) {
        this.h = i;
        this.g = azqbVar;
        this.e = azqbVar2;
        this.f = azqbVar3;
        this.a = azqbVar4;
        this.c = azqbVar5;
        this.d = azqbVar6;
        this.b = azqbVar7;
    }

    public wjs(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, int i, short[] sArr) {
        this.h = i;
        this.d = azqbVar;
        this.g = azqbVar2;
        this.f = azqbVar3;
        this.a = azqbVar4;
        this.c = azqbVar5;
        this.b = azqbVar6;
        this.e = azqbVar7;
    }

    public wjs(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, int i, boolean[] zArr) {
        this.h = i;
        this.d = azqbVar;
        this.f = azqbVar2;
        this.b = azqbVar3;
        this.g = azqbVar4;
        this.e = azqbVar5;
        this.a = azqbVar6;
        this.c = azqbVar7;
    }

    public wjs(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, int i, byte[][] bArr) {
        this.h = i;
        this.a = azqbVar;
        this.c = azqbVar2;
        this.g = azqbVar3;
        this.e = azqbVar4;
        this.b = azqbVar5;
        this.f = azqbVar6;
        this.d = azqbVar7;
    }

    public wjs(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, int i, char[][] cArr) {
        this.h = i;
        this.f = azqbVar;
        this.d = azqbVar2;
        this.c = azqbVar3;
        this.g = azqbVar4;
        this.b = azqbVar5;
        this.e = azqbVar6;
        this.a = azqbVar7;
    }

    public wjs(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, int i, float[][] fArr) {
        this.h = i;
        this.c = azqbVar;
        this.a = azqbVar2;
        this.b = azqbVar3;
        this.g = azqbVar4;
        this.e = azqbVar5;
        this.f = azqbVar6;
        this.d = azqbVar7;
    }

    public wjs(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, int i, int[][] iArr) {
        this.h = i;
        this.a = azqbVar;
        this.d = azqbVar2;
        this.c = azqbVar3;
        this.g = azqbVar4;
        this.f = azqbVar5;
        this.e = azqbVar6;
        this.b = azqbVar7;
    }

    public wjs(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, int i, short[][] sArr) {
        this.h = i;
        this.a = azqbVar;
        this.d = azqbVar2;
        this.c = azqbVar3;
        this.e = azqbVar4;
        this.b = azqbVar5;
        this.f = azqbVar6;
        this.g = azqbVar7;
    }

    public wjs(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, int i, boolean[][] zArr) {
        this.h = i;
        this.d = azqbVar;
        this.c = azqbVar2;
        this.b = azqbVar3;
        this.f = azqbVar4;
        this.g = azqbVar5;
        this.e = azqbVar6;
        this.a = azqbVar7;
    }

    public wjs(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, int i, byte[][][] bArr) {
        this.h = i;
        this.b = azqbVar;
        this.f = azqbVar2;
        this.g = azqbVar3;
        this.d = azqbVar4;
        this.c = azqbVar5;
        this.e = azqbVar6;
        this.a = azqbVar7;
    }

    public wjs(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, int i, char[][][] cArr) {
        this.h = i;
        this.f = azqbVar;
        this.e = azqbVar2;
        this.a = azqbVar3;
        this.c = azqbVar4;
        this.d = azqbVar5;
        this.g = azqbVar6;
        this.b = azqbVar7;
    }

    public static wjs a(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7) {
        return new wjs(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, azqbVar6, azqbVar7);
    }

    public static wkr c(wvc wvcVar, wrj wrjVar, wpn wpnVar, Map map, azqb azqbVar, amvn amvnVar, wwf wwfVar) {
        return new wkr(wvcVar, wrjVar, wpnVar, map, azqbVar, amvnVar);
    }

    public static wpk d(azqb azqbVar, wnb wnbVar, azqb azqbVar2, snc sncVar) {
        return new wpk(azqbVar, wnbVar, azqbVar2, sncVar);
    }

    public static aabt e(ScheduledExecutorService scheduledExecutorService, acrq acrqVar, afvn afvnVar, afwe afweVar, aasw aaswVar, aasz aaszVar, qys qysVar) {
        return new aabt(scheduledExecutorService, acrqVar, afvnVar, afweVar, aaswVar, aaszVar, qysVar);
    }

    public static aeai f(amqo amqoVar, azqb azqbVar, afjl afjlVar, aeln aelnVar, aeaf aeafVar, acrr acrrVar, afjz afjzVar) {
        return new aeai(amqoVar, azqbVar, afjlVar, aelnVar, aeafVar, acrrVar, afjzVar);
    }

    public static aegi g(amqo amqoVar, Key key, afjm afjmVar, snc sncVar, aeae aeaeVar, pwx pwxVar, ampq ampqVar) {
        return new aegi(amqoVar, key, afjmVar, sncVar, aeaeVar, pwxVar, ampqVar);
    }

    public static afty h(afso afsoVar, afuj afujVar, afuf afufVar, yjs yjsVar, snc sncVar, yrj yrjVar) {
        return new afty(afsoVar, afujVar, afufVar, yjsVar, sncVar, yrjVar);
    }

    public static ahet i(aiqp aiqpVar, aisp aispVar, axnm axnmVar, Executor executor, azqb azqbVar, aynx aynxVar, aynx aynxVar2) {
        return new ahet(aiqpVar, aispVar, axnmVar, executor, azqbVar, aynxVar, aynxVar2);
    }

    public static ailv j(aaqf aaqfVar, aimy aimyVar, ainh ainhVar, yqw yqwVar, snc sncVar, aenl aenlVar) {
        return new ailv(aaqfVar, aimyVar, ainhVar, yqwVar, sncVar, aenlVar);
    }

    public static wjs k(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7) {
        return new wjs(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, azqbVar6, azqbVar7, 1);
    }

    public static wjs l(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7) {
        return new wjs(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, azqbVar6, azqbVar7, 2, (byte[]) null);
    }

    public static wjs m(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7) {
        return new wjs(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, azqbVar6, azqbVar7, 3, (char[]) null);
    }

    public static wjs n(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7) {
        return new wjs(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, azqbVar6, azqbVar7, 4, (short[]) null);
    }

    public static wjs o(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7) {
        return new wjs(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, azqbVar6, azqbVar7, 5, (int[]) null);
    }

    public static wjs p(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7) {
        return new wjs(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, azqbVar6, azqbVar7, 7, (float[]) null);
    }

    public static wjs q(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7) {
        return new wjs(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, azqbVar6, azqbVar7, 8, (byte[][]) null);
    }

    public static wjs r(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7) {
        return new wjs(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, azqbVar6, azqbVar7, 9, (char[][]) null);
    }

    public static wjs s(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7) {
        return new wjs(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, azqbVar6, azqbVar7, 10, (short[][]) null);
    }

    public static wjs t(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7) {
        return new wjs(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, azqbVar6, azqbVar7, 11, (int[][]) null);
    }

    public static wjs u(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7) {
        return new wjs(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, azqbVar6, azqbVar7, 12, (boolean[][]) null);
    }

    public static wjs v(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7) {
        return new wjs(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, azqbVar6, azqbVar7, 13, (float[][]) null);
    }

    public static wjs w(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7) {
        return new wjs(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, azqbVar6, azqbVar7, 14, (byte[][][]) null);
    }

    public static wjs x(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7) {
        return new wjs(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, azqbVar6, azqbVar7, 15, (char[][][]) null);
    }

    public static wwl b(Context context, aacz aaczVar, wkn wknVar, wkl wklVar, wwi wwiVar, snc sncVar, afvn afvnVar) {
        if (!wknVar.i) {
            return wzz.b(context, wknVar.e, wklVar.c(), wklVar.d(), wwiVar, null, null, null);
        }
        String str = wknVar.e;
        String c = wklVar.c();
        String d = wklVar.d();
        aaczVar.getClass();
        sncVar.getClass();
        afvnVar.getClass();
        return wzz.b(context, str, c, d, wwiVar, sncVar, afvnVar, aaczVar);
    }

    @Override // defpackage.azqb
    public final /* bridge */ /* synthetic */ Object get() {
        switch (this.h) {
            case 0:
                return b((Context) ((axov) this.a).a, (aacz) this.b.get(), (wkn) ((axov) this.c).a, (wkl) this.d.get(), (wwi) this.e.get(), (snc) this.f.get(), (afvn) this.g.get());
            case 1:
                return new b((aiea) this.g.get(), (m) this.b.get(), (a) this.d.get(), ((zez) this.a).get(), (com.google.android.apps.youtube.embeddedplayer.service.hostappverification.b) this.c.get(), (aadd) this.f.get(), (aacz) this.e.get());
            case 2:
                return c((wvc) this.b.get(), (wrj) this.f.get(), (wpn) this.c.get(), (Map) this.g.get(), this.d, (amvn) this.a.get(), (wwf) this.e.get());
            case 3:
                aadd aaddVar = (aadd) this.f.get();
                azqb azqbVar = this.b;
                Executor executor = (Executor) this.e.get();
                Executor executor2 = (Executor) this.g.get();
                return d(this.d, (wnb) this.a.get(), azqbVar, (snc) this.c.get());
            case 4:
                wkn wknVar = (wkn) ((axov) this.d).a;
                aadd aaddVar2 = (aadd) this.g.get();
                snc sncVar = (snc) this.f.get();
                acrr acrrVar = (acrr) this.a.get();
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.c.get();
                Context context = (Context) ((axov) this.b).a;
                return new xir(wknVar, aaddVar2, sncVar, acrrVar, scheduledExecutorService, (wwe) this.e.get());
            case 5:
                return new aaaw(this.g, this.e, this.f, this.a, this.c, this.d, this.b);
            case 6:
                return e((ScheduledExecutorService) this.d.get(), (acrq) this.f.get(), (afvn) this.b.get(), (afwe) this.g.get(), (aasw) this.e.get(), (aasz) this.a.get(), ((oqb) this.c).get());
            case 7:
                return f((amqo) this.g.get(), this.f, ((adxe) this.d).b(), (aeln) this.a.get(), (aeaf) this.e.get(), (acrr) this.c.get(), (afjz) this.b.get());
            case 8:
                return g((amqo) this.a.get(), (Key) this.c.get(), ((adyl) this.g).b(), (snc) this.e.get(), (aeae) this.b.get(), (pwx) this.f.get(), (ampq) ((axov) this.d).a);
            case 9:
                afso afsoVar = (afso) this.f.get();
                afuj afujVar = (afuj) this.d.get();
                afuf afufVar = (afuf) this.c.get();
                yjs yjsVar = (yjs) this.g.get();
                afzk afzkVar = (afzk) this.b.get();
                return h(afsoVar, afujVar, afufVar, yjsVar, (snc) this.e.get(), (yrj) this.a.get());
            case 10:
                return new afwl((ymt) this.a.get(), (Executor) this.d.get(), (afsv) this.c.get(), (snc) this.e.get(), (yqw) this.b.get(), (afvn) this.f.get(), ((axpa) this.g).get());
            case 11:
                ahet i = i((aiqp) this.a.get(), (aisp) this.d.get(), axot.a(this.c), (Executor) this.g.get(), this.f, (aynx) this.e.get(), (aynx) this.b.get());
                i.a();
                return i;
            case 12:
                return new ahkv((Context) ((axov) this.d).a, (yni) this.c.get(), (aijf) this.b.get(), (afio) this.f.get(), (afiy) this.g.get(), this.e, (axdi) this.a.get());
            case 13:
                aaqf aaqfVar = (aaqf) this.c.get();
                aimy aimyVar = (aimy) this.a.get();
                ainh ainhVar = ((aini) this.b).get();
                yqw yqwVar = (yqw) this.g.get();
                snc sncVar2 = (snc) this.e.get();
                aenl aenlVar = ((ahec) this.f).get();
                aacz aaczVar = (aacz) this.d.get();
                return j(aaqfVar, aimyVar, ainhVar, yqwVar, sncVar2, aenlVar);
            case 14:
                return new aisl((aikh) this.b.get(), (aios) this.f.get(), (ajft) this.g.get(), (yni) this.d.get(), (Set) ((axov) this.c).a, (aisp) this.e.get(), (Set) ((axov) this.a).a);
            default:
                return new aivt((afja) this.f.get(), (aynx) this.e.get(), (aijh) this.a.get(), (aynx) this.c.get(), (snc) this.d.get(), (ajft) this.g.get(), (aadd) this.b.get());
        }
    }
}
