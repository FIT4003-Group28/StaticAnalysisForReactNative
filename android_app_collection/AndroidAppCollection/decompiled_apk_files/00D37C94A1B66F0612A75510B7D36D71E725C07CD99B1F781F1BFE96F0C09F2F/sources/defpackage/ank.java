package defpackage;

import java.util.Set;
/* compiled from: PG */
/* renamed from: ank  reason: default package */
/* loaded from: classes.dex */
public class ank {
    final ann a;
    boolean b;
    public boolean c;
    public int[] d;
    public Set e;
    final anl f = new anr();

    /* JADX INFO: Access modifiers changed from: protected */
    public ank(ann annVar) {
        this.a = annVar;
    }

    public final void a() {
        this.b = true;
    }

    public final void b(hz hzVar) {
        Set set = this.e;
        if (set != null) {
            set.remove(hzVar);
        }
    }
}
