package defpackage;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Environment;
/* compiled from: PG */
/* renamed from: albq  reason: default package */
/* loaded from: classes.dex */
public final class albq extends albi {
    private static final albv b = albv.a(2);
    private final BroadcastReceiver c;
    private final Application d;

    public albq(Context context) {
        super(2);
        this.c = new albp(this);
        this.d = (Application) context.getApplicationContext();
    }

    @Override // defpackage.albi
    protected final void e() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.MEDIA_MOUNTED");
        intentFilter.addAction("android.intent.action.MEDIA_UNMOUNTED");
        intentFilter.addDataScheme("file");
        this.d.registerReceiver(this.c, intentFilter);
    }

    @Override // defpackage.albi
    protected final void f() {
        this.d.unregisterReceiver(this.c);
    }

    @Override // defpackage.albu
    public final albv g() {
        String externalStorageState = Environment.getExternalStorageState();
        if (!"mounted".equals(externalStorageState) && !"mounted_ro".equals(externalStorageState)) {
            return b;
        }
        return albv.a;
    }
}
