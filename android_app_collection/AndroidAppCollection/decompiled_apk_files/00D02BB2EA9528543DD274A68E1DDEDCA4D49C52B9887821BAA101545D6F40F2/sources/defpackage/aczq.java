package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: aczq  reason: default package */
/* loaded from: classes.dex */
public final class aczq implements cqkv {
    final aczp a;

    public aczq(aczp aczpVar) {
        this.a = aczpVar;
    }

    @Override // defpackage.cqkv
    public final boolean a(cqku cqkuVar, Object obj, cqjz<?> cqjzVar) {
        View view = cqjzVar.c;
        if (cqkuVar instanceof aczo) {
            aczo aczoVar = aczo.a;
            if (((aczo) cqkuVar).ordinal() != 0 || !(view instanceof View)) {
                return false;
            }
            if (obj != null && !(obj instanceof Integer)) {
                return false;
            }
            aczp.b((Integer) obj, view);
            return true;
        }
        return false;
    }

    @Override // defpackage.cqkv
    public final boolean b(cqku cqkuVar, cqjz<?> cqjzVar) {
        View view = cqjzVar.c;
        if (cqkuVar instanceof aczo) {
            aczo aczoVar = aczo.a;
            if (((aczo) cqkuVar).ordinal() != 0 || !(view instanceof View)) {
                return false;
            }
            aczp.b(null, view);
            return true;
        }
        return false;
    }
}
