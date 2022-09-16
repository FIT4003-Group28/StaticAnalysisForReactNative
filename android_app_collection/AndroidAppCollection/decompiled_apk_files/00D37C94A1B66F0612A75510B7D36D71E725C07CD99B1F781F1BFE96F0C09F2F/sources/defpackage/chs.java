package defpackage;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.FileInputStream;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: chs  reason: default package */
/* loaded from: classes2.dex */
public final class chs implements chx {
    final /* synthetic */ ciz a;
    final /* synthetic */ clb b;

    public chs(ciz cizVar, clb clbVar) {
        this.a = cizVar;
        this.b = clbVar;
    }

    @Override // defpackage.chx
    public final ImageHeaderParser$ImageType a(chp chpVar) {
        cpz cpzVar;
        try {
            cpzVar = new cpz(new FileInputStream(this.a.a().getFileDescriptor()), this.b);
            try {
                ImageHeaderParser$ImageType c = chpVar.c(cpzVar);
                try {
                    cpzVar.close();
                } catch (IOException unused) {
                }
                this.a.a();
                return c;
            } catch (Throwable th) {
                th = th;
                if (cpzVar != null) {
                    try {
                        cpzVar.close();
                    } catch (IOException unused2) {
                    }
                }
                this.a.a();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            cpzVar = null;
        }
    }
}
