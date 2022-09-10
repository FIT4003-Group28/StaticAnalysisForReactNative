package defpackage;

import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: ktf  reason: default package */
/* loaded from: classes.dex */
public final class ktf implements btph {
    private static final SimpleDateFormat c = new SimpleDateFormat("MM-dd HH:mm:ss.SSS", Locale.US);
    public final dcba<kte> a = dcba.a(100);
    public final cqat b;

    public ktf(cqat cqatVar) {
        this.b = cqatVar;
    }

    public static String a(long j) {
        return c.format(new Date(j));
    }

    @Override // defpackage.btph
    public final void NX(String str, PrintWriter printWriter) {
        throw null;
    }

    public final void b(String str, ktd ktdVar) {
        this.a.add(new kte(ktdVar, str, this.b.b()));
    }
}
