package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aybj  reason: default package */
/* loaded from: classes2.dex */
public final class aybj implements aybq {
    private final /* synthetic */ int a;

    public aybj() {
    }

    public aybj(int i) {
        this.a = i;
    }

    @Override // defpackage.aybq
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        if (this.a == 0) {
            ((aybh) obj).d();
        } else {
            ((ayaj) obj).c();
        }
    }

    @Override // defpackage.aybq
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        if (this.a == 0) {
            ((aybh) obj).c();
        } else {
            ((ayaj) obj).d();
        }
    }
}
