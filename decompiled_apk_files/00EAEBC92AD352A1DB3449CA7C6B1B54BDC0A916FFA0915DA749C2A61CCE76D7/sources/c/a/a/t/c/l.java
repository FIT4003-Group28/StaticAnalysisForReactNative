package c.a.a.t.c;

import android.graphics.Path;
import java.util.List;
/* loaded from: classes.dex */
public class l extends a<c.a.a.v.k.l, Path> {
    private final c.a.a.v.k.l l;
    private final Path m;

    public l(List<c.a.a.z.a<c.a.a.v.k.l>> list) {
        super(list);
        this.l = new c.a.a.v.k.l();
        this.m = new Path();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // c.a.a.t.c.a
    /* renamed from: a */
    public Path mo103a(c.a.a.z.a<c.a.a.v.k.l> aVar, float f2) {
        this.l.a(aVar.f2703b, aVar.f2704c, f2);
        c.a.a.y.g.a(this.l, this.m);
        return this.m;
    }
}
