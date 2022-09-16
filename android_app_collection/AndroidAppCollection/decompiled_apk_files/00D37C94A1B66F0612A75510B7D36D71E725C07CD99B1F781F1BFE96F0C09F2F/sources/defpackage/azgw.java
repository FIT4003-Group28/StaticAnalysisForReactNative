package defpackage;
/* compiled from: PG */
/* renamed from: azgw  reason: default package */
/* loaded from: classes2.dex */
public final class azgw extends azdm {
    final tgl b;

    public azgw(ayok ayokVar, tgl tglVar) {
        super(ayokVar);
        this.b = tglVar;
    }

    @Override // defpackage.ayoi
    public final void f(ayom ayomVar) {
        try {
            tgk tgkVar = new tgk(this.b, ayomVar);
            String.valueOf(String.valueOf(this.b)).length();
            this.a.az(tgkVar);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            bapv.j(th);
            azqc.d(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }
}
