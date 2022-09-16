package defpackage;
/* compiled from: PG */
/* renamed from: lyb  reason: default package */
/* loaded from: classes3.dex */
public final class lyb {
    public final int a;
    private final lya b;

    public lyb(lya lyaVar, int i) {
        this.b = lyaVar;
        this.a = i;
    }

    public final int a() {
        lya lyaVar = this.b;
        return ((Integer) lyaVar.a.get(this.a)).intValue();
    }
}
