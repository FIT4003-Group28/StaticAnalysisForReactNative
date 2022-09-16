package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fyp  reason: default package */
/* loaded from: classes6.dex */
public final class fyp<T> implements dzsj<T> {
    final /* synthetic */ fyq a;
    private final int b;

    public fyp(fyq fyqVar, int i) {
        this.a = fyqVar;
        this.b = i;
    }

    @Override // defpackage.dzsj
    public final T a() {
        int i = this.b;
        if (i == 0) {
            fyq fyqVar = this.a;
            dzsj<bzfw> a = fyqVar.a();
            dzsj dzsjVar = fyqVar.a;
            if (dzsjVar == null) {
                dzsjVar = new fyp(fyqVar, 2);
                fyqVar.a = dzsjVar;
            }
            return (T) new bzfm(a, dzsjVar, fyqVar.c.c(), fyqVar.e(), fyqVar.c.v.K());
        } else if (i == 1) {
            return (T) this.a.j();
        } else {
            if (i == 2) {
                fyq fyqVar2 = this.a;
                return (T) new bzdv(fyqVar2.a(), fyqVar2.b(), fyqVar2.f(), fyqVar2.c(), fyqVar2.c.c(), fyqVar2.e(), fyqVar2.c.v.K(), fyqVar2.c.v.aw(), fyqVar2.c.v.V());
            } else if (i == 3) {
                fyq fyqVar3 = this.a;
                return (T) new bzej(fyqVar3.b, fyqVar3.a(), fyqVar3.b(), fyqVar3.c(), fyqVar3.c.c(), fyqVar3.e(), fyqVar3.c.v.K());
            } else if (i == 4) {
                return (T) new bzdn(this.a.b);
            } else {
                if (i != 5) {
                    return (T) this.a.h();
                }
                fyq fyqVar4 = this.a;
                return (T) new bzfj(fyqVar4.g(), fyqVar4.c.h(), fyqVar4.d());
            }
        }
    }
}
