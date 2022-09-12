package defpackage;

import android.app.Activity;
import java.util.List;
/* compiled from: PG */
/* renamed from: apbw  reason: default package */
/* loaded from: classes2.dex */
public class apbw implements apbs {
    public static final /* synthetic */ int a = 0;
    private static final cjtd b = cjtd.a(dtyi.Y);
    private final apcf c;
    private final bwrs<aoyg> d;
    private final apch<apbu> e;

    public apbw(final apcd apcdVar, apcf apcfVar, final apaw apawVar, bwrs<aoyg> bwrsVar, final aoxr aoxrVar) {
        this.c = apcfVar;
        this.d = bwrsVar;
        this.e = new apch<>(bwrsVar, new apcg(apcdVar, apawVar, aoxrVar) { // from class: apbv
            private final apcd a;
            private final apaw b;
            private final aoxr c;

            {
                this.a = apcdVar;
                this.b = apawVar;
                this.c = aoxrVar;
            }

            @Override // defpackage.apcg
            public final apcy a(aoxt aoxtVar, int i) {
                apcd apcdVar2 = this.a;
                apaw apawVar2 = this.b;
                aoxr aoxrVar2 = this.c;
                int i2 = apbw.a;
                apdb a2 = apcdVar2.a.a();
                apcd.a(a2, 1);
                Activity activity = (Activity) ((dxjd) apcdVar2.b).a;
                apcd.a(activity, 2);
                apcd.a(apawVar2, 3);
                apcd.a(aoxtVar, 4);
                apcd.a(aoxrVar2, 5);
                return new apcc(a2, activity, apawVar2, aoxtVar, aoxrVar2, i);
            }
        });
    }

    @Override // defpackage.apbs
    public List<apbu> a() {
        return this.e.a();
    }

    @Override // defpackage.apbs
    public cqqw b() {
        return this.c.a(b, this.d);
    }
}
