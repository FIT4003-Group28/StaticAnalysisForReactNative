package defpackage;

import com.google.android.exoplayer2.Format;
/* compiled from: PG */
/* renamed from: cmjb  reason: default package */
/* loaded from: classes5.dex */
public final class cmjb implements Comparable<cmjb> {
    private final boolean a;
    private final boolean b;

    public cmjb(Format format, int i) {
        this.a = 1 != (format.d & 1) ? false : true;
        this.b = cmjh.a(i, false);
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public final int compareTo(cmjb cmjbVar) {
        return dbzx.b.h(this.b, cmjbVar.b).h(this.a, cmjbVar.a).i();
    }
}
