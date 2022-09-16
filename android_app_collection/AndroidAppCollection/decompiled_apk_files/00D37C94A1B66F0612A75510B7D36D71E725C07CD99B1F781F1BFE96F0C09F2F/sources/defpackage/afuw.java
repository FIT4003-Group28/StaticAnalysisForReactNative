package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: afuw  reason: default package */
/* loaded from: classes.dex */
public final class afuw implements afsw {
    public final Executor a;
    public volatile Map b;
    public final azqb c;
    public final ampq d;
    public volatile boolean e;
    public final boolean f;
    private final azqb g;
    private final axnm h;

    public afuw(Executor executor, azqb azqbVar, axnm axnmVar, yme ymeVar, azqb azqbVar2, ampq ampqVar) {
        this.a = executor;
        this.h = axnmVar;
        this.g = azqbVar;
        asvs asvsVar = ymeVar.a().r;
        aqwk aqwkVar = (asvsVar == null ? asvs.a : asvsVar).b;
        this.f = (aqwkVar == null ? aqwk.a : aqwkVar).b;
        this.c = azqbVar2;
        this.d = ampqVar;
    }

    @Override // defpackage.afsw
    public final int a() {
        return 72;
    }

    @Override // defpackage.afsw
    public final int b() {
        return (int) TimeUnit.HOURS.toMinutes(72L);
    }

    @Override // defpackage.afsw
    public final List c() {
        return amuk.u(10, 60, 3600, 43200);
    }

    @Override // defpackage.afsw
    public final boolean d() {
        return true;
    }

