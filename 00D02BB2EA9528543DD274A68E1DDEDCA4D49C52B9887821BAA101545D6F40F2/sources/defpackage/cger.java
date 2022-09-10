package defpackage;

import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: cger  reason: default package */
/* loaded from: classes4.dex */
public final class cger {
    public final bzwb<cgew, cgev> a;
    public final cqat b;
    public final int c = 20;

    public cger(bzwa bzwaVar, cqat cqatVar) {
        cgew cgewVar = cgew.b;
        this.a = new bzwb<>(bzwaVar.a.a("ugc_tasks_nearby_need_publisher_response_cache", (dssr) cgewVar.cu(7)), cgewVar);
        this.b = cqatVar;
    }

    public static void a(cgev cgevVar, long j) {
        List<cgeu> unmodifiableList = Collections.unmodifiableList(((cgew) cgevVar.b).a);
        if (cgevVar.c) {
            cgevVar.bF();
            cgevVar.c = false;
        }
        ((cgew) cgevVar.b).a = cgew.ck();
        for (cgeu cgeuVar : unmodifiableList) {
            if (cgeuVar.e >= j) {
                cgevVar.a(cgeuVar);
            }
        }
    }
}
