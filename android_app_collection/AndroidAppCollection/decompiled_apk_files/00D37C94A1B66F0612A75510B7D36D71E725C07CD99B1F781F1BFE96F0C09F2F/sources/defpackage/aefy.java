package defpackage;

import android.os.Looper;
/* compiled from: PG */
/* renamed from: aefy  reason: default package */
/* loaded from: classes.dex */
final class aefy extends Thread {
    final /* synthetic */ aefz a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aefy(aefz aefzVar) {
        super("mediaDash");
        this.a = aefzVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Looper.prepare();
        this.a.c();
        Looper.loop();
    }
}
