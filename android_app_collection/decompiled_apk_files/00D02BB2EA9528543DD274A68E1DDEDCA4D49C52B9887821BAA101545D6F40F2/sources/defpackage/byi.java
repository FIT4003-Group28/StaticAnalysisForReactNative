package defpackage;

import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: byi  reason: default package */
/* loaded from: classes.dex */
final class byi {
    public final Map<String, byg> a = new HashMap();
    public final byh b = new byh();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(String str) {
        byg bygVar;
        synchronized (this) {
            bygVar = this.a.get(str);
            cjn.b(bygVar);
            int i = bygVar.b;
            if (i > 0) {
                int i2 = i - 1;
                bygVar.b = i2;
                if (i2 == 0) {
                    byg remove = this.a.remove(str);
                    if (remove.equals(bygVar)) {
                        byh byhVar = this.b;
                        synchronized (byhVar.a) {
                            if (byhVar.a.size() < 10) {
                                byhVar.a.offer(remove);
                            }
                        }
                    } else {
                        String valueOf = String.valueOf(bygVar);
                        String valueOf2 = String.valueOf(remove);
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
        bygVar.a.unlock();
    }
}
