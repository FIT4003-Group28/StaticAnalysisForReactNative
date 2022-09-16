package defpackage;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: agka  reason: default package */
/* loaded from: classes.dex */
public final class agka {
    public final azqb a;
    public final azqb b;
    public final snc c;
    public final aglj d;

    public agka(azqb azqbVar, azqb azqbVar2, aglj agljVar, snc sncVar) {
        agljVar.getClass();
        this.d = agljVar;
        azqbVar2.getClass();
        this.b = azqbVar2;
        azqbVar.getClass();
        this.a = azqbVar;
        sncVar.getClass();
        this.c = sncVar;
    }

    public final boolean a(String str, List list) {
        ylr.b();
        if (list != null) {
            try {
                if (!list.isEmpty()) {
                    return this.d.F(str, list);
                }
            } catch (IOException e) {
                StringBuilder sb = new StringBuilder(str.length() + 48);
                sb.append("Error saving ad breaks for ad [originalVideoId=");
                sb.append(str);
                sb.append("]");
                zep.d(sb.toString(), e);
                return false;
            }
        }
        this.d.F(str, Collections.emptyList());
        return false;
    }
}
