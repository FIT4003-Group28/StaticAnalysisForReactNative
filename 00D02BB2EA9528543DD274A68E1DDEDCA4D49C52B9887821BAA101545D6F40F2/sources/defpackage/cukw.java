package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
/* compiled from: PG */
/* renamed from: cukw  reason: default package */
/* loaded from: classes5.dex */
public final class cukw {
    private static final Handler i = new Handler(Looper.getMainLooper());
    public final ConversationId a;
    public final cumn b;
    public final culb c;
    public final ctyy d;
    public final csui e;
    public final cukr f;
    public Context g;
    public final ctcu h;

    public cukw(Context context, ConversationId conversationId, cumn cumnVar, ctcu ctcuVar, culb culbVar, ctyy ctyyVar, csui csuiVar, cukr cukrVar) {
        this.g = context;
        this.a = conversationId;
        this.h = ctcuVar;
        this.b = cumnVar;
        this.c = culbVar;
        this.d = ctyyVar;
        this.e = csuiVar;
        this.f = cukrVar;
    }

    public static void a(Runnable runnable) {
        i.post(runnable);
    }
}
