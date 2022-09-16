package defpackage;

import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: agyq  reason: default package */
/* loaded from: classes.dex */
public final class agyq {
    private final Map a = new HashMap();
    private final Map b = new HashMap();
    private int c = 0;
    private int d = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized agxp a(String str) {
        return (agxp) this.a.get(str);
    }

    public final synchronized agxp b(String str) {
        agxp agxpVar = (agxp) this.a.remove(str);
        if (agxpVar != null) {
            Integer num = (Integer) this.b.remove(str);
            if (num == null) {
                return agxpVar;
            }
            if (num.intValue() != 1 && num.intValue() != 3 && num.intValue() != 4 && num.intValue() != 7 && num.intValue() != 6) {
                if (num.intValue() == 2) {
                    this.d--;
                    return agxpVar;
                }
            }
            this.c--;
        }
        return agxpVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized boolean c(int i) {
        if (i == 1 || i == 3 || i == 4 || i == 7 || i == 5 || i == 6) {
            return this.c <= 0;
        } else if (i == 2) {
            return this.d <= 0;
        } else {
            StringBuilder sb = new StringBuilder(34);
            sb.append("Invalid transfer type: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized boolean d(String str) {
        return this.a.containsKey(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized boolean e(String str, agxp agxpVar, int i) {
        if (!c(i)) {
            return false;
        }
        this.a.put(str, agxpVar);
        this.b.put(str, Integer.valueOf(i));
        if (i != 1 && i != 3 && i != 4 && i != 7 && i != 6) {
            if (i == 2) {
                this.d++;
            }
            return true;
        }
        this.c++;
        return true;
    }
}
