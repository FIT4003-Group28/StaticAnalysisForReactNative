package defpackage;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ct  reason: default package */
/* loaded from: classes3.dex */
public final class ct implements Runnable {
    final /* synthetic */ List a;
    final /* synthetic */ fx b;

    public ct(List list, fx fxVar) {
        this.a = list;
        this.b = fxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.contains(this.b)) {
            this.a.remove(this.b);
            fy.f(this.b);
        }
    }
}
