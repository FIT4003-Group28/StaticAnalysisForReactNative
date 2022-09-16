package defpackage;
/* compiled from: PG */
/* renamed from: aaco  reason: default package */
/* loaded from: classes.dex */
public final class aaco implements aaci {
    private final snc a;

    public aaco(snc sncVar) {
        this.a = sncVar;
    }

    @Override // defpackage.aaci
    public final aach a(cer cerVar) {
        aacm aacmVar = aacm.AVAILABLE;
        if (cerVar.e < this.a.c()) {
            aacmVar = aacm.EXPIRED;
        } else if (cerVar.f < this.a.c()) {
            aacmVar = aacm.STALE;
        }
        return new aacn(aacmVar);
    }
}
