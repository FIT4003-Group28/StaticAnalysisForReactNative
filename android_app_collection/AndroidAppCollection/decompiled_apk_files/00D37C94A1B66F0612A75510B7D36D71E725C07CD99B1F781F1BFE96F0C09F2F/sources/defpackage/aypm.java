package defpackage;

import java.io.PrintStream;
/* compiled from: PG */
/* renamed from: aypm  reason: default package */
/* loaded from: classes2.dex */
final class aypm extends aypl {
    private final PrintStream a;

    public aypm(PrintStream printStream) {
        this.a = printStream;
    }

    @Override // defpackage.aypl
    public final void a(Object obj) {
        this.a.println(obj);
    }
}
