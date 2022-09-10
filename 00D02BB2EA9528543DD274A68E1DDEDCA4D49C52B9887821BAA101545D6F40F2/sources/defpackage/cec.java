package defpackage;

import android.graphics.Bitmap;
import java.io.InputStream;
/* compiled from: PG */
/* renamed from: cec  reason: default package */
/* loaded from: classes.dex */
public final class cec implements buc<InputStream, Bitmap> {
    private final cdl a;
    private final bxl b;

    public cec(cdl cdlVar, bxl bxlVar) {
        this.a = cdlVar;
        this.b = bxlVar;
    }

    @Override // defpackage.buc
    public final /* bridge */ /* synthetic */ boolean a(InputStream inputStream, bua buaVar) {
        return true;
    }

    @Override // defpackage.buc
    public final /* bridge */ /* synthetic */ bxd<Bitmap> b(InputStream inputStream, int i, int i2, bua buaVar) {
        cdz cdzVar;
        boolean z;
        cje poll;
        InputStream inputStream2 = inputStream;
        if (inputStream2 instanceof cdz) {
            cdzVar = (cdz) inputStream2;
            z = false;
        } else {
            cdzVar = new cdz(inputStream2, this.b);
            z = true;
        }
        synchronized (cje.a) {
            poll = cje.a.poll();
        }
        if (poll == null) {
            poll = new cje();
        }
        poll.b = cdzVar;
        try {
            bxd<Bitmap> a = this.a.a(new cjl(poll), i, i2, buaVar, new ceb(cdzVar, poll));
            poll.a();
            if (z) {
                cdzVar.b();
            }
            return a;
        } catch (Throwable th) {
            poll.a();
            if (z) {
                cdzVar.b();
            }
            throw th;
        }
    }
}
