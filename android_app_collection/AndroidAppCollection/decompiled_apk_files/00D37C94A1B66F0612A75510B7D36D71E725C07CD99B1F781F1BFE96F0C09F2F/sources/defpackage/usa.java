package defpackage;

import android.graphics.Bitmap;
/* compiled from: PG */
/* renamed from: usa  reason: default package */
/* loaded from: classes4.dex */
final class usa implements ankb {
    final /* synthetic */ boolean a;
    final /* synthetic */ long b;
    final /* synthetic */ usb c;
    final /* synthetic */ int d;
    private final String e;
    private final String f;

    public usa(usb usbVar, int i, boolean z, long j) {
        this.c = usbVar;
        this.d = i;
        this.a = z;
        this.b = j;
        this.e = urq.b(usbVar.c);
        String str = i != 32 ? i != 48 ? i != 64 ? i != 120 ? "null" : "LARGE" : "MEDIUM" : "SMALL" : "TINY";
        if (i != 0) {
            this.f = str;
            return;
        }
        throw null;
    }

    @Override // defpackage.ankb
    public final void a(Throwable th) {
        String T = zgd.T(th);
        usb usbVar = this.c;
        usbVar.a.b(this.e, this.f, T, usbVar.b, this.a);
        this.c.a.d(System.currentTimeMillis() - this.b, this.e, this.f, T, this.c.b, this.a);
    }

    @Override // defpackage.ankb
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        String str = ((Bitmap) obj) != null ? "OK" : "NULL";
        usb usbVar = this.c;
        usbVar.a.b(this.e, this.f, str, usbVar.b, this.a);
        this.c.a.d(System.currentTimeMillis() - this.b, this.e, this.f, str, this.c.b, this.a);
    }
}
