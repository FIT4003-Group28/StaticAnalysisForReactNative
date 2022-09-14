package defpackage;

import android.view.KeyEvent;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: cnfy  reason: default package */
/* loaded from: classes5.dex */
final class cnfy implements Callable<Boolean> {
    final /* synthetic */ KeyEvent a;
    final /* synthetic */ cngn b;

    public cnfy(cngn cngnVar, KeyEvent keyEvent) {
        this.b = cngnVar;
        this.a = keyEvent;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Boolean call() {
        return Boolean.valueOf(this.b.a.sendKeyEvent(this.a));
    }
}
