package defpackage;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: admo  reason: default package */
/* loaded from: classes.dex */
final class admo {
    public final admj a;
    public final SparseArray b;
    public final SparseArray c;
    public final adij d;
    public final admm e;
    public final boolean f;
    public final admm g;
    public final List h;
    public final List i;
    public final Set j;
    public final Set k;
    public final List l;

    public admo(admj admjVar, SparseArray sparseArray, SparseArray sparseArray2, adij adijVar, admm admmVar, boolean z, admm admmVar2, List list, List list2, Set set, Set set2, List list3) {
        this.a = admjVar;
        this.b = sparseArray.clone();
        this.c = sparseArray2.clone();
        this.d = adijVar;
        this.e = admmVar;
        this.f = z;
        this.g = admmVar2;
        this.h = new ArrayList(list);
        this.i = new ArrayList(list2);
        this.j = new HashSet(set);
        this.k = new HashSet(set2);
        this.l = new ArrayList(list3);
    }
}
