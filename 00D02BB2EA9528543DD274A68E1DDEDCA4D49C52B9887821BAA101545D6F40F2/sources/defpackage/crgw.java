package defpackage;

import java.io.PrintWriter;
/* compiled from: PG */
/* renamed from: crgw  reason: default package */
/* loaded from: classes5.dex */
public final class crgw implements crgx {
    private final btwd a;
    private final crem b;

    public crgw(btwd btwdVar, crem cremVar) {
        this.a = btwdVar;
        this.b = cremVar;
    }

    @Override // defpackage.crgx, defpackage.btph
    public final void NX(String str, PrintWriter printWriter) {
    }

    @Override // defpackage.crgx
    public final void a() {
        if (!this.a.z() || !this.b.g()) {
            return;
        }
        this.b.k();
    }

    @Override // defpackage.crgx
    public final void b() {
    }
}
