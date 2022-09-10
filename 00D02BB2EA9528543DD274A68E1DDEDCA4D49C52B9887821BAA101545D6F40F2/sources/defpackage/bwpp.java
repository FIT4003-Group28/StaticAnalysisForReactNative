package defpackage;
/* compiled from: PG */
/* renamed from: bwpp  reason: default package */
/* loaded from: classes4.dex */
public abstract class bwpp implements bwoc {
    private final Boolean a = true;
    private final Boolean b;
    private final Boolean c;
    private final CharSequence d;
    @dzsi
    private final CharSequence e;

    public bwpp(bttq bttqVar, CharSequence charSequence, @dzsi CharSequence charSequence2) {
        boolean z = true;
        this.b = Boolean.valueOf(bttqVar == bttq.NO_CONNECTIVITY);
        this.c = Boolean.valueOf(bttqVar != bttq.INVALID_GAIA_AUTH_TOKEN ? false : z);
        this.d = charSequence;
        this.e = charSequence2;
    }

    @Override // defpackage.jam
    public Boolean a() {
        return this.a;
    }

    @Override // defpackage.jam
    public CharSequence b() {
        return this.d;
    }

    @Override // defpackage.jam
    public cjtd c() {
        return cjtd.b;
    }

    @Override // defpackage.jam
    public Boolean d() {
        return this.b;
    }

    @Override // defpackage.jam
    public cqfc e() {
        return jal.a;
    }

    @Override // defpackage.jam
    public cjtd g() {
        return cjtd.b;
    }

    @Override // defpackage.jam
    public Boolean h() {
        return Boolean.FALSE;
    }

    @Override // defpackage.jam
    public cqkl i() {
        return cqkl.a;
    }

    @Override // defpackage.jam
    public CharSequence j() {
        return null;
    }

    @Override // defpackage.jam
    public Boolean k() {
        return jak.a();
    }

    @Override // defpackage.jam
    public cjtd l() {
        return cjtd.b;
    }

    @Override // defpackage.jam
    public cqtd m() {
        return null;
    }

    @Override // defpackage.jam
    @dzsi
    public CharSequence n() {
        return this.e;
    }

    @Override // defpackage.jam
    public cqtd o() {
        return null;
    }

    @Override // defpackage.bwoc
    public Boolean p() {
        return this.c;
    }
}
