package defpackage;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
/* compiled from: PG */
/* renamed from: aypo  reason: default package */
/* loaded from: classes2.dex */
public final class aypo extends RuntimeException {
    private static final long serialVersionUID = 3026362227162912146L;
    private final List a;
    private final String b;
    private Throwable c;

    public aypo(Iterable iterable) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        if (iterable != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                Throwable th = (Throwable) it.next();
                if (th instanceof aypo) {
                    linkedHashSet.addAll(((aypo) th).a);
                } else if (th != null) {
                    linkedHashSet.add(th);
                } else {
                    linkedHashSet.add(new NullPointerException("Throwable was null!"));
                }
            }
        } else {
            linkedHashSet.add(new NullPointerException("errors was null"));
        }
        if (linkedHashSet.isEmpty()) {
            throw new IllegalArgumentException("errors is empty");
        }
        arrayList.addAll(linkedHashSet);
        List unmodifiableList = Collections.unmodifiableList(arrayList);
        this.a = unmodifiableList;
        int size = unmodifiableList.size();
        StringBuilder sb = new StringBuilder(33);
        sb.append(size);
        sb.append(" exceptions occurred. ");
        this.b = sb.toString();
    }

    private final void a(StringBuilder sb, Throwable th, String str) {
        StackTraceElement[] stackTrace;
        sb.append(str);
        sb.append(th);
        sb.append('\n');
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            sb.append("\t\tat ");
            sb.append(stackTraceElement);
            sb.append('\n');
        }
        if (th.getCause() != null) {
            sb.append("\tCaused by: ");
            a(sb, th.getCause(), "");
        }
    }

    private final void b(aypl ayplVar) {
        StackTraceElement[] stackTrace;
        StringBuilder sb = new StringBuilder(128);
        sb.append(this);
        sb.append('\n');
        for (StackTraceElement stackTraceElement : getStackTrace()) {
            sb.append("\tat ");
            sb.append(stackTraceElement);
            sb.append('\n');
        }
        int i = 1;
        for (Throwable th : this.a) {
            sb.append("  ComposedException ");
            sb.append(i);
            sb.append(" :\n");
            a(sb, th, "\t");
            i++;
        }
        ayplVar.a(sb.toString());
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable getCause() {
        if (this.c == null) {
            aypk aypkVar = new aypk();
            HashSet hashSet = new HashSet();
            Throwable th = aypkVar;
            for (Throwable th2 : this.a) {
                if (!hashSet.contains(th2)) {
                    hashSet.add(th2);
                    ArrayList<Throwable> arrayList = new ArrayList();
                    Throwable cause = th2.getCause();
                    if (cause != null && cause != th2) {
                        while (true) {
                            arrayList.add(cause);
                            Throwable cause2 = cause.getCause();
                            if (cause2 == null || cause2 == cause) {
                                break;
                            }
                            cause = cause2;
                        }
                    }
                    for (Throwable th3 : arrayList) {
                        if (hashSet.contains(th3)) {
                            th2 = new RuntimeException("Duplicate found in causal chain so cropping to prevent loop ...");
                        } else {
                            hashSet.add(th3);
                        }
                    }
                    try {
                        th.initCause(th2);
                    } catch (Throwable unused) {
                    }
                    Throwable cause3 = th.getCause();
                    if (cause3 != null && th != cause3) {
                        while (true) {
                            th = cause3;
                            cause3 = th.getCause();
                            if (cause3 != null && cause3 != th) {
                            }
                        }
                    }
                }
            }
            this.c = aypkVar;
        }
        return this.c;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.b;
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() {
        printStackTrace(System.err);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        b(new aypm(printStream));
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        b(new aypn(printWriter));
    }

    public aypo(Throwable... thArr) {
        this(Arrays.asList(thArr));
    }
}
