package defpackage;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: cof  reason: default package */
/* loaded from: classes2.dex */
public final class cof implements cnq {
    private static final Set a = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "android.resource", "content")));
    private final coe b;

    public cof(coe coeVar) {
        this.b = coeVar;
    }

    @Override // defpackage.cnq
    public final /* bridge */ /* synthetic */ cnp a(Object obj, int i, int i2, cic cicVar) {
        Uri uri = (Uri) obj;
        return new cnp(new cup(uri), this.b.a(uri));
    }

    @Override // defpackage.cnq
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        return a.contains(((Uri) obj).getScheme());
    }
}
