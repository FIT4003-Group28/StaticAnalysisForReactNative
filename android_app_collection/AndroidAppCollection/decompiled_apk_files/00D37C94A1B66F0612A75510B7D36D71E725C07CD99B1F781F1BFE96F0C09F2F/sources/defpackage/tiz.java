package defpackage;
/* compiled from: PG */
/* renamed from: tiz  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class tiz implements tja {
    public final /* synthetic */ tjb a;
    public final /* synthetic */ tja b;
    private final /* synthetic */ int c;

    public /* synthetic */ tiz(tjb tjbVar, tja tjaVar) {
        this.a = tjbVar;
        this.b = tjaVar;
    }

    public /* synthetic */ tiz(tjb tjbVar, tja tjaVar, int i) {
        this.c = i;
        this.a = tjbVar;
        this.b = tjaVar;
    }

    @Override // defpackage.tja
    public final void a(int i) {
        int i2 = this.c;
        if (i2 != 0) {
            if (i2 != 1) {
                this.b.a(this.a.f());
                return;
            }
            this.b.a(this.a.e());
            return;
        }
        tjb tjbVar = this.a;
        tja tjaVar = this.b;
        tjk.a();
        int i3 = 13;
        if (tjbVar.a.f()) {
            dwb a = tjbVar.a();
            if ((1 & a.b) != 0 && tjbVar.a.b() >= a.c) {
                i3 = 2;
            }
        } else {
            i3 = tjbVar.a.g();
        }
        tjaVar.a(i3);
    }
}
