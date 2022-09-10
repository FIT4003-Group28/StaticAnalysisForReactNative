package defpackage;

import android.os.StrictMode;
/* renamed from: cxcu  reason: default package */
/* loaded from: classes5.dex */
final /* synthetic */ class cxcu implements Runnable {
    static final Runnable a = new cxcu();

    private cxcu() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.LAX);
    }
}
