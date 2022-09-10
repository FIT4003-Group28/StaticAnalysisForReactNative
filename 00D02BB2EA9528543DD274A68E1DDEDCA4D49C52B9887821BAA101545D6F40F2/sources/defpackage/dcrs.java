package defpackage;

import java.util.HashMap;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dcrs  reason: default package */
/* loaded from: classes.dex */
public final class dcrs<C> extends dcrv<C> {
    private final Map<dcqy<?>, dcru<?, ? super C>> a;
    private final Map<dcqy<?>, dcrt<?, ? super C>> b;
    private final dcru<Object, ? super C> c;

    public dcrs(dcrr<C> dcrrVar) {
        HashMap hashMap = new HashMap();
        this.a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.b = hashMap2;
        hashMap.putAll(dcrrVar.b);
        hashMap2.putAll(dcrrVar.c);
        this.c = dcrrVar.d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dcrv
    public final <T> void a(dcqy<T> dcqyVar, T t, C c) {
        dcru<?, ? super C> dcruVar = this.a.get(dcqyVar);
        if (dcruVar == null) {
            dcqyVar.a(t, c);
        } else {
            dcruVar.a(dcqyVar, t, c);
        }
    }
}
