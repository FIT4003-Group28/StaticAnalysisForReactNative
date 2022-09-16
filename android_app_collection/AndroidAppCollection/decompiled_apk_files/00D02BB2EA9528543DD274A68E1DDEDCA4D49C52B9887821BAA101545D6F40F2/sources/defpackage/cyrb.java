package defpackage;

import java.io.File;
import java.io.FilenameFilter;
/* renamed from: cyrb  reason: default package */
/* loaded from: classes5.dex */
public final /* synthetic */ class cyrb implements FilenameFilter {
    public static final FilenameFilter a = new cyrb();

    private cyrb() {
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return str.startsWith("TopNContactsGrpc");
    }
}
