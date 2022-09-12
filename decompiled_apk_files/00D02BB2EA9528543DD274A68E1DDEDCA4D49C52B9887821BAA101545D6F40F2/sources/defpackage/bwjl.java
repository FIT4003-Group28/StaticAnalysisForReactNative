package defpackage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: bwjl  reason: default package */
/* loaded from: classes4.dex */
public final class bwjl {
    public static final dcqe a = dcqe.c("bwjl");
    public final ckcw b;
    public final bvjj c;
    public final buxy d;
    public final dxio<akfa> e;
    public final Map<bwno, List<bwjj>> f = new HashMap();

    public bwjl(ckcw ckcwVar, bvjj bvjjVar, buxy buxyVar, dxio<akfa> dxioVar) {
        this.b = ckcwVar;
        this.c = bvjjVar;
        this.d = buxyVar;
        this.e = dxioVar;
    }

    public final synchronized void a(bwjj bwjjVar) {
        for (Map.Entry<bwno, List<bwjj>> entry : this.f.entrySet()) {
            do {
            } while (entry.getValue().remove(bwjjVar));
        }
    }
}
