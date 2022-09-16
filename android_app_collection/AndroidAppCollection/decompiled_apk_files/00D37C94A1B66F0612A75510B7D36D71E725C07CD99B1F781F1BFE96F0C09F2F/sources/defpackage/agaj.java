package defpackage;

import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.service.notification.StatusBarNotification;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: agaj  reason: default package */
/* loaded from: classes.dex */
public final class agaj {
    public final ampq a;
    private final Context b;
    private final ampq c;
    private final agft d;
    private final agdb e;
    private final agdc f;
    private final Executor g;
    private final azqb h;
    private final aadd i;
    private final acti j;
    private final agci k;

    public agaj(Context context, ampq ampqVar, agft agftVar, agdb agdbVar, agdc agdcVar, Executor executor, ampq ampqVar2, azqb azqbVar, aadd aaddVar, acti actiVar, agci agciVar) {
        this.b = context;
        this.c = ampqVar;
        this.d = agftVar;
        this.e = agdbVar;
        this.f = agdcVar;
        this.g = executor;
        this.a = ampqVar2;
        this.h = azqbVar;
        this.i = aaddVar;
        this.j = actiVar;
        this.k = agciVar;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, aoqu] */
    private static aoqu b(aorb aorbVar, byte[] bArr) {
        try {
            return aorbVar.n(bArr, aoos.b());
        } catch (aopx unused) {
            return null;
        }
    }

    private final void c(final List list) {
        if (list != null) {
            this.g.execute(new Runnable() { // from class: agai
                @Override // java.lang.Runnable
                public final void run() {
                    agaj agajVar = agaj.this;
                    ((aafo) ((ampv) agajVar.a).a).e(list, null);
                }
            });
        }
    }

    private static boolean d(Class cls, String str) {
        return cls.getName().equals(str);
    }

