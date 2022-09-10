package defpackage;

import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: eaha  reason: default package */
/* loaded from: classes6.dex */
public final class eaha extends eaex {
    final /* synthetic */ eahl a;
    final /* synthetic */ eahd c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eaha(eahd eahdVar, Object[] objArr, eahl eahlVar) {
        super("OkHttp %s stream %d", objArr);
        this.c = eahdVar;
        this.a = eahlVar;
    }

    @Override // defpackage.eaex
    public final void c() {
        try {
            this.c.c.c.f(this.a);
        } catch (IOException e) {
            eaim eaimVar = eaim.c;
            eaimVar.e(4, "Http2Connection.Listener failure for " + this.c.c.e, e);
            try {
                this.a.j(2);
            } catch (IOException unused) {
            }
        }
    }
}
