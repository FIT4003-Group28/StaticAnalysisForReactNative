package defpackage;

import java.util.Set;
/* compiled from: PG */
/* renamed from: absh  reason: default package */
/* loaded from: classes.dex */
final class absh implements absw {
    final /* synthetic */ absi a;

    public absh(absi absiVar) {
        this.a = absiVar;
    }

    @Override // defpackage.absw
    public final void ra(boolean z, int i, int i2, Set set) {
        absi absiVar = this.a;
        absw abswVar = absiVar.b;
        if (absiVar.a) {
            i = -i;
        }
        abswVar.ra(z, i, i2, set);
    }
}
