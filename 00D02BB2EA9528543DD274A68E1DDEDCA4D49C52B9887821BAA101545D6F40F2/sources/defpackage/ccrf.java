package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ccrf  reason: default package */
/* loaded from: classes4.dex */
public class ccrf {
    private final Executor a;
    private final cctt b;

    public ccrf(Executor executor, cctt ccttVar) {
        this.a = executor;
        this.b = ccttVar;
    }

    public final <ResultT> dehn<ResultT> a(dbty<dehn<ResultT>> dbtyVar) {
        ccre ccreVar = new ccre(this.a, this.b, dbtyVar);
        ccreVar.c();
        return ccreVar.a;
    }
}
