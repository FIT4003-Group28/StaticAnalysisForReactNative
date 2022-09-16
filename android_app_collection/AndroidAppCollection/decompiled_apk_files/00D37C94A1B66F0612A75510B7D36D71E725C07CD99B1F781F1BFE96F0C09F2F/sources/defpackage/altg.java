package defpackage;

import java.util.Set;
/* compiled from: PG */
/* renamed from: altg  reason: default package */
/* loaded from: classes.dex */
public final class altg implements alto {
    private final axnm a;
    private final axnm b;
    private final axnm c;

    public altg(axnm axnmVar, axnm axnmVar2, axnm axnmVar3) {
        this.a = axnmVar;
        this.b = axnmVar2;
        this.c = axnmVar3;
    }

    private final alto c() {
        if (this.c.get() == null) {
            return (alto) this.a.get();
        }
        return (alto) this.b.get();
    }

    @Override // defpackage.alto
    public final alvd a(altv altvVar) {
        return c().a(altvVar);
    }

    @Override // defpackage.alto
    public final Set b() {
        return c().b();
    }
}
