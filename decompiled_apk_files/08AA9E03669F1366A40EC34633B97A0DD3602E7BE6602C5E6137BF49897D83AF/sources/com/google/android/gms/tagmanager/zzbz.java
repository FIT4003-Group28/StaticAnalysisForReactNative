package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.internal.measurement.zzxf;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.concurrent.LinkedBlockingQueue;
/* loaded from: classes.dex */
final class zzbz extends Thread implements zzby {
    private static zzbz zzays;
    private volatile boolean closed;
    private final LinkedBlockingQueue<Runnable> zzayq;
    private volatile boolean zzayr;
    private volatile zzcb zzayt;
    private final Context zzqx;

    private zzbz(Context context) {
        super("GAThread");
        this.zzayq = new LinkedBlockingQueue<>();
        this.zzayr = false;
        this.closed = false;
        this.zzqx = context != null ? context.getApplicationContext() : context;
        start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzbz zzo(Context context) {
        if (zzays == null) {
            zzays = new zzbz(context);
        }
        return zzays;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        while (true) {
            boolean z = this.closed;
            try {
                try {
                    Runnable take = this.zzayq.take();
                    if (!this.zzayr) {
                        take.run();
                    }
                } catch (InterruptedException e) {
                    zzdi.zzcw(e.toString());
                }
            } catch (Exception e2) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                PrintStream printStream = new PrintStream(byteArrayOutputStream);
                zzxf.zza(e2, printStream);
                printStream.flush();
                String valueOf = String.valueOf(new String(byteArrayOutputStream.toByteArray()));
                zzdi.e(valueOf.length() != 0 ? "Error on Google TagManager Thread: ".concat(valueOf) : new String("Error on Google TagManager Thread: "));
                zzdi.e("Google TagManager is shutting down.");
                this.zzayr = true;
            }
        }
    }

    @Override // com.google.android.gms.tagmanager.zzby
    public final void zzdd(String str) {
        zzh(new zzca(this, this, System.currentTimeMillis(), str));
    }

    @Override // com.google.android.gms.tagmanager.zzby
    public final void zzh(Runnable runnable) {
        this.zzayq.add(runnable);
    }
}
