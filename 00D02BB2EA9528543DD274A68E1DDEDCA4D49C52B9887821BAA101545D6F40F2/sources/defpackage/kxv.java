package defpackage;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
/* compiled from: PG */
/* renamed from: kxv  reason: default package */
/* loaded from: classes7.dex */
public final class kxv implements kxu {
    private final dbty<akyy> b;
    private final kxm c;
    private Rect f;
    private kxk g;
    private final List<Runnable> a = new ArrayList();
    private final Object d = new Object();
    private final Map<Object, kxo> e = new HashMap();

    public kxv(kxm kxmVar, dbty<akyy> dbtyVar, Rect rect) {
        this.b = dbtyVar;
        this.c = kxmVar;
        this.f = rect;
        q();
    }

    private final void q() {
        Rect rect;
        kxm kxmVar = this.c;
        Rect rect2 = this.f;
        Collection<kxo> values = this.e.values();
        Rect rect3 = new Rect();
        dccx dccxVar = new dccx();
        for (kxo kxoVar : values) {
            int i = rect3.top;
            Rect i2 = kxoVar.i();
            rect3.top = Math.max(i, kxoVar.a() ? Math.max(i2 == null ? 0 : i2.top, kxmVar.b.b(nqo.aF)) : i2 == null ? 0 : i2.top);
            int i3 = rect3.bottom;
            Rect i4 = kxoVar.i();
            rect3.bottom = Math.max(i3, Math.max(i4 == null ? 0 : rect2.bottom - i4.bottom, kxoVar.g()));
            if (kxmVar.c()) {
                rect3.right = Math.max(rect3.right, kxmVar.a(kxoVar, rect2));
                rect3.left = Math.max(rect3.left, kxmVar.b(kxoVar, rect2));
            } else {
                rect3.left = Math.max(rect3.left, kxmVar.a(kxoVar, rect2));
                rect3.right = Math.max(rect3.right, kxmVar.b(kxoVar, rect2));
            }
            dccxVar.i(kxoVar.j());
        }
        int i5 = rect3.left;
        int i6 = rect3.top;
        int i7 = rect3.right;
        int i8 = rect3.bottom;
        dcdc f = dccxVar.f();
        int b = kxmVar.b.b(kxt.a);
        Rect rect4 = new Rect(rect2.left + i5, rect2.top + i6, rect2.right - i7, rect2.bottom - i8);
        Rect rect5 = new Rect(rect4);
        rect5.inset(b, b);
        dccx dccxVar2 = new dccx();
        int size = f.size();
        for (int i9 = 0; i9 < size; i9++) {
            Rect rect6 = (Rect) f.get(i9);
            dccxVar2.g(new amkz(rect6.left - rect2.left, rect6.top - rect2.top, rect6.right - rect2.left, rect6.bottom - rect2.top));
        }
        TreeSet treeSet = new TreeSet(kxmVar.a);
        kxm.d(rect4.left, rect4.top, rect4.right, rect4.bottom, f, treeSet, 0);
        Iterator descendingIterator = treeSet.descendingIterator();
        while (descendingIterator.hasNext()) {
            Rect rect7 = (Rect) descendingIterator.next();
            Iterator it = treeSet.iterator();
            while (true) {
                if (it.hasNext() && (rect = (Rect) it.next()) != rect7) {
                    if (rect.contains(rect7)) {
                        descendingIterator.remove();
                        break;
                    }
                }
            }
        }
        alae alaeVar = treeSet.isEmpty() ? new alae(0.0f, 0.0f) : alae.a(((Rect) treeSet.first()).exactCenterX() - rect2.left, ((Rect) treeSet.first()).exactCenterY() - rect2.top, rect2.width(), rect2.height());
        if (rect5.isEmpty()) {
            rect5.set(rect2);
            rect4.set(rect2);
        }
        dccx dccxVar3 = new dccx();
        Iterator it2 = treeSet.iterator();
        boolean z = false;
        while (it2.hasNext()) {
            Rect rect8 = (Rect) it2.next();
            rect8.inset(b, b);
            if (!rect8.isEmpty()) {
                dccxVar3.g(rect8);
                z = true;
            }
        }
        if (!z) {
            dccxVar3.g(new Rect(rect5));
        }
        dcdc f2 = dccxVar3.f();
        rect5.offset(-rect2.left, -rect2.top);
        rect4.offset(-rect2.left, -rect2.top);
        int size2 = f2.size();
        for (int i10 = 0; i10 < size2; i10++) {
            ((Rect) f2.get(i10)).offset(-rect2.left, -rect2.top);
        }
        this.g = new kxh(dccxVar3.f(), alaeVar, rect5, rect4, dccxVar2.f());
        akyy a = this.b.a();
        if (a != null) {
            a.f();
            kxh kxhVar = (kxh) this.g;
            a.b(kxhVar.c, kxhVar.d);
            dcdc<amkz> dcdcVar = ((kxh) this.g).e;
            int size3 = dcdcVar.size();
            for (int i11 = 0; i11 < size3; i11++) {
                a.g(dcdcVar.get(i11));
            }
        }
        for (Runnable runnable : this.a) {
            runnable.run();
        }
    }

