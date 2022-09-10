package defpackage;

import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: eagq  reason: default package */
/* loaded from: classes6.dex */
public final class eagq extends eaex {
    final /* synthetic */ int a;
    final /* synthetic */ eahe c;
    final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eagq(eahe eaheVar, Object[] objArr, int i, int i2) {
        super("OkHttp %s stream %d", objArr);
        this.c = eaheVar;
        this.a = i;
        this.d = i2;
    }

    @Override // defpackage.eaex
    public final void c() {
        try {
            this.c.n(this.a, this.d);
        } catch (IOException unused) {
            this.c.h();
        }
    }
}
