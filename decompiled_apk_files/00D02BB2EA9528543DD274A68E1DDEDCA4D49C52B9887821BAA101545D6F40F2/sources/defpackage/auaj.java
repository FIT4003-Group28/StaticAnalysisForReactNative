package defpackage;

import com.google.android.apps.gmm.directions.maneuvers.Maneuvers$Maneuver;
/* compiled from: PG */
/* renamed from: auaj  reason: default package */
/* loaded from: classes2.dex */
public class auaj implements aual {
    @dzsi
    private CharSequence a;
    @dzsi
    private Maneuvers$Maneuver b;
    @dzsi
    private Maneuvers$Maneuver c;
    @dzsi
    private atoa d;
    private final boolean e;
    private final atnb f = audy.b();

    public auaj(cqhn cqhnVar, boolean z) {
        this.e = z;
    }

    @Override // defpackage.aual
    public Boolean a() {
        return Boolean.valueOf(this.d != null);
    }

    @Override // defpackage.aual
    @dzsi
    public CharSequence b() {
        return this.a;
    }

    @Override // defpackage.aual
    @dzsi
    public Maneuvers$Maneuver c() {
        return this.b;
    }

    @Override // defpackage.aual
    @dzsi
    public Maneuvers$Maneuver d() {
        return this.c;
    }

    @Override // defpackage.aual
    public Boolean e() {
        CharSequence charSequence = this.a;
        boolean z = false;
        if (charSequence != null && charSequence.length() != 0) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.aual
    public Boolean f() {
        return Boolean.valueOf(this.b != null);
    }

    @Override // defpackage.aual
    @dzsi
    public atoa g() {
        return this.d;
    }

    @Override // defpackage.aual
    public atnb h() {
        return this.f;
    }

    @Override // defpackage.aual
    public Boolean i() {
        return Boolean.valueOf(this.e);
    }

    public void j(@dzsi CharSequence charSequence, @dzsi Maneuvers$Maneuver maneuvers$Maneuver, @dzsi Maneuvers$Maneuver maneuvers$Maneuver2, @dzsi atoa atoaVar) {
        this.a = charSequence;
        this.b = maneuvers$Maneuver;
        this.c = maneuvers$Maneuver2;
        this.d = atoaVar;
        cqkx.p(this);
    }
}
