package defpackage;

import android.graphics.drawable.Drawable;
/* compiled from: PG */
/* renamed from: cwcc  reason: default package */
/* loaded from: classes5.dex */
public class cwcc extends cwcp {
    final z<dbsg<Integer>> a;
    final z<dbsg<Integer>> b;
    final z<dbsg<int[]>> c;
    final z<dbsg<String>> d;

    /* JADX INFO: Access modifiers changed from: protected */
    public cwcc(String str, Drawable drawable) {
        super(str, drawable);
        this.a = new z<>(dbpy.a);
        this.b = new z<>(dbpy.a);
        this.c = new z<>(dbpy.a);
        this.d = new z<>(dbpy.a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void b(int[] iArr) {
        cwip.a(this.c, dbsg.i(iArr));
    }
}
