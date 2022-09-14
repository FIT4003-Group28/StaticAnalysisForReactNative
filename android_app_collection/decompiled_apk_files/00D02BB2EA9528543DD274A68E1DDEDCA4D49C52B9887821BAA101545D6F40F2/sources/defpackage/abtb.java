package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: abtb  reason: default package */
/* loaded from: classes2.dex */
public class abtb implements abso {
    public final abta a;
    private final Boolean b;

    public abtb(@dzsi bttq bttqVar, abta abtaVar) {
        this.b = Boolean.valueOf(bttqVar == bttq.NO_CONNECTIVITY);
        this.a = abtaVar;
    }

    @Override // defpackage.abso
    public Boolean a() {
        return this.b;
    }

    @Override // defpackage.abso
    public View.OnClickListener b() {
        return new View.OnClickListener(this) { // from class: absz
            private final abtb a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.a.i();
            }
        };
    }

    @Override // defpackage.abso
    public cjtd c() {
        return cjtd.b;
    }
}
