package defpackage;

import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: azkq  reason: default package */
/* loaded from: classes3.dex */
public final class azkq implements azok<Set<azwd<?>>> {
    final /* synthetic */ dxcq a;
    final /* synthetic */ bati b;
    final /* synthetic */ azks c;

    public azkq(azks azksVar, dxcq dxcqVar, bati batiVar) {
        this.c = azksVar;
        this.a = dxcqVar;
        this.b = batiVar;
    }

    @Override // defpackage.azok
    public final /* bridge */ /* synthetic */ Set<azwd<?>> a() {
        int i;
        dcen dcenVar;
        int i2;
        int i3;
        boolean z;
        azkq azkqVar = this;
        dcen N = dcep.N();
        int size = azkqVar.a.a.size();
        boolean z2 = false;
        int i4 = 0;
        while (i4 < size) {
            dxcd dxcdVar = azkqVar.a.a.get(i4);
            int a = dxcc.a(dxcdVar.b);
            if (a == 0) {
                a = 1;
            }
            azwd<?> azwdVar = azwd.c.get(dxby.b(a));
            if (azwdVar == null) {
                dcqe dcqeVar = azks.a;
            } else {
                azks azksVar = azkqVar.c;
                bati batiVar = azkqVar.b;
                if ((dxcdVar.a & 8) != 0) {
                    azwdVar.a();
                } else {
                    int size2 = dxcdVar.d.size();
                    boolean z3 = (dxcdVar.a & 16) == 0 || !dxcdVar.e ? !(size2 <= 0 || azksVar.d.e(azwdVar.a(), true) <= 0) : azksVar.d.e(azwdVar.a(), z2) > 0;
                    int i5 = 0;
                    while (i5 < size2) {
                        dxcm dxcmVar = dxcdVar.d.get(i5);
                        if ((dxcmVar.a & 2) != 0) {
                            dxci dxciVar = dxcmVar.b;
                            if (dxciVar == null) {
                                dxciVar = dxci.e;
                            }
                            long j = (dxciVar.a & 16) != 0 ? dxciVar.d : 0L;
                            if (j != 0) {
                                azksVar.d.f(azwdVar.a(), j);
                            }
                            String str = dxciVar.c;
                            if (azwdVar.b(dxciVar)) {
                                try {
                                    azksVar.d.b(true).delete("sync_item", "corpus = ? AND key_string = ?", new String[]{Integer.toString(azwdVar.a().k), str});
                                } catch (azom unused) {
                                }
                                dcenVar = N;
                                i2 = size;
                                i3 = size2;
                            } else {
                                dcenVar = N;
                                long c = azwdVar.c(dxciVar);
                                i2 = size;
                                azoj azojVar = new azoj();
                                i3 = size2;
                                azojVar.a = azwdVar.a();
                                azojVar.b = str;
                                azojVar.c = c;
                                azojVar.d = j;
                                Integer num = null;
                                azojVar.e = null;
                                akra d = azwdVar.d(dxciVar);
                                azojVar.f = d != null ? Integer.valueOf(d.i()) : null;
                                if (d != null) {
                                    num = Integer.valueOf(d.m());
                                }
                                azojVar.g = num;
                                azojVar.h = false;
                                azojVar.i = dxciVar;
                                azksVar.d.d(azojVar);
                            }
                            z = true;
                        } else {
                            dcenVar = N;
                            i2 = size;
                            i3 = size2;
                            z = false;
                        }
                        z3 |= z;
                        batiVar.b();
                        i5++;
                        N = dcenVar;
                        size = i2;
                        size2 = i3;
                    }
                    dcen dcenVar2 = N;
                    i = size;
                    long j2 = (dxcdVar.a & 2) != 0 ? dxcdVar.c : 0L;
                    if (true == dxcdVar.f) {
                        j2 = 0;
                    }
                    azksVar.d.g(azwdVar.a(), j2);
                    N = dcenVar2;
                    if (z3) {
                        N.b(azwdVar);
                    }
                    i4++;
                    azkqVar = this;
                    size = i;
                    z2 = false;
                }
            }
            i = size;
            i4++;
            azkqVar = this;
            size = i;
            z2 = false;
        }
        return N.f();
    }
}
