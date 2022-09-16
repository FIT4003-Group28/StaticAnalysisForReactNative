package defpackage;
/* compiled from: PG */
/* renamed from: yft  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class yft implements zdt {
    public final /* synthetic */ String a;
    public final /* synthetic */ zdt b;
    private final /* synthetic */ int c;

    public /* synthetic */ yft(String str, zdt zdtVar) {
        this.a = str;
        this.b = zdtVar;
    }

    public /* synthetic */ yft(String str, zdt zdtVar, int i) {
        this.c = i;
        this.a = str;
        this.b = zdtVar;
    }

    @Override // defpackage.zdt
    public final void a(Object obj) {
        if (this.c == 0) {
            String str = this.a;
            zdt zdtVar = this.b;
            yfv.d(((Throwable) obj).getMessage());
            yfv.c(str, zdtVar);
            return;
        }
        yfv.c(this.a, this.b);
    }
}
