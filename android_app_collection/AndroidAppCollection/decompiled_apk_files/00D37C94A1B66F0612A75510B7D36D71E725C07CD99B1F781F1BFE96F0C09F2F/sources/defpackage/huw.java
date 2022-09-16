package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: huw  reason: default package */
/* loaded from: classes3.dex */
public final class huw implements yiw {
    final /* synthetic */ yiw a;
    final /* synthetic */ Uri b;
    final /* synthetic */ int c;
    final /* synthetic */ hux d;

    public huw(hux huxVar, yiw yiwVar, Uri uri, int i) {
        this.d = huxVar;
        this.a = yiwVar;
        this.b = uri;
        this.c = i;
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        this.a.a((Uri) obj, exc);
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        final Uri uri = (Uri) obj;
        final byte[] bArr = (byte[]) obj2;
        Executor executor = this.d.d;
        final yiw yiwVar = this.a;
        final Uri uri2 = this.b;
        final int i = this.c;
        executor.execute(new Runnable() { // from class: huv
            @Override // java.lang.Runnable
            public final void run() {
                huw huwVar = huw.this;
                Uri uri3 = uri;
                byte[] bArr2 = bArr;
                yiw yiwVar2 = yiwVar;
                Uri uri4 = uri2;
                int i2 = i;
                hux huxVar = huwVar.d;
                ylr.b();
                hvk hvkVar = huxVar.e;
                String lastPathSegment = uri3.getLastPathSegment();
                ylr.b();
                znh znhVar = hvkVar.a;
                if (znhVar == null || !znhVar.b(lastPathSegment, bArr2)) {
                    yiwVar2.a(uri3, new IOException());
                    return;
                }
                if (hux.c(uri4)) {
                    bArr2 = hux.d(bArr2, i2);
                }
                huwVar.d.b(uri4, bArr2);
                try {
                    yiwVar2.b(uri3, huwVar.d.c.b(bArr2));
                } catch (zhy e) {
                    yiwVar2.a(uri4, e);
                }
            }
        });
    }
}
