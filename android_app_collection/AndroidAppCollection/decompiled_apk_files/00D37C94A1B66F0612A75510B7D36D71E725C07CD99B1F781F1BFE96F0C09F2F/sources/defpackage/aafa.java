package defpackage;

import android.os.Bundle;
/* compiled from: PG */
/* renamed from: aafa  reason: default package */
/* loaded from: classes.dex */
public final class aafa implements Ctry {
    private final azqb a;
    private final azqb b;
    private final vne c;

    public aafa(azqb azqbVar, vne vneVar, azqb azqbVar2) {
        this.a = azqbVar;
        this.c = vneVar;
        this.b = azqbVar2;
    }

    @Override // defpackage.Ctry
    public final void a(final String str, final long j, final int i, ampq ampqVar) {
        if (!((Boolean) this.a.get()).booleanValue()) {
            return;
        }
        ylx.m(this.c.b(new ampg() { // from class: aaez
            @Override // defpackage.ampg
            public final Object apply(Object obj) {
                aafa aafaVar = aafa.this;
                String str2 = str;
                long j2 = j;
                int i2 = i;
                tzt tztVar = (tzt) obj;
                aoqp aoqpVar = tztVar.b;
                boolean z = j2 != (aoqpVar.containsKey(str2) ? ((Long) aoqpVar.get(str2)).longValue() : -1L);
                aafaVar.b(str2, j2, i2, z);
                if (z) {
                    aopa mo52toBuilder = tztVar.mo52toBuilder();
                    mo52toBuilder.copyOnWrite();
                    ((tzt) mo52toBuilder.instance).a().remove(str2);
                    mo52toBuilder.copyOnWrite();
                    ((tzt) mo52toBuilder.instance).a().put(str2, Long.valueOf(j2));
                    return (tzt) mo52toBuilder.mo39build();
                }
                return tztVar;
            }
        }, anjk.a), new ylv() { // from class: aaey
            @Override // defpackage.zdt
            /* renamed from: b */
            public final void a(Throwable th) {
                aafa.this.b(str, j, i, false);
            }
        });
    }

    public final void b(String str, long j, int i, boolean z) {
        trw trwVar = new trw();
        trwVar.a = true;
        trwVar.b = true;
        trwVar.c = false;
        Boolean bool = trwVar.a;
        if (bool == null || trwVar.b == null || trwVar.c == null) {
            StringBuilder sb = new StringBuilder();
            if (trwVar.a == null) {
                sb.append(" requiresDeviceIdle");
            }
            if (trwVar.b == null) {
                sb.append(" requiresCharging");
            }
            if (trwVar.c == null) {
                sb.append(" requiresBatteryNotLow");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        trx trxVar = new trx(bool.booleanValue(), trwVar.b.booleanValue(), trwVar.c.booleanValue());
        Bundle bundle = new Bundle();
        bundle.putString("MDD_TASK_TAG_KEY", str);
        ((yjs) this.b.get()).d(str, j, j, z, i == 1 ? 1 : i == 2 ? 2 : 0, trxVar.a, bundle, null);
    }
}
