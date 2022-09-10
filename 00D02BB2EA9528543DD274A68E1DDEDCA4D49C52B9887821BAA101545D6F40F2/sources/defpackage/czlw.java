package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: czlw  reason: default package */
/* loaded from: classes5.dex */
public final class czlw extends czmn {
    public static final czmn a = new czlw();

    private czlw() {
    }

    @Override // defpackage.czmn
    public final String a(czjw czjwVar) {
        dbsk.s(czjwVar);
        return "singleproc";
    }

    @Override // defpackage.czmn
    public final /* bridge */ /* synthetic */ czmm b(czko czkoVar, String str, Executor executor, czif czifVar, czjw czjwVar) {
        dbsk.s(czjwVar);
        return new czly(str, deha.a(czkoVar.a()), czmv.d(czkoVar.b(), czkoVar.f() ? dsqa.c() : dsqa.b()), executor, czifVar, czkoVar.c(), czkoVar.h() ? dazg.d() : dazg.c());
    }
}
