package defpackage;

import java.util.Collection;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bgd  reason: default package */
/* loaded from: classes2.dex */
public final class bgd implements Runnable {
    final /* synthetic */ bga a;
    final /* synthetic */ Collection b;
    final /* synthetic */ bgg c;
    final /* synthetic */ bgr d;
    private final /* synthetic */ int e;

    public bgd(bgg bggVar, bgr bgrVar, bga bgaVar, Collection collection) {
        this.c = bggVar;
        this.d = bgrVar;
        this.a = bgaVar;
        this.b = collection;
    }

    public bgd(bgg bggVar, bgr bgrVar, bga bgaVar, Collection collection, int i) {
        this.e = i;
        this.c = bggVar;
        this.d = bgrVar;
        this.a = bgaVar;
        this.b = collection;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.e == 0) {
            this.d.a(this.c, this.a, this.b);
        } else {
            this.d.a(this.c, this.a, this.b);
        }
    }
}
