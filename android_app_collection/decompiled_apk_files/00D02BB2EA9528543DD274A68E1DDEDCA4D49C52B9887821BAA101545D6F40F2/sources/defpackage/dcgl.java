package defpackage;

import java.util.Arrays;
import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dcgl  reason: default package */
/* loaded from: classes5.dex */
public final class dcgl extends dcnj implements dcgm {
    dcgj[] a;
    final /* synthetic */ dcgn d;
    private final Object e;
    private int f = 0;
    public int b = 0;
    public dcgm c = this;
    private dcgm g = this;

    public dcgl(dcgn dcgnVar, Object obj, int i) {
        this.d = dcgnVar;
        this.e = obj;
        this.a = new dcgj[dccj.c(i)];
    }

    private final int a() {
        return this.a.length - 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int b = dccj.b(obj);
        int a = a() & b;
        dcgj dcgjVar = this.a[a];
        for (dcgj dcgjVar2 = dcgjVar; dcgjVar2 != null; dcgjVar2 = dcgjVar2.d) {
            if (dcgjVar2.a(obj, b)) {
                return false;
            }
        }
        dcgj dcgjVar3 = new dcgj(this.e, obj, b, dcgjVar);
        dcgn.P(this.g, dcgjVar3);
        dcgn.P(dcgjVar3, this);
        dcgn.Q(this.d.d.g, dcgjVar3);
        dcgn.Q(dcgjVar3, this.d.d);
        dcgj[] dcgjVarArr = this.a;
        dcgjVarArr[a] = dcgjVar3;
        int i = this.f + 1;
        this.f = i;
        this.b++;
        int length = dcgjVarArr.length;
        if (i > length && length < 1073741824) {
            int i2 = length + length;
            dcgj[] dcgjVarArr2 = new dcgj[i2];
            this.a = dcgjVarArr2;
            int i3 = i2 - 1;
            for (dcgm dcgmVar = this.c; dcgmVar != this; dcgmVar = dcgmVar.b()) {
                dcgj dcgjVar4 = (dcgj) dcgmVar;
                int i4 = dcgjVar4.c & i3;
                dcgjVar4.d = dcgjVarArr2[i4];
                dcgjVarArr2[i4] = dcgjVar4;
            }
        }
        return true;
    }

    @Override // defpackage.dcgm
    public final dcgm b() {
        return this.c;
    }

    @Override // defpackage.dcgm
    public final void c(dcgm dcgmVar) {
        this.g = dcgmVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        Arrays.fill(this.a, (Object) null);
        this.f = 0;
        for (dcgm dcgmVar = this.c; dcgmVar != this; dcgmVar = dcgmVar.b()) {
            dcgn.R((dcgj) dcgmVar);
        }
        dcgn.P(this, this);
        this.b++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int b = dccj.b(obj);
        for (dcgj dcgjVar = this.a[a() & b]; dcgjVar != null; dcgjVar = dcgjVar.d) {
            if (dcgjVar.a(obj, b)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dcgm
    public final void d(dcgm dcgmVar) {
        this.c = dcgmVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new dcgk(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int b = dccj.b(obj);
        int a = a() & b;
        dcgj dcgjVar = null;
        for (dcgj dcgjVar2 = this.a[a]; dcgjVar2 != null; dcgjVar2 = dcgjVar2.d) {
            if (dcgjVar2.a(obj, b)) {
                if (dcgjVar == null) {
                    this.a[a] = dcgjVar2.d;
                } else {
                    dcgjVar.d = dcgjVar2.d;
                }
                dcgn.P(dcgjVar2.e, dcgjVar2.f);
                dcgn.R(dcgjVar2);
                this.f--;
                this.b++;
                return true;
            }
            dcgjVar = dcgjVar2;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f;
    }
}
