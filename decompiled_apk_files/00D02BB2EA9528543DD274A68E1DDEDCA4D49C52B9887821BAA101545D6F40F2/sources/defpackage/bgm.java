package defpackage;
/* compiled from: PG */
/* renamed from: bgm  reason: default package */
/* loaded from: classes3.dex */
final class bgm extends bt {
    public bgm(bn bnVar) {
        super(bnVar);
    }

    @Override // defpackage.bt
    public final String d() {
        return "UPDATE workspec SET period_start_time=? WHERE id=?";
    }
}
