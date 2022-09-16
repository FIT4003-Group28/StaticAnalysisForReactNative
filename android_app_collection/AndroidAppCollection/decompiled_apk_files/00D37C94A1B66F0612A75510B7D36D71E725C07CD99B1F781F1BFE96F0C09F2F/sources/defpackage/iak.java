package defpackage;

import android.text.TextUtils;
import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
import j$.util.Optional;
import java.util.Iterator;
import java.util.Map;
/* compiled from: PG */
/* renamed from: iak  reason: default package */
/* loaded from: classes3.dex */
public final class iak implements ynl {
    public final snc b;
    public acvg c;
    public long d;
    public boolean e;
    private final ifk g;
    private final acvf h;
    private String i;
    public final Object a = new Object();
    public int f = 1;

    public iak(ifk ifkVar, acvf acvfVar, snc sncVar) {
        this.g = ifkVar;
        this.h = acvfVar;
        this.b = sncVar;
    }

    public static int i(ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint) {
        if (hqp.g(reelWatchEndpointOuterClass$ReelWatchEndpoint)) {
            return 4;
        }
        return hqp.n(reelWatchEndpointOuterClass$ReelWatchEndpoint) ? 3 : 2;
    }

    public final Optional a() {
        return Optional.ofNullable(this.c);
    }

    public final void b() {
        synchronized (this.a) {
            acvg acvgVar = this.c;
            if (acvgVar != null) {
                ifk ifkVar = this.g;
                synchronized (ifkVar.b) {
                    Iterator it = ifkVar.b.entrySet().iterator();
                    while (it.hasNext()) {
                        if (((Map.Entry) it.next()).getValue() == acvgVar) {
                            it.remove();
                        }
                    }
                }
                this.c = null;
                this.i = null;
                this.f = 1;
            }
        }
    }

    public final void c(String str) {
        synchronized (this.a) {
            acvg acvgVar = this.c;
            if (acvgVar != null) {
                acvgVar.c(str);
            }
        }
    }

    public final void d(String str, long j) {
        if (j > 0) {
            synchronized (this.a) {
                acvg acvgVar = this.c;
                if (acvgVar != null) {
                    acvgVar.d(str, j);
                }
            }
        }
    }

    public final void e(String str) {
        synchronized (this.a) {
            if (this.c != null && amps.e(this.i) && str != null) {
                this.i = str;
            }
        }
    }