    public final void a(byte[] bArr, String str) {
        agda agdaVar;
        aton atonVar;
        int i;
        asla aslaVar = null;
        if (d(apgq.class, str)) {
            apgq apgqVar = (apgq) b(apgq.a.getParserForType(), bArr);
            this.k.a(atom.NOTAIRE_EVENT_TYPE_PAYLOAD_PROCESSING_STARTED, apgqVar);
            boolean z = (apgqVar == null || apgqVar.m.size() == 0) ? false : true;
            if (z) {
                c(apgqVar.m);
                this.k.a(atom.NOTAIRE_EVENT_TYPE_COMMANDS_EXECUTED, apgqVar);
            }
            if (!agel.h(apgqVar) && !agel.i(apgqVar, (ajxz) ((ampv) this.c).a)) {
                if (z) {
                    return;
                }
                this.k.a(atom.NOTAIRE_EVENT_TYPE_PAYLOAD_NOT_VALID_2, apgqVar);
                return;
            }
            this.k.a(atom.NOTAIRE_EVENT_TYPE_NOTIFICATION_BUILDING_STARTED, apgqVar);
            if ((apgqVar.b & 32768) != 0) {
                this.j.d(acuo.a(28631), null, null);
            }
            agdb agdbVar = this.e;
            agdc agdcVar = this.f;
            acti actiVar = this.j;
            Iterator it = agdbVar.a.iterator();
            while (true) {
                if (it.hasNext()) {
                    agcv agcvVar = (agcv) ((WeakReference) it.next()).get();
                    if (agcvVar == null) {
                        it.remove();
                    } else if (agcvVar.a(apgqVar)) {
                        break;
                    }
                } else if (agel.h(apgqVar) || agel.i(apgqVar, (ajxz) ((ampv) agdcVar.b).a)) {
                    apgm apgmVar = apgqVar.e;
                    if (apgmVar == null) {
                        apgmVar = apgm.a;
                    }
                    String str2 = apgmVar.c;
                    apgm apgmVar2 = apgqVar.e;
                    if (apgmVar2 == null) {
                        apgmVar2 = apgm.a;
                    }
                    aged b = aged.b(str2, apgmVar2.d, zhn.o());
                    fi fiVar = new fi(agdcVar.a);
                    for (ageb agebVar : agdcVar.c) {
                        agebVar.a(apgqVar, actiVar, b, fiVar);
                    }
                    agee.d(fiVar, b);
                    agcz agczVar = new agcz(fiVar.b(), b);
                    asvv asvvVar = apgqVar.u;
                    if (asvvVar == null) {
                        asvvVar = asvv.b;
                    }
                    agdaVar = new agda(agczVar, asvvVar);
                }
            }
            agdaVar = null;
            if (agdaVar != null) {
                Context context = this.b;
                azqb azqbVar = this.h;
                aadd aaddVar = this.i;
                acti actiVar2 = this.j;
                agci agciVar = this.k;
                if ((apgqVar.b & 16384) != 0) {
                    atonVar = apgqVar.t;
                    if (atonVar == null) {
                        atonVar = aton.a;
                    }
                } else {
                    atonVar = null;
                }
                agdaVar.a.a(context, false);
                agcj.f(azqbVar, "POSTED", aaddVar);
                if (agciVar != null) {
                    agciVar.b(atom.NOTAIRE_EVENT_TYPE_NOTIFICATION_POSTED, atonVar);
                }
                asvv asvvVar2 = agdaVar.b;
                if (asvvVar2 != null && (1 & asvvVar2.c) != 0) {
                    acte acteVar = new acte(asvvVar2.d);
                    ((acsx) actiVar2).D(acteVar);
                    actiVar2.u(acteVar, null);
                }
                if ((apgqVar.b & 32) != 0) {
                    aafo aafoVar = (aafo) ((ampv) this.a).a;
                    apzg apzgVar = apgqVar.j;
                    if (apzgVar == null) {
                        apzgVar = apzg.a;
                    }
                    aafoVar.c(apzgVar, null);
                }
                if (Build.VERSION.SDK_INT >= 23 && (i = apgqVar.r) > 0) {
                    Context context2 = this.b;
                    acti actiVar3 = this.j;
                    NotificationManager notificationManager = (NotificationManager) context2.getSystemService("notification");
                    StatusBarNotification[] l = ahfe.l(context2);
                    int length = l.length - i;
                    if (length > 0) {
                        Arrays.sort(l, utr.m);
                        for (int i2 = 0; i2 < length; i2++) {
                            StatusBarNotification statusBarNotification = l[i2];
                            ahfe.j(actiVar3, statusBarNotification.getNotification());
                            notificationManager.cancel(statusBarNotification.getTag(), statusBarNotification.getId());
                        }
                    }
                }
                c(apgqVar.l);
                return;
            }
            this.k.a(atom.NOTAIRE_EVENT_TYPE_NOTIFICATION_DID_NOT_BUILD, apgqVar);
            zep.l("System notification suppressed or failed to build.");
        } else if (d(apkb.class, str)) {
            apkb apkbVar = (apkb) b(apkb.a.getParserForType(), bArr);
            if (apkbVar == null) {
                return;
            }
            c(apkbVar.b);
        } else if (d(aslb.class, str)) {
            try {
                aslb aslbVar = (aslb) aopi.parseFrom(aslb.a, bArr, aoos.b());
                if ((aslbVar.b & 1) == 0) {
                    return;
                }
                agft agftVar = this.d;
                askz askzVar = aslbVar.c;
                if (askzVar == null) {
                    askzVar = askz.a;
                }
                asky askyVar = askzVar.c;
                if (askyVar == null) {
                    askyVar = asky.a;
                }
                String str3 = askyVar.e;
                askz askzVar2 = aslbVar.c;
                if (askzVar2 == null) {
                    askzVar2 = askz.a;
                }
                if ((askzVar2.b & 2) != 0) {
                    askz askzVar3 = aslbVar.c;
                    if (askzVar3 == null) {
                        askzVar3 = askz.a;
                    }
                    aslaVar = askzVar3.d;
                    if (aslaVar == null) {
                        aslaVar = asla.a;
                    }
                }
                agftVar.d(str3, aslaVar);
            } catch (aopx unused) {
            }
        } else {
            zep.b("Unknown renderer type.");
        }
    }
}
