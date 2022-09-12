package defpackage;
/* compiled from: PG */
/* renamed from: zgn  reason: default package */
/* loaded from: classes7.dex */
final class zgn extends zps {
    public String a;
    public Boolean b;
    public String c;
    private cqtd d;
    private CharSequence e;

    @Override // defpackage.zps
    public final void b(@dzsi cqtd cqtdVar) {
        this.d = cqtdVar;
    }

    @Override // defpackage.zps
    public final void c(CharSequence charSequence) {
        if (charSequence != null) {
            this.e = charSequence;
            return;
        }
        throw new NullPointerException("Null text");
    }

    @Override // defpackage.zps
    public final zpt a() {
        String str = this.b == null ? " isIconNarrow" : "";
        if (this.e == null) {
            str = str.concat(" text");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new zgo(this.d, this.a, this.b, this.e, this.c);
    }
}
