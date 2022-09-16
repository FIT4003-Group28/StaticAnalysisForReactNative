package defpackage;

import java.util.Locale;
/* compiled from: PG */
/* renamed from: akth  reason: default package */
/* loaded from: classes.dex */
public final class akth implements zex {
    private final axwx a;
    private final akto b;
    private final acrm c;

    public akth(acrm acrmVar, axwx axwxVar, akto aktoVar) {
        this.c = acrmVar;
        this.a = axwxVar;
        this.b = aktoVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.lang.Throwable] */
    private final void c(String str, String str2, String str3, Exception exc) {
        Boolean bool;
        aqxe aqxeVar = this.a.a.b().C;
        if (aqxeVar == null) {
            aqxeVar = aqxe.a;
        }
        if (aqxeVar.a(45353231L)) {
            aoqp aoqpVar = aqxeVar.b;
            if (!aoqpVar.containsKey(45353231L)) {
                throw new IllegalArgumentException();
            }
            aqxf aqxfVar = (aqxf) aoqpVar.get(45353231L);
            bool = Boolean.valueOf(aqxfVar.b == 1 ? ((Boolean) aqxfVar.c).booleanValue() : false);
        } else {
            bool = false;
        }
        if (!bool.booleanValue()) {
            return;
        }
        if (str2 != null && !"rpc-v1-browse".equals(this.b.a(str2))) {
            return;
        }
        if (exc != null) {
            String valueOf = String.valueOf(exc);
            StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 12 + String.valueOf(valueOf).length());
            sb.append(str3);
            sb.append(" Exception: ");
            sb.append(valueOf);
            str3 = sb.toString();
        }
        String format = String.format(Locale.US, "[%s] %s", str, str3);
        aopa createBuilder = apvv.a.createBuilder();
        aopa createBuilder2 = apvw.a.createBuilder();
        createBuilder2.copyOnWrite();
        apvw apvwVar = (apvw) createBuilder2.instance;
        apvwVar.c = 28;
        apvwVar.b |= 1;
        apvw apvwVar2 = (apvw) createBuilder2.mo39build();
        createBuilder.copyOnWrite();
        apvv apvvVar = (apvv) createBuilder.instance;
        apvwVar2.getClass();
        apvvVar.c = apvwVar2;
        apvvVar.b |= 1;
        aopa createBuilder3 = apvy.a.createBuilder();
        createBuilder3.copyOnWrite();
        apvy apvyVar = (apvy) createBuilder3.instance;
        apvyVar.d = 1;
        apvyVar.b |= 2;
        createBuilder3.copyOnWrite();
        apvy apvyVar2 = (apvy) createBuilder3.instance;
        format.getClass();
        apvyVar2.b |= 1;
        apvyVar2.c = format;
        apvy apvyVar3 = (apvy) createBuilder3.mo39build();
        createBuilder.copyOnWrite();
        apvv apvvVar2 = (apvv) createBuilder.instance;
        apvyVar3.getClass();
        apvvVar2.e = apvyVar3;
        apvvVar2.b |= 4;
        if (exc != null) {
            boolean b = afux.b(exc);
            Exception exc2 = exc;
            if (b) {
                exc2 = afux.a(exc);
            }
            aopa createBuilder4 = apvx.a.createBuilder();
            aopa createBuilder5 = apvt.a.createBuilder();
            aoob byteString = ((angl) anhe.c(exc2).mo39build()).toByteString();
            createBuilder5.copyOnWrite();
            apvt apvtVar = (apvt) createBuilder5.instance;
            apvtVar.b |= 1;
            apvtVar.c = byteString;
            apvt apvtVar2 = (apvt) createBuilder5.mo39build();
            createBuilder4.copyOnWrite();
            apvx apvxVar = (apvx) createBuilder4.instance;
            apvtVar2.getClass();
            apvxVar.c = apvtVar2;
            apvxVar.b = 2;
            createBuilder.copyOnWrite();
            apvv apvvVar3 = (apvv) createBuilder.instance;
            apvx apvxVar2 = (apvx) createBuilder4.mo39build();
            apvxVar2.getClass();
            apvvVar3.d = apvxVar2;
            apvvVar3.b |= 2;
        }
        this.c.a((apvv) createBuilder.mo39build());
    }

    @Override // defpackage.zex
    public final void a(String str, String str2, String str3, Exception exc) {
        c(str, str2, str3, exc);
    }

    @Override // defpackage.zex
    public final void b(String str) {
        c(null, null, str, null);
    }
}
