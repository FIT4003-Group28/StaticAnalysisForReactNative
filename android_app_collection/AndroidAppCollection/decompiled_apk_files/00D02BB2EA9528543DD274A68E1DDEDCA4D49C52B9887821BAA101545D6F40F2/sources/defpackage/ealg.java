package defpackage;

import java.io.IOException;
import java.nio.channels.ReadableByteChannel;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ealg  reason: default package */
/* loaded from: classes6.dex */
public final class ealg implements Runnable {
    final /* synthetic */ eamc a;

    public ealg(eamc eamcVar) {
        this.a = eamcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ReadableByteChannel readableByteChannel = this.a.m;
        if (readableByteChannel != null) {
            try {
                readableByteChannel.close();
            } catch (IOException e) {
                deki.b(e);
            }
            this.a.m = null;
        }
    }
}
