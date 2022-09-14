package defpackage;

import android.app.IntentService;
import android.content.Intent;
/* compiled from: PG */
/* renamed from: bsux  reason: default package */
/* loaded from: classes4.dex */
public final class bsux extends IntentService {
    public bsux() {
        super(bsux.class.getSimpleName());
    }

    @Override // android.app.IntentService, android.app.Service
    public final void onCreate() {
        dxiq.b(this);
        super.onCreate();
    }

    @Override // android.app.IntentService
    protected final void onHandleIntent(Intent intent) {
    }
}
