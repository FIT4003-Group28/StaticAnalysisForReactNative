package defpackage;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: dajz  reason: default package */
/* loaded from: classes5.dex */
public final class dajz implements dajp {
    public static void c(ClassLoader classLoader, Set<File> set, dajy dajyVar) {
        if (set.isEmpty()) {
            return;
        }
        HashSet hashSet = new HashSet();
        for (File file : set) {
            hashSet.add(file.getParentFile());
        }
        Object e = daju.e(classLoader);
        dakk c = dakl.c(e, "nativeLibraryDirectories", List.class);
        synchronized (dakx.class) {
            ArrayList arrayList = new ArrayList((Collection) c.c());
            hashSet.removeAll(arrayList);
            arrayList.addAll(hashSet);
            c.d(arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        Object[] a = dajyVar.a(e, new ArrayList(hashSet), arrayList2);
        if (!arrayList2.isEmpty()) {
            daki dakiVar = new daki("Error in makePathElements");
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                deki.a(dakiVar, arrayList2.get(i));
            }
            throw dakiVar;
        }
        synchronized (dakx.class) {
            dakl.d(e, "nativeLibraryPathElements", Object.class).b(Arrays.asList(a));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static dajt d() {
        return new dajw();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static dajy e() {
        return new dajx();
    }

    public static boolean f(ClassLoader classLoader, File file, File file2, boolean z) {
        return daju.d(classLoader, file, file2, z, d(), "zip", daju.g());
    }

    @Override // defpackage.dajp
    public final void a(ClassLoader classLoader, Set<File> set) {
        c(classLoader, set, e());
    }

    @Override // defpackage.dajp
    public final boolean b(ClassLoader classLoader, File file, File file2, boolean z) {
        return f(classLoader, file, file2, z);
    }
}
