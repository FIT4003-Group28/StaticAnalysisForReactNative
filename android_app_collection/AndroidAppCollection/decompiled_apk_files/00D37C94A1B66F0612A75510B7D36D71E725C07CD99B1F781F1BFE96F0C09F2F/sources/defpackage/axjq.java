package defpackage;

import java.io.IOException;
import java.lang.ref.SoftReference;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: axjq  reason: default package */
/* loaded from: classes2.dex */
public final class axjq extends AbstractList {
    cvx a;
    cvq[] b;
    cxd c;
    cxl d;
    private SoftReference[] e;
    private List f;
    private int[] h;
    private Map g = new HashMap();
    private int i = -1;

    public axjq(long j, cvx cvxVar, cvq... cvqVarArr) {
        this.c = null;
        this.d = null;
        this.a = cvxVar;
        this.b = cvqVarArr;
        for (cxd cxdVar : axli.b(cvxVar, "moov[0]/trak")) {
            if (cxdVar.n().a == j) {
                this.c = cxdVar;
            }
        }
        if (this.c == null) {
            StringBuilder sb = new StringBuilder(52);
            sb.append("This MP4 does not contain track ");
            sb.append(j);
            throw new RuntimeException(sb.toString());
        }
        for (cxl cxlVar : axli.b(cvxVar, "moov[0]/mvex[0]/trex")) {
            if (cxlVar.a == this.c.n().a) {
                this.d = cxlVar;
            }
        }
        this.e = (SoftReference[]) Array.newInstance(SoftReference.class, size());
        if (this.f != null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (cxj cxjVar : this.a.j(cxj.class)) {
            for (cxn cxnVar : cxjVar.j(cxn.class)) {
                if (cxnVar.l().a == this.c.n().a) {
                    arrayList.add(cxnVar);
                }
            }
        }
        cvq[] cvqVarArr2 = this.b;
        this.f = arrayList;
        this.h = new int[arrayList.size()];
        int i = 1;
        for (int i2 = 0; i2 < this.f.size(); i2++) {
            this.h[i2] = i;
            List i3 = ((cxn) this.f.get(i2)).i();
            int i4 = 0;
            for (int i5 = 0; i5 < i3.size(); i5++) {
                cvs cvsVar = (cvs) i3.get(i5);
                if (cvsVar instanceof cxq) {
                    i4 += axds.p(((cxq) cvsVar).k());
                }
            }
            i += i4;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v20, types: [cvx] */
    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        long j;
        axjg axjgVar;
        SoftReference softReference = this.e[i];
        if (softReference == null || (axjgVar = (axjg) softReference.get()) == null) {
            int i2 = i + 1;
            int length = this.h.length;
            do {
                length--;
            } while (i2 - this.h[length] < 0);
            cxn cxnVar = (cxn) this.f.get(length);
            int i3 = i2 - this.h[length];
            cxj cxjVar = (cxj) cxnVar.m;
            int i4 = 0;
            for (cvs cvsVar : cxnVar.i()) {
                if (cvsVar instanceof cxq) {
                    cxq cxqVar = (cxq) cvsVar;
                    int i5 = i3 - i4;
                    if (cxqVar.c.size() < i5) {
                        i4 += cxqVar.c.size();
                    } else {
                        List<cxp> list = cxqVar.c;
                        cxo l = cxnVar.l();
                        boolean p = cxqVar.p();
                        int r = l.r() & 16;
                        long j2 = 0;
                        if (p) {
                            j = 0;
                        } else if (r != 0) {
                            j = l.d;
                        } else {
                            cxl cxlVar = this.d;
                            if (cxlVar != null) {
                                j = cxlVar.c;
                            } else {
                                throw new RuntimeException("File doesn't contain trex box but track fragments aren't fully self contained. Cannot determine sample size.");
                            }
                        }
                        SoftReference softReference2 = (SoftReference) this.g.get(cxqVar);
                        ByteBuffer byteBuffer = softReference2 != null ? (ByteBuffer) softReference2.get() : null;
                        if (byteBuffer == null) {
                            cxj cxjVar2 = cxjVar;
                            if ((l.r() & 1) != 0) {
                                j2 = l.b;
                                cxjVar2 = cxjVar.m;
                            }
                            if (cxqVar.l()) {
                                j2 += cxqVar.a;
                            }
                            int i6 = 0;
                            for (cxp cxpVar : list) {
                                i6 = p ? (int) (i6 + cxpVar.b) : (int) (i6 + j);
                            }
                            try {
                                byteBuffer = cxjVar2.h(j2, i6);
                                this.g.put(cxqVar, new SoftReference(byteBuffer));
                            } catch (IOException e) {
                                throw new RuntimeException(e);
                            }
                        }
                        int i7 = 0;
                        for (int i8 = 0; i8 < i5; i8++) {
                            i7 = (int) (p ? i7 + ((cxp) list.get(i8)).b : i7 + j);
                        }
                        if (p) {
                            j = ((cxp) list.get(i5)).b;
                        }
                        axjp axjpVar = new axjp(j, byteBuffer, i7);
                        this.e[i] = new SoftReference(axjpVar);
                        return axjpVar;
                    }
                }
            }
            throw new RuntimeException("Couldn't find sample in the traf I was looking");
        }
        return axjgVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        int i = this.i;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (cxj cxjVar : this.a.j(cxj.class)) {
            for (cxn cxnVar : cxjVar.j(cxn.class)) {
                if (cxnVar.l().a == this.c.n().a) {
                    i2 = (int) (i2 + ((cxq) cxnVar.j(cxq.class).get(0)).k());
                }
            }
        }
        int length = this.b.length;
        this.i = i2;
        return i2;
    }
}
