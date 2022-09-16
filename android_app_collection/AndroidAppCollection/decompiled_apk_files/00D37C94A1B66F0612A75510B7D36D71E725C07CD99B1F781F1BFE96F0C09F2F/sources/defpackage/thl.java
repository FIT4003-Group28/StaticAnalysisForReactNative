package defpackage;

import android.os.Looper;
/* compiled from: PG */
/* renamed from: thl  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class thl {
    static {
        thm thmVar = thm.b;
    }

    public static /* synthetic */ akvy a() {
        return new akvy(Looper.getMainLooper().getThread() == Thread.currentThread(), Thread.currentThread().getId());
    }
}
