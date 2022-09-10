package defpackage;

import java.util.Collections;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: andk  reason: default package */
/* loaded from: classes2.dex */
public final class andk implements anqu {
    final /* synthetic */ andm a;

    public andk(andm andmVar) {
        this.a = andmVar;
    }

    @Override // defpackage.anqu
    public final void a(dcdc<dvas> dcdcVar) {
        this.a.aS(dcdcVar, anfb.SUCCESS);
    }

    @Override // defpackage.anqu
    public final void b() {
        this.a.aS(Collections.emptyList(), anfb.FAILURE);
    }
}
