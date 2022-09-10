package defpackage;

import java.io.PrintWriter;
/* compiled from: PG */
/* renamed from: crmz  reason: default package */
/* loaded from: classes5.dex */
public final class crmz implements crgx {
    private static final String a = "crmz";
    private final dcdc<crgx> b;
    private final crnf<crgx> c;

    public crmz(bvrb bvrbVar, dcdc<crgx> dcdcVar) {
        this.b = dcdcVar;
        this.c = new crnf<>(dcdcVar, bvrbVar);
    }

    @Override // defpackage.crgx, defpackage.btph
    public final void NX(String str, PrintWriter printWriter) {
        dcdc<crgx> dcdcVar = this.b;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            dcdcVar.get(i).NX("", printWriter);
        }
    }

    @Override // defpackage.crgx
    public final void a() {
        this.c.a(crmx.a, ".onServiceCreate()", 4);
    }

    @Override // defpackage.crgx
    public final void b() {
        this.c.a(crmy.a, ".onServiceDestroy()", 0);
    }
}
