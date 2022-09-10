package defpackage;

import java.text.MessageFormat;
import java.util.logging.Level;
/* compiled from: PG */
/* renamed from: dypy  reason: default package */
/* loaded from: classes6.dex */
final class dypy extends dyev {
    dygo a;

    @Override // defpackage.dyev
    public final void a(int i, String str) {
        throw null;
    }

    @Override // defpackage.dyev
    public final void b(int i, String str, Object... objArr) {
        dygo dygoVar = this.a;
        Level c = dylf.c(i);
        if (dylg.a.isLoggable(c)) {
            dylg.c(dygoVar, c, MessageFormat.format(str, objArr));
        }
    }
}
