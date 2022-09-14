package defpackage;

import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bzdx  reason: default package */
/* loaded from: classes4.dex */
public final class bzdx implements degu<Map<qdv, dopk>> {
    final /* synthetic */ amte a;
    final /* synthetic */ boolean b;
    final /* synthetic */ bzdz c;

    public bzdx(bzdz bzdzVar, amte amteVar, boolean z) {
        this.c = bzdzVar;
        this.a = amteVar;
        this.b = z;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        this.c.a();
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(Map<qdv, dopk> map) {
        bzdz bzdzVar = this.c;
        bzdzVar.c.n++;
        bzdzVar.c(this.a, map, this.b);
        this.c.a();
    }
}
