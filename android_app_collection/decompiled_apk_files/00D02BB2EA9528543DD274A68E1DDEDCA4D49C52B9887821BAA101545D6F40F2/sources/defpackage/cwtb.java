package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: cwtb  reason: default package */
/* loaded from: classes.dex */
final class cwtb implements cwqq, cwud {
    public final List<cwtw> a = new ArrayList();
    public boolean b;
    private final cwrb c;

    public cwtb(cwrb cwrbVar) {
        this.c = cwrbVar;
        cwrbVar.a(this);
    }

    @Override // defpackage.cwud
    public final void Sz() {
        this.c.b(this);
    }

    @Override // defpackage.cwqq
    public final void a() {
        synchronized (this) {
            this.b = true;
        }
        this.c.b(this);
        for (cwtw cwtwVar : this.a) {
            cwtwVar.c();
        }
    }
}