    @Override // defpackage.btph
    public final void NX(String str, PrintWriter printWriter) {
        printWriter.println(String.valueOf(str).concat("Map viewport:"));
        String valueOf = String.valueOf(this.e);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 15 + String.valueOf(valueOf).length());
        sb.append(str);
        sb.append("  constraints: ");
        sb.append(valueOf);
        printWriter.println(sb.toString());
        String valueOf2 = String.valueOf(this.f);
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 14 + String.valueOf(valueOf2).length());
        sb2.append(str);
        sb2.append("  map bounds: ");
        sb2.append(valueOf2);
        printWriter.println(sb2.toString());
        String valueOf3 = String.valueOf(this.g);
        StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 12 + String.valueOf(valueOf3).length());
        sb3.append(str);
        sb3.append("  viewport: ");
        sb3.append(valueOf3);
        printWriter.println(sb3.toString());
    }

    @Override // defpackage.kxu
    public final void a(Rect rect) {
        if (this.f.equals(rect)) {
            return;
        }
        this.f = rect;
        q();
    }

    @Override // defpackage.gll
    public final Rect b() {
        return new Rect(((kxh) this.g).a.get(0));
    }

    @Override // defpackage.gll
    public final Rect[] c() {
        Rect[] rectArr = new Rect[((kxh) this.g).a.size()];
        for (int i = 0; i < ((kxh) this.g).a.size(); i++) {
            rectArr[i] = new Rect(((kxh) this.g).a.get(i));
        }
        return rectArr;
    }

    @Override // defpackage.gll
    public final Rect d() {
        throw null;
    }

    @Override // defpackage.gll
    public final Rect e() {
        return b();
    }

    @Override // defpackage.gll
    public final Rect f() {
        return b();
    }

    @Override // defpackage.gll
    @dzsi
    public final View g() {
        return null;
    }

    @Override // defpackage.gll
    public final boolean h() {
        return true;
    }

    @Override // defpackage.gll
    public final Point i() {
        return new Point(this.f.width(), this.f.height());
    }

    @Override // defpackage.kxu
    public final void j(kxo kxoVar) {
        k(this.d, kxoVar);
    }

    @Override // defpackage.kxu
    public final void k(Object obj, kxo kxoVar) {
        dbsk.s(kxoVar);
        this.e.put(obj, kxoVar);
        q();
    }

    @Override // defpackage.kxu
    public final void l(Object obj) {
        dbsk.a(obj != this.d);
        this.e.remove(obj);
        q();
    }

    @Override // defpackage.kxu
    public final alae m() {
        return ((kxh) this.g).b;
    }

    @Override // defpackage.kxu
    public final Rect n() {
        return new Rect(this.f);
    }

    @Override // defpackage.kxu
    public final void o(Runnable runnable) {
        this.a.add(runnable);
    }

    @Override // defpackage.kxu
    public final void p(Runnable runnable) {
        dbsk.l(this.a.remove(runnable));
    }
}
