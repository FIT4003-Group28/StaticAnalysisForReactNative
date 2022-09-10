package defpackage;

import java.io.File;
/* compiled from: PG */
/* renamed from: avcj  reason: default package */
/* loaded from: classes2.dex */
final class avcj implements degu<cljx> {
    final /* synthetic */ File a;
    final /* synthetic */ File b;
    final /* synthetic */ String c;
    final /* synthetic */ avck d;

    public avcj(avck avckVar, File file, File file2, String str) {
        this.d = avckVar;
        this.a = file;
        this.b = file2;
        this.c = str;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        dlqg c = avck.c(th);
        this.d.b.remove(this.c);
        this.d.a.b(this.c, c);
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(cljx cljxVar) {
        dlpy bZ = dlqg.c.bZ();
        dlqe bZ2 = dlqf.d.bZ();
        String absolutePath = this.a.getAbsolutePath();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dlqf dlqfVar = (dlqf) bZ2.b;
        absolutePath.getClass();
        dlqfVar.a |= 1;
        dlqfVar.b = absolutePath;
        String absolutePath2 = this.b.getAbsolutePath();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dlqf dlqfVar2 = (dlqf) bZ2.b;
        absolutePath2.getClass();
        dlqfVar2.a |= 2;
        dlqfVar2.c = absolutePath2;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dlqg dlqgVar = (dlqg) bZ.b;
        dlqf bK = bZ2.bK();
        bK.getClass();
        dlqgVar.b = bK;
        dlqgVar.a = 1;
        this.d.b.remove(this.c);
        this.d.a.b(this.c, bZ.bK());
    }
}
