package defpackage;

import com.google.android.libraries.geller.portable.Geller;
import java.io.File;
import java.io.FileFilter;
/* renamed from: cqzg  reason: default package */
/* loaded from: classes5.dex */
public final /* synthetic */ class cqzg implements FileFilter {
    public static final FileFilter a = new cqzg();

    private cqzg() {
    }

    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        int i = Geller.g;
        return file.getName().startsWith("portable_geller_") && file.getName().endsWith(".db");
    }
}
