package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: anbn  reason: default package */
/* loaded from: classes.dex */
public final class anbn extends anbq {
    private final Map a;
    private final Map b;
    private final anbo c;

    public anbn(anbm anbmVar) {
        HashMap hashMap = new HashMap();
        this.a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.b = hashMap2;
        hashMap.putAll(anbmVar.c);
        hashMap2.putAll(anbmVar.d);
        this.c = anbmVar.f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.anbq
    public final void a(anas anasVar, Object obj, Object obj2) {
        anbp anbpVar = (anbp) this.a.get(anasVar);
        if (anbpVar == null) {
            anasVar.b(obj, obj2);
        } else {
            anbpVar.a(anasVar, obj, obj2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.anbq
    public final void b(anas anasVar, Iterator it, Object obj) {
        anbo anboVar = (anbo) this.b.get(anasVar);
        if (anboVar != null) {
            anboVar.a(anasVar, it, obj);
        } else if (this.c == null || this.a.containsKey(anasVar)) {
            while (it.hasNext()) {
                a(anasVar, it.next(), obj);
            }
        } else {
            anasVar.a(it, obj);
        }
    }
}
