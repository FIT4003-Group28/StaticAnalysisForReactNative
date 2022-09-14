package defpackage;
/* compiled from: PG */
/* renamed from: aapi  reason: default package */
/* loaded from: classes2.dex */
public class aapi implements aapd {
    private final drlo a;
    private final Runnable b;
    private boolean c = false;

    public aapi(drlo drloVar, Runnable runnable) {
        this.a = drloVar;
        this.b = runnable;
    }

    @Override // defpackage.aapd
    public CharSequence a() {
        return this.a.a;
    }

    @Override // defpackage.aapd
    public cqkl b() {
        this.b.run();
        return cqkl.a;
    }

    @Override // defpackage.aapd
    public Boolean c() {
        return Boolean.valueOf(this.c);
    }

    @Override // defpackage.aapd
    public void d(boolean z) {
        this.c = z;
    }
}
