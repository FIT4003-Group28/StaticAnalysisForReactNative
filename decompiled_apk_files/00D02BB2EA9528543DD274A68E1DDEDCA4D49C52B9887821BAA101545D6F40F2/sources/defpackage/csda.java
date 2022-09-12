package defpackage;

import android.widget.Toast;
/* compiled from: PG */
/* renamed from: csda  reason: default package */
/* loaded from: classes5.dex */
final class csda implements Runnable {
    final /* synthetic */ boolean a;
    final /* synthetic */ boolean b;
    final /* synthetic */ csdd c;

    public csda(csdd csddVar, boolean z, boolean z2) {
        this.c = csddVar;
        this.a = z;
        this.b = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.a();
        aumj aumjVar = (aumj) this.c.a;
        dkps dkpsVar = aumjVar.c;
        if ((dkpsVar.a & 8) != 0) {
            Toast.makeText(aumjVar.b, dkpsVar.d, 1).show();
        }
        aumjVar.a.a(aumjVar.d, 3, 0);
        aumjVar.b.finish();
    }
}
