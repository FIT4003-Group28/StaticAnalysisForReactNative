package defpackage;

import android.app.Application;
import android.app.Service;
/* compiled from: PG */
/* renamed from: axog  reason: default package */
/* loaded from: classes2.dex */
public final class axog implements axon {
    private final Service a;
    private Object b;

    public axog(Service service) {
        this.a = service;
    }

    @Override // defpackage.axon
    public final Object lI() {
        if (this.b == null) {
            Application application = this.a.getApplication();
            awwc.n(application instanceof axon, "Sting service must be attached to an @Sting Application. Found: %s", application.getClass());
            dxq iW = ((axof) awwc.u(application, axof.class)).iW();
            iW.b = this.a;
            axzl.n(iW.b, Service.class);
            this.b = new eap(iW.a, iW.b);
        }
        return this.b;
    }
}
