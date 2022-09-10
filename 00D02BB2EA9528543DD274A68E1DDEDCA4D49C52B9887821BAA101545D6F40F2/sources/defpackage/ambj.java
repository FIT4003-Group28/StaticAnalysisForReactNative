package defpackage;

import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ambj  reason: default package */
/* loaded from: classes.dex */
public final class ambj implements alvy {
    final /* synthetic */ ambm a;

    public ambj(ambm ambmVar) {
        this.a = ambmVar;
    }

    @Override // defpackage.alvy
    public final void a(final int i) {
        Map<Integer, ambk> map = this.a.e;
        Integer valueOf = Integer.valueOf(i);
        ambk ambkVar = map.get(valueOf);
        if (!this.a.g.containsKey(valueOf)) {
            return;
        }
        this.a.g.remove(valueOf);
        if (ambkVar == null) {
            bvoo.h("urls is null for epoch: %s", valueOf);
            return;
        }
        final ambm ambmVar = this.a;
        ambmVar.c.execute(new Runnable(ambmVar, i) { // from class: ambh
            private final ambm a;
            private final int b;

            {
                this.a = ambmVar;
                this.b = i;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ambm ambmVar2 = this.a;
                int i2 = this.b;
                if (ambmVar2.g(i2)) {
                    ambmVar2.i(i2);
                }
            }
        });
        synchronized (this.a.d) {
            ambkVar.f = true;
            if (ambkVar.e) {
                this.a.p(i);
            }
        }
    }
}
