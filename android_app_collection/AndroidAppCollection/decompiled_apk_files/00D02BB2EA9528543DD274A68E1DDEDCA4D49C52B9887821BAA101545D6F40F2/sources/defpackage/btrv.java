package defpackage;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: btrv  reason: default package */
/* loaded from: classes.dex */
public final class btrv {
    public final bvrb a;
    private final Map<Class<?>, bvrj> b = new HashMap();

    public btrv(bvrb bvrbVar) {
        this.a = bvrbVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized bvrj a(Class<?> cls, Collection<btrs> collection) {
        bvrj bvrjVar = this.b.get(cls);
        if (bvrjVar == null) {
            bvrj bvrjVar2 = bvrj.CURRENT;
            for (btrs btrsVar : collection) {
                bvrj bvrjVar3 = btrsVar.b;
                if (bvrjVar3 != bvrjVar2 && bvrjVar3 != bvrj.CURRENT) {
                    if (bvrjVar2 != bvrj.CURRENT) {
                        String valueOf = String.valueOf(cls);
                        String valueOf2 = String.valueOf(bvrjVar2);
                        String valueOf3 = String.valueOf(bvrjVar3);
                        int length = String.valueOf(valueOf).length();
                        StringBuilder sb = new StringBuilder(length + 72 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
                        sb.append("Listener classes must be handled on a single thread, but ");
                        sb.append(valueOf);
                        sb.append(" has two: ");
                        sb.append(valueOf2);
                        sb.append(" and ");
                        sb.append(valueOf3);
                        throw new IllegalArgumentException(sb.toString());
                    }
                    bvrjVar2 = bvrjVar3;
                }
            }
            if (bvrjVar2 == bvrj.BACKGROUND_THREADPOOL || bvrjVar2 == bvrj.OFFLINE_REGION_PROCESSING_THREADPOOL) {
                String valueOf4 = String.valueOf(cls);
                String valueOf5 = String.valueOf(bvrjVar2);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf4).length() + 39 + String.valueOf(valueOf5).length());
                sb2.append("Can't register listener ");
                sb2.append(valueOf4);
                sb2.append(" on threadpool ");
                sb2.append(valueOf5);
                throw new IllegalArgumentException(sb2.toString());
            }
            this.b.put(cls, bvrjVar2);
            return bvrjVar2;
        }
        return bvrjVar;
    }
}
