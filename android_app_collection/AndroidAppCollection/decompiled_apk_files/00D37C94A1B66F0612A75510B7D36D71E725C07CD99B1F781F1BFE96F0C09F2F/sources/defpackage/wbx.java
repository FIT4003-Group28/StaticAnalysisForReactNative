package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: wbx  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class wbx implements ajry {
    public final /* synthetic */ wby a;
    private final /* synthetic */ int b;

    public /* synthetic */ wbx(wby wbyVar) {
        this.a = wbyVar;
    }

    public /* synthetic */ wbx(wby wbyVar, int i) {
        this.b = i;
        this.a = wbyVar;
    }

    @Override // defpackage.ajry
    public final ajru b(ViewGroup viewGroup) {
        int i = this.b;
        if (i == 0) {
            wby wbyVar = this.a;
            return wbyVar.ag.a(wbyVar.ae, viewGroup);
        } else if (i == 1) {
            wby wbyVar2 = this.a;
            return wbyVar2.af.a(wbyVar2.ae, viewGroup);
        } else if (i == 2) {
            wby wbyVar3 = this.a;
            return wbyVar3.ah.a(wbyVar3.ae, viewGroup);
        } else if (i == 3) {
            wby wbyVar4 = this.a;
            wcm wcmVar = wbyVar4.ai;
            wcb wcbVar = wbyVar4.ae;
            Context context = (Context) wcmVar.a.get();
            context.getClass();
            afvn afvnVar = (afvn) wcmVar.b.get();
            afvnVar.getClass();
            wal walVar = (wal) wcmVar.c.get();
            walVar.getClass();
            wbg wbgVar = (wbg) wcmVar.d.get();
            wbgVar.getClass();
            Activity activity = (Activity) wcmVar.e.get();
            activity.getClass();
            Handler handler = (Handler) wcmVar.f.get();
            handler.getClass();
            ((wgd) wcmVar.h.get()).getClass();
            wcbVar.getClass();
            return new wcl(context, afvnVar, walVar, wbgVar, activity, handler, (wcv) wcmVar.g.get(), wcbVar, wbyVar4);
        } else {
            wby wbyVar5 = this.a;
            return wbyVar5.aj.a(wbyVar5.ae, viewGroup);
        }
    }
}
