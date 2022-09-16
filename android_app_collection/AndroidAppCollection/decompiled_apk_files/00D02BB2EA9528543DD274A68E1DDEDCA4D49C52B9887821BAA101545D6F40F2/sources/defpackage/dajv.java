package defpackage;

import java.io.File;
import java.util.Set;
/* compiled from: PG */
/* renamed from: dajv  reason: default package */
/* loaded from: classes5.dex */
public final class dajv implements dajp {
    @Override // defpackage.dajp
    public final void a(ClassLoader classLoader, Set<File> set) {
        daju.c(classLoader, set);
    }

    @Override // defpackage.dajp
    public final boolean b(ClassLoader classLoader, File file, File file2, boolean z) {
        return daju.d(classLoader, file, file2, z, daju.f(), "zip", daju.g());
    }
}
