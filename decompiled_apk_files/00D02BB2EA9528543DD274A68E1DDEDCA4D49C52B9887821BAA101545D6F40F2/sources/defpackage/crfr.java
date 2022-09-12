package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.net.Uri;
import com.google.android.libraries.geo.navcore.service.base.NavigationService;
/* compiled from: PG */
/* renamed from: crfr  reason: default package */
/* loaded from: classes.dex */
public final class crfr {
    private final Context a;
    private final ServiceConnection b = new crfq();

    public crfr(Context context) {
        this.a = context;
    }

    public final void a() {
        if (this.a.bindService(new Intent("android.intent.action.VIEW", Uri.EMPTY, this.a, NavigationService.class), this.b, 65)) {
            return;
        }
        throw new RuntimeException("Failed to bind to NavigationService");
    }

    public final void b() {
        this.a.unbindService(this.b);
    }
}
