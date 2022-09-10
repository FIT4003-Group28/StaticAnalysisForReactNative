package defpackage;

import android.content.Intent;
import android.util.Base64;
import com.google.android.apps.gmm.offline.update.OfflineManualDownloadService;
import java.util.EnumSet;
import java.util.concurrent.TimeoutException;
/* compiled from: PG */
/* renamed from: awlg  reason: default package */
/* loaded from: classes3.dex */
public final class awlg implements degu<Object> {
    final /* synthetic */ Intent a;
    final /* synthetic */ dbsg b;
    final /* synthetic */ OfflineManualDownloadService c;

    public awlg(OfflineManualDownloadService offlineManualDownloadService, Intent intent, dbsg dbsgVar) {
        this.c = offlineManualDownloadService;
        this.a = intent;
        this.b = dbsgVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        if (th instanceof TimeoutException) {
            this.c.q.i();
        } else {
            bvoo.j(th);
        }
        this.c.a(this.b, true);
    }

    @Override // defpackage.degu
    public final void b(Object obj) {
        char c;
        final OfflineManualDownloadService offlineManualDownloadService = this.c;
        final Intent intent = this.a;
        final dbsg dbsgVar = this.b;
        intent.getAction();
        String action = intent.getAction();
        int hashCode = action.hashCode();
        if (hashCode == -2131087187) {
            if (action.equals("FetchQueued")) {
                c = 1;
            }
            c = 65535;
        } else if (hashCode != -2117186002) {
            if (hashCode == -1045569284 && action.equals("resumeManualUpdate")) {
                c = 2;
            }
            c = 65535;
        } else {
            if (action.equals("FetchRegion")) {
                c = 0;
            }
            c = 65535;
        }
        if (c == 0 || c == 1) {
            offlineManualDownloadService.c.execute(new Runnable(offlineManualDownloadService, intent, dbsgVar) { // from class: awla
                private final OfflineManualDownloadService a;
                private final Intent b;
                private final dbsg c;

                {
                    this.a = offlineManualDownloadService;
                    this.b = intent;
                    this.c = dbsgVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    dspd dspdVar;
                    char c2;
                    String stringExtra;
                    String stringExtra2;
                    final OfflineManualDownloadService offlineManualDownloadService2 = this.a;
                    Intent intent2 = this.b;
                    dbsg<avid> dbsgVar2 = this.c;
                    String stringExtra3 = intent2.getStringExtra("AccountId");
                    final dlsw b = offlineManualDownloadService2.p.b(offlineManualDownloadService2.o.n(stringExtra3));
                    if (stringExtra3 != null) {
                        dlug dlugVar = null;
                        if (intent2.hasExtra("RegionId")) {
                            byte[] byteArrayExtra = intent2.getByteArrayExtra("RegionId");
                            if (byteArrayExtra == null && (stringExtra2 = intent2.getStringExtra("RegionId")) != null) {
                                byteArrayExtra = Base64.decode(stringExtra2, 0);
                            }
                            dspdVar = dspd.x(byteArrayExtra);
                        } else {
                            dspdVar = null;
                        }
                        if (intent2.hasExtra("Geometry")) {
                            byte[] byteArrayExtra2 = intent2.getByteArrayExtra("Geometry");
                            if (byteArrayExtra2 == null && (stringExtra = intent2.getStringExtra("Geometry")) != null) {
                                byteArrayExtra2 = Base64.decode(stringExtra, 0);
                            }
                            dlugVar = (dlug) bvrs.b(byteArrayExtra2, (dssr) dlug.c.cu(7));
                        }
                        String action2 = intent2.getAction();
                        int hashCode2 = action2.hashCode();
                        if (hashCode2 != -2131087187) {
                            if (hashCode2 == -2117186002 && action2.equals("FetchRegion")) {
                                c2 = 0;
                            }
                            c2 = 65535;
                        } else {
                            if (action2.equals("FetchQueued")) {
                                c2 = 1;
                            }
                            c2 = 65535;
                        }
                        if (c2 != 0) {
                            if (c2 == 1) {
                                offlineManualDownloadService2.i.I(b, offlineManualDownloadService2.u, dbsgVar2, offlineManualDownloadService2.w);
                                return;
                            }
                            bvoo.h("Unknown manual update type, stopping update", new Object[0]);
                            offlineManualDownloadService2.a(dbsgVar2, true);
                            return;
                        }
                        if (dbsgVar2.a()) {
                            bvoo.h("Unexpectedly encountered fetch in FETCH_REGION intent.", new Object[0]);
                        }
                        dbsk.s(dspdVar);
                        dbsk.s(dlugVar);
                        String stringExtra4 = intent2.getStringExtra("Name");
                        final boolean z = offlineManualDownloadService2.u;
                        final avii aviiVar = offlineManualDownloadService2.w;
                        bvqj.c(deee.g(deew.h(degp.q(offlineManualDownloadService2.i.Q(dspdVar, dlugVar, stringExtra4, b)), new dbrn(offlineManualDownloadService2, b, z, aviiVar) { // from class: awlb
                            private final OfflineManualDownloadService a;
                            private final dlsw b;
                            private final boolean c;
                            private final avii d;

                            {
                                this.a = offlineManualDownloadService2;
                                this.b = b;
                                this.c = z;
                                this.d = aviiVar;
                            }

                            @Override // defpackage.dbrn
                            public final Object a(Object obj2) {
                                OfflineManualDownloadService offlineManualDownloadService3 = this.a;
                                Void r5 = (Void) obj2;
                                offlineManualDownloadService3.i.I(this.b, this.c, dbpy.a, this.d);
                                EnumSet<cvhz> enumSet = awmj.a;
                                return null;
                            }
                        }, offlineManualDownloadService2.c), avlo.class, new dbrn(aviiVar) { // from class: awlc
                            private final avii a;

                            {
                                this.a = aviiVar;
                            }

                            @Override // defpackage.dbrn
                            public final Object a(Object obj2) {
                                avii aviiVar2 = this.a;
                                dcqe dcqeVar = OfflineManualDownloadService.a;
                                int i = ((avlo) obj2).a.e;
                                aviiVar2.a(avih.FAILURE);
                                EnumSet<cvhz> enumSet = awmj.a;
                                return null;
                            }
                        }, offlineManualDownloadService2.c), awld.a, offlineManualDownloadService2.c);
                        return;
                    }
                    offlineManualDownloadService2.a(dbsgVar2, true);
                }
            });
        } else if (c == 2) {
            offlineManualDownloadService.c.execute(new Runnable(offlineManualDownloadService) { // from class: awle
                private final OfflineManualDownloadService a;

                {
                    this.a = offlineManualDownloadService;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    OfflineManualDownloadService offlineManualDownloadService2 = this.a;
                    offlineManualDownloadService2.i.J(offlineManualDownloadService2.w);
                }
            });
        } else {
            this.c.a(this.b, true);
        }
    }
}
