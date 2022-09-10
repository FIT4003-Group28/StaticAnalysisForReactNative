package defpackage;

import java.util.Locale;
/* compiled from: PG */
/* renamed from: bjgy  reason: default package */
/* loaded from: classes3.dex */
public class bjgy {
    public final gga a;
    public final bjgt b;
    public final awnm c;
    public final bjhc d;
    public final cplz e;

    public bjgy(gga ggaVar, bjgt bjgtVar, awnm awnmVar, bjhc bjhcVar, cplz cplzVar) {
        this.a = ggaVar;
        this.c = awnmVar;
        this.d = bjhcVar;
        this.e = cplzVar;
        this.b = bjgtVar;
    }

    public final void a(int i, final String str, final String str2) {
        final String str3 = i + (-1) != 0 ? "MAPS_PLACE_QA_ANSWERS" : "MAPS_PLACE_QA_QUESTIONS";
        this.d.c(new Runnable(this, str3, str2, str) { // from class: bjgw
            private final bjgy a;
            private final String b;
            private final String c;
            private final String d;

            {
                this.a = this;
                this.b = str3;
                this.c = str2;
                this.d = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bjgy bjgyVar = this.a;
                String str4 = this.b;
                String str5 = this.c;
                String str6 = this.d;
                String o = bjgyVar.d.a.a().o();
                if (dbsj.d(o)) {
                    return;
                }
                cplz cplzVar = bjgyVar.e;
                cplzVar.a = str4;
                cplzVar.c(o);
                cplzVar.b(str5);
                cplzVar.b = Locale.getDefault().getLanguage();
                bjgyVar.c.e(bjgyVar.e.a(bjgyVar.a), new bjgx(bjgyVar.b, str6));
            }
        });
    }
}
