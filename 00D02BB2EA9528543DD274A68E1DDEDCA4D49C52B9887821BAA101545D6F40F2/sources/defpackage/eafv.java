package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: eafv  reason: default package */
/* loaded from: classes6.dex */
public final class eafv {
    public final eafm a;
    public final eafq b;
    public final eafg c;
    public final eaem d;
    public final eadc e;
    public final eadu f;
    public final int g;
    public final int h;
    public final int i;
    private final List<eaea> j;
    private final int k;
    private int l;

    public eafv(List<eaea> list, eafm eafmVar, eafq eafqVar, eafg eafgVar, int i, eaem eaemVar, eadc eadcVar, eadu eaduVar, int i2, int i3, int i4) {
        this.j = list;
        this.c = eafgVar;
        this.a = eafmVar;
        this.b = eafqVar;
        this.k = i;
        this.d = eaemVar;
        this.e = eadcVar;
        this.f = eaduVar;
        this.g = i2;
        this.h = i3;
        this.i = i4;
    }

    public final eaep a(eaem eaemVar) {
        return b(eaemVar, this.a, this.b, this.c);
    }

    public final eaep b(eaem eaemVar, eafm eafmVar, eafq eafqVar, eafg eafgVar) {
        if (this.k >= this.j.size()) {
            throw new AssertionError();
        }
        this.l++;
        if (this.b != null && !this.c.c(eaemVar.a)) {
            throw new IllegalStateException("network interceptor " + this.j.get(this.k - 1) + " must retain the same host and port");
        }
        if (this.b == null || this.l <= 1) {
            eafv eafvVar = new eafv(this.j, eafmVar, eafqVar, eafgVar, this.k + 1, eaemVar, this.e, this.f, this.g, this.h, this.i);
            eaea eaeaVar = this.j.get(this.k);
            eaep a = eaeaVar.a(eafvVar);
            if (eafqVar != null && this.k + 1 < this.j.size() && eafvVar.l != 1) {
                throw new IllegalStateException("network interceptor " + eaeaVar + " must call proceed() exactly once");
            } else if (a != null) {
                if (a.g != null) {
                    return a;
                }
                throw new IllegalStateException("interceptor " + eaeaVar + " returned a response with no body");
            } else {
                throw new NullPointerException("interceptor " + eaeaVar + " returned null");
            }
        }
        throw new IllegalStateException("network interceptor " + this.j.get(this.k - 1) + " must call proceed() exactly once");
    }
}
