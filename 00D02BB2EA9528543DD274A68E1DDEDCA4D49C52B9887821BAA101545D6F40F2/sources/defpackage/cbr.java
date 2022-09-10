package defpackage;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: cbr  reason: default package */
/* loaded from: classes.dex */
public final class cbr<Data> implements cap<Uri, Data> {
    private static final Set<String> a = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "android.resource", "content")));
    private final cbp<Data> b;

    public cbr(cbp<Data> cbpVar) {
        this.b = cbpVar;
    }

    @Override // defpackage.cap
    public final /* bridge */ /* synthetic */ boolean a(Uri uri) {
        return a.contains(uri.getScheme());
    }

    @Override // defpackage.cap
    public final /* bridge */ /* synthetic */ cao b(Uri uri, int i, int i2, bua buaVar) {
        Uri uri2 = uri;
        return new cao(new ciy(uri2), this.b.c(uri2));
    }
}
