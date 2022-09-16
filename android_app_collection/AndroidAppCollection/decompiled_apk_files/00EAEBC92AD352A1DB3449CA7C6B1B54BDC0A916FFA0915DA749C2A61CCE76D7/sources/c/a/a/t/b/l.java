package c.a.a.t.b;

import android.annotation.TargetApi;
import android.graphics.Path;
import android.os.Build;
import c.a.a.v.k.h;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
@TargetApi(19)
/* loaded from: classes.dex */
public class l implements n, j {

    /* renamed from: a  reason: collision with root package name */
    private final Path f2346a = new Path();

    /* renamed from: b  reason: collision with root package name */
    private final Path f2347b = new Path();

    /* renamed from: c  reason: collision with root package name */
    private final Path f2348c = new Path();

    /* renamed from: d  reason: collision with root package name */
    private final List<n> f2349d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    private final c.a.a.v.k.h f2350e;

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f2351a = new int[h.a.values().length];

        static {
            try {
                f2351a[h.a.MERGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2351a[h.a.ADD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2351a[h.a.SUBTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2351a[h.a.INTERSECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2351a[h.a.EXCLUDE_INTERSECTIONS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public l(c.a.a.v.k.h hVar) {
        if (Build.VERSION.SDK_INT >= 19) {
            hVar.b();
            this.f2350e = hVar;
            return;
        }
        throw new IllegalStateException("Merge paths are not supported pre-KitKat.");
    }

    private void a() {
        for (int i = 0; i < this.f2349d.size(); i++) {
            this.f2348c.addPath(this.f2349d.get(i).b());
        }
    }

    @TargetApi(19)
    private void a(Path.Op op) {
        this.f2347b.reset();
        this.f2346a.reset();
        for (int size = this.f2349d.size() - 1; size >= 1; size--) {
            n nVar = this.f2349d.get(size);
            if (nVar instanceof d) {
                d dVar = (d) nVar;
                List<n> c2 = dVar.c();
                for (int size2 = c2.size() - 1; size2 >= 0; size2--) {
                    Path b2 = c2.get(size2).b();
                    b2.transform(dVar.d());
                    this.f2347b.addPath(b2);
                }
            } else {
                this.f2347b.addPath(nVar.b());
            }
        }
        n nVar2 = this.f2349d.get(0);
        if (nVar2 instanceof d) {
            d dVar2 = (d) nVar2;
            List<n> c3 = dVar2.c();
            for (int i = 0; i < c3.size(); i++) {
                Path b3 = c3.get(i).b();
                b3.transform(dVar2.d());
                this.f2346a.addPath(b3);
            }
        } else {
            this.f2346a.set(nVar2.b());
        }
        this.f2348c.op(this.f2346a, this.f2347b, op);
    }

    @Override // c.a.a.t.b.c
    public void a(List<c> list, List<c> list2) {
        for (int i = 0; i < this.f2349d.size(); i++) {
            this.f2349d.get(i).a(list, list2);
        }
    }

    @Override // c.a.a.t.b.j
    public void a(ListIterator<c> listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            c previous = listIterator.previous();
            if (previous instanceof n) {
                this.f2349d.add((n) previous);
                listIterator.remove();
            }
        }
    }

    @Override // c.a.a.t.b.n
    public Path b() {
        Path.Op op;
        this.f2348c.reset();
        if (this.f2350e.c()) {
            return this.f2348c;
        }
        int i = a.f2351a[this.f2350e.a().ordinal()];
        if (i != 1) {
            if (i == 2) {
                op = Path.Op.UNION;
            } else if (i == 3) {
                op = Path.Op.REVERSE_DIFFERENCE;
            } else if (i == 4) {
                op = Path.Op.INTERSECT;
            } else if (i == 5) {
                op = Path.Op.XOR;
            }
            a(op);
        } else {
            a();
        }
        return this.f2348c;
    }
}
