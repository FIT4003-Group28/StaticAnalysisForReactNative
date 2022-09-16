package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Set;
/* compiled from: PG */
/* renamed from: avsu  reason: default package */
/* loaded from: classes3.dex */
public final class avsu extends q {
    public ckcw a;
    public gdo b;
    public Set<awmx> c;
    private awmw d;

    @Override // android.app.Service, android.content.ContextWrapper
    protected final void attachBaseContext(Context context) {
        super.attachBaseContext(affp.a(context).e(context));
    }

    @Override // android.app.Service
    protected final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.d.b(fileDescriptor, printWriter, strArr);
    }

    @Override // defpackage.q, android.app.Service
    @dzsi
    public final IBinder onBind(Intent intent) {
        super.onBind(intent);
        return this.d.a(intent);
    }

    @Override // defpackage.q, android.app.Service
    public final void onCreate() {
        dxiq.b(this);
        super.onCreate();
        this.d = new awmw(this.c);
        this.a.f(ckhc.OFFLINE_SERVICE);
        this.b.b();
    }

    @Override // defpackage.q, android.app.Service
    public final void onDestroy() {
        this.b.e();
        this.a.g(ckhc.OFFLINE_SERVICE);
        super.onDestroy();
    }
}
