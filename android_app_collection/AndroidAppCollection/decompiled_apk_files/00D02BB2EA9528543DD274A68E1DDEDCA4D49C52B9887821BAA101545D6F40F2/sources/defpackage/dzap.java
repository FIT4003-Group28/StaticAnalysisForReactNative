package defpackage;

import java.io.PrintStream;
/* compiled from: PG */
/* renamed from: dzap  reason: default package */
/* loaded from: classes6.dex */
final class dzap extends dzao {
    private final PrintStream a;

    public dzap(PrintStream printStream) {
        this.a = printStream;
    }

    @Override // defpackage.dzao
    public final void a(Object obj) {
        this.a.println(obj);
    }
}
