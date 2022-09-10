package defpackage;

import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: eahc  reason: default package */
/* loaded from: classes6.dex */
public final class eahc extends eaex {
    final /* synthetic */ eahr a;
    final /* synthetic */ eahd c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eahc(eahd eahdVar, Object[] objArr, eahr eahrVar) {
        super("OkHttp %s ACK Settings", objArr);
        this.c = eahdVar;
        this.a = eahrVar;
    }

    @Override // defpackage.eaex
    public final void c() {
        try {
            this.c.c.q.b(this.a);
        } catch (IOException unused) {
            this.c.c.h();
        }
    }
}
