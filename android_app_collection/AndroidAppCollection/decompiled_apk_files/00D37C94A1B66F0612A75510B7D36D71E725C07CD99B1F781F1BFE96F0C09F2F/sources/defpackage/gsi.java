package defpackage;

import com.google.android.apps.youtube.app.extensions.mediabrowser.impl.MainAppMediaBrowserService;
/* compiled from: PG */
/* renamed from: gsi  reason: default package */
/* loaded from: classes3.dex */
public abstract class gsi extends arx implements axoo {
    private volatile axog f;
    private final Object g = new Object();
    private boolean h = false;

    @Override // defpackage.axoo
    /* renamed from: f */
    public final axog lH() {
        if (this.f == null) {
            synchronized (this.g) {
                if (this.f == null) {
                    this.f = new axog(this);
                }
            }
        }
        return this.f;
    }

    @Override // defpackage.axon
    public final Object lI() {
        return lH().lI();
    }

    @Override // defpackage.arx, android.app.Service
    public void onCreate() {
        if (!this.h) {
            this.h = true;
            MainAppMediaBrowserService mainAppMediaBrowserService = (MainAppMediaBrowserService) this;
            eap eapVar = (eap) lI();
            mainAppMediaBrowserService.f = (gsk) eapVar.a.jH.get();
            dyo dyoVar = eapVar.a;
            mainAppMediaBrowserService.g = dyoVar.fP;
            mainAppMediaBrowserService.h = dyoVar.uV;
        }
        super.onCreate();
    }
}
