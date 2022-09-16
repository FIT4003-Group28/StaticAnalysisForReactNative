package defpackage;

import android.os.Bundle;
import java.util.concurrent.ExecutionException;
/* compiled from: PG */
/* renamed from: aaex  reason: default package */
/* loaded from: classes.dex */
public final class aaex implements yjo {
    public final azqb a;
    private final azqb b;
    private final ankw c;

    public aaex(azqb azqbVar, azqb azqbVar2, ankw ankwVar) {
        this.b = azqbVar;
        this.a = azqbVar2;
        this.c = ankwVar;
    }

    @Override // defpackage.yjo
    public final int a(Bundle bundle) {
        final String string;
        if (((Boolean) this.b.get()).booleanValue() && (string = bundle.getString("MDD_TASK_TAG_KEY")) != null) {
            try {
                anlz.v(new aniq() { // from class: aaew
                    @Override // defpackage.aniq
                    public final ankt a() {
                        aaex aaexVar = aaex.this;
                        return ((trc) aaexVar.a.get()).c(string);
                    }
                }, this.c).get();
                return 0;
            } catch (InterruptedException | ExecutionException unused) {
                return 1;
            }
        }
        return 1;
    }
}
