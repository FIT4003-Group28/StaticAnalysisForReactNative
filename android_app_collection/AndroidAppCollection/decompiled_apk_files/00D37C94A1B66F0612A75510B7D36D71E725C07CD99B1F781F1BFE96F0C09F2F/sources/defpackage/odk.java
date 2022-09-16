package defpackage;
/* compiled from: PG */
/* renamed from: odk  reason: default package */
/* loaded from: classes3.dex */
public final class odk implements akad {
    private final /* synthetic */ int a;

    public odk() {
    }

    public odk(int i) {
        this.a = i;
    }

    public static boolean d(Object obj) {
        return (obj instanceof auxg) || (obj instanceof apvm);
    }

    @Override // defpackage.akad
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.akad
    public final ampt e() {
        int i = this.a;
        if (i != 0) {
            return i != 1 ? mem.m : mem.k;
        }
        return ampu.NOT_NULL;
    }

    @Override // defpackage.akad
    public final /* bridge */ /* synthetic */ void b(Object obj, akac akacVar) {
        aoqu k;
        aoqu b;
        int i = this.a;
        if (i == 0) {
            aunb aunbVar = (aunb) obj;
            if (aunbVar == null || (k = ajjh.k(aunbVar)) == null) {
                return;
            }
            akacVar.a(k);
        } else if (i == 1) {
            aslt asltVar = (aslt) obj;
        } else {
            aslt asltVar2 = (aslt) obj;
            if (asltVar2 == null || (b = aakx.b(asltVar2)) == null) {
                return;
            }
            akacVar.a(b);
        }
    }
}
