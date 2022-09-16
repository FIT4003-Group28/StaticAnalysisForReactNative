package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: usb  reason: default package */
/* loaded from: classes4.dex */
public final class usb {
    public final upg a;
    public final String b;
    public final int c;
    private final uqe d;

    public usb(uqe uqeVar, int i, upg upgVar, String str) {
        this.d = uqeVar;
        this.a = upgVar;
        this.c = i;
        this.b = str;
    }

    public final ankt a(boolean z, String str, int i) {
        ankt f;
        long currentTimeMillis = System.currentTimeMillis();
        if (z) {
            f = this.d.e(str, i);
        } else {
            f = this.d.f(str, i);
        }
        amnt.g(f, new usa(this, i, z, currentTimeMillis), anjk.a);
        return f;
    }
}
