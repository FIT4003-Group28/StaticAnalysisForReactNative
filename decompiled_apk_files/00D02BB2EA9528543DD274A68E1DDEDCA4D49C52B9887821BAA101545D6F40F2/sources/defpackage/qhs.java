package defpackage;
/* compiled from: PG */
/* renamed from: qhs  reason: default package */
/* loaded from: classes7.dex */
public abstract class qhs {
    public abstract dowb a();

    public abstract int b();

    public final int c() {
        int b = b();
        if (b <= 10) {
            return 2131232536;
        }
        if (b <= 20) {
            return 2131232530;
        }
        if (b <= 30) {
            return 2131232531;
        }
        if (b <= 50) {
            return 2131232532;
        }
        if (b <= 60) {
            return 2131232533;
        }
        if (b <= 80) {
            return 2131232534;
        }
        return b <= 90 ? 2131232535 : 2131232544;
    }
}
