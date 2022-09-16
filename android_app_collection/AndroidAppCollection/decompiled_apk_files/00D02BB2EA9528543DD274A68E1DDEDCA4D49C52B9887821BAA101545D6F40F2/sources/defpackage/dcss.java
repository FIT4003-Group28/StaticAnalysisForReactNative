package defpackage;

import dalvik.system.VMStack;
/* compiled from: PG */
/* renamed from: dcss  reason: default package */
/* loaded from: classes.dex */
class dcss extends dcsg {
    @Override // defpackage.dcsg
    public String a(Class<? extends dcpz<?>> cls) {
        boolean z;
        boolean z2;
        StackTraceElement a;
        z = dcsu.a;
        if (z) {
            try {
                Class<?> s = dcsu.s();
                if (cls.equals(s)) {
                    return VMStack.getStackClass2().getName();
                }
                String valueOf = String.valueOf(cls);
                String valueOf2 = String.valueOf(s);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 43 + String.valueOf(valueOf2).length());
                sb.append("Unexpected stack depth, expected: ");
                sb.append(valueOf);
                sb.append(" but was ");
                sb.append(valueOf2);
                throw new IllegalStateException(sb.toString());
            } catch (Throwable unused) {
            }
        }
        z2 = dcsu.b;
        if (!z2 || (a = dcui.a(cls, new Throwable(), 1)) == null) {
            return null;
        }
        return a.getClassName();
    }

    @Override // defpackage.dcsg
    public dcqp b(Class<?> cls, int i) {
        return dcqp.a;
    }
}
