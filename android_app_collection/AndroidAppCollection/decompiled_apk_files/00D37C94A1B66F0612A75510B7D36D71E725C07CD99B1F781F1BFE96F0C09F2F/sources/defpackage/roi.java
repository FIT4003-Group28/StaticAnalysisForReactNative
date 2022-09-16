package defpackage;

import android.content.ComponentName;
/* compiled from: PG */
/* renamed from: roi  reason: default package */
/* loaded from: classes4.dex */
final class roi implements Runnable {
    final /* synthetic */ ComponentName a;
    final /* synthetic */ rol b;

    public roi(rol rolVar, ComponentName componentName) {
        this.b = rolVar;
        this.a = componentName;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.c.r(this.a);
    }
}
