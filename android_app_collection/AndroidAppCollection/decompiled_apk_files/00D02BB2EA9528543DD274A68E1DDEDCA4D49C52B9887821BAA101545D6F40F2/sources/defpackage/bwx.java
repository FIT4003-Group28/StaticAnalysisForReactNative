package defpackage;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: bwx  reason: default package */
/* loaded from: classes.dex */
public final class bwx extends Exception {
    private static final StackTraceElement[] a = new StackTraceElement[0];
    private static final long serialVersionUID = 1;
    private final List<Throwable> b;
    private btw c;
    private Class<?> d;
    private String e;
    private int f;

    public bwx(String str) {
        this(str, Collections.emptyList());
    }

    private final void c(Throwable th, List<Throwable> list) {
        if (th instanceof bwx) {
            for (Throwable th2 : ((bwx) th).b) {
                c(th2, list);
            }
            return;
        }
        list.add(th);
    }

    private final void d(Appendable appendable) {
        e(this, appendable);
        List<Throwable> list = this.b;
        bww bwwVar = new bww(appendable);
        try {
            int size = list.size();
            int i = 0;
            while (i < size) {
                bwwVar.append("Cause (");
                int i2 = i + 1;
                bwwVar.append(String.valueOf(i2));
                bwwVar.append(" of ");
                bwwVar.append(String.valueOf(size));
                bwwVar.append("): ");
                Throwable th = list.get(i);
                if (th instanceof bwx) {
                    ((bwx) th).d(bwwVar);
                } else {
                    e(th, bwwVar);
                }
                i = i2;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void e(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    public final List<Throwable> a() {
        ArrayList arrayList = new ArrayList();
        c(this, arrayList);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(btw btwVar, int i, Class<?> cls) {
        this.c = btwVar;
        this.f = i;
        this.d = cls;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.e);
        Class<?> cls = this.d;
        String str3 = "";
        if (cls != null) {
            String valueOf = String.valueOf(cls);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 2);
            sb2.append(", ");
            sb2.append(valueOf);
            str = sb2.toString();
        } else {
            str = str3;
        }
        sb.append(str);
        int i = this.f;
        if (i != 0) {
            String a2 = btj.a(i);
            StringBuilder sb3 = new StringBuilder(a2.length() + 2);
            sb3.append(", ");
            sb3.append(a2);
            str2 = sb3.toString();
        } else {
            str2 = str3;
        }
        sb.append(str2);
        btw btwVar = this.c;
        if (btwVar != null) {
            String valueOf2 = String.valueOf(btwVar);
            StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf2).length() + 2);
            sb4.append(", ");
            sb4.append(valueOf2);
            str3 = sb4.toString();
        }
        sb.append(str3);
        List<Throwable> a3 = a();
        if (a3.isEmpty()) {
            return sb.toString();
        }
        if (a3.size() == 1) {
            sb.append("\nThere was 1 cause:");
        } else {
            sb.append("\nThere were ");
            sb.append(a3.size());
            sb.append(" causes:");
        }
        for (Throwable th : a3) {
            sb.append('\n');
            sb.append(th.getClass().getName());
            sb.append('(');
            sb.append(th.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() {
        deki.d(this, System.err);
    }

    public bwx(String str, List<Throwable> list) {
        this.e = str;
        setStackTrace(a);
        this.b = list;
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        d(printStream);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        d(printWriter);
    }
}
