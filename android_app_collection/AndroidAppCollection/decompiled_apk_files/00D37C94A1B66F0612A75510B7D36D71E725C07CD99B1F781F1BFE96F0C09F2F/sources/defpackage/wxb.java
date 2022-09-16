package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: wxb  reason: default package */
/* loaded from: classes4.dex */
public final class wxb {
    public final wwm a;
    public volatile String b;
    private final Executor c;

    public wxb(wwm wwmVar, Executor executor) {
        this.a = wwmVar;
        this.c = executor;
    }

    public final void a() {
        this.c.execute(new Runnable() { // from class: wxa
            @Override // java.lang.Runnable
            public final void run() {
                wxb wxbVar = wxb.this;
                try {
                    wxbVar.b = wxbVar.a.a().a;
                } catch (Exception e) {
                    zep.d("Failed to get advertising id", e);
                }
            }
        });
    }
}
