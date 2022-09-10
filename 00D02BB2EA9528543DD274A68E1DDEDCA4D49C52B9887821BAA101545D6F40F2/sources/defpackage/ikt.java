package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ikt  reason: default package */
/* loaded from: classes6.dex */
public final class ikt {
    private final iki a;
    private final ikq b;

    public ikt(iki ikiVar, ikq ikqVar) {
        this.a = ikiVar;
        this.b = ikqVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a() {
        return this.a.getPaddingLeft() + ((ijw) this.b).c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int b() {
        return (this.a.getMeasuredWidth() - this.a.getPaddingRight()) - ((ijw) this.b).c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int c() {
        return b() - a();
    }
}
