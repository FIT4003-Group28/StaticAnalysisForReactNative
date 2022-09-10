package defpackage;

import java.util.UUID;
/* compiled from: PG */
/* renamed from: ctxf  reason: default package */
/* loaded from: classes5.dex */
public interface ctxf<RequestT, ResponseT, ResultT, StubT> {
    dehn<RequestT> a(dxwi dxwiVar);

    void b(UUID uuid, int i, dyjb dyjbVar, ctog ctogVar, long j);

    void c(UUID uuid, ResultT resultt, ctog ctogVar, long j);

    ResultT d(ResponseT responset);

    dehn<ResponseT> e(dehn<StubT> dehnVar, RequestT requestt);
}
