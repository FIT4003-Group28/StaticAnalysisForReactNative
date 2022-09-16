package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.HandlerThread;
import android.provider.Settings;
import com.google.android.apps.youtube.embeddedplayer.service.clientinfo.service.f;
import com.google.android.apps.youtube.embeddedplayer.service.hostappverification.b;
import com.google.android.apps.youtube.embeddedplayer.service.hostappverification.h;
import com.google.android.apps.youtube.embeddedplayer.service.userinfo.service.a;
import com.google.android.apps.youtube.embeddedplayer.service.userinfo.service.d;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: oql  reason: default package */
/* loaded from: classes4.dex */
public final class oql implements axou {
    private final azqb a;
    private final azqb b;
    private final /* synthetic */ int c;

    public oql(azqb azqbVar, azqb azqbVar2) {
        this.a = azqbVar;
        this.b = azqbVar2;
    }

    public oql(azqb azqbVar, azqb azqbVar2, int i) {
        this.c = i;
        this.a = azqbVar;
        this.b = azqbVar2;
    }

    public oql(azqb azqbVar, azqb azqbVar2, int i, byte[] bArr) {
        this.c = i;
        this.b = azqbVar;
        this.a = azqbVar2;
    }

    public oql(azqb azqbVar, azqb azqbVar2, int i, char[] cArr) {
        this.c = i;
        this.b = azqbVar;
        this.a = azqbVar2;
    }

    public oql(azqb azqbVar, azqb azqbVar2, int i, float[] fArr) {
        this.c = i;
        this.b = azqbVar;
        this.a = azqbVar2;
    }

    public oql(azqb azqbVar, azqb azqbVar2, int i, int[] iArr) {
        this.c = i;
        this.b = azqbVar;
        this.a = azqbVar2;
    }

    public oql(azqb azqbVar, azqb azqbVar2, int i, short[] sArr) {
        this.c = i;
        this.b = azqbVar;
        this.a = azqbVar2;
    }

    public oql(azqb azqbVar, azqb azqbVar2, int i, boolean[] zArr) {
        this.c = i;
        this.b = azqbVar;
        this.a = azqbVar2;
    }

    public oql(azqb azqbVar, azqb azqbVar2, int i, byte[][] bArr) {
        this.c = i;
        this.b = azqbVar;
        this.a = azqbVar2;
    }

    public oql(azqb azqbVar, azqb azqbVar2, int i, char[][] cArr) {
        this.c = i;
        this.b = azqbVar;
        this.a = azqbVar2;
    }

    public oql(azqb azqbVar, azqb azqbVar2, int i, short[][] sArr) {
        this.c = i;
        this.b = azqbVar;
        this.a = azqbVar2;
    }

    public static tjv a(tjp tjpVar, wkj wkjVar) {
        return new tjv(tjpVar, wkjVar);
    }

    public static vzm b(ampq ampqVar, azqb azqbVar) {
        vzm vzmVar;
        if (ampqVar.h()) {
            vzmVar = (vzm) ampqVar.c();
        } else {
            vzmVar = (vzm) azqbVar.get();
        }
        axzl.o(vzmVar);
        return vzmVar;
    }

    public static whn c(ampq ampqVar, azqb azqbVar) {
        whn whnVar;
        if (ampqVar.h()) {
            whnVar = (whn) ampqVar.c();
        } else {
            whnVar = (whn) azqbVar.get();
        }
        axzl.o(whnVar);
        return whnVar;
    }

    public static afxq d(Context context, afsm afsmVar) {
        return new afyc(context, afsmVar);
    }

    public static afzo e(wzf wzfVar, wyz wyzVar) {
        afzo afzoVar = new afzo(wzfVar);
        afzoVar.e(wyzVar);
        afzoVar.f(wzc.b);
        afzoVar.f(aiui.b);
        return afzoVar;
    }

    public static wmd f(wwf wwfVar, wme wmeVar) {
        return new wmd(wmeVar);
    }

    public static wnj g(aynx aynxVar, wwf wwfVar) {
        return new wnj(aynxVar, wwfVar);
    }

    public static oql h(azqb azqbVar, azqb azqbVar2) {
        return new oql(azqbVar, azqbVar2, 2);
    }

