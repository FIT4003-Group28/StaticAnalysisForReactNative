package defpackage;
/* compiled from: PG */
/* renamed from: drl  reason: default package */
/* loaded from: classes3.dex */
final class drl implements drm {
    private final dpu a;
    private final String b;
    private final /* synthetic */ int c;

    public drl(dpu dpuVar, String str) {
        this.a = dpuVar;
        this.b = str;
    }

    public drl(dpu dpuVar, String str, int i) {
        this.c = i;
        this.a = dpuVar;
        this.b = str;
    }

    @Override // defpackage.drm
    public final dpu a(dqz dqzVar) {
        int i = this.c;
        if (i == 0) {
            dpu a = this.a.a();
            a.e(this.b, dqzVar);
            return a;
        } else if (i == 1) {
            dpu a2 = this.a.a();
            a2.f(this.b, dqzVar);
            return a2;
        } else {
            this.a.e(this.b, dqzVar);
            return this.a;
        }
    }
}
