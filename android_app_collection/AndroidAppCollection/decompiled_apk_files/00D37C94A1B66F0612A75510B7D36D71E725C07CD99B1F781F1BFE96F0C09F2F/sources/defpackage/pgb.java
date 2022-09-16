package defpackage;

import com.google.android.exoplayer.MediaFormat;
/* compiled from: PG */
/* renamed from: pgb  reason: default package */
/* loaded from: classes4.dex */
final class pgb implements Runnable {
    final /* synthetic */ MediaFormat a;
    final /* synthetic */ pgd b;

    public pgb(pgd pgdVar, MediaFormat mediaFormat) {
        this.b = pgdVar;
        this.a = mediaFormat;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.b.g(this.a);
    }
}
