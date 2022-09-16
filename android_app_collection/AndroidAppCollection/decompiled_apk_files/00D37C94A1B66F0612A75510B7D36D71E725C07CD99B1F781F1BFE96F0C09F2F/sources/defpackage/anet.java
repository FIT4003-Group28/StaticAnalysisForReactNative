package defpackage;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: anet  reason: default package */
/* loaded from: classes.dex */
public final class anet implements FilenameFilter {
    private final Pattern a;

    public anet(Pattern pattern) {
        pattern.getClass();
        this.a = pattern;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return this.a.matcher(str).matches();
    }
}
