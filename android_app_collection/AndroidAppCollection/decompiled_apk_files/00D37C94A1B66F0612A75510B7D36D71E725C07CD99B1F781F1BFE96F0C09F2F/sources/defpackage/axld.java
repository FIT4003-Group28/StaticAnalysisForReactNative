package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: PG */
/* renamed from: axld  reason: default package */
/* loaded from: classes2.dex */
public final class axld extends axlg {
    final Logger a;

    public axld(String str) {
        this.a = Logger.getLogger(str);
    }

    @Override // defpackage.axlg
    public final void a(String str) {
        this.a.logp(Level.FINE, "com.googlecode.mp4parser.util.JuliLogger", "logDebug", str);
    }

    @Override // defpackage.axlg
    public final void b(String str) {
        this.a.logp(Level.SEVERE, "com.googlecode.mp4parser.util.JuliLogger", "logError", str);
    }

    @Override // defpackage.axlg
    public final void c(String str) {
        this.a.logp(Level.WARNING, "com.googlecode.mp4parser.util.JuliLogger", "logWarn", str);
    }
}
