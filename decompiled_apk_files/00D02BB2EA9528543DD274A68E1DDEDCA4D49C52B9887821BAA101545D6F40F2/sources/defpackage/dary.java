package defpackage;

import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;
/* compiled from: PG */
/* renamed from: dary  reason: default package */
/* loaded from: classes5.dex */
public final class dary implements dauw {
    private final dauw a;
    private final darv b;

    public dary(dauw dauwVar, darv darvVar) {
        dbsk.s(dauwVar);
        this.a = dauwVar;
        this.b = darvVar;
    }

    @Override // defpackage.dauw
    public final void e(OutputStream outputStream) {
        dauw dauwVar = this.a;
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(new daru(outputStream));
        dauwVar.e(gZIPOutputStream);
        gZIPOutputStream.close();
    }
}
