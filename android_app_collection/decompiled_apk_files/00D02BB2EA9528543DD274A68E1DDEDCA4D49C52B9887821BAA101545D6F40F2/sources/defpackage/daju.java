package defpackage;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: daju  reason: default package */
/* loaded from: classes5.dex */
public final class daju implements dajp {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(ClassLoader classLoader, Set<File> set) {
        if (set.isEmpty()) {
            return;
        }
        HashSet hashSet = new HashSet();
        for (File file : set) {
            if (String.valueOf(file.getParentFile().getAbsolutePath()).length() == 0) {
                new String("Adding native library parent directory: ");
            }
            hashSet.add(file.getParentFile());
        }
        dakj d = dakl.d(e(classLoader), "nativeLibraryDirectories", File.class);
        hashSet.removeAll(Arrays.asList((File[]) d.c()));
        synchronized (dakx.class) {
            int size = hashSet.size();
            StringBuilder sb = new StringBuilder(30);
            sb.append("Adding directories ");
            sb.append(size);
            sb.toString();
            d.b(hashSet);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean d(ClassLoader classLoader, File file, File file2, boolean z, dajt dajtVar, String str, dajs dajsVar) {
        ArrayList<IOException> arrayList = new ArrayList<>();
        Object e = e(classLoader);
        dakj d = dakl.d(e, "dexElements", Object.class);
        List<Object> asList = Arrays.asList(d.c());
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : asList) {
            arrayList2.add((File) dakl.c(obj, str, File.class).c());
        }
        if (arrayList2.contains(file2)) {
            return true;
        }
        if (z || dajsVar.a(e, file2, file)) {
            d.a(Arrays.asList(dajtVar.a(e, new ArrayList<>(Collections.singleton(file2)), file, arrayList)));
            if (arrayList.isEmpty()) {
                return true;
            }
            daki dakiVar = new daki("DexPathList.makeDexElement failed");
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                deki.a(dakiVar, arrayList.get(i));
            }
            dakl.d(e, "dexElementsSuppressedExceptions", IOException.class).a(arrayList);
            throw dakiVar;
        }
        if (String.valueOf(file2.getPath()).length() == 0) {
            new String("Should be optimized ");
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object e(ClassLoader classLoader) {
        return dakl.c(classLoader, "pathList", Object.class).c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static dajt f() {
        return new dajq();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static dajs g() {
        return new dajr();
    }

    @Override // defpackage.dajp
    public final void a(ClassLoader classLoader, Set<File> set) {
        c(classLoader, set);
    }

    @Override // defpackage.dajp
    public final boolean b(ClassLoader classLoader, File file, File file2, boolean z) {
        return d(classLoader, file, file2, z, f(), "zip", g());
    }
}
