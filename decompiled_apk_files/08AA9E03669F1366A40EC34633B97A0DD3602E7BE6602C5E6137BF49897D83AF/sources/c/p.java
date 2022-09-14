package c;

import org.spongycastle.asn1.cmp.PKIFailureInfo;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Segment.java */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    final byte[] f1319a;

    /* renamed from: b  reason: collision with root package name */
    int f1320b;

    /* renamed from: c  reason: collision with root package name */
    int f1321c;

    /* renamed from: d  reason: collision with root package name */
    boolean f1322d;
    boolean e;
    p f;
    p g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public p() {
        this.f1319a = new byte[PKIFailureInfo.certRevoked];
        this.e = true;
        this.f1322d = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(p pVar) {
        this(pVar.f1319a, pVar.f1320b, pVar.f1321c);
        pVar.f1322d = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(byte[] bArr, int i, int i2) {
        this.f1319a = bArr;
        this.f1320b = i;
        this.f1321c = i2;
        this.e = false;
        this.f1322d = true;
    }

    public p a() {
        p pVar = this.f != this ? this.f : null;
        this.g.f = this.f;
        this.f.g = this.g;
        this.f = null;
        this.g = null;
        return pVar;
    }

    public p a(p pVar) {
        pVar.g = this;
        pVar.f = this.f;
        this.f.g = pVar;
        this.f = pVar;
        return pVar;
    }

    public p a(int i) {
        p a2;
        if (i <= 0 || i > this.f1321c - this.f1320b) {
            throw new IllegalArgumentException();
        }
        if (i >= 1024) {
            a2 = new p(this);
        } else {
            a2 = q.a();
            System.arraycopy(this.f1319a, this.f1320b, a2.f1319a, 0, i);
        }
        a2.f1321c = a2.f1320b + i;
        this.f1320b += i;
        this.g.a(a2);
        return a2;
    }

    public void b() {
        if (this.g == this) {
            throw new IllegalStateException();
        }
        if (!this.g.e) {
            return;
        }
        int i = this.f1321c - this.f1320b;
        if (i > (8192 - this.g.f1321c) + (this.g.f1322d ? 0 : this.g.f1320b)) {
            return;
        }
        a(this.g, i);
        a();
        q.a(this);
    }

    public void a(p pVar, int i) {
        if (!pVar.e) {
            throw new IllegalArgumentException();
        }
        if (pVar.f1321c + i > 8192) {
            if (pVar.f1322d) {
                throw new IllegalArgumentException();
            }
            if ((pVar.f1321c + i) - pVar.f1320b > 8192) {
                throw new IllegalArgumentException();
            }
            System.arraycopy(pVar.f1319a, pVar.f1320b, pVar.f1319a, 0, pVar.f1321c - pVar.f1320b);
            pVar.f1321c -= pVar.f1320b;
            pVar.f1320b = 0;
        }
        System.arraycopy(this.f1319a, this.f1320b, pVar.f1319a, pVar.f1321c, i);
        pVar.f1321c += i;
        this.f1320b += i;
    }
}
