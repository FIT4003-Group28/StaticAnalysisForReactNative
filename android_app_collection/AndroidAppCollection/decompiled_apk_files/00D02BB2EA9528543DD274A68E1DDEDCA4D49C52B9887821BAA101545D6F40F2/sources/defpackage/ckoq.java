package defpackage;

import java.io.PrintWriter;
/* compiled from: PG */
/* renamed from: ckoq  reason: default package */
/* loaded from: classes.dex */
public final class ckoq {
    private final String a;

    public ckoq() {
        this.a = "Unknown";
    }

    public ckoq(String str) {
        this.a = str;
    }

    public static final void b() {
        int i = ckoj.a;
    }

    public final void a(String str, PrintWriter printWriter) {
        printWriter.write(str);
        printWriter.write("Version: ");
        printWriter.write(this.a);
        printWriter.write(" (no event-track available in production build).\n");
    }
}
