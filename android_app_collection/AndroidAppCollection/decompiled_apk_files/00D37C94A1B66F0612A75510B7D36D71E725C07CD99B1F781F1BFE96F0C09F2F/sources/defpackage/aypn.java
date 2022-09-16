package defpackage;

import java.io.PrintWriter;
/* compiled from: PG */
/* renamed from: aypn  reason: default package */
/* loaded from: classes2.dex */
final class aypn extends aypl {
    private final PrintWriter a;

    public aypn(PrintWriter printWriter) {
        this.a = printWriter;
    }

    @Override // defpackage.aypl
    public final void a(Object obj) {
        this.a.println(obj);
    }
}
