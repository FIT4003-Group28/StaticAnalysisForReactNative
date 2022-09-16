package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: adrn  reason: default package */
/* loaded from: classes.dex */
public final class adrn {
    private final azqb a;
    private final bgo b;
    private final adgc c;
    private final yrj d;
    private final adas e;
    private final yni f;
    private final Executor g;
    private final ankw h;

    public adrn(azqb azqbVar, bgo bgoVar, adgc adgcVar, yrj yrjVar, adas adasVar, yni yniVar, Executor executor, ankw ankwVar) {
        this.a = azqbVar;
        this.b = bgoVar;
        this.c = adgcVar;
        this.d = yrjVar;
        this.e = adasVar;
        this.f = yniVar;
        this.g = executor;
        this.h = ankwVar;
    }

    public final adrm a(int i) {
        int i2 = i - 1;
        if (i != 0) {
            if (i2 == 2) {
                return new adql((bhd) this.a.get(), this.b, this.c, this.d, this.e, this.f, this.g, this.h);
            }
            if (i2 == 3) {
                return new adqs((bhd) this.a.get(), this.b, this.c, this.d, this.f);
            }
            return null;
        }
        throw null;
    }
}
