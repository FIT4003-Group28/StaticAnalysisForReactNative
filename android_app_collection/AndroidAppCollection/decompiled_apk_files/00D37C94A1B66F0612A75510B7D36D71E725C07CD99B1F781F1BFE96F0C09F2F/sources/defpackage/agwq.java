package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.security.Key;
import java.util.Arrays;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: agwq  reason: default package */
/* loaded from: classes.dex */
public final class agwq {
    ahdw a;
    private final Key b;
    private boolean c;
    private final agrf d;

    public agwq(agrf agrfVar, Key key) {
        this.d = agrfVar;
        this.b = key;
    }

    public final synchronized agws a(agql agqlVar) {
        agvt agvtVar;
        int i;
        long j;
        byte[] bArr;
        agwr agwrVar = new agwr();
        agwrVar.a = agqlVar;
        agwrVar.c = 3;
        agwrVar.b = 0;
        agvx a = this.d.a();
        agvt h = a.h();
        int a2 = h.a(agqlVar.g(), agqlVar.a());
        if (a2 == -1) {
            return agwrVar.a();
        }
        this.c = false;
        agqd c = h.c(agqlVar.g(), agqlVar.a(), a2, 0);
        if (c != null && (bArr = c.f) != null && bArr.length == 10) {
            this.c = true;
        }
        this.a = new ahdw(this.c);
        int pow = ((int) Math.pow(2.0d, a2)) * 4096;
        double b = agqlVar.b();
        double d = pow;
        Double.isNaN(b);
        Double.isNaN(d);
        int ceil = (int) Math.ceil(b / d);
        aghe b2 = a.b();
        pde pdeVar = null;
        if (b2 != null) {
            Iterator it = ((aghc) b2).get().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                pde pdeVar2 = (pde) it.next();
                if (pdeVar2.g().contains(agqlVar.f())) {
                    pdeVar = pdeVar2;
                    break;
                }
            }
        }
        if (pdeVar == null) {
            return agwrVar.a();
        }
        agwrVar.b = pow;
        byte[] bArr2 = new byte[pow];
        int i2 = 0;
        while (i2 < ceil) {
            agqd c2 = h.c(agqlVar.g(), agqlVar.a(), a2, i2);
            if (c2 != null && c2.f != null) {
                long j2 = i2 * pow;
                i = ceil;
                agvtVar = h;
                int min = (int) Math.min(pow, agqlVar.b() - j2);
                ayk aykVar = new ayk(this.b.getEncoded(), new pdh(pdeVar, agwo.a, new pdt("Offline"), null, 4, null));
                String f = agqlVar.f();
                try {
                    aykVar.h(new asy(Uri.EMPTY, j2, min, f));
                } catch (IOException e) {
                    e = e;
                    j = j2;
                }
                try {
                    aykVar.g(bArr2, 0, min);
                    this.a.c();
                    ahdt a3 = ahdw.a(this.c);
                    double d2 = min;
                    Double.isNaN(d2);
                    int ceil2 = (int) Math.ceil(d2 / 4096.0d);
                    for (int i3 = 0; i3 < ceil2; i3++) {
                        int i4 = i3 * 4096;
                        int min2 = Math.min(4096, min - i4);
                        a3.b();
                        a3.c(bArr2, i4, min2);
                        this.a.b(a3.d());
                    }
                    if (!Arrays.equals(this.a.d(), c2.f)) {
                        agwrVar.b(j2);
                    }
                } catch (IOException e2) {
                    e = e2;
                    j = j2;
                    StringBuilder sb = new StringBuilder(String.valueOf(f).length() + 36);
                    sb.append("Couldn't read from data source for ");
                    sb.append(f);
                    sb.append("\n");
                    zep.d(sb.toString(), e);
                    agwrVar.b(j);
                    i2++;
                    ceil = i;
                    h = agvtVar;
                }
                i2++;
                ceil = i;
                h = agvtVar;
            }
            agvtVar = h;
            i = ceil;
            agwrVar.b(i2 * pow);
            i2++;
            ceil = i;
            h = agvtVar;
        }
        return agwrVar.a();
    }
}
