package defpackage;
/* compiled from: PG */
/* renamed from: dctl  reason: default package */
/* loaded from: classes.dex */
public final class dctl extends dcsg {
    public static final dcsg a = new dctl();

    private dctl() {
    }

    @Override // defpackage.dcsg
    public final String a(Class<? extends dcpz<?>> cls) {
        StackTraceElement a2 = dcui.a(cls, new Throwable(), 1);
        if (a2 != null) {
            return a2.getClassName();
        }
        String valueOf = String.valueOf(cls.getName());
        throw new IllegalStateException(valueOf.length() != 0 ? "no caller found on the stack for: ".concat(valueOf) : new String("no caller found on the stack for: "));
    }

    @Override // defpackage.dcsg
    public final dcqp b(Class<?> cls, int i) {
        StackTraceElement a2 = dcui.a(cls, new Throwable(), i + 1);
        return a2 != null ? new dcul(a2) : dcqp.a;
    }

    public final String toString() {
        return "Default stack-based caller finder";
    }
}
