package defpackage;
/* compiled from: PG */
/* renamed from: znu  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class znu implements ampg {
    public final /* synthetic */ znx a;
    public final /* synthetic */ String b;
    private final /* synthetic */ int c;

    public /* synthetic */ znu(znx znxVar, String str) {
        this.a = znxVar;
        this.b = str;
    }

    public /* synthetic */ znu(znx znxVar, String str, int i) {
        this.c = i;
        this.a = znxVar;
        this.b = str;
    }

    @Override // defpackage.ampg
    public final Object apply(Object obj) {
        if (this.c == 0) {
            znx znxVar = this.a;
            String str = this.b;
            if (!((Boolean) obj).booleanValue()) {
                znxVar.b.b(new wdx(str, 10), anjk.a);
            }
            return null;
        }
        znx znxVar2 = this.a;
        String str2 = this.b;
        if (!((Boolean) obj).booleanValue()) {
            znxVar2.b.b(new wdx(str2, 9), anjk.a);
        }
        return null;
    }
}
