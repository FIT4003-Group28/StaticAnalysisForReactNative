package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: dzk  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class dzk implements azqb {
    public final /* synthetic */ azqb a;
    private final /* synthetic */ int b;

    public /* synthetic */ dzk(azqb azqbVar, int i) {
        this.b = i;
        this.a = azqbVar;
    }

    @Override // defpackage.azqb
    public final Object get() {
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                return (aktk) this.a.get();
            }
            if (i == 2) {
                return (aktk) this.a.get();
            }
            if (i == 3) {
                azqb azqbVar = this.a;
                int i2 = egd.a;
                return amvn.r((aaoo) azqbVar.get());
            } else if (i == 4) {
                azqb azqbVar2 = this.a;
                int i3 = egd.a;
                return amvn.r((aaoo) azqbVar2.get());
            } else {
                azqb azqbVar3 = this.a;
                if (!((ampq) azqbVar3.get()).h() || ((uvh) ((ampq) azqbVar3.get()).c()).a() == null) {
                    return null;
                }
                azqb a = ((uvh) ((ampq) azqbVar3.get()).c()).a();
                a.getClass();
                return (azzk) a.get();
            }
        }
        return (Executor) this.a.get();
    }
}
