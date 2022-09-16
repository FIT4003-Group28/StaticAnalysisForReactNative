package defpackage;
/* compiled from: PG */
/* renamed from: clh  reason: default package */
/* loaded from: classes2.dex */
public final class clh implements cla {
    private final /* synthetic */ int a;

    public clh() {
    }

    public clh(int i) {
        this.a = i;
    }

    @Override // defpackage.cla
    public final int b() {
        return this.a != 0 ? 1 : 4;
    }

    @Override // defpackage.cla
    public final /* bridge */ /* synthetic */ Object c(int i) {
        if (this.a == 0) {
            return new int[i];
        }
        return new byte[i];
    }

    @Override // defpackage.cla
    public final /* bridge */ /* synthetic */ int a(Object obj) {
        if (this.a == 0) {
            return ((int[]) obj).length;
        }
        return ((byte[]) obj).length;
    }
}
