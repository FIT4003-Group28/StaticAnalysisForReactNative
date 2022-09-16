package defpackage;

import java.io.File;
import java.io.FileFilter;
/* renamed from: cyrf  reason: default package */
/* loaded from: classes5.dex */
public final /* synthetic */ class cyrf implements FileFilter {
    public static final FileFilter a = new cyrf();

    private cyrf() {
    }

    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        return file.isDirectory();
    }
}
