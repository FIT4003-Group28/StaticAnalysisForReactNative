package defpackage;

import java.io.File;
import java.io.FilenameFilter;
/* compiled from: PG */
/* renamed from: afjv  reason: default package */
/* loaded from: classes.dex */
public final class afjv implements FilenameFilter {
    private final /* synthetic */ int c;
    public static final /* synthetic */ afjv b = new afjv(3);
    public static final /* synthetic */ afjv a = new afjv(1);

    public afjv() {
    }

    public /* synthetic */ afjv(int i) {
        this.c = i;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        int i = this.c;
        if (i == 0) {
            return afjw.a.matcher(str).matches() || afjw.b.matcher(str).matches();
        } else if (i != 1) {
            return i != 2 ? str.endsWith(".tmp") || str.endsWith(".rm") : !str.equals("cached_content_index.exi") && !afjw.a.matcher(str).matches() && !afjw.b.matcher(str).matches() && !afjw.c.matcher(str).matches();
        } else {
            int i2 = ykr.b;
            return str.endsWith(".cache");
        }
    }
}
