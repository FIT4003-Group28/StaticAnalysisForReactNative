package defpackage;
/* compiled from: PG */
/* renamed from: ubn  reason: default package */
/* loaded from: classes4.dex */
final class ubn implements ampw {
    private final /* synthetic */ int a;

    public ubn() {
    }

    public ubn(int i) {
        this.a = i;
    }

    @Override // defpackage.ampw
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        int i = this.a;
        if (i == 0) {
            ((ubr) obj).d();
        } else if (i == 1) {
            ((ubr) obj).e();
        } else {
            ((ubr) obj).c();
        }
    }
}
