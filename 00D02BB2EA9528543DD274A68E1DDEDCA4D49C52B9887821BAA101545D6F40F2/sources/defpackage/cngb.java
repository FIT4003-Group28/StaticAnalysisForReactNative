package defpackage;

import android.os.Bundle;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: cngb  reason: default package */
/* loaded from: classes5.dex */
final class cngb implements Callable<Boolean> {
    final /* synthetic */ String a;
    final /* synthetic */ Bundle b;
    final /* synthetic */ cngn c;

    public cngb(cngn cngnVar, String str, Bundle bundle) {
        this.c = cngnVar;
        this.a = str;
        this.b = bundle;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Boolean call() {
        return Boolean.valueOf(this.c.a.performPrivateCommand(this.a, this.b));
    }
}
