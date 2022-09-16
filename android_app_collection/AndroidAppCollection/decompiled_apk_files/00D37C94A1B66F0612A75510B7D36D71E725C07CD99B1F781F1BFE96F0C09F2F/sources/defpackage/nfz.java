package defpackage;

import android.content.SharedPreferences;
import android.view.View;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
/* compiled from: PG */
/* renamed from: nfz  reason: default package */
/* loaded from: classes3.dex */
public final class nfz implements fpa {
    public final fpg a;
    public final nge b;
    public final ggi c;
    public foz d;
    public foz e;
    public foz f;
    public foz g;
    public foz h;
    private final SharedPreferences i;
    private final akfo j;

    public nfz(fpg fpgVar, SharedPreferences sharedPreferences, akfo akfoVar, fqd fqdVar, nge ngeVar, ggi ggiVar) {
        this.a = fpgVar;
        this.i = sharedPreferences;
        this.j = akfoVar;
        this.b = ngeVar;
        this.c = ggiVar;
        if (!sharedPreferences.contains(etk.TIME_FUSION_ENABLED)) {
            sharedPreferences.edit().putLong(etk.TIME_FUSION_ENABLED, System.currentTimeMillis()).apply();
        }
        if (sharedPreferences.getBoolean(etk.SHOW_SUBSCRIBERS_TAB_TUTORIAL, true)) {
            foz fozVar = new foz(fpgVar, sharedPreferences, 5602, etk.SHOW_SUBSCRIBERS_TAB_TUTORIAL, R.string.subs_tab_tutorial_description, akfoVar);
            this.d = fozVar;
            fpgVar.b(fozVar);
        }
        if (sharedPreferences.getBoolean(etk.SHOW_ACCOUNT_TAB_TUTORIAL, true)) {
            foz fozVar2 = new foz(fpgVar, sharedPreferences, 5601, etk.SHOW_ACCOUNT_TAB_TUTORIAL, R.string.account_tab_tutorial_description, akfoVar);
            this.e = fozVar2;
            fpgVar.b(fozVar2);
        }
        if (sharedPreferences.getBoolean(etk.SHOW_SUBS_CHANNELS_TUTORIAL, true)) {
            foz fozVar3 = new foz(fpgVar, sharedPreferences, 5600, etk.SHOW_SUBS_CHANNELS_TUTORIAL, R.string.subs_channel_tutorial_description, akfoVar);
            this.f = fozVar3;
            fpgVar.b(fozVar3);
        }
        if (sharedPreferences.getBoolean(etk.SHOW_CHANNELS_NOTIFICATIONS_TUTORIAL, true)) {
            foz fozVar4 = new foz(fpgVar, sharedPreferences, 4500, etk.SHOW_CHANNELS_NOTIFICATIONS_TUTORIAL, R.string.channels_notification_tutorial_description, akfoVar);
            this.g = fozVar4;
            fpgVar.b(fozVar4);
        }
        if (sharedPreferences.getBoolean(etk.SHOW_TRENDING_TAB_TUTORIAL, true)) {
            foz fozVar5 = new foz(fpgVar, sharedPreferences, 5603, etk.SHOW_TRENDING_TAB_TUTORIAL, R.string.trending_tab_tutorial_description, akfoVar);
            this.h = fozVar5;
            fpgVar.b(fozVar5);
        }
        nfx nfxVar = new nfx(this);
        if (fqdVar.a == null) {
            fqdVar.a = Collections.newSetFromMap(new ConcurrentHashMap());
        }
        fqdVar.a.add(nfxVar);
    }

    public static boolean d(apzg apzgVar, String str) {
        return (apzgVar == null || (((apnv) apzgVar.qm(BrowseEndpointOuterClass.browseEndpoint)).b & 1) == 0 || !akzj.i(((apnv) apzgVar.qm(BrowseEndpointOuterClass.browseEndpoint)).c, str)) ? false : true;
    }

    @Override // defpackage.fpa
    public final void a(Object obj, View view) {
        if (this.f != null && (obj instanceof apsv)) {
            int i = 0;
            for (apsw apswVar : ((apsv) obj).e) {
                if (apswVar.b == 48474525) {
                    i++;
                }
            }
            if (i >= 5) {
                this.f.a = view;
            }
        } else if (this.g == null || !(obj instanceof ekx)) {
            if (obj instanceof atsf) {
                this.b.a(view);
                this.b.d = new nfy(this);
            }
        } else {
            ekx ekxVar = (ekx) obj;
            if (ekxVar.f() != null && ekxVar.f().a() != null && view.isShown()) {
                this.g.a = view;
            }
        }
        this.a.c();
    }

    public final void b(boolean z) {
        if (!z) {
            this.a.f(this.b);
        } else if (!this.b.b()) {
        } else {
            this.a.b(this.b);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(defpackage.avfo r4) {
        /*
            r3 = this;
            r0 = 0
            r1 = 0
            if (r4 == 0) goto L2b
            apzg r4 = r4.d
            if (r4 != 0) goto La
            apzg r4 = defpackage.apzg.a
        La:
            java.lang.String r2 = "FEsubscriptions"
            boolean r2 = d(r4, r2)
            if (r2 == 0) goto L15
            java.lang.String r0 = "show_subscribers_tab_tutorial"
            goto L2b
        L15:
            java.lang.String r2 = "FEaccount"
            boolean r2 = d(r4, r2)
            if (r2 == 0) goto L21
            r4 = 1
            java.lang.String r0 = "show_accounts_tab_tutorial"
            goto L2c
        L21:
            java.lang.String r2 = "FEtrending"
            boolean r4 = d(r4, r2)
            if (r4 == 0) goto L2b
            java.lang.String r0 = "show_trending_tab_tutorial"
        L2b:
            r4 = 0
        L2c:
            if (r0 == 0) goto L3b
            android.content.SharedPreferences r2 = r3.i
            android.content.SharedPreferences$Editor r2 = r2.edit()
            android.content.SharedPreferences$Editor r0 = r2.putBoolean(r0, r1)
            r0.apply()
        L3b:
            nge r0 = r3.b
            r0.c = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nfz.c(avfo):void");
    }

    public final boolean e() {
        if (this.c.b()) {
            this.c.d();
            return true;
        }
        return false;
    }
}
