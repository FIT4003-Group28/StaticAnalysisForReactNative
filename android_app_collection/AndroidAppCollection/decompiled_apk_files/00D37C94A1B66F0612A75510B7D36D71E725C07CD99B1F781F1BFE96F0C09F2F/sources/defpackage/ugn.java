package defpackage;

import android.content.Context;
import android.os.Bundle;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: ugn  reason: default package */
/* loaded from: classes4.dex */
public final class ugn implements ugj {
    private final Context a;
    private final ujk b;
    private final ucv c;
    private final axnm d;
    private final axnm e;
    private final axnm f;
    private final axnm g;
    private final axnm h;

    static {
        Charset.forName("UTF-8");
    }

    public ugn(Context context, ujk ujkVar, ucv ucvVar, axnm axnmVar, axnm axnmVar2, axnm axnmVar3, axnm axnmVar4, axnm axnmVar5) {
        this.a = context;
        this.b = ujkVar;
        this.c = ucvVar;
        this.d = axnmVar;
        this.e = axnmVar2;
        this.f = axnmVar3;
        this.g = axnmVar4;
        this.h = axnmVar5;
    }

    @Override // defpackage.ugj
    public final void a(ucp ucpVar, long j, aomb aombVar) {
        boolean z = ucpVar != null;
        uwp.e();
        aqxo.p(z);
        String str = ucpVar.b;
        Bundle bundle = new Bundle();
        bundle.putString("com.google.android.libraries.notifications.ACCOUNT_NAME", str);
        bundle.putLong("com.google.android.libraries.notifications.INTENT_EXTRA_SYNC_VERSION", j);
        bundle.putInt("com.google.android.libraries.notifications.NOTIFICATIONS_FETCH_REASON", aombVar.j);
        ugr ugrVar = (ugr) this.e.get();
        if (!uid.d(this.a)) {
            uev.e("ChimeScheduledRpcHelperImpl", "App not targeting Android O. Calling [%s] RPC in the current thread.", "RPC_FETCH_UPDATED_THREADS");
            ugrVar.e(bundle);
            return;
        }
        try {
            this.b.a(ucpVar, 2, ugrVar, bundle);
        } catch (uji unused) {
            uev.g("ChimeScheduledRpcHelperImpl", "Error scheduling RPC via GcoreGcmNetworkManager. Calling [%s] RPC in the current thread", "RPC_FETCH_UPDATED_THREADS");
            ugrVar.e(bundle);
        }
    }

    @Override // defpackage.ugj
    public final void b(ucp ucpVar, aomr aomrVar, String str, uec uecVar, List list) {
        boolean z = ucpVar != null;
        uwp.e();
        aqxo.p(z);
        aqxo.p(!list.isEmpty());
        String str2 = ucpVar.b;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aolq aolqVar = (aolq) it.next();
            aopa createBuilder = uiq.a.createBuilder();
            createBuilder.copyOnWrite();
            uiq uiqVar = (uiq) createBuilder.instance;
            aolqVar.getClass();
            uiqVar.a();
            uiqVar.c.add(aolqVar);
            createBuilder.copyOnWrite();
            uiq uiqVar2 = (uiq) createBuilder.instance;
            aomrVar.getClass();
            uiqVar2.d = aomrVar;
            uiqVar2.b |= 1;
            createBuilder.copyOnWrite();
            uiq uiqVar3 = (uiq) createBuilder.instance;
            str.getClass();
            int i = 4;
            uiqVar3.b |= 4;
            uiqVar3.f = str;
            uec uecVar2 = uec.SYSTEM_TRAY;
            int ordinal = uecVar.ordinal();
            if (ordinal == 0) {
                i = 2;
            } else if (ordinal == 1) {
                i = 3;
            } else if (ordinal != 2) {
                i = 1;
            }
            createBuilder.copyOnWrite();
            uiq uiqVar4 = (uiq) createBuilder.instance;
            uiqVar4.e = i - 1;
            uiqVar4.b |= 2;
            this.c.a(str2, 100, ((uiq) createBuilder.mo39build()).toByteArray());
        }
        Bundle bundle = new Bundle();
        bundle.putString("com.google.android.libraries.notifications.ACCOUNT_NAME", str2);
        ugm ugmVar = (ugm) this.h.get();
        try {
            this.b.b(ucpVar, 100, ugmVar, bundle, 5000L);
        } catch (uji unused) {
            uev.g("ChimeScheduledRpcHelperImpl", "Error scheduling RPC via GcoreGcmNetworkManager. Calling [%s] RPC in the current thread", "RPC_BATCH_UPDATE_THREAD_STATE");
            ugmVar.e(bundle);
        }
    }

    @Override // defpackage.ugj
    public final void c(ucp ucpVar, aomb aombVar) {
        boolean z = ucpVar != null;
        uwp.e();
        aqxo.p(z);
        String str = ucpVar.b;
        Bundle bundle = new Bundle();
        bundle.putString("com.google.android.libraries.notifications.ACCOUNT_NAME", str);
        bundle.putLong("com.google.android.libraries.notifications.INTENT_EXTRA_PAGE_VERSION", 0L);
        bundle.putInt("com.google.android.libraries.notifications.NOTIFICATIONS_FETCH_REASON", aombVar.j);
        ugq ugqVar = (ugq) this.d.get();
        if (!uid.d(this.a)) {
            uev.e("ChimeScheduledRpcHelperImpl", "App not targeting Android O. Calling [%s] RPC in the current thread.", "RPC_FETCH_LATEST_THREADS");
            ugqVar.e(bundle);
            return;
        }
        try {
            this.b.a(ucpVar, 2, ugqVar, bundle);
        } catch (uji unused) {
            uev.g("ChimeScheduledRpcHelperImpl", "Error scheduling RPC via GcoreGcmNetworkManager. Calling [%s] RPC in the current thread", "RPC_FETCH_LATEST_THREADS");
            ugqVar.e(bundle);
        }
    }

    @Override // defpackage.ugj
    public final void d(ucp ucpVar) {
        uwp.e();
        aqxo.p(true);
        String str = ucpVar.b;
        Bundle bundle = new Bundle();
        bundle.putString("com.google.android.libraries.notifications.ACCOUNT_NAME", str);
        ugs ugsVar = (ugs) this.f.get();
        try {
            this.b.a(ucpVar, 1, ugsVar, bundle);
            uby ubyVar = uby.a;
        } catch (uji unused) {
            uev.g("ChimeScheduledRpcHelperImpl", "Error scheduling RPC via GcoreGcmNetworkManager. Calling [%s] RPC in the current thread", "RPC_REMOVE_TARGET");
            ugsVar.e(bundle);
        }
    }

    @Override // defpackage.ugj
    public final void e(ucp ucpVar, aomi aomiVar) {
        uwp.e();
        aqxo.p(true);
        String str = ucpVar.b;
        Bundle bundle = new Bundle();
        bundle.putString("com.google.android.libraries.notifications.ACCOUNT_NAME", str);
        bundle.putInt("com.google.android.libraries.notifications.REGISTRATION_REASON", aomiVar.l);
        ugv ugvVar = (ugv) this.g.get();
        try {
            this.b.a(ucpVar, 1, ugvVar, bundle);
            uby ubyVar = uby.a;
        } catch (uji unused) {
            uev.g("ChimeScheduledRpcHelperImpl", "Error scheduling RPC via GcoreGcmNetworkManager. Calling [%s] RPC in the current thread", "RPC_STORE_TARGET");
            ugvVar.e(bundle);
        }
    }
}
