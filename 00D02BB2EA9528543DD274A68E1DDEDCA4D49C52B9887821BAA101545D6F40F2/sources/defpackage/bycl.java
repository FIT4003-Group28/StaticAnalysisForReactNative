package defpackage;

import android.os.Bundle;
/* compiled from: PG */
/* renamed from: bycl  reason: default package */
/* loaded from: classes4.dex */
final class bycl implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ bycn b;

    public bycl(bycn bycnVar, String str) {
        this.b = bycnVar;
        this.a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a.w();
        gga ggaVar = this.b.a;
        String str = this.a;
        byck byckVar = new byck();
        Bundle bundle = new Bundle();
        bundle.putString("killSwitchContentUrl", str);
        byckVar.B(bundle);
        ggaVar.D(byckVar);
    }
}
