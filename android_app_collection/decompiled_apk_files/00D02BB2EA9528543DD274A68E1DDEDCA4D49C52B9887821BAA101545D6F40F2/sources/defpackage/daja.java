package defpackage;

import java.util.HashSet;
import java.util.Set;
import java.util.zip.ZipFile;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: daja  reason: default package */
/* loaded from: classes5.dex */
public final class daja implements dajc {
    final /* synthetic */ Set a;
    final /* synthetic */ dajl b;
    final /* synthetic */ dajf c;

    public daja(dajf dajfVar, Set set, dajl dajlVar) {
        this.c = dajfVar;
        this.a = set;
        this.b = dajlVar;
    }

    @Override // defpackage.dajc
    public final void a(ZipFile zipFile, Set<daje> set) {
        Set set2 = this.a;
        dajf dajfVar = this.c;
        dajl dajlVar = this.b;
        HashSet hashSet = new HashSet();
        dajfVar.b(dajlVar, set, new dajb(hashSet, dajlVar, zipFile));
        set2.addAll(hashSet);
    }
}
