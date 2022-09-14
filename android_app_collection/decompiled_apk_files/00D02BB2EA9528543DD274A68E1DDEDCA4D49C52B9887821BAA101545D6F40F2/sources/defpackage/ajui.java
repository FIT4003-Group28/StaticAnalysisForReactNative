package defpackage;

import android.content.Context;
import android.content.pm.ResolveInfo;
import com.google.android.apps.gmm.locationsharing.ui.sendkit.JourneySharingSendKitActivity;
import com.google.android.apps.maps.R;
import com.google.android.libraries.social.sendkit.api.SendKitPickerResult;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ajui  reason: default package */
/* loaded from: classes2.dex */
public class ajui implements ajtr, ajxc, ajwt {
    public final Executor a;
    public final ajuh b;
    public final ajus c;
    public final btlu d;
    public boolean e = false;
    public final Set<czha> f = new HashSet();
    public final Set<czha> g = new HashSet();
    @dzsi
    public cxsx h = null;
    private final Context i;
    private final String j;
    private final dcdc<ajxq> k;

    public ajui(final Context context, Executor executor, cqhn cqhnVar, final ajuh ajuhVar, ajus ajusVar, String str, btlu btluVar, bwfp bwfpVar) {
        this.i = context;
        this.a = executor;
        this.b = ajuhVar;
        this.c = ajusVar;
        this.j = str;
        this.d = btluVar;
        this.k = dcdc.q(dcft.o(bwfpVar.a(btluVar), new dbrn(ajuhVar, context) { // from class: ajtx
            private final ajuh a;
            private final Context b;

            {
                this.a = ajuhVar;
                this.b = context;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                return new ajug(this.a, (ResolveInfo) obj, this.b);
            }
        }));
    }

    @Override // defpackage.ajtr
    public Boolean a() {
        return false;
    }

    @Override // defpackage.ajtr
    public Boolean b() {
        return Boolean.valueOf(this.e);
    }

    @Override // defpackage.ajtr
    public ajwt c() {
        return this;
    }

    @Override // defpackage.ajtr
    public ajxc d() {
        return this;
    }

    @Override // defpackage.ajtr
    @dzsi
    public CharSequence e() {
        if (!this.g.isEmpty()) {
            return cqrt.l(R.string.SMS_PRICE_WARNING).a(this.i);
        }
        return null;
    }

    @Override // defpackage.ajxc
    public ajxw f() {
        return new ajud(this);
    }

    @Override // defpackage.ajxc
    public dbsz<SendKitPickerResult> g() {
        return new dbsz(this) { // from class: ajtt
            private final ajui a;

            {
                this.a = this;
            }

            @Override // defpackage.dbsz
            public final void NU(Object obj) {
                final ajui ajuiVar = this.a;
                final SendKitPickerResult sendKitPickerResult = (SendKitPickerResult) obj;
                ajuiVar.a.execute(new Runnable(ajuiVar, sendKitPickerResult) { // from class: ajtz
                    private final ajui a;
                    private final SendKitPickerResult b;

                    {
                        this.a = ajuiVar;
                        this.b = sendKitPickerResult;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ajui ajuiVar2 = this.a;
                        SendKitPickerResult sendKitPickerResult2 = this.b;
                        ajuh ajuhVar = ajuiVar2.b;
                        synchronized (ajuhVar) {
                            dbsk.l(((ajtj) ajuhVar).ae == 0);
                            Context H = ((fd) ajuhVar).H();
                            String str = ((ajtj) ajuhVar).ag;
                            dbsk.s(str);
                            String str2 = ((ajtj) ajuhVar).ah;
                            dbsk.s(str2);
                            ((ajtj) ajuhVar).aA.a().p((fd) ajuhVar, JourneySharingSendKitActivity.o(H, str, str2, false, false, 0, dbsg.j(sendKitPickerResult2)), 0, 2);
                        }
                    }
                });
            }
        };
    }

    @Override // defpackage.ajxc
    public dbsz<cxsx> h() {
        return new dbsz(this) { // from class: ajtw
            private final ajui a;

            {
                this.a = this;
            }

            @Override // defpackage.dbsz
            public final void NU(Object obj) {
                this.a.h = (cxsx) obj;
            }
        };
    }

    @Override // defpackage.ajxc
    public ajxz i() {
        return new ajue(this);
    }

    @Override // defpackage.ajxc
    @dzsi
    public String j() {
        return this.j;
    }

    @Override // defpackage.ajwt
    public List<ajxq> k() {
        return this.k;
    }

    @Override // defpackage.ajxc
    public dbsl<String> l() {
        return new dbsl(this) { // from class: ajtu
            private final ajui a;

            {
                this.a = this;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                ajui ajuiVar = this.a;
                String str = (String) obj;
                if (str != null) {
                    return ajuiVar.b.ac(str);
                }
                return false;
            }
        };
    }

    @Override // defpackage.ajxc
    public ajxx m() {
        return new ajxx(this) { // from class: ajtv
            private final ajui a;

            {
                this.a = this;
            }

            @Override // defpackage.ajxx
            public final void a(String[] strArr, ajxy ajxyVar) {
                ajuh ajuhVar = this.a.b;
                ((ajtj) ajuhVar).ak = new ajty(ajxyVar);
                ((fd) ajuhVar).aa(strArr, 1234);
            }
        };
    }

    @Override // defpackage.ajtr
    public cqkl n() {
        cxsx cxsxVar = this.h;
        dbsk.s(cxsxVar);
        SendKitPickerResult c = cxsxVar.c();
        c.c();
        this.b.aK(c);
        return cqkl.a;
    }

    @Override // defpackage.ajwt
    public Boolean s() {
        return Boolean.FALSE;
    }
}
