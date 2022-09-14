package defpackage;

import java.io.File;
import java.io.FileFilter;
/* renamed from: cyre  reason: default package */
/* loaded from: classes5.dex */
public final /* synthetic */ class cyre implements FileFilter {
    public static final FileFilter a = new cyre();

    private cyre() {
    }

    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        return file.isDirectory() && file.getName().equals("peopleCache");
    }
}
