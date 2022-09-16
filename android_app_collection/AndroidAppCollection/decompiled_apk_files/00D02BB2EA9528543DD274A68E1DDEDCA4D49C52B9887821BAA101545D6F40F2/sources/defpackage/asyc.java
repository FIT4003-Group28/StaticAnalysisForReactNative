package defpackage;

import android.app.Activity;
import android.content.Context;
import com.google.android.apps.maps.R;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: asyc  reason: default package */
/* loaded from: classes2.dex */
public final class asyc {
    public static final /* synthetic */ int a = 0;
    private static final long b = TimeUnit.SECONDS.toMillis(10);

    public static atsr a(Activity activity) {
        return audy.c(activity);
    }

    public static asky b(Context context, akox akoxVar, cqat cqatVar) {
        asky askyVar = new asky(akoxVar, context.getResources(), cqatVar);
        askyVar.e = b;
        return askyVar;
    }

    public static atzg c(bvrb bvrbVar, btrm btrmVar, cqat cqatVar, btvo btvoVar, cjqq cjqqVar, aufc aufcVar, asmp asmpVar, akox akoxVar, Context context) {
        return new atzk(context, bvrbVar, btrmVar, cqatVar, btvoVar, cjqqVar, aufcVar, asmpVar, 1, akoxVar.aj(), new aluu(btvoVar.getVectorMapsParameters().h, context.getResources().getColor(R.color.ad_badge_background_yellow), btvoVar.getCategoricalSearchParameters().u()));
    }

    public static asxk d(dxio<cref> dxioVar, ckcw ckcwVar, btvo btvoVar, cqat cqatVar, asmn asmnVar, asxw asxwVar, Context context, btrm btrmVar, bvjj bvjjVar, akfa akfaVar, akox akoxVar, broq broqVar, bvrb bvrbVar, atzg atzgVar, final brdi brdiVar, atyq atyqVar) {
        brdiVar.getClass();
        return new asxk(cqatVar, ckcwVar, asmnVar, asxwVar, btrmVar, broqVar, akoxVar, bvrbVar, akfaVar, bvjjVar, dxioVar, context, atzgVar, new brcw(brdiVar) { // from class: asyb
            private final brdi a;

            {
                this.a = brdiVar;
            }

            @Override // defpackage.brcw
            public final void a() {
                this.a.c();
            }
        }, btvoVar, atyqVar);
    }

    public static List<asmo> e(asxm asxmVar, aswi aswiVar, askx askxVar, asxe asxeVar, asxg asxgVar, aszs aszsVar, aswn aswnVar, aslx aslxVar, asxk asxkVar, @dzsi aslu asluVar) {
        dccx F = dcdc.F();
        F.g(asxmVar);
        F.g(aswiVar);
        F.g(askxVar);
        F.g(asxeVar);
        F.g(asxgVar);
        F.g(aszsVar);
        F.g(aswnVar);
        F.g(aslxVar);
        F.g(asxkVar);
        if (asluVar != null) {
            F.g(asluVar);
        }
        return F.f();
    }

    public static askx f(asvx asvxVar, asxw asxwVar, Context context, akox akoxVar, asky askyVar, araj arajVar, asmk asmkVar, btvo btvoVar, cjqq cjqqVar) {
        return new askx(context.getResources(), akoxVar, asmkVar, arajVar.m(), asvxVar, asxwVar, askyVar, btvoVar, cjqqVar);
    }

    @dzsi
    public static aslu g(btvo btvoVar, awpj awpjVar, asmp asmpVar) {
        if (btvoVar.getNavigationParameters().t()) {
            return new aslu(awpjVar.e(), asmpVar);
        }
        return null;
    }

    public static asxe h(asxu asxuVar, asxw asxwVar, btrm btrmVar, askx askxVar, akox akoxVar, dxio<qbt> dxioVar, cjqy cjqyVar, aufc aufcVar, dxio<ania> dxioVar2, Executor executor) {
        return new asxd(asxuVar, asxwVar, btrmVar, askxVar, akoxVar, dxioVar.a().f(), cjqyVar, aufcVar, dxioVar2, executor);
    }

    public static aswi i(btrm btrmVar, bvjj bvjjVar, araj arajVar, aufc aufcVar, asxw asxwVar, Executor executor, asvx asvxVar) {
        return new aswi(btrmVar, bvjjVar, arajVar.n(), asxwVar, aufcVar, executor, asvxVar);
    }
}
