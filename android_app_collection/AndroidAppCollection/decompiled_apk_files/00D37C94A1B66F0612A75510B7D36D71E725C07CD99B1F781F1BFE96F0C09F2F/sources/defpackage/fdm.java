package defpackage;
/* compiled from: PG */
/* renamed from: fdm  reason: default package */
/* loaded from: classes3.dex */
public abstract class fdm implements feg {
    private final feh a;
    private boolean b;

    public fdm(feh fehVar) {
        this.a = fehVar;
    }

    public void nJ() {
        if (this.b) {
            return;
        }
        if (this.a.b) {
            nr();
        }
        this.a.a(this);
        this.b = true;
    }
}
