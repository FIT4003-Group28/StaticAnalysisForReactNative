package defpackage;
/* compiled from: PG */
/* renamed from: rte  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class rte implements qvo {
    public final /* synthetic */ String a;
    private final /* synthetic */ int b;

    public /* synthetic */ rte(String str) {
        this.a = str;
    }

    public /* synthetic */ rte(String str, int i) {
        this.b = i;
        this.a = str;
    }

    @Override // defpackage.qvo
    public final void a(Object obj, Object obj2) {
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                ((qii) ((qif) obj).D()).j(new qig((rvh) obj2, 1), this.a);
                return;
            }
            String str = this.a;
            ((rtk) ((rtl) obj).D()).a(new rtj((rvh) obj2), str);
            return;
        }
        String str2 = this.a;
        rtj rtjVar = new rtj((rvh) obj2);
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 36);
        sb.append("CURRENT:");
        sb.append(str2);
        sb.append(":com.youtube.mainapp.android");
        ((rtk) ((rtl) obj).D()).a(rtjVar, sb.toString());
    }
}
