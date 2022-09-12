package defpackage;
/* compiled from: PG */
/* renamed from: albo  reason: default package */
/* loaded from: classes2.dex */
public final class albo implements vtp {
    public static final albo a = new albo();

    private albo() {
    }

    @Override // defpackage.vtp
    public final vto a(dqvj dqvjVar, boolean z) {
        if (dqvjVar == dqvj.DRIVE || dqvjVar == dqvj.TWO_WHEELER || dqvjVar == dqvj.TAXI || dqvjVar == dqvj.TAXICAB) {
            if (z) {
                return vto.SELECTED_WITH_TRAFFIC;
            }
            return vto.UNSELECTED_WITH_TRAFFIC;
        }
        return albq.a.a(dqvjVar, z);
    }
}
