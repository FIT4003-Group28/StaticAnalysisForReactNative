package defpackage;

import java.text.MessageFormat;
import java.util.logging.Level;
/* compiled from: PG */
/* renamed from: ayef  reason: default package */
/* loaded from: classes2.dex */
public final class ayef extends axyf {
    private final ayeg a;

    public ayef(ayeg ayegVar, aymp aympVar) {
        ayegVar.getClass();
        this.a = ayegVar;
        aympVar.getClass();
    }

    public static Level c(int i) {
        int i2 = i - 1;
        return i2 != 2 ? i2 != 3 ? Level.FINEST : Level.FINE : Level.FINER;
    }

    private final void d(int i) {
        if (i != 1) {
            synchronized (this.a.b) {
            }
        }
    }

    @Override // defpackage.axyf
    public final void a(int i, String str) {
        axzs axzsVar = this.a.c;
        Level c = c(i);
        if (ayeg.a.isLoggable(c)) {
            ayeg.a(axzsVar, c, str);
        }
        d(i);
    }

    @Override // defpackage.axyf
    public final void b(int i, String str, Object... objArr) {
        Level c = c(i);
        d(i);
        a(i, ayeg.a.isLoggable(c) ? MessageFormat.format(str, objArr) : null);
    }
}
