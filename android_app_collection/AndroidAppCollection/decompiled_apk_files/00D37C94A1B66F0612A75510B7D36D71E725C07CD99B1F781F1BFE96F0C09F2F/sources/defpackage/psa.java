package defpackage;

import com.google.android.exoplayer2.Format;
/* compiled from: PG */
/* renamed from: psa  reason: default package */
/* loaded from: classes4.dex */
public final class psa extends pru {
    public prv a;
    private long b;
    private volatile boolean c;
    private final prt d;

    public psa(asv asvVar, asy asyVar, Format format, int i, Object obj, prt prtVar) {
        super(asvVar, asyVar, 2, format, i, obj, -9223372036854775807L, -9223372036854775807L);
        this.d = prtVar;
    }

    @Override // defpackage.axv
    public final void a() {
        this.c = true;
    }

    @Override // defpackage.axv
    public final void b() {
        if (this.b == 0) {
            this.d.e(this.a, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            asy b = this.f.b(this.b);
            ayf ayfVar = this.m;
            aza azaVar = new aza(ayfVar, b.g, ayfVar.h(b));
            while (!this.c && this.d.g(azaVar)) {
            }
            this.b = azaVar.c - this.f.g;
        } finally {
            pxi.I(this.m);
        }
    }
}
