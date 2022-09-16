package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: leo  reason: default package */
/* loaded from: classes7.dex */
public final class leo implements klt {
    final /* synthetic */ les a;

    public leo(les lesVar) {
        this.a = lesVar;
    }

    @Override // defpackage.klt
    public final void a(aste asteVar, int i) {
        ckhf ckhfVar;
        switch (i) {
            case 61953:
                ckhfVar = ckee.W;
                break;
            case 61954:
                ckhfVar = ckee.Y;
                break;
            case 61955:
            case 61957:
            case 61958:
            default:
                ckhfVar = null;
                break;
            case 61956:
                ckhfVar = ckee.V;
                break;
            case 61959:
                ckhfVar = ckee.X;
                break;
        }
        if (ckhfVar != null) {
            kty.a(this.a.c, ckhfVar);
        }
        this.a.NY(asteVar, mnz.SEARCH_CATEGORICAL_FREENAV);
    }
}
