package defpackage;

import android.os.Handler;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aeyf  reason: default package */
/* loaded from: classes.dex */
public final class aeyf extends pvn {
    private final List a = new ArrayList();
    private final aevy b;
    private final Handler e;

    public aeyf(aevy aevyVar, Handler handler) {
        this.b = aevyVar;
        this.e = handler;
    }

    private final pvf g(final afbi afbiVar, TrackGroupArray trackGroupArray, FormatStreamModel[] formatStreamModelArr, afbl afblVar) {
        PlayerConfigModel a;
        String str;
        final afhh g;
        afev affpVar;
        for (int i = 0; i < trackGroupArray.b; i++) {
            TrackGroup b = trackGroupArray.b(i);
            List h = h(b, formatStreamModelArr);
            if (!h.isEmpty()) {
                if (h.size() == 1) {
                    return new pvg(b, ((Integer) h.get(0)).intValue(), 1, afblVar);
                }
                aexi aexiVar = this.b.a;
                aexa aexaVar = new aexa(afbiVar, 4);
                aevy aevyVar = this.b;
                int[] y = almu.y(h);
                synchronized (afbiVar) {
                    a = afbiVar.a();
                    str = afbiVar.b().c;
                    g = afbiVar.g();
                }
                aegx aegxVar = afblVar.b.f;
                afjz afjzVar = aevyVar.s;
                yrj yrjVar = aevyVar.d;
                if (afjzVar.aJ()) {
                    affpVar = new affc(afjzVar, afbiVar.K);
                } else {
                    aepf aepfVar = aexiVar.c;
                    adzz adzzVar = aexiVar.d;
                    boolean aL = a.aL();
                    afmw afmwVar = aevyVar.f;
                    float e = a.e();
                    float d = a.d();
                    String str2 = afbiVar.a;
                    g.getClass();
                    affpVar = new affp(aepfVar, yrjVar, a, adzzVar, aL, afmwVar, aegxVar, aexaVar, e, d, str, str2, afjzVar, new amqo() { // from class: aexb
                        @Override // defpackage.amqo
                        public final Object get() {
                            return Long.valueOf(afhh.this.e());
                        }
                    }, new afkm() { // from class: aewz
                        @Override // defpackage.afkm
                        public final void a(final afkn afknVar) {
                            final afbi afbiVar2 = afbi.this;
                            final aewx aewxVar = (aewx) afbiVar2.e;
                            aewxVar.k.post(new Runnable() { // from class: aewg
                                @Override // java.lang.Runnable
                                public final void run() {
                                    aewx aewxVar2 = aewx.this;
                                    afbi afbiVar3 = afbiVar2;
                                    afkn afknVar2 = afknVar;
                                    afbiVar3.b.v();
                                    aewxVar2.u(afbiVar3.b, afknVar2);
                                }
                            });
                        }
                    }, afbiVar.K, afbiVar.b);
                }
                aevs aevsVar = new aevs(affpVar, b, afblVar, afbiVar.d, aevyVar.s, a.J(), y);
                synchronized (this.a) {
                    this.a.add(new WeakReference(aevsVar));
                }
                return aevsVar;
            }
        }
        throw new IllegalStateException("getTrackSelection() failed");
    }

    private static final List h(TrackGroup trackGroup, FormatStreamModel[] formatStreamModelArr) {
        ArrayList arrayList = new ArrayList(trackGroup.a);
        for (int i = 0; i < trackGroup.a; i++) {
            String str = trackGroup.a(i).a;
            int i2 = 0;
            while (true) {
                if (i2 >= formatStreamModelArr.length) {
                    break;
                } else if (formatStreamModelArr[i2].e.equals(str)) {
                    arrayList.add(Integer.valueOf(i));
                    break;
                } else {
                    i2++;
                }
            }
        }
        return arrayList;
    }

    @Override // defpackage.pvn
    public final void a(Object obj) {
        if (obj == null) {
            return;
        }
        afms.b(obj instanceof afbl);
        afbl afblVar = (afbl) obj;
        afbi afbiVar = afblVar.a;
        aevy aevyVar = this.b;
        afmw afmwVar = aevyVar.f;
        afjz afjzVar = aevyVar.s;
        yrj yrjVar = aevyVar.d;
        afbl afblVar2 = afbiVar.w;
        boolean z = false;
        if (afblVar2 != null && afblVar2.d && !afblVar.d) {
            z = true;
        }
        synchronized (afbiVar) {
            afbiVar.w = afblVar;
        }
        Object obj2 = afmwVar.get();
        if (!z) {
            return;
        }
        afbiVar.y(afjzVar, yrjVar, (afmv) obj2, 10002, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0118 A[LOOP:0: B:55:0x0118->B:74:0x0197, LOOP_START, PHI: r3 r5 r6 
      PHI: (r3v10 aflk) = (r3v3 aflk), (r3v13 aflk) binds: [B:54:0x0116, B:74:0x0197] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r5v1 int) = (r5v0 int), (r5v4 int) binds: [B:54:0x0116, B:74:0x0197] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r6v6 aflj) = (r6v0 aflj), (r6v9 aflj) binds: [B:54:0x0116, B:74:0x0197] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.pvn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.pvo b(defpackage.pke[] r29, com.google.android.exoplayer2.source.TrackGroupArray r30, defpackage.ppz r31, defpackage.pkt r32) {
        /*
            Method dump skipped, instructions count: 465
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeyf.b(pke[], com.google.android.exoplayer2.source.TrackGroupArray, ppz, pkt):pvo");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(afbi afbiVar) {
        aenf aenfVar;
        if (afbiVar != null && (aenfVar = afbiVar.d) != null) {
            aenfVar.e(null, null, null);
        }
        pvm pvmVar = this.c;
        if (pvmVar != null) {
            ((pip) pvmVar).a.g(10);
        }
    }

    public final void d(pht phtVar, Object obj, int i) {
        synchronized (this.a) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                aevs aevsVar = (aevs) ((WeakReference) it.next()).get();
                if (aevsVar != null) {
                    pkc d = phtVar.d(aevsVar);
                    d.e(obj);
                    d.f(i);
                    d.d();
                } else {
                    it.remove();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(pht phtVar, float f) {
        d(phtVar, Float.valueOf(f), 10003);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(pht phtVar, aegx aegxVar) {
        d(phtVar, aegxVar, 10002);
    }
}
