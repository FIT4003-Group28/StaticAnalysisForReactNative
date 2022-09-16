package defpackage;

import android.os.Looper;
import com.google.android.libraries.youtube.edit.filters.ui.ChooseFilterView;
/* compiled from: PG */
/* renamed from: ztr  reason: default package */
/* loaded from: classes4.dex */
public final class ztr {
    public final ChooseFilterView a;
    public boolean b;
    public zub c;
    public hlq d;

    public ztr(ChooseFilterView chooseFilterView) {
        this.a = chooseFilterView;
    }

    private final void c(Runnable runnable) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            runnable.run();
        } else {
            this.a.post(runnable);
        }
    }

    public final void a() {
        c(new ztq(this, 1));
    }

    public final void b() {
        c(new ztq(this));
    }
}
