package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: eaqg  reason: default package */
/* loaded from: classes.dex */
public class eaqg extends eaqa implements Serializable, eapp {
    private static final long serialVersionUID = -6728882245981L;
    public volatile long a;
    public volatile eaok b;

    public eaqg() {
        this(eaor.a(), earp.W());
    }

    @Override // defpackage.eapr
    public final long Tf() {
        return this.a;
    }

    @Override // defpackage.eapr
    public final eaok Tg() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void Th(long j) {
        this.a = j;
    }

    public eaqg(int i, int i2, int i3, int i4, int i5) {
        this(i, i2, i3, i4, i5, 0, 0, earp.W());
    }

    public eaqg(int i, int i2, int i3, int i4, int i5, int i6, int i7, eaok eaokVar) {
        this.b = eaor.d(eaokVar);
        this.a = this.b.e(i, i2, i3, i4, i5, i6, i7);
    }

    public eaqg(int i, int i2, int i3, int i4, int i5, int i6, int i7, eaou eaouVar) {
        this(i, i2, i3, i4, i5, i6, i7, earp.X(eaouVar));
    }

    public eaqg(long j) {
        this(j, earp.W());
    }

    public eaqg(long j, eaok eaokVar) {
        this.b = eaor.d(eaokVar);
        this.a = j;
    }

    public eaqg(long j, eaou eaouVar) {
        this(j, earp.X(eaouVar));
    }

    public eaqg(Object obj) {
        easg b = easc.a().b(obj);
        this.b = eaor.d(b.e(obj));
        this.a = b.a(obj, null);
    }

    public eaqg(Object obj, eaou eaouVar) {
        easg b = easc.a().b(obj);
        eaok d = eaor.d(b.b(obj, eaouVar));
        this.b = d;
        this.a = b.a(obj, d);
    }
}
