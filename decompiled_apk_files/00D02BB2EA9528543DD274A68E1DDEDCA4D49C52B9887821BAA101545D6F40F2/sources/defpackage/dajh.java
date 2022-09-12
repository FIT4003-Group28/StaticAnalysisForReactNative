package defpackage;

import android.content.Context;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dajh  reason: default package */
/* loaded from: classes5.dex */
public final class dajh implements Runnable {
    final /* synthetic */ Context a;

    public dajh(Context context) {
        this.a = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dalh.e(this.a).d();
    }
}
