package defpackage;
/* compiled from: PG */
/* renamed from: advu  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class advu implements ylw {
    public final /* synthetic */ advw a;
    private final /* synthetic */ int b;

    public /* synthetic */ advu(advw advwVar, int i) {
        this.b = i;
        this.a = advwVar;
    }

    @Override // defpackage.ylw, defpackage.zdt
    public final void a(Object obj) {
        if (this.b == 0) {
            advw advwVar = this.a;
            Void r5 = (Void) obj;
            advwVar.e.g();
            int[] iArr = advwVar.c;
            iArr[0] = iArr[0] + 1;
            advwVar.e.e(iArr, advwVar.d, 2);
            advwVar.b();
            return;
        }
        advw advwVar2 = this.a;
        Void r52 = (Void) obj;
        advwVar2.e.g();
        int[] iArr2 = advwVar2.d;
        if (iArr2[0] == 0) {
            iArr2[0] = 1;
        }
        advwVar2.e.e(advwVar2.c, iArr2, 1);
        advwVar2.b();
    }
}
