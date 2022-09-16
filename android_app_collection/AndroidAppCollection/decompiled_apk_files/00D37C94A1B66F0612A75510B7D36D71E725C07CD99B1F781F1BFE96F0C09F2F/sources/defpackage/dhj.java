package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: dhj  reason: default package */
/* loaded from: classes3.dex */
public class dhj extends dhl implements Cloneable, dbb, dan {
    private static final AtomicInteger k = new AtomicInteger(0);
    public dhj a;
    public boolean b;
    public dhk c;
    public Map d;
    public final String e;
    public final int f = k.getAndIncrement();
    public int g;
    public List h;
    public String i;
    public final String j;

    /* JADX INFO: Access modifiers changed from: protected */
    public dhj(String str) {
        this.e = str;
        this.j = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Map b(dhj dhjVar) {
        HashMap hashMap = new HashMap();
        if (dhjVar == null) {
            return hashMap;
        }
        List list = dhjVar.h;
        if (list == null) {
            String valueOf = String.valueOf(dhjVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 37);
            sb.append("Children of current section ");
            sb.append(valueOf);
            sb.append(" is null!");
            throw new IllegalStateException(sb.toString());
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            dhj dhjVar2 = (dhj) list.get(i);
            hashMap.put(dhjVar2.i, new jj(dhjVar2, Integer.valueOf(i)));
        }
        return hashMap;
    }

    public static void c(dhj dhjVar) {
        dhjVar.b = true;
        dhj dhjVar2 = dhjVar.a;
        if (dhjVar2 != null) {
            c(dhjVar2);
        }
    }

    public dhj a(boolean z) {
        try {
            dhj dhjVar = (dhj) super.clone();
            if (!z) {
                if (dhjVar.h != null) {
                    dhjVar.h = new ArrayList();
                }
                dhjVar.g = 0;
                dhjVar.b = false;
                dhjVar.d = null;
            }
            return dhjVar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean d(dhj dhjVar) {
        throw null;
    }

    @Override // defpackage.dan
    public /* bridge */ /* synthetic */ boolean f(Object obj) {
        throw null;
    }

    @Override // defpackage.dbb
    public final dap l() {
        return this;
    }
}
