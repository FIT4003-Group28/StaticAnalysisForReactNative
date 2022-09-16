package defpackage;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: ckq  reason: default package */
/* loaded from: classes2.dex */
public final class ckq extends Exception {
    private static final StackTraceElement[] a = new StackTraceElement[0];
    private static final long serialVersionUID = 1;
    private final List b;
    private chy c;
    private Class d;
    private String e;
    private int f;

    public ckq(String str) {
        this(str, Collections.emptyList());
    }

    private final void c(Throwable th, List list) {
        if (th instanceof ckq) {
            for (Throwable th2 : ((ckq) th).b) {
                c(th2, list);
            }
            return;
        }
        list.add(th);
    }

    private static void d(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    private final void e(Appendable appendable) {
        d(this, appendable);
        List list = this.b;
        ckp ckpVar = new ckp(appendable);
        try {
            int size = list.size();
            int i = 0;
            while (i < size) {
                ckpVar.append("Cause (");
                int i2 = i + 1;
                ckpVar.append(String.valueOf(i2));
                ckpVar.append(" of ");
                ckpVar.append(String.valueOf(size));
                ckpVar.append("): ");
                Throwable th = (Throwable) list.get(i);
                if (th instanceof ckq) {
                    ((ckq) th).e(ckpVar);
                } else {
                    d(th, ckpVar);
                }
                i = i2;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public final List a() {
        ArrayList arrayList = new ArrayList();
        c(this, arrayList);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(chy chyVar, int i, Class cls) {
        this.c = chyVar;
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
        Class cls = this.d;
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
            String e = acx.e(i);
            StringBuilder sb3 = new StringBuilder(e.length() + 2);
            sb3.append(", ");
            sb3.append(e);
            str2 = sb3.toString();
        } else {
            str2 = str3;
        }
        sb.append(str2);
        chy chyVar = this.c;
        if (chyVar != null) {
            String valueOf2 = String.valueOf(chyVar);
            StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf2).length() + 2);
            sb4.append(", ");
            sb4.append(valueOf2);
            str3 = sb4.toString();
        }
        sb.append(str3);
        List<Throwable> a2 = a();
        if (a2.isEmpty()) {
            return sb.toString();
        }
        if (a2.size() == 1) {
            sb.append("\nThere was 1 root cause:");
        } else {
            sb.append("\nThere were ");
            sb.append(a2.size());
            sb.append(" root causes:");
        }
        for (Throwable th : a2) {
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
        e(System.err);
    }

    public ckq(String str, List list) {
        this.e = str;
        setStackTrace(a);
        this.b = list;
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        e(printStream);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        e(printWriter);
    }
}
