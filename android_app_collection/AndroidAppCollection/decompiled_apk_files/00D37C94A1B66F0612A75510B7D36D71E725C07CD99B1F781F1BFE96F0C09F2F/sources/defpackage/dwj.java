package defpackage;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
/* compiled from: PG */
/* renamed from: dwj  reason: default package */
/* loaded from: classes3.dex */
public final class dwj implements dwh {
    public static final amzy a = amzy.l("com/google/android/apps/search/assistant/platform/appintegration/client/GrpcConnector");
    private static final aybz c = aybz.b(new ComponentName("com.google.android.googlequicksearchbox", "com.google.android.apps.search.assistant.platform.appintegration.endpoint.AppIntegrationService"));
    public final sma b;
    private final String d;
    private final smb e;
    private aynl f;
    private final aynl g;

    public dwj(Context context, sma smaVar) {
        aoeb a2 = aoeb.a((Application) context.getApplicationContext(), c);
        a2.d = new aodx(qsf.b(context));
        ayal c2 = a2.c.c();
        String packageName = context.getPackageName();
        this.g = new dwi(this);
        this.e = (smb) smb.b(new amnr(1), c2);
        this.d = packageName;
        this.b = smaVar;
    }

    @Override // defpackage.dwh
    public final int a() {
        return d() ? 3 : 0;
    }

    @Override // defpackage.dwh
    public final void b(smr smrVar) {
        aopa createBuilder = smd.a.createBuilder();
        createBuilder.copyOnWrite();
        smd smdVar = (smd) createBuilder.instance;
        smrVar.getClass();
        smdVar.d = smrVar;
        smdVar.b |= 2;
        if ((smrVar.b & 16) != 0) {
            smk smkVar = smrVar.f;
            if (smkVar == null) {
                smkVar = smk.c();
            }
            if (smkVar.a().equals(smj.NAVIGATION_STATE_CHANGED)) {
                createBuilder.copyOnWrite();
                smd.a((smd) createBuilder.instance);
            }
        }
        this.f.c((smd) createBuilder.mo39build());
    }

    @Override // defpackage.dwh
    public final boolean c(smr smrVar) {
        ((amzw) ((amzw) a.b()).i("com/google/android/apps/search/assistant/platform/appintegration/client/GrpcConnector", "connect", 87, "GrpcConnector.java")).q("#connect");
        if (tio.a.compareAndSet(false, true)) {
            aymw.c(aoos.b());
        }
        smb smbVar = this.e;
        aynl aynlVar = this.g;
        axye axyeVar = smbVar.a;
        ayax ayaxVar = smc.a;
        if (ayaxVar == null) {
            synchronized (smc.class) {
                ayaxVar = smc.a;
                if (ayaxVar == null) {
                    ayau a2 = ayax.a();
                    a2.c = ayaw.BIDI_STREAMING;
                    a2.d = ayax.c("java.com.google.android.libraries.assistant.appintegration.shared.grpc.AppIntegrationService", "StartSession");
                    a2.b();
                    a2.a = aymw.b(smd.a);
                    a2.b = aymw.b(sme.a);
                    ayaxVar = a2.a();
                    smc.a = ayaxVar;
                }
            }
        }
        aynl b = aynh.b(axyeVar.a(ayaxVar, smbVar.b), aynlVar);
        this.f = b;
        aopa createBuilder = smd.a.createBuilder();
        createBuilder.copyOnWrite();
        smd smdVar = (smd) createBuilder.instance;
        smrVar.getClass();
        smdVar.d = smrVar;
        smdVar.b |= 2;
        String str = this.d;
        createBuilder.copyOnWrite();
        smd smdVar2 = (smd) createBuilder.instance;
        str.getClass();
        smdVar2.b |= 1;
        smdVar2.c = str;
        createBuilder.copyOnWrite();
        smd.a((smd) createBuilder.instance);
        b.c((smd) createBuilder.mo39build());
        this.b.e.a();
        return true;
    }

    @Override // defpackage.dwh
    public final boolean d() {
        return this.f != null;
    }
}
