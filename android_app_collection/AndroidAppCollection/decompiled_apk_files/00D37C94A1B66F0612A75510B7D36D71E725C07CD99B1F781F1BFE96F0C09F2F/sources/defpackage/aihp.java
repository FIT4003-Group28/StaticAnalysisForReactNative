package defpackage;

import android.graphics.BitmapRegionDecoder;
import android.net.Uri;
import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aihp  reason: default package */
/* loaded from: classes.dex */
public final class aihp implements yiw {
    final /* synthetic */ aihr a;

    public aihp(aihr aihrVar) {
        this.a = aihrVar;
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        Uri uri = (Uri) obj;
        acvg acvgVar = this.a.l;
        if (acvgVar != null) {
            acvgVar.c("thsb0_ne");
            this.a.l = null;
        }
        String valueOf = String.valueOf(uri);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 43);
        sb.append("Failed to load video storyboard mosaic at: ");
        sb.append(valueOf);
        zep.n(sb.toString(), exc);
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        Uri uri = (Uri) obj;
        byte[] bArr = (byte[]) obj2;
        try {
            acvg acvgVar = this.a.l;
            if (acvgVar != null) {
                acvgVar.c("thsb0_nr");
            }
            this.a.b.put(uri, BitmapRegionDecoder.newInstance(bArr, 0, bArr.length, true));
        } catch (IOException unused) {
        }
    }
}
