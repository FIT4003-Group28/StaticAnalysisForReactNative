package defpackage;
/* compiled from: PG */
/* renamed from: kmr  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class kmr implements ayqb {
    public final /* synthetic */ kms a;
    private final /* synthetic */ int b;

    public /* synthetic */ kmr(kms kmsVar, int i) {
        this.b = i;
        this.a = kmsVar;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        if (this.b == 0) {
            kms kmsVar = this.a;
            Long l = (Long) obj;
            kmsVar.e = true;
            kmsVar.d();
            return;
        }
        kms kmsVar2 = this.a;
        if (kmsVar2.f == ((ahhm) obj).c().b(aijx.VIDEO_WATCH_LOADED)) {
            return;
        }
        kmsVar2.f = true;
        kmsVar2.e();
    }
}
