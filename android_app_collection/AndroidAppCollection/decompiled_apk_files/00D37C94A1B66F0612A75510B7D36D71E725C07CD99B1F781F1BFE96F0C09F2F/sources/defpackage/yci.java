package defpackage;

import android.app.Activity;
import com.google.protos.youtube.api.innertube.YpcHandleTransactionEndpoint$YPCHandleTransactionEndpoint;
import java.util.Map;
/* compiled from: PG */
/* renamed from: yci  reason: default package */
/* loaded from: classes4.dex */
public final class yci implements aafl {
    private final Activity a;
    private final abff b;
    private final ycj c;
    private final ydq d;
    private final yat e = new yat();
    private final aagi f;
    private final afvn g;

    public yci(Activity activity, ycj ycjVar, aagi aagiVar, afvn afvnVar, abff abffVar, ydq ydqVar) {
        this.a = activity;
        this.b = abffVar;
        this.c = ycjVar;
        this.d = ydqVar;
        this.f = aagiVar;
        this.g = afvnVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        CharSequence charSequence;
        assu assuVar;
        String str;
        byte[] bArr;
        byte[] bArr2;
        abmn abmnVar;
        byte[] c;
        this.e.show(this.a.getFragmentManager(), yat.a);
        long j = -1;
        String str2 = null;
        if (map != null) {
            str = (String) map.get("FUNDS_GUARANTEE_CALLBACK_CLIENT_DATA");
            bArr = (byte[]) map.get("SERIALIZED_WALLET_EVENT_LOGS");
            bArr2 = (byte[]) map.get("SERIALIZED_BACKEND_ANALYTICS_EVENT");
            j = ((Long) zew.J(map, "PURCHASE_PRICE_MICROS", -1L)).longValue();
            charSequence = (CharSequence) zew.K(map, "CLIENT_CHAT_MESSAGE_TEXT", String.class);
            assuVar = (assu) zew.K(map, "LIVE_CHAT_RICH_MESSAGE_INPUT", assu.class);
            abmnVar = (abmn) map.get("HANDLE_TRANSACTION_CALLBACK");
            str2 = (String) map.get("PAYMENTS_PAYLOAD");
        } else {
            charSequence = "";
            assuVar = null;
            str = null;
            bArr = null;
            bArr2 = null;
            abmnVar = null;
        }
        YpcHandleTransactionEndpoint$YPCHandleTransactionEndpoint ypcHandleTransactionEndpoint$YPCHandleTransactionEndpoint = (YpcHandleTransactionEndpoint$YPCHandleTransactionEndpoint) apzgVar.qm(YpcHandleTransactionEndpoint$YPCHandleTransactionEndpoint.ypcHandleTransactionEndpoint);
        abff abffVar = this.b;
        abfd abfdVar = new abfd(abffVar.e, abffVar.c.c());
        abfdVar.k(aadi.b);
        int i = 1;
        if ((apzgVar.b & 1) != 0) {
            abfdVar.j(apzgVar.c);
        }
        int i2 = ypcHandleTransactionEndpoint$YPCHandleTransactionEndpoint.b;
        if ((i2 & 1) != 0) {
            String str3 = ypcHandleTransactionEndpoint$YPCHandleTransactionEndpoint.c;
            str3.getClass();
            abfdVar.b = str3;
        }
        if ((i2 & 2) != 0) {
            String str4 = ypcHandleTransactionEndpoint$YPCHandleTransactionEndpoint.d;
            str4.getClass();
            abfdVar.c = str4;
        }
        if (str2 != null) {
            abfdVar.d = str2;
        }
        if (str != null) {
            abfdVar.s = str;
        }
        if (bArr != null) {
            abfdVar.t = bArr;
        }
        if (bArr2 != null) {
            abfdVar.u = bArr2;
        }
        if (assuVar != null) {
            abfdVar.w = assuVar;
        }
        if (charSequence != null) {
            abfdVar.x = charSequence;
        }
        if ((i2 & 8) != 0) {
            int ao = awwc.ao(ypcHandleTransactionEndpoint$YPCHandleTransactionEndpoint.f);
            if (ao != 0) {
                i = ao;
            }
            abfdVar.y = i;
        }
        if (ypcHandleTransactionEndpoint$YPCHandleTransactionEndpoint.g.size() > 0) {
            aopu<String> aopuVar = ypcHandleTransactionEndpoint$YPCHandleTransactionEndpoint.g;
            aagh a = this.f.a(this.g.c());
            for (String str5 : aopuVar) {
                aajj aajjVar = (aajj) a.f(str5).W();
                if (aajjVar != null && (c = aajjVar.c()) != null) {
                    abfdVar.a.add(aoob.x(c));
                }
            }
        }
        abff abffVar2 = this.b;
        abfdVar.v = j;
        ycj ycjVar = this.c;
        ydq ydqVar = this.d;
        yat yatVar = this.e;
        yzj yzjVar = (yzj) ycjVar.a.get();
        yzjVar.getClass();
        acrr acrrVar = (acrr) ycjVar.b.get();
        acrrVar.getClass();
        aafo aafoVar = (aafo) ycjVar.c.get();
        aafoVar.getClass();
        ypcHandleTransactionEndpoint$YPCHandleTransactionEndpoint.getClass();
        ydqVar.getClass();
        abffVar2.j.e(abfdVar, new ych(yzjVar, acrrVar, aafoVar, abmnVar, ypcHandleTransactionEndpoint$YPCHandleTransactionEndpoint, ydqVar, yatVar));
    }
}
