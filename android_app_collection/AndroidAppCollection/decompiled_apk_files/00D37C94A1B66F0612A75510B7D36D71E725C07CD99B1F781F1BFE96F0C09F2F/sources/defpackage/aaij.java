package defpackage;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aaij  reason: default package */
/* loaded from: classes.dex */
public final class aaij implements ankb {
    final /* synthetic */ aaik a;

    public aaij(aaik aaikVar) {
        this.a = aaikVar;
    }

    @Override // defpackage.ankb
    public final void a(Throwable th) {
        aaki aakiVar = this.a.e;
        String valueOf = String.valueOf(th);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14);
        sb.append("commit failed:");
        sb.append(valueOf);
        aakiVar.a("ISPES", sb.toString());
    }

    @Override // defpackage.ankb
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        List<aajp> list = (List) obj;
        if (list != null) {
            aaik aaikVar = this.a;
            for (aajp aajpVar : list) {
                aaikVar.n(aajpVar.a).c(aajpVar);
                aaikVar.m(((aajj) akzj.d(aajpVar.c, aajpVar.b)).getClass()).c(aajpVar);
            }
        }
    }
}
