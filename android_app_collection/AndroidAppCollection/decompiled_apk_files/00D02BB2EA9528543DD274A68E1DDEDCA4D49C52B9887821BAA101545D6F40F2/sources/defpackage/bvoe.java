package defpackage;

import android.content.Context;
import java.io.File;
/* compiled from: PG */
/* renamed from: bvoe  reason: default package */
/* loaded from: classes.dex */
public final class bvoe implements Runnable {
    final /* synthetic */ Context a;

    public bvoe(Context context) {
        this.a = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        File n;
        File n2;
        File n3;
        n = bvog.n(this.a, false, "testdata", false);
        n.mkdir();
        n2 = bvog.n(this.a, true, "testdata", false);
        n2.mkdir();
        n3 = bvog.n(this.a, false, "cache", false);
        n3.mkdir();
    }
}
