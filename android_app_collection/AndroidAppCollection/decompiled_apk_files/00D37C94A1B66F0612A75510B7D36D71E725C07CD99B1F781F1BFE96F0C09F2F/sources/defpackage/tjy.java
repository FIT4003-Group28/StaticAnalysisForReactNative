package defpackage;

import android.graphics.Rect;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: tjy  reason: default package */
/* loaded from: classes4.dex */
public class tjy {
    public boolean a;
    public long b;
    protected long c = -1;
    protected final long d = System.currentTimeMillis();
    protected final tki e;
    protected tjz f;
    public Rect g;
    private WeakReference h;

    public tjy(tki tkiVar) {
        this.e = tkiVar;
    }

    public final View a() {
        return (View) this.h.get();
    }

    public final Boolean b() {
        return Boolean.valueOf(this.a);
    }

    public final Map c() {
        Rect rect;
        Rect rect2;
        Rect rect3;
        Rect rect4;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(tju.SDK, "a");
        linkedHashMap.put(tju.SCREEN_SHARE_BUCKETS, this.e.f.g(1, false));
        linkedHashMap.put(tju.TIMESTAMP, Long.valueOf(this.d));
        tju tjuVar = tju.COVERAGE;
        tjz tjzVar = this.f;
        double d = 0.0d;
        linkedHashMap.put(tjuVar, Double.valueOf(tjzVar != null ? tjzVar.a : 0.0d));
        tju tjuVar2 = tju.SCREEN_SHARE;
        tjz tjzVar2 = this.f;
        if (tjzVar2 != null) {
            d = tjzVar2.b;
        }
        linkedHashMap.put(tjuVar2, Double.valueOf(d));
        tju tjuVar3 = tju.POSITION;
        tjz tjzVar3 = this.f;
        linkedHashMap.put(tjuVar3, (tjzVar3 == null || (rect4 = tjzVar3.c) == null) ? new Integer[]{0, 0, 0, 0} : new Integer[]{Integer.valueOf(rect4.top), Integer.valueOf(this.f.c.left), Integer.valueOf(this.f.c.bottom), Integer.valueOf(this.f.c.right)});
        tjz tjzVar4 = this.f;
        if (tjzVar4 != null && (rect3 = tjzVar4.d) != null && !rect3.equals(tjzVar4.c)) {
            linkedHashMap.put(tju.CONTAINER_POSITION, new Integer[]{Integer.valueOf(this.f.d.top), Integer.valueOf(this.f.d.left), Integer.valueOf(this.f.d.bottom), Integer.valueOf(this.f.d.right)});
        }
        tju tjuVar4 = tju.VIEWPORT_SIZE;
        tjz tjzVar5 = this.f;
        linkedHashMap.put(tjuVar4, (tjzVar5 == null || (rect2 = tjzVar5.e) == null) ? new Integer[]{0, 0} : new Integer[]{Integer.valueOf(rect2.width()), Integer.valueOf(this.f.e.height())});
        tju tjuVar5 = tju.SCREEN_SIZE;
        tjz tjzVar6 = this.f;
        linkedHashMap.put(tjuVar5, (tjzVar6 == null || (rect = tjzVar6.f) == null) ? new Integer[]{0, 0} : new Integer[]{Integer.valueOf(rect.width()), Integer.valueOf(this.f.f.height())});
        linkedHashMap.put(tju.MIN_COVERAGE, Double.valueOf(this.e.a));
        linkedHashMap.put(tju.MAX_COVERAGE, Double.valueOf(this.e.b));
        linkedHashMap.put(tju.TOS, this.e.e.g(1, false));
        linkedHashMap.put(tju.MAX_CONSECUTIVE_TOS, this.e.d());
        return linkedHashMap;
    }

    public void d(View view) {
        this.h = new WeakReference(view);
    }

    public final void e(int i, int i2, int i3, int i4) {
        this.g = new Rect(i, i2, i3 + i, i4 + i2);
    }

    public boolean f() {
        return false;
    }

    public final boolean g() {
        return this.e.c();
    }

    public boolean h() {
        return this.a;
    }
}
