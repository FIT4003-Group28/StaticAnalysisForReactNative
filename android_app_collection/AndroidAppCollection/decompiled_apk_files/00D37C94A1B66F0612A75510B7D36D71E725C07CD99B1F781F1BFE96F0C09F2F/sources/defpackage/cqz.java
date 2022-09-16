package defpackage;

import android.util.Log;
import java.io.File;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: cqz  reason: default package */
/* loaded from: classes3.dex */
public final class cqz implements cif {
    @Override // defpackage.chn
    public final /* bridge */ /* synthetic */ boolean a(Object obj, File file, cic cicVar) {
        try {
            cus.e(((cqy) ((cku) obj).c()).b(), file);
            return true;
        } catch (IOException e) {
            if (!Log.isLoggable("GifEncoder", 5)) {
                return false;
            }
            Log.w("GifEncoder", "Failed to encode GIF drawable data", e);
            return false;
        }
    }

    @Override // defpackage.cif
    public final int b() {
        return 1;
    }
}
