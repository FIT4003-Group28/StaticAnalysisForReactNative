package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import java.util.concurrent.Executor;
import org.chromium.net.CronetEngine;
/* compiled from: PG */
/* renamed from: aflf  reason: default package */
/* loaded from: classes.dex */
public final class aflf {
    public final asv a;
    private final poh b;
    private aekx c;
    private aeif d;
    private final afew e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public aflf(android.content.Context r23, final java.lang.String r24, final defpackage.adxw r25, final defpackage.aadd r26, final java.util.concurrent.Executor r27, defpackage.atk[] r28, defpackage.atk[] r29, defpackage.adzo r30, defpackage.aeju r31, defpackage.azqb r32, defpackage.afla r33, defpackage.aegh r34, defpackage.afbz r35, java.util.concurrent.ScheduledExecutorService r36, defpackage.snc r37, defpackage.aeln r38, defpackage.yrj r39, defpackage.aehz r40, final int r41, boolean r42, final defpackage.afjz r43, defpackage.afex r44, defpackage.afgz r45, defpackage.agpr r46, final defpackage.yrh r47, defpackage.afgv r48, defpackage.afld r49, defpackage.aeky r50, byte[] r51, byte[] r52, byte[] r53) {
        /*
            Method dump skipped, instructions count: 534
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aflf.<init>(android.content.Context, java.lang.String, adxw, aadd, java.util.concurrent.Executor, atk[], atk[], adzo, aeju, azqb, afla, aegh, afbz, java.util.concurrent.ScheduledExecutorService, snc, aeln, yrj, aehz, int, boolean, afjz, afex, afgz, agpr, yrh, afgv, afld, aeky, byte[], byte[], byte[]):void");
    }

    public static afjm a(afle afleVar, amqo amqoVar, amqo amqoVar2, boolean z, int i) {
        return new aflb(afleVar, amqoVar, amqoVar2, z, i);
    }

    public static poh c(PlayerConfigModel playerConfigModel, aadd aaddVar, ati atiVar, atk[] atkVarArr, aehz aehzVar, int i) {
        int n;
        arhd a = aaddVar.a();
        if (a != null) {
            atdy atdyVar = a.i;
            if (atdyVar == null) {
                atdyVar = atdy.a;
            }
            aqww aqwwVar = atdyVar.h;
            if (aqwwVar == null) {
                aqwwVar = aqww.b;
            }
            if (aqwwVar.d) {
                atiVar = aehzVar.a(atiVar);
            }
        }
        if (i == 2) {
            aqwu aqwuVar = playerConfigModel.c.e;
            if (aqwuVar == null) {
                aqwuVar = aqwu.b;
            }
            n = aqwuVar.aS;
        } else {
            n = playerConfigModel.n();
        }
        poh pohVar = new poh(atiVar, n, -1L);
        f(pohVar, atkVarArr);
        return pohVar;
    }

    public static ati d(afjz afjzVar, String str, PlayerConfigModel playerConfigModel, adxw adxwVar, Executor executor, boolean z) {
        CronetEngine a;
        if (!afjzVar.am() || (a = adxwVar.a(afjzVar.n().s)) == null) {
            int m = playerConfigModel.m();
            int o = playerConfigModel.o();
            asz aszVar = new asz();
            aszVar.b = str;
            aszVar.a = ati.a;
            aszVar.c = m;
            aszVar.d = o;
            aszVar.e = z;
            return aszVar.a();
        }
        return aeas.b(a, executor, ati.a, playerConfigModel.m(), playerConfigModel.o(), true, z);
    }

    private static afjp e(afjp afjpVar, azqb azqbVar) {
        return new adxg(azqbVar, afjpVar);
    }

    private static void f(asv asvVar, atk[] atkVarArr) {
        if (atkVarArr == null) {
            return;
        }
        for (atk atkVar : atkVarArr) {
            asvVar.b(atkVar);
        }
    }

    public final void b(PlayerConfigModel playerConfigModel, aenf aenfVar, aeub aeubVar) {
        this.b.b = playerConfigModel.n();
        aekx aekxVar = this.c;
        if (aekxVar != null) {
            aekxVar.a.set(aenfVar);
        }
        aeif aeifVar = this.d;
        if (aeifVar != null) {
            aeifVar.f = aeubVar;
        }
    }

    public aflf() {
    }
}
