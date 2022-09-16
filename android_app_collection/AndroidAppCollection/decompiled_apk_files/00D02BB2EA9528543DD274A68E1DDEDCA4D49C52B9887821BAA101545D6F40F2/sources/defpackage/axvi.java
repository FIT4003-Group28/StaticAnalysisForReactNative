package defpackage;
/* compiled from: PG */
/* renamed from: axvi  reason: default package */
/* loaded from: classes3.dex */
public class axvi implements axvd {
    private final ilo a;
    @dzsi
    private final jad b;
    @dzsi
    private final jad c;
    @dzsi
    private final CharSequence d;

    public axvi(ilo iloVar, @dzsi jad jadVar, @dzsi jad jadVar2, @dzsi CharSequence charSequence) {
        this.a = iloVar;
        this.b = jadVar;
        this.c = jadVar2;
        this.d = charSequence;
    }

    @Override // defpackage.axvd
    public String a() {
        StringBuilder sb = new StringBuilder(this.a.n());
        if (!this.a.A().isEmpty()) {
            sb.append("\n");
            dbrz.e("\n").m(sb, this.a.A());
        }
        return sb.toString();
    }

    @Override // defpackage.axvd
    @dzsi
    public CharSequence b() {
        return this.d;
    }

    @Override // defpackage.axvd
    public Boolean c() {
        return true;
    }

    @Override // defpackage.axvd
    @dzsi
    public jad d() {
        return this.b;
    }

    @Override // defpackage.axvd
    @dzsi
    public jad e() {
        return this.c;
    }
}
