package defpackage;

import java.io.IOException;
import java.nio.channels.WritableByteChannel;
/* compiled from: PG */
/* renamed from: vuo  reason: default package */
/* loaded from: classes4.dex */
final class vuo extends Thread {
    private final vur a;
    private final WritableByteChannel b;

    public vuo(vur vurVar, WritableByteChannel writableByteChannel) {
        setName("Movie to Stream Thread");
        this.a = vurVar;
        this.b = writableByteChannel;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            try {
                this.a.a().k(this.b);
                try {
                    this.b.close();
                } catch (IOException e) {
                    e = e;
                    vqy.e("Failed to close movie resources", e);
                    this.a.close();
                }
            } catch (IOException e2) {
                vqy.e("Failed to read movie data", e2);
                try {
                    this.b.close();
                } catch (IOException e3) {
                    e = e3;
                    vqy.e("Failed to close movie resources", e);
                    this.a.close();
                }
            }
            this.a.close();
        } catch (Throwable th) {
            try {
                this.b.close();
            } catch (IOException e4) {
                vqy.e("Failed to close movie resources", e4);
            }
            this.a.close();
            throw th;
        }
    }
}
