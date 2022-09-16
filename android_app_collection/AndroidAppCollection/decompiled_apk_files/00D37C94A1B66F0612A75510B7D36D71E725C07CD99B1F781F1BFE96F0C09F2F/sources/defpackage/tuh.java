package defpackage;

import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: tuh  reason: default package */
/* loaded from: classes4.dex */
public final class tuh implements ankb {
    final /* synthetic */ tqm a;
    final /* synthetic */ tuk b;

    public tuh(tuk tukVar, tqm tqmVar) {
        this.b = tukVar;
        this.a = tqmVar;
    }

    @Override // defpackage.ankb
    public final void a(Throwable th) {
        int i = typ.a;
        try {
            tuk tukVar = this.b;
            tzc.h(tukVar.a, tukVar.i, this.a, tukVar.g);
        } catch (IOException unused) {
        }
    }

    @Override // defpackage.ankb
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Void r1 = (Void) obj;
    }
}
