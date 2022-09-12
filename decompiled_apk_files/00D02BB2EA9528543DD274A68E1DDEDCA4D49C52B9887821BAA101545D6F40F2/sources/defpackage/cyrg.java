package defpackage;

import java.io.File;
import java.io.FileFilter;
/* renamed from: cyrg  reason: default package */
/* loaded from: classes5.dex */
public final /* synthetic */ class cyrg implements FileFilter {
    public static final FileFilter a = new cyrg();

    private cyrg() {
    }

    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        return file.isDirectory();
    }
}
