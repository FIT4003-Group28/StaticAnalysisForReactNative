package defpackage;
/* compiled from: PG */
/* renamed from: zax  reason: default package */
/* loaded from: classes7.dex */
public final class zax {
    public static void a(dopk dopkVar, dbsz<zaw> dbszVar) {
        for (doom doomVar : dopkVar.f) {
            for (dooo doooVar : doomVar.c) {
                for (doog doogVar : doooVar.e) {
                    String str = (doogVar.a & 1) != 0 ? doogVar.b : null;
                    for (dood doodVar : doogVar.e) {
                        if (doodVar.b == 1) {
                            dbszVar.NU(new yyn((dooa) doodVar.c, str, doooVar.c, (doodVar.a & 64) != 0 ? doodVar.j : -1));
                        }
                    }
                }
            }
        }
    }
}
