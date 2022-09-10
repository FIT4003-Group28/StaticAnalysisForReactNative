package defpackage;

import android.content.Intent;
import android.net.Uri;
/* compiled from: PG */
/* renamed from: afgb  reason: default package */
/* loaded from: classes.dex */
public final class afgb extends itb implements afgy {
    private final gga a;
    private final affw b;
    private final efc c;
    private final dzsj<afgw> d;
    @dzsi
    private afgw e;
    private String f = "";

    public afgb(gga ggaVar, affw affwVar, efc efcVar, dzsj<afgw> dzsjVar) {
        this.a = ggaVar;
        this.b = affwVar;
        this.c = efcVar;
        this.d = dzsjVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x006e, code lost:
        if (r0.q() != false) goto L57;
     */
    @Override // defpackage.afgy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.bvjz e(android.content.Intent r11, java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afgb.e(android.content.Intent, java.lang.String):bvjz");
    }

    @Override // defpackage.afgy
    public final void f(String str) {
        afhx c;
        affw affwVar = this.b;
        if (((efh) affwVar.a).b && (c = affwVar.c(new Intent("android.intent.action.VIEW", Uri.parse(str)), null)) != null) {
            c.a();
        }
    }

    @Override // defpackage.afgy
    @dzsi
    public final afhx i() {
        return this.b.f();
    }

    @Override // defpackage.afgy
    public final String j() {
        String str = this.f;
        this.f = "";
        return str;
    }

    @Override // defpackage.afgy
    public final void k() {
        afgw afgwVar = this.e;
        if (afgwVar != null) {
            afgwVar.b();
        }
    }

    @Override // defpackage.afgy
    public final boolean l(Intent intent) {
        dbsg<afid> d = this.b.d(intent);
        boolean z = true;
        if (d.a()) {
            int i = d.b().aM;
            if (i != 1) {
                z = false;
            }
            if (i == 0) {
                throw null;
            }
        }
        return z;
    }
}
