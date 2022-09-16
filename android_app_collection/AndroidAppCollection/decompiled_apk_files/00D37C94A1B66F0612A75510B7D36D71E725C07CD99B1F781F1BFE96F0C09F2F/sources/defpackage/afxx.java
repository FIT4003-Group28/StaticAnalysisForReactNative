package defpackage;
/* compiled from: PG */
/* renamed from: afxx  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class afxx implements ylw {
    public final /* synthetic */ afyl a;
    private final /* synthetic */ int b;

    public /* synthetic */ afxx(afyl afylVar, int i) {
        this.b = i;
        this.a = afylVar;
    }

    @Override // defpackage.ylw, defpackage.zdt
    public final void a(Object obj) {
        if (this.b == 0) {
            afyl afylVar = this.a;
            if (!((Boolean) obj).booleanValue()) {
                return;
            }
            for (String str : afylVar.v()) {
                zep.g(str);
            }
            return;
        }
        afyl afylVar2 = this.a;
        if (!((Boolean) obj).booleanValue()) {
            return;
        }
        for (String str2 : afylVar2.v()) {
            zep.g(str2);
        }
    }
}
