package defpackage;

import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: hb  reason: default package */
/* loaded from: classes6.dex */
public final class hb implements Runnable {
    final /* synthetic */ ArrayList a;

    public hb(ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        hh.d(this.a, 4);
    }
}
