package defpackage;

import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: eagu  reason: default package */
/* loaded from: classes6.dex */
public final class eagu extends eaex {
    final /* synthetic */ int a;
    final /* synthetic */ eaiz c;
    final /* synthetic */ int d;
    final /* synthetic */ eahe e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eagu(eahe eaheVar, Object[] objArr, int i, eaiz eaizVar, int i2) {
        super("OkHttp %s Push Data[%s]", objArr);
        this.e = eaheVar;
        this.a = i;
        this.c = eaizVar;
        this.d = i2;
    }

    @Override // defpackage.eaex
    public final void c() {
        try {
            this.c.A(this.d);
            this.e.q.i(this.a, 9);
            synchronized (this.e) {
                this.e.s.remove(Integer.valueOf(this.a));
            }
        } catch (IOException unused) {
        }
    }
}
