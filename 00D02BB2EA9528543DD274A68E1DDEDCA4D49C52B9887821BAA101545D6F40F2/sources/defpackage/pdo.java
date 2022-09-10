package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.maps.R;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: pdo  reason: default package */
/* loaded from: classes7.dex */
public final class pdo implements pcx<daxm> {
    public static final int a = auiy.SEND_TO_PHONE.a().intValue();
    private final Context b;
    private final jzv c;
    private final auhi d;
    private final dxio<akfa> e;
    private final auhj f;

    public pdo(Application application, jzv jzvVar, auhi auhiVar, dxio<akfa> dxioVar, auhj auhjVar) {
        this.b = application;
        this.c = jzvVar;
        this.d = auhiVar;
        this.e = dxioVar;
        this.f = auhjVar;
    }

    public static final int e() {
        return dpyv.SEND_TO_PHONE.dm;
    }

    @Override // defpackage.pcx
    public final boolean a(int i) {
        return a == i;
    }

    @Override // defpackage.pcx
    public final dssr<daxm> b() {
        return (dssr) daxm.e.cu(7);
    }

    @Override // defpackage.pcx
    public final /* bridge */ /* synthetic */ int c(daxm daxmVar) {
        return e();
    }

    @Override // defpackage.pcx
    public final /* bridge */ /* synthetic */ void d(pau pauVar, pas pasVar, daxm daxmVar) {
        String str;
        daxm daxmVar2 = daxmVar;
        String str2 = daxmVar2.b;
        if (TextUtils.isEmpty(str2) && (pasVar.a & 1) != 0) {
            pap papVar = pasVar.b;
            if (papVar == null) {
                papVar = pap.d;
            }
            str2 = papVar.b;
        }
        if (TextUtils.isEmpty(str2) && (pasVar.a & 2) != 0) {
            par parVar = pasVar.c;
            if (parVar == null) {
                parVar = par.d;
            }
            str2 = parVar.b;
        }
        augj augjVar = null;
        r7 = null;
        r7 = null;
        r7 = null;
        String str3 = null;
        if (!TextUtils.isEmpty(str2)) {
            if ((pasVar.a & 1) != 0) {
                pap papVar2 = pasVar.b;
                if (papVar2 == null) {
                    papVar2 = pap.d;
                }
                str = papVar2.c;
            } else {
                str = null;
            }
            btlu n = this.e.a().n(pauVar.b);
            String str4 = !daxmVar2.c.isEmpty() ? daxmVar2.c : null;
            String a2 = !daxmVar2.d.isEmpty() ? daxmVar2.d : cjrx.a(ddcu.Jw.a);
            if (TextUtils.isEmpty(str)) {
                str = this.b.getString(R.string.OPEN_IN_MAPS);
            }
            augc a3 = this.f.a(str4, a2, e(), this.d.h(dpyv.SEND_TO_PHONE.dm));
            int abs = (Math.abs(str2.hashCode()) % ((dpyv.SEND_TO_PHONE_END.dm - dpyv.SEND_TO_PHONE_START.dm) + 1)) + dpyv.SEND_TO_PHONE_START.dm;
            a3.R = pauVar;
            a3.S = n;
            a3.c = abs;
            a3.w(R.drawable.qu_sendtophone_notification);
            a3.D(this.b.getResources().getColor(R.color.quantum_googblue));
            a3.f = str2;
            a3.C(false);
            a3.g = str;
            a3.H(-1);
            a3.I();
            if (!daxmVar2.a.isEmpty()) {
                Intent data = afft.a(this.b).setAction("android.intent.action.VIEW").setData(Uri.parse(daxmVar2.a));
                data.addFlags(536870912);
                afku.g(data, abs);
                a3.E(data, auhw.ACTIVITY);
                String str5 = daxmVar2.a;
                dbtm a4 = dbtm.a('/');
                try {
                    String path = URI.create(str5).getPath();
                    if (path == null) {
                        throw new RuntimeException("no path in url");
                    }
                    String decode = URLDecoder.decode(path, "UTF-8");
                    if (decode.startsWith("/")) {
                        decode = decode.substring(1);
                    }
                    if (decode.endsWith("/")) {
                        decode = decode.substring(0, decode.length() - 1);
                    }
                    ArrayList c = dchl.c(a4.g(decode));
                    if (c.size() > 0 && "maps".equals(c.get(0))) {
                        List subList = c.subList(1, c.size());
                        if (subList.size() > 0 && "preview".equals(subList.get(0))) {
                            subList = subList.subList(1, subList.size());
                        }
                        if (!subList.isEmpty() && !((String) subList.get(0)).startsWith("@")) {
                            str3 = (String) subList.get(0);
                        }
                    }
                    if ("place".equals(str3)) {
                        Intent intent = new Intent(data);
                        afku.e(intent, duqi.DIRECTIONS_NAVIGATION);
                        a3.B(auoe.l(ddcu.Jy).i(1, R.drawable.qu_sendtophone_navigate, this.b.getString(R.string.SEND_TO_PHONE_NAVIGATE), intent, auhw.ACTIVITY, false));
                        Intent intent2 = new Intent(data);
                        afku.e(intent2, duqi.DIRECTIONS_DEFAULT);
                        a3.B(auoe.l(ddcu.Jx).i(2, R.drawable.qu_sendtophone_directions, this.b.getString(R.string.SEND_TO_PHONE_DIRECTIONS), intent2, auhw.ACTIVITY, false));
                    }
                    a3.E = ((mwo) this.c).g(abs, data, str2, str);
                } catch (UnsupportedEncodingException e) {
                    throw new RuntimeException(e);
                }
            }
            augjVar = a3.a();
        }
        if (augjVar != null) {
            this.d.j(augjVar);
        }
    }
}
