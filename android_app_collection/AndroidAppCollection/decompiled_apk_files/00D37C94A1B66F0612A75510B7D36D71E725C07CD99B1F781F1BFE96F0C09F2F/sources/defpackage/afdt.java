package defpackage;

import java.io.IOException;
/* compiled from: PG */
/* renamed from: afdt  reason: default package */
/* loaded from: classes.dex */
public final class afdt extends afdi {
    final /* synthetic */ afdv b;
    private int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afdt(afdv afdvVar) {
        super(afdvVar);
        this.b = afdvVar;
    }

    @Override // defpackage.afdi, defpackage.ova
    public final void b(int i, IOException iOException) {
        super.b(i, iOException);
        aqwu aqwuVar = this.b.x.c.e;
        if (aqwuVar == null) {
            aqwuVar = aqwu.b;
        }
        if (!aqwuVar.ad || !(iOException instanceof atg) || ((atg) iOException).d != 500) {
            return;
        }
        int i2 = this.c + 1;
        this.c = i2;
        aqwu aqwuVar2 = this.b.x.c.e;
        if (aqwuVar2 == null) {
            aqwuVar2 = aqwu.b;
        }
        if (i2 <= aqwuVar2.af) {
            return;
        }
        afdv afdvVar = this.b;
        afdvVar.r.k(afdvVar.s, 2, null);
    }

    @Override // defpackage.afdi, defpackage.ova
    public final void e() {
        this.c = 0;
    }
}
