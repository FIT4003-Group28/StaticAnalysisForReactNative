package defpackage;

import com.google.android.libraries.elements.interfaces.ByteStore;
import com.google.android.libraries.elements.interfaces.FaultObserver;
import j$.util.concurrent.ConcurrentHashMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aagt  reason: default package */
/* loaded from: classes.dex */
public final class aagt extends FaultObserver {
    final /* synthetic */ aagu a;

    public aagt(aagu aaguVar) {
        this.a = aaguVar;
    }

    @Override // com.google.android.libraries.elements.interfaces.FaultObserver
    public final void storeDidFault(ByteStore byteStore, String str) {
        Class e;
        aagu aaguVar = this.a;
        ConcurrentHashMap concurrentHashMap = aaguVar.f;
        aakk aakkVar = (aakk) aaguVar.a.a.get();
        long a = aakk.a(str);
        if (a == -2147483648L) {
            e = aajv.class;
        } else {
            aajr aajrVar = (aajr) aakkVar.a.get(Long.valueOf(a));
            e = aajrVar == null ? aajv.class : aajrVar.e();
        }
        aagu.j(concurrentHashMap, e).c(str);
    }
}
