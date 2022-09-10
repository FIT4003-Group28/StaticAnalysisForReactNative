package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: earu  reason: default package */
/* loaded from: classes6.dex */
public final class earu extends IllegalArgumentException {
    private static final long serialVersionUID = -5924689995607498581L;
    final /* synthetic */ earv a;
    private final boolean b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public earu(earv earvVar, String str, boolean z) {
        super(str);
        this.a = earvVar;
        this.b = z;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        StringBuffer stringBuffer = new StringBuffer(85);
        stringBuffer.append("The");
        String message = super.getMessage();
        if (message != null) {
            stringBuffer.append(' ');
            stringBuffer.append(message);
        }
        stringBuffer.append(" instant is ");
        eatp b = eaul.g.b(this.a.a);
        if (this.b) {
            stringBuffer.append("below the supported minimum of ");
            b.e(stringBuffer, this.a.E.a);
        } else {
            stringBuffer.append("above the supported maximum of ");
            b.e(stringBuffer, this.a.F.a);
        }
        stringBuffer.append(" (");
        stringBuffer.append(this.a.a);
        stringBuffer.append(')');
        return stringBuffer.toString();
    }

    @Override // java.lang.Throwable
    public final String toString() {
        String valueOf = String.valueOf(getMessage());
        return valueOf.length() != 0 ? "IllegalArgumentException: ".concat(valueOf) : new String("IllegalArgumentException: ");
    }
}
