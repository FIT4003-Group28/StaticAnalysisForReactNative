package defpackage;

import android.os.Bundle;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: cosa  reason: default package */
/* loaded from: classes5.dex */
public final class cosa extends cosc {
    public final AtomicReference<Bundle> a = new AtomicReference<>();
    public boolean b;

    @Override // defpackage.cosd
    public final void b(Bundle bundle) {
        synchronized (this.a) {
            this.a.set(bundle);
            this.b = true;
            this.a.notify();
        }
    }
}
