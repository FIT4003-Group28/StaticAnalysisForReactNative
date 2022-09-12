package defpackage;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipFile;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: daiz  reason: default package */
/* loaded from: classes5.dex */
public final class daiz implements dajc {
    final /* synthetic */ dajl a;
    final /* synthetic */ Set b;
    final /* synthetic */ AtomicBoolean c;
    final /* synthetic */ dajf d;

    public daiz(dajf dajfVar, dajl dajlVar, Set set, AtomicBoolean atomicBoolean) {
        this.d = dajfVar;
        this.a = dajlVar;
        this.b = set;
        this.c = atomicBoolean;
    }

    @Override // defpackage.dajc
    public final void a(ZipFile zipFile, Set<daje> set) {
        this.d.b(this.a, set, new daiy(this));
    }
}
