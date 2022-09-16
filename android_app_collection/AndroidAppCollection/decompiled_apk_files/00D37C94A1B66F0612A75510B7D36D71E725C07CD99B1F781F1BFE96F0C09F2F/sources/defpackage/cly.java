package defpackage;

import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: cly  reason: default package */
/* loaded from: classes2.dex */
final class cly {
    public final Map a = new HashMap();
    public final clx b = new clx();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(String str) {
        clw clwVar;
        synchronized (this) {
            clwVar = (clw) this.a.get(str);
            hy.N(clwVar);
            int i = clwVar.b;
            if (i > 0) {
                int i2 = i - 1;
                clwVar.b = i2;
                if (i2 == 0) {
                    clw clwVar2 = (clw) this.a.remove(str);
                    if (clwVar2.equals(clwVar)) {
                        clx clxVar = this.b;
                        synchronized (clxVar.a) {
                            if (clxVar.a.size() < 10) {
                                clxVar.a.offer(clwVar2);
                            }
                        }
                    } else {
                        String valueOf = String.valueOf(clwVar);
                        String valueOf2 = String.valueOf(clwVar2);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 79 + String.valueOf(valueOf2).length() + str.length());
                        sb.append("Removed the wrong lock, expected to remove: ");
                        sb.append(valueOf);
                        sb.append(", but actually removed: ");
                        sb.append(valueOf2);
                        sb.append(", safeKey: ");
                        sb.append(str);
                        throw new IllegalStateException(sb.toString());
                    }
                }
            } else {
                StringBuilder sb2 = new StringBuilder(str.length() + 81);
                sb2.append("Cannot release a lock that is not held, safeKey: ");
                sb2.append(str);
                sb2.append(", interestedThreads: ");
                sb2.append(i);
                throw new IllegalStateException(sb2.toString());
            }
        }
        clwVar.a.unlock();
    }
}
