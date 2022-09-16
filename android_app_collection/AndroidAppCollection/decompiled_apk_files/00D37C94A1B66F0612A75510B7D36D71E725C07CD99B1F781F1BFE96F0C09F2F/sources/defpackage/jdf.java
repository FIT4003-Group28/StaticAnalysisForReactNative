package defpackage;

import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: jdf  reason: default package */
/* loaded from: classes3.dex */
public final class jdf extends jat {
    private final azqb a;

    public jdf(azqb azqbVar) {
        this.a = azqbVar;
    }

    private final void g(agqf agqfVar) {
        awkj awkjVar;
        int o;
        fci fciVar = (fci) this.a.get();
        String f = eog.f(agqfVar.a);
        if (agqfVar.a.startsWith("BL")) {
            atqa j = hhw.j(agqfVar);
            int i = 1;
            if (j != null && (j.b & 1) != 0 && (o = akzj.o(j.c)) != 0) {
                i = o;
            }
            int i2 = i - 1;
            if (i2 == 2) {
                awkjVar = awkj.PLAYLIST_THUMBNAIL_STYLE_ONE_AND_TWO_AVATAR;
            } else if (i2 != 3) {
                awkjVar = awkj.PLAYLIST_THUMBNAIL_STYLE_TWO_BY_TWO;
            } else {
                awkjVar = awkj.PLAYLIST_THUMBNAIL_STYLE_ONE_AND_TWO;
            }
        } else {
            awkjVar = awkj.PLAYLIST_THUMBNAIL_STYLE_FIRST_VIDEO;
        }
        fciVar.a.put(f, awkjVar);
    }

    private static final awke l(agqh agqhVar) {
        avhn avhnVar;
        agqf agqfVar = agqhVar.a;
        List list = agqhVar.b;
        String str = agqfVar.a;
        String t = emn.t(str);
        t.getClass();
        aqxo.z(!t.isEmpty(), "key cannot be empty");
        aopa createBuilder = awki.a.createBuilder();
        createBuilder.copyOnWrite();
        awki awkiVar = (awki) createBuilder.instance;
        awkiVar.c |= 1;
        awkiVar.d = t;
        awke awkeVar = new awke(createBuilder);
        aopa aopaVar = awkeVar.a;
        aopaVar.copyOnWrite();
        awki awkiVar2 = (awki) aopaVar.instance;
        awkiVar2.c |= 4;
        awkiVar2.e = str;
        String str2 = agqfVar.b;
        aopa aopaVar2 = awkeVar.a;
        aopaVar2.copyOnWrite();
        awki awkiVar3 = (awki) aopaVar2.instance;
        str2.getClass();
        awkiVar3.c |= 16;
        awkiVar3.g = str2;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String[] strArr = {emn.u(str, (String) it.next())};
            for (int i = 0; i <= 0; i++) {
                String str3 = strArr[i];
                aopa aopaVar3 = awkeVar.a;
                aopaVar3.copyOnWrite();
                awki awkiVar4 = (awki) aopaVar3.instance;
                str3.getClass();
                aopu aopuVar = awkiVar4.l;
                if (!aopuVar.c()) {
                    awkiVar4.l = aopi.mutableCopy(aopuVar);
                }
                awkiVar4.l.add(str3);
            }
        }
        agqa agqaVar = agqfVar.c;
        if (agqaVar != null) {
            String c = emn.c(agqaVar.a);
            aopa aopaVar4 = awkeVar.a;
            aopaVar4.copyOnWrite();
            awki awkiVar5 = (awki) aopaVar4.instance;
            c.getClass();
            awkiVar5.c |= 8;
            awkiVar5.f = c;
        }
        Integer valueOf = Integer.valueOf(awkj.PLAYLIST_THUMBNAIL_STYLE_FIRST_VIDEO.f);
        aopa createBuilder2 = auej.a.createBuilder();
        avhn e = agqfVar.e.e();
        createBuilder2.copyOnWrite();
        auej auejVar = (auej) createBuilder2.instance;
        e.getClass();
        auejVar.c = e;
        auejVar.b = 1;
        awkeVar.b(valueOf, (auej) createBuilder2.mo39build());
        atqa j = hhw.j(agqfVar);
        if (j == null || (j.b & 2) == 0) {
            avhnVar = null;
        } else {
            avhnVar = j.d;
            if (avhnVar == null) {
                avhnVar = avhn.a;
            }
        }
        awkeVar.b(4, jjd.e(avhnVar));
        awkeVar.b(3, jjd.e(avhnVar));
        awkeVar.b(2, jjd.e(null));
        awkeVar.b(0, jjd.e(null));
        return awkeVar;
    }

    @Override // defpackage.jat
    protected final amvn a(agvv agvvVar) {
        amvl i = amvn.i();
        for (agqh agqhVar : agvvVar.j()) {
            i.c(l(agqhVar));
            g(agqhVar.a);
        }
        return i.g();
    }

    @Override // defpackage.jat
    protected final void c(aajs aajsVar, agqh agqhVar) {
        aajsVar.j(l(agqhVar));
        g(agqhVar.a);
    }

    @Override // defpackage.jat
    protected final void d(aajs aajsVar, String str) {
        aajsVar.g(emn.t(str));
        ((fci) this.a.get()).a.remove(eog.f(str));
    }

    @Override // defpackage.jat
    protected final void e(aajs aajsVar, agqh agqhVar, agqg agqgVar) {
        aajsVar.j(l(agqhVar));
    }

    @Override // defpackage.jat
    protected final void f(aajs aajsVar, agqh agqhVar) {
        aajsVar.j(l(agqhVar));
        g(agqhVar.a);
    }
}
