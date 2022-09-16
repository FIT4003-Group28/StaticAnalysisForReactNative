package defpackage;

import java.io.File;
import java.io.FilenameFilter;
/* compiled from: PG */
/* renamed from: vcz  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class vcz implements FilenameFilter {
    public final /* synthetic */ String a;
    private final /* synthetic */ int b;

    public vcz(String str, int i) {
        this.b = i;
        this.a = str;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        if (this.b == 0) {
            return str.startsWith(this.a);
        }
        return str.startsWith(this.a);
    }
}
