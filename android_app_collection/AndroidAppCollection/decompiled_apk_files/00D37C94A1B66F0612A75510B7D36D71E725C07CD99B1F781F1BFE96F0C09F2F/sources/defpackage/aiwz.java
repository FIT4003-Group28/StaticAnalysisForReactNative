package defpackage;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.TreeMap;
/* compiled from: PG */
/* renamed from: aiwz  reason: default package */
/* loaded from: classes.dex */
public final class aiwz {
    long a;
    long b;
    boolean c;
    String d;
    TreeMap e = new TreeMap();
    SparseArray f;

    public aiwz() {
        SparseArray sparseArray = new SparseArray();
        for (int i = 0; i < 3; i++) {
            sparseArray.put(i, new ArrayList());
        }
        this.f = sparseArray;
    }
}
