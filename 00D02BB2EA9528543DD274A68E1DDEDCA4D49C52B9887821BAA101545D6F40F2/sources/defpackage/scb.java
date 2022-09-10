package defpackage;
/* compiled from: PG */
/* renamed from: scb  reason: default package */
/* loaded from: classes7.dex */
public class scb extends sca implements sae {
    private final cqkn<sae> g;
    private boolean h;

    public scb(@dzsi cqtd cqtdVar, String str, CharSequence charSequence, cqkn<sae> cqknVar, ddho ddhoVar) {
        super(null, str, null, ddhoVar);
        this.b = charSequence;
        this.h = true;
        this.g = cqknVar;
    }

    public scb C(boolean z) {
        this.h = z;
        return this;
    }

    public scb D(boolean z) {
        this.e = false;
        return this;
    }

    @Override // defpackage.sae
    public Boolean o() {
        return Boolean.valueOf(this.h);
    }

    @Override // defpackage.sae
    public /* bridge */ /* synthetic */ sae p(boolean z) {
        C(z);
        return this;
    }

    @Override // defpackage.sae
    public cqkn<sae> q() {
        return this.g;
    }
}
