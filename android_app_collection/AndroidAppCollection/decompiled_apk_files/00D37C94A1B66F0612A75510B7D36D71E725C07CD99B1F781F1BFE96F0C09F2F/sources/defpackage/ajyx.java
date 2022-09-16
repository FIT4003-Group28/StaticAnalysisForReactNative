package defpackage;
/* compiled from: PG */
/* renamed from: ajyx  reason: default package */
/* loaded from: classes.dex */
public final class ajyx extends ajsm {
    @Override // defpackage.ajsm, defpackage.ajqm
    public final /* bridge */ /* synthetic */ void lT(ajql ajqlVar) {
        super.i(ajqlVar);
    }

    @Override // defpackage.ajsm, defpackage.ajqm
    public final /* bridge */ /* synthetic */ void pl(ajql ajqlVar) {
        super.j(ajqlVar);
    }

    public final void q(ajyv ajyvVar) {
        if (ajyvVar == null) {
            if (isEmpty()) {
                return;
            }
            clear();
        } else if (!isEmpty()) {
            if (((ajyv) get(0)) == ajyvVar) {
                return;
            }
            n(0, ajyvVar);
        } else {
            add(ajyvVar);
        }
    }
}
