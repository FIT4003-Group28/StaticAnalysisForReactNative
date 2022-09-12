package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: boky  reason: default package */
/* loaded from: classes3.dex */
final class boky implements Runnable {
    final /* synthetic */ bokz a;
    final /* synthetic */ List b;

    public boky(bokz bokzVar, List list) {
        this.a = bokzVar;
        this.b = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a(this.b);
    }
}
