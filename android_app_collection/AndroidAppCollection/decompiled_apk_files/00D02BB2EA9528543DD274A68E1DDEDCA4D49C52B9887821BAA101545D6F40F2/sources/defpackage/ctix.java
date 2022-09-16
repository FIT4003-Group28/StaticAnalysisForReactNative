package defpackage;

import java.util.HashMap;
/* renamed from: ctix  reason: default package */
/* loaded from: classes5.dex */
final /* synthetic */ class ctix implements dbrn {
    static final dbrn a = new ctix();

    private ctix() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        cuie cuieVar = (cuie) obj;
        HashMap hashMap = new HashMap();
        hashMap.put("PATTERN", cuieVar.a());
        hashMap.put("SUBSTITUTE", Integer.valueOf(cuieVar.b()));
        return hashMap;
    }
}
