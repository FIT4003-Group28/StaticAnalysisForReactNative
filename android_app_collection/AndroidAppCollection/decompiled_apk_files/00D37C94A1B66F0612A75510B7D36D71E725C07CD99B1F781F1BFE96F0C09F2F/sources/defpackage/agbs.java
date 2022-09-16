package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: agbs  reason: default package */
/* loaded from: classes.dex */
public final class agbs implements agbt {
    private final Context a;
    private boolean b = false;

    public agbs(Context context) {
        this.a = context;
    }

    @Override // defpackage.agbt
    public final void a(anwk anwkVar) {
        if (this.b) {
            return;
        }
        zep.g("Initializing Blocking FirebaseApp client...");
        anwg.c(this.a, anwkVar);
        this.b = true;
        zep.g("FirebaseApp initialization complete");
    }

    @Override // defpackage.agbt
    public final boolean b() {
        return this.b;
    }
}
