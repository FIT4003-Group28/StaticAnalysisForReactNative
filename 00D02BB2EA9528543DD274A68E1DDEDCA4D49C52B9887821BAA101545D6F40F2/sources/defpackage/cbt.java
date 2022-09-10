package defpackage;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: cbt  reason: default package */
/* loaded from: classes.dex */
public final class cbt<Data> implements cap<Uri, Data> {
    private static final Set<String> a = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));
    private final cap<cac, Data> b;

    public cbt(cap<cac, Data> capVar) {
        this.b = capVar;
    }

    @Override // defpackage.cap
    public final /* bridge */ /* synthetic */ boolean a(Uri uri) {
        return a.contains(uri.getScheme());
    }

    @Override // defpackage.cap
    public final /* bridge */ /* synthetic */ cao b(Uri uri, int i, int i2, bua buaVar) {
        return this.b.b(new cac(uri.toString()), i, i2, buaVar);
    }
}
