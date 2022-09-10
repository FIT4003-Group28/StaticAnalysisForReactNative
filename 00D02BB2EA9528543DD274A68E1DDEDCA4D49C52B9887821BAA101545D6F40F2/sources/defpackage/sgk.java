package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: sgk  reason: default package */
/* loaded from: classes7.dex */
class sgk implements say {
    @dzsi
    public final cqkn<say> a;
    @dzsi
    public dopk b;
    final /* synthetic */ sgl c;
    private final CharSequence d;
    private final ddho e;
    private final ddho f;

    public sgk(sgl sglVar, CharSequence charSequence, ddho ddhoVar, @dzsi ddho ddhoVar2, cqkn<say> cqknVar) {
        this.c = sglVar;
        this.d = charSequence;
        this.e = ddhoVar;
        this.f = ddhoVar2;
        this.a = cqknVar;
    }

    @Override // defpackage.say
    public CharSequence a() {
        return this.d;
    }

    @Override // defpackage.say
    public CharSequence b() {
        return this.c.B(this.d);
    }

    @Override // defpackage.say
    @dzsi
    public View.OnClickListener c() {
        if (this.a == null) {
            return null;
        }
        return new View.OnClickListener(this) { // from class: sgj
            private final sgk a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                sgk sgkVar = this.a;
                cqkn<say> cqknVar = sgkVar.a;
                dbsk.s(cqknVar);
                cqknVar.a(sgkVar, view);
            }
        };
    }

    @Override // defpackage.say
    public Boolean d() {
        return Boolean.valueOf(this.b != null);
    }

    @Override // defpackage.say
    public CharSequence e() {
        dopk dopkVar = this.b;
        return dopkVar != null ? dopkVar.b : "";
    }

    @Override // defpackage.say
    @dzsi
    public jhk f() {
        dopk dopkVar = this.b;
        if (dopkVar != null) {
            return sht.w(dopkVar);
        }
        return null;
    }

    @Override // defpackage.say
    @dzsi
    public dopk g() {
        return this.b;
    }

    @Override // defpackage.say
    public cjtd h() {
        return cjtd.a(this.e);
    }

    @Override // defpackage.say
    public cjtd i() {
        return cjtd.a(this.f);
    }

    public void j(@dzsi dopk dopkVar) {
        this.b = dopkVar;
        if (dopkVar != null) {
            sgl sglVar = this.c;
            sglVar.a = true;
            sglVar.I();
        }
    }
}
