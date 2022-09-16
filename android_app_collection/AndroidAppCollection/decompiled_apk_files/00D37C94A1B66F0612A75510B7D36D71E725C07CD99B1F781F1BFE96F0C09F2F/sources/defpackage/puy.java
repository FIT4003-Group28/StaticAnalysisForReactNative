package defpackage;

import com.google.android.exoplayer2.Format;
/* compiled from: PG */
/* renamed from: puy  reason: default package */
/* loaded from: classes4.dex */
public final class puy implements Comparable {
    private final boolean a;
    private final boolean b;

    public puy(Format format, int i) {
        this.a = 1 != (format.d & 1) ? false : true;
        this.b = pvd.e(i, false);
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public final int compareTo(puy puyVar) {
        return amsu.b.e(this.b, puyVar.b).e(this.a, puyVar.a).a();
    }
}
