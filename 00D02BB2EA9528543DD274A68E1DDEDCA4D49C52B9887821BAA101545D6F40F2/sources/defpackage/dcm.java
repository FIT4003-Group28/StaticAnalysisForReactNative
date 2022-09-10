package defpackage;

import java.io.File;
/* compiled from: PG */
/* renamed from: dcm  reason: default package */
/* loaded from: classes5.dex */
final class dcm implements cvib {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ deig c;
    final /* synthetic */ dcn d;

    public dcm(dcn dcnVar, String str, String str2, deig deigVar) {
        this.d = dcnVar;
        this.a = str;
        this.b = str2;
        this.c = deigVar;
    }

    @Override // defpackage.cvib
    public final void a(File file, cvia cviaVar) {
        file.getAbsolutePath();
        this.d.b(this.a);
        this.c.j(dck.b(new File(file.getParentFile(), this.b)));
    }

    @Override // defpackage.cvib
    public final void b(File file) {
        file.getAbsolutePath();
        File file2 = new File(file.getParentFile(), this.b);
        dbsk.l(file.renameTo(file2));
        this.d.b(this.a);
        this.c.j(new dcr(1, file2));
    }
}
