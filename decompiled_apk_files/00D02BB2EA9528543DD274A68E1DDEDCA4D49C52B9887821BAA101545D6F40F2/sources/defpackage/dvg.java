package defpackage;

import com.google.ar.core.Frame;
import com.google.ar.core.Session;
/* compiled from: PG */
/* renamed from: dvg  reason: default package */
/* loaded from: classes6.dex */
public final class dvg extends dvi implements dub {
    public ahrn a;
    public float b;
    public boolean c;
    private final ahrn d;

    public dvg() {
        ahrn ahrnVar = new ahrn();
        this.d = ahrnVar;
        this.a = new ahrn();
        this.c = true;
        ahrnVar.d(0.0f, 1.0f, (float) Math.toRadians(dcyn.a));
        this.b = 0.0f;
        this.a.d(0.0f, 1.0f, (float) Math.toRadians(dcyn.a));
    }

    @Override // defpackage.dtx
    public final float b() {
        return 0.0f;
    }

    @Override // defpackage.dtx
    public final float c() {
        return 0.0f;
    }

    @Override // defpackage.dtx
    public final float d() {
        return 0.0f;
    }

    @Override // defpackage.dtx
    public final float e() {
        return this.d.a;
    }

    @Override // defpackage.dtx
    public final float f() {
        return this.d.b;
    }

    @Override // defpackage.dtx
    public final float g() {
        return this.d.c;
    }

    @Override // defpackage.dtx
    public final float h() {
        return this.d.d;
    }

    @Override // defpackage.dtx
    public final boolean i(Session session, Frame frame, @dzsi dad dadVar, @dzsi arlb arlbVar, double d) {
        if (this.a.b(this.d) == 1.0f) {
            return false;
        }
        ahrn ahrnVar = this.d;
        ahrnVar.n(ahrnVar, this.a, Math.min(1.0f, (float) (d * 12.0d)));
        return true;
    }

    @Override // defpackage.dub
    public final void j(boolean z) {
        this.c = z;
        if (!z) {
            this.b = 0.0f;
            this.a = new ahrn();
        }
    }
}
