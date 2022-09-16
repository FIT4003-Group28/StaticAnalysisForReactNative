package defpackage;

import android.text.TextUtils;
import java.io.File;
import java.io.FileFilter;
/* renamed from: cyrc  reason: default package */
/* loaded from: classes5.dex */
public final /* synthetic */ class cyrc implements FileFilter {
    public static final FileFilter a = new cyrc();

    private cyrc() {
    }

    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        return file.isDirectory() && TextUtils.isDigitsOnly(file.getName());
    }
}
