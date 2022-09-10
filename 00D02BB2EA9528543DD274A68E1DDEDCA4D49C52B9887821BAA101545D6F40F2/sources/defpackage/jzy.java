package defpackage;

import java.util.Objects;
/* compiled from: PG */
/* renamed from: jzy  reason: default package */
/* loaded from: classes7.dex */
final class jzy implements crzp<btlu> {
    final /* synthetic */ kaf a;

    public jzy(kaf kafVar) {
        this.a = kafVar;
    }

    @Override // defpackage.crzp
    public final void On(crzm<btlu> crzmVar) {
        if (!Objects.equals(this.a.l, crzmVar.l())) {
            this.a.d.a();
        }
    }
}
