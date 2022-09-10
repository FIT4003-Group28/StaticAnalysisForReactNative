package defpackage;

import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: brpn  reason: default package */
/* loaded from: classes4.dex */
public final class brpn implements btni {
    final /* synthetic */ brpq a;

    public brpn(brpq brpqVar) {
        this.a = brpqVar;
    }

    @Override // defpackage.btni
    public final int b(float f) {
        if (f >= 1.0f) {
            return 0;
        }
        int i = 0;
        int i2 = 0;
        for (ArrayList<brpp> arrayList : this.a.a.values()) {
            i += arrayList.size();
            arrayList.subList(0, Math.min((int) Math.ceil((1.0f - f) * arrayList.size()), arrayList.size())).clear();
            i2 += arrayList.size();
        }
        return i - i2;
    }

    @Override // defpackage.btni
    @dzsi
    public final String c() {
        int i = 0;
        for (ArrayList<brpp> arrayList : this.a.a.values()) {
            i += arrayList.size();
        }
        brpq brpqVar = this.a;
        return String.format("OnlineSearchCache %s with %d lists, with a total of %d responses.", brpqVar.b, Integer.valueOf(brpqVar.a.size()), Integer.valueOf(i));
    }
}
