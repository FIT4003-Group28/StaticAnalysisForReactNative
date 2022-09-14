package defpackage;

import java.io.File;
import java.io.FileFilter;
/* compiled from: PG */
/* renamed from: el  reason: default package */
/* loaded from: classes.dex */
final class el implements FileFilter {
    final /* synthetic */ String a;

    public el(String str) {
        this.a = str;
    }

    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        String name = file.getName();
        return !name.startsWith(this.a) && !name.equals("MultiDex.lock");
    }
}
