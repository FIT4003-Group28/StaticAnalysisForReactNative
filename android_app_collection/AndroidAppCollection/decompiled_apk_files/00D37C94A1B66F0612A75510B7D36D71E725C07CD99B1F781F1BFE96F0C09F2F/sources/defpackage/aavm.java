package defpackage;

import android.os.Bundle;
/* compiled from: PG */
/* renamed from: aavm  reason: default package */
/* loaded from: classes.dex */
public final class aavm implements yjo {
    private final azqb a;

    public aavm(azqb azqbVar) {
        this.a = azqbVar;
    }

    @Override // defpackage.yjo
    public final int a(Bundle bundle) {
        try {
            ((aavp) this.a.get()).a();
            return 0;
        } catch (aart e) {
            zep.d("Scheduled config refresh failed.", e);
            return 2;
        }
    }
}
