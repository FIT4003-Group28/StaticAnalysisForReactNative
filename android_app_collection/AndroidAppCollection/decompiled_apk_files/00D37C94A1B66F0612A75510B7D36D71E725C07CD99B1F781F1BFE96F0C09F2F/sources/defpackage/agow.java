package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: agow  reason: default package */
/* loaded from: classes.dex */
public final class agow implements agry {
    static final long a = TimeUnit.DAYS.toSeconds(2);
    private final azqb b;
    private final azqb c;
    private final azqb d;
    private final aahf e;
    private final zey f;
    private final yni g;
    private final snc h;
    private final ahdd i;
    private final ahdf j;

    public agow(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, aahf aahfVar, zey zeyVar, yni yniVar, snc sncVar, ahdd ahddVar, ahdf ahdfVar) {
        this.b = azqbVar;
        this.c = azqbVar2;
        this.d = azqbVar3;
        this.e = aahfVar;
        this.f = zeyVar;
        this.g = yniVar;
        this.h = sncVar;
        this.i = ahddVar;
        this.j = ahdfVar;
    }

    private final ankt d(afvm afvmVar, String str, atrc atrcVar) {
        atyp atypVar = (atyp) this.e.a(afvmVar).f(aakj.f(119, str)).g(atyp.class).W();
        PlayerResponseModel playerResponseModel = null;
        PlayerResponseModel j = (atypVar == null || !atypVar.h()) ? null : PlayerResponseModel.j(atypVar.getPlayerResponseBytes().I(), 0L);
        if (j == null) {
            try {
                playerResponseModel = ((ahdl) this.b.get()).l(str, 2, ((atym) atrcVar.qm(atym.b)).d.I());
            } catch (aart unused) {
            }
        } else {
            playerResponseModel = j;
        }
        if (playerResponseModel == null) {
            return anlz.q(agru.c);
        }
        VideoStreamingData videoStreamingData = playerResponseModel.c;
        if (videoStreamingData == null) {
            return anlz.q(agru.c);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(videoStreamingData);
        if (this.j.i()) {
            for (PlayerResponseModel playerResponseModel2 : this.i.a(playerResponseModel)) {
                VideoStreamingData videoStreamingData2 = playerResponseModel2.c;
                if (videoStreamingData2 != null) {
                    arrayList.add(videoStreamingData2);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            VideoStreamingData videoStreamingData3 = (VideoStreamingData) arrayList.get(i);
            String a2 = this.f.a();
            String o = videoStreamingData3.o();
            String str2 = videoStreamingData3.j;
            String str3 = videoStreamingData3.c;
            aerm aermVar = (aerm) this.c.get();
            try {
                aermVar.b(str3, a2, o, str2);
                arrayList2.add(aermVar.f(videoStreamingData3.p, a2));
            } catch (aerj e) {
                agvx a3 = ((agrf) this.d.get()).a();
                aglj A = a3.A();
                if (A != null) {
                    A.V(str, agqe.CANNOT_OFFLINE);
                    try {
                        ampq ampqVar = (ampq) a3.m().h(str).get();
                        if (ampqVar.h()) {
                            this.g.f(new agog((agqv) ampqVar.c(), atsg.NOT_PLAYABLE));
                        }
                    } catch (InterruptedException | ExecutionException unused2) {
                    }
                }
                aahe a4 = this.e.a(afvmVar);
                aqqx aqqxVar = e.a;
                aajs c = a4.c();
                String g = g(str);
                if (aqqxVar != null) {
                    aqqt f = aqqu.f(g);
                    aopa aopaVar = f.a;
                    aopaVar.copyOnWrite();
                    aqqy aqqyVar = (aqqy) aopaVar.instance;
                    aqqy aqqyVar2 = aqqy.a;
                    aqqyVar.i = aqqxVar;
                    aqqyVar.c |= 16;
                    aqqv b = f.b();
                    c.g(g);
                    c.d(b);
                    c.b().T();
                    b.toString();
                }
                return anlz.q(agru.c);
            }
        }
        h(this.e.a(afvmVar), str, arrayList2);
        return anlz.q(agru.a);
    }

    private final ankt e(afvm afvmVar, String str, atrc atrcVar) {
        aqqv f;
        aahe a2 = this.e.a(afvmVar);
        aqqr aqqrVar = (aqqr) atrcVar.qm(aqqr.b);
        if ((aqqrVar.c & 64) != 0) {
            aqqy aqqyVar = aqqrVar.e;
            if (aqqyVar == null) {
                aqqyVar = aqqy.a;
            }
            f = aqqv.b(aqqyVar).b();
        } else {
            f = f(a2, str);
        }
        if (f == null || f.getLicenses().isEmpty()) {
            return anlz.q(agru.a);
        }
        boolean z = false;
        for (aqqz aqqzVar : f.getLicenses()) {
            String a3 = this.f.a();
            String str2 = aqqzVar.g;
            String str3 = aqqzVar.h;
            String str4 = aqqzVar.i;
            aerm aermVar = (aerm) this.c.get();
            try {
                aermVar.b(str4, a3, str2, str3);
                aermVar.g(aqqzVar, f.getPlaybackStartSeconds().longValue());
            } catch (aerj unused) {
                z = true;
            }
        }
        agpv agpvVar = new agpv(aajk.a);
        agpvVar.f("license_released", true);
        aajs c = a2.c();
        c.e(f, agpvVar.d());
        c.a(f.d()).b().T();
        return anlz.q(z ? agru.c : agru.a);
    }

    private static aqqv f(aahe aaheVar, String str) {
        return (aqqv) aaheVar.f(g(str)).g(aqqv.class).W();
    }

    private static String g(String str) {
        return aakj.f(146, str);
    }

    private final void h(aahe aaheVar, String str, List list) {
        aajs c = aaheVar.c();
        String g = g(str);
        if (list.isEmpty()) {
            return;
        }
        aqqz aqqzVar = (aqqz) list.get(0);
        aqqt f = aqqu.f(g);
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                aqqz aqqzVar2 = (aqqz) it.next();
                aopa aopaVar = f.a;
                aopaVar.copyOnWrite();
                aqqy aqqyVar = (aqqy) aopaVar.instance;
                aqqy aqqyVar2 = aqqy.a;
                aqqzVar2.getClass();
                aopu aopuVar = aqqyVar.e;
                if (!aopuVar.c()) {
                    aqqyVar.e = aopi.mutableCopy(aopuVar);
                }
                aqqyVar.e.add(aqqzVar2);
            }
        }
        if (aqqzVar.d > 0) {
            Long valueOf = Long.valueOf((this.h.c() / 1000) + aqqzVar.d);
            aopa aopaVar2 = f.a;
            long longValue = valueOf.longValue();
            aopaVar2.copyOnWrite();
            aqqy aqqyVar3 = (aqqy) aopaVar2.instance;
            aqqy aqqyVar4 = aqqy.a;
            aqqyVar3.c |= 4;
            aqqyVar3.g = longValue;
        }
        String f2 = aakj.f(148, g);
        if (aqqzVar.f) {
            long longValue2 = Long.valueOf(((aqqy) f.a.instance).g).longValue();
            long j = a;
            f2.getClass();
            aqxo.z(!f2.isEmpty(), "key cannot be empty");
            aopa createBuilder = aump.a.createBuilder();
            createBuilder.copyOnWrite();
            aump aumpVar = (aump) createBuilder.instance;
            aumpVar.b |= 1;
            aumpVar.c = f2;
            aumm aummVar = new aumm(createBuilder);
            Long valueOf2 = Long.valueOf(longValue2 - j);
            aopa aopaVar3 = aummVar.a;
            long longValue3 = valueOf2.longValue();
            aopaVar3.copyOnWrite();
            aump aumpVar2 = (aump) aopaVar3.instance;
            aumpVar2.b |= 2;
            aumpVar2.d = longValue3;
            aumo b = aummVar.b();
            c.d(b);
            String d = b.d();
            aopa aopaVar4 = f.a;
            aopaVar4.copyOnWrite();
            aqqy aqqyVar5 = (aqqy) aopaVar4.instance;
            d.getClass();
            aqqyVar5.c |= 8;
            aqqyVar5.h = d;
        } else {
            aumo aumoVar = (aumo) aaheVar.f(f2).g(aumo.class).W();
            if (aumoVar != null) {
                c.h(aumoVar);
            }
        }
        aqqv b2 = f.b();
        c.d(b2);
        StringBuilder sb = new StringBuilder();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            sb.append(((aqqz) it2.next()).i);
            sb.append(",");
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        String sb2 = sb.toString();
        if (!sb2.isEmpty()) {
            aajk aajkVar = aajk.a;
            aopa createBuilder2 = aqwb.a.createBuilder();
            abga.i("drmAssociatedVideos", sb2, createBuilder2);
            c.f(b2.d(), abga.h(createBuilder2));
        }
        c.b().T();
        b2.toString();
    }

    @Override // defpackage.agry
    public final agrx a(atrf atrfVar) {
        return agrx.a;
    }

    @Override // defpackage.agry
    public final ankt b(afvm afvmVar, atrf atrfVar) {
        String g = aakj.g(atrfVar.d);
        int aq = akel.aq(atrfVar.c);
        if (aq == 0) {
            aq = 1;
        }
        int i = aq - 1;
        if (i == 1) {
            atrc atrcVar = atrfVar.e;
            if (atrcVar == null) {
                atrcVar = atrc.b;
            }
            return d(afvmVar, g, atrcVar);
        } else if (i == 2) {
            atrc atrcVar2 = atrfVar.e;
            if (atrcVar2 == null) {
                atrcVar2 = atrc.b;
            }
            return e(afvmVar, g, atrcVar2);
        } else if (i == 3) {
            atrc atrcVar3 = atrfVar.e;
            if (atrcVar3 == null) {
                atrcVar3 = atrc.b;
            }
            aahe a2 = this.e.a(afvmVar);
            aqqv f = f(a2, g);
            if (!((aqqr) atrcVar3.qm(aqqr.b)).f) {
                if (f == null || f.getLicenses().isEmpty()) {
                    return anlz.q(agru.c);
                }
                ArrayList arrayList = new ArrayList();
                for (aqqz aqqzVar : f.getLicenses()) {
                    String a3 = this.f.a();
                    String str = aqqzVar.g;
                    String str2 = aqqzVar.h;
                    String str3 = aqqzVar.i;
                    aerm aermVar = (aerm) this.c.get();
                    try {
                        aermVar.b(str3, a3, str, str2);
                        aqqz a4 = aermVar.a(aqqzVar);
                        if (a4 != null) {
                            arrayList.add(a4);
                        } else {
                            return anlz.q(agru.c);
                        }
                    } catch (aerj unused) {
                        return anlz.q(agru.c);
                    }
                }
                h(a2, g, arrayList);
                return anlz.q(agru.a);
            }
            e(afvmVar, g, atrcVar3);
            return d(afvmVar, g, atrcVar3);
        } else {
            if (i == 4) {
                atrc atrcVar4 = atrfVar.e;
                if (atrcVar4 == null) {
                    atrcVar4 = atrc.b;
                }
                aahe a5 = this.e.a(afvmVar);
                long j = ((aqqr) atrcVar4.qm(aqqr.b)).d;
                aqqv f2 = f(a5, g);
                if (f2.getPlaybackStartSeconds().longValue() == 0) {
                    aajs c = a5.c();
                    aqqt b = aqqv.b(f2.b);
                    Long valueOf = Long.valueOf(j);
                    aopa aopaVar = b.a;
                    long longValue = valueOf.longValue();
                    aopaVar.copyOnWrite();
                    aqqy aqqyVar = (aqqy) aopaVar.instance;
                    aqqy aqqyVar2 = aqqy.a;
                    aqqyVar.c |= 2;
                    aqqyVar.f = longValue;
                    c.j(b);
                    c.b().T();
                }
                return anlz.q(agru.a);
            }
            return anlz.q(agru.c);
        }
    }

    @Override // defpackage.agry
    public final ankt c(afvm afvmVar, amuk amukVar) {
        throw new UnsupportedOperationException();
    }
}
