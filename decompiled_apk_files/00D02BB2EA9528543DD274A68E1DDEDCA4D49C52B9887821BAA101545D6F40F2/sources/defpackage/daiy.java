package defpackage;

import java.io.File;
/* compiled from: PG */
/* renamed from: daiy  reason: default package */
/* loaded from: classes5.dex */
final class daiy implements dajd {
    final /* synthetic */ daiz a;

    public daiy(daiz daizVar) {
        this.a = daizVar;
    }

    @Override // defpackage.dajd
    public final void a(daje dajeVar, File file, boolean z) {
        this.a.b.add(file);
        if (!z) {
            this.a.c.set(false);
        }
    }
}
