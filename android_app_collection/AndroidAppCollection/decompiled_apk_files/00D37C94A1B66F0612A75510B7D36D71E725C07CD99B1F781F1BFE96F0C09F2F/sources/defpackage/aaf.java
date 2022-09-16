package defpackage;

import android.support.v7.widget.Toolbar;
/* compiled from: PG */
/* renamed from: aaf  reason: default package */
/* loaded from: classes.dex */
public final class aaf implements Runnable {
    final /* synthetic */ Toolbar a;

    public aaf(Toolbar toolbar) {
        this.a = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.B();
    }
}
