package defpackage;

import java.io.FileDescriptor;
import java.io.PrintWriter;
/* compiled from: PG */
/* renamed from: apd  reason: default package */
/* loaded from: classes.dex */
public abstract class apd {
    public static <T extends m & ax> apd a(T t) {
        return new api(t, t.NA());
    }

    @Deprecated
    public abstract void b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract <D> void c(int i, apc<D> apcVar);
}
