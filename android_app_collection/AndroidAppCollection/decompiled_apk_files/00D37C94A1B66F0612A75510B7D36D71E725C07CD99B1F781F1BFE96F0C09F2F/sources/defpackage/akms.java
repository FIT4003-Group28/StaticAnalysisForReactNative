package defpackage;

import com.google.protos.youtube.api.innertube.SharingProviderDataCommandOuterClass$SharingProviderDataCommand;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: akms  reason: default package */
/* loaded from: classes.dex */
public final class akms implements aafl {
    public static final String a = zep.a("SharingProviderDataCommandResolver");
    public final aafo b;
    private final Executor c;
    private final aaun d;

    public akms(aafo aafoVar, Executor executor, aaun aaunVar) {
        aafoVar.getClass();
        this.b = aafoVar;
        executor.getClass();
        this.c = executor;
        aaunVar.getClass();
        this.d = aaunVar;
    }

    public static final void b(Map map, boolean z) {
        akmk akmkVar = (akmk) zew.K(map, "com.google.android.libraries.youtube.innertube.endpoint.tag", akmk.class);
        if (akmkVar == null) {
            return;
        }
        if (z) {
            akmkVar.i();
        } else {
            akmkVar.h();
        }
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, final Map map) {
        final SharingProviderDataCommandOuterClass$SharingProviderDataCommand sharingProviderDataCommandOuterClass$SharingProviderDataCommand = (SharingProviderDataCommandOuterClass$SharingProviderDataCommand) apzgVar.qm(SharingProviderDataCommandOuterClass$SharingProviderDataCommand.sharingProviderDataCommand);
        boolean z = sharingProviderDataCommandOuterClass$SharingProviderDataCommand.d;
        aaun aaunVar = this.d;
        String str = sharingProviderDataCommandOuterClass$SharingProviderDataCommand.c;
        anjk anjkVar = anjk.a;
        aauv aauvVar = new aauv(aaunVar.e, aaunVar.a.c());
        aauvVar.a = str;
        ylx.k(aaunVar.c(arua.a, aaunVar.b, aass.r, aauh.h).b(aauvVar, anjkVar), this.c, new ylv() { // from class: akmq
            @Override // defpackage.zdt
            /* renamed from: b */
            public final void a(Throwable th) {
                apzg apzgVar2;
                akms akmsVar = akms.this;
                SharingProviderDataCommandOuterClass$SharingProviderDataCommand sharingProviderDataCommandOuterClass$SharingProviderDataCommand2 = sharingProviderDataCommandOuterClass$SharingProviderDataCommand;
                Map map2 = map;
                if ((sharingProviderDataCommandOuterClass$SharingProviderDataCommand2.b & 8) != 0) {
                    apzgVar2 = sharingProviderDataCommandOuterClass$SharingProviderDataCommand2.f;
                    if (apzgVar2 == null) {
                        apzgVar2 = apzg.a;
                    }
                } else {
                    apzgVar2 = null;
                }
                zep.f(akms.a, "Could not get story sharing metadata.", th);
                akms.b(map2, false);
                if (apzgVar2 != null) {
                    akmsVar.b.a(apzgVar2);
                }
            }
        }, new ylw() { // from class: akmr
            @Override // defpackage.ylw, defpackage.zdt
            public final void a(Object obj) {
                akms akmsVar = akms.this;
                Map map2 = map;
                arua aruaVar = (arua) obj;
                if ((aruaVar.b & 2) == 0) {
                    akms.b(map2, false);
                    return;
                }
                aafo aafoVar = akmsVar.b;
                apzg apzgVar2 = aruaVar.d;
                if (apzgVar2 == null) {
                    apzgVar2 = apzg.a;
                }
                aafoVar.a(apzgVar2);
                akms.b(map2, true);
            }
        });
        if ((sharingProviderDataCommandOuterClass$SharingProviderDataCommand.b & 4) != 0) {
            aafo aafoVar = this.b;
            apzg apzgVar2 = sharingProviderDataCommandOuterClass$SharingProviderDataCommand.e;
            if (apzgVar2 == null) {
                apzgVar2 = apzg.a;
            }
            aafoVar.a(apzgVar2);
        }
    }
}
