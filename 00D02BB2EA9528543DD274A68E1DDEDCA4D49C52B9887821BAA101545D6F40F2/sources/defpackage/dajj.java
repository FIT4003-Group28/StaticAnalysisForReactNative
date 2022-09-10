package defpackage;

import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dajj  reason: default package */
/* loaded from: classes5.dex */
public final class dajj implements Runnable {
    final /* synthetic */ Set a;
    final /* synthetic */ dajk b;

    public dajj(dajk dajkVar, Set set) {
        this.b = dajkVar;
        this.a = set;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            for (String str : this.a) {
                this.b.b.k(str);
            }
        } catch (Exception unused) {
        }
    }
}
