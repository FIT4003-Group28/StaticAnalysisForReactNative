package defpackage;

import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: te  reason: default package */
/* loaded from: classes7.dex */
final class te implements Runnable {
    final /* synthetic */ ts a;
    final /* synthetic */ tf b;

    public te(tf tfVar, ts tsVar) {
        this.b = tfVar;
        this.a = tsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        tf tfVar = this.b;
        th thVar = tfVar.d;
        if (thVar.f == tfVar.c) {
            List<T> list = tfVar.b;
            ts tsVar = this.a;
            thVar.d = list;
            thVar.e = Collections.unmodifiableList(list);
            tsVar.b(thVar.a);
            thVar.b();
        }
    }
}
