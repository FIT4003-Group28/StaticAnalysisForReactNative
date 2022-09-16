package defpackage;

import java.lang.reflect.InvocationTargetException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ancb  reason: default package */
/* loaded from: classes.dex */
public final class ancb {
    public static final ancd a;

    static {
        String[] strArr;
        strArr = ancd.d;
        a = a(strArr);
    }

    private static ancd a(String[] strArr) {
        ancd ancdVar;
        try {
            ancdVar = ancv.f();
        } catch (NoClassDefFoundError unused) {
            ancdVar = null;
        }
        if (ancdVar != null) {
            return ancdVar;
        }
        StringBuilder sb = new StringBuilder();
        for (String str : strArr) {
            try {
                return (ancd) Class.forName(str).getConstructor(new Class[0]).newInstance(new Object[0]);
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
