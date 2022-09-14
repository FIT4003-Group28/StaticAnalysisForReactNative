package defpackage;

import java.io.PrintWriter;
/* compiled from: PG */
/* renamed from: dzaq  reason: default package */
/* loaded from: classes6.dex */
final class dzaq extends dzao {
    private final PrintWriter a;

    public dzaq(PrintWriter printWriter) {
        this.a = printWriter;
    }

    @Override // defpackage.dzao
    public final void a(Object obj) {
        this.a.println(obj);
    }
}
