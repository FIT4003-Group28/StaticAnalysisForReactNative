package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: czlh  reason: default package */
/* loaded from: classes5.dex */
public final class czlh extends czmn {
    public static final czmn a = new czlh();

    private czlh() {
    }

    @Override // defpackage.czmn
    public final String a(czjw czjwVar) {
        dbsk.s(czjwVar);
        return "signal";
    }

    @Override // defpackage.czmn
    public final /* bridge */ /* synthetic */ czmm b(czko czkoVar, String str, Executor executor, czif czifVar, czjw czjwVar) {
        dbsk.s(czjwVar);
        dbsk.a(czkoVar.e() instanceof czku);
        return new czlk(str, deha.a(czkoVar.a()), czmv.d(czkoVar.b(), czkoVar.f() ? dsqa.c() : dsqa.b()), executor, czifVar, ((czku) czkoVar.e()).a(), czkoVar.c(), czkoVar.h() ? dazg.d() : dazg.c());
    }
}
