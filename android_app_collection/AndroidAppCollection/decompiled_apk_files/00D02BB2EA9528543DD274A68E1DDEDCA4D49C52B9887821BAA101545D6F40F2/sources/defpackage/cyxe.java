package defpackage;

import android.os.Looper;
/* compiled from: PG */
/* renamed from: cyxe  reason: default package */
/* loaded from: classes5.dex */
public final class cyxe {
    public static final void a() {
        dbsk.m(Looper.getMainLooper().getThread() != Thread.currentThread(), "This method should not be called on a UI thread.");
    }
}
