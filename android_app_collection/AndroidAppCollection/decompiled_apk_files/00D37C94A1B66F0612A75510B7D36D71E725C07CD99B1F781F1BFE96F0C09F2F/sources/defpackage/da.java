package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: da  reason: default package */
/* loaded from: classes3.dex */
public class da {
    public final fx a;
    public final akl b;

    public da(fx fxVar, akl aklVar) {
        this.a = fxVar;
        this.b = aklVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        fx fxVar = this.a;
        if (!fxVar.b.remove(this.b) || !fxVar.b.isEmpty()) {
            return;
        }
        fxVar.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean c() {
        int D = iy.D(this.a.a.O);
        int i = this.a.e;
        return D == i || !(D == 2 || i == 2);
    }
}
