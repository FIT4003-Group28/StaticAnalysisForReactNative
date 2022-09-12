package defpackage;

import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: PG */
/* renamed from: daur  reason: default package */
/* loaded from: classes5.dex */
public final class daur implements dauw {
    private final dauw a;
    private final Level b;
    private final Logger c;

    public daur(dauw dauwVar, Logger logger, Level level) {
        this.a = dauwVar;
        this.c = logger;
        this.b = level;
    }

    @Override // defpackage.dauw
    public final void e(OutputStream outputStream) {
        dauq dauqVar = new dauq(outputStream, this.c, this.b);
        try {
            this.a.e(dauqVar);
            dauqVar.a.close();
            outputStream.flush();
        } catch (Throwable th) {
            dauqVar.a.close();
            throw th;
        }
    }
}
