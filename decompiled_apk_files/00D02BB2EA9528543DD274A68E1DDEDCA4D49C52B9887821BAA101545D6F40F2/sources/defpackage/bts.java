package defpackage;

import java.io.FileInputStream;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: bts  reason: default package */
/* loaded from: classes4.dex */
public final class bts implements btt {
    final /* synthetic */ buy a;
    final /* synthetic */ bxl b;

    public bts(buy buyVar, bxl bxlVar) {
        this.a = buyVar;
        this.b = bxlVar;
    }

    @Override // defpackage.btt
    public final int a(btn btnVar) {
        cdz cdzVar;
        try {
            cdzVar = new cdz(new FileInputStream(this.a.a().getFileDescriptor()), this.b);
            try {
                int c = btnVar.c(cdzVar, this.b);
                try {
                    cdzVar.close();
                } catch (IOException unused) {
                }
                this.a.a();
                return c;
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
