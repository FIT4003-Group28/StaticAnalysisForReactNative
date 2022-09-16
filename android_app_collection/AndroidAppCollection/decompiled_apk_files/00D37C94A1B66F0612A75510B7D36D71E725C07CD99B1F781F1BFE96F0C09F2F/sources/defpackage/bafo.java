package defpackage;

import android.util.Log;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.nio.channels.ReadableByteChannel;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bafo  reason: default package */
/* loaded from: classes2.dex */
public final class bafo implements Runnable {
    final /* synthetic */ bagd a;
    private final /* synthetic */ int b;

    public bafo(bagd bagdVar) {
        this.a = bagdVar;
    }

    public bafo(bagd bagdVar, int i) {
        this.b = i;
        this.a = bagdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            ReadableByteChannel readableByteChannel = this.a.n;
            if (readableByteChannel == null) {
                return;
            }
            try {
                readableByteChannel.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            this.a.n = null;
        } else if (i != 1) {
            if (i == 2) {
                bagd bagdVar = this.a;
                bagdVar.f.add(bagdVar.m);
                this.a.l();
                return;
            }
            bagd bagdVar2 = this.a;
            bagdVar2.m = bagdVar2.p;
            bagdVar2.p = null;
            bagdVar2.l();
        } else {
            bafk bafkVar = this.a.r;
            if (bafkVar != null) {
                try {
                    bafkVar.d();
                } catch (IOException e2) {
                    Log.e(bagd.a, "Exception when closing OutputChannel", e2);
                }
            }
            HttpURLConnection httpURLConnection = this.a.q;
            if (httpURLConnection == null) {
                return;
            }
            httpURLConnection.disconnect();
            this.a.q = null;
        }
    }
}
