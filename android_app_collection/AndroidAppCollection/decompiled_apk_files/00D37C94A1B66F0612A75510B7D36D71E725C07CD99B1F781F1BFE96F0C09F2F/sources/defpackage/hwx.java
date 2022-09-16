package defpackage;

import j$.util.Optional;
/* compiled from: PG */
/* renamed from: hwx  reason: default package */
/* loaded from: classes3.dex */
public final class hwx implements ibm {
    private final azqb a;

    public hwx(azqb azqbVar) {
        this.a = azqbVar;
    }

    @Override // defpackage.ibm
    public final Optional a() {
        return Optional.ofNullable(((gtm) this.a.get()).a()).filter(gka.c).map(glk.j);
    }
}
