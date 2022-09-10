package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: eaqk  reason: default package */
/* loaded from: classes6.dex */
public abstract class eaqk extends eaqe implements Serializable, eapt {
    private static final long serialVersionUID = 2353678632973660L;
    public final eaok a;
    private final int[] b;

    /* JADX INFO: Access modifiers changed from: protected */
    public eaqk(long j, eaok eaokVar) {
        eaok d = eaor.d(eaokVar);
        this.a = d.b();
        this.b = d.g(this, j);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public eaqk(eaqk eaqkVar, int[] iArr) {
        this.a = eaqkVar.a;
        this.b = iArr;
    }

    @Override // defpackage.eapt
    public final int g(int i) {
        return this.b[i];
    }

    @Override // defpackage.eapt
    public final eaok j() {
        return this.a;
    }

    public final int[] p() {
        return (int[]) this.b.clone();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public eaqk(Object obj, eatp eatpVar) {
        easj c = easc.a().c(obj);
        eaok d = eaor.d(c.e(obj));
        this.a = d.b();
        this.b = c.d(this, obj, d, eatpVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public eaqk(eaqk eaqkVar, eaok eaokVar) {
        this.a = eaokVar.b();
        this.b = eaqkVar.b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public eaqk(int[] iArr) {
        eaok d = eaor.d(null);
        this.a = d.b();
        d.f(this, iArr);
        this.b = iArr;
    }
}
