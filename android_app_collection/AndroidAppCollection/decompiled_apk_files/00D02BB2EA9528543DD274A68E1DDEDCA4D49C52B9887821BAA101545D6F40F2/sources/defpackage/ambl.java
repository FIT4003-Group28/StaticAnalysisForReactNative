package defpackage;

import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ambl  reason: default package */
/* loaded from: classes.dex */
public final class ambl implements alvy {
    final /* synthetic */ ambm a;

    public ambl(ambm ambmVar) {
        this.a = ambmVar;
    }

    @Override // defpackage.alvy
    public final void a(final int i) {
        Map<Integer, ambk> map = this.a.e;
        Integer valueOf = Integer.valueOf(i);
        ambk ambkVar = map.get(valueOf);
        if (!this.a.f.containsKey(valueOf)) {
            return;
        }
        this.a.f.remove(valueOf);
        if (ambkVar == null) {
            bvoo.h("urls is null for epoch: %s", valueOf);
            return;
        }
        final ambm ambmVar = this.a;
        final alwn l = ambmVar.l();
        ambmVar.c.execute(new Runnable(ambmVar, i, l) { // from class: ambg
            private final ambm a;
            private final int b;
            private final alwn c;

            {
                this.a = ambmVar;
                this.b = i;
                this.c = l;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ambm ambmVar2 = this.a;
                int i2 = this.b;
                alwn alwnVar = this.c;
                if (ambmVar2.f(i2, alwnVar)) {
                    ambmVar2.h(i2, alwnVar);
                }
            }
        });
        synchronized (this.a.d) {
            ambkVar.e = true;
            if (ambkVar.f) {
                this.a.p(i);
            }
        }
    }
}
