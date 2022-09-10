package defpackage;

import android.content.Intent;
import android.os.IBinder;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Set;
/* compiled from: PG */
/* renamed from: avsv  reason: default package */
/* loaded from: classes3.dex */
public final class avsv extends affo {
    public ckcw a;
    public gdo b;
    public Set<awmx> c;
    private awmw d;

    @Override // android.app.Service
    protected final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.d.b(fileDescriptor, printWriter, strArr);
    }

    @Override // android.app.Service
    @dzsi
    public final IBinder onBind(Intent intent) {
        return this.d.a(intent);
    }

    @Override // android.app.Service
    public final void onCreate() {
        dxiq.b(this);
        super.onCreate();
        this.d = new awmw(this.c);
        this.a.f(ckhc.OFFLINE_SERVICE);
        this.b.b();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        this.b.e();
        this.a.g(ckhc.OFFLINE_SERVICE);
        super.onDestroy();
    }
}
