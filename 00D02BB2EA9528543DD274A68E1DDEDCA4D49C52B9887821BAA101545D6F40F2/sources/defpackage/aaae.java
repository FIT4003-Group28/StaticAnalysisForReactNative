package defpackage;
/* compiled from: PG */
/* renamed from: aaae  reason: default package */
/* loaded from: classes2.dex */
public final class aaae {
    protected final bwrs<ilo> a;
    public final aaag b;
    public final begg c;
    public final bego d;
    private final bgdt e;
    private final bgea f;

    public aaae(bwrs<ilo> bwrsVar, aaag aaagVar, bgdt bgdtVar, bgea bgeaVar, begg beggVar, bego begoVar) {
        this.a = bwrsVar;
        this.b = aaagVar;
        this.e = bgdtVar;
        this.f = bgeaVar;
        this.c = beggVar;
        this.d = begoVar;
    }

    public final void a(@dzsi ddho ddhoVar) {
        dwcv a;
        ilo c = this.a.c();
        if (!c.f) {
            altv altvVar = null;
            dnqh b = ddhoVar != null ? cjsb.b(ddhoVar) : null;
            akqq aj = c.aj();
            if (aj == null) {
                return;
            }
            if (!c.bA().isEmpty()) {
                altvVar = c.bA().get(0);
            }
            if (c.q) {
                a = this.f.b(aj);
                if (a.c) {
                    a.bF();
                    a.c = false;
                }
                dwcw dwcwVar = (dwcw) a.b;
                dwcw dwcwVar2 = dwcw.p;
                dwcwVar.a |= 8192;
                dwcwVar.m = true;
            } else {
                a = this.f.a(aj);
            }
            if (altvVar != null) {
                dwzu a2 = altvVar.a();
                if (a.c) {
                    a.bF();
                    a.c = false;
                }
                dwcw dwcwVar3 = (dwcw) a.b;
                dwcw dwcwVar4 = dwcw.p;
                a2.getClass();
                dwcwVar3.n = a2;
                dwcwVar3.a |= 16384;
            }
            if (b != null) {
                if (a.c) {
                    a.bF();
                    a.c = false;
                }
                dwcw dwcwVar5 = (dwcw) a.b;
                dwcw dwcwVar6 = dwcw.p;
                b.getClass();
                dwcwVar5.k = b;
                dwcwVar5.a |= 2048;
            }
            this.e.a(a.bK(), new aaad(this, ddhoVar));
        }
    }

    public final void b() {
        this.e.b();
    }
}
