package defpackage;
/* compiled from: PG */
/* renamed from: aujl  reason: default package */
/* loaded from: classes.dex */
public final class aujl {
    public final dxio<ausy> a;
    public final aujg b;
    public final crzp<btvo> c = new aujj(this);
    public dbty<aujn> d;

    public aujl(final dxio dxioVar, final dxio dxioVar2, aujg aujgVar, final btxc btxcVar, final dehq dehqVar) {
        this.a = dxioVar;
        this.b = aujgVar;
        this.d = dbud.a(new dbty(this, btxcVar, dehqVar, dxioVar2, dxioVar) { // from class: aujh
            private final aujl a;
            private final dehq b;
            private final dxio c;
            private final dxio d;
            private final btxc e;

            {
                this.a = this;
                this.e = btxcVar;
                this.b = dehqVar;
                this.c = dxioVar2;
                this.d = dxioVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                aujl aujlVar = this.a;
                btxc btxcVar2 = this.e;
                dehq dehqVar2 = this.b;
                dxio dxioVar3 = this.c;
                dxio dxioVar4 = this.d;
                btxcVar2.a().d(aujlVar.c, dehqVar2);
                return new aujk((btvo) dxioVar3.a(), (ausy) dxioVar4.a());
            }
        });
        if (!((btvo) dxioVar2.a()).getLoggingParameters().g) {
            this.d.a();
        }
    }

    public final aujn a() {
        return this.d.a();
    }
}
