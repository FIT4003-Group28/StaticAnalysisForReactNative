package defpackage;

import android.graphics.Rect;
import android.view.View;
import com.google.ar.core.ImageMetadata;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: bwsk  reason: default package */
/* loaded from: classes4.dex */
final class bwsk extends ams {
    final /* synthetic */ bwsm f;
    private final dfrr g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bwsk(bwsm bwsmVar, View view, dfrr dfrrVar) {
        super(view);
        this.f = bwsmVar;
        this.g = dfrrVar;
    }

    @dzsi
    private static final dzsl B(dhjz dhjzVar, dhjx dhjxVar, @dzsi dzsk dzskVar) {
        if (dzskVar == null) {
            return null;
        }
        double radians = Math.toRadians(dhjzVar.c);
        double radians2 = Math.toRadians(dhjzVar.b);
        double d = dhjzVar.d + 6371010.0d;
        double cos = Math.cos(radians) * d;
        dzsn dzsnVar = new dzsn(new dzsm(cos * Math.cos(radians2), cos * Math.sin(radians2), d * Math.sin(radians)));
        double d2 = dzskVar.a;
        double d3 = dzsnVar.a;
        double d4 = dzskVar.b;
        double d5 = dzsnVar.b;
        double d6 = dzskVar.c;
        double d7 = dzsnVar.c;
        double d8 = dzskVar.d;
        double d9 = dzsnVar.d;
        dzsnVar.a((d2 * d3) + (d4 * d5) + (d6 * d7) + (d8 * d9), (dzskVar.h * d9) + (dzskVar.e * d3) + (dzskVar.f * d5) + (dzskVar.g * d7), (dzskVar.i * d3) + (dzskVar.j * d5) + (dzskVar.k * d7) + (dzskVar.l * d9), (dzskVar.m * d3) + (dzskVar.n * d5) + (dzskVar.o * d7) + (dzskVar.p * d9));
        double d10 = dzsnVar.d;
        if (d10 < dcyn.a) {
            return null;
        }
        double d11 = dzsnVar.a / d10;
        double d12 = dzsnVar.b / d10;
        if (d11 < -1.0d || d11 > 1.0d || d12 < -1.0d || d12 > 1.0d) {
            return null;
        }
        double d13 = d11 + 1.0d;
        dhkd dhkdVar = dhjxVar.d;
        if (dhkdVar == null) {
            dhkdVar = dhkd.d;
        }
        double d14 = dhkdVar.b;
        Double.isNaN(d14);
        double d15 = (d13 * d14) / 2.0d;
        double d16 = 1.0d - d12;
        dhkd dhkdVar2 = dhjxVar.d;
        if (dhkdVar2 == null) {
            dhkdVar2 = dhkd.d;
        }
        double d17 = dhkdVar2.c;
        Double.isNaN(d17);
        return new dzsl(d15, (d16 * d17) / 2.0d);
    }

    @Override // defpackage.ams
    protected final int u(float f, float f2) {
        bwvi c = this.f.c(f, f2, this.g.e);
        if (c == null) {
            return Integer.MIN_VALUE;
        }
        return c.a;
    }

    @Override // defpackage.ams
    protected final void v(List<Integer> list) {
        dhjx dhjxVar = this.g.e;
        dzsk a = bwsp.a(dhjxVar);
        if (a == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (bwvi bwviVar : this.f.a.values()) {
            dzsl B = B(bwviVar.g, dhjxVar, a);
            if (B != null) {
                arrayList.add(new bwsl(bwviVar, B));
            }
        }
        Collections.sort(arrayList);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            list.add(Integer.valueOf(((bwsl) arrayList.get(i)).a.a));
        }
    }

    @Override // defpackage.ams
    protected final void x(int i, pc pcVar) {
        dhjx dhjxVar = this.g.e;
        dzsk a = bwsp.a(dhjxVar);
        for (bwvi bwviVar : this.f.a.values()) {
            if (bwviVar.a == i) {
                ilo c = bwviVar.b.c();
                dbsk.s(c);
                pcVar.G(c.n());
                if (bwviVar.i) {
                    pcVar.S();
                    pcVar.f(ImageMetadata.SHADING_MODE);
                } else {
                    pcVar.f(16);
                }
                dzsl B = B(bwviVar.g, dhjxVar, a);
                if (B == null) {
                    pcVar.k(new Rect(0, 0, 0, 0));
                    return;
                }
                int e = cqrp.d(bwviVar.j).e(this.f.b) / 2;
                int i2 = (int) B.a;
                int i3 = (int) B.b;
                pcVar.k(new Rect(i2 - e, i3 - e, i2 + e, i3 + e));
                return;
            }
        }
        pcVar.G("");
        pcVar.k(new Rect(0, 0, 0, 0));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ams
    public final boolean z(int i, int i2) {
        Iterator<bwvi> it = this.f.a.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            bwvi next = it.next();
            if (next.a == i) {
                if (i2 == 16) {
                    this.f.d(next, this);
                    return true;
                } else if (i2 == 1048576) {
                    if (next.i) {
                        this.f.i.p(null);
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
