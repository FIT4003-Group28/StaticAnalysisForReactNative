package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bfwn  reason: default package */
/* loaded from: classes3.dex */
public final class bfwn implements degu<dcdc<dweu>> {
    public final ilo a;
    public bcmj b;
    private final bfwo c;
    private final bckr d;
    private final bcku e;
    private final bcbv f;
    private final bcmk g;

    public bfwn(Executor executor, bfwo bfwoVar, bckr bckrVar, bcku bckuVar, ilo iloVar, bcbv bcbvVar, bcmk bcmkVar) {
        this.c = bfwoVar;
        this.d = bckrVar;
        this.e = bckuVar;
        this.a = iloVar;
        this.f = bcbvVar;
        this.g = bcmkVar;
        deha.q(((bfvy) bcbvVar).a, this, executor);
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(dcdc<dweu> dcdcVar) {
        dcdc<dweu> dcdcVar2 = dcdcVar;
        bvrj.UI_THREAD.c();
        if (dcdcVar2 == null) {
            return;
        }
        dcdc<bclt> dcdcVar3 = ((bfvy) this.f).d;
        int size = dcdcVar3.size();
        for (int i = 0; i < size; i++) {
            dcdcVar3.get(i).i(this.c);
        }
        this.b = this.g.a(dcdcVar3, this.e, this.d, this.a);
        cqkx.p(this.c);
    }
}
