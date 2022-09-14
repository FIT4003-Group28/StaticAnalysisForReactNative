package defpackage;
/* compiled from: PG */
/* renamed from: crfb  reason: default package */
/* loaded from: classes5.dex */
public final class crfb extends crez {
    final /* synthetic */ crfc a;
    private final float c;
    private final int d;

    public crfb(crfc crfcVar, int i) {
        this(crfcVar, 2092, i, 1609.344f);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.crez
    public final String a(int i) {
        String quantityString;
        int round = Math.round(i / this.c);
        quantityString = this.a.a.getResources().getQuantityString(this.d, round, Integer.valueOf(round));
        return quantityString;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public crfb(crfc crfcVar, int i, int i2, float f) {
        super(i);
        this.a = crfcVar;
        this.c = f;
        this.d = i2;
    }
}
