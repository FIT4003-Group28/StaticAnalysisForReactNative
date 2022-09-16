package defpackage;

import android.util.Log;
import java.lang.Thread;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aceq  reason: default package */
/* loaded from: classes.dex */
public final class aceq implements Thread.UncaughtExceptionHandler {
    final /* synthetic */ acer a;

    public aceq(acer acerVar) {
        this.a = acerVar;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        Log.e("CameraPreviewCtrl", "Uncaught exception while camera session is active.", th);
        acer acerVar = this.a;
        if (!acerVar.b) {
            acerVar.b = true;
            acerVar.e.c(true);
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.a.d;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }
}
