package defpackage;

import java.io.File;
import java.io.FileFilter;
/* renamed from: avpm  reason: default package */
/* loaded from: classes.dex */
final /* synthetic */ class avpm implements FileFilter {
    static final FileFilter a = new avpm();

    private avpm() {
    }

    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        return avpn.j(file);
    }
}
