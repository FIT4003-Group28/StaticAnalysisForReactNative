package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: amhn  reason: default package */
/* loaded from: classes.dex */
public final class amhn extends axnv {
    private amhn(Activity activity) {
        super(activity);
    }

    public static amhn a(Activity activity) {
        return new amhn(activity);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.axnv
    public final Object b() {
        aqxo.E(this.a.getApplication() instanceof amhk, "TikTok activity, %s, cannot be attached to a non-TikTok application, %s.", this.a.getClass().getSimpleName(), this.a.getApplication().getClass().getSimpleName());
        return super.b();
    }
}
