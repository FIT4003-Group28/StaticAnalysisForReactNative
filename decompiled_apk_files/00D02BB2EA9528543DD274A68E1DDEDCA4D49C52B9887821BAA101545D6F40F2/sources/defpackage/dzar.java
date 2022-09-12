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
/* renamed from: dzar  reason: default package */
/* loaded from: classes6.dex */
public final class dzar extends RuntimeException {
    private static final long serialVersionUID = 3026362227162912146L;
    private final List<Throwable> a;
    private final String b;
    private Throwable c;

    public dzar(Iterable<? extends Throwable> iterable) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        if (iterable != null) {
            for (Throwable th : iterable) {
                if (th instanceof dzar) {
                    linkedHashSet.addAll(((dzar) th).a);
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
        List<Throwable> unmodifiableList = Collections.unmodifiableList(arrayList);
        this.a = unmodifiableList;
        int size = unmodifiableList.size();
        StringBuilder sb = new StringBuilder(33);
        sb.append(size);
        sb.append(" exceptions occurred. ");
        this.b = sb.toString();
    }

    private final void a(dzao dzaoVar) {
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
            b(sb, th, "\t");
            i++;
        }
        dzaoVar.a(sb.toString());
    }

    private final void b(StringBuilder sb, Throwable th, String str) {
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
            b(sb, th.getCause(), "");
        }
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable getCause() {
        if (this.c == null) {
            dzan dzanVar = new dzan();
            HashSet hashSet = new HashSet();
            Iterator<Throwable> it = this.a.iterator();
            dzan dzanVar2 = dzanVar;
            while (it.hasNext()) {
                Throwable next = it.next();
                if (!hashSet.contains(next)) {
                    hashSet.add(next);
                    ArrayList<Throwable> arrayList = new ArrayList();
                    Throwable cause = next.getCause();
                    if (cause != null && cause != next) {
                        while (true) {
                            arrayList.add(cause);
                            Throwable cause2 = cause.getCause();
                            if (cause2 == null || cause2 == cause) {
                                break;
                            }
                            cause = cause2;
                        }
                    }
                    for (Throwable th : arrayList) {
                        if (hashSet.contains(th)) {
                            next = new RuntimeException("Duplicate found in causal chain so cropping to prevent loop ...");
                        } else {
                            hashSet.add(th);
                        }
                    }
                    try {
                        dzanVar2.initCause(next);
                    } catch (Throwable unused) {
                    }
                    Throwable cause3 = dzanVar2.getCause();
                    if (cause3 != null && this.c != cause3) {
                        while (true) {
                            dzanVar2 = cause3;
                            cause3 = dzanVar2.getCause();
                            if (cause3 != null && cause3 != dzanVar2) {
                            }
                        }
                    }
                }
            }
            this.c = dzanVar;
        }
        return this.c;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.b;
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() {
        deki.d(this, System.err);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        a(new dzap(printStream));
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        a(new dzaq(printWriter));
    }

    public dzar(Throwable... thArr) {
        this(Arrays.asList(thArr));
    }
}
