package defpackage;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
/* compiled from: PG */
/* renamed from: azrg  reason: default package */
/* loaded from: classes2.dex */
public abstract class azrg implements Serializable, azqy, azrj {
    private final azqy completion;

    public azrg(azqy azqyVar) {
        this.completion = azqyVar;
    }

    public azqy create(Object obj, azqy azqyVar) {
        azqyVar.getClass();
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    @Override // defpackage.azrj
    public azrj getCallerFrame() {
        azqy azqyVar = this.completion;
        if (true != (azqyVar instanceof azrj)) {
            azqyVar = null;
        }
        return (azrj) azqyVar;
    }

    public final azqy getCompletion() {
        return this.completion;
    }

    @Override // defpackage.azrj
    public StackTraceElement getStackTraceElement() {
        int i;
        String str;
        Method method;
        Object invoke;
        Method method2;
        Object invoke2;
        azrk azrkVar = (azrk) getClass().getAnnotation(azrk.class);
        String str2 = null;
        if (azrkVar != null) {
            int a = azrkVar.a();
            if (a <= 1) {
                int i2 = -1;
                try {
                    Field declaredField = getClass().getDeclaredField("label");
                    declaredField.getClass();
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(this);
                    if (true != (obj instanceof Integer)) {
                        obj = null;
                    }
                    Integer num = (Integer) obj;
                    i = (num != null ? num.intValue() : 0) - 1;
                } catch (Exception unused) {
                    i = -1;
                }
                if (i >= 0) {
                    i2 = azrkVar.e()[i];
                }
                azrl azrlVar = azrm.b;
                if (azrlVar == null) {
                    try {
                        azrl azrlVar2 = new azrl(Class.class.getDeclaredMethod("getModule", new Class[0]), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
                        azrm.b = azrlVar2;
                        azrlVar = azrlVar2;
                    } catch (Exception unused2) {
                        azrlVar = azrm.a;
                        azrm.b = azrlVar;
                    }
                }
                if (azrlVar != azrm.a && (method = azrlVar.a) != null && (invoke = method.invoke(getClass(), new Object[0])) != null && (method2 = azrlVar.b) != null && (invoke2 = method2.invoke(invoke, new Object[0])) != null) {
                    Method method3 = azrlVar.c;
                    Object invoke3 = method3 != null ? method3.invoke(invoke2, new Object[0]) : null;
                    if (true == (invoke3 instanceof String)) {
                        str2 = invoke3;
                    }
                    str2 = str2;
                }
                if (str2 == null) {
                    str = azrkVar.b();
                } else {
                    str = str2 + '/' + azrkVar.b();
                }
                return new StackTraceElement(str, azrkVar.d(), azrkVar.c(), i2);
            }
            throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + a + ". Please update the Kotlin standard library.").toString());
        }
        return null;
    }

    protected abstract Object invokeSuspend(Object obj);

    protected void releaseIntercepted() {
    }

    @Override // defpackage.azqy
    public final void resumeWith(Object obj) {
        azrg azrgVar = this;
        while (true) {
            azqy azqyVar = azrgVar.completion;
            azqyVar.getClass();
            try {
                obj = azrgVar.invokeSuspend(obj);
                if (obj == azrf.COROUTINE_SUSPENDED) {
                    return;
                }
            } catch (Throwable th) {
                obj = azqj.p(th);
            }
            azrgVar.releaseIntercepted();
            if (azqyVar instanceof azrg) {
                azrgVar = (azrg) azqyVar;
            } else {
                azqyVar.resumeWith(obj);
                return;
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }

    public azqy create(azqy azqyVar) {
        azqyVar.getClass();
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }
}
