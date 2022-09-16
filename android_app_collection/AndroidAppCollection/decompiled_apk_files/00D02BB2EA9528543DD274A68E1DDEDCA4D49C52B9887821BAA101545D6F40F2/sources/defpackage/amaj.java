package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: amaj  reason: default package */
/* loaded from: classes2.dex */
final class amaj implements Runnable {
    final /* synthetic */ aksj a;
    final /* synthetic */ List b;
    final /* synthetic */ amaw c;

    public amaj(amaw amawVar, aksj aksjVar, List list) {
        this.c = amawVar;
        this.a = aksjVar;
        this.b = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        amaw amawVar = this.c;
        ambu ambuVar = amawVar.m;
        if (ambuVar != null) {
            ambuVar.a(amawVar.h, amawVar.j, this.a, this.b);
        }
    }
}
