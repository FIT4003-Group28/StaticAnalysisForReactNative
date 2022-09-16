package defpackage;

import java.util.HashMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: axpk  reason: default package */
/* loaded from: classes2.dex */
public final class axpk extends HashMap {
    final /* synthetic */ axpn a;

    public axpk(axpn axpnVar) {
        this.a = axpnVar;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        String str = (String) obj;
        String str2 = (String) obj2;
        this.a.b.put(str == null ? str : str.toLowerCase(), str2);
        return (String) super.put(str, str2);
    }
}
