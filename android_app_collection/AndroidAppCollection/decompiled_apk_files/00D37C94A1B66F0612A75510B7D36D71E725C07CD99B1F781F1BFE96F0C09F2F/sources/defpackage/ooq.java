package defpackage;

import android.app.Application;
import android.content.Context;
import com.google.android.apps.youtube.embeddedplayer.service.clientinfo.service.f;
import com.google.android.apps.youtube.embeddedplayer.service.csi.service.a;
import com.google.android.apps.youtube.embeddedplayer.service.innertube.g;
import com.google.android.apps.youtube.embeddedplayer.service.innertube.h;
import com.google.android.apps.youtube.embeddedplayer.service.innertube.i;
import com.google.android.apps.youtube.embeddedplayer.service.innertube.m;
/* compiled from: PG */
/* renamed from: ooq  reason: default package */
/* loaded from: classes3.dex */
public final class ooq implements axou {
    private final azqb a;
    private final /* synthetic */ int b;

    public ooq(azqb azqbVar) {
        this.a = azqbVar;
    }

    public ooq(azqb azqbVar, int i) {
        this.b = i;
        this.a = azqbVar;
    }

    public static ooq a(azqb azqbVar) {
        return new ooq(azqbVar);
    }

    public static ankx b(sof sofVar) {
        snl snlVar = new snl(snr.e("Scheduler", pgw.b));
        snlVar.setRemoveOnCancelPolicy(true);
        ankx a = sofVar.a(anlz.f(snlVar));
        axzl.o(a);
        return a;
    }

    public static sot c(snc sncVar) {
        return new sot(sncVar);
    }

    public static tjp d(Application application) {
        return new tjp(application);
    }

    public static afvy e(vzm vzmVar) {
        return new vwm(new vwn(vzmVar), 1);
    }

    public static afvy f(vzm vzmVar) {
        vzmVar.getClass();
        return new vwm(vzmVar);
    }

    public static vzw g(yni yniVar) {
        return new vzw(yniVar);
    }

    public static String h(Context context) {
        String a = rxl.a(context.getContentResolver(), rxl.a);
        return a == null ? "android-google" : a;
    }

    public static wko i(aacz aaczVar) {
        return new wko(aaczVar);
    }

    public static wmu j(aaqp aaqpVar) {
        return new wmu(aaqpVar);
    }

    public static ooq k(azqb azqbVar) {
        return new ooq(azqbVar, 1);
    }

    public static ooq l(azqb azqbVar) {
        return new ooq(azqbVar, 2);
    }

    public static ooq m(azqb azqbVar) {
        return new ooq(azqbVar, 3);
    }

    public static ooq n(azqb azqbVar) {
        return new ooq(azqbVar, 4);
    }

    public static ooq o(azqb azqbVar) {
        return new ooq(azqbVar, 5);
    }

    public static ooq p(azqb azqbVar) {
        return new ooq(azqbVar, 6);
    }

    public static ooq q(azqb azqbVar) {
        return new ooq(azqbVar, 7);
    }

    public static ooq r(azqb azqbVar) {
        return new ooq(azqbVar, 8);
    }

    public static ooq s(azqb azqbVar) {
        return new ooq(azqbVar, 9);
    }

    public static ooq t(azqb azqbVar) {
        return new ooq(azqbVar, 10);
    }

    public static ooq u(azqb azqbVar) {
        return new ooq(azqbVar, 17);
    }

    public static ooq v(azqb azqbVar) {
        return new ooq(azqbVar, 18);
    }

    public static ooq w(azqb azqbVar) {
        return new ooq(azqbVar, 19);
    }

    public static ooq x(azqb azqbVar) {
        return new ooq(azqbVar, 20);
    }

    @Override // defpackage.azqb
    public final /* bridge */ /* synthetic */ Object get() {
        switch (this.b) {
            case 0:
                String format = String.format("embeddedplayer_%s_%s", ((f) this.a.get()).a, "keyValueByteStores");
                axzl.o(format);
                return format;
            case 1:
                String format2 = String.format("embeddedplayer_%s_%s", ((f) this.a.get()).a, "com.google.android.libraries.youtube.net.delayedevents.DelayedEventStore");
                axzl.o(format2);
                return format2;
            case 2:
                yjs yjsVar = (yjs) this.a.get();
                axzl.o(yjsVar);
                return yjsVar;
            case 3:
                return new a((acvf) this.a.get());
            case 4:
                return new g(((h) this.a).get());
            case 5:
                return new i((aadd) this.a.get());
            case 6:
                return new m((aadd) this.a.get());
            case 7:
                return new com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.service.g((com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.service.f) this.a.get());
            case 8:
                return b(((sog) this.a).get());
            case 9:
                return c((snc) this.a.get());
            case 10:
                return d(((yim) this.a).get());
            case 11:
                return ((tuv) this.a).get();
            case 12:
                return ((tvf) this.a).get();
            case 13:
                return e((vzm) this.a.get());
            case 14:
                return f((vzm) this.a.get());
            case 15:
                return g((yni) this.a.get());
            case 16:
                return new whn(((yid) this.a).get());
            case 17:
                return h((Context) ((axov) this.a).a);
            case 18:
                return new wjy((tjp) this.a.get());
            case 19:
                return i((aacz) this.a.get());
            default:
                return j((aaqp) this.a.get());
        }
    }
}
