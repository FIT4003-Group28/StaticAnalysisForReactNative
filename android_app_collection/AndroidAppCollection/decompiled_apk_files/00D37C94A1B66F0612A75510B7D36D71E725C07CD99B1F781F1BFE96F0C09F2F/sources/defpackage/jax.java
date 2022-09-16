package defpackage;
/* compiled from: PG */
/* renamed from: jax  reason: default package */
/* loaded from: classes3.dex */
public final class jax extends jat {
    private static final aqog g(String str) {
        return jjd.d(str, avyq.DOWNLOAD_STATE_PENDING_DOWNLOAD, 0.0f, 0.0f);
    }

    private static final aqog l(agqg agqgVar) {
        avyq avyqVar;
        if (agqgVar == null) {
            return null;
        }
        String d = agqgVar.d();
        if (agqgVar.e()) {
            avyqVar = avyq.DOWNLOAD_STATE_COMPLETE;
        } else {
            avyqVar = avyq.DOWNLOAD_STATE_DOWNLOAD_IN_PROGRESS;
        }
        return jjd.d(d, avyqVar, agqgVar.d / 100.0f, agqgVar.e / 100.0f);
    }

    @Override // defpackage.jat
    protected final amvn a(agvv agvvVar) {
        aqog g;
        amvl i = amvn.i();
        for (agqh agqhVar : agvvVar.j()) {
            String str = agqhVar.a.a;
            agqg d = agvvVar.d(str);
            if (d != null) {
                g = l(d);
            } else {
                g = g(str);
            }
            if (g != null) {
                i.c(g);
            }
        }
        return i.g();
    }

    @Override // defpackage.jat
    protected final void c(aajs aajsVar, agqh agqhVar) {
        aajsVar.j(g(agqhVar.a.a));
    }

    @Override // defpackage.jat
    protected final void d(aajs aajsVar, String str) {
        aopa createBuilder = aqof.a.createBuilder();
        createBuilder.copyOnWrite();
        aqof aqofVar = (aqof) createBuilder.instance;
        str.getClass();
        aqofVar.b = 2;
        aqofVar.c = str;
        aajsVar.g(emn.e((aqof) createBuilder.mo39build()));
    }

    @Override // defpackage.jat
    protected final void e(aajs aajsVar, agqh agqhVar, agqg agqgVar) {
        aqog l = l(agqgVar);
        if (l != null) {
            aajsVar.j(l);
        }
    }
}
