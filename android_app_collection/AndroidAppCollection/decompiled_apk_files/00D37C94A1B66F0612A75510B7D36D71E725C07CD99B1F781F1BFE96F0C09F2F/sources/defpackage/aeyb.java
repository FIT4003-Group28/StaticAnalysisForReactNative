package defpackage;

import java.util.concurrent.Callable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aeyb  reason: default package */
/* loaded from: classes.dex */
public final class aeyb implements Callable {
    final /* synthetic */ aeyc a;
    private final pqb b;
    private final long c;
    private final long d;
    private final afjz e;

    public aeyb(aeyc aeycVar, pqb pqbVar, long j, long j2, afjz afjzVar) {
        this.a = aeycVar;
        this.b = pqbVar;
        this.c = j;
        this.d = j2;
        this.e = afjzVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        boolean c = this.a.e.c(this.c);
        aeya aeyaVar = this.a.g;
        if (aeyaVar == null || aeyaVar.a != this.b) {
            if (aeyaVar != null) {
                if (aeyaVar.c == null) {
                    if (this.e.u()) {
                        aeyc aeycVar = this.a;
                        if (!aeycVar.f.contains(aeycVar.g)) {
                            this.a.d.g(new afkn("player.exception", this.d, "c.SetNextMediaSource"));
                            aeyc aeycVar2 = this.a;
                            aeycVar2.f.remove(aeycVar2.g);
                        }
                    }
                    aeyc aeycVar3 = this.a;
                    aeycVar3.y(aeycVar3.g);
                    aeyc aeycVar22 = this.a;
                    aeycVar22.f.remove(aeycVar22.g);
                } else {
                    aeyaVar.d = true;
                }
                c = true;
            }
            this.a.g = new aeya(this.b);
            this.a.g.b(this.d);
            aeyc aeycVar4 = this.a;
            aeya aeyaVar2 = aeycVar4.g;
            aeycVar4.x(aeyaVar2, aeyaVar2.a);
            aeyc aeycVar5 = this.a;
            aeya aeyaVar3 = aeycVar5.g;
            if (aeyaVar3 != null) {
                aeycVar5.f.add(aeyaVar3);
            }
        } else {
            c |= aeyaVar.b(this.d);
        }
        return Boolean.valueOf(c);
    }
}
