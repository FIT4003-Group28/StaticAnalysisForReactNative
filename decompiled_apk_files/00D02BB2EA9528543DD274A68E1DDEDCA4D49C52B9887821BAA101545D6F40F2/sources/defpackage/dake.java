package defpackage;

import java.io.File;
import java.util.Set;
/* compiled from: PG */
/* renamed from: dake  reason: default package */
/* loaded from: classes5.dex */
public final class dake implements dajp {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(ClassLoader classLoader, Set<File> set) {
        dajz.c(classLoader, set, new dakc());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean d(ClassLoader classLoader, File file, File file2, boolean z) {
        return daju.d(classLoader, file, file2, z, dajz.d(), "path", new dakd());
    }

    @Override // defpackage.dajp
    public final void a(ClassLoader classLoader, Set<File> set) {
        c(classLoader, set);
    }

    @Override // defpackage.dajp
    public final boolean b(ClassLoader classLoader, File file, File file2, boolean z) {
        return d(classLoader, file, file2, z);
    }
}
