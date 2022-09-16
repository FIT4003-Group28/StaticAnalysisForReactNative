package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
/* compiled from: PG */
/* renamed from: ugu  reason: default package */
/* loaded from: classes4.dex */
public final class ugu extends ugt {
    private final ufs b;
    private final ucv c;

    public ugu(ufs ufsVar, ucv ucvVar) {
        this.b = ufsVar;
        this.c = ucvVar;
    }

    @Override // defpackage.ugt
    public final ufr a(Bundle bundle, aomk aomkVar) {
        ufr a;
        aolf aolfVar;
        uca ucaVar;
        aoki aokiVar;
        ucd ucdVar;
        String str;
        String string = bundle.getString("com.google.android.libraries.notifications.ACCOUNT_NAME");
        boolean z = bundle.getInt("com.google.android.libraries.notifications.internal.scheduled.impl.INTENT_EXTRA_INCLUDE_TARGET") == 1;
        List<ucu> b = this.c.b(string, 6);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (ucu ucuVar : b) {
            try {
                aolfVar = (aolf) ((aopa) aolf.a.mo52toBuilder().mo35mergeFrom(ucuVar.b)).mo39build();
                ucaVar = new uca();
                aokiVar = aolfVar.c;
                if (aokiVar == null) {
                    aokiVar = aoki.a;
                }
                ucdVar = new ucd();
                str = aokiVar.c;
            } catch (aopx e) {
                uev.c("SetUserPreferenceHandler", e, "Failed to parse PreferenceEntry from ChimeTaskData", new Object[0]);
            }
            if (str != null) {
                ucdVar.a = str;
                if (!aokiVar.d.isEmpty()) {
                    ucdVar.b = aokiVar.d;
                }
                String str2 = ucdVar.a;
                if (str2 == null) {
                    throw new IllegalStateException("Missing required properties: key");
                }
                ucaVar.a = new uce(str2, ucdVar.b);
                int c = aolu.c(aolfVar.d);
                if (c == 0) {
                    c = 1;
                }
                int i = c - 1;
                int i2 = 2;
                if (i == 1) {
                    i2 = 3;
                } else if (i != 2) {
                    i2 = 1;
                }
                ucaVar.b = i2;
                uce uceVar = ucaVar.a;
                if (uceVar != null) {
                    ucc uccVar = new ucc(uceVar, i2);
                    linkedHashMap.put(uccVar.a, uccVar);
                } else {
                    StringBuilder sb = new StringBuilder();
                    if (ucaVar.a == null) {
                        sb.append(" preferenceKey");
                    }
                    if (ucaVar.b == 0) {
                        sb.append(" preference");
                    }
                    String valueOf = String.valueOf(sb);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
                    sb2.append("Missing required properties:");
                    sb2.append(valueOf);
                    throw new IllegalStateException(sb2.toString());
                }
            } else {
                throw new NullPointerException("Null key");
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.values());
        if (!arrayList.isEmpty()) {
            ufs ufsVar = this.b;
            ucb ucbVar = new ucb();
            ucbVar.a = arrayList;
            List list = ucbVar.a;
            if (list == null) {
                throw new IllegalStateException("Missing required properties: preferenceEntries");
            }
            a = ufsVar.g(string, new ucf(list), z, aomkVar);
        } else {
            ufq c2 = ufr.c();
            c2.c = new IllegalArgumentException("No preferences to set.");
            c2.b(false);
            a = c2.a();
        }
        if (!a.b() || !a.d) {
            this.c.d(string, b);
        }
        return a;
    }

    @Override // defpackage.ugt
    protected final String b() {
        return "SetUserPrereferenceCallback";
    }

    @Override // defpackage.ujj
    public final String f() {
        return "RPC_SET_USER_PREFERENCE";
    }
}
