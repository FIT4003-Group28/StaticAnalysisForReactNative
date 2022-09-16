package defpackage;

import android.graphics.Typeface;
/* compiled from: PG */
/* renamed from: akr  reason: default package */
/* loaded from: classes.dex */
final class akr implements Runnable {
    final /* synthetic */ ale a;
    final /* synthetic */ Typeface b;

    public akr(ale aleVar, Typeface typeface) {
        this.a = aleVar;
        this.b = typeface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ale aleVar = this.a;
        Typeface typeface = this.b;
        gt gtVar = aleVar.a;
        if (gtVar != null) {
            gtVar.a(typeface);
        }
    }
}
