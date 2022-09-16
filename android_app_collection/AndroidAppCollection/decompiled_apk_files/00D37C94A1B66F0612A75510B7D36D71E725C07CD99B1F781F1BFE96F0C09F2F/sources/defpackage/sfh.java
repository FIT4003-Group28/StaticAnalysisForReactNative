package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: sfh  reason: default package */
/* loaded from: classes4.dex */
public final class sfh extends sbs {
    final /* synthetic */ sfi a;

    public sfh(sfi sfiVar) {
        this.a = sfiVar;
    }

    @Override // defpackage.sbs
    public final void b(Map map, sfa sfaVar) {
        ArrayList arrayList = new ArrayList();
        for (List list : map.values()) {
            arrayList.addAll(list);
        }
        this.a.e(arrayList, sfaVar);
        this.a.d = true;
    }

    @Override // defpackage.sbs
    public final void c() {
        this.a.f().b();
    }

    @Override // defpackage.sbs
    public final void d(List list) {
        sfi sfiVar = this.a;
        sfiVar.d = false;
        sfiVar.f().b();
        this.a.f().a(this.a.a);
    }
}
