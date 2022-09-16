package defpackage;

import android.net.Uri;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: PG */
/* renamed from: ahdl  reason: default package */
/* loaded from: classes.dex */
public final class ahdl {
    private final afvn a;
    private final azqb b;
    private final azqb c;
    private final azqb d;
    private final aimx e;
    private final azqb f;
    private final azqb g;
    private final azqb h;
    private final aimx i;
    private final akqy j;

    public ahdl(snc sncVar, afvn afvnVar, azqb azqbVar, azqb azqbVar2, azqb azqbVar3, ailw ailwVar, aimx aimxVar, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6) {
        agix agixVar;
        ahdh ahdhVar;
        this.a = afvnVar;
        this.b = azqbVar;
        this.d = azqbVar3;
        this.e = ailwVar;
        this.c = azqbVar2;
        this.h = azqbVar4;
        this.f = azqbVar5;
        this.g = azqbVar6;
        this.i = aimxVar;
        akqr akqrVar = new akqr();
        akqrVar.c = agix.j;
        akqrVar.a = new ahdi(sncVar);
        akqrVar.b = ahdh.a;
        ahdi ahdiVar = akqrVar.a;
        if (ahdiVar == null || (agixVar = akqrVar.c) == null || (ahdhVar = akqrVar.b) == null) {
            StringBuilder sb = new StringBuilder();
            if (akqrVar.a == null) {
                sb.append(" expiryGenerator");
            }
            if (akqrVar.c == null) {
                sb.append(" keyConverter");
            }
            if (akqrVar.b == null) {
                sb.append(" costGenerator");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        this.j = new akqy(new akqt(ahdiVar, agixVar, ahdhVar, null), anjk.a, sncVar);
    }

    public static boolean e(int i) {
        return i == ahdp.a(attl.AUDIO_ONLY, -1);
    }

    public static final boolean f(PlayerResponseModel playerResponseModel) {
        asaa t = playerResponseModel.t();
        return t != null && aijr.j(t);
    }

    public static final String g(PlayerResponseModel playerResponseModel) {
        asaa t = playerResponseModel.t();
        if (t == null || amps.e(t.d)) {
            return null;
        }
        return t.d;
    }

    public static final boolean h(PlayerResponseModel playerResponseModel) {
        int ak;
        atse u = playerResponseModel.u();
        return (u == null || (ak = akel.ak(u.h)) == 0 || ak != 2) ? false : true;
    }

    public static final boolean i(PlayerResponseModel playerResponseModel) {
        asaa t = playerResponseModel.t();
        return t != null && aijr.i(t);
    }

    public final FormatStreamModel a(FormatStreamModel formatStreamModel) {
        if (formatStreamModel.j() <= 0 || formatStreamModel.e() == 22) {
            yix c = yix.c();
            ((afyf) this.f.get()).a(formatStreamModel.d, c);
            try {
                long longValue = ((Long) c.get()).longValue();
                aopc aopcVar = (aopc) formatStreamModel.a.mo52toBuilder();
                Uri.Builder buildUpon = formatStreamModel.d.buildUpon();
                String str = formatStreamModel.b;
                long j = formatStreamModel.c;
                aopcVar.copyOnWrite();
                aqzx aqzxVar = (aqzx) aopcVar.instance;
                aqzxVar.c |= 2048;
                aqzxVar.p = longValue;
                return aaly.a(buildUpon, str, j, aopcVar);
            } catch (ExecutionException e) {
                throw new IOException("fetchContentLengthIfNecessary failed", e);
            }
        }
        return formatStreamModel;
    }

    public final void b(final String str) {
        final akqy akqyVar = this.j;
        final ampt amptVar = new ampt() { // from class: ahdj
            @Override // defpackage.ampt
            public final boolean a(Object obj) {
                ahdl.this.j(str, (ahdk) obj);
                return false;
            }
        };
        ylx.j(anlz.v(new aniq() { // from class: akqu
            @Override // defpackage.aniq
            public final ankt a() {
                akqy akqyVar2 = akqy.this;
                ampt amptVar2 = amptVar;
                for (Object obj : akqyVar2.d.e().keySet()) {
                    amptVar2.a(obj);
                }
                return anlz.q(null);
            }
        }, akqyVar.b), anjk.a, afsc.o);
    }

    public final /* synthetic */ void j(String str, ahdk ahdkVar) {
        ArrayList arrayList = new ArrayList();
        if (ahdkVar.a.equals(str)) {
            this.j.d.i(ahdkVar);
            arrayList.add(anlz.q(null));
        }
        try {
            anlz.j(arrayList).a(almu.o(), anjk.a).get(1L, TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            afus.c(2, 28, "Some error occurred when evicting player response", e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0071, code lost:
        if (r9.p == false) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel k(int r9, int r10, int r11, com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData r12, boolean r13, com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel r14) {
        /*
            r8 = this;
            boolean r0 = e(r9)
            r1 = 0
            if (r0 == 0) goto Lb
            if (r13 == 0) goto La
            goto Lb
        La:
            return r1
        Lb:
            boolean r0 = r12.v
            if (r0 == 0) goto L25
            azqb r0 = r8.g
            java.lang.Object r0 = r0.get()
            aerm r0 = (defpackage.aerm) r0
            java.lang.String r2 = r12.c
            boolean r0 = r0.d(r2)
            if (r0 != 0) goto L25
            r0 = 480(0x1e0, float:6.73E-43)
            int r10 = java.lang.Math.min(r10, r0)
        L25:
            r7 = r10
            azqb r10 = r8.h
            java.lang.Object r10 = r10.get()
            ahde r10 = (defpackage.ahde) r10
            aegs r6 = new aegs
            aegx r0 = new aegx
            r0.<init>(r9, r9)
            aegx r9 = defpackage.ahde.b(r11)
            r11 = 1
            r6.<init>(r0, r9, r11, r1)
            azqb r9 = r10.a     // Catch: defpackage.aegw -> L83
            java.lang.Object r9 = r9.get()     // Catch: defpackage.aegw -> L83
            r2 = r9
            aegq r2 = (defpackage.aegq) r2     // Catch: defpackage.aegw -> L83
            com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData r3 = r12.m()     // Catch: defpackage.aegw -> L83
            r4 = r14
            r5 = r13
            aegu r9 = r2.d(r3, r4, r5, r6, r7)     // Catch: defpackage.aegw -> L83
            com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel[] r10 = r9.g()     // Catch: defpackage.aegw -> L83
            if (r13 == 0) goto L59
            com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel[] r9 = r9.b     // Catch: defpackage.aegw -> L83
            goto L5a
        L59:
            r9 = r10
        L5a:
            int r11 = r9.length     // Catch: defpackage.aegw -> L83
            r12 = 0
            if (r11 <= 0) goto L61
            r9 = r9[r12]     // Catch: defpackage.aegw -> L83
            goto L84
        L61:
            atzv r9 = r14.c     // Catch: defpackage.aegw -> L83
            int r11 = r9.b     // Catch: defpackage.aegw -> L83
            r11 = r11 & 8192(0x2000, float:1.14794E-41)
            if (r11 == 0) goto L73
            apfm r9 = r9.j     // Catch: defpackage.aegw -> L83
            if (r9 != 0) goto L6f
            apfm r9 = defpackage.apfm.a     // Catch: defpackage.aegw -> L83
        L6f:
            boolean r9 = r9.p     // Catch: defpackage.aegw -> L83
            if (r9 != 0) goto L83
        L73:
            if (r13 == 0) goto L83
            int r9 = r10.length     // Catch: defpackage.aegw -> L83
            if (r9 <= 0) goto L83
            r9 = r10[r12]     // Catch: defpackage.aegw -> L83
            boolean r9 = r9.M()     // Catch: defpackage.aegw -> L83
            if (r9 == 0) goto L83
            r9 = r10[r12]     // Catch: defpackage.aegw -> L83
            goto L84
        L83:
            r9 = r1
        L84:
            if (r9 == 0) goto L8b
            com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel r9 = r8.a(r9)     // Catch: java.io.IOException -> L8b
            return r9
        L8b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahdl.k(int, int, int, com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData, boolean, com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel):com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel");
    }

    public final PlayerResponseModel l(String str, int i, byte[] bArr) {
        ankt v;
        akqs a;
        ankt q;
        ylr.b();
        final ahdk ahdkVar = new ahdk(this.a.c().d(), str, i, bArr != null ? bArr : new byte[0]);
        Object obj = null;
        int i2 = 2;
        try {
            akqy akqyVar = this.j;
            akqx akqxVar = (akqx) akqyVar.d.c(ahdkVar);
            if (akqxVar == null) {
                a = null;
            } else {
                long j = akqxVar.b;
                if (j != 0) {
                    a = akqs.a(akqxVar.a, j > akqyVar.c.d() ? 2 : 4);
                } else {
                    a = akqs.a(akqxVar.a, 2);
                }
            }
            if (a == null) {
                q = anlz.q(amon.a);
            } else {
                q = anlz.q(ampq.j(a));
            }
            ankq ankqVar = (ankq) q;
            ampq ampqVar = (ampq) ((ankq) q).b;
            if (ampqVar.h() && ((akqs) ampqVar.c()).b != 4) {
                obj = ((akqs) ampqVar.c()).a;
            }
        } catch (InterruptedException | ExecutionException e) {
            afus.c(2, 28, "Some error occurred when reading from the cache player response", e);
        }
        if (obj != null) {
            return (PlayerResponseModel) obj;
        }
        ailv ailvVar = (ailv) this.b.get();
        aina c = ((aimy) this.c.get()).c();
        c.v = true;
        c.b = str;
        if (bArr != null) {
            c.k(bArr);
        } else {
            c.i();
        }
        int i3 = i - 1;
        if (i3 != 1) {
            i2 = i3 != 2 ? 1 : 3;
        }
        if (i2 != 1) {
            c.Y = i2;
        }
        ((aios) this.d.get()).rj(c);
        this.e.rj(c);
        aimx aimxVar = this.i;
        if (aimxVar != null) {
            aimxVar.rj(c);
        }
        final PlayerResponseModel a2 = ailvVar.a(c);
        final akqy akqyVar2 = this.j;
        if (a2 == null) {
            v = anlz.p(new IllegalArgumentException("value cannot be null."));
        } else {
            v = anlz.v(new aniq() { // from class: akqv
                @Override // defpackage.aniq
                public final ankt a() {
                    akqy akqyVar3 = akqy.this;
                    Object obj2 = ahdkVar;
                    Object obj3 = a2;
                    akqx akqxVar2 = new akqx();
                    akqxVar2.a = obj3;
                    akqxVar2.c = 1;
                    long c2 = akqyVar3.a.a.a.c() + 3600000;
                    if (c2 > 0) {
                        long d = akqyVar3.c.d() + (c2 - akqyVar3.c.c());
                        if (d <= 0) {
                            d = -1;
                        }
                        akqxVar2.b = d;
                    } else {
                        akqxVar2.b = c2;
                    }
                    akqyVar3.d.d(obj2, akqxVar2);
                    akqyVar3.e.addAndGet(akqxVar2.c);
                    if (akqyVar3.e.get() > 50) {
                        Iterator it = akqyVar3.d.e().keySet().iterator();
                        while (akqyVar3.e.get() > 50) {
                            if (it.hasNext()) {
                                akqyVar3.d.i(it.next());
                            }
                        }
                    }
                    return anlz.q(null);
                }
            }, akqyVar2.b);
        }
        ylx.j(v, anjk.a, afsc.p);
        return a2;
    }
}
