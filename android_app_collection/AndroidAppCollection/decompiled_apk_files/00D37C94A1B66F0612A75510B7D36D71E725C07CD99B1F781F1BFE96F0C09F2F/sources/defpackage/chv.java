package defpackage;

import java.io.FileInputStream;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: chv  reason: default package */
/* loaded from: classes2.dex */
public final class chv implements chw {
    final /* synthetic */ ciz a;
    final /* synthetic */ clb b;

    public chv(ciz cizVar, clb clbVar) {
        this.a = cizVar;
        this.b = clbVar;
    }

    @Override // defpackage.chw
    public final int a(chp chpVar) {
        cpz cpzVar;
        try {
            cpzVar = new cpz(new FileInputStream(this.a.a().getFileDescriptor()), this.b);
            try {
                int a = chpVar.a(cpzVar, this.b);
                try {
                    cpzVar.close();
                } catch (IOException unused) {
                }
                this.a.a();
                return a;
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
