package defpackage;

import android.os.Parcel;
/* compiled from: PG */
/* renamed from: rtf  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class rtf implements qvo {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    private final /* synthetic */ int c;

    public /* synthetic */ rtf(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public /* synthetic */ rtf(String str, String str2, int i) {
        this.c = i;
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.qvo
    public final void a(Object obj, Object obj2) {
        if (this.c == 0) {
            String str = this.a;
            String str2 = this.b;
            rtj rtjVar = new rtj((rvh) obj2);
            rtk rtkVar = (rtk) ((rtl) obj).D();
            Parcel pv = rtkVar.pv();
            dve.i(pv, rtjVar);
            pv.writeString("com.youtube.mainapp.android");
            pv.writeString(null);
            pv.writeString(str);
            pv.writeString(str2);
            rtkVar.px(23, pv);
            return;
        }
        String str3 = this.a;
        String str4 = this.b;
        rtj rtjVar2 = new rtj((rvh) obj2);
        rtk rtkVar2 = (rtk) ((rtl) obj).D();
        Parcel pv2 = rtkVar2.pv();
        dve.i(pv2, rtjVar2);
        pv2.writeString(str3);
        pv2.writeString(str4);
        pv2.writeString(null);
        rtkVar2.px(11, pv2);
    }
}
