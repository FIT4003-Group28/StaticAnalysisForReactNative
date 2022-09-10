package defpackage;

import java.util.Objects;
/* compiled from: PG */
/* renamed from: kgp  reason: default package */
/* loaded from: classes7.dex */
final class kgp implements crzp<btlu> {
    final /* synthetic */ kgw a;

    public kgp(kgw kgwVar) {
        this.a = kgwVar;
    }

    @Override // defpackage.crzp
    public final void On(crzm<btlu> crzmVar) {
        btlu l = crzmVar.l();
        if (!Objects.equals(this.a.r, l)) {
            kgw kgwVar = this.a;
            kgwVar.r = l;
            kgwVar.m();
        }
    }
}
