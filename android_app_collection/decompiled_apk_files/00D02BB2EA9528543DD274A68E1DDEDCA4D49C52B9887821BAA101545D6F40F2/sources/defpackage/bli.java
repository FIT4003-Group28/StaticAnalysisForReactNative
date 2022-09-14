package defpackage;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: bli  reason: default package */
/* loaded from: classes3.dex */
public final class bli {
    public final List<blc<bnc, Path>> a;
    public final List<blc<Integer, Integer>> b;
    public final List<bmw> c;

    public bli(List<bmw> list) {
        this.c = list;
        this.a = new ArrayList(list.size());
        this.b = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            this.a.add(list.get(i).a.a());
            this.b.add(list.get(i).b.a());
        }
    }
}
