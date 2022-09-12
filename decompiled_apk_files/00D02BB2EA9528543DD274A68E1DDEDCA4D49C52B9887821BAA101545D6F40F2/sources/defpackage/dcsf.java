package defpackage;

import java.lang.reflect.InvocationTargetException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dcsf  reason: default package */
/* loaded from: classes.dex */
public final class dcsf {
    public static final dcsh a;

    static {
        String[] strArr;
        strArr = dcsh.d;
        a = a(strArr);
    }

    private static dcsh a(String[] strArr) {
        dcsh dcshVar;
        try {
            dcshVar = dcsi.a();
        } catch (NoClassDefFoundError unused) {
            dcshVar = null;
        }
        if (dcshVar != null) {
            return dcshVar;
        }
        StringBuilder sb = new StringBuilder();
        for (String str : strArr) {
            try {
                return (dcsh) Class.forName(str).getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Throwable th) {
                th = th;
                if (th instanceof InvocationTargetException) {
                    th = th.getCause();
                }
                sb.append('\n');
                sb.append(str);
                sb.append(": ");
                sb.append(th);
            }
        }
        throw new IllegalStateException(sb.insert(0, "No logging platforms found:").toString());
    }
}
