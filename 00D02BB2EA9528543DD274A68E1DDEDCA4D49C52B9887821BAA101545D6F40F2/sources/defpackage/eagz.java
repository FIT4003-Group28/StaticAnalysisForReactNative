package defpackage;

import java.io.IOException;
/* compiled from: PG */
/* renamed from: eagz  reason: default package */
/* loaded from: classes6.dex */
final class eagz extends eaex {
    final boolean a;
    final int c;
    final int d;
    final /* synthetic */ eahe e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eagz(eahe eaheVar, boolean z, int i, int i2) {
        super("OkHttp %s ping %08x%08x", eaheVar.e, Integer.valueOf(i), Integer.valueOf(i2));
        this.e = eaheVar;
        this.a = true;
        this.c = i;
        this.d = i2;
    }

    @Override // defpackage.eaex
    public final void c() {
        eahe eaheVar = this.e;
        try {
            eaheVar.q.f(true, this.c, this.d);
        } catch (IOException unused) {
            eaheVar.h();
        }
    }
}
