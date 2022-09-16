package defpackage;
/* compiled from: PG */
/* renamed from: aktb  reason: default package */
/* loaded from: classes.dex */
final class aktb implements aktc {
    private final /* synthetic */ int a;

    public aktb() {
    }

    public aktb(int i) {
        this.a = i;
    }

    @Override // defpackage.aktc
    public final int a() {
        return this.a != 0 ? 10000 : Integer.MAX_VALUE;
    }

    @Override // defpackage.aktc
    public final boolean b() {
        return this.a != 0;
    }
}
