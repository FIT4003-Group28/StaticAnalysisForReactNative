package defpackage;

import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: aiez  reason: default package */
/* loaded from: classes2.dex */
public final class aiez implements amri {
    public final Object a;
    public final Map<aiey, akra> b;
    private final int c;
    private final amsa d;
    private final amkz e;
    private final amkz f;
    private final akse g;
    private final float[] h;
    private final List<akra> i;

    public aiez(int i) {
        amsa amsaVar = new amsa();
        this.a = new Object();
        this.b = new IdentityHashMap();
        this.e = new amkz(0.0f, 0.0f, 0.0f, 0.0f);
        this.f = new amkz(0.0f, 0.0f, 0.0f, 0.0f);
        this.g = new akse();
        this.h = new float[8];
        this.i = new ArrayList();
        this.d = amsaVar;
        this.c = i;
    }

    @Override // defpackage.amri
    public final float a(aktc aktcVar, amrk amrkVar, akra akraVar, dmlo dmloVar) {
        amyn.e.a();
        amsa amsaVar = this.d;
        akzh akzhVar = amrkVar.e;
        alne alneVar = amrkVar.h;
        if (!amsaVar.c(akzhVar, aktcVar, akraVar, dmloVar, this.e)) {
            return 0.5f;
        }
        synchronized (this.a) {
            this.i.clear();
            this.i.addAll(this.b.values());
        }
        int i = 0;
        for (akra akraVar2 : this.i) {
            if (akyx.p(amrkVar.e, akraVar2, this.g, this.h)) {
                amkz amkzVar = this.f;
                akse akseVar = this.g;
                float f = akseVar.b;
                float f2 = this.c;
                float f3 = akseVar.c;
                amkzVar.a(f - f2, f3 - f2, f + f2, f3 + f2);
                if (this.e.d(this.f)) {
                    i++;
                }
            }
        }
        if (!this.i.isEmpty()) {
            return i / this.i.size();
        }
        return 0.0f;
    }
}
