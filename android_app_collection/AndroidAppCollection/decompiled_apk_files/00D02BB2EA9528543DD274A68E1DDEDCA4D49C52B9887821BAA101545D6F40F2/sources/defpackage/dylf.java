package defpackage;

import java.text.MessageFormat;
import java.util.logging.Level;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dylf  reason: default package */
/* loaded from: classes6.dex */
public final class dylf extends dyev {
    private final dylg a;
    private final dyvn b;

    public dylf(dylg dylgVar, dyvn dyvnVar) {
        dbsk.t(dylgVar, "tracer");
        this.a = dylgVar;
        dbsk.t(dyvnVar, "time");
        this.b = dyvnVar;
    }

    public static Level c(int i) {
        int i2 = i - 1;
        return i2 != 2 ? i2 != 3 ? Level.FINEST : Level.FINE : Level.FINER;
    }

    private final boolean d(int i) {
        if (i != 1) {
            synchronized (this.a.b) {
            }
            return false;
        }
        return false;
    }

    @Override // defpackage.dyev
    public final void a(int i, String str) {
        dygg dyggVar;
        dygo dygoVar = this.a.c;
        Level c = c(i);
        if (dylg.a.isLoggable(c)) {
            dylg.c(dygoVar, c, str);
        }
        if (!d(i) || i == 1) {
            return;
        }
        dylg dylgVar = this.a;
        dygf dygfVar = new dygf();
        dygfVar.a = str;
        int i2 = i - 1;
        if (i2 == 2) {
            dyggVar = dygg.CT_WARNING;
        } else if (i2 == 3) {
            dyggVar = dygg.CT_ERROR;
        } else {
            dyggVar = dygg.CT_INFO;
        }
        dygfVar.b = dyggVar;
        dygfVar.b(this.b.a());
        dylgVar.b(dygfVar.a());
    }

    @Override // defpackage.dyev
    public final void b(int i, String str, Object... objArr) {
        a(i, (d(i) || dylg.a.isLoggable(c(i))) ? MessageFormat.format(str, objArr) : null);
    }
}
