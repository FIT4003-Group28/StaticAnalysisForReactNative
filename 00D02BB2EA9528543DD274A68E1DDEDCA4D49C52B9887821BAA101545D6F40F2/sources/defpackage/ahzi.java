package defpackage;
/* compiled from: PG */
/* renamed from: ahzi  reason: default package */
/* loaded from: classes2.dex */
public final class ahzi {
    private final ajku a;
    private final akai b;

    public ahzi(ajku ajkuVar, akai akaiVar) {
        this.a = ajkuVar;
        this.b = akaiVar;
    }

    public final int a(btlu btluVar) {
        akah a = this.b.a(btluVar);
        if (((ajzf) a).b.isEmpty()) {
            ajku ajkuVar = this.a;
            if (ajkuVar.g.i(new eapd(ajkuVar.b.a().b())).contains(btluVar)) {
                return 1;
            }
        }
        if (a.g()) {
            return a.h() ? 3 : 2;
        }
        return 4;
    }
}
