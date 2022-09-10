package defpackage;

import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: eags  reason: default package */
/* loaded from: classes6.dex */
public final class eags extends eaex {
    final /* synthetic */ int a;
    final /* synthetic */ eahe c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eags(eahe eaheVar, Object[] objArr, int i) {
        super("OkHttp %s Push Request[%s]", objArr);
        this.c = eaheVar;
        this.a = i;
    }

    @Override // defpackage.eaex
    public final void c() {
        try {
            this.c.q.i(this.a, 9);
            synchronized (this.c) {
                this.c.s.remove(Integer.valueOf(this.a));
            }
        } catch (IOException unused) {
        }
    }
}