    public static oql i(azqb azqbVar, azqb azqbVar2) {
        return new oql(azqbVar, azqbVar2, 3);
    }

    public static oql j(azqb azqbVar, azqb azqbVar2) {
        return new oql(azqbVar, azqbVar2, 7);
    }

    public static oql k(azqb azqbVar, azqb azqbVar2) {
        return new oql(azqbVar, azqbVar2, 16, (byte[][]) null);
    }

    public static oql l(azqb azqbVar, azqb azqbVar2) {
        return new oql(azqbVar, azqbVar2, 17, (char[][]) null);
    }

    public static oql m(azqb azqbVar, azqb azqbVar2) {
        return new oql(azqbVar, azqbVar2, 18);
    }

    public static aggi n(azqb azqbVar, azqb azqbVar2) {
        return new aggi(azqbVar, azqbVar2, 1);
    }

    public static oql o(azqb azqbVar, azqb azqbVar2) {
        return new oql(azqbVar, azqbVar2, 19);
    }

    public static oql p(azqb azqbVar, azqb azqbVar2) {
        return new oql(azqbVar, azqbVar2, 20, (short[][]) null);
    }

    @Override // defpackage.azqb
    public final /* bridge */ /* synthetic */ Object get() {
        switch (this.c) {
            case 0:
                return new oqg((f) this.a.get(), true, (String) this.b.get());
            case 1:
                return new oqg((f) this.a.get(), false, (String) this.b.get());
            case 2:
                return new b((h) this.a.get(), (Executor) this.b.get());
            case 3:
                return new com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.service.f(this.a, ((zez) this.b).get());
            case 4:
                return new a((SharedPreferences) this.b.get(), (f) this.a.get());
            case 5:
                return new d((SharedPreferences) this.b.get(), (f) this.a.get());
            case 6:
                sqq sqqVar = new sqq((Context) ((axov) this.b).a, ((sql) this.a).get());
                HandlerThread handlerThread = new HandlerThread("CheckboxObserverThread");
                handlerThread.start();
                sqp sqpVar = new sqp(sqqVar, new rfm(handlerThread.getLooper()));
                sqqVar.a.getContentResolver().registerContentObserver(Settings.Global.getUriFor("multi_cb"), false, sqpVar);
                return sqqVar;
            case 7:
                return a((tjp) this.a.get(), ((wkk) this.b).get());
            case 8:
                vne vneVar = (vne) this.b.get();
                snc sncVar = (snc) this.a.get();
                return new tyq();
            case 9:
                vjf a = vjg.a(((txh) this.a).get());
                a.e("mdd_pds_config");
                a.f(tzc.p("DestFileGroups", (ampq) this.b.get()));
                Uri a2 = a.a();
                axzl.o(a2);
                return a2;
            case 10:
                vjf a3 = vjg.a(((txh) this.a).get());
                a3.e("mdd_pds_config");
                a3.f(tzc.p("DiagFileGroups", (ampq) this.b.get()));
                Uri a4 = a3.a();
                axzl.o(a4);
                return a4;
            case 11:
                vjf a5 = vjg.a(((txh) this.a).get());
                a5.e("mdd_pds_config");
                a5.f(tzc.p("DestSharedFiles", (ampq) this.b.get()));
                Uri a6 = a5.a();
                axzl.o(a6);
                return a6;
            case 12:
                vjf a7 = vjg.a(((txh) this.a).get());
                a7.e("mdd_pds_config");
                a7.f(tzc.p("DiagSharedFiles", (ampq) this.b.get()));
                Uri a8 = a7.a();
                axzl.o(a8);
                return a8;
            case 13:
                return b((ampq) ((axov) this.b).a, this.a);
            case 14:
                return c((ampq) ((axov) this.a).a, this.b);
            case 15:
                return d((Context) ((axov) this.b).a, (afsm) this.a.get());
            case 16:
                return e((wzf) this.b.get(), (wyz) this.a.get());
            case 17:
                return f((wwf) this.b.get(), ((wmf) this.a).get());
            case 18:
                wwf wwfVar = (wwf) this.b.get();
                return new wmt((aafo) this.a.get());
            case 19:
                return n(this.a, this.b);
            default:
                return g((aynx) this.b.get(), (wwf) this.a.get());
        }
    }
}
