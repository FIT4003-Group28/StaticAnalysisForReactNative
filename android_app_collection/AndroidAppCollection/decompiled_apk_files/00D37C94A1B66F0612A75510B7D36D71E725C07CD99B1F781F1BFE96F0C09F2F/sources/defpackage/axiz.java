package defpackage;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
/* compiled from: PG */
/* renamed from: axiz  reason: default package */
/* loaded from: classes2.dex */
public class axiz implements Iterator, Closeable, j$.util.Iterator, cvx {
    public static final cvs p = new axiy();
    protected cvo q;
    public axja r;
    public cvs s = null;
    long t = 0;
    long u = 0;
    long v = 0;
    public List w = new ArrayList();

    static {
        axlg.d(axiz.class);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.r.close();
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // defpackage.cvx
    public final ByteBuffer h(long j, long j2) {
        ByteBuffer e;
        axja axjaVar = this.r;
        if (axjaVar != null) {
            synchronized (axjaVar) {
                e = this.r.e(this.u + j, j2);
            }
            return e;
        }
        ByteBuffer allocate = ByteBuffer.allocate(axds.p(j2));
        long j3 = j + j2;
        long j4 = 0;
        for (cvs cvsVar : this.w) {
            long b = cvsVar.b() + j4;
            if (b > j && j4 < j3) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                WritableByteChannel newChannel = Channels.newChannel(byteArrayOutputStream);
                cvsVar.e(newChannel);
                newChannel.close();
                if (j4 >= j && b <= j3) {
                    allocate.put(byteArrayOutputStream.toByteArray());
                } else if (j4 < j && b > j3) {
                    long j5 = j - j4;
                    allocate.put(byteArrayOutputStream.toByteArray(), axds.p(j5), axds.p((cvsVar.b() - j5) - (b - j3)));
                } else if (j4 < j && b <= j3) {
                    long j6 = j - j4;
                    allocate.put(byteArrayOutputStream.toByteArray(), axds.p(j6), axds.p(cvsVar.b() - j6));
                } else if (j4 >= j && b > j3) {
                    allocate.put(byteArrayOutputStream.toByteArray(), 0, axds.p(cvsVar.b() - (b - j3)));
                }
            }
            j4 = b;
        }
        return (ByteBuffer) allocate.rewind();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        cvs cvsVar = this.s;
        if (cvsVar == p) {
            return false;
        }
        if (cvsVar != null) {
            return true;
        }
        try {
            this.s = mo416next();
            return true;
        } catch (NoSuchElementException unused) {
            this.s = p;
            return false;
        }
    }

    @Override // defpackage.cvx
    public final List i() {
        return (this.r == null || this.s == p) ? this.w : new axlf(this.w, this);
    }

    @Override // defpackage.cvx
    public final List j(Class cls) {
        List i = i();
        ArrayList arrayList = null;
        cvs cvsVar = null;
        for (int i2 = 0; i2 < i.size(); i2++) {
            cvs cvsVar2 = (cvs) i.get(i2);
            if (cls.isInstance(cvsVar2)) {
                if (cvsVar == null) {
                    cvsVar = cvsVar2;
                } else {
                    if (arrayList == null) {
                        arrayList = new ArrayList(2);
                        arrayList.add(cvsVar);
                    }
                    arrayList.add(cvsVar2);
                }
            }
        }
        if (arrayList != null) {
            return arrayList;
        }
        if (cvsVar != null) {
            return Collections.singletonList(cvsVar);
        }
        return Collections.emptyList();
    }

    @Override // defpackage.cvx
    public final void k(WritableByteChannel writableByteChannel) {
        for (cvs cvsVar : i()) {
            cvsVar.e(writableByteChannel);
        }
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public void t(axja axjaVar, long j, cvo cvoVar) {
        this.r = axjaVar;
        long b = axjaVar.b();
        this.u = b;
        this.t = b;
        axjaVar.f(axjaVar.b() + j);
        this.v = axjaVar.b();
        this.q = cvoVar;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("[");
        for (int i = 0; i < this.w.size(); i++) {
            if (i > 0) {
                sb.append(";");
            }
            sb.append(((cvs) this.w.get(i)).toString());
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final long u() {
        long j = 0;
        for (int i = 0; i < i().size(); i++) {
            j += ((cvs) this.w.get(i)).b();
        }
        return j;
    }

    public final void w(cvs cvsVar) {
        if (cvsVar != null) {
            this.w = new ArrayList(i());
            cvsVar.g(this);
            this.w.add(cvsVar);
        }
    }

    public final List x(Class cls) {
        ArrayList arrayList = new ArrayList(2);
        List i = i();
        for (int i2 = 0; i2 < i.size(); i2++) {
            cvs cvsVar = (cvs) i.get(i2);
            if (cls.isInstance(cvsVar)) {
                arrayList.add(cvsVar);
            }
        }
        return arrayList;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    /* renamed from: v */
    public final cvs mo416next() {
        cvs a;
        cvs cvsVar = this.s;
        if (cvsVar != null && cvsVar != p) {
            this.s = null;
            return cvsVar;
        }
        axja axjaVar = this.r;
        if (axjaVar == null || this.t >= this.v) {
            this.s = p;
            throw new NoSuchElementException();
        }
        try {
            synchronized (axjaVar) {
                this.r.f(this.t);
                a = this.q.a(this.r, this);
                this.t = this.r.b();
            }
            return a;
        } catch (EOFException unused) {
            throw new NoSuchElementException();
        } catch (IOException unused2) {
            throw new NoSuchElementException();
        }
    }
}
