package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aewu  reason: default package */
/* loaded from: classes.dex */
public final class aewu extends aggw {
    final afbi a;
    afnh b;
    final /* synthetic */ aewx c;
    private float d;
    private final pkh e;
    private final aetv f;
    private long g = -1;
    private float h;

    public aewu(aewx aewxVar, aetw aetwVar, afbi afbiVar, boolean z) {
        this.c = aewxVar;
        this.b = aetwVar.b();
        this.d = aetwVar.j;
        this.f = aetwVar.a();
        aess aessVar = aetwVar.c;
        this.a = afbiVar;
        afbiVar.l = aetwVar.k;
        if (z) {
            if (afbiVar.f != aessVar.a) {
                afbiVar.g = 0;
            }
            if (aewxVar.i.s.ai() && afgn.c(afbiVar.l, 16)) {
                afbiVar.r(afll.f);
                aewxVar.z();
            }
        }
        afbiVar.f = aessVar.a;
        this.e = new pkh(phk.c(aessVar.b), 0L);
        this.h = aetwVar.i;
    }

    @Override // defpackage.aggw
    public final afbi a(String str, PlayerConfigModel playerConfigModel, aetv aetvVar, VideoStreamingData videoStreamingData, int i) {
        if (!this.c.i.s.o().v) {
            aqwu aqwuVar = playerConfigModel.c.e;
            if (aqwuVar == null) {
                aqwuVar = aqwu.b;
            }
            if (!aqwuVar.be && this.a.a.equals(str) && this.a.a() == playerConfigModel && this.a.b() == videoStreamingData) {
                pqb pqbVar = this.c.E;
                if (pqbVar instanceof aeyc) {
                    ((aeyc) pqbVar).B();
                }
                if (this.c.i.s.o().u) {
                    this.a.b = aetvVar;
                }
                return this.a;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01aa A[Catch: poe -> 0x0229, all -> 0x046d, TryCatch #0 {poe -> 0x0229, blocks: (B:55:0x0161, B:57:0x016b, B:60:0x0180, B:62:0x018c, B:63:0x018e, B:68:0x0198, B:70:0x01aa, B:72:0x01b1, B:74:0x01b6, B:76:0x01bd, B:78:0x01cd, B:82:0x01da, B:84:0x01e2, B:87:0x01eb, B:89:0x01f5, B:91:0x020a, B:93:0x020e, B:95:0x0218, B:97:0x0224, B:75:0x01b9), top: B:166:0x0161, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01b6 A[Catch: poe -> 0x0229, all -> 0x046d, TryCatch #0 {poe -> 0x0229, blocks: (B:55:0x0161, B:57:0x016b, B:60:0x0180, B:62:0x018c, B:63:0x018e, B:68:0x0198, B:70:0x01aa, B:72:0x01b1, B:74:0x01b6, B:76:0x01bd, B:78:0x01cd, B:82:0x01da, B:84:0x01e2, B:87:0x01eb, B:89:0x01f5, B:91:0x020a, B:93:0x020e, B:95:0x0218, B:97:0x0224, B:75:0x01b9), top: B:166:0x0161, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01b9 A[Catch: poe -> 0x0229, all -> 0x046d, TryCatch #0 {poe -> 0x0229, blocks: (B:55:0x0161, B:57:0x016b, B:60:0x0180, B:62:0x018c, B:63:0x018e, B:68:0x0198, B:70:0x01aa, B:72:0x01b1, B:74:0x01b6, B:76:0x01bd, B:78:0x01cd, B:82:0x01da, B:84:0x01e2, B:87:0x01eb, B:89:0x01f5, B:91:0x020a, B:93:0x020e, B:95:0x0218, B:97:0x0224, B:75:0x01b9), top: B:166:0x0161, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01e2 A[Catch: poe -> 0x0229, all -> 0x046d, TryCatch #0 {poe -> 0x0229, blocks: (B:55:0x0161, B:57:0x016b, B:60:0x0180, B:62:0x018c, B:63:0x018e, B:68:0x0198, B:70:0x01aa, B:72:0x01b1, B:74:0x01b6, B:76:0x01bd, B:78:0x01cd, B:82:0x01da, B:84:0x01e2, B:87:0x01eb, B:89:0x01f5, B:91:0x020a, B:93:0x020e, B:95:0x0218, B:97:0x0224, B:75:0x01b9), top: B:166:0x0161, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01eb A[Catch: poe -> 0x0229, all -> 0x046d, TryCatch #0 {poe -> 0x0229, blocks: (B:55:0x0161, B:57:0x016b, B:60:0x0180, B:62:0x018c, B:63:0x018e, B:68:0x0198, B:70:0x01aa, B:72:0x01b1, B:74:0x01b6, B:76:0x01bd, B:78:0x01cd, B:82:0x01da, B:84:0x01e2, B:87:0x01eb, B:89:0x01f5, B:91:0x020a, B:93:0x020e, B:95:0x0218, B:97:0x0224, B:75:0x01b9), top: B:166:0x0161, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 1144
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aewu.b():void");
    }

    @Override // defpackage.aggw
    public final void c(afnh afnhVar) {
        this.b = afnhVar;
    }

    @Override // defpackage.aggw
    public final void d(auz auzVar) {
        afbi afbiVar = this.a;
        afbi afbiVar2 = afbiVar.z;
        afgf afgfVar = afbiVar.j;
        this.c.ab(afbiVar);
        if (afbiVar2 == null || afgfVar == null) {
            boolean z = afbiVar2 != null;
            boolean z2 = afgfVar != null;
            StringBuilder sb = new StringBuilder(128);
            sb.append("queuedPlayback & queuedVideo must be set for transitionToQueuedVideo but queuedPlayback != null:");
            sb.append(z);
            sb.append(", queuedVideo != null:");
            sb.append(z2);
            final String sb2 = sb.toString();
            afus.b(2, 6, sb2);
            afkj.e(afki.EXO, "%s", sb2);
            this.c.k.post(new Runnable() { // from class: aewt
                @Override // java.lang.Runnable
                public final void run() {
                    aewu aewuVar = aewu.this;
                    String str = sb2;
                    aewx aewxVar = aewuVar.c;
                    aewxVar.u(aewuVar.a.b, new afkn("player.fatalexception", aewxVar.g(), new IllegalStateException(str)));
                }
            });
            return;
        }
        if (this.a.F) {
            afau afauVar = this.c.C;
            synchronized (afauVar.d) {
                afauVar.k(afbiVar2);
                int i = 0;
                while (true) {
                    if (i >= afauVar.c.size()) {
                        i = -1;
                        break;
                    } else if (((afao) afauVar.c.get(i)).c.equals(afbiVar2)) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i >= 0) {
                    afauVar.k = (afao) afauVar.c.get(i);
                    afauVar.c.subList(0, i).clear();
                    String b = afau.b(afbiVar2);
                    try {
                        afhl afhlVar = afauVar.e;
                        afms.d(afhlVar.e == 3);
                        aopa createBuilder = adzq.a.createBuilder();
                        createBuilder.copyOnWrite();
                        adzq adzqVar = (adzq) createBuilder.instance;
                        b.getClass();
                        adzqVar.b |= 1;
                        adzqVar.c = b;
                        try {
                            try {
                                adzr adzrVar = (adzr) aopi.parseFrom(adzr.a, afhlVar.d.a.a("transitionToQueuedClip", ((adzq) createBuilder.mo39build()).toByteArray()), aoos.b());
                                synchronized (afhlVar.c) {
                                    int i2 = 0;
                                    while (i2 < afhlVar.b.size() && !((aksq) afhlVar.b.get(i2)).a.equals(b)) {
                                        ((aksq) afhlVar.b.get(i2)).b();
                                        i2++;
                                    }
                                    afhlVar.b.subList(0, i2).clear();
                                }
                            } catch (aopx e) {
                                throw new RuntimeException("Unexpected protobuf error", e);
                            }
                        } catch (RuntimeException e2) {
                            throw new afgy(5, "Unexpected error calling into JS.", e2);
                        }
                    } catch (afgy e3) {
                        afauVar.g(e3, afbiVar2);
                    }
                } else {
                    afauVar.j(afbiVar2);
                }
            }
        }
        afbi afbiVar3 = this.a;
        long j = afbiVar3.k;
        if (j != -1) {
            afbiVar3.b.y(j);
        } else {
            long j2 = afgfVar.a;
            if (j2 != -1) {
                afbiVar3.b.y(j2);
            } else {
                afbiVar3.b.y(afbiVar3.b().d);
            }
        }
        afgfVar.b.a().j(afbiVar2.i());
        afbiVar2.c.c(auzVar, true, this.c.g.m());
        aetw aetwVar = new aetw(afgfVar.b);
        aetwVar.f = this.b;
        aetwVar.s(Integer.valueOf(this.a.l));
        aewu aewuVar = new aewu(this.c, aetwVar, afbiVar2, true);
        aevy aevyVar = this.c.i;
        aevyVar.l = true;
        afbiVar2.g = 2;
        aevyVar.f(afbiVar2);
        aexl aexlVar = this.c.h;
        aetw aetwVar2 = afgfVar.b;
        aexlVar.k(aetwVar2.e, aetwVar2.a, aetwVar2.d);
        aewx aewxVar = this.c;
        aewxVar.d.l(this.f, aewxVar.i.s.af(), this.a.a());
        aewx aewxVar2 = this.c;
        aewxVar2.i.i = true;
        aewxVar2.U(aewuVar);
    }
}
