package defpackage;

import j$.util.Optional;
import j$.util.function.Consumer;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ifr  reason: default package */
/* loaded from: classes3.dex */
public final class ifr implements afzf {
    public final long a;
    public final snc b;
    public final Map c;
    public boolean d;
    private final String e;
    private final amqo f;
    private final gtc g;
    private final igh h;
    private final Executor i;
    private final acvf j;
    private final airw k;
    private final aego l;
    private final aapv m;
    private final afvn n;
    private final aafd o;

    public ifr(String str, long j, aafd aafdVar, amqo amqoVar, snc sncVar, gtc gtcVar, igh ighVar, Executor executor, acvf acvfVar, airw airwVar, aego aegoVar, aapv aapvVar, afvn afvnVar, Map map, byte[] bArr) {
        this.e = str;
        this.a = j;
        this.o = aafdVar;
        this.f = amqoVar;
        this.b = sncVar;
        this.g = gtcVar;
        this.h = ighVar;
        this.i = executor;
        this.j = acvfVar;
        this.k = airwVar;
        this.l = aegoVar;
        this.m = aapvVar;
        this.n = afvnVar;
        this.c = map;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(long j, apzg apzgVar, igf igfVar, int i, int i2, int i3, boolean z, boolean z2, boolean z3, long j2) {
        Object obj = this.f.get();
        ift iftVar = new ift(j, apzgVar, igfVar, i, i2, i3, z, z2, z3, obj != null && ((aull) obj).r, this.e, j2, this.b, this.i, this.j, this.k, this.h, this.o, this.f, this.l, this.m, this.n, null);
        this.c.put(Integer.valueOf(i), iftVar);
        this.h.d(apzgVar, this.e, true, false, iftVar);
    }

    @Override // defpackage.cez
    public final void kV(cff cffVar) {
        if (this.d) {
            return;
        }
        aafd aafdVar = this.o;
        String str = this.e;
        ArrayList b = aafdVar.b();
        int size = b.size();
        for (int i = 0; i < size; i++) {
            ((ifv) b.get(i)).bm(str);
        }
    }

    @Override // defpackage.afzf
    public final /* synthetic */ void kW() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.cfa
    public final /* bridge */ /* synthetic */ void lG(Object obj) {
        int i;
        boolean z;
        int i2;
        int i3;
        int i4;
        aull aullVar;
        boolean z2;
        boolean z3;
        int i5;
        boolean z4;
        final igf igfVar = (igf) obj;
        if (!this.d) {
            artv artvVar = igfVar.a;
            Object obj2 = this.f.get();
            aull aullVar2 = (aull) obj2;
            if (!ifu.e(aullVar2)) {
                asaj asajVar = artvVar.e;
                if (asajVar == null) {
                    asajVar = asaj.a;
                }
                if ((asajVar.c & 64) != 0) {
                    asaj asajVar2 = artvVar.e;
                    if (asajVar2 == null) {
                        asajVar2 = asaj.a;
                    }
                    if (asajVar2.m.size() > 0 || (obj2 != null && aullVar2.u)) {
                        aapv aapvVar = this.m;
                        afvm c = this.n.c();
                        asaj asajVar3 = artvVar.e;
                        if (asajVar3 == null) {
                            asajVar3 = asaj.a;
                        }
                        arbf arbfVar = asajVar3.K;
                        if (arbfVar == null) {
                            arbfVar = arbf.a;
                        }
                        asaj asajVar4 = artvVar.e;
                        if (asajVar4 == null) {
                            asajVar4 = asaj.a;
                        }
                        arpa arpaVar = asajVar4.d;
                        if (arpaVar == null) {
                            arpaVar = arpa.a;
                        }
                        aapvVar.a(c, arbfVar, arpaVar);
                    }
                }
            }
            aafd aafdVar = this.o;
            long j = this.a;
            boolean z5 = igfVar.c;
            ArrayList b = aafdVar.b();
            int size = b.size();
            int i6 = 0;
            for (int i7 = 0; i7 < size; i7++) {
                ((ifv) b.get(i7)).aT(j, artvVar, z5);
            }
            boolean z6 = obj2 != null && aullVar2.i;
            if (obj2 != null) {
                int i8 = aullVar2.c;
                int i9 = aullVar2.d;
                i = awwc.bN(aullVar2.e);
                if (i == 0) {
                    i = 1;
                }
                z = aullVar2.h;
                i4 = i8;
                i2 = i9;
                i3 = aullVar2.n ? 1 : 0;
            } else {
                i = 4;
                z = false;
                i2 = 5;
                i3 = 0;
                i4 = 3;
            }
            int i10 = i - 1;
            int i11 = (i10 == 2 || i10 == 3) ? 1 : 0;
            final long d = this.b.d();
            if (i2 <= 0 || (artvVar.b & 8) == 0) {
                aullVar = aullVar2;
                z2 = z6;
            } else {
                long j2 = this.a;
                apzg apzgVar = artvVar.f;
                if (apzgVar == null) {
                    apzgVar = apzg.a;
                }
                apzg apzgVar2 = apzgVar;
                if (z) {
                    aulb b2 = aulb.b(artvVar.j);
                    if (b2 == null) {
                        b2 = aulb.REEL_LOOP_BEHAVIOR_UNKNOWN;
                    }
                    if (b2 != aulb.REEL_LOOP_BEHAVIOR_REPEAT) {
                        z4 = true;
                        aullVar = aullVar2;
                        z2 = z6;
                        d(j2, apzgVar2, igfVar, 0, i2, i11, z4, false, z6, d);
                    }
                }
                z4 = false;
                aullVar = aullVar2;
                z2 = z6;
                d(j2, apzgVar2, igfVar, 0, i2, i11, z4, false, z6, d);
            }
            if (i4 > 0 && (artvVar.b & 16) != 0) {
                long j3 = this.a;
                apzg apzgVar3 = artvVar.g;
                if (apzgVar3 == null) {
                    apzgVar3 = apzg.a;
                }
                d(j3, apzgVar3, igfVar, 1, i4, 0, false, false, z2, d);
            }
            if (obj2 != null && aullVar.D) {
                if ((artvVar.b & 8) != 0) {
                    i6 = 1;
                }
                int i12 = i6 ^ 1;
                ifu.d(this.g, this.a, 2, new ifp(this, igfVar, i12 & i11, i12 & i3, z2));
                ifu.d(this.g, this.a, 3, new ifq(this, igfVar, z2));
                return;
            }
            boolean z7 = z2;
            Optional b3 = ifu.b(this.g, this.a, 2);
            if (b3.isPresent()) {
                if ((artvVar.b & 8) != 0) {
                    i6 = 1;
                }
                int i13 = i6 ^ 1;
                boolean z8 = i13 & i3;
                z3 = z7;
                i5 = 3;
                d(this.a, (apzg) b3.get(), igfVar, 2, 1, i13 & i11, z8, z8, z7, d);
            } else {
                z3 = z7;
                i5 = 3;
            }
            final boolean z9 = z3;
            ifu.b(this.g, this.a, i5).ifPresent(new Consumer() { // from class: ifo
                @Override // j$.util.function.Consumer
                public final void accept(Object obj3) {
                    ifr ifrVar = ifr.this;
                    igf igfVar2 = igfVar;
                    boolean z10 = z9;
                    long j4 = d;
                    ifrVar.d(ifrVar.a, (apzg) obj3, igfVar2, 3, 1, 0, false, false, z10, j4);
                }

                @Override // j$.util.function.Consumer
                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return consumer.getClass();
                }
            });
        }
    }
}
