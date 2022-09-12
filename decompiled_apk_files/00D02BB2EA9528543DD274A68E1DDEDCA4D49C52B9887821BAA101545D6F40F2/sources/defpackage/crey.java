package defpackage;
/* compiled from: PG */
/* renamed from: crey  reason: default package */
/* loaded from: classes5.dex */
public final class crey extends crez {
    final /* synthetic */ crfc a;
    private final int c;
    @dzsi
    private final Integer d;

    public crey(crfc crfcVar, float f, @dzsi int i, Integer num) {
        this(crfcVar, (int) f, i, num);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.crez
    public final String a(int i) {
        String quantityString;
        Integer num = this.d;
        if (num == null) {
            return this.a.a.getString(this.c);
        }
        quantityString = this.a.a.getResources().getQuantityString(this.c, num.intValue(), String.valueOf(this.d));
        return quantityString;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public crey(crfc crfcVar, int i, @dzsi int i2, Integer num) {
        super(i);
        this.a = crfcVar;
        this.c = i2;
        this.d = num;
    }
}
