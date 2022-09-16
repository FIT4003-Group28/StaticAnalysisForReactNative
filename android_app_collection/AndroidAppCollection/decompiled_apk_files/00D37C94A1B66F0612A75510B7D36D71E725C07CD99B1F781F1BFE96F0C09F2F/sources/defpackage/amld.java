package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: amld  reason: default package */
/* loaded from: classes.dex */
public final class amld implements ammd, veo {
    private final amkl a;

    public amld(amkl amklVar) {
        this.a = amklVar;
    }

    @Override // defpackage.veo
    public final ankt a() {
        if (this.a.a().isEmpty()) {
            return ankq.a;
        }
        int i = 0;
        int i2 = 0;
        for (ammq ammqVar : ((amup) this.a.a()).values()) {
            int i3 = i2 + 1;
            StringBuilder sb = new StringBuilder(18);
            sb.append("Trace: ");
            sb.append(i2);
            Log.println(4, "trace_manager", sb.toString());
            if ((ammqVar.b & 16) != 0) {
                amku amkuVar = ammqVar.h;
                if (amkuVar == null) {
                    amkuVar = amku.a;
                }
                if ((amkuVar.b & 2) != 0) {
                    Locale locale = Locale.US;
                    Object[] objArr = new Object[2];
                    objArr[i] = ((amlo) ammqVar.e.get(i)).c;
                    amks amksVar = amkuVar.d;
                    if (amksVar == null) {
                        amksVar = amks.a;
                    }
                    objArr[1] = Integer.valueOf(amksVar.d);
                    Log.println(4, "trace_manager", String.format(locale, "Trace %s timed out before completion. %s spans remaining", objArr));
                }
                if ((amkuVar.b & 1) != 0) {
                    Locale locale2 = Locale.US;
                    Object[] objArr2 = new Object[2];
                    objArr2[i] = ((amlo) ammqVar.e.get(i)).c;
                    amkt amktVar = amkuVar.c;
                    if (amktVar == null) {
                        amktVar = amkt.a;
                    }
                    objArr2[1] = Integer.valueOf(amktVar.c);
                    Log.println(4, "trace_manager", String.format(locale2, "Trace %s tried to log too many spans. %s spans dropped", objArr2));
                }
            }
            agb agbVar = new agb();
            for (amlo amloVar : ammqVar.e) {
                agbVar.k(amloVar.d, amloVar);
            }
            ArrayList arrayList = new ArrayList();
            for (int i4 = 0; i4 < agbVar.c(); i4++) {
                amlo amloVar2 = (amlo) agbVar.h(i4);
                long j = amloVar2.d;
                long j2 = amloVar2.g;
                StringBuilder sb2 = new StringBuilder(23);
                sb2.append(j2);
                sb2.append(" ms");
                String sb3 = sb2.toString();
                while (true) {
                    amlo amloVar3 = (amlo) agbVar.f(j);
                    if (amloVar3 == null) {
                        String valueOf = String.valueOf(sb3);
                        sb3 = valueOf.length() != 0 ? "Orphaned Root > ".concat(valueOf) : new String("Orphaned Root > ");
                    } else {
                        j = amloVar3.e;
                        String str = amloVar3.c;
                        StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(sb3).length());
                        sb4.append(str);
                        sb4.append(" > ");
                        sb4.append(sb3);
                        sb3 = sb4.toString();
                        if (j != -1) {
                        }
                    }
                }
                arrayList.add(String.format(Locale.US, "%06d\t%s", Long.valueOf(amloVar2.f), sb3));
            }
            Collections.sort(arrayList);
            int size = arrayList.size();
            for (int i5 = 0; i5 < size; i5++) {
                Log.println(4, "trace_manager", (String) arrayList.get(i5));
            }
            i2 = i3;
            i = 0;
        }
        return ankq.a;
    }

    @Override // defpackage.ammd
    public final void b() {
    }
}
