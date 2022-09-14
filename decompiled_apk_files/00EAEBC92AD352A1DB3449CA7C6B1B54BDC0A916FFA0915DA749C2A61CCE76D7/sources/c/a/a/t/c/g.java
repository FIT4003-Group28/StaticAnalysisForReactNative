package c.a.a.t.c;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    private final List<a<c.a.a.v.k.l, Path>> f2397a;

    /* renamed from: b  reason: collision with root package name */
    private final List<a<Integer, Integer>> f2398b;

    /* renamed from: c  reason: collision with root package name */
    private final List<c.a.a.v.k.g> f2399c;

    public g(List<c.a.a.v.k.g> list) {
        this.f2399c = list;
        this.f2397a = new ArrayList(list.size());
        this.f2398b = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            this.f2397a.add(list.get(i).b().mo104a());
            this.f2398b.add(list.get(i).c().mo104a());
        }
    }

    public List<a<c.a.a.v.k.l, Path>> a() {
        return this.f2397a;
    }

    public List<c.a.a.v.k.g> b() {
        return this.f2399c;
    }

    public List<a<Integer, Integer>> c() {
        return this.f2398b;
    }
}
