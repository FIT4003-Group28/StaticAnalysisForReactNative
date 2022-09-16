package defpackage;

import java.io.FileDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* compiled from: PG */
/* renamed from: bacv  reason: default package */
/* loaded from: classes2.dex */
public final class bacv {
    private static final Method a;

    public static FileDescriptor a(int i) {
        try {
            FileDescriptor fileDescriptor = new FileDescriptor();
            a.invoke(fileDescriptor, Integer.valueOf(i));
            return fileDescriptor;
        } catch (IllegalAccessException e) {
            throw new RuntimeException("FileDescriptor.setInt$() failed", e);
        } catch (InvocationTargetException e2) {
            throw new RuntimeException("FileDescriptor.setInt$() failed", e2);
        }
    }

    static {
        try {
            a = FileDescriptor.class.getMethod("setInt$", Integer.TYPE);
        } catch (NoSuchMethodException | SecurityException e) {
            throw new RuntimeException("Unable to get FileDescriptor.setInt$", e);
        }
    }
}