    public final void g(String str, long j) {
        synchronized (this.a) {
            if (this.c != null && h(str)) {
                if (j != 0) {
                    this.c.d("r_vtc", j);
                } else {
                    this.c.c("r_vtc");
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean h(String str) {
        if (this.c == null) {
            return false;
        }
        String str2 = this.i;
        return str2 == null || str2.equals(str);
    }

    public final void j(int i, int i2, ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint, acvg acvgVar, long j) {
        acvg acvgVar2;
        if (this.c != null) {
            synchronized (this.a) {
                acvg acvgVar3 = this.c;
                if (acvgVar3 != null && !this.e) {
                    acvgVar3.c("aa");
                    this.e = true;
                }
            }
            b();
        }
        long c = j == 0 ? this.b.c() : j;
        if (acvgVar == null) {
            acvgVar2 = this.h.c(asny.LATENCY_ACTION_REEL_WATCH);
            acvgVar2.f(c);
        } else {
            acvgVar2 = acvgVar;
        }
        aopa createBuilder = asnq.a.createBuilder();
        if (i == 1) {
            createBuilder.copyOnWrite();
            asnq asnqVar = (asnq) createBuilder.instance;
            asnqVar.d = 5;
            asnqVar.b |= 8;
        } else if (i == 2) {
            createBuilder.copyOnWrite();
            asnq asnqVar2 = (asnq) createBuilder.instance;
            asnqVar2.d = 4;
            asnqVar2.b |= 8;
        } else if (i == 3) {
            createBuilder.copyOnWrite();
            asnq asnqVar3 = (asnq) createBuilder.instance;
            asnqVar3.d = 10;
            asnqVar3.b |= 8;
        } else if (i == 4) {
            createBuilder.copyOnWrite();
            asnq asnqVar4 = (asnq) createBuilder.instance;
            asnqVar4.d = 9;
            asnqVar4.b |= 8;
        } else if (i == 5) {
            createBuilder.copyOnWrite();
            asnq asnqVar5 = (asnq) createBuilder.instance;
            asnqVar5.d = 2;
            asnqVar5.b |= 8;
        } else {
            createBuilder.copyOnWrite();
            asnq asnqVar6 = (asnq) createBuilder.instance;
            asnqVar6.d = 1;
            asnqVar6.b |= 8;
        }
        int bH = awwc.bH(reelWatchEndpointOuterClass$ReelWatchEndpoint.c);
        if (bH == 0) {
            bH = 1;
        }
        this.f = i(reelWatchEndpointOuterClass$ReelWatchEndpoint);
        aopa createBuilder2 = asnu.a.createBuilder();
        createBuilder2.copyOnWrite();
        asnu asnuVar = (asnu) createBuilder2.instance;
        asnuVar.c = i2 - 1;
        asnuVar.b |= 1;
        int i3 = this.f;
        createBuilder2.copyOnWrite();
        asnu asnuVar2 = (asnu) createBuilder2.instance;
        int i4 = i3 - 1;
        if (i3 == 0) {
            throw null;
        }
        asnuVar2.f = i4;
        asnuVar2.b |= 8;
        createBuilder2.copyOnWrite();
        asnu asnuVar3 = (asnu) createBuilder2.instance;
        asnuVar3.g = bH - 1;
        asnuVar3.b |= 16;
        createBuilder2.copyOnWrite();
        asnu asnuVar4 = (asnu) createBuilder2.instance;
        asnuVar4.d = 1;
        asnuVar4.b |= 2;
        createBuilder2.copyOnWrite();
        asnu asnuVar5 = (asnu) createBuilder2.instance;
        asnuVar5.e = 0;
        asnuVar5.b |= 4;
        if ((reelWatchEndpointOuterClass$ReelWatchEndpoint.b & 33554432) != 0) {
            int bI = awwc.bI(reelWatchEndpointOuterClass$ReelWatchEndpoint.x);
            if (bI == 0) {
                bI = 1;
            }
            createBuilder2.copyOnWrite();
            asnu asnuVar6 = (asnu) createBuilder2.instance;
            asnuVar6.h = bI - 1;
            asnuVar6.b |= 32;
        }
        aopa createBuilder3 = asno.a.createBuilder();
        createBuilder3.copyOnWrite();
        asno asnoVar = (asno) createBuilder3.instance;
        asnu asnuVar7 = (asnu) createBuilder2.mo39build();
        asnuVar7.getClass();
        asnoVar.x = asnuVar7;
        asnoVar.c |= 1073741824;
        createBuilder3.copyOnWrite();
        asno asnoVar2 = (asno) createBuilder3.instance;
        asnq asnqVar7 = (asnq) createBuilder.mo39build();
        asnqVar7.getClass();
        asnoVar2.v = asnqVar7;
        asnoVar2.c |= 262144;
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            long j2 = this.d;
            if (j2 > 0) {
                long j3 = c - j2;
                if (j3 < 2147483647L) {
                    createBuilder3.copyOnWrite();
                    asno asnoVar3 = (asno) createBuilder3.instance;
                    asnoVar3.b |= 4194304;
                    asnoVar3.n = (int) j3;
                }
            }
        }
        acvgVar2.a((asno) createBuilder3.mo39build());
        synchronized (this.a) {
            this.c = acvgVar2;
            this.e = false;
            this.d = c;
        }
    }

    public final void k(int i, int i2, ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint, acvg acvgVar, long j) {
        j(i, i2, reelWatchEndpointOuterClass$ReelWatchEndpoint, acvgVar, j);
        e(reelWatchEndpointOuterClass$ReelWatchEndpoint.d);
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                ahhw ahhwVar = (ahhw) obj;
                synchronized (this.a) {
                    if (this.c != null && !TextUtils.isEmpty(ahhwVar.e())) {
                        aopa createBuilder = asno.a.createBuilder();
                        String e = ahhwVar.e();
                        createBuilder.copyOnWrite();
                        asno asnoVar = (asno) createBuilder.instance;
                        e.getClass();
                        asnoVar.b |= 1024;
                        asnoVar.j = e;
                        this.c.a((asno) createBuilder.mo39build());
                    }
                }
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{ahhw.class};
    }
}
