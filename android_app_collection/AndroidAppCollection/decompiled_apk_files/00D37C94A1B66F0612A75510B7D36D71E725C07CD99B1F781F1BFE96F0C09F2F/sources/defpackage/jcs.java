package defpackage;
/* compiled from: PG */
/* renamed from: jcs  reason: default package */
/* loaded from: classes3.dex */
public final class jcs extends jau {
    private final boolean a;

    public jcs(aacz aaczVar) {
        asxj asxjVar = aaczVar.b().e;
        this.a = (asxjVar == null ? asxj.a : asxjVar).P;
    }

    private final atsw h(agqv agqvVar) {
        if (agqvVar.i() != agqp.PLAYABLE || !this.a) {
            return null;
        }
        String m = agqvVar.m();
        avyq avyqVar = avyq.DOWNLOAD_STATE_COMPLETE;
        String r = emn.r(m);
        r.getClass();
        aqxo.z(!r.isEmpty(), "key cannot be empty");
        aopa createBuilder = atsz.a.createBuilder();
        createBuilder.copyOnWrite();
        atsz atszVar = (atsz) createBuilder.instance;
        atszVar.c |= 1;
        atszVar.d = r;
        atsw atswVar = new atsw(createBuilder);
        aopa aopaVar = atswVar.a;
        aopaVar.copyOnWrite();
        atsz atszVar2 = (atsz) aopaVar.instance;
        atszVar2.e = avyqVar.i;
        atszVar2.c |= 2;
        return atswVar;
    }

    @Override // defpackage.jau
    protected final amvn a(agwh agwhVar) {
        amvl i = amvn.i();
        if (this.a) {
            for (agqv agqvVar : agwhVar.j()) {
                atsw h = h(agqvVar);
                if (h != null) {
                    i.c(h);
                }
            }
        }
        return i.g();
    }

    @Override // defpackage.jau
    protected final void d(aajs aajsVar, agqv agqvVar) {
        atsw h;
        if (!this.a || (h = h(agqvVar)) == null) {
            return;
        }
        aajsVar.j(h);
    }

    @Override // defpackage.jau
    protected final void e(aajs aajsVar, String str) {
        if (this.a) {
            aajsVar.g(emn.r(str));
        }
    }
}
