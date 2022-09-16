package defpackage;

import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: jvo  reason: default package */
/* loaded from: classes3.dex */
public final class jvo implements azqb {
    private final eo a;
    private jwi b;

    public jvo(eo eoVar) {
        this.a = eoVar;
    }

    @Override // defpackage.azqb
    /* renamed from: a */
    public final fed get() {
        jwi jwiVar = this.b;
        if (jwiVar != null) {
            return jwiVar;
        }
        jwi jwiVar2 = (jwi) this.a.f("PlayerFragment");
        this.b = jwiVar2;
        if (jwiVar2 == null) {
            this.b = new jwi();
            ex l = this.a.l();
            l.q(R.id.player_fragment_container, this.b, "PlayerFragment");
            l.a();
        }
        return this.b;
    }
}
