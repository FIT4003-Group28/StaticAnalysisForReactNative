package defpackage;

import com.google.android.libraries.youtube.account.service.AccountsChangedJobIntentService;
/* compiled from: PG */
/* renamed from: web  reason: default package */
/* loaded from: classes4.dex */
public abstract class web extends akc implements axoo {
    private volatile axog h;
    private final Object i = new Object();
    private boolean j = false;

    @Override // defpackage.axoo
    /* renamed from: f */
    public final axog lH() {
        if (this.h == null) {
            synchronized (this.i) {
                if (this.h == null) {
                    this.h = new axog(this);
                }
            }
        }
        return this.h;
    }

    @Override // defpackage.axon
    public final Object lI() {
        return lH().lI();
    }

    @Override // defpackage.akc, android.app.Service
    public final void onCreate() {
        if (!this.j) {
            this.j = true;
            ((AccountsChangedJobIntentService) this).h = axot.a(((eap) lI()).a.a.bx);
        }
        super.onCreate();
    }
}
