package com.google.android.apps.youtube.app.common.ui;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class OverScrollLinearLayoutManager extends LinearLayoutManager {
    public final Set a;

    public OverScrollLinearLayoutManager(byte[] bArr) {
        this.a = Collections.newSetFromMap(new WeakHashMap());
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.xw
    public final void W(RecyclerView recyclerView, yd ydVar) {
        super.W(recyclerView, ydVar);
        this.a.clear();
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.xw
    public final int d(int i, yd ydVar, yl ylVar) {
        Integer num;
        int d = super.d(i, ydVar, ylVar);
        if (!this.a.isEmpty()) {
            int i2 = i - d;
            if (i2 < 0) {
                num = 2;
            } else {
                num = i2 > 0 ? 3 : null;
            }
            if (num != null) {
                for (nuh nuhVar : this.a) {
                    nuhVar.a(num.intValue());
                }
            }
        }
        return d;
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.xw
    public int e(int i, yd ydVar, yl ylVar) {
        Integer num;
        int e = super.e(i, ydVar, ylVar);
        if (!this.a.isEmpty()) {
            int i2 = i - e;
            if (i2 < 0) {
                num = 0;
            } else {
                num = i2 > 0 ? 1 : null;
            }
            if (num != null) {
                for (nuh nuhVar : this.a) {
                    nuhVar.a(num.intValue());
                }
            }
        }
        return e;
    }

    public OverScrollLinearLayoutManager() {
        super(1);
        this.a = Collections.newSetFromMap(new WeakHashMap());
    }
}
