package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: anmp  reason: default package */
/* loaded from: classes2.dex */
public final class anmp implements anhz {
    public final anhz a;
    public final annb b;
    public final List<anmo> c = new ArrayList();

    public anmp(anhz anhzVar, annb annbVar) {
        this.a = anhzVar;
        this.b = annbVar;
    }

    @Override // defpackage.anhz
    public final void a(aogb aogbVar, dbsg<String> dbsgVar, btzi<duzc, duzk> btziVar) {
        anmn anmnVar = new anmn(this);
        this.b.b(aogbVar, dbsgVar, btziVar, anmnVar);
        anmnVar.a();
    }

    @Override // defpackage.anhz
    public final void b(aogb aogbVar, aogb aogbVar2, btzi<duzc, duzk> btziVar) {
        this.a.b(aogbVar, aogbVar2, btziVar);
    }
}
