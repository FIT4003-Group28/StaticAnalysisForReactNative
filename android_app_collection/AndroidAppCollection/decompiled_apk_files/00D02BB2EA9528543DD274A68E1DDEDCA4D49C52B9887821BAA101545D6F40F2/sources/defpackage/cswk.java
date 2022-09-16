package defpackage;

import java.util.Random;
/* compiled from: PG */
/* renamed from: cswk  reason: default package */
/* loaded from: classes5.dex */
public final class cswk {
    public final Random a = new Random();
    public int b = 3;
    public int c = 0;
    public dehn<Void> d;

    public final void a() {
        this.b = 3;
        this.c = 0;
        dehn<Void> dehnVar = this.d;
        if (dehnVar != null) {
            dehnVar.cancel(true);
            this.d = null;
        }
    }
}
