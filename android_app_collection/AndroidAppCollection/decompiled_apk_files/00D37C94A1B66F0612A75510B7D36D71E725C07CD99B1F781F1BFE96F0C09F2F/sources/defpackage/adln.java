package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: adln  reason: default package */
/* loaded from: classes.dex */
public final class adln extends adlh {
    public adln(yni yniVar, airw airwVar, azqb azqbVar, azqb azqbVar2, adoa adoaVar) {
        super(yniVar, (adli) airwVar.A(), azqbVar, azqbVar2, adoaVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.adlh
    public final void a(adnl adnlVar) {
        this.a.d(new adlq(adnlVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.adlh
    public final void b() {
        this.a.d(new adlo(true, aifh.DEFAULT, -1L));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.adlh
    public final void c(adnl adnlVar) {
        this.a.d(new adlp(adnlVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.adlh
    public final void d(aifh aifhVar) {
        this.a.d(new adlo(false, aifhVar, TimeUnit.MILLISECONDS.toSeconds(f().i())));
    }
}
