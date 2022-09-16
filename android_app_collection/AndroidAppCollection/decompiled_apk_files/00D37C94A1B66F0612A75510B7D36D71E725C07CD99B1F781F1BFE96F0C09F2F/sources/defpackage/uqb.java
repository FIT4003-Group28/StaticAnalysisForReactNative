package defpackage;

import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: uqb  reason: default package */
/* loaded from: classes4.dex */
public final class uqb {
    public static /* synthetic */ String a(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "FALSE" : "TRUE" : "UNKNOWN";
    }

    public static int b(int i) {
        if (i != 0) {
            if (i == 32) {
                return 0;
            }
            if (i == 48) {
                return 1;
            }
            return i != 120 ? 2 : 3;
        }
        throw null;
    }

    public static final aomr c(List list) {
        aopa createBuilder = aomr.a.createBuilder();
        createBuilder.copyOnWrite();
        aomr aomrVar = (aomr) createBuilder.instance;
        aomrVar.e = 2;
        aomrVar.b |= 4;
        createBuilder.copyOnWrite();
        aomr aomrVar2 = (aomr) createBuilder.instance;
        aomrVar2.c = 4;
        aomrVar2.b |= 1;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                createBuilder.copyOnWrite();
                aomr aomrVar3 = (aomr) createBuilder.instance;
                aomrVar3.f = 2;
                aomrVar3.b |= 8;
                break;
            }
            aolx aolxVar = ((ucw) it.next()).d.k;
            if (aolxVar == null) {
                aolxVar = aolx.a;
            }
            if (aolxVar.f) {
                break;
            }
        }
        return (aomr) createBuilder.mo39build();
    }
}
