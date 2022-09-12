package defpackage;

import com.google.android.gms.wearable.internal.NodeParcelable;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: cktk  reason: default package */
/* loaded from: classes4.dex */
public final class cktk {
    public final btrm a;
    public boolean c;
    @dzsi
    public String d;
    private final ckuv f;
    public final Object b = new Object();
    public final cktj e = new cktj(this);

    public cktk(btrm btrmVar, ckuv ckuvVar) {
        dbsk.l(true);
        dbsk.s(btrmVar);
        this.a = btrmVar;
        dbsk.s(ckuvVar);
        this.f = ckuvVar;
    }

    public final void a() {
        synchronized (this.b) {
            if (this.c) {
                this.c = false;
                this.a.a(this.e);
            }
            ckxq bZ = ckxs.c.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ckxs ckxsVar = (ckxs) bZ.b;
            ckxsVar.b = 1;
            ckxsVar.a = 1 | ckxsVar.a;
            ckuv ckuvVar = this.f;
            String str = this.d;
            byte[] bS = bZ.bK().bS();
            synchronized (ckuvVar.c) {
                ArrayList<NodeParcelable> arrayList = new ArrayList();
                ckuv.e(ckuvVar.d, str, arrayList);
                arrayList.size();
                for (NodeParcelable nodeParcelable : arrayList) {
                    ckuvVar.f.a(nodeParcelable.a, "/navigation_start_failed", bS);
                }
            }
        }
    }
}
