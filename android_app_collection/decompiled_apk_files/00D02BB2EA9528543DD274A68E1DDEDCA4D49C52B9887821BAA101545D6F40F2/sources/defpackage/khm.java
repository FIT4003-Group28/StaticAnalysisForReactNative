package defpackage;

import java.util.Objects;
/* compiled from: PG */
/* renamed from: khm  reason: default package */
/* loaded from: classes7.dex */
final class khm implements crzp<btlu> {
    final /* synthetic */ kht a;

    public khm(kht khtVar) {
        this.a = khtVar;
    }

    @Override // defpackage.crzp
    public final void On(crzm<btlu> crzmVar) {
        btlu l = crzmVar.l();
        boolean z = !Objects.equals(this.a.r, l);
        this.a.r = l;
        if (btlu.p(l)) {
            this.a.e.d();
        } else if (!z) {
        } else {
            this.a.m();
        }
    }
}
