package defpackage;

import android.content.Intent;
import j$.util.Optional;
import java.util.List;
/* compiled from: PG */
/* renamed from: agec  reason: default package */
/* loaded from: classes.dex */
public final class agec {
    public static void a(Intent intent, apzg apzgVar, acti actiVar, boolean z) {
        if (apzgVar == null) {
            return;
        }
        if (actiVar != null && z) {
            aopa createBuilder = atnp.a.createBuilder();
            String k = actiVar.k();
            createBuilder.copyOnWrite();
            atnp atnpVar = (atnp) createBuilder.instance;
            k.getClass();
            atnpVar.b |= 1;
            atnpVar.c = k;
            aopc aopcVar = (aopc) apzgVar.mo52toBuilder();
            aopcVar.e(atno.b, (atnp) createBuilder.mo39build());
            apzgVar = (apzg) aopcVar.mo39build();
        }
        intent.putExtra("navigation_endpoint", apzgVar.toByteArray());
    }

    public static asvv b(byte[] bArr) {
        if (bArr != null && bArr.length != 0) {
            try {
                return (asvv) aopi.parseFrom(asvv.b, bArr, aoos.b());
            } catch (aopx unused) {
            }
        }
        return null;
    }

    public static void c(Intent intent, asvv asvvVar) {
        if (asvvVar == null) {
            return;
        }
        intent.putExtra("logging_directive", asvvVar.toByteArray());
    }

    public static void d(Intent intent, aoxp aoxpVar) {
        if (aoxpVar == null) {
            return;
        }
        intent.putExtra("identity_token", aoxpVar.toByteArray());
    }

    public static final Optional e(uct uctVar) {
        return g(uctVar.f, apgj.a);
    }

    public static final Optional f(List list) {
        if (list.isEmpty()) {
            zep.b("There are no notifications to get the payload from.");
            return Optional.empty();
        } else if (list.size() > 1) {
            zep.b("There is more than one notification, must be a group summary (not supported).");
            return Optional.empty();
        } else {
            return g(((ucw) arey.t(list)).h, apgl.a);
        }
    }

    private static final Optional g(aono aonoVar, aoso aosoVar) {
        ampq ampqVar;
        if (aonoVar == null) {
            zep.b("The payload is absent.");
            return Optional.empty();
        }
        try {
            aoos b = aoos.b();
            if (((aosp) aosoVar).a == aosq.c(aonoVar.b)) {
                ampqVar = ampq.j(((aosp) aosoVar).b.k(aonoVar.c, b));
            } else {
                ampqVar = amon.a;
            }
            return Optional.ofNullable((aoqu) ampqVar.f());
        } catch (aopx unused) {
            zep.b("The payload has wrong format/type.");
            return Optional.empty();
        }
    }
}
