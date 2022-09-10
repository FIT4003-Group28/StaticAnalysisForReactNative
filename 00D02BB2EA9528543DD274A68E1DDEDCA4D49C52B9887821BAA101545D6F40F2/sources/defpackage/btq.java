package defpackage;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.FileInputStream;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: btq  reason: default package */
/* loaded from: classes4.dex */
public final class btq implements btu {
    final /* synthetic */ buy a;
    final /* synthetic */ bxl b;

    public btq(buy buyVar, bxl bxlVar) {
        this.a = buyVar;
        this.b = bxlVar;
    }

    @Override // defpackage.btu
    public final ImageHeaderParser$ImageType a(btn btnVar) {
        cdz cdzVar;
        try {
            cdzVar = new cdz(new FileInputStream(this.a.a().getFileDescriptor()), this.b);
            try {
                ImageHeaderParser$ImageType a = btnVar.a(cdzVar);
                try {
                    cdzVar.close();
                } catch (IOException unused) {
                }
                this.a.a();
                return a;
            } catch (Throwable th) {
                th = th;
                if (cdzVar != null) {
                    try {
                        cdzVar.close();
                    } catch (IOException unused2) {
                    }
                }
                this.a.a();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            cdzVar = null;
        }
    }
}
