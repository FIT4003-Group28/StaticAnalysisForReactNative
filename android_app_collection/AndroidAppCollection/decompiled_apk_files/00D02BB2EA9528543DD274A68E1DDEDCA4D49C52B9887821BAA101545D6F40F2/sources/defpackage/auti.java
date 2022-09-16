package defpackage;
/* compiled from: PG */
/* renamed from: auti  reason: default package */
/* loaded from: classes2.dex */
public final class auti {
    private final btvo a;

    public auti(btvo btvoVar) {
        this.a = btvoVar;
    }

    public final dcep<Integer> a() {
        if (!this.a.getNotificationsParameters().w) {
            return dcmr.a;
        }
        return dcep.K(this.a.getNotificationsParameters().x);
    }

    public final boolean b(int i) {
        return a().contains(Integer.valueOf(i));
    }
}
