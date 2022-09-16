package defpackage;

import android.view.View;
import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: akcv  reason: default package */
/* loaded from: classes.dex */
public final class akcv extends cyr {
    @dfs(a = 13)
    tfm a;
    @dfs(a = 14)
    private final akcu b;

    public akcv() {
        super("LazilyConvertedElementSize");
        this.b = new akcu();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final cyr G(cyv cyvVar, int i, int i2) {
        tfm tfmVar = this.a;
        akcu akcuVar = this.b;
        AtomicReference atomicReference = akcuVar.a;
        AtomicReference atomicReference2 = akcuVar.b;
        tda tdaVar = (tda) atomicReference2.get();
        cyr cyrVar = (cyr) atomicReference.get();
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (tdaVar.c.intValue() != size || tdaVar.d.intValue() != size2 || cyrVar == null) {
            tcz e = tdaVar.e();
            e.b = Integer.valueOf(size);
            e.c = Integer.valueOf(size2);
            tda a = e.a();
            atomicReference2.set(a);
            cyrVar = tfmVar.a(cyvVar, a);
            atomicReference.set(cyrVar);
        }
        return cyrVar.j();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final void M(cyv cyvVar) {
        dcz dczVar = new dcz();
        dcz dczVar2 = new dcz();
        dczVar.a = new AtomicReference();
        tcz a = tda.a();
        a.b = 0;
        a.c = 0;
        dczVar2.a = new AtomicReference(a.a());
        akcu akcuVar = this.b;
        akcuVar.a = (AtomicReference) dczVar.a;
        akcuVar.b = (AtomicReference) dczVar2.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final void X(ddl ddlVar, ddl ddlVar2) {
        akcu akcuVar = (akcu) ddlVar;
        akcu akcuVar2 = (akcu) ddlVar2;
        akcuVar2.a = akcuVar.a;
        akcuVar2.b = akcuVar.b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final boolean Z() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final boolean ac() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cyr
    public final ddl m() {
        return this.b;
    }
}
