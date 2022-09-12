package defpackage;
/* compiled from: PG */
/* renamed from: bqyt  reason: default package */
/* loaded from: classes4.dex */
public final class bqyt extends bqxo {
    public final awcb e;
    public final bqyn f;
    public final akrz g;

    public bqyt(awcb awcbVar, amcl amclVar, int i, bqyn bqynVar, akrz akrzVar, String str, ckcw ckcwVar) {
        super(awcbVar, amclVar, i, str, ckcwVar);
        this.e = awcbVar;
        this.f = bqynVar;
        this.g = akrzVar;
    }

    @Override // defpackage.amci
    public final void b(amze amzeVar, byte[] bArr, cqat cqatVar) {
        t(new bqys(this, bArr, cqatVar));
    }

    @Override // defpackage.amcl
    public final void r() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.bqxo
    public final boolean s() {
        return false;
    }
}
