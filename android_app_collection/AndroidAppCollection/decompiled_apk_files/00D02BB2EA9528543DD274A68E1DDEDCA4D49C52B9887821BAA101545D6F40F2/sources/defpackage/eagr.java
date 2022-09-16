package defpackage;

import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: eagr  reason: default package */
/* loaded from: classes6.dex */
public final class eagr extends eaex {
    final /* synthetic */ int a;
    final /* synthetic */ long c;
    final /* synthetic */ eahe d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eagr(eahe eaheVar, Object[] objArr, int i, long j) {
        super("OkHttp Window Update %s stream %d", objArr);
        this.d = eaheVar;
        this.a = i;
        this.c = j;
    }

    @Override // defpackage.eaex
    public final void c() {
        try {
            this.d.q.g(this.a, this.c);
        } catch (IOException unused) {
            this.d.h();
        }
    }
}
