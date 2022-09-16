package defpackage;

import com.google.apps.tiktok.contrib.work.TikTokListenableWorker;
import java.util.Map;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: amfz  reason: default package */
/* loaded from: classes.dex */
public final class amfz implements amfr {
    private final bqo a;
    private final Map b;
    private final Pattern c = Pattern.compile("^(tiktok_account_work$|unique_|account_id_).*");
    private final Pattern d = Pattern.compile("^(TikTokWorker#|tiktok_).*");

    public amfz(bqo bqoVar, Map map) {
        this.a = bqoVar;
        this.b = map;
    }

    private static final bqq b(amfv amfvVar) {
        aqxo.y(true);
        bqg bqgVar = new bqg(TikTokListenableWorker.class);
        bqgVar.d(amfvVar.b);
        amft amftVar = amfvVar.d;
        bqgVar.e(amftVar.a, amftVar.b);
        bqgVar.f(amfvVar.e);
        amzs it = amfvVar.h.iterator();
        while (it.hasNext()) {
            bqgVar.c((String) it.next());
        }
        return bqgVar.b();
    }

    @Override // defpackage.amfr
    public final ankt a(amfv amfvVar) {
        amzs it = amfvVar.h.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (this.c.matcher(str).matches()) {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 39);
                sb.append("Tag ");
                sb.append(str);
                sb.append(" is reserved by AccountWorkManager.");
                throw new amfx(sb.toString());
            }
        }
        amzs it2 = amfvVar.h.iterator();
        while (it2.hasNext()) {
            String str2 = (String) it2.next();
            if (this.d.matcher(str2).matches()) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 38);
                sb2.append("Tag ");
                sb2.append(str2);
                sb2.append(" is reserved by TikTokWorkManager.");
                throw new amfx(sb2.toString());
            }
        }
        Class cls = amfvVar.a;
        String str3 = (String) this.b.get(cls);
        cls.toString();
        str3.getClass();
        amvn r = amvn.r(str3.length() != 0 ? "TikTokWorker#".concat(str3) : new String("TikTokWorker#"));
        amfs amfsVar = new amfs(amfvVar);
        amvn amvnVar = amfvVar.h;
        amvnVar.getClass();
        amfsVar.c(new amym(amvnVar, r));
        amfv a = amfsVar.a();
        aqxo.y(true);
        if (!a.g.h()) {
            aqxo.y(true);
            aqxo.y(!a.g.h());
            bqq b = b(a);
            return anii.h(((bqw) this.a.a(b)).c, new amfy(b, 1), anjk.a);
        }
        aqxo.y(true);
        aqxo.y(a.g.h());
        bqq b2 = b(a);
        bqo bqoVar = this.a;
        String str4 = ((amfu) a.g.c()).a;
        amfu amfuVar = (amfu) a.g.c();
        return anii.h(((bqw) bqoVar.g(str4, 1, b2)).c, new amfy(b2), anjk.a);
    }
}
