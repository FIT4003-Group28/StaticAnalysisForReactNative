package defpackage;

import java.io.File;
import java.io.FilenameFilter;
/* renamed from: cyrd  reason: default package */
/* loaded from: classes5.dex */
public final /* synthetic */ class cyrd implements FilenameFilter {
    public static final FilenameFilter a = new cyrd();

    private cyrd() {
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return str.startsWith("TopNContacts");
    }
}
