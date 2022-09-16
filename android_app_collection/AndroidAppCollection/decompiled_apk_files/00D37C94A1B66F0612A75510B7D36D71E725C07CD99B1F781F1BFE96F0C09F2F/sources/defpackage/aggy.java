package defpackage;

import android.os.Bundle;
/* compiled from: PG */
/* renamed from: aggy  reason: default package */
/* loaded from: classes.dex */
public final class aggy implements yjo {
    private final azqb a;
    private final azqb b;
    private final /* synthetic */ int c;

    public aggy(azqb azqbVar, azqb azqbVar2) {
        this.a = azqbVar;
        this.b = azqbVar2;
    }

    public aggy(azqb azqbVar, azqb azqbVar2, int i) {
        this.c = i;
        this.a = azqbVar;
        this.b = azqbVar2;
    }

    public aggy(azqb azqbVar, azqb azqbVar2, int i, byte[] bArr) {
        this.c = i;
        this.b = azqbVar;
        this.a = azqbVar2;
    }

    @Override // defpackage.yjo
    public final int a(Bundle bundle) {
        agvx g;
        agvx g2;
        agvx g3;
        int i = this.c;
        if (i == 0) {
            String string = bundle.getString("identityId");
            if (string != null && (g = aggw.g((agrf) this.a.get(), string)) != null) {
                return aggw.f(((aguu) this.b.get()).a(string, g));
            }
            return 1;
        } else if (i == 1) {
            String string2 = bundle.getString("identityId");
            if (string2 == null || (g2 = aggw.g((agrf) this.a.get(), string2)) == null) {
                return 1;
            }
            return ((aggn) this.b.get()).a(string2, g2) != 0 ? 2 : 0;
        } else {
            String string3 = bundle.getString("identityId");
            if (string3 == null || (g3 = aggw.g((agrf) this.b.get(), string3)) == null) {
                return 1;
            }
            return ((agxb) this.a.get()).a(string3, g3, bundle.getBoolean("forceSync", false)) != 0 ? 2 : 0;
        }
    }
}
