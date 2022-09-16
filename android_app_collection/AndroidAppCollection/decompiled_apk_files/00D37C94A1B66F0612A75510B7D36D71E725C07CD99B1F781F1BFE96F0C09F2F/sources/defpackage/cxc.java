package defpackage;

import java.lang.ref.SoftReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
/* compiled from: PG */
/* renamed from: cxc  reason: default package */
/* loaded from: classes3.dex */
public final class cxc extends axix {
    static final Map a = new WeakHashMap();
    public List b;

    public cxc() {
        super("stts");
        this.b = Collections.emptyList();
    }

    public static synchronized long[] k(List list) {
        long[] jArr;
        synchronized (cxc.class) {
            SoftReference softReference = (SoftReference) a.get(list);
            if (softReference == null || (jArr = (long[]) softReference.get()) == null) {
                Iterator it = list.iterator();
                long j = 0;
                while (it.hasNext()) {
                    j += ((cxb) it.next()).a;
                }
                long[] jArr2 = new long[(int) j];
                Iterator it2 = list.iterator();
                int i = 0;
                while (it2.hasNext()) {
                    cxb cxbVar = (cxb) it2.next();
                    int i2 = 0;
                    while (i2 < cxbVar.a) {
                        jArr2[i] = cxbVar.b;
                        i2++;
                        i++;
                    }
                }
                a.put(list, new SoftReference(jArr2));
                return jArr2;
            }
            return jArr;
        }
    }

    @Override // defpackage.axiv
    protected final long h() {
        return (this.b.size() * 8) + 8;
    }

    @Override // defpackage.axiv
    public final void i(ByteBuffer byteBuffer) {
        u(byteBuffer);
        int p = axds.p(hy.I(byteBuffer));
        this.b = new ArrayList(p);
        for (int i = 0; i < p; i++) {
            this.b.add(new cxb(hy.I(byteBuffer), hy.I(byteBuffer)));
        }
    }

    @Override // defpackage.axiv
    protected final void j(ByteBuffer byteBuffer) {
        t(byteBuffer);
        hy.y(byteBuffer, this.b.size());
        for (cxb cxbVar : this.b) {
            hy.y(byteBuffer, cxbVar.a);
            hy.y(byteBuffer, cxbVar.b);
        }
    }

    public final String toString() {
        int size = this.b.size();
        StringBuilder sb = new StringBuilder(39);
        sb.append("TimeToSampleBox[entryCount=");
        sb.append(size);
        sb.append("]");
        return sb.toString();
    }
}
