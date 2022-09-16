package defpackage;

import android.graphics.Bitmap;
/* compiled from: PG */
/* renamed from: acnd  reason: default package */
/* loaded from: classes.dex */
public final class acnd implements Runnable {
    final /* synthetic */ Bitmap a;
    final /* synthetic */ acne b;

    public acnd(acne acneVar, Bitmap bitmap) {
        this.b = acneVar;
        this.a = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        abrk abrkVar = this.b.e;
        ((acgk) abrkVar).a.a.aI(this.a);
    }
}
