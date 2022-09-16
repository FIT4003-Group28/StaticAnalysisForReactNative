package defpackage;

import android.content.Intent;
import android.text.TextUtils;
import com.google.apps.tiktok.account.AccountId;
import com.google.protos.youtube.api.innertube.ApplicationSettingsEndpointOuterClass;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: gim  reason: default package */
/* loaded from: classes3.dex */
public final class gim implements aafl {
    public static final /* synthetic */ int c = 0;
    public final dt a;
    public final whe b;
    private final abcu d;
    private final yrj e;
    private final Executor f;
    private final wgy g;
    private final wgz h;
    private final acth i;
    private final afvn j;
    private final lgt k;
    private final sdb l;

    public gim(dt dtVar, abcu abcuVar, yrj yrjVar, sdb sdbVar, Executor executor, lgt lgtVar, wgy wgyVar, wgz wgzVar, acth acthVar, afvn afvnVar, whe wheVar, byte[] bArr) {
        this.a = dtVar;
        this.d = abcuVar;
        this.e = yrjVar;
        this.l = sdbVar;
        this.f = executor;
        this.k = lgtVar;
        this.g = wgyVar;
        this.h = wgzVar;
        this.i = acthVar;
        this.j = afvnVar;
        this.b = wheVar;
    }

    public static final void c(Intent intent, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String str2 = (String) lgn.a.get(str);
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        intent.putExtra(":android:show_fragment", str2);
    }

    public final void b(final Intent intent) {
        if (!this.h.a()) {
            this.a.startActivity(intent);
        } else {
            ylx.n(this.a, this.g.a(this.j.c()), etg.g, new zdt() { // from class: gik
                @Override // defpackage.zdt
                public final void a(Object obj) {
                    gim gimVar = gim.this;
                    Intent intent2 = intent;
                    AccountId accountId = (AccountId) obj;
                    accountId.getClass();
                    amad.a(intent2, accountId);
                    gimVar.b.b(11, 1, 26);
                    gimVar.a.startActivity(intent2);
                }
            });
        }
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        String str;
        int i = 1;
        if ((apzgVar.b & 1) != 0) {
            this.i.oi().H(3, new acte(apzgVar.c), null);
        }
        Intent a = this.k.a();
        aphw aphwVar = (aphw) apzgVar.qm(ApplicationSettingsEndpointOuterClass.applicationSettingsEndpoint);
        if (!this.e.o() || this.l.a || !aphwVar.c) {
            a.putExtra("show_offline_items", this.l.a);
            int i2 = aphwVar.b;
            if ((i2 & 8) != 0) {
                str = aphwVar.e;
            } else if ((i2 & 16) != 0) {
                int bh = awwc.bh(aphwVar.f);
                if (bh != 0) {
                    i = bh;
                }
                str = Integer.toString(i - 1);
            } else {
                str = "";
            }
            c(a, str);
            b(a);
            return;
        }
        gil gilVar = new gil(this, a);
        abcu abcuVar = this.d;
        ylx.l(abcuVar.d(abcuVar.a(aphwVar.d)), this.f, new itc(gilVar, 1), new itd(gilVar, 1), anlf.a);
    }
}
