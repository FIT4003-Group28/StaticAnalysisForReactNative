package defpackage;

import com.google.android.libraries.messaging.lighter.model.ConversationId;
/* compiled from: PG */
/* renamed from: aqaa  reason: default package */
/* loaded from: classes2.dex */
public final class aqaa {
    private final dxio<akfa> d;
    private final bvjj e;
    private final acyp f;
    private final apyx g;
    public final crzo<Integer> a = new crzo<>();
    @dzsi
    private ConversationId h = null;
    public boolean b = false;
    public int c = 0;

    public aqaa(dxio<akfa> dxioVar, bvjj bvjjVar, acyp acypVar, apyx apyxVar) {
        this.d = dxioVar;
        this.e = bvjjVar;
        this.f = acypVar;
        this.g = apyxVar;
    }

    public final synchronized void a(@dzsi ConversationId conversationId) {
        this.h = conversationId;
    }

    @dzsi
    public final synchronized ConversationId b() {
        return this.h;
    }

    public final synchronized void c(int i) {
        this.c = i;
        if (this.g.f()) {
            this.a.b(Integer.valueOf(i));
        } else if (!this.f.a()) {
        } else {
            boolean o = this.e.o(bvjk.bp, this.d.a().j(), false);
            crzo<Integer> crzoVar = this.a;
            if (true == o) {
                i = 0;
            }
            crzoVar.b(Integer.valueOf(i));
        }
    }

    public final void d() {
        this.b = true;
    }
}
