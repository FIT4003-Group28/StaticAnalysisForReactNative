package defpackage;

import com.google.android.gms.wearable.internal.NodeParcelable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: PG */
/* renamed from: ckuv  reason: default package */
/* loaded from: classes4.dex */
public final class ckuv {
    public final List<ckta> a = new CopyOnWriteArrayList();
    public final List<ckuc> b = new CopyOnWriteArrayList();
    public final Object c = new Object();
    public final Map<String, NodeParcelable> d = new dzqz();
    public final List<NodeParcelable> e = new ArrayList();
    public final ckur f;
    @dzsi
    private String g;

    public ckuv(ckur ckurVar) {
        this.f = ckurVar;
    }

    public static void e(Map<String, NodeParcelable> map, @dzsi String str, List<NodeParcelable> list) {
        if (str == null) {
            dzrn it = ((dzqr) ((dznt) map).values()).iterator();
            while (it.hasNext()) {
                NodeParcelable nodeParcelable = (NodeParcelable) it.next();
                if (nodeParcelable.d) {
                    list.add(nodeParcelable);
                }
            }
        } else if (!map.containsKey(str)) {
        } else {
            list.add(map.get(str));
        }
    }

    public final void a(List<NodeParcelable> list) {
        dzqz dzqzVar = new dzqz();
        for (NodeParcelable nodeParcelable : list) {
            dzqzVar.put(nodeParcelable.a, nodeParcelable);
        }
        d(true, dzqzVar, false, null);
    }

    public final void b(String str, byte[] bArr) {
        synchronized (this.c) {
            this.e.size();
            for (NodeParcelable nodeParcelable : this.e) {
                this.f.a(nodeParcelable.a, str, bArr);
            }
        }
    }

    public final void c(String str, String str2, byte[] bArr) {
        synchronized (this.c) {
            this.f.a(str, str2, bArr);
        }
    }

    public final void d(boolean z, @dzsi Map<String, NodeParcelable> map, boolean z2, @dzsi String str) {
        boolean isEmpty;
        boolean isEmpty2;
        dzru dzruVar;
        synchronized (this.c) {
            if (z) {
                try {
                    this.d.clear();
                    this.d.putAll(map);
                } finally {
                }
            }
            if (z2) {
                this.g = str;
            }
            isEmpty = this.e.isEmpty();
            dzru dzruVar2 = new dzru();
            for (NodeParcelable nodeParcelable : this.e) {
                dzruVar2.add(nodeParcelable.a);
            }
            this.e.clear();
            e(this.d, this.g, this.e);
            isEmpty2 = this.e.isEmpty();
            dzruVar = new dzru();
            for (NodeParcelable nodeParcelable2 : this.e) {
                if (!dzruVar2.contains(nodeParcelable2.a)) {
                    dzruVar.add(nodeParcelable2.a);
                } else {
                    dzruVar2.remove(nodeParcelable2.a);
                }
            }
            dzruVar.addAll(dzruVar2);
        }
        if (isEmpty != isEmpty2) {
            for (ckta cktaVar : this.a) {
                cktaVar.a();
            }
        }
        dzrn it = dzruVar.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            for (ckuc ckucVar : this.b) {
                ckuv ckuvVar = ckucVar.a.c;
                synchronized (ckuvVar.c) {
                    NodeParcelable nodeParcelable3 = ckuvVar.d.get(str2);
                    if (nodeParcelable3 != null) {
                        boolean contains = ckuvVar.e.contains(nodeParcelable3);
                        if (contains) {
                            ckucVar.a.b.b(new ckub(ckucVar, str2), bvrj.WEARABLE_DATA);
                        }
                    }
                }
            }
        }
    }
}
