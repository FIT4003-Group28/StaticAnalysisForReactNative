package defpackage;

import dalvik.system.VMStack;
/* compiled from: PG */
/* renamed from: ancl  reason: default package */
/* loaded from: classes.dex */
class ancl extends ancc {
    @Override // defpackage.ancc
    public anah a(Class cls, int i) {
        return anah.a;
    }

    @Override // defpackage.ancc
    public String b(Class cls) {
        boolean z;
        boolean z2;
        StackTraceElement a;
        z = ancn.a;
        if (z) {
            try {
                if (cls.equals(ancn.p())) {
                    return VMStack.getStackClass2().getName();
                }
            } catch (Throwable unused) {
            }
        }
        z2 = ancn.b;
        if (!z2 || (a = andp.a(cls)) == null) {
            return null;
        }
        return a.getClassName();
    }
}
