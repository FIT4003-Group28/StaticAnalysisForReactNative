package defpackage;

import java.io.File;
import java.io.FileFilter;
/* compiled from: PG */
/* renamed from: aaht  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class aaht implements FileFilter {
    public final /* synthetic */ String a;
    private final /* synthetic */ int b;

    public aaht(String str, int i) {
        this.b = i;
        this.a = str;
    }

    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        if (this.b == 0) {
            return file.getName().contains(this.a);
        }
        String name = file.getName();
        return !name.startsWith(this.a) && !name.equals("MultiDex.lock");
    }
}