    public final Map e(String str) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("exception.message", str);
        }
        hashMap.putAll(this.b);
        return hashMap;
    }

    public final synchronized void f() {
        this.e = false;
        this.b = null;
    }

    public final synchronized void g() {
        this.e = true;
    }

    public final void h(zgp zgpVar, Map map) {
        afwu afwuVar = (afwu) this.g.get();
        afwt e = afwu.e("ecatcher");
        e.d = true;
        e.f = map;
        e.b(zgpVar.a());
        if (this.e) {
            ((afwu) this.g.get()).b(this, e, new afuv());
        }
    }

    public final zgp i(int i, int i2, String str) {
        zgp b = zgp.b(Uri.parse("https://www.youtube.com/error_204"));
        b.h("log.level", ahfc.f(i));
        b.h("exception.category", ahdq.h(i2));
        if (str != null) {
            b.h("exception.type", str);
        }
        b.h("t", "androiderror");
        ((afst) this.h.get()).d(b);
        return b;
    }

    public final apvv j(int i, int i2, String str, Throwable th) {
        apvz apvzVar;
        aopa createBuilder = apvy.a.createBuilder();
        int i3 = 3;
        int i4 = i + (-1) != 0 ? 3 : 2;
        createBuilder.copyOnWrite();
        apvy apvyVar = (apvy) createBuilder.instance;
        apvyVar.d = i4 - 1;
        apvyVar.b |= 2;
        createBuilder.copyOnWrite();
        apvy apvyVar2 = (apvy) createBuilder.instance;
        str.getClass();
        apvyVar2.b |= 1;
        apvyVar2.c = str;
        if (th != null) {
            String canonicalName = th.getClass().getCanonicalName();
            createBuilder.copyOnWrite();
            apvy apvyVar3 = (apvy) createBuilder.instance;
            canonicalName.getClass();
            apvyVar3.b |= 4;
            apvyVar3.e = canonicalName;
        }
        aopa createBuilder2 = apvv.a.createBuilder();
        createBuilder2.copyOnWrite();
        apvv apvvVar = (apvv) createBuilder2.instance;
        apvy apvyVar4 = (apvy) createBuilder.mo39build();
        apvyVar4.getClass();
        apvvVar.e = apvyVar4;
        apvvVar.b |= 4;
        aopa createBuilder3 = apvw.a.createBuilder();
        switch (i2 - 1) {
            case 0:
                i3 = 2;
                break;
            case 1:
                break;
            case 2:
                i3 = 4;
                break;
            case 3:
                i3 = 6;
                break;
            case 4:
                i3 = 9;
                break;
            case 5:
                i3 = 16;
                break;
            case 6:
                i3 = 28;
                break;
            case 7:
                i3 = 19;
                break;
            case 8:
                i3 = 27;
                break;
            case 9:
                i3 = 21;
                break;
            case 10:
                i3 = 20;
                break;
            case 11:
                i3 = 13;
                break;
            case 12:
                i3 = 17;
                break;
            case 13:
                i3 = 10;
                break;
            case 14:
                i3 = 22;
                break;
            case 15:
                i3 = 7;
                break;
            case 16:
                i3 = 26;
                break;
            case 17:
                i3 = 8;
                break;
            case 18:
                i3 = 25;
                break;
            case 19:
                i3 = 11;
                break;
            case 20:
                i3 = 15;
                break;
            case 21:
                i3 = 18;
                break;
            case 22:
                i3 = 5;
                break;
            case 23:
                i3 = 23;
                break;
            case 24:
                i3 = 14;
                break;
            case 25:
                i3 = 12;
                break;
            case 26:
                i3 = 29;
                break;
            case 27:
            case 29:
            default:
                i3 = 1;
                break;
            case 28:
                i3 = 31;
                break;
            case 30:
                i3 = 33;
                break;
            case 31:
                i3 = 34;
                break;
        }
        createBuilder3.copyOnWrite();
        apvw apvwVar = (apvw) createBuilder3.instance;
        apvwVar.c = i3 - 1;
        apvwVar.b |= 1;
        Map map = this.b;
        aopa createBuilder4 = apvz.a.createBuilder();
        if (map == null) {
            apvzVar = (apvz) createBuilder4.mo39build();
        } else {
            if (map.containsKey("innertube.run.job")) {
                String str2 = (String) map.get("innertube.run.job");
                createBuilder4.copyOnWrite();
                apvz apvzVar2 = (apvz) createBuilder4.instance;
                str2.getClass();
                apvzVar2.b |= 32;
                apvzVar2.g = str2;
            }
            if (map.containsKey("innertube.build.label")) {
                String str3 = (String) map.get("innertube.build.label");
                createBuilder4.copyOnWrite();
                apvz apvzVar3 = (apvz) createBuilder4.instance;
                str3.getClass();
                apvzVar3.b = 4 | apvzVar3.b;
                apvzVar3.e = str3;
            }
            if (map.containsKey("innertube.build.timestamp")) {
                long parseLong = Long.parseLong((String) map.get("innertube.build.timestamp"), 10);
                createBuilder4.copyOnWrite();
                apvz apvzVar4 = (apvz) createBuilder4.instance;
                apvzVar4.b = 8 | apvzVar4.b;
                apvzVar4.f = parseLong;
            }
            if (map.containsKey("innertube.build.changelist")) {
                long parseLong2 = Long.parseLong((String) map.get("innertube.build.changelist"), 10);
                createBuilder4.copyOnWrite();
                apvz apvzVar5 = (apvz) createBuilder4.instance;
                apvzVar5.b |= 1;
                apvzVar5.c = parseLong2;
            }
            if (map.containsKey("innertube.build.experiments.source_version")) {
                long parseLong3 = Long.parseLong((String) map.get("innertube.build.experiments.source_version"), 10);
                createBuilder4.copyOnWrite();
                apvz apvzVar6 = (apvz) createBuilder4.instance;
                apvzVar6.b |= 2;
                apvzVar6.d = parseLong3;
            }
            apvzVar = (apvz) createBuilder4.mo39build();
        }
        createBuilder3.copyOnWrite();
        apvw apvwVar2 = (apvw) createBuilder3.instance;
        apvzVar.getClass();
        apvwVar2.d = apvzVar;
        apvwVar2.b |= 2;
        createBuilder2.copyOnWrite();
        apvv apvvVar2 = (apvv) createBuilder2.instance;
        apvw apvwVar3 = (apvw) createBuilder3.mo39build();
        apvwVar3.getClass();
        apvvVar2.c = apvwVar3;
        apvvVar2.b |= 1;
        if (th != null) {
            if (afux.b(th)) {
                th = afux.a(th);
            }
            aopa createBuilder5 = apvx.a.createBuilder();
            aopa createBuilder6 = apvt.a.createBuilder();
            aoob byteString = ((angl) anhe.c(th).mo39build()).toByteString();
            createBuilder6.copyOnWrite();
            apvt apvtVar = (apvt) createBuilder6.instance;
            apvtVar.b |= 1;
            apvtVar.c = byteString;
            apvt apvtVar2 = (apvt) createBuilder6.mo39build();
            createBuilder5.copyOnWrite();
            apvx apvxVar = (apvx) createBuilder5.instance;
            apvtVar2.getClass();
            apvxVar.c = apvtVar2;
            apvxVar.b = 2;
            createBuilder2.copyOnWrite();
            apvv apvvVar3 = (apvv) createBuilder2.instance;
            apvx apvxVar2 = (apvx) createBuilder5.mo39build();
            apvxVar2.getClass();
            apvvVar3.d = apvxVar2;
            apvvVar3.b |= 2;
        }
        return (apvv) createBuilder2.mo39build();
    }
}
