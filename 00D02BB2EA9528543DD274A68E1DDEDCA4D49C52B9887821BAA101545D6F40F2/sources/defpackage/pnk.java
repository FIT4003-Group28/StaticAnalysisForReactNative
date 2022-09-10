package defpackage;

import java.io.File;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: pnk  reason: default package */
/* loaded from: classes7.dex */
final class pnk implements cvib {
    final /* synthetic */ deig a;
    final /* synthetic */ String b;

    public pnk(deig deigVar, String str) {
        this.a = deigVar;
        this.b = str;
    }

    @Override // defpackage.cvib
    public final void a(File file, cvia cviaVar) {
        deig deigVar = this.a;
        String valueOf = String.valueOf(this.b);
        deigVar.k(new IOException(valueOf.length() != 0 ? "Download failed: ".concat(valueOf) : new String("Download failed: ")));
    }

    @Override // defpackage.cvib
    public final void b(File file) {
        this.a.j(null);
    }
}
