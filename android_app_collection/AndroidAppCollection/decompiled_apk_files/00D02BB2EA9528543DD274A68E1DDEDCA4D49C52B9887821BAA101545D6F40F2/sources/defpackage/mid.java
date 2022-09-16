package defpackage;

import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: mid  reason: default package */
/* loaded from: classes7.dex */
public final class mid implements crzp<btlu> {
    final /* synthetic */ mio a;

    public mid(mio mioVar) {
        this.a = mioVar;
    }

    @Override // defpackage.crzp
    public final void On(crzm<btlu> crzmVar) {
        btlu l = crzmVar.l();
        if (!Objects.equals(this.a.B, l)) {
            mio mioVar = this.a;
            mioVar.B = l;
            mioVar.t.m(mioVar.s);
        }
    }
}
