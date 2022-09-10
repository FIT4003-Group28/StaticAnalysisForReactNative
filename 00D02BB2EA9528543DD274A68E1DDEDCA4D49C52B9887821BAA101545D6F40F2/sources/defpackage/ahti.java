package defpackage;

import com.google.android.apps.gmm.map.model.location.GmmLocation;
import java.util.concurrent.TimeoutException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ahti  reason: default package */
/* loaded from: classes2.dex */
public final class ahti extends dees<GmmLocation> implements ahtg {
    @dzsi
    public ahtn a;

    @Override // defpackage.ahtg
    public final void a() {
        k(new IllegalStateException("location unavailable"));
    }

    @Override // defpackage.ahtg
    public final void b() {
    }

    @Override // defpackage.ahtg
    public final void c() {
        k(new TimeoutException("Failed to get location in time"));
    }

    @Override // defpackage.ahtg
    public final void d(GmmLocation gmmLocation) {
        j(gmmLocation);
    }

    @Override // defpackage.dees
    protected final void e() {
        ahtn ahtnVar = this.a;
        dbsk.s(ahtnVar);
        ahtnVar.c();
    }
}
