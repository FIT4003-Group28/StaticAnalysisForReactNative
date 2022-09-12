package defpackage;

import android.graphics.Bitmap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: PG */
/* renamed from: deug  reason: default package */
/* loaded from: classes6.dex */
public final class deug {
    public static final void a(ib ibVar, deuy deuyVar) {
        if (deuyVar != null) {
            try {
                cpcq<Bitmap> cpcqVar = deuyVar.b;
                cnwc.a(cpcqVar);
                Bitmap bitmap = (Bitmap) cpda.e(cpcqVar, 5L, TimeUnit.SECONDS);
                ibVar.o(bitmap);
                hz hzVar = new hz();
                hzVar.a = bitmap;
                hzVar.e(null);
                ibVar.v(hzVar);
            } catch (InterruptedException unused) {
                deuyVar.close();
                Thread.currentThread().interrupt();
            } catch (ExecutionException e) {
                String valueOf = String.valueOf(e.getCause());
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
                sb.append("Failed to download image: ");
                sb.append(valueOf);
                sb.toString();
            } catch (TimeoutException unused2) {
                deuyVar.close();
            }
        }
    }
}
